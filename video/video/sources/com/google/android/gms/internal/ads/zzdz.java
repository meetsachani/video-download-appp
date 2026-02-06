package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzdz {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public zzdz() {
        throw null;
    }

    public final long a() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public final long b() {
        int i = this.c;
        if (i != 0) {
            long[] jArr = this.d;
            int i2 = this.a;
            long j = jArr[i2];
            this.a = this.e & (i2 + 1);
            this.c = i - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    public final void c(long j) {
        int i = this.c;
        long[] jArr = this.d;
        int length = jArr.length;
        if (i == length) {
            int i2 = length + length;
            if (i2 >= 0) {
                long[] jArr2 = new long[i2];
                int i3 = this.a;
                int i4 = length - i3;
                System.arraycopy(jArr, i3, jArr2, 0, i4);
                System.arraycopy(this.d, 0, jArr2, i4, i3);
                this.a = 0;
                this.b = this.c - 1;
                this.d = jArr2;
                this.e = jArr2.length - 1;
                jArr = jArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.b + 1) & this.e;
        this.b = i5;
        jArr[i5] = j;
        this.c++;
    }

    public final void d() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public final boolean e() {
        return this.c == 0;
    }

    public zzdz(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i2 = highestOneBit + highestOneBit;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] jArr = new long[i2];
        this.d = jArr;
        this.e = jArr.length - 1;
    }
}
