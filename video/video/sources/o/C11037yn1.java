package o;

/* renamed from: o.yn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11037yn1<K> extends AbstractC7388jt1<K> {
    public int f;

    public C11037yn1() {
        this(0, 1, null);
    }

    public final void O() {
        int compare;
        if (this.d > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.e) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.d) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                h0();
                return;
            }
        }
        k0(YX1.w(this.d));
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
        C4788Ye.M1(this.b, null, 0, this.d);
        T();
    }

    public final int Q(int i) {
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

    public final int R(K k) {
        int i;
        int i2;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = i6;
            int i12 = i6;
            long j3 = j ^ (j2 * YX1.k);
            for (long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j4) >> 3)) & i7;
                if (C6562gT0.g(this.b[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int Q = Q(i5);
                if (this.f == 0 && ((this.a[Q >> 3] >> ((Q & 7) << 3)) & 255) != 254) {
                    O();
                    Q = Q(i5);
                }
                this.e++;
                int i13 = this.f;
                long[] jArr2 = this.a;
                int i14 = Q >> 3;
                long j5 = jArr2[i14];
                int i15 = (Q & 7) << 3;
                if (((j5 >> i15) & 255) == 128) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.f = i13 - i2;
                jArr2[i14] = (j5 & (~(255 << i15))) | (j2 << i15);
                int i16 = this.d;
                int i17 = ((Q - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j2 << i19);
                return ~Q;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
        }
    }

    public final int S(K k, FA0<Integer> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        int i = i(k);
        if (i >= 0) {
            return this.c[i];
        }
        int intValue = fa0.invoke().intValue();
        l0(k, intValue);
        return intValue;
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
        this.b = new Object[i2];
        this.c = new int[i2];
    }

    public final void W(Iterable<? extends K> iterable) {
        C6562gT0.p(iterable, "keys");
        for (K k : iterable) {
            f0(k);
        }
    }

    public final void X(K k) {
        f0(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(ZX1<K> zx1) {
        C6562gT0.p(zx1, "keys");
        Object[] objArr = zx1.b;
        long[] jArr = zx1.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            f0(objArr[(i << 3) + i3]);
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

    public final void Z(B02<? extends K> b02) {
        C6562gT0.p(b02, "keys");
        for (K k : b02) {
            f0(k);
        }
    }

    public final void a0(K[] kArr) {
        C6562gT0.p(kArr, "keys");
        for (K k : kArr) {
            f0(k);
        }
    }

    public final void b0(AbstractC7388jt1<K> abstractC7388jt1) {
        C6562gT0.p(abstractC7388jt1, "from");
        e0(abstractC7388jt1);
    }

    public final int c0(K k, int i, int i2) {
        int R = R(k);
        if (R < 0) {
            R = ~R;
        } else {
            i2 = this.c[R];
        }
        this.b[R] = k;
        this.c[R] = i;
        return i2;
    }

    public final void d0(K k, int i) {
        l0(k, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(AbstractC7388jt1<K> abstractC7388jt1) {
        C6562gT0.p(abstractC7388jt1, "from");
        Object[] objArr = abstractC7388jt1.b;
        int[] iArr = abstractC7388jt1.c;
        long[] jArr = abstractC7388jt1.a;
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
                            l0(objArr[i4], iArr[i4]);
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

    public final void f0(K k) {
        int i = i(k);
        if (i >= 0) {
            j0(i);
        }
    }

    public final boolean g0(K k, int i) {
        int i2 = i(k);
        if (i2 >= 0 && this.c[i2] == i) {
            j0(i2);
            return true;
        }
        return false;
    }

    public final void h0() {
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

    public final void i0(VA0<? super K, ? super Integer, Boolean> va0) {
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
                            if (va0.i(this.b[i4], Integer.valueOf(this.c[i4])).booleanValue()) {
                                j0(i4);
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

    public final void j0(int i) {
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
        this.b[i] = null;
    }

    public final void k0(int i) {
        int i2;
        int i3;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        int[] iArr = this.c;
        int i4 = this.d;
        V(i);
        Object[] objArr2 = this.b;
        int[] iArr2 = this.c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                if (obj != null) {
                    i3 = obj.hashCode();
                } else {
                    i3 = 0;
                }
                int i6 = i3 * (-862048943);
                int i7 = i6 ^ (i6 << 16);
                int Q = Q(i7 >>> 7);
                long j = i7 & 127;
                long[] jArr2 = this.a;
                int i8 = Q >> 3;
                int i9 = (Q & 7) << 3;
                i2 = i5;
                jArr2[i8] = (jArr2[i8] & (~(255 << i9))) | (j << i9);
                int i10 = this.d;
                int i11 = ((Q - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j << i13);
                objArr2[Q] = obj;
                iArr2[Q] = iArr[i2];
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
        }
    }

    public final void l0(K k, int i) {
        int R = R(k);
        if (R < 0) {
            R = ~R;
        }
        this.b[R] = k;
        this.c[R] = i;
    }

    public final int m0() {
        int i = this.d;
        int x = YX1.x(YX1.z(this.e));
        if (x < i) {
            k0(x);
            return i - this.d;
        }
        return 0;
    }

    public final void n0(int i, long j) {
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

    public /* synthetic */ C11037yn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C11037yn1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
