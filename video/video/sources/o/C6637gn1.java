package o;

/* renamed from: o.gn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6637gn1 extends AbstractC9493sR0 {
    public int f;

    public C6637gn1() {
        this(0, 1, null);
    }

    public final void O() {
        int compare;
        if (this.d > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.e) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.d) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                g0();
                return;
            }
        }
        j0(YX1.w(this.d));
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

    public final int R(int i) {
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
                int Q = Q(i4);
                if (this.f == 0 && ((this.a[Q >> 3] >> ((Q & 7) << 3)) & 255) != 254) {
                    O();
                    Q = Q(i4);
                }
                this.e++;
                int i15 = this.f;
                long[] jArr2 = this.a;
                int i16 = Q >> 3;
                long j5 = jArr2[i16];
                int i17 = (Q & 7) << 3;
                if (((j5 >> i17) & 255) == 128) {
                    i2 = i14;
                } else {
                    i2 = 0;
                }
                this.f = i15 - i2;
                jArr2[i16] = (j5 & (~(255 << i17))) | (j2 << i17);
                int i18 = this.d;
                int i19 = ((Q - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j2 << i21);
                return ~Q;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final long S(int i, FA0<Long> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        int i2 = i(i);
        if (i2 < 0) {
            long longValue = fa0.invoke().longValue();
            c0(i, longValue);
            return longValue;
        }
        return this.c[i2];
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
        this.c = new long[i2];
    }

    public final void W(int i) {
        e0(i);
    }

    public final void X(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "keys");
        int[] iArr = abstractC9001qR0.a;
        int i = abstractC9001qR0.b;
        for (int i2 = 0; i2 < i; i2++) {
            e0(iArr[i2]);
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
                            e0(iArr[(i << 3) + i3]);
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
            e0(i);
        }
    }

    public final void a0(AbstractC9493sR0 abstractC9493sR0) {
        C6562gT0.p(abstractC9493sR0, "from");
        d0(abstractC9493sR0);
    }

    public final long b0(int i, long j, long j2) {
        int R = R(i);
        if (R < 0) {
            R = ~R;
        } else {
            j2 = this.c[R];
        }
        this.b[R] = i;
        this.c[R] = j;
        return j2;
    }

    public final void c0(int i, long j) {
        k0(i, j);
    }

    public final void d0(AbstractC9493sR0 abstractC9493sR0) {
        C6562gT0.p(abstractC9493sR0, "from");
        int[] iArr = abstractC9493sR0.b;
        long[] jArr = abstractC9493sR0.c;
        long[] jArr2 = abstractC9493sR0.a;
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
                            k0(iArr[i4], jArr[i4]);
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

    public final void e0(int i) {
        int i2 = i(i);
        if (i2 >= 0) {
            i0(i2);
        }
    }

    public final boolean f0(int i, long j) {
        int i2 = i(i);
        if (i2 >= 0 && this.c[i2] == j) {
            i0(i2);
            return true;
        }
        return false;
    }

    public final void g0() {
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

    public final void h0(VA0<? super Integer, ? super Long, Boolean> va0) {
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
                            if (va0.i(Integer.valueOf(this.b[i4]), Long.valueOf(this.c[i4])).booleanValue()) {
                                i0(i4);
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

    public final void i0(int i) {
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
    }

    public final void j0(int i) {
        long[] jArr;
        C6637gn1 c6637gn1 = this;
        long[] jArr2 = c6637gn1.a;
        int[] iArr = c6637gn1.b;
        long[] jArr3 = c6637gn1.c;
        int i2 = c6637gn1.d;
        V(i);
        int[] iArr2 = c6637gn1.b;
        long[] jArr4 = c6637gn1.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int hashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int Q = c6637gn1.Q(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr5 = c6637gn1.a;
                int i6 = Q >> 3;
                int i7 = (Q & 7) << 3;
                jArr5[i6] = (jArr5[i6] & (~(255 << i7))) | (j << i7);
                int i8 = c6637gn1.d;
                int i9 = ((Q - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr = jArr2;
                jArr5[i10] = ((~(255 << i11)) & jArr5[i10]) | (j << i11);
                iArr2[Q] = i4;
                jArr4[Q] = jArr3[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            c6637gn1 = this;
            jArr2 = jArr;
        }
    }

    public final void k0(int i, long j) {
        int R = R(i);
        if (R < 0) {
            R = ~R;
        }
        this.b[R] = i;
        this.c[R] = j;
    }

    public final int l0() {
        int i = this.d;
        int x = YX1.x(YX1.z(this.e));
        if (x < i) {
            j0(x);
            return i - this.d;
        }
        return 0;
    }

    public final void m0(int i, long j) {
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

    public /* synthetic */ C6637gn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C6637gn1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
