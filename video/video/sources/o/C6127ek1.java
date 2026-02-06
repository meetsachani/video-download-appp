package o;

import android.util.Pair;
import o.KZ1;

@Deprecated
/* renamed from: o.ek1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6127ek1 implements NZ1 {
    public final long[] d;
    public final long[] e;
    public final long f;

    public C6127ek1(long[] jArr, long[] jArr2, long j) {
        this.d = jArr;
        this.e = jArr2;
        this.f = j == C10323vs.b ? TD2.j1(jArr2[jArr2.length - 1]) : j;
    }

    public static C6127ek1 a(long j, C5885dk1 c5885dk1, long j2) {
        int length = c5885dk1.Z0.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += c5885dk1.Z + c5885dk1.Z0[i3];
            j3 += c5885dk1.Y0 + c5885dk1.a1[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C6127ek1(jArr, jArr2, j2);
    }

    public static Pair<Long, Long> b(long j, long[] jArr, long[] jArr2) {
        double d;
        int n = TD2.n(jArr, j, true, true);
        long j2 = jArr[n];
        long j3 = jArr2[n];
        int i = n + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // o.NZ1
    public long c(long j) {
        return TD2.j1(((Long) b(j, this.d, this.e).second).longValue());
    }

    @Override // o.KZ1
    public KZ1.a e(long j) {
        Pair<Long, Long> b = b(TD2.b2(TD2.x(j, 0L, this.f)), this.e, this.d);
        return new KZ1.a(new MZ1(TD2.j1(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }

    @Override // o.NZ1
    public long f() {
        return -1L;
    }

    @Override // o.KZ1
    public boolean h() {
        return true;
    }

    @Override // o.KZ1
    public long i() {
        return this.f;
    }
}
