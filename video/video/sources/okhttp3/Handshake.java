package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.C10662xF;
import o.C6562gT0;
import o.C8222nF;
import o.C8466oF;
import o.C9516sY;
import o.EY0;
import o.EnumC9879u20;
import o.FA0;
import o.IR1;
import o.InterfaceC8046mW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import o.WY0;
import o.XH0;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Handshake {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final CipherSuite cipherSuite;
    @NotNull
    private final List<Certificate> localCertificates;
    @NotNull
    private final EY0 peerCertificates$delegate;
    @NotNull
    private final TlsVersion tlsVersion;

    @InterfaceC8303na2({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C8222nF.H();
        }

        @InterfaceC8046mW0(name = "-deprecated_get")
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to extension function", replaceWith = @IR1(expression = "sslSession.handshake()", imports = {}))
        @NotNull
        /* renamed from: -deprecated_get  reason: not valid java name */
        public final Handshake m65deprecated_get(@NotNull SSLSession sSLSession) throws IOException {
            C6562gT0.p(sSLSession, "sslSession");
            return get(sSLSession);
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @NotNull
        public final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
            List<Certificate> H;
            C6562gT0.p(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(C6562gT0.g(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C6562gT0.g(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!C6562gT0.g(XH0.M, protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                            try {
                                H = toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                H = C8222nF.H();
                            }
                            return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(H));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null");
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null");
        }

        private Companion() {
        }

        @InterfaceC9511sW0
        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
            C6562gT0.p(tlsVersion, "tlsVersion");
            C6562gT0.p(cipherSuite, "cipherSuite");
            C6562gT0.p(list, "peerCertificates");
            C6562gT0.p(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), new Handshake$Companion$get$1(Util.toImmutableList(list)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull FA0<? extends List<? extends Certificate>> fa0) {
        C6562gT0.p(tlsVersion, "tlsVersion");
        C6562gT0.p(cipherSuite, "cipherSuite");
        C6562gT0.p(list, "localCertificates");
        C6562gT0.p(fa0, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = WY0.b(new Handshake$peerCertificates$2(fa0));
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C6562gT0.o(type, "type");
        return type;
    }

    @InterfaceC8046mW0(name = "-deprecated_cipherSuite")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "cipherSuite", imports = {}))
    @NotNull
    /* renamed from: -deprecated_cipherSuite  reason: not valid java name */
    public final CipherSuite m59deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @InterfaceC8046mW0(name = "-deprecated_localCertificates")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "localCertificates", imports = {}))
    @NotNull
    /* renamed from: -deprecated_localCertificates  reason: not valid java name */
    public final List<Certificate> m60deprecated_localCertificates() {
        return this.localCertificates;
    }

    @InterfaceC8046mW0(name = "-deprecated_localPrincipal")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "localPrincipal", imports = {}))
    @Nullable
    /* renamed from: -deprecated_localPrincipal  reason: not valid java name */
    public final Principal m61deprecated_localPrincipal() {
        return localPrincipal();
    }

    @InterfaceC8046mW0(name = "-deprecated_peerCertificates")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "peerCertificates", imports = {}))
    @NotNull
    /* renamed from: -deprecated_peerCertificates  reason: not valid java name */
    public final List<Certificate> m62deprecated_peerCertificates() {
        return peerCertificates();
    }

    @InterfaceC8046mW0(name = "-deprecated_peerPrincipal")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "peerPrincipal", imports = {}))
    @Nullable
    /* renamed from: -deprecated_peerPrincipal  reason: not valid java name */
    public final Principal m63deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @InterfaceC8046mW0(name = "-deprecated_tlsVersion")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "tlsVersion", imports = {}))
    @NotNull
    /* renamed from: -deprecated_tlsVersion  reason: not valid java name */
    public final TlsVersion m64deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @InterfaceC8046mW0(name = "cipherSuite")
    @NotNull
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && C6562gT0.g(handshake.cipherSuite, this.cipherSuite) && C6562gT0.g(handshake.peerCertificates(), peerCertificates()) && C6562gT0.g(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @InterfaceC8046mW0(name = "localCertificates")
    @NotNull
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @InterfaceC8046mW0(name = "localPrincipal")
    @Nullable
    public final Principal localPrincipal() {
        X509Certificate x509Certificate;
        Object J2 = C10662xF.J2(this.localCertificates);
        if (J2 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) J2;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @InterfaceC8046mW0(name = "peerCertificates")
    @NotNull
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @InterfaceC8046mW0(name = "peerPrincipal")
    @Nullable
    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object J2 = C10662xF.J2(peerCertificates());
        if (J2 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) J2;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    @InterfaceC8046mW0(name = "tlsVersion")
    @NotNull
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(C8466oF.b0(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            arrayList.add(getName(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(getName(certificate2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }
}
