package o;

/* renamed from: o.qn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9084qn1<V> extends S41<V> {
    public int f;

    public C9084qn1() {
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

    public final int Q(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
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
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = i4;
            int i10 = i7;
            long j4 = j2 ^ (j3 * YX1.k);
            for (long j5 = (~j4) & (j4 - YX1.k) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int R = R(i3);
                if (this.f == 0 && ((this.a[R >> 3] >> ((R & 7) << 3)) & 255) != 254) {
                    O();
                    R = R(i3);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = R >> 3;
                long j6 = jArr2[i12];
                int i13 = (R & 7) << 3;
                if (((j6 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f = i11 - i;
                jArr2[i12] = (j6 & (~(255 << i13))) | (j3 << i13);
                int i14 = this.d;
                int i15 = ((R - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j3 << i17);
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

    public final V S(long j, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V n = n(j);
        if (n == null) {
            V invoke = fa0.invoke();
            j0(j, invoke);
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
        this.b = new long[i2];
        this.c = new Object[i2];
    }

    public final void W(long j) {
        d0(j);
    }

    public final void X(L41 l41) {
        C6562gT0.p(l41, "keys");
        long[] jArr = l41.a;
        int i = l41.b;
        for (int i2 = 0; i2 < i; i2++) {
            d0(jArr[i2]);
        }
    }

    public final void Y(AbstractC4999a51 abstractC4999a51) {
        C6562gT0.p(abstractC4999a51, "keys");
        long[] jArr = abstractC4999a51.b;
        long[] jArr2 = abstractC4999a51.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            d0(jArr[(i << 3) + i3]);
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

    public final void Z(long[] jArr) {
        C6562gT0.p(jArr, "keys");
        for (long j : jArr) {
            d0(j);
        }
    }

    public final void a0(S41<V> s41) {
        C6562gT0.p(s41, "from");
        c0(s41);
    }

    public final V b0(long j, V v) {
        int Q = Q(j);
        Object[] objArr = this.c;
        V v2 = (V) objArr[Q];
        this.b[Q] = j;
        objArr[Q] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(S41<V> s41) {
        C6562gT0.p(s41, "from");
        long[] jArr = s41.b;
        Object[] objArr = s41.c;
        long[] jArr2 = s41.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            j0(jArr[i4], objArr[i4]);
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
    public final V d0(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * YX1.k) ^ j2;
            long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
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
    public final boolean e0(long j, V v) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * YX1.k) ^ j2;
            long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
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

    public final void g0(VA0<? super Long, ? super V, Boolean> va0) {
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
                            if (va0.i(Long.valueOf(this.b[i4]), this.c[i4]).booleanValue()) {
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
        C9084qn1<V> c9084qn1 = this;
        long[] jArr2 = c9084qn1.a;
        long[] jArr3 = c9084qn1.b;
        Object[] objArr = c9084qn1.c;
        int i2 = c9084qn1.d;
        V(i);
        long[] jArr4 = c9084qn1.b;
        Object[] objArr2 = c9084qn1.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int hashCode = Long.hashCode(j) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int R = c9084qn1.R(i4 >>> 7);
                long j2 = i4 & 127;
                long[] jArr5 = c9084qn1.a;
                int i5 = R >> 3;
                int i6 = (R & 7) << 3;
                jArr5[i5] = (jArr5[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = c9084qn1.d;
                int i8 = ((R - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr = jArr2;
                jArr5[i9] = (jArr5[i9] & (~(255 << i10))) | (j2 << i10);
                jArr4[R] = j;
                objArr2[R] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            c9084qn1 = this;
            jArr2 = jArr;
        }
    }

    public final void j0(long j, V v) {
        int Q = Q(j);
        this.b[Q] = j;
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

    public /* synthetic */ C9084qn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C9084qn1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
