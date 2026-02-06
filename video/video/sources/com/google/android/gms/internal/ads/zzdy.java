package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdy {
    public int a;
    public long[] b;

    public zzdy() {
        throw null;
    }

    public final int a() {
        return this.a;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        int i2 = this.a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public final void d(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, this.b, this.a, length);
        this.a = i2;
    }

    public zzdy(int i) {
        this.b = new long[i];
    }
}
