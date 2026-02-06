package o;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import o.C5559cO0;
import o.C7782lV0;
import org.jsoup.helper.CookieUtil;

@NN0
@Z90
@InterfaceC10420wF0
/* renamed from: o.Th1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4317Th1 {
    public static final String l = "application";
    public static final String m = "audio";
    public static final String n = "image";

    /* renamed from: o  reason: collision with root package name */
    public static final String f621o = "text";
    public static final String p = "video";
    public static final String r = "*";
    public final String a;
    public final String b;
    public final C5559cO0<String, String> c;
    @MB
    @SY0
    public String d;
    @SY0
    public int e;
    @MB
    @SY0
    public AbstractC4468Uv1<Charset> f;
    public static final String g = "charset";
    public static final C5559cO0<String, String> h = C5559cO0.T(g, C8077mf.g(KB.c.name()));
    public static final SA i = SA.f().b(SA.v().F()).b(SA.s(' ')).b(SA.H("()<>@,;:\\\"/[]?="));
    public static final SA j = SA.f().b(SA.H("\"\\\r"));
    public static final SA k = SA.d(" \t\r\n");
    public static final Map<C4317Th1, C4317Th1> s = C7935m81.Y();
    public static final C4317Th1 t = i("*", "*");
    public static final C4317Th1 u = i("text", "*");
    public static final C4317Th1 v = i("image", "*");
    public static final C4317Th1 w = i("audio", "*");
    public static final C4317Th1 x = i("video", "*");
    public static final C4317Th1 y = i("application", "*");
    public static final String q = "font";
    public static final C4317Th1 z = i(q, "*");
    public static final C4317Th1 A = j("text", "cache-manifest");
    public static final C4317Th1 B = j("text", "css");
    public static final C4317Th1 C = j("text", "csv");
    public static final C4317Th1 D = j("text", "html");
    public static final C4317Th1 E = j("text", "calendar");
    public static final C4317Th1 F = j("text", "plain");
    public static final C4317Th1 G = j("text", "javascript");
    public static final C4317Th1 H = j("text", "tab-separated-values");
    public static final C4317Th1 I = j("text", "vcard");
    public static final C4317Th1 J = j("text", "vnd.wap.wml");
    public static final C4317Th1 K = j("text", C2730De2.w);
    public static final C4317Th1 L = j("text", "vtt");
    public static final C4317Th1 M = i("image", "bmp");
    public static final C4317Th1 N = i("image", "x-canon-crw");
    public static final C4317Th1 O = i("image", JT.e);
    public static final C4317Th1 P = i("image", "vnd.microsoft.icon");
    public static final C4317Th1 Q = i("image", "jpeg");
    public static final C4317Th1 R = i("image", "png");
    public static final C4317Th1 S = i("image", "vnd.adobe.photoshop");
    public static final C4317Th1 T = j("image", "svg+xml");
    public static final C4317Th1 U = i("image", "tiff");
    public static final C4317Th1 V = i("image", "webp");
    public static final C4317Th1 W = i("image", "heif");
    public static final C4317Th1 X = i("image", "jp2");
    public static final C4317Th1 Y = i("audio", "mp4");
    public static final C4317Th1 Z = i("audio", "mpeg");
    public static final C4317Th1 a0 = i("audio", "ogg");
    public static final C4317Th1 b0 = i("audio", C10997yd1.n0);
    public static final C4317Th1 c0 = i("audio", "l16");
    public static final C4317Th1 d0 = i("audio", "l24");
    public static final C4317Th1 e0 = i("audio", "basic");
    public static final C4317Th1 f0 = i("audio", "aac");
    public static final C4317Th1 g0 = i("audio", "vorbis");
    public static final C4317Th1 h0 = i("audio", "x-ms-wma");
    public static final C4317Th1 i0 = i("audio", "x-ms-wax");
    public static final C4317Th1 j0 = i("audio", "vnd.rn-realaudio");
    public static final C4317Th1 k0 = i("audio", "vnd.wave");
    public static final C4317Th1 l0 = i("video", "mp4");
    public static final C4317Th1 m0 = i("video", "mpeg");
    public static final C4317Th1 n0 = i("video", "ogg");
    public static final C4317Th1 o0 = i("video", "quicktime");
    public static final C4317Th1 p0 = i("video", C10997yd1.n0);
    public static final C4317Th1 q0 = i("video", "x-ms-wmv");
    public static final C4317Th1 r0 = i("video", "x-flv");
    public static final C4317Th1 s0 = i("video", "3gpp");
    public static final C4317Th1 t0 = i("video", "3gpp2");
    public static final C4317Th1 u0 = j("application", C2730De2.w);
    public static final C4317Th1 v0 = j("application", "atom+xml");
    public static final C4317Th1 w0 = i("application", "x-bzip2");
    public static final C4317Th1 x0 = j("application", "dart");
    public static final C4317Th1 y0 = i("application", "vnd.apple.pkpass");
    public static final C4317Th1 z0 = i("application", "vnd.ms-fontobject");
    public static final C4317Th1 A0 = i("application", "epub+zip");
    public static final C4317Th1 B0 = i("application", "x-www-form-urlencoded");
    public static final C4317Th1 C0 = i("application", "pkcs12");
    public static final C4317Th1 D0 = i("application", "binary");
    public static final C4317Th1 E0 = i("application", "geo+json");
    public static final C4317Th1 F0 = i("application", "x-gzip");
    public static final C4317Th1 G0 = i("application", "hal+json");
    public static final C4317Th1 H0 = j("application", "javascript");
    public static final C4317Th1 I0 = i("application", "jose");
    public static final C4317Th1 J0 = i("application", "jose+json");
    public static final C4317Th1 K0 = j("application", com.facebook.S.B);
    public static final C4317Th1 L0 = j("application", "manifest+json");
    public static final C4317Th1 M0 = i("application", "vnd.google-earth.kml+xml");
    public static final C4317Th1 N0 = i("application", "vnd.google-earth.kmz");
    public static final C4317Th1 O0 = i("application", "mbox");
    public static final C4317Th1 P0 = i("application", "x-apple-aspen-config");
    public static final C4317Th1 Q0 = i("application", "vnd.ms-excel");
    public static final C4317Th1 R0 = i("application", "vnd.ms-outlook");
    public static final C4317Th1 S0 = i("application", "vnd.ms-powerpoint");
    public static final C4317Th1 T0 = i("application", "msword");
    public static final C4317Th1 U0 = i("application", "dash+xml");
    public static final C4317Th1 V0 = i("application", "wasm");
    public static final C4317Th1 W0 = i("application", "x-nacl");
    public static final C4317Th1 X0 = i("application", "x-pnacl");
    public static final C4317Th1 Y0 = i("application", "octet-stream");
    public static final C4317Th1 Z0 = i("application", "ogg");
    public static final C4317Th1 a1 = i("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final C4317Th1 b1 = i("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final C4317Th1 c1 = i("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final C4317Th1 d1 = i("application", "vnd.oasis.opendocument.graphics");
    public static final C4317Th1 e1 = i("application", "vnd.oasis.opendocument.presentation");
    public static final C4317Th1 f1 = i("application", "vnd.oasis.opendocument.spreadsheet");
    public static final C4317Th1 g1 = i("application", "vnd.oasis.opendocument.text");
    public static final C4317Th1 h1 = j("application", "opensearchdescription+xml");
    public static final C4317Th1 i1 = i("application", "pdf");
    public static final C4317Th1 j1 = i("application", "postscript");
    public static final C4317Th1 k1 = i("application", "protobuf");
    public static final C4317Th1 l1 = j("application", "rdf+xml");
    public static final C4317Th1 m1 = j("application", "rtf");
    public static final C4317Th1 n1 = i("application", "font-sfnt");
    public static final C4317Th1 o1 = i("application", "x-shockwave-flash");
    public static final C4317Th1 p1 = i("application", "vnd.sketchup.skp");
    public static final C4317Th1 q1 = j("application", "soap+xml");
    public static final C4317Th1 r1 = i("application", "x-tar");
    public static final C4317Th1 s1 = i("application", "font-woff");
    public static final C4317Th1 t1 = i("application", "font-woff2");
    public static final C4317Th1 u1 = j("application", "xhtml+xml");
    public static final C4317Th1 v1 = j("application", "xrd+xml");
    public static final C4317Th1 w1 = i("application", "zip");
    public static final C4317Th1 x1 = i(q, "collection");
    public static final C4317Th1 y1 = i(q, "otf");
    public static final C4317Th1 z1 = i(q, "sfnt");
    public static final C4317Th1 A1 = i(q, "ttf");
    public static final C4317Th1 B1 = i(q, "woff");
    public static final C4317Th1 C1 = i(q, "woff2");
    public static final C7782lV0.d D1 = C7782lV0.p(CookieUtil.b).u("=");

    /* renamed from: o.Th1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public final String a;
        public int b = 0;

        public a(String str) {
            this.a = str;
        }

        @InterfaceC6181ey
        public char a(char c) {
            boolean z;
            C10664xF1.g0(e());
            if (f() == c) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            this.b++;
            return c;
        }

        public char b(SA sa) {
            C10664xF1.g0(e());
            char f = f();
            C10664xF1.g0(sa.B(f));
            this.b++;
            return f;
        }

        public String c(SA sa) {
            boolean z;
            int i = this.b;
            String d = d(sa);
            if (this.b != i) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.g0(z);
            return d;
        }

        @InterfaceC6181ey
        public String d(SA sa) {
            C10664xF1.g0(e());
            int i = this.b;
            this.b = sa.F().o(this.a, i);
            if (e()) {
                return this.a.substring(i, this.b);
            }
            return this.a.substring(i);
        }

        public boolean e() {
            int i = this.b;
            if (i >= 0 && i < this.a.length()) {
                return true;
            }
            return false;
        }

        public char f() {
            C10664xF1.g0(e());
            return this.a.charAt(this.b);
        }
    }

    public C4317Th1(String str, String str2, C5559cO0<String, String> c5559cO0) {
        this.a = str;
        this.b = str2;
        this.c = c5559cO0;
    }

    public static /* synthetic */ String a(String str) {
        if (i.C(str) && !str.isEmpty()) {
            return str;
        }
        return o(str);
    }

    public static C4317Th1 b(C4317Th1 c4317Th1) {
        s.put(c4317Th1, c4317Th1);
        return c4317Th1;
    }

    public static C4317Th1 e(String str, String str2) {
        C4317Th1 f = f(str, str2, C5559cO0.S());
        f.f = AbstractC4468Uv1.a();
        return f;
    }

    public static C4317Th1 f(String str, String str2, InterfaceC10058um1<String, String> interfaceC10058um1) {
        boolean z2;
        C10664xF1.E(str);
        C10664xF1.E(str2);
        C10664xF1.E(interfaceC10058um1);
        String s2 = s(str);
        String s3 = s(str2);
        if ("*".equals(s2) && !"*".equals(s3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C10664xF1.e(z2, "A wildcard type cannot be used with a non-wildcard subtype");
        C5559cO0.a K2 = C5559cO0.K();
        for (Map.Entry<String, String> entry : interfaceC10058um1.r()) {
            String s4 = s(entry.getKey());
            K2.f(s4, r(s4, entry.getValue()));
        }
        C4317Th1 c4317Th1 = new C4317Th1(s2, s3, K2.a());
        return (C4317Th1) C3743Nk1.a(s.get(c4317Th1), c4317Th1);
    }

    public static C4317Th1 g(String str) {
        return e("application", str);
    }

    public static C4317Th1 h(String str) {
        return e("audio", str);
    }

    public static C4317Th1 i(String str, String str2) {
        C4317Th1 b = b(new C4317Th1(str, str2, C5559cO0.S()));
        b.f = AbstractC4468Uv1.a();
        return b;
    }

    public static C4317Th1 j(String str, String str2) {
        C4317Th1 b = b(new C4317Th1(str, str2, h));
        b.f = AbstractC4468Uv1.f(KB.c);
        return b;
    }

    public static C4317Th1 k(String str) {
        return e(q, str);
    }

    public static C4317Th1 l(String str) {
        return e("image", str);
    }

    public static C4317Th1 m(String str) {
        return e("text", str);
    }

    public static C4317Th1 n(String str) {
        return e("video", str);
    }

    public static String o(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    public static String r(String str, String str2) {
        C10664xF1.E(str2);
        C10664xF1.u(SA.f().C(str2), "parameter values must be ASCII: %s", str2);
        if (g.equals(str)) {
            return C8077mf.g(str2);
        }
        return str2;
    }

    public static String s(String str) {
        C10664xF1.d(i.C(str));
        C10664xF1.d(!str.isEmpty());
        return C8077mf.g(str);
    }

    @InterfaceC6181ey
    public static C4317Th1 v(String str) {
        String c;
        C10664xF1.E(str);
        a aVar = new a(str);
        try {
            SA sa = i;
            String c2 = aVar.c(sa);
            aVar.a('/');
            String c3 = aVar.c(sa);
            C5559cO0.a K2 = C5559cO0.K();
            while (aVar.e()) {
                SA sa2 = k;
                aVar.d(sa2);
                aVar.a(C10928yK2.l);
                aVar.d(sa2);
                SA sa3 = i;
                String c4 = aVar.c(sa3);
                aVar.a('=');
                if ('\"' == aVar.f()) {
                    aVar.a('\"');
                    StringBuilder sb = new StringBuilder();
                    while ('\"' != aVar.f()) {
                        if ('\\' == aVar.f()) {
                            aVar.a('\\');
                            sb.append(aVar.b(SA.f()));
                        } else {
                            sb.append(aVar.c(j));
                        }
                    }
                    c = sb.toString();
                    aVar.a('\"');
                } else {
                    c = aVar.c(sa3);
                }
                K2.f(c4, c);
            }
            return f(c2, c3, K2.a());
        } catch (IllegalStateException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 18);
            sb2.append("Could not parse '");
            sb2.append(str);
            sb2.append("'");
            throw new IllegalArgumentException(sb2.toString(), e);
        }
    }

    public C4317Th1 A(String str, Iterable<String> iterable) {
        C10664xF1.E(str);
        C10664xF1.E(iterable);
        String s2 = s(str);
        C5559cO0.a K2 = C5559cO0.K();
        AbstractC6237fB2<Map.Entry<String, String>> it = this.c.r().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!s2.equals(key)) {
                K2.f(key, next.getValue());
            }
        }
        for (String str2 : iterable) {
            K2.f(s2, r(s2, str2));
        }
        C4317Th1 c4317Th1 = new C4317Th1(this.a, this.b, K2.a());
        if (!s2.equals(g)) {
            c4317Th1.f = this.f;
        }
        return (C4317Th1) C3743Nk1.a(s.get(c4317Th1), c4317Th1);
    }

    public C4317Th1 B(InterfaceC10058um1<String, String> interfaceC10058um1) {
        return f(this.a, this.b, interfaceC10058um1);
    }

    public C4317Th1 C() {
        if (this.c.isEmpty()) {
            return this;
        }
        return e(this.a, this.b);
    }

    public AbstractC4468Uv1<Charset> c() {
        AbstractC4468Uv1<Charset> abstractC4468Uv1 = this.f;
        if (abstractC4468Uv1 == null) {
            abstractC4468Uv1 = AbstractC4468Uv1.a();
            AbstractC6237fB2<String> it = this.c.u(g).iterator();
            String str = null;
            while (it.hasNext()) {
                String next = it.next();
                if (str == null) {
                    abstractC4468Uv1 = AbstractC4468Uv1.f(Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(next).length());
                    sb.append("Multiple charset values defined: ");
                    sb.append(str);
                    sb.append(C6566gU0.h);
                    sb.append(next);
                    throw new IllegalStateException(sb.toString());
                }
            }
            this.f = abstractC4468Uv1;
        }
        return abstractC4468Uv1;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        if (!this.c.isEmpty()) {
            sb.append(CookieUtil.b);
            D1.d(sb, C10547wm1.E(this.c, new YA0() { // from class: o.Rh1
                @Override // o.YA0
                public final Object apply(Object obj) {
                    return C4317Th1.a((String) obj);
                }
            }).r());
        }
        return sb.toString();
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4317Th1) {
            C4317Th1 c4317Th1 = (C4317Th1) obj;
            if (this.a.equals(c4317Th1.a) && this.b.equals(c4317Th1.b) && u().equals(c4317Th1.u())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int b = C2593Bt1.b(this.a, this.b, u());
            this.e = b;
            return b;
        }
        return i2;
    }

    public boolean p() {
        if (!"*".equals(this.a) && !"*".equals(this.b)) {
            return false;
        }
        return true;
    }

    public boolean q(C4317Th1 c4317Th1) {
        if (c4317Th1.a.equals("*") || c4317Th1.a.equals(this.a)) {
            if ((c4317Th1.b.equals("*") || c4317Th1.b.equals(this.b)) && this.c.r().containsAll(c4317Th1.c.r())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C5559cO0<String, String> t() {
        return this.c;
    }

    public String toString() {
        String str = this.d;
        if (str == null) {
            String d = d();
            this.d = d;
            return d;
        }
        return str;
    }

    public final Map<String, AbstractC7269jO0<String>> u() {
        return C7935m81.B0(this.c.l(), new YA0() { // from class: o.Sh1
            @Override // o.YA0
            public final Object apply(Object obj) {
                return AbstractC7269jO0.w((Collection) obj);
            }
        });
    }

    public String w() {
        return this.b;
    }

    public String x() {
        return this.a;
    }

    public C4317Th1 y(Charset charset) {
        C10664xF1.E(charset);
        C4317Th1 z2 = z(g, charset.name());
        z2.f = AbstractC4468Uv1.f(charset);
        return z2;
    }

    public C4317Th1 z(String str, String str2) {
        return A(str, AbstractC9481sO0.Q(str2));
    }
}
