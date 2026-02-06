package o;

import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class OV1 {
    public static final String f = "AC3";
    public static final String g = "AMR";
    public static final String h = "AMR-WB";
    public static final String i = "MPEG4-GENERIC";
    public static final String j = "MP4A-LATM";
    public static final String k = "MP4V-ES";
    public static final String l = "H263-1998";
    public static final String m = "H263-2000";
    public static final String n = "H264";

    /* renamed from: o  reason: collision with root package name */
    public static final String f574o = "H265";
    public static final String p = "OPUS";
    public static final String q = "L8";
    public static final String r = "L16";
    public static final String s = "PCMA";
    public static final String t = "PCMU";
    public static final String u = "VP8";
    public static final String v = "VP9";
    public final int a;
    public final int b;
    public final C10833xx0 c;
    public final AbstractC6044eO0<String, String> d;
    public final String e;

    public OV1(C10833xx0 c10833xx0, int i2, int i3, Map<String, String> map, String str) {
        this.a = i2;
        this.b = i3;
        this.c = c10833xx0;
        this.d = AbstractC6044eO0.g(map);
        this.e = str;
    }

    public static String a(String str) {
        String j2 = C8077mf.j(str);
        j2.getClass();
        char c = 65535;
        switch (j2.hashCode()) {
            case -1922091719:
                if (j2.equals(i)) {
                    c = 0;
                    break;
                }
                break;
            case 2412:
                if (j2.equals(q)) {
                    c = 1;
                    break;
                }
                break;
            case 64593:
                if (j2.equals(f)) {
                    c = 2;
                    break;
                }
                break;
            case 64934:
                if (j2.equals(g)) {
                    c = 3;
                    break;
                }
                break;
            case 74609:
                if (j2.equals(r)) {
                    c = 4;
                    break;
                }
                break;
            case 85182:
                if (j2.equals(u)) {
                    c = 5;
                    break;
                }
                break;
            case 85183:
                if (j2.equals(v)) {
                    c = 6;
                    break;
                }
                break;
            case 2194728:
                if (j2.equals(n)) {
                    c = 7;
                    break;
                }
                break;
            case 2194729:
                if (j2.equals(f574o)) {
                    c = '\b';
                    break;
                }
                break;
            case 2433087:
                if (j2.equals(p)) {
                    c = '\t';
                    break;
                }
                break;
            case 2450119:
                if (j2.equals(s)) {
                    c = '\n';
                    break;
                }
                break;
            case 2450139:
                if (j2.equals(t)) {
                    c = 11;
                    break;
                }
                break;
            case 1061166827:
                if (j2.equals(j)) {
                    c = '\f';
                    break;
                }
                break;
            case 1934494802:
                if (j2.equals(h)) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 1959269366:
                if (j2.equals(k)) {
                    c = 14;
                    break;
                }
                break;
            case 2137188397:
                if (j2.equals(l)) {
                    c = 15;
                    break;
                }
                break;
            case 2137209252:
                if (j2.equals(m)) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case '\f':
                return "audio/mp4a-latm";
            case 1:
            case 4:
                return C4128Rj1.N;
            case 2:
                return C4128Rj1.Q;
            case 3:
                return C4128Rj1.c0;
            case 5:
                return "video/x-vnd.on2.vp8";
            case 6:
                return C4128Rj1.m;
            case 7:
                return "video/avc";
            case '\b':
                return C4128Rj1.k;
            case '\t':
                return C4128Rj1.a0;
            case '\n':
                return C4128Rj1.O;
            case 11:
                return C4128Rj1.P;
            case '\r':
                return C4128Rj1.d0;
            case 14:
                return C4128Rj1.p;
            case 15:
            case 16:
                return C4128Rj1.i;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static int b(String str) {
        boolean z;
        if (!str.equals(q) && !str.equals(r)) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        if (str.equals(q)) {
            return 3;
        }
        return 268435456;
    }

    public static boolean c(C6848hf1 c6848hf1) {
        String j2 = C8077mf.j(c6848hf1.j.b);
        j2.getClass();
        char c = 65535;
        switch (j2.hashCode()) {
            case -1922091719:
                if (j2.equals(i)) {
                    c = 0;
                    break;
                }
                break;
            case 2412:
                if (j2.equals(q)) {
                    c = 1;
                    break;
                }
                break;
            case 64593:
                if (j2.equals(f)) {
                    c = 2;
                    break;
                }
                break;
            case 64934:
                if (j2.equals(g)) {
                    c = 3;
                    break;
                }
                break;
            case 74609:
                if (j2.equals(r)) {
                    c = 4;
                    break;
                }
                break;
            case 85182:
                if (j2.equals(u)) {
                    c = 5;
                    break;
                }
                break;
            case 85183:
                if (j2.equals(v)) {
                    c = 6;
                    break;
                }
                break;
            case 2194728:
                if (j2.equals(n)) {
                    c = 7;
                    break;
                }
                break;
            case 2194729:
                if (j2.equals(f574o)) {
                    c = '\b';
                    break;
                }
                break;
            case 2433087:
                if (j2.equals(p)) {
                    c = '\t';
                    break;
                }
                break;
            case 2450119:
                if (j2.equals(s)) {
                    c = '\n';
                    break;
                }
                break;
            case 2450139:
                if (j2.equals(t)) {
                    c = 11;
                    break;
                }
                break;
            case 1061166827:
                if (j2.equals(j)) {
                    c = '\f';
                    break;
                }
                break;
            case 1934494802:
                if (j2.equals(h)) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 1959269366:
                if (j2.equals(k)) {
                    c = 14;
                    break;
                }
                break;
            case 2137188397:
                if (j2.equals(l)) {
                    c = 15;
                    break;
                }
                break;
            case 2137209252:
                if (j2.equals(m)) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OV1.class == obj.getClass()) {
            OV1 ov1 = (OV1) obj;
            if (this.a == ov1.a && this.b == ov1.b && this.c.equals(ov1.c) && this.d.equals(ov1.d) && this.e.equals(ov1.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((217 + this.a) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
