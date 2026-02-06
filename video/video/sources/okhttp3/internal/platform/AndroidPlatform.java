package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.C6562gT0;
import o.C8222nF;
import o.C9516sY;
import o.InterfaceC8303na2;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
@SuppressSignatureCheck
/* loaded from: classes4.dex */
public final class AndroidPlatform extends Platform {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;
    @NotNull
    private final CloseGuard closeGuard;
    @NotNull
    private final List<SocketAdapter> socketAdapters;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @Nullable
        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class CustomTrustRootIndex implements TrustRootIndex {
        @NotNull
        private final Method findByIssuerAndSignatureMethod;
        @NotNull
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            C6562gT0.p(x509TrustManager, "trustManager");
            C6562gT0.p(method, "findByIssuerAndSignatureMethod");
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        @NotNull
        public final CustomTrustRootIndex copy(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            C6562gT0.p(x509TrustManager, "trustManager");
            C6562gT0.p(method, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager, method);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomTrustRootIndex) {
                CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
                return C6562gT0.g(this.trustManager, customTrustRootIndex.trustManager) && C6562gT0.g(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
            }
            return false;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        @Nullable
        public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate x509Certificate) {
            C6562gT0.p(x509Certificate, "cert");
            try {
                Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate);
                C6562gT0.n(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return (this.trustManager.hashCode() * 31) + this.findByIssuerAndSignatureMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        boolean z = false;
        if (Platform.Companion.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        isSupported = z;
    }

    public AndroidPlatform() {
        SocketAdapter[] socketAdapterArr = {StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory())};
        ArrayList arrayList = new ArrayList();
        for (Object obj : C8222nF.Q(socketAdapterArr)) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = CloseGuard.Companion.get();
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager x509TrustManager) {
        C6562gT0.p(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner buildIfSupported = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager);
        if (buildIfSupported != null) {
            return buildIfSupported;
        }
        return super.buildCertificateChainCleaner(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager x509TrustManager) {
        C6562gT0.p(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            C6562gT0.o(declaredMethod, "method");
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<Protocol> list) {
        Object obj;
        C6562gT0.p(sSLSocket, "sslSocket");
        C6562gT0.p(list, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i) throws IOException {
        C6562gT0.p(socket, "socket");
        C6562gT0.p(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket) {
        Object obj;
        C6562gT0.p(sSLSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public Object getStackTraceForCloseable(@NotNull String str) {
        C6562gT0.p(str, "closer");
        return this.closeGuard.createAndOpen(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@NotNull String str) {
        C6562gT0.p(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@NotNull String str, @Nullable Object obj) {
        C6562gT0.p(str, "message");
        if (!this.closeGuard.warnIfOpen(obj)) {
            Platform.log$default(this, str, 5, null, 4, null);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory) {
        Object obj;
        C6562gT0.p(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocketFactory(sSLSocketFactory)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.trustManager(sSLSocketFactory);
    }
}
