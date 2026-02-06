package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3062Gl1;
import o.C3503Kz;
import o.C4128Rj1;
import o.C9948uJ1;
import o.CK1;
import o.ED2;
import o.I3;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzacn {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, C9948uJ1.h};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, CK1.x, 224, 256, 320, 384, 448, 512, C3062Gl1.m, 640};
    public static final int[] f = {69, 87, 104, 121, C3503Kz.c0, C10997yd1.y1, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ int g = 0;

    public static int a(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & C2638Cg0.o7) >> 6) != 3) {
                i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return a[i] * 256;
        }
        return I3.g;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b2 = bArr[4];
        return f((b2 & C2638Cg0.o7) >> 6, b2 & ED2.a);
    }

    public static zzz c(zzek zzekVar, String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 zzs zzsVar) {
        zzej zzejVar = new zzej();
        zzejVar.j(zzekVar);
        int i = b[zzejVar.d(2)];
        zzejVar.n(8);
        int i2 = d[zzejVar.d(3)];
        if (zzejVar.d(1) != 0) {
            i2++;
        }
        int i3 = e[zzejVar.d(5)] * 1000;
        zzejVar.f();
        zzekVar.l(zzejVar.b());
        zzx zzxVar = new zzx();
        zzxVar.o(str);
        zzxVar.E(C4128Rj1.Q);
        zzxVar.b(i2);
        zzxVar.F(i);
        zzxVar.h(zzsVar);
        zzxVar.s(str2);
        zzxVar.a(i3);
        zzxVar.y(i3);
        return zzxVar.K();
    }

    public static zzz d(zzek zzekVar, String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 zzs zzsVar) {
        String str3;
        zzej zzejVar = new zzej();
        zzejVar.j(zzekVar);
        int d2 = zzejVar.d(13) * 1000;
        zzejVar.n(3);
        int i = b[zzejVar.d(2)];
        zzejVar.n(10);
        int i2 = d[zzejVar.d(3)];
        if (zzejVar.d(1) != 0) {
            i2++;
        }
        zzejVar.n(3);
        int d3 = zzejVar.d(4);
        zzejVar.n(1);
        if (d3 > 0) {
            zzejVar.n(6);
            if (zzejVar.d(1) != 0) {
                i2 += 2;
            }
            zzejVar.n(1);
        }
        if (zzejVar.a() > 7) {
            zzejVar.n(7);
            if (zzejVar.d(1) != 0) {
                str3 = C4128Rj1.S;
                zzejVar.f();
                zzekVar.l(zzejVar.b());
                zzx zzxVar = new zzx();
                zzxVar.o(str);
                zzxVar.E(str3);
                zzxVar.b(i2);
                zzxVar.F(i);
                zzxVar.h(zzsVar);
                zzxVar.s(str2);
                zzxVar.y(d2);
                return zzxVar.K();
            }
        }
        str3 = C4128Rj1.R;
        zzejVar.f();
        zzekVar.l(zzejVar.b());
        zzx zzxVar2 = new zzx();
        zzxVar2.o(str);
        zzxVar2.E(str3);
        zzxVar2.b(i2);
        zzxVar2.F(i);
        zzxVar2.h(zzsVar);
        zzxVar2.s(str2);
        zzxVar2.y(d2);
        return zzxVar2.K();
    }

    public static zzacl e(zzej zzejVar) {
        String str;
        int f2;
        int i;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str3;
        int c2 = zzejVar.c();
        zzejVar.n(40);
        int d2 = zzejVar.d(5);
        zzejVar.l(c2);
        int i9 = -1;
        if (d2 > 10) {
            zzejVar.n(16);
            int d3 = zzejVar.d(2);
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 == 2) {
                        i9 = 2;
                    }
                } else {
                    i9 = 1;
                }
            } else {
                i9 = 0;
            }
            zzejVar.n(3);
            int d4 = zzejVar.d(11) + 1;
            int d5 = zzejVar.d(2);
            if (d5 == 3) {
                i = c[zzejVar.d(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int d6 = zzejVar.d(2);
                int i10 = a[d6];
                i5 = d6;
                i = b[d5];
                i6 = i10;
            }
            f2 = d4 + d4;
            int i11 = (f2 * i) / (i6 * 32);
            int d7 = zzejVar.d(3);
            boolean p = zzejVar.p();
            i2 = d[d7] + (p ? 1 : 0);
            zzejVar.n(10);
            if (zzejVar.p()) {
                zzejVar.n(8);
            }
            if (d7 == 0) {
                zzejVar.n(5);
                if (zzejVar.p()) {
                    zzejVar.n(8);
                }
                i7 = 0;
                d7 = 0;
            } else {
                i7 = d7;
            }
            if (i9 == 1) {
                if (zzejVar.p()) {
                    zzejVar.n(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (zzejVar.p()) {
                if (i7 > 2) {
                    zzejVar.n(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzejVar.n(6);
                }
                if ((i7 & 4) != 0) {
                    zzejVar.n(6);
                }
                if (p && zzejVar.p()) {
                    zzejVar.n(5);
                }
                if (i8 == 0) {
                    if (zzejVar.p()) {
                        zzejVar.n(6);
                    }
                    if (i7 == 0 && zzejVar.p()) {
                        zzejVar.n(6);
                    }
                    if (zzejVar.p()) {
                        zzejVar.n(6);
                    }
                    int d8 = zzejVar.d(2);
                    if (d8 == 1) {
                        zzejVar.n(5);
                    } else if (d8 == 2) {
                        zzejVar.n(12);
                    } else if (d8 == 3) {
                        int d9 = zzejVar.d(5);
                        if (zzejVar.p()) {
                            zzejVar.n(5);
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                zzejVar.n(4);
                            }
                            if (zzejVar.p()) {
                                if (zzejVar.p()) {
                                    zzejVar.n(4);
                                }
                                if (zzejVar.p()) {
                                    zzejVar.n(4);
                                }
                            }
                        }
                        if (zzejVar.p()) {
                            zzejVar.n(5);
                            if (zzejVar.p()) {
                                zzejVar.n(7);
                                if (zzejVar.p()) {
                                    zzejVar.n(8);
                                }
                            }
                        }
                        zzejVar.n((d9 + 2) * 8);
                        zzejVar.f();
                    }
                    if (i7 < 2) {
                        if (zzejVar.p()) {
                            zzejVar.n(14);
                        }
                        if (d7 == 0 && zzejVar.p()) {
                            zzejVar.n(14);
                        }
                    }
                    if (zzejVar.p()) {
                        if (i5 == 0) {
                            zzejVar.n(5);
                            i8 = 0;
                            i5 = 0;
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (zzejVar.p()) {
                                    zzejVar.n(5);
                                }
                            }
                        }
                    }
                    i8 = 0;
                }
            }
            if (zzejVar.p()) {
                zzejVar.n(5);
                if (i7 == 2) {
                    zzejVar.n(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    zzejVar.n(2);
                }
                if (zzejVar.p()) {
                    zzejVar.n(8);
                }
                if (i7 == 0 && zzejVar.p()) {
                    zzejVar.n(8);
                }
                if (d5 < 3) {
                    zzejVar.m();
                }
            }
            if (i8 == 0 && i5 != 3) {
                zzejVar.m();
            }
            if (i8 == 2 && (i5 == 3 || zzejVar.p())) {
                zzejVar.n(6);
            }
            if (zzejVar.p() && zzejVar.d(6) == 1 && zzejVar.d(8) == 1) {
                str3 = C4128Rj1.S;
            } else {
                str3 = C4128Rj1.R;
            }
            i3 = i6 * 256;
            str2 = str3;
            i4 = i11;
        } else {
            zzejVar.n(32);
            int d10 = zzejVar.d(2);
            if (d10 == 3) {
                str = null;
            } else {
                str = C4128Rj1.Q;
            }
            int d11 = zzejVar.d(6);
            int i13 = e[d11 / 2] * 1000;
            f2 = f(d10, d11);
            zzejVar.n(8);
            int d12 = zzejVar.d(3);
            if ((d12 & 1) != 0 && d12 != 1) {
                zzejVar.n(2);
            }
            if ((d12 & 4) != 0) {
                zzejVar.n(2);
            }
            if (d12 == 2) {
                zzejVar.n(2);
            }
            if (d10 < 3) {
                i = b[d10];
            } else {
                i = -1;
            }
            i2 = d[d12] + (zzejVar.p() ? 1 : 0);
            i3 = I3.g;
            str2 = str;
            i4 = i13;
        }
        return new zzacl(str2, i9, i2, i, f2, i3, i4, null);
    }

    public static int f(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
