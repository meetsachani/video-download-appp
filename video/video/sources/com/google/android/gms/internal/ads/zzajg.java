package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import o.A92;
import o.AbstractC4501Vf;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzajg {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, AbstractC4501Vf.h, AbstractC4501Vf.k, AbstractC4501Vf.l, AbstractC4501Vf.q, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, A92.a, 1297305174, 1684175153, 1769172332, 1885955686};

    @InterfaceC11300zs1
    public static zzaeq a(zzado zzadoVar) throws IOException {
        return c(zzadoVar, true, false);
    }

    @InterfaceC11300zs1
    public static zzaeq b(zzado zzadoVar, boolean z) throws IOException {
        return c(zzadoVar, false, z);
    }

    @InterfaceC11300zs1
    public static zzaeq c(zzado zzadoVar, boolean z, boolean z2) throws IOException {
        zzaeq zzaeqVar;
        long j;
        zzek zzekVar;
        int i;
        boolean z3;
        int i2;
        int[] iArr;
        long f = zzadoVar.f();
        long j2 = -1;
        int i3 = (f > (-1L) ? 1 : (f == (-1L) ? 0 : -1));
        long j3 = PlaybackStateCompat.t1;
        if (i3 != 0 && f <= PlaybackStateCompat.t1) {
            j3 = f;
        }
        zzek zzekVar2 = new zzek(64);
        int i4 = (int) j3;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i4) {
            zzekVar2.i(8);
            boolean z5 = true;
            if (!zzadoVar.F(zzekVar2.n(), i5, 8, true)) {
                break;
            }
            long O = zzekVar2.O();
            int A = zzekVar2.A();
            if (O == 1) {
                j = j2;
                zzadoVar.J(zzekVar2.n(), 8, 8);
                i = 16;
                zzekVar2.k(16);
                O = zzekVar2.N();
                zzekVar = zzekVar2;
            } else {
                j = j2;
                if (O == 0) {
                    long f2 = zzadoVar.f();
                    if (f2 != j) {
                        O = (f2 - zzadoVar.d()) + 8;
                    }
                }
                zzekVar = zzekVar2;
                i = 8;
            }
            long j4 = O;
            zzaeqVar = null;
            long j5 = i;
            if (j4 < j5) {
                return new zzaic(A, j4, i);
            }
            i6 += i;
            if (A == 1836019574) {
                i4 += (int) j4;
                if (i3 != 0 && i4 > f) {
                    i4 = (int) f;
                }
                zzekVar2 = zzekVar;
                j2 = j;
                i5 = 0;
            } else if (A == 1836019558 || A == 1836475768) {
                i5 = 1;
                break;
            } else {
                if (A == 1835295092) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z4 |= !z3;
                long j6 = f;
                if ((i6 + j4) - j5 >= i4) {
                    i5 = 0;
                    break;
                }
                int i7 = (int) (j4 - j5);
                i6 += i7;
                if (A == 1718909296) {
                    if (i7 < 8) {
                        return new zzaic(1718909296, i7, 8);
                    }
                    zzekVar.i(i7);
                    i2 = 0;
                    zzadoVar.J(zzekVar.n(), 0, i7);
                    int A2 = zzekVar.A();
                    boolean d = d(A2, z2) | z4;
                    zzekVar.m(4);
                    int u = zzekVar.u() / 4;
                    if (!d && u > 0) {
                        iArr = new int[u];
                        int i8 = 0;
                        while (true) {
                            if (i8 < u) {
                                int A3 = zzekVar.A();
                                iArr[i8] = A3;
                                if (d(A3, z2)) {
                                    break;
                                }
                                i8++;
                            } else {
                                z5 = d;
                                break;
                            }
                        }
                    } else {
                        z5 = d;
                        iArr = null;
                    }
                    if (z5) {
                        z4 = z5;
                    } else {
                        return new zzajl(A2, iArr);
                    }
                } else {
                    i2 = 0;
                    if (i7 != 0) {
                        zzadoVar.A(i7);
                    }
                }
                i5 = i2;
                zzekVar2 = zzekVar;
                j2 = j;
                f = j6;
            }
        }
        zzaeqVar = null;
        if (!z4) {
            return zzajc.a;
        }
        if (z != i5) {
            if (i5 != 0) {
                return zzaiw.a;
            }
            return zzaiw.b;
        }
        return zzaeqVar;
    }

    public static boolean d(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
