package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import o.C10833xx0;
import o.C6848hf1;
import o.C9337ro1;
import o.G;

@Deprecated
/* renamed from: o.aW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5105aW1 {
    public static final String c = "profile-level-id";
    public static final String d = "sprop-parameter-sets";
    public static final String e = "octet-align";
    public static final String f = "interleaving";
    public static final String g = "sprop-sps";
    public static final String h = "sprop-pps";
    public static final String i = "sprop-vps";
    public static final String j = "sprop-max-don-diff";
    public static final String k = "config";
    public static final String l = "cpresent";
    public static final String m = "mp4a.40.";
    public static final String n = "avc1.";

    /* renamed from: o  reason: collision with root package name */
    public static final String f693o = "mp4v.";
    public static final String p = "*";
    public static final int q = 352;
    public static final int r = 288;
    public static final int s = 320;
    public static final int t = 240;
    public static final int u = 48000;
    public static final int v = 320;
    public static final int w = 240;
    public static final int x = 352;
    public static final int y = 288;
    public final OV1 a;
    public final Uri b;

    public C5105aW1(com.google.android.exoplayer2.source.rtsp.e eVar, C6848hf1 c6848hf1, Uri uri) {
        C9542sf.b(c6848hf1.i.containsKey(V12.n), "missing attribute control");
        this.a = b(c6848hf1);
        this.b = a(eVar, uri, (String) TD2.o(c6848hf1.i.get(V12.n)));
    }

    public static Uri a(com.google.android.exoplayer2.source.rtsp.e eVar, Uri uri, String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        if (!TextUtils.isEmpty(eVar.e(com.google.android.exoplayer2.source.rtsp.e.i))) {
            uri = Uri.parse(eVar.e(com.google.android.exoplayer2.source.rtsp.e.i));
        } else if (!TextUtils.isEmpty(eVar.e("Content-Location"))) {
            uri = Uri.parse(eVar.e("Content-Location"));
        }
        if (str.equals("*")) {
            return uri;
        }
        return uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC5056aJ2
    public static OV1 b(C6848hf1 c6848hf1) {
        int i2;
        char c2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C10833xx0.b bVar = new C10833xx0.b();
        int i3 = c6848hf1.e;
        if (i3 > 0) {
            bVar.I(i3);
        }
        C6848hf1.d dVar = c6848hf1.j;
        int i4 = dVar.a;
        String str = dVar.b;
        String a = OV1.a(str);
        bVar.g0(a);
        int i5 = c6848hf1.j.c;
        if ("audio".equals(c6848hf1.a)) {
            i2 = d(c6848hf1.j.d, a);
            bVar.h0(i5).J(i2);
        } else {
            i2 = -1;
        }
        AbstractC6044eO0<String, String> a2 = c6848hf1.a();
        boolean z7 = false;
        switch (a.hashCode()) {
            case -1664118616:
                if (a.equals(C4128Rj1.i)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (a.equals(C4128Rj1.k)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (a.equals(C4128Rj1.d0)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -53558318:
                if (a.equals("audio/mp4a-latm")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (a.equals(C4128Rj1.Q)) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 187094639:
                if (a.equals(C4128Rj1.N)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (a.equals(C4128Rj1.p)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (a.equals("video/avc")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (a.equals(C4128Rj1.c0)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1504891608:
                if (a.equals(C4128Rj1.a0)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (a.equals("video/x-vnd.on2.vp8")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (a.equals(C4128Rj1.m)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1903231877:
                if (a.equals(C4128Rj1.O)) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 1903589369:
                if (a.equals(C4128Rj1.P)) {
                    c2 = C8206nB.d;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                if (i2 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                C9542sf.b(!a2.isEmpty(), "missing attribute fmtp");
                if (str.equals(OV1.j)) {
                    if (a2.containsKey(l) && a2.get(l).equals("0")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9542sf.b(z2, "Only supports cpresent=0 in AAC audio.");
                    String str2 = a2.get("config");
                    C9542sf.h(str2, "AAC audio stream must include config fmtp parameter");
                    if (str2.length() % 2 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C9542sf.b(z3, "Malformat MPEG4 config: " + str2);
                    G.c e2 = e(str2);
                    bVar.h0(e2.a).J(e2.b).K(e2.c);
                }
                f(bVar, a2, str, i2, i5);
                break;
            case 1:
            case 2:
                if (i2 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C9542sf.b(z4, "Multi channel AMR is not currently supported.");
                C9542sf.b(!a2.isEmpty(), "fmtp parameters must include octet-align.");
                C9542sf.b(a2.containsKey(e), "Only octet aligned mode is currently supported.");
                C9542sf.b(!a2.containsKey(f), "Interleaving mode is not currently supported.");
                break;
            case 3:
                if (i2 != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C9542sf.a(z5);
                if (i5 == 48000) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                C9542sf.b(z6, "Invalid OPUS clock rate.");
                break;
            case 4:
                C9542sf.a(!a2.isEmpty());
                i(bVar, a2);
                break;
            case 5:
                bVar.n0(352).S(288);
                break;
            case 6:
                C9542sf.b(!a2.isEmpty(), "missing attribute fmtp");
                g(bVar, a2);
                break;
            case 7:
                C9542sf.b(!a2.isEmpty(), "missing attribute fmtp");
                h(bVar, a2);
                break;
            case '\b':
                bVar.n0(320).S(240);
                break;
            case '\t':
                bVar.n0(320).S(240);
                break;
            case '\n':
                bVar.a0(OV1.b(str));
                break;
        }
        if (i5 > 0) {
            z7 = true;
        }
        C9542sf.a(z7);
        return new OV1(bVar.G(), i4, i5, a2, str);
    }

    public static byte[] c(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bArr = C9337ro1.i;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(decode, 0, bArr2, bArr.length, decode.length);
        return bArr2;
    }

    public static int d(int i2, String str) {
        if (i2 != -1) {
            return i2;
        }
        if (str.equals(C4128Rj1.Q)) {
            return 6;
        }
        return 1;
    }

    public static G.c e(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        C2903Ey1 c2903Ey1 = new C2903Ey1(TD2.W(str));
        boolean z4 = true;
        if (c2903Ey1.h(1) == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "Only supports audio mux version 0.");
        if (c2903Ey1.h(1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.b(z2, "Only supports allStreamsSameTimeFraming.");
        c2903Ey1.s(6);
        if (c2903Ey1.h(4) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C9542sf.b(z3, "Only supports one program.");
        if (c2903Ey1.h(3) != 0) {
            z4 = false;
        }
        C9542sf.b(z4, "Only supports one numLayer.");
        try {
            return G.e(c2903Ey1, false);
        } catch (C3989Py1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void f(C10833xx0.b bVar, AbstractC6044eO0<String, String> abstractC6044eO0, String str, int i2, int i3) {
        boolean z;
        String str2 = abstractC6044eO0.get(c);
        if (str2 == null && str.equals(OV1.j)) {
            str2 = "30";
        }
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "missing profile-level-id param");
        bVar.K("mp4a.40." + str2);
        bVar.V(AbstractC5317bO0.M(G.a(i3, i2)));
    }

    public static void g(C10833xx0.b bVar, AbstractC6044eO0<String, String> abstractC6044eO0) {
        boolean z;
        C9542sf.b(abstractC6044eO0.containsKey(d), "missing sprop parameter");
        String[] J1 = TD2.J1((String) C9542sf.g(abstractC6044eO0.get(d)), ",");
        if (J1.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, "empty sprop value");
        AbstractC5317bO0 Q = AbstractC5317bO0.Q(c(J1[0]), c(J1[1]));
        bVar.V(Q);
        byte[] bArr = Q.get(0);
        C9337ro1.c l2 = C9337ro1.l(bArr, C9337ro1.i.length, bArr.length);
        bVar.c0(l2.h);
        bVar.S(l2.g);
        bVar.n0(l2.f);
        String str = abstractC6044eO0.get(c);
        if (str != null) {
            bVar.K(n + str);
            return;
        }
        bVar.K(JE.a(l2.a, l2.b, l2.c));
    }

    public static void h(C10833xx0.b bVar, AbstractC6044eO0<String, String> abstractC6044eO0) {
        boolean z;
        if (abstractC6044eO0.containsKey(j)) {
            int parseInt = Integer.parseInt((String) C9542sf.g(abstractC6044eO0.get(j)));
            if (parseInt == 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.b(z, "non-zero sprop-max-don-diff " + parseInt + " is not supported");
        }
        C9542sf.b(abstractC6044eO0.containsKey(i), "missing sprop-vps parameter");
        C9542sf.b(abstractC6044eO0.containsKey(g), "missing sprop-sps parameter");
        C9542sf.b(abstractC6044eO0.containsKey(h), "missing sprop-pps parameter");
        AbstractC5317bO0 U = AbstractC5317bO0.U(c((String) C9542sf.g(abstractC6044eO0.get(i))), c((String) C9542sf.g(abstractC6044eO0.get(g))), c((String) C9542sf.g(abstractC6044eO0.get(h))));
        bVar.V(U);
        byte[] bArr = U.get(1);
        C9337ro1.a h2 = C9337ro1.h(bArr, C9337ro1.i.length, bArr.length);
        bVar.c0(h2.m);
        bVar.S(h2.l).n0(h2.k);
        bVar.K(JE.c(h2.a, h2.b, h2.c, h2.d, h2.h, h2.i));
    }

    public static void i(C10833xx0.b bVar, AbstractC6044eO0<String, String> abstractC6044eO0) {
        String str = abstractC6044eO0.get("config");
        if (str != null) {
            byte[] W = TD2.W(str);
            bVar.V(AbstractC5317bO0.M(W));
            Pair<Integer, Integer> f2 = JE.f(W);
            bVar.n0(((Integer) f2.first).intValue()).S(((Integer) f2.second).intValue());
        } else {
            bVar.n0(352).S(288);
        }
        String str2 = abstractC6044eO0.get(c);
        StringBuilder sb = new StringBuilder();
        sb.append(f693o);
        if (str2 == null) {
            str2 = "1";
        }
        sb.append(str2);
        bVar.K(sb.toString());
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5105aW1.class == obj.getClass()) {
            C5105aW1 c5105aW1 = (C5105aW1) obj;
            if (this.a.equals(c5105aW1.a) && this.b.equals(c5105aW1.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.a.hashCode()) * 31) + this.b.hashCode();
    }
}
