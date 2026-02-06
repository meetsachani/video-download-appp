package o;

import o.C10833xx0;

@Deprecated
/* renamed from: o.Cd2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2628Cd2 implements InterfaceC4029Qj {
    public static final String b = "StreamFormatChunk";
    public final C10833xx0 a;

    public C2628Cd2(C10833xx0 c10833xx0) {
        this.a = c10833xx0;
    }

    @InterfaceC11300zs1
    public static String a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case C10997yd1.V2 /* 1482049860 */:
            case 1684633208:
            case 2021026148:
                return C4128Rj1.p;
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return C4128Rj1.A;
            case 859066445:
                return C4128Rj1.B;
            case 1196444237:
            case 1735420525:
                return C4128Rj1.z;
            default:
                return null;
        }
    }

    @InterfaceC11300zs1
    public static String b(int i) {
        if (i != 1) {
            if (i != 85) {
                if (i != 255) {
                    if (i != 8192) {
                        if (i != 8193) {
                            return null;
                        }
                        return C4128Rj1.V;
                    }
                    return C4128Rj1.Q;
                }
                return "audio/mp4a-latm";
            }
            return C4128Rj1.I;
        }
        return C4128Rj1.N;
    }

    @InterfaceC11300zs1
    public static InterfaceC4029Qj c(C3012Fy1 c3012Fy1) {
        c3012Fy1.Z(4);
        int w = c3012Fy1.w();
        int w2 = c3012Fy1.w();
        c3012Fy1.Z(4);
        int w3 = c3012Fy1.w();
        String a = a(w3);
        if (a == null) {
            I31.n(b, "Ignoring track with unsupported compression " + w3);
            return null;
        }
        C10833xx0.b bVar = new C10833xx0.b();
        bVar.n0(w).S(w2).g0(a);
        return new C2628Cd2(bVar.G());
    }

    @InterfaceC11300zs1
    public static InterfaceC4029Qj d(int i, C3012Fy1 c3012Fy1) {
        if (i == 2) {
            return c(c3012Fy1);
        }
        if (i == 1) {
            return e(c3012Fy1);
        }
        I31.n(b, "Ignoring strf box for unsupported track type: " + TD2.E0(i));
        return null;
    }

    @InterfaceC11300zs1
    public static InterfaceC4029Qj e(C3012Fy1 c3012Fy1) {
        int D = c3012Fy1.D();
        String b2 = b(D);
        if (b2 == null) {
            I31.n(b, "Ignoring track with unsupported format tag " + D);
            return null;
        }
        int D2 = c3012Fy1.D();
        int w = c3012Fy1.w();
        c3012Fy1.Z(6);
        int u0 = TD2.u0(c3012Fy1.R());
        int D3 = c3012Fy1.D();
        byte[] bArr = new byte[D3];
        c3012Fy1.n(bArr, 0, D3);
        C10833xx0.b bVar = new C10833xx0.b();
        bVar.g0(b2).J(D2).h0(w);
        if (C4128Rj1.N.equals(b2) && u0 != 0) {
            bVar.a0(u0);
        }
        if ("audio/mp4a-latm".equals(b2) && D3 > 0) {
            bVar.V(AbstractC5317bO0.M(bArr));
        }
        return new C2628Cd2(bVar.G());
    }

    @Override // o.InterfaceC4029Qj
    public int getType() {
        return C4126Rj.B;
    }
}
