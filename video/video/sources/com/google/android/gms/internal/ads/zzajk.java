package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzajk {
    public final zzajh a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public zzajk(zzajh zzajhVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        int length3 = jArr.length;
        if (length3 == length2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.d(z2);
        int length4 = iArr2.length;
        zzdc.d(length4 == length2);
        this.a = zzajhVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int y = zzeu.y(this.f, j, true, false); y >= 0; y--) {
            if ((this.g[y] & 1) != 0) {
                return y;
            }
        }
        return -1;
    }

    public final int b(long j) {
        long[] jArr = this.f;
        for (int v = zzeu.v(jArr, j, true, false); v < jArr.length; v++) {
            if ((this.g[v] & 1) != 0) {
                return v;
            }
        }
        return -1;
    }
}
