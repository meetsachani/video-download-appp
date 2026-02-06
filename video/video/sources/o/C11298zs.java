package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: o.zs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11298zs implements InterfaceC10745xb0 {
    public static final String c = "cct";
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g = "1$";
    public static final String h = "\\";
    public static final Set<C3123Hc0> i;
    public static final C11298zs j;
    public static final C11298zs k;
    @InterfaceC5670cr1
    public final String a;
    @InterfaceC11300zs1
    public final String b;

    static {
        String a = C3035Ge2.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        d = a;
        String a2 = C3035Ge2.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        e = a2;
        String a3 = C3035Ge2.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f = a3;
        i = Collections.unmodifiableSet(new HashSet(Arrays.asList(C3123Hc0.b("proto"), C3123Hc0.b(com.facebook.S.B))));
        j = new C11298zs(a, null);
        k = new C11298zs(a2, a3);
    }

    public C11298zs(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2) {
        this.a = str;
        this.b = str2;
    }

    @InterfaceC5670cr1
    public static String c(@InterfaceC5670cr1 byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @InterfaceC5670cr1
    public static byte[] d(@InterfaceC5670cr1 String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @InterfaceC5670cr1
    public static C11298zs e(@InterfaceC5670cr1 byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith(g)) {
            String[] split = str.substring(2).split(Pattern.quote(h), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C11298zs(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // o.InterfaceC10745xb0
    public Set<C3123Hc0> a() {
        return i;
    }

    @InterfaceC11300zs1
    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        String str2 = this.a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", g, str2, h, str).getBytes(Charset.forName("UTF-8"));
    }

    @InterfaceC11300zs1
    public String f() {
        return this.b;
    }

    @InterfaceC5670cr1
    public String g() {
        return this.a;
    }

    @Override // o.B20
    @InterfaceC11300zs1
    public byte[] getExtras() {
        return b();
    }

    @Override // o.B20
    @InterfaceC5670cr1
    public String getName() {
        return "cct";
    }
}
