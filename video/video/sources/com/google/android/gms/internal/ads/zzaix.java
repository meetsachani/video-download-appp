package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;
import o.C10323vs;
import o.C4128Rj1;
import o.C6516gH2;
import o.C7834lj1;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaix {
    @InterfaceC11300zs1
    public static zzau a(zzek zzekVar) {
        String str;
        int w = zzekVar.w() + zzekVar.A();
        int A = zzekVar.A();
        int i = (A >> 24) & 255;
        zzau zzauVar = null;
        try {
            if (i != 169 && i != 253) {
                if (A == 1735291493) {
                    String a = zzagy.a(b(zzekVar) - 1);
                    if (a != null) {
                        zzauVar = new zzahc("TCON", null, zzfyc.G(a));
                    } else {
                        zzdx.f(C7834lj1.a, "Failed to parse standard genre code");
                    }
                } else if (A == 1684632427) {
                    zzauVar = d(C7834lj1.p, "TPOS", zzekVar);
                } else if (A == 1953655662) {
                    zzauVar = d(C7834lj1.q, "TRCK", zzekVar);
                } else if (A == 1953329263) {
                    zzauVar = c(C7834lj1.r, "TBPM", zzekVar, true, false);
                } else if (A == 1668311404) {
                    zzauVar = c(C7834lj1.s, "TCMP", zzekVar, true, true);
                } else if (A == 1668249202) {
                    int A2 = zzekVar.A();
                    if (zzekVar.A() == 1684108385) {
                        int A3 = zzekVar.A();
                        int i2 = zzaip.b;
                        int i3 = A3 & C6516gH2.x;
                        if (i3 == 13) {
                            str = C4128Rj1.R0;
                        } else if (i3 == 14) {
                            str = C4128Rj1.P0;
                            i3 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzdx.f(C7834lj1.a, "Unrecognized cover art flags: " + i3);
                        } else {
                            zzekVar.m(4);
                            int i4 = A2 - 16;
                            byte[] bArr = new byte[i4];
                            zzekVar.h(bArr, 0, i4);
                            zzauVar = new zzago(str, null, 3, bArr);
                        }
                    } else {
                        zzdx.f(C7834lj1.a, "Failed to parse cover art attribute");
                    }
                } else if (A == 1631670868) {
                    zzauVar = e(C7834lj1.t, "TPE2", zzekVar);
                } else if (A == 1936682605) {
                    zzauVar = e(C7834lj1.u, "TSOT", zzekVar);
                } else if (A == 1936679276) {
                    zzauVar = e(C7834lj1.v, "TSOA", zzekVar);
                } else if (A == 1936679282) {
                    zzauVar = e(C7834lj1.w, "TSOP", zzekVar);
                } else if (A == 1936679265) {
                    zzauVar = e(C7834lj1.x, "TSO2", zzekVar);
                } else if (A == 1936679791) {
                    zzauVar = e(C7834lj1.y, "TSOC", zzekVar);
                } else if (A == 1920233063) {
                    zzauVar = c(C7834lj1.z, "ITUNESADVISORY", zzekVar, false, false);
                } else if (A == 1885823344) {
                    zzauVar = c(C7834lj1.A, "ITUNESGAPLESS", zzekVar, false, true);
                } else if (A == 1936683886) {
                    zzauVar = e(C7834lj1.B, "TVSHOWSORT", zzekVar);
                } else if (A == 1953919848) {
                    zzauVar = e(C7834lj1.C, "TVSHOW", zzekVar);
                } else {
                    if (A == 757935405) {
                        int i5 = -1;
                        int i6 = -1;
                        String str2 = null;
                        String str3 = null;
                        while (zzekVar.w() < w) {
                            int w2 = zzekVar.w();
                            int A4 = zzekVar.A();
                            int A5 = zzekVar.A();
                            zzekVar.m(4);
                            if (A5 == 1835360622) {
                                str2 = zzekVar.a(A4 - 12);
                            } else {
                                int i7 = A4 - 12;
                                if (A5 == 1851878757) {
                                    str3 = zzekVar.a(i7);
                                } else {
                                    if (A5 == 1684108385) {
                                        i6 = A4;
                                    }
                                    if (A5 == 1684108385) {
                                        i5 = w2;
                                    }
                                    zzekVar.m(i7);
                                }
                            }
                        }
                        if (str2 != null && str3 != null && i5 != -1) {
                            zzekVar.l(i5);
                            zzekVar.m(16);
                            zzauVar = new zzagz(str2, str3, zzekVar.a(i6 - 16));
                        }
                    }
                    zzdx.b(C7834lj1.a, "Skipped unknown metadata entry: " + zzfc.a(A));
                }
            } else {
                int i8 = A & C6516gH2.x;
                if (i8 == 6516084) {
                    int A6 = zzekVar.A();
                    if (zzekVar.A() == 1684108385) {
                        zzekVar.m(8);
                        String a2 = zzekVar.a(A6 - 16);
                        zzauVar = new zzags(C10323vs.g1, a2, a2);
                    } else {
                        zzdx.f(C7834lj1.a, "Failed to parse comment attribute: ".concat(zzfc.a(A)));
                    }
                } else {
                    if (i8 != 7233901 && i8 != 7631467) {
                        if (i8 != 6516589 && i8 != 7828084) {
                            if (i8 == 6578553) {
                                zzauVar = e(A, "TDRC", zzekVar);
                            } else if (i8 == 4280916) {
                                zzauVar = e(A, "TPE1", zzekVar);
                            } else if (i8 == 7630703) {
                                zzauVar = e(A, "TSSE", zzekVar);
                            } else if (i8 == 6384738) {
                                zzauVar = e(A, "TALB", zzekVar);
                            } else if (i8 == 7108978) {
                                zzauVar = e(A, "USLT", zzekVar);
                            } else if (i8 == 6776174) {
                                zzauVar = e(A, "TCON", zzekVar);
                            } else {
                                if (i8 == 6779504) {
                                    zzauVar = e(A, "TIT1", zzekVar);
                                }
                                zzdx.b(C7834lj1.a, "Skipped unknown metadata entry: " + zzfc.a(A));
                            }
                        }
                        zzauVar = e(A, "TCOM", zzekVar);
                    }
                    zzauVar = e(A, "TIT2", zzekVar);
                }
            }
            return zzauVar;
        } finally {
            zzekVar.l(w);
        }
    }

    public static int b(zzek zzekVar) {
        int A = zzekVar.A();
        if (zzekVar.A() == 1684108385) {
            zzekVar.m(8);
            int i = A - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (zzekVar.z() & 128) == 0) {
                            return zzekVar.J();
                        }
                    } else {
                        return zzekVar.I();
                    }
                } else {
                    return zzekVar.K();
                }
            } else {
                return zzekVar.G();
            }
        }
        zzdx.f(C7834lj1.a, "Failed to parse data atom to int");
        return -1;
    }

    @InterfaceC11300zs1
    public static zzagx c(int i, String str, zzek zzekVar, boolean z, boolean z2) {
        int b = b(zzekVar);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b >= 0) {
            if (z) {
                return new zzahc(str, null, zzfyc.G(Integer.toString(b)));
            }
            return new zzags(C10323vs.g1, str, Integer.toString(b));
        }
        zzdx.f(C7834lj1.a, "Failed to parse uint8 attribute: ".concat(zzfc.a(i)));
        return null;
    }

    @InterfaceC11300zs1
    public static zzahc d(int i, String str, zzek zzekVar) {
        int A = zzekVar.A();
        if (zzekVar.A() == 1684108385 && A >= 22) {
            zzekVar.m(10);
            int K = zzekVar.K();
            if (K > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(K);
                String sb2 = sb.toString();
                int K2 = zzekVar.K();
                if (K2 > 0) {
                    sb2 = sb2 + RemoteSettings.i + K2;
                }
                return new zzahc(str, null, zzfyc.G(sb2));
            }
        }
        zzdx.f(C7834lj1.a, "Failed to parse index/count attribute: ".concat(zzfc.a(i)));
        return null;
    }

    @InterfaceC11300zs1
    public static zzahc e(int i, String str, zzek zzekVar) {
        int A = zzekVar.A();
        if (zzekVar.A() == 1684108385) {
            zzekVar.m(8);
            return new zzahc(str, null, zzfyc.G(zzekVar.a(A - 16)));
        }
        zzdx.f(C7834lj1.a, "Failed to parse text attribute: ".concat(zzfc.a(i)));
        return null;
    }
}
