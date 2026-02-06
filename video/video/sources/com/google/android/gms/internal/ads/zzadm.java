package com.google.android.gms.internal.ads;

import com.facebook.internal.q0;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import o.C10323vs;
import o.C4128Rj1;
import o.C9948uJ1;
import o.CK1;
import o.I3;
import o.InterfaceC11300zs1;
import o.O70;
import o.OZ1;

/* loaded from: classes2.dex */
public final class zzadm {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, C9948uJ1.h, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, CK1.x, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, q0.q1, I3.g, 1920, 2048, 2304, 2560, 2688, OZ1.i, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, C9948uJ1.h, 64000, C9948uJ1.i, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, O70.a, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};
    public static final /* synthetic */ int j = 0;

    public static int a(byte[] bArr) {
        int i2;
        zzej g2 = g(bArr);
        g2.n(42);
        if (true != g2.p()) {
            i2 = 8;
        } else {
            i2 = 12;
        }
        return g2.d(i2) + 1;
    }

    public static int b(byte[] bArr) {
        zzej g2 = g(bArr);
        g2.n(32);
        return f(g2, i, true) + 1;
    }

    public static zzz c(byte[] bArr, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, int i2, String str3, @InterfaceC11300zs1 zzs zzsVar) {
        int i3;
        int i4;
        zzej g2 = g(bArr);
        g2.n(60);
        int i5 = a[g2.d(6)];
        int i6 = b[g2.d(4)];
        int d2 = g2.d(5);
        if (d2 >= 29) {
            i3 = -1;
        } else {
            i3 = (c[d2] * 1000) / 2;
        }
        g2.n(10);
        if (g2.d(2) > 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i7 = i5 + i4;
        zzx zzxVar = new zzx();
        zzxVar.o(str);
        zzxVar.e(C4128Rj1.f601o);
        zzxVar.E(C4128Rj1.V);
        zzxVar.a(i3);
        zzxVar.b(i7);
        zzxVar.F(i6);
        zzxVar.h(null);
        zzxVar.s(str2);
        zzxVar.C(i2);
        return zzxVar.K();
    }

    public static zzadk d(byte[] bArr) throws zzaz {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        zzej g2 = g(bArr);
        g2.n(40);
        int d2 = g2.d(2);
        boolean p = g2.p();
        if (true != p) {
            i2 = 16;
        } else {
            i2 = 20;
        }
        if (true != p) {
            i3 = 8;
        } else {
            i3 = 12;
        }
        g2.n(i3);
        int d3 = g2.d(i2) + 1;
        boolean p2 = g2.p();
        int i7 = -1;
        int i8 = 0;
        if (p2) {
            i4 = g2.d(2);
            int d4 = g2.d(3) + 1;
            if (g2.p()) {
                g2.n(36);
            }
            int d5 = g2.d(3) + 1;
            int d6 = g2.d(3) + 1;
            if (d5 == 1 && d6 == 1) {
                int i9 = d2 + 1;
                int d7 = g2.d(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    if (((d7 >> i10) & 1) == 1) {
                        g2.n(8);
                    }
                }
                int i11 = d4 * 512;
                if (g2.p()) {
                    g2.n(2);
                    int d8 = (g2.d(2) + 1) << 2;
                    int d9 = g2.d(2) + 1;
                    while (i8 < d9) {
                        g2.n(d8);
                        i8++;
                    }
                }
                i8 = i11;
            } else {
                throw zzaz.c("Multiple audio presentations or assets not supported");
            }
        } else {
            i4 = -1;
        }
        g2.n(i2);
        g2.n(12);
        if (p2) {
            if (g2.p()) {
                g2.n(4);
            }
            if (g2.p()) {
                g2.n(24);
            }
            if (g2.p()) {
                g2.o(g2.d(10) + 1);
            }
            g2.n(5);
            i5 = d[g2.d(4)];
            i7 = g2.d(8) + 1;
        } else {
            i5 = C10323vs.f;
        }
        int i12 = i5;
        if (p2) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        i6 = 48000;
                    } else {
                        throw zzaz.a("Unsupported reference clock code in DTS HD header: " + i4, null);
                    }
                } else {
                    i6 = 44100;
                }
            } else {
                i6 = C9948uJ1.h;
            }
            j2 = zzeu.P(i8, 1000000L, i6, RoundingMode.DOWN);
        } else {
            j2 = C10323vs.b;
        }
        return new zzadk(C4128Rj1.X, i7, i12, d3, j2, 0, null);
    }

    public static zzadk e(byte[] bArr, AtomicInteger atomicInteger) throws zzaz {
        char c2;
        long j2;
        int i2;
        AtomicInteger atomicInteger2;
        int i3;
        int i4;
        int i5;
        zzej g2 = g(bArr);
        int d2 = g2.d(32);
        int f2 = f(g2, e, true);
        int i6 = f2 + 1;
        if (d2 == 1078008818) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            if (g2.p()) {
                int i7 = f2 - 1;
                if (((bArr[f2] & 255) | ((char) (bArr[i7] << 8))) == zzeu.z(bArr, 0, i7, 65535)) {
                    int d3 = g2.d(2);
                    if (d3 != 0) {
                        if (d3 != 1) {
                            if (d3 == 2) {
                                i4 = 384;
                            } else {
                                throw zzaz.a("Unsupported base duration index in DTS UHD header: " + d3, null);
                            }
                        } else {
                            i4 = q0.n1;
                        }
                    } else {
                        i4 = 512;
                    }
                    int d4 = g2.d(3) + 1;
                    int d5 = g2.d(2);
                    if (d5 != 0) {
                        if (d5 != 1) {
                            if (d5 == 2) {
                                i5 = 48000;
                            } else {
                                throw zzaz.a("Unsupported clock rate index in DTS UHD header: " + d5, null);
                            }
                        } else {
                            i5 = 44100;
                        }
                    } else {
                        i5 = C9948uJ1.h;
                    }
                    if (g2.p()) {
                        g2.n(36);
                    }
                    i2 = (1 << g2.d(2)) * i5;
                    j2 = zzeu.P(i4 * d4, 1000000L, i5, RoundingMode.DOWN);
                } else {
                    throw zzaz.a("CRC check failed", null);
                }
            } else {
                throw zzaz.c("Only supports full channel mask-based audio presentation");
            }
        } else {
            j2 = C10323vs.b;
            i2 = C10323vs.f;
        }
        int i8 = i2;
        long j3 = j2;
        int i9 = 0;
        for (char c3 = 0; c3 < c2; c3 = 1) {
            i9 += f(g2, f, true);
        }
        for (int i10 = 0; i10 <= 0; i10++) {
            if (c2 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(f(g2, g, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            if (atomicInteger2.get() != 0) {
                i3 = f(g2, h, true);
            } else {
                i3 = 0;
            }
            i9 += i3;
        }
        return new zzadk(C4128Rj1.Y, 2, i8, i6 + i9, j3, 0, null);
    }

    public static int f(zzej zzejVar, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzejVar.p(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return i4 + zzejVar.d(iArr[i2]);
    }

    public static zzej g(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            int length = copyOf.length;
            zzej zzejVar = new zzej(copyOf, length);
            if (copyOf[0] == 31) {
                zzej zzejVar2 = new zzej(copyOf, length);
                while (zzejVar2.a() >= 16) {
                    zzejVar2.n(2);
                    zzejVar.g(zzejVar2.d(14), 14);
                }
            }
            zzejVar.k(copyOf, copyOf.length);
            return zzejVar;
        }
        return new zzej(bArr, bArr.length);
    }
}
