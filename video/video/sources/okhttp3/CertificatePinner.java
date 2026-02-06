package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.C10662xF;
import o.C10763xf2;
import o.C11313zv2;
import o.C6562gT0;
import o.C7330jf;
import o.C8222nF;
import o.C8859ps;
import o.C9516sY;
import o.C9545sf2;
import o.FA0;
import o.IR1;
import o.InterfaceC7058iW0;
import o.InterfaceC8303na2;
import o.InterfaceC9150r20;
import o.InterfaceC9511sW0;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
/* loaded from: classes4.dex */
public final class CertificatePinner {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @InterfaceC7058iW0
    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();
    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;
    @NotNull
    private final Set<Pin> pins;

    /* loaded from: classes4.dex */
    public static final class Builder {
        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String str, @NotNull String... strArr) {
            C6562gT0.p(str, "pattern");
            C6562gT0.p(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(C10662xF.d6(this.pins), null, 2, null);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @InterfaceC8303na2({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            C6562gT0.p(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).i();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        @InterfaceC9511sW0
        @NotNull
        public final C8859ps sha1Hash(@NotNull X509Certificate x509Certificate) {
            C6562gT0.p(x509Certificate, "<this>");
            C8859ps.a aVar = C8859ps.Y0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C6562gT0.o(encoded, "publicKey.encoded");
            return C8859ps.a.p(aVar, encoded, 0, 0, 3, null).d0();
        }

        @InterfaceC9511sW0
        @NotNull
        public final C8859ps sha256Hash(@NotNull X509Certificate x509Certificate) {
            C6562gT0.p(x509Certificate, "<this>");
            C8859ps.a aVar = C8859ps.Y0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C6562gT0.o(encoded, "publicKey.encoded");
            return C8859ps.a.p(aVar, encoded, 0, 0, 3, null).e0();
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class Pin {
        @NotNull
        private final C8859ps hash;
        @NotNull
        private final String hashAlgorithm;
        @NotNull
        private final String pattern;

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
            if (o.C10763xf2.J3(r5, "*", 1, false, 4, null) != (-1)) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Pin(@NotNull String str, @NotNull String str2) {
            String str3;
            C6562gT0.p(str, "pattern");
            C6562gT0.p(str2, "pin");
            if (C9545sf2.J2(str, "*.", false, 2, null)) {
                str3 = str;
            } else {
                str3 = str;
            }
            if ((!C9545sf2.J2(str3, "**.", false, 2, null) || C10763xf2.J3(str3, "*", 2, false, 4, null) != -1) && C10763xf2.J3(str3, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str3).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str3);
            if (canonicalHost != null) {
                this.pattern = canonicalHost;
                if (C9545sf2.J2(str2, "sha1/", false, 2, null)) {
                    this.hashAlgorithm = "sha1";
                    C8859ps.a aVar = C8859ps.Y0;
                    String substring = str2.substring(5);
                    C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
                    C8859ps h = aVar.h(substring);
                    if (h != null) {
                        this.hash = h;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + str2);
                } else if (C9545sf2.J2(str2, "sha256/", false, 2, null)) {
                    this.hashAlgorithm = "sha256";
                    C8859ps.a aVar2 = C8859ps.Y0;
                    String substring2 = str2.substring(7);
                    C6562gT0.o(substring2, "this as java.lang.String).substring(startIndex)");
                    C8859ps h2 = aVar2.h(substring2);
                    if (h2 != null) {
                        this.hash = h2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + str2);
                } else {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                }
            }
            throw new IllegalArgumentException("Invalid pattern: " + str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (C6562gT0.g(this.pattern, pin.pattern) && C6562gT0.g(this.hashAlgorithm, pin.hashAlgorithm) && C6562gT0.g(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final C8859ps getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@NotNull X509Certificate x509Certificate) {
            C6562gT0.p(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (C6562gT0.g(str, "sha256")) {
                return C6562gT0.g(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (C6562gT0.g(str, "sha1")) {
                return C6562gT0.g(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(@NotNull String str) {
            C6562gT0.p(str, "hostname");
            if (C9545sf2.J2(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!C9545sf2.u2(str, str.length() - length, this.pattern, 3, length, false, 16, null) || (length2 != 0 && str.charAt(length2 - 1) != '.')) {
                    return false;
                }
                return true;
            } else if (C9545sf2.J2(this.pattern, "*.", false, 2, null)) {
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!C9545sf2.u2(str, str.length() - length3, this.pattern, 1, length3, false, 16, null) || C10763xf2.X3(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
                return true;
            } else {
                return C6562gT0.g(str, this.pattern);
            }
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.i();
        }
    }

    public CertificatePinner(@NotNull Set<Pin> set, @Nullable CertificateChainCleaner certificateChainCleaner) {
        C6562gT0.p(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return Companion.pin(certificate);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C8859ps sha1Hash(@NotNull X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C8859ps sha256Hash(@NotNull X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(@NotNull String str, @NotNull List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        C6562gT0.p(str, "hostname");
        C6562gT0.p(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(@NotNull String str, @NotNull FA0<? extends List<? extends X509Certificate>> fa0) {
        C6562gT0.p(str, "hostname");
        C6562gT0.p(fa0, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            List<? extends X509Certificate> invoke = fa0.invoke();
            for (X509Certificate x509Certificate : invoke) {
                C8859ps c8859ps = null;
                C8859ps c8859ps2 = null;
                for (Pin pin : findMatchingPins) {
                    String hashAlgorithm = pin.getHashAlgorithm();
                    if (C6562gT0.g(hashAlgorithm, "sha256")) {
                        if (c8859ps == null) {
                            c8859ps = Companion.sha256Hash(x509Certificate);
                        }
                        if (C6562gT0.g(pin.getHash(), c8859ps)) {
                            return;
                        }
                    } else if (C6562gT0.g(hashAlgorithm, "sha1")) {
                        if (c8859ps2 == null) {
                            c8859ps2 = Companion.sha1Hash(x509Certificate);
                        }
                        if (C6562gT0.g(pin.getHash(), c8859ps2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : invoke) {
                sb.append("\n    ");
                sb.append(Companion.pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin pin2 : findMatchingPins) {
                sb.append("\n    ");
                sb.append(pin2);
            }
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (C6562gT0.g(certificatePinner.pins, this.pins) && C6562gT0.g(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String str) {
        C6562gT0.p(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> H = C8222nF.H();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (H.isEmpty()) {
                    H = new ArrayList<>();
                }
                C6562gT0.n(H, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                C11313zv2.g(H).add(obj);
            }
        }
        return H;
    }

    @Nullable
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i = certificateChainCleaner.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        C6562gT0.p(certificateChainCleaner, "certificateChainCleaner");
        if (C6562gT0.g(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @InterfaceC9150r20(message = "replaced with {@link #check(String, List)}.", replaceWith = @IR1(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@NotNull String str, @NotNull Certificate... certificateArr) throws SSLPeerUnverifiedException {
        C6562gT0.p(str, "hostname");
        C6562gT0.p(certificateArr, "peerCertificates");
        check(str, C7330jf.Uy(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, C9516sY c9516sY) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
