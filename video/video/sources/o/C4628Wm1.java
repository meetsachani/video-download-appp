package o;

/* renamed from: o.Wm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4628Wm1 extends AbstractC7881lv0 {
    public int f;

    public C4628Wm1() {
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

    public final int R(float f) {
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
                int Q = Q(i3);
                if (this.f == 0 && ((this.a[Q >> 3] >> ((Q & 7) << 3)) & 255) != 254) {
                    O();
                    Q = Q(i3);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = Q >> 3;
                long j5 = jArr2[i12];
                int i13 = (Q & 7) << 3;
                if (((j5 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.f = i11 - i;
                jArr2[i12] = (j5 & (~(255 << i13))) | (j2 << i13);
                int i14 = this.d;
                int i15 = ((Q - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return ~Q;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int S(float f, FA0<Integer> fa0) {
        C6562gT0.p(fa0, "defaultValue");
        int i = i(f);
        if (i < 0) {
            int intValue = fa0.invoke().intValue();
            c0(f, intValue);
            return intValue;
        }
        return this.c[i];
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
        this.c = new int[i2];
    }

    public final void W(float f) {
        e0(f);
    }

    public final void X(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "keys");
        float[] fArr = abstractC9115qv0.a;
        int i = abstractC9115qv0.b;
        for (int i2 = 0; i2 < i; i2++) {
            e0(fArr[i2]);
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
                            e0(fArr[(i << 3) + i3]);
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
            e0(f);
        }
    }

    public final void a0(AbstractC7881lv0 abstractC7881lv0) {
        C6562gT0.p(abstractC7881lv0, "from");
        d0(abstractC7881lv0);
    }

    public final int b0(float f, int i, int i2) {
        int R = R(f);
        if (R < 0) {
            R = ~R;
        } else {
            i2 = this.c[R];
        }
        this.b[R] = f;
        this.c[R] = i;
        return i2;
    }

    public final void c0(float f, int i) {
        k0(f, i);
    }

    public final void d0(AbstractC7881lv0 abstractC7881lv0) {
        C6562gT0.p(abstractC7881lv0, "from");
        float[] fArr = abstractC7881lv0.b;
        int[] iArr = abstractC7881lv0.c;
        long[] jArr = abstractC7881lv0.a;
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
                            k0(fArr[i4], iArr[i4]);
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

    public final void e0(float f) {
        int i = i(f);
        if (i >= 0) {
            i0(i);
        }
    }

    public final boolean f0(float f, int i) {
        int i2 = i(f);
        if (i2 >= 0 && this.c[i2] == i) {
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

    public final void h0(VA0<? super Float, ? super Integer, Boolean> va0) {
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
                            if (va0.i(Float.valueOf(this.b[i4]), Integer.valueOf(this.c[i4])).booleanValue()) {
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
        C4628Wm1 c4628Wm1 = this;
        long[] jArr2 = c4628Wm1.a;
        float[] fArr = c4628Wm1.b;
        int[] iArr = c4628Wm1.c;
        int i2 = c4628Wm1.d;
        V(i);
        float[] fArr2 = c4628Wm1.b;
        int[] iArr2 = c4628Wm1.c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int hashCode = Float.hashCode(f) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int Q = c4628Wm1.Q(i4 >>> 7);
                long j = i4 & 127;
                long[] jArr3 = c4628Wm1.a;
                int i5 = Q >> 3;
                int i6 = (Q & 7) << 3;
                jArr3[i5] = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                int i7 = c4628Wm1.d;
                int i8 = ((Q - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr = jArr2;
                jArr3[i9] = ((~(255 << i10)) & jArr3[i9]) | (j << i10);
                fArr2[Q] = f;
                iArr2[Q] = iArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            c4628Wm1 = this;
            jArr2 = jArr;
        }
    }

    public final void k0(float f, int i) {
        int R = R(f);
        if (R < 0) {
            R = ~R;
        }
        this.b[R] = f;
        this.c[R] = i;
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

    public /* synthetic */ C4628Wm1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C4628Wm1(int i) {
        super(null);
        if (i >= 0) {
            V(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
