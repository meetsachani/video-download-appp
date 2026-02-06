package o;

import java.util.Arrays;
import o.KZ1;

@Deprecated
/* renamed from: o.iC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6979iC implements KZ1 {
    public final int d;
    public final int[] e;
    public final long[] f;
    public final long[] g;
    public final long[] h;
    public final long i;

    public C6979iC(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.e = iArr;
        this.f = jArr;
        this.g = jArr2;
        this.h = jArr3;
        int length = iArr.length;
        this.d = length;
        if (length > 0) {
            this.i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.i = 0L;
        }
    }

    public int a(long j) {
        return TD2.n(this.h, j, true, true);
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        int a = a(j);
        MZ1 mz1 = new MZ1(this.h[a], this.f[a]);
        if (mz1.a < j && a != this.d - 1) {
            int i = a + 1;
            return new KZ1.a(mz1, new MZ1(this.h[i], this.f[i]));
        }
        return new KZ1.a(mz1);
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.i;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.d + ", sizes=" + Arrays.toString(this.e) + ", offsets=" + Arrays.toString(this.f) + ", timeUs=" + Arrays.toString(this.h) + ", durationsUs=" + Arrays.toString(this.g) + C9811tl1.d;
    }
}
