package o;

import java.util.Arrays;

@Deprecated
/* renamed from: o.z41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11106z41 {
    public static final int c = 32;
    public int a;
    public long[] b;

    public C11106z41() {
        this(32);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public int c() {
        return this.a;
    }

    public long[] d() {
        return Arrays.copyOf(this.b, this.a);
    }

    public C11106z41(int i) {
        this.b = new long[i];
    }
}
