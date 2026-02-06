package okhttp3.internal.tls;

import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import o.C10662xF;
import o.C10763xf2;
import o.C6562gT0;
import o.C8222nF;
import o.C9545sf2;
import o.ED2;
import o.InterfaceC8303na2;
import o.UE;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    @NotNull
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            C6562gT0.o(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            C6562gT0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C8222nF.H();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C6562gT0.g(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C8222nF.H();
        }
    }

    private final boolean isAscii(String str) {
        if (str.length() != ((int) ED2.l(str, 0, 0, 3, null))) {
            return false;
        }
        return true;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (C6562gT0.g(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate x509Certificate) {
        C6562gT0.p(x509Certificate, "certificate");
        return C10662xF.G4(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        C6562gT0.p(str, "host");
        C6562gT0.p(sSLSession, SettingsJsonConstants.b);
        if (isAscii(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                C6562gT0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return verify(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean verify(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        C6562gT0.p(str, "host");
        C6562gT0.p(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !C9545sf2.J2(str, UE.h, false, 2, null) && !C9545sf2.b2(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !C9545sf2.J2(str2, UE.h, false, 2, null) && !C9545sf2.b2(str2, "..", false, 2, null)) {
            if (!C9545sf2.b2(str, UE.h, false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!C9545sf2.b2(str2, UE.h, false, 2, null)) {
                str2 = str2 + '.';
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!C10763xf2.n3(asciiToLowercase, "*", false, 2, null)) {
                return C6562gT0.g(str3, asciiToLowercase);
            }
            if (!C9545sf2.J2(asciiToLowercase, "*.", false, 2, null) || C10763xf2.I3(asciiToLowercase, '*', 1, false, 4, null) != -1 || str3.length() < asciiToLowercase.length() || C6562gT0.g("*.", asciiToLowercase)) {
                return false;
            }
            String substring = asciiToLowercase.substring(1);
            C6562gT0.o(substring, "this as java.lang.String).substring(startIndex)");
            if (C9545sf2.b2(str3, substring, false, 2, null)) {
                int length = str3.length() - substring.length();
                return length <= 0 || C10763xf2.X3(str3, '.', length + (-1), false, 4, null) == -1;
            }
            return false;
        }
        return false;
    }
}
