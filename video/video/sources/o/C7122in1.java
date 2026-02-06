package o;

/* renamed from: o.in1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7122in1 extends FR0 {
    public int e;

    public C7122in1() {
        this(0, 1, null);
    }

    public final boolean G(int i) {
        int i2 = this.d;
        this.b[L(i)] = i;
        if (this.d != i2) {
            return true;
        }
        return false;
    }

    public final boolean H(FR0 fr0) {
        C6562gT0.p(fr0, "elements");
        int i = this.d;
        U(fr0);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final boolean I(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        int i = this.d;
        V(iArr);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final void J() {
        int compare;
        if (this.c > 8) {
            compare = Long.compare(C9860tx2.n(C9860tx2.n(this.d) * 32) ^ Long.MIN_VALUE, C9860tx2.n(C9860tx2.n(this.c) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                Z();
                return;
            }
        }
        b0(YX1.w(this.c));
    }

    public final void K() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != YX1.e) {
            C4788Ye.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        N();
    }

    public final int L(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.c;
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
                int M = M(i4);
                if (this.e == 0 && ((this.a[M >> 3] >> ((M & 7) << 3)) & 255) != 254) {
                    J();
                    M = M(i4);
                }
                this.d++;
                int i15 = this.e;
                long[] jArr2 = this.a;
                int i16 = M >> 3;
                long j5 = jArr2[i16];
                int i17 = (M & 7) << 3;
                if (((j5 >> i17) & 255) == 128) {
                    i2 = i14;
                } else {
                    i2 = 0;
                }
                this.e = i15 - i2;
                jArr2[i16] = (j5 & (~(255 << i17))) | (j2 << i17);
                int i18 = this.c;
                int i19 = ((M - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j2 << i21);
                return M;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int M(int i) {
        int i2 = this.c;
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

    public final void N() {
        this.e = YX1.o(l()) - this.d;
    }

    public final void O(int i) {
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
        N();
    }

    public final void P(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.max(7, YX1.x(i));
        } else {
            i2 = 0;
        }
        this.c = i2;
        O(i2);
        this.b = new int[i2];
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
    public final void Q(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
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
            a0(i2);
        }
    }

    public final void R(FR0 fr0) {
        C6562gT0.p(fr0, "elements");
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
                            Q(iArr[(i << 3) + i3]);
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

    public final void S(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        for (int i : iArr) {
            Q(i);
        }
    }

    public final void T(int i) {
        this.b[L(i)] = i;
    }

    public final void U(FR0 fr0) {
        C6562gT0.p(fr0, "elements");
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
                            T(iArr[(i << 3) + i3]);
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

    public final void V(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        for (int i : iArr) {
            T(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.c;
        int i6 = (i3 >>> 7) & i5;
        boolean z = false;
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
            z = true;
        }
        if (z) {
            a0(i2);
        }
        return z;
    }

    public final boolean X(FR0 fr0) {
        C6562gT0.p(fr0, "elements");
        int i = this.d;
        R(fr0);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final boolean Y(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        int i = this.d;
        S(iArr);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final void Z() {
        long[] jArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.a;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this.c;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.e += i2;
    }

    public final void a0(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    public final void b0(int i) {
        long[] jArr;
        C7122in1 c7122in1 = this;
        long[] jArr2 = c7122in1.a;
        int[] iArr = c7122in1.b;
        int i2 = c7122in1.c;
        P(i);
        int[] iArr2 = c7122in1.b;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int hashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int M = c7122in1.M(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr3 = c7122in1.a;
                int i6 = M >> 3;
                int i7 = (M & 7) << 3;
                jArr3[i6] = ((~(255 << i7)) & jArr3[i6]) | (j << i7);
                int i8 = c7122in1.c;
                int i9 = ((M - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr = jArr2;
                jArr3[i10] = ((~(255 << i11)) & jArr3[i10]) | (j << i11);
                iArr2[M] = i4;
            } else {
                jArr = jArr2;
            }
            i3++;
            c7122in1 = this;
            jArr2 = jArr;
        }
    }

    public final int c0() {
        int i = this.c;
        int x = YX1.x(YX1.z(this.d));
        if (x < i) {
            b0(x);
            return i - this.c;
        }
        return 0;
    }

    public final void d0(int i, long j) {
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public /* synthetic */ C7122in1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C7122in1(int i) {
        super(null);
        if (i >= 0) {
            P(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
