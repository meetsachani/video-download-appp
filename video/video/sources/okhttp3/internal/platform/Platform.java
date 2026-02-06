package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o.C5422bq;
import o.C6562gT0;
import o.C8466oF;
import o.C9516sY;
import o.InterfaceC8303na2;
import o.InterfaceC9511sW0;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class Platform {
    @NotNull
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    @NotNull
    private static volatile Platform platform;

    @InterfaceC8303na2({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform buildIfSupported = Android10Platform.Companion.buildIfSupported();
            if (buildIfSupported == null) {
                Platform buildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
                C6562gT0.m(buildIfSupported2);
                return buildIfSupported2;
            }
            return buildIfSupported;
        }

        private final Platform findJvmPlatform() {
            OpenJSSEPlatform buildIfSupported;
            BouncyCastlePlatform buildIfSupported2;
            ConscryptPlatform buildIfSupported3;
            if (isConscryptPreferred() && (buildIfSupported3 = ConscryptPlatform.Companion.buildIfSupported()) != null) {
                return buildIfSupported3;
            }
            if (isBouncyCastlePreferred() && (buildIfSupported2 = BouncyCastlePlatform.Companion.buildIfSupported()) != null) {
                return buildIfSupported2;
            }
            if (isOpenJSSEPreferred() && (buildIfSupported = OpenJSSEPlatform.Companion.buildIfSupported()) != null) {
                return buildIfSupported;
            }
            Jdk9Platform buildIfSupported4 = Jdk9Platform.Companion.buildIfSupported();
            if (buildIfSupported4 != null) {
                return buildIfSupported4;
            }
            Platform buildIfSupported5 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            if (buildIfSupported5 != null) {
                return buildIfSupported5;
            }
            return new Platform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            if (isAndroid()) {
                return findAndroidPlatform();
            }
            return findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            return C6562gT0.g("BC", Security.getProviders()[0].getName());
        }

        private final boolean isConscryptPreferred() {
            return C6562gT0.g("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean isOpenJSSEPreferred() {
            return C6562gT0.g("OpenJSSE", Security.getProviders()[0].getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        @NotNull
        public final List<String> alpnProtocolNames(@NotNull List<? extends Protocol> list) {
            C6562gT0.p(list, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] concatLengthPrefixed(@NotNull List<? extends Protocol> list) {
            C6562gT0.p(list, "protocols");
            C5422bq c5422bq = new C5422bq();
            for (String str : alpnProtocolNames(list)) {
                c5422bq.writeByte(str.length());
                c5422bq.K1(str);
            }
            return c5422bq.I3();
        }

        @InterfaceC9511sW0
        @NotNull
        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return C6562gT0.g("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void resetForTests(@NotNull Platform platform) {
            C6562gT0.p(platform, "platform");
            Platform.platform = platform;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            platform2.log(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void afterHandshake(@NotNull SSLSocket sSLSocket) {
        C6562gT0.p(sSLSocket, "sslSocket");
    }

    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager x509TrustManager) {
        C6562gT0.p(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(x509TrustManager));
    }

    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager x509TrustManager) {
        C6562gT0.p(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C6562gT0.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<Protocol> list) {
        C6562gT0.p(sSLSocket, "sslSocket");
        C6562gT0.p(list, "protocols");
    }

    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i) throws IOException {
        C6562gT0.p(socket, "socket");
        C6562gT0.p(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    @NotNull
    public final String getPrefix() {
        return "OkHttp";
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        C6562gT0.p(sSLSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object getStackTraceForCloseable(@NotNull String str) {
        C6562gT0.p(str, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(@NotNull String str) {
        C6562gT0.p(str, "hostname");
        return true;
    }

    public void log(@NotNull String str, int i, @Nullable Throwable th) {
        Level level;
        C6562gT0.p(str, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        logger.log(level, str, th);
    }

    public void logCloseableLeak(@NotNull String str, @Nullable Object obj) {
        C6562gT0.p(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(str, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C6562gT0.o(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager x509TrustManager) {
        C6562gT0.p(x509TrustManager, "trustManager");
        try {
            SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            C6562gT0.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @NotNull
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C6562gT0.m(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C6562gT0.n(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C6562gT0.o(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        C6562gT0.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            C6562gT0.o(cls, "sslContextClass");
            Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, cls, "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!C6562gT0.g(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }
}
