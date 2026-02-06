package o;

/* renamed from: o.hn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6880hn1<V> extends AbstractC10222vR0<V> {
    public int f;

    public C6880hn1() {
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

    public final int Q(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = 1;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = i5;
            int i12 = i8;
            long j3 = j ^ (j2 * YX1.k);
            long j4 = (~j3) & (j3 - YX1.k) & (-9187201950435737472L);
            while (j4 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i6;
                int i13 = i11;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j4 &= j4 - 1;
                i11 = i13;
            }
            int i14 = i11;
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int R = R(i4);
                if (this.f == 0 && ((this.a[R >> 3] >> ((R & 7) << 3)) & 255) != 254) {
                    O();
                    R = R(i4);
                }
                this.e++;
                int i15 = this.f;
                long[] jArr2 = this.a;
                int i16 = R >> 3;
                long j5 = jArr2[i16];
                int i17 = (R & 7) << 3;
                if (((j5 >> i17) & 255) == 128) {
                    i2 = i14;
                } else {
                    i2 = 0;
                }
                this.f = i15 - i2;
                jArr2[i16] = (j5 & (~(255 << i17))) | (j2 << i17);
                int i18 = this.d;
                int i19 = ((R - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j2 << i21);
                return R;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
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

    public final V S(int i, FA0<? extends V> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        V n = n(i);
        if (n == null) {
            V invoke = fa0.invoke();
            j0(i, invoke);
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
        this.b = new int[i2];
        this.c = new Object[i2];
    }

    public final void W(int i) {
        d0(i);
    }

    public final void X(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "keys");
        int[] iArr = abstractC9001qR0.a;
        int i = abstractC9001qR0.b;
        for (int i2 = 0; i2 < i; i2++) {
            d0(iArr[i2]);
        }
    }

    public final void Y(FR0 fr0) {
        C6562gT0.p(fr0, "keys");
        int[] iArr = fr0.b;
        long[] jArr = fr0.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            d0(iArr[(i << 3) + i3]);
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

    public final void Z(int[] iArr) {
        C6562gT0.p(iArr, "keys");
        for (int i : iArr) {
            d0(i);
        }
    }

    public final void a0(AbstractC10222vR0<V> abstractC10222vR0) {
        C6562gT0.p(abstractC10222vR0, "from");
        c0(abstractC10222vR0);
    }

    public final V b0(int i, V v) {
        int Q = Q(i);
        Object[] objArr = this.c;
        V v2 = (V) objArr[Q];
        this.b[Q] = i;
        objArr[Q] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(AbstractC10222vR0<V> abstractC10222vR0) {
        C6562gT0.p(abstractC10222vR0, "from");
        int[] iArr = abstractC10222vR0.b;
        Object[] objArr = abstractC10222vR0.c;
        long[] jArr = abstractC10222vR0.a;
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
                            j0(iArr[i4], objArr[i4]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V d0(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return h0(i2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(int i, V v) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * YX1.k) ^ j;
            long j3 = (~j2) & (j2 - YX1.k) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0 || !C6562gT0.g(this.c[i2], v)) {
            return false;
        }
        h0(i2);
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

    public final void g0(VA0<? super Integer, ? super V, Boolean> va0) {
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
                            if (va0.i(Integer.valueOf(this.b[i4]), this.c[i4]).booleanValue()) {
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
        C6880hn1<V> c6880hn1 = this;
        long[] jArr2 = c6880hn1.a;
        int[] iArr = c6880hn1.b;
        Object[] objArr = c6880hn1.c;
        int i2 = c6880hn1.d;
        V(i);
        int[] iArr2 = c6880hn1.b;
        Object[] objArr2 = c6880hn1.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int hashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int R = c6880hn1.R(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr3 = c6880hn1.a;
                int i6 = R >> 3;
                int i7 = (R & 7) << 3;
                jArr3[i6] = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                int i8 = c6880hn1.d;
                int i9 = ((R - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr = jArr2;
                jArr3[i10] = ((~(255 << i11)) & jArr3[i10]) | (j << i11);
                iArr2[R] = i4;
                objArr2[R] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            c6880hn1 = this;
            jArr2 = jArr;
        }
    }

    public final void j0(int i, V v) {
        int Q = Q(i);
        this.b[Q] = i;
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

    public /* synthetic */ C6880hn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C6880hn1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
