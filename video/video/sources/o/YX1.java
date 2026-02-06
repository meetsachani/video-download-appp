package o;

/* loaded from: classes.dex */
public final class YX1 {
    public static final long a = -9187201950435737472L;
    public static final long b = 128;
    public static final long c = 254;
    public static final long d = 255;
    public static final int f = 8;
    public static final int g = 7;
    public static final int h = 6;
    public static final int j = -862048943;
    public static final long k = 72340172838076673L;
    public static final long l = -9187201950435737472L;
    public static final long[] e = {-9187201950435737345L, -1};
    public static final C3755Nn1 i = new C3755Nn1(0);

    public static final void A(long[] jArr, int i2, long j2) {
        C6562gT0.p(jArr, "data");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (j2 << i4) | (jArr[i3] & (~(255 << i4)));
    }

    public static final <K, V> XX1<K, V> a() {
        C3755Nn1 c3755Nn1 = i;
        C6562gT0.n(c3755Nn1, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return c3755Nn1;
    }

    public static final int b(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }

    public static final long f(long[] jArr, int i2) {
        C6562gT0.p(jArr, "metadata");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        return (((-i4) >> 63) & (jArr[i3 + 1] << (64 - i4))) | (jArr[i3] >>> i4);
    }

    public static final int g(int i2) {
        return i2 >>> 7;
    }

    public static final int h(int i2) {
        return i2 & 127;
    }

    public static final boolean i(long j2) {
        if (j2 != 0) {
            return true;
        }
        return false;
    }

    public static final int j(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i3 = i2 * (-862048943);
        return i3 ^ (i3 << 16);
    }

    public static final boolean k(long[] jArr, int i2) {
        C6562gT0.p(jArr, "metadata");
        if (((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 254) {
            return true;
        }
        return false;
    }

    public static final boolean l(long[] jArr, int i2) {
        C6562gT0.p(jArr, "metadata");
        if (((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) == 128) {
            return true;
        }
        return false;
    }

    public static final boolean m(long j2) {
        if (j2 < 128) {
            return true;
        }
        return false;
    }

    public static final boolean n(long[] jArr, int i2) {
        C6562gT0.p(jArr, "metadata");
        if (((jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255) < 128) {
            return true;
        }
        return false;
    }

    public static final int o(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int p(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }

    public static final long q(long j2) {
        return j2 & ((~j2) << 6) & (-9187201950435737472L);
    }

    public static final long r(long j2) {
        return j2 & ((~j2) << 7) & (-9187201950435737472L);
    }

    public static final long s(long j2, int i2) {
        long j3 = j2 ^ (i2 * k);
        return (~j3) & (j3 - k) & (-9187201950435737472L);
    }

    public static final <K, V> C3755Nn1<K, V> t() {
        return new C3755Nn1<>(0, 1, null);
    }

    public static final <K, V> C3755Nn1<K, V> u(C4180Rx1<? extends K, ? extends V>... c4180Rx1Arr) {
        C6562gT0.p(c4180Rx1Arr, "pairs");
        C3755Nn1<K, V> c3755Nn1 = new C3755Nn1<>(c4180Rx1Arr.length);
        c3755Nn1.j0(c4180Rx1Arr);
        return c3755Nn1;
    }

    public static final long v(long j2) {
        return j2 & (j2 - 1);
    }

    public static final int w(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final int x(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final long y(long[] jArr, int i2) {
        C6562gT0.p(jArr, "data");
        return (jArr[i2 >> 3] >> ((i2 & 7) << 3)) & 255;
    }

    public static final int z(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return i2 + ((i2 - 1) / 7);
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
