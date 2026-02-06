package com.google.android.gms.internal.ads;

import o.C3062Gl1;
import o.C3503Kz;
import o.C4128Rj1;
import o.C9948uJ1;
import o.G;
import o.I3;
import o.O70;

/* loaded from: classes2.dex */
public final class zzaeg {
    public static final String[] a = {C4128Rj1.J, C4128Rj1.K, C4128Rj1.I};
    public static final int[] b = {44100, 48000, C9948uJ1.h};
    public static final int[] c = {C9948uJ1.h, 64000, 96000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {C9948uJ1.h, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 144000, 160000, 176000, O70.a, 224000, G.i};
    public static final int[] e = {C9948uJ1.h, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 320000, 384000};
    public static final int[] f = {C9948uJ1.h, C3062Gl1.b, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 160000, O70.a, 224000, G.i, 320000};
    public static final int[] g = {8000, 16000, 24000, C9948uJ1.h, C3062Gl1.b, 48000, 56000, 64000, I3.a, 96000, 112000, C9948uJ1.i, 144000, 160000};

    public static int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i4 - 1;
        int i9 = b[i5];
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i10 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = c[i8];
            } else {
                i7 = d[i8];
            }
            return (((i7 * 12) / i9) + i10) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = e[i8];
            } else {
                i6 = f[i8];
            }
        } else {
            i6 = g[i8];
        }
        int i11 = C3503Kz.h0;
        if (i2 == 3) {
            return ((i6 * C3503Kz.h0) / i9) + i10;
        }
        if (i3 == 1) {
            i11 = 72;
        }
        return ((i11 * i6) / i9) + i10;
    }

    public static int c(int i) {
        int i2;
        int i3;
        if (!m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = i >>> 12;
        int i5 = (i >>> 10) & 3;
        int i6 = i4 & 15;
        if (i6 == 0 || i6 == 15 || i5 == 3) {
            return -1;
        }
        return l(i2, i3);
    }

    public static int l(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 384 : 1152;
        } else if (i == 3) {
            return 1152;
        } else {
            return C3062Gl1.m;
        }
    }

    public static boolean m(int i) {
        return (i & (-2097152)) == -2097152;
    }
}
