package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: o.Rj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4128Rj1 {
    public static final String A = "video/mp42";
    public static final String A0 = "application/ttml+xml";
    public static final String B = "video/mp43";
    public static final String B0 = "application/x-quicktime-tx3g";
    public static final String C = "video/raw";
    public static final String C0 = "application/x-mp4-vtt";
    public static final String D = "video/x-unknown";
    public static final String D0 = "application/x-mp4-cea-608";
    public static final String E = "audio/mp4";
    @Deprecated
    public static final String E0 = "application/x-rawcc";
    public static final String F = "audio/mp4a-latm";
    public static final String F0 = "application/vobsub";
    public static final String G = "audio/x-matroska";
    public static final String G0 = "application/pgs";
    public static final String H = "audio/webm";
    public static final String H0 = "application/x-scte35";
    public static final String I = "audio/mpeg";
    public static final String I0 = "application/x-camera-motion";
    public static final String J = "audio/mpeg-L1";
    public static final String J0 = "application/x-emsg";
    public static final String K = "audio/mpeg-L2";
    public static final String K0 = "application/dvbsubs";
    public static final String L = "audio/mha1";
    public static final String L0 = "application/x-exif";
    public static final String M = "audio/mhm1";
    public static final String M0 = "application/x-icy";
    public static final String N = "audio/raw";
    public static final String N0 = "application/vnd.dvb.ait";
    public static final String O = "audio/g711-alaw";
    public static final String O0 = "application/x-rtsp";
    public static final String P = "audio/g711-mlaw";
    public static final String P0 = "image/png";
    public static final String Q = "audio/ac3";
    public static final String Q0 = "image/webp";
    public static final String R = "audio/eac3";
    public static final String R0 = "image/jpeg";
    public static final String S = "audio/eac3-joc";
    public static final String S0 = "image/heic";
    public static final String T = "audio/ac4";
    public static final String T0 = "image/heif";
    public static final String U = "audio/true-hd";
    public static final String U0 = "ec+3";
    public static final String V = "audio/vnd.dts";
    public static final String W = "audio/vnd.dts.hd";
    public static final String X = "audio/vnd.dts.hd;profile=lbr";
    public static final String Y = "audio/vnd.dts.uhd;profile=p2";
    public static final String Z = "audio/vorbis";
    public static final String a = "video";
    public static final String a0 = "audio/opus";
    public static final String b = "audio";
    public static final String b0 = "audio/amr";
    public static final String c = "text";
    public static final String c0 = "audio/3gpp";
    public static final String d = "image";
    public static final String d0 = "audio/amr-wb";
    public static final String e = "application";
    public static final String e0 = "audio/flac";
    public static final String f = "video/mp4";
    public static final String f0 = "audio/alac";
    public static final String g = "video/x-matroska";
    public static final String g0 = "audio/gsm";
    public static final String h = "video/webm";
    public static final String h0 = "audio/ogg";
    public static final String i = "video/3gpp";
    public static final String i0 = "audio/wav";
    public static final String j = "video/avc";
    public static final String j0 = "audio/midi";
    public static final String k = "video/hevc";
    public static final String k0 = "audio/x-exoplayer-midi";
    public static final String l = "video/x-vnd.on2.vp8";
    public static final String l0 = "audio/x-unknown";
    public static final String m = "video/x-vnd.on2.vp9";
    public static final String m0 = "text/vtt";
    public static final String n = "video/av01";
    public static final String n0 = "text/x-ssa";

    /* renamed from: o  reason: collision with root package name */
    public static final String f601o = "video/mp2t";
    public static final String o0 = "text/x-exoplayer-cues";
    public static final String p = "video/mp4v-es";
    public static final String p0 = "text/x-unknown";
    public static final String q = "video/mpeg";
    public static final String q0 = "application/mp4";
    public static final String r = "video/mp2p";
    public static final String r0 = "application/webm";
    public static final String s = "video/mpeg2";
    public static final String s0 = "application/x-matroska";
    public static final String t = "video/wvc1";
    public static final String t0 = "application/dash+xml";
    public static final String u = "video/divx";
    public static final String u0 = "application/x-mpegURL";
    public static final String v = "video/x-flv";
    public static final String v0 = "application/vnd.ms-sstr+xml";
    public static final String w = "video/dolby-vision";
    public static final String w0 = "application/id3";
    public static final String x = "video/ogg";
    public static final String x0 = "application/cea-608";
    public static final String y = "video/x-msvideo";
    public static final String y0 = "application/cea-708";
    public static final String z = "video/mjpeg";
    public static final String z0 = "application/x-subrip";
    public static final ArrayList<a> V0 = new ArrayList<>();
    public static final Pattern W0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: o.Rj1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;

        public a(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }
    }

    @InterfaceC5056aJ2
    /* renamed from: o.Rj1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            int i = this.b;
            if (i != 2) {
                if (i != 5) {
                    if (i != 29) {
                        if (i != 42) {
                            if (i != 22) {
                                if (i != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        b i2;
        int a2;
        if (str == null) {
            return false;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(S)) {
                    c2 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(J)) {
                    c2 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(K)) {
                    c2 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(Q)) {
                    c2 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(N)) {
                    c2 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(R)) {
                    c2 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(e0)) {
                    c2 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(I)) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(O)) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(P)) {
                    c2 = '\n';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (i2 = i(str2)) == null || (a2 = i2.a()) == 0 || a2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean b(@InterfaceC11300zs1 String str, String str2) {
        if (d(str, str2) != null) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public static String c(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : TD2.L1(str)) {
            String g2 = g(str2);
            if (g2 != null && p(g2)) {
                return g2;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String d(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str != null && str2 != null) {
            String[] L1 = TD2.L1(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : L1) {
                if (str2.equals(g(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String e(String str) {
        int size = V0.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = V0.get(i2);
            if (str.startsWith(aVar.b)) {
                return aVar.a;
            }
        }
        return null;
    }

    public static int f(String str, @InterfaceC11300zs1 String str2) {
        b i2;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(S)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals(X)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(V)) {
                    c2 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c2 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(Q)) {
                    c2 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals(T)) {
                    c2 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals(Y)) {
                    c2 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(R)) {
                    c2 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(I)) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals(a0)) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(W)) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(U)) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (i2 = i(str2)) == null) {
                    return 0;
                }
                return i2.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    @InterfaceC11300zs1
    public static String g(@InterfaceC11300zs1 String str) {
        b i2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String g2 = C8077mf.g(str.trim());
        if (!g2.startsWith(C5137af1.d) && !g2.startsWith("avc3")) {
            if (!g2.startsWith(C5137af1.g) && !g2.startsWith(C5137af1.h)) {
                if (!g2.startsWith("dvav") && !g2.startsWith("dva1") && !g2.startsWith("dvhe") && !g2.startsWith("dvh1")) {
                    if (g2.startsWith(C5137af1.i)) {
                        return n;
                    }
                    if (!g2.startsWith("vp9") && !g2.startsWith(C5137af1.f)) {
                        if (!g2.startsWith("vp8") && !g2.startsWith("vp08")) {
                            if (g2.startsWith(C5137af1.j)) {
                                if (g2.startsWith("mp4a.") && (i2 = i(g2)) != null) {
                                    str2 = h(i2.a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (g2.startsWith("mha1")) {
                                return L;
                            } else {
                                if (g2.startsWith("mhm1")) {
                                    return M;
                                }
                                if (!g2.startsWith("ac-3") && !g2.startsWith("dac3")) {
                                    if (!g2.startsWith("ec-3") && !g2.startsWith("dec3")) {
                                        if (g2.startsWith(U0)) {
                                            return S;
                                        }
                                        if (!g2.startsWith("ac-4") && !g2.startsWith("dac4")) {
                                            if (g2.startsWith("dtsc")) {
                                                return V;
                                            }
                                            if (g2.startsWith("dtse")) {
                                                return X;
                                            }
                                            if (!g2.startsWith("dtsh") && !g2.startsWith("dtsl")) {
                                                if (g2.startsWith("dtsx")) {
                                                    return Y;
                                                }
                                                if (g2.startsWith("opus")) {
                                                    return a0;
                                                }
                                                if (g2.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (g2.startsWith("flac")) {
                                                    return e0;
                                                }
                                                if (g2.startsWith("stpp")) {
                                                    return A0;
                                                }
                                                if (g2.startsWith("wvtt")) {
                                                    return m0;
                                                }
                                                if (g2.contains("cea708")) {
                                                    return y0;
                                                }
                                                if (!g2.contains("eia608") && !g2.contains("cea608")) {
                                                    return e(g2);
                                                }
                                                return x0;
                                            }
                                            return W;
                                        }
                                        return T;
                                    }
                                    return R;
                                }
                                return Q;
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return m;
                }
                return w;
            }
            return k;
        }
        return "video/avc";
    }

    @InterfaceC11300zs1
    public static String h(int i2) {
        if (i2 != 32) {
            if (i2 != 33) {
                if (i2 != 35) {
                    if (i2 != 64) {
                        if (i2 != 163) {
                            if (i2 != 177) {
                                if (i2 != 165) {
                                    if (i2 != 166) {
                                        switch (i2) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return s;
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return I;
                                            case 106:
                                                return q;
                                            default:
                                                switch (i2) {
                                                    case C7834lj1.G /* 169 */:
                                                    case Xu2.K /* 172 */:
                                                        return V;
                                                    case C7193j50.f /* 170 */:
                                                    case 171:
                                                        return W;
                                                    case 173:
                                                        return a0;
                                                    case C10997yd1.y1 /* 174 */:
                                                        return T;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return R;
                                }
                                return Q;
                            }
                            return m;
                        }
                        return t;
                    }
                    return "audio/mp4a-latm";
                }
                return k;
            }
            return "video/avc";
        }
        return p;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static b i(String str) {
        int i2;
        Matcher matcher = W0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C9542sf.g(matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i2 = Integer.parseInt(group);
            } else {
                i2 = 0;
            }
            return new b(parseInt, i2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC11300zs1
    public static String j(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : TD2.L1(str)) {
            String g2 = g(str2);
            if (g2 != null && s(g2)) {
                return g2;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static String k(@InterfaceC11300zs1 String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int l(@InterfaceC11300zs1 String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if (!w0.equals(str) && !J0.equals(str) && !H0.equals(str)) {
            if (I0.equals(str)) {
                return 6;
            }
            return m(str);
        }
        return 5;
    }

    public static int m(String str) {
        int size = V0.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = V0.get(i2);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    @InterfaceC11300zs1
    public static String o(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : TD2.L1(str)) {
            String g2 = g(str2);
            if (g2 != null && t(g2)) {
                return g2;
            }
        }
        return null;
    }

    public static boolean p(@InterfaceC11300zs1 String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(@InterfaceC11300zs1 String str) {
        return "image".equals(k(str));
    }

    public static boolean r(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("video/webm") && !str.startsWith(H) && !str.startsWith(r0) && !str.startsWith(g) && !str.startsWith(G) && !str.startsWith(s0)) {
            return false;
        }
        return true;
    }

    public static boolean s(@InterfaceC11300zs1 String str) {
        if (!"text".equals(k(str)) && !x0.equals(str) && !y0.equals(str) && !D0.equals(str) && !z0.equals(str) && !A0.equals(str) && !B0.equals(str) && !C0.equals(str) && !E0.equals(str) && !F0.equals(str) && !G0.equals(str) && !K0.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean t(@InterfaceC11300zs1 String str) {
        return "video".equals(k(str));
    }

    public static String u(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c2 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c2 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return e0;
            case 1:
                return i0;
            case 2:
                return I;
            default:
                return str;
        }
    }

    public static void v(String str, String str2, int i2) {
        a aVar = new a(str, str2, i2);
        int size = V0.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            ArrayList<a> arrayList = V0;
            if (str.equals(arrayList.get(i3).a)) {
                arrayList.remove(i3);
                break;
            }
            i3++;
        }
        V0.add(aVar);
    }
}
