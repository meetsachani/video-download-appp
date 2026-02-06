package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;
import o.S92;

/* loaded from: classes2.dex */
final class zzcp {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f255o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public zzcp(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 + i4;
        this.h = i5;
        this.i = new short[i5];
        int i6 = i5 * i2;
        this.j = new short[i6];
        this.l = new short[i6];
        this.n = new short[i6];
    }

    public static void j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    public final int a() {
        boolean z;
        if (this.m >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        int i = this.m * this.b;
        return i + i;
    }

    public final int b() {
        int i = this.k * this.b;
        return i + i;
    }

    public final void c() {
        this.k = 0;
        this.m = 0;
        this.f255o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0.0d;
    }

    public final void d(ShortBuffer shortBuffer) {
        boolean z;
        if (this.m >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int min = Math.min(remaining / i, this.m);
        int i2 = min * i;
        shortBuffer.put(this.l, 0, i2);
        int i3 = this.m - min;
        this.m = i3;
        short[] sArr = this.l;
        System.arraycopy(sArr, i2, sArr, 0, i3 * i);
    }

    public final void e() {
        int i = this.k;
        int i2 = this.r;
        int i3 = this.m;
        float f = this.c;
        float f2 = this.d;
        int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + this.w) + this.f255o) / (this.e * f2)) + 0.5d));
        this.w = 0.0d;
        int i5 = this.h;
        int i6 = i5 + i5;
        this.j = l(this.j, i, i + i6);
        int i7 = 0;
        while (true) {
            int i8 = this.b;
            if (i7 >= i6 * i8) {
                break;
            }
            this.j[(i8 * i) + i7] = 0;
            i7++;
        }
        this.k += i6;
        k();
        if (this.m > i4) {
            this.m = Math.max(i4, 0);
        }
        this.k = 0;
        this.r = 0;
        this.f255o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = remaining / i;
        int i3 = i2 * i;
        short[] l = l(this.j, this.k, i2);
        this.j = l;
        shortBuffer.get(l, this.k * i, (i3 + i3) / 2);
        this.k += i2;
        k();
    }

    public final int g(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.b * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.u = i4 / i6;
        this.v = i7 / i5;
        return i6;
    }

    public final void h(short[] sArr, int i, int i2) {
        short[] l = l(this.l, this.m, i2);
        this.l = l;
        int i3 = this.m;
        int i4 = this.b;
        System.arraycopy(sArr, i * i4, l, i3 * i4, i2 * i4);
        this.m += i2;
    }

    public final void i(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.h / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.b;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.i[i4] = (short) (i6 / i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0295 A[LOOP:4: B:13:0x0036->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0194 A[EDGE_INSN: B:115:0x0194->B:68:0x0194 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        double d;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        long j2;
        boolean z;
        int i15;
        float f3 = this.c;
        float f4 = this.d;
        double d2 = f3 / f4;
        int i16 = (d2 > 1.0000100135803223d ? 1 : (d2 == 1.0000100135803223d ? 0 : -1));
        int i17 = this.m;
        int i18 = 0;
        int i19 = 1;
        if (i16 <= 0 && d2 >= 0.9999899864196777d) {
            h(this.j, 0, this.k);
            this.k = 0;
        } else {
            int i20 = this.k;
            int i21 = this.h;
            if (i20 >= i21) {
                int i22 = 0;
                while (true) {
                    int i23 = this.r;
                    if (i23 > 0) {
                        int min = Math.min(i21, i23);
                        h(this.j, i22, min);
                        this.r -= min;
                        i22 += min;
                        f = f4;
                        d = d2;
                    } else {
                        short[] sArr = this.j;
                        int i24 = this.a;
                        if (i24 > 4000) {
                            i = i24 / S92.y;
                        } else {
                            i = i19;
                        }
                        int i25 = this.b;
                        if (i25 == i19) {
                            if (i == i19) {
                                i2 = g(sArr, i22, this.f, this.g);
                                f = f4;
                                i3 = i19;
                                i4 = this.u;
                                int i26 = this.v;
                                if (i4 == 0 && (i10 = this.s) != 0 && i26 <= i4 * 3 && i4 + i4 > this.t * 3) {
                                    i5 = i10;
                                } else {
                                    i5 = i2;
                                }
                                int i27 = i22 + i5;
                                this.t = i4;
                                this.s = i2;
                                double d3 = i5;
                                if (d2 <= 1.0d) {
                                    short[] sArr2 = this.j;
                                    double d4 = d2 - 1.0d;
                                    if (d2 >= 2.0d) {
                                        i8 = i5;
                                        double d5 = (d3 / d4) + this.w;
                                        int round = (int) Math.round(d5);
                                        d = d2;
                                        this.w = d5 - round;
                                        i9 = round;
                                    } else {
                                        d = d2;
                                        i8 = i5;
                                        double d6 = ((d3 * (2.0d - d)) / d4) + this.w;
                                        int round2 = (int) Math.round(d6);
                                        this.r = round2;
                                        this.w = d6 - round2;
                                        i9 = i8;
                                    }
                                    short[] l = l(this.l, this.m, i9);
                                    this.l = l;
                                    j(i9, i3, l, this.m, sArr2, i22, sArr2, i27);
                                    this.m += i9;
                                    i22 += i8 + i9;
                                } else {
                                    int i28 = i22;
                                    d = d2;
                                    int i29 = i5;
                                    short[] sArr3 = this.j;
                                    double d7 = 1.0d - d;
                                    if (d < 0.5d) {
                                        double d8 = ((d3 * d) / d7) + this.w;
                                        int round3 = (int) Math.round(d8);
                                        this.w = d8 - round3;
                                        i7 = round3;
                                        i6 = i17;
                                    } else {
                                        i6 = i17;
                                        double d9 = ((d3 * ((d + d) - 1.0d)) / d7) + this.w;
                                        int round4 = (int) Math.round(d9);
                                        this.r = round4;
                                        this.w = d9 - round4;
                                        i7 = i29;
                                    }
                                    int i30 = i29 + i7;
                                    short[] l2 = l(this.l, this.m, i30);
                                    this.l = l2;
                                    System.arraycopy(sArr3, i28 * i3, l2, this.m * i3, i29 * i3);
                                    j(i7, i3, this.l, this.m + i29, sArr3, i27, sArr3, i28);
                                    this.m += i30;
                                    i22 = i28 + i7;
                                    if (i22 + i21 <= i20) {
                                        break;
                                    }
                                    i19 = 1;
                                    f4 = f;
                                    i17 = i6;
                                    d2 = d;
                                    i18 = 0;
                                }
                            } else {
                                i25 = i19;
                            }
                        }
                        i(sArr, i22, i);
                        short[] sArr4 = this.i;
                        int i31 = this.f;
                        int i32 = this.g;
                        f = f4;
                        int g = g(sArr4, i18, i31 / i, i32 / i);
                        if (i != 1) {
                            int i33 = g * i;
                            int i34 = i * 4;
                            int i35 = i33 - i34;
                            if (i35 >= i31) {
                                i31 = i35;
                            }
                            int i36 = i33 + i34;
                            if (i36 <= i32) {
                                i32 = i36;
                            }
                            if (i25 == 1) {
                                i2 = g(sArr, i22, i31, i32);
                            } else {
                                i(sArr, i22, 1);
                                i2 = g(sArr4, i18, i31, i32);
                            }
                        } else {
                            i2 = g;
                        }
                        i3 = i25;
                        i4 = this.u;
                        int i262 = this.v;
                        if (i4 == 0) {
                        }
                        i5 = i2;
                        int i272 = i22 + i5;
                        this.t = i4;
                        this.s = i2;
                        double d32 = i5;
                        if (d2 <= 1.0d) {
                        }
                    }
                    i6 = i17;
                    if (i22 + i21 <= i20) {
                    }
                }
                int i37 = this.k - i22;
                short[] sArr5 = this.j;
                int i38 = this.b;
                System.arraycopy(sArr5, i22 * i38, sArr5, 0, i38 * i37);
                this.k = i37;
                f2 = this.e * f;
                if (f2 == 1.0f && this.m != (i11 = i6)) {
                    int i39 = this.a;
                    long j3 = i39;
                    long j4 = i39 / f2;
                    while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                        j4 /= 2;
                        j3 /= 2;
                    }
                    int i40 = this.m - i11;
                    short[] l3 = l(this.n, this.f255o, i40);
                    this.n = l3;
                    short[] sArr6 = this.l;
                    int i41 = this.b;
                    System.arraycopy(sArr6, i11 * i41, l3, this.f255o * i41, i40 * i41);
                    this.m = i11;
                    this.f255o += i40;
                    int i42 = 0;
                    while (true) {
                        i12 = this.f255o;
                        i13 = i12 - 1;
                        if (i42 >= i13) {
                            break;
                        }
                        while (true) {
                            i14 = this.p + 1;
                            j = i14;
                            j2 = this.q;
                            if (j * j4 <= j2 * j3) {
                                break;
                            }
                            this.l = l(this.l, this.m, 1);
                            int i43 = 0;
                            while (i43 < i41) {
                                short[] sArr7 = this.l;
                                short[] sArr8 = this.n;
                                int i44 = (i42 * i41) + i43;
                                short s = sArr8[i44];
                                short s2 = sArr8[i44 + i41];
                                int i45 = i43;
                                long j5 = (i15 + 1) * j4;
                                long j6 = j5 - (this.p * j4);
                                long j7 = j5 - (this.q * j3);
                                sArr7[(this.m * i41) + i45] = (short) (((j7 * s) + ((j6 - j7) * s2)) / j6);
                                i43 = i45 + 1;
                            }
                            this.q++;
                            this.m++;
                        }
                        this.p = i14;
                        if (j == j3) {
                            this.p = 0;
                            if (j2 == j4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zzdc.f(z);
                            this.q = 0;
                        }
                        i42++;
                    }
                    if (i13 != 0) {
                        short[] sArr9 = this.n;
                        System.arraycopy(sArr9, i13 * i41, sArr9, 0, (i12 - i13) * i41);
                        this.f255o -= i13;
                        return;
                    }
                    return;
                }
            }
        }
        f = f4;
        i6 = i17;
        f2 = this.e * f;
        if (f2 == 1.0f) {
        }
    }

    public final short[] l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }
}
