package o;

/* renamed from: o.Zm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4929Zm1<V> extends AbstractC10582wv0<V> {
    public int f;

    public C4929Zm1() {
        this(0, 1, null);
    }

    public final void O() {
        int compare;
        if (this.d > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.e) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.d) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                f0();
                return;
            }
        }
        i0(YX1.w(this.d));
    }

    public final void P() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != YX1.e) {
            C4788Ye.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        C4788Ye.M1(this.c, null, 0, this.d);
        T();
    }

    public final int Q(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i10 = i7;
            long j3 = j ^ (j2 * YX1.k);
            for (long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.b[numberOfTrailingZeros] == f) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int R = R(i3);
                if (this.f == 0 && ((this.a[R >> 3] >> ((R & 7) << 3)) & 255) != 254) {
                    O();
                    R = R(i3);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = R >> 3;
                long j5 = jArr2[i12];
                int i13 = (R & 7) << 3;
                if (((j5 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f = i11 - i;
                jArr2[i12] = (j5 & (~(255 << i13))) | (j2 << i13);
                int i14 = this.d;
                int i15 = ((R - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return R;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int R(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final V S(float f, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V n = n(f);
        if (n == null) {
            V invoke = fa0.invoke();
            j0(f, invoke);
            return invoke;
        }
        return n;
    }

    public final void T() {
        this.f = YX1.o(o()) - this.e;
    }

    public final void U(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = YX1.e;
        } else {
            long[] jArr2 = new long[((i + 15) & (-8)) >> 3];
            C4788Ye.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        T();
    }

    public final void V(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.max(7, YX1.x(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        U(i2);
        this.b = new float[i2];
        this.c = new Object[i2];
    }

    public final void W(float f) {
        d0(f);
    }

    public final void X(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "keys");
        float[] fArr = abstractC9115qv0.a;
        int i = abstractC9115qv0.b;
        for (int i2 = 0; i2 < i; i2++) {
            d0(fArr[i2]);
        }
    }

    public final void Y(AbstractC2697Cv0 abstractC2697Cv0) {
        C6562gT0.p(abstractC2697Cv0, "keys");
        float[] fArr = abstractC2697Cv0.b;
        long[] jArr = abstractC2697Cv0.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            d0(fArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Z(float[] fArr) {
        C6562gT0.p(fArr, "keys");
        for (float f : fArr) {
            d0(f);
        }
    }

    public final void a0(AbstractC10582wv0<V> abstractC10582wv0) {
        C6562gT0.p(abstractC10582wv0, "from");
        c0(abstractC10582wv0);
    }

    public final V b0(float f, V v) {
        int Q = Q(f);
        Object[] objArr = this.c;
        V v2 = (V) objArr[Q];
        this.b[Q] = f;
        objArr[Q] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(AbstractC10582wv0<V> abstractC10582wv0) {
        C6562gT0.p(abstractC10582wv0, "from");
        float[] fArr = abstractC10582wv0.b;
        Object[] objArr = abstractC10582wv0.c;
        long[] jArr = abstractC10582wv0.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            j0(fArr[i4], objArr[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V d0(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i >= 0) {
            return h0(i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(float f, V v) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[i] == f) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (i < 0 || !C6562gT0.g(this.c[i], v)) {
            return false;
        }
        h0(i);
        return true;
    }

    public final void f0() {
        long[] jArr = this.a;
        int i = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.a;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this.d;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.f += i2;
    }

    public final void g0(VA0<? super Float, ? super V, Boolean> va0) {
        C6562gT0.p(va0, "predicate");
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (va0.i(Float.valueOf(this.b[i4]), this.c[i4]).booleanValue()) {
                                h0(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final V h0(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void i0(int i) {
        long[] jArr;
        C4929Zm1<V> c4929Zm1 = this;
        long[] jArr2 = c4929Zm1.a;
        float[] fArr = c4929Zm1.b;
        Object[] objArr = c4929Zm1.c;
        int i2 = c4929Zm1.d;
        V(i);
        float[] fArr2 = c4929Zm1.b;
        Object[] objArr2 = c4929Zm1.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int hashCode = Float.hashCode(f) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int R = c4929Zm1.R(i4 >>> 7);
                long j = i4 & 127;
                long[] jArr3 = c4929Zm1.a;
                int i5 = R >> 3;
                int i6 = (R & 7) << 3;
                jArr3[i5] = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                int i7 = c4929Zm1.d;
                int i8 = ((R - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr = jArr2;
                jArr3[i9] = ((~(255 << i10)) & jArr3[i9]) | (j << i10);
                fArr2[R] = f;
                objArr2[R] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            c4929Zm1 = this;
            jArr2 = jArr;
        }
    }

    public final void j0(float f, V v) {
        int Q = Q(f);
        this.b[Q] = f;
        this.c[Q] = v;
    }

    public final int k0() {
        int i = this.d;
        int x = YX1.x(YX1.z(this.e));
        if (x < i) {
            i0(x);
            return i - this.d;
        }
        return 0;
    }

    public final void l0(int i, long j) {
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public /* synthetic */ C4929Zm1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C4929Zm1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
