package o;

/* renamed from: o.an1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5169an1 extends AbstractC2697Cv0 {
    public int e;

    public C5169an1() {
        this(0, 1, null);
    }

    public final boolean G(float f) {
        int i = this.d;
        this.b[L(f)] = f;
        if (this.d != i) {
            return true;
        }
        return false;
    }

    public final boolean H(AbstractC2697Cv0 abstractC2697Cv0) {
        C6562gT0.p(abstractC2697Cv0, "elements");
        int i = this.d;
        U(abstractC2697Cv0);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final boolean I(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        int i = this.d;
        V(fArr);
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

    public final int L(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
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
                int M = M(i3);
                if (this.e == 0 && ((this.a[M >> 3] >> ((M & 7) << 3)) & 255) != 254) {
                    J();
                    M = M(i3);
                }
                this.d++;
                int i11 = this.e;
                long[] jArr2 = this.a;
                int i12 = M >> 3;
                long j5 = jArr2[i12];
                int i13 = (M & 7) << 3;
                if (((j5 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.e = i11 - i;
                jArr2[i12] = (j5 & (~(255 << i13))) | (j2 << i13);
                int i14 = this.c;
                int i15 = ((M - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return M;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
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
        this.b = new float[i2];
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
    public final void Q(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
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
            a0(i);
        }
    }

    public final void R(AbstractC2697Cv0 abstractC2697Cv0) {
        C6562gT0.p(abstractC2697Cv0, "elements");
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
                            Q(fArr[(i << 3) + i3]);
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

    public final void S(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        for (float f : fArr) {
            Q(f);
        }
    }

    public final void T(float f) {
        this.b[L(f)] = f;
    }

    public final void U(AbstractC2697Cv0 abstractC2697Cv0) {
        C6562gT0.p(abstractC2697Cv0, "elements");
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
                            T(fArr[(i << 3) + i3]);
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

    public final void V(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        for (float f : fArr) {
            T(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(float f) {
        int i;
        int hashCode = Float.hashCode(f) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = (i2 >>> 7) & i4;
        boolean z = false;
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
            z = true;
        }
        if (z) {
            a0(i);
        }
        return z;
    }

    public final boolean X(AbstractC2697Cv0 abstractC2697Cv0) {
        C6562gT0.p(abstractC2697Cv0, "elements");
        int i = this.d;
        R(abstractC2697Cv0);
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final boolean Y(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        int i = this.d;
        S(fArr);
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
        C5169an1 c5169an1 = this;
        long[] jArr2 = c5169an1.a;
        float[] fArr = c5169an1.b;
        int i2 = c5169an1.c;
        P(i);
        float[] fArr2 = c5169an1.b;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int hashCode = Float.hashCode(f) * (-862048943);
                int i4 = hashCode ^ (hashCode << 16);
                int M = c5169an1.M(i4 >>> 7);
                long j = i4 & 127;
                long[] jArr3 = c5169an1.a;
                int i5 = M >> 3;
                int i6 = (M & 7) << 3;
                jArr3[i5] = ((~(255 << i6)) & jArr3[i5]) | (j << i6);
                int i7 = c5169an1.c;
                int i8 = ((M - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr = jArr2;
                jArr3[i9] = ((~(255 << i10)) & jArr3[i9]) | (j << i10);
                fArr2[M] = f;
            } else {
                jArr = jArr2;
            }
            i3++;
            c5169an1 = this;
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

    public /* synthetic */ C5169an1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public C5169an1(int i) {
        super(null);
        if (i >= 0) {
            P(YX1.z(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
