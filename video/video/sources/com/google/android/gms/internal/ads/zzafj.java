package com.google.android.gms.internal.ads;

import o.C10997yd1;
import o.C2628Cd2;
import o.C4126Rj;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzafj implements zzafb {
    public final zzfyc a;
    public final int b;

    public zzafj(int i, zzfyc zzfycVar) {
        this.b = i;
        this.a = zzfycVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafj c(int i, zzek zzekVar) {
        String str;
        int i2;
        zzafb zzafkVar;
        String str2;
        zzfxz zzfxzVar = new zzfxz();
        int x = zzekVar.x();
        int i3 = -2;
        while (zzekVar.u() > 8) {
            int C = zzekVar.C();
            int w = zzekVar.w() + zzekVar.C();
            zzekVar.k(w);
            if (C == 1414744396) {
                zzafkVar = c(zzekVar.C(), zzekVar);
            } else {
                zzafk zzafkVar2 = null;
                switch (C) {
                    case C4126Rj.B /* 1718776947 */:
                        if (i3 == 2) {
                            zzekVar.m(4);
                            int C2 = zzekVar.C();
                            int C3 = zzekVar.C();
                            zzekVar.m(4);
                            int C4 = zzekVar.C();
                            switch (C4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case C10997yd1.V2 /* 1482049860 */:
                                case 1684633208:
                                case 2021026148:
                                    str2 = C4128Rj1.p;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = C4128Rj1.A;
                                    break;
                                case 859066445:
                                    str2 = C4128Rj1.B;
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = C4128Rj1.z;
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                zzdx.f(C2628Cd2.b, "Ignoring track with unsupported compression " + C4);
                            } else {
                                zzx zzxVar = new zzx();
                                zzxVar.J(C2);
                                zzxVar.m(C3);
                                zzxVar.E(str2);
                                zzafkVar2 = new zzafk(zzxVar.K());
                            }
                        } else if (i3 == 1) {
                            int E = zzekVar.E();
                            if (E != 1) {
                                if (E != 85) {
                                    if (E == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (E != 8192) {
                                        if (E != 8193) {
                                            str = null;
                                        } else {
                                            str = C4128Rj1.V;
                                        }
                                    } else {
                                        str = C4128Rj1.Q;
                                    }
                                } else {
                                    str = C4128Rj1.I;
                                }
                            } else {
                                str = C4128Rj1.N;
                            }
                            if (str == null) {
                                zzdx.f(C2628Cd2.b, "Ignoring track with unsupported format tag " + E);
                            } else {
                                int E2 = zzekVar.E();
                                int C5 = zzekVar.C();
                                zzekVar.m(6);
                                int I = zzeu.I(zzekVar.E());
                                if (zzekVar.u() > 0) {
                                    i2 = zzekVar.E();
                                } else {
                                    i2 = 0;
                                }
                                zzx zzxVar2 = new zzx();
                                zzxVar2.E(str);
                                zzxVar2.b(E2);
                                zzxVar2.F(C5);
                                if (str.equals(C4128Rj1.N) && I != 0) {
                                    zzxVar2.x(I);
                                }
                                if (str.equals("audio/mp4a-latm") && i2 > 0) {
                                    byte[] bArr = new byte[i2];
                                    zzekVar.h(bArr, 0, i2);
                                    zzxVar2.p(zzfyc.G(bArr));
                                }
                                zzafkVar = new zzafk(zzxVar2.K());
                                break;
                            }
                        } else {
                            zzdx.f(C2628Cd2.b, "Ignoring strf box for unsupported track type: ".concat(zzeu.d(i3)));
                        }
                        zzafkVar = zzafkVar2;
                        break;
                    case C4126Rj.v /* 1751742049 */:
                        zzafkVar = zzafg.b(zzekVar);
                        break;
                    case C4126Rj.D /* 1752331379 */:
                        zzafkVar = zzafh.d(zzekVar);
                        break;
                    case C4126Rj.C /* 1852994675 */:
                        zzafkVar = zzafl.b(zzekVar);
                        break;
                    default:
                        zzafkVar = zzafkVar2;
                        break;
                }
            }
            if (zzafkVar != null) {
                if (zzafkVar.a() == 1752331379) {
                    i3 = ((zzafh) zzafkVar).b();
                }
                zzfxzVar.g(zzafkVar);
            }
            zzekVar.l(w);
            zzekVar.k(x);
        }
        return new zzafj(i, zzfxzVar.j());
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final int a() {
        return this.b;
    }

    @InterfaceC11300zs1
    public final zzafb b(Class cls) {
        zzfyc zzfycVar = this.a;
        int size = zzfycVar.size();
        int i = 0;
        while (i < size) {
            zzafb zzafbVar = (zzafb) zzfycVar.get(i);
            i++;
            if (zzafbVar.getClass() == cls) {
                return zzafbVar;
            }
        }
        return null;
    }
}
