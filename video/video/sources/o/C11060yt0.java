package o;

@InterfaceC7311ja0
/* renamed from: o.yt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11060yt0 extends AbstractC9149r2 {
    public static final InterfaceC9449sG0 X = new C11060yt0();
    public static final long Y = -6505348102511208375L;
    public static final long Y0 = -4288712594273399085L;
    public static final long Z = -8261664234251669945L;
    public static final long Z0 = -4132994306676758123L;

    @InterfaceC5299bJ2
    public static long l(byte[] bArr, int i, int i2) {
        long m;
        long j;
        if (i2 <= 32) {
            m = p(bArr, i, i2, -1397348546323613475L);
        } else if (i2 <= 64) {
            m = o(bArr, i, i2);
        } else {
            m = m(bArr, i, i2);
        }
        long j2 = Y;
        if (i2 >= 8) {
            j = A11.b(bArr, i);
        } else {
            j = -6505348102511208375L;
        }
        if (i2 >= 9) {
            j2 = A11.b(bArr, (i + i2) - 8);
        }
        long n = n(m + j2, j);
        if (n != 0 && n != 1) {
            return n;
        }
        return n - 2;
    }

    public static long m(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long b = A11.b(bArr, i);
        int i3 = i + i2;
        long b2 = A11.b(bArr2, i3 - 16) ^ Z;
        long b3 = Y ^ A11.b(bArr2, i3 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j = i2;
        r(bArr2, i3 - 64, j, b2, jArr);
        r(bArr2, i3 - 32, j * Z, Y, jArr2);
        long[] jArr3 = jArr2;
        long q = b3 + (q(jArr[1]) * Z);
        long rotateRight = Long.rotateRight(b + q, 39) * Z;
        int i4 = (i2 - 1) & (-64);
        long rotateRight2 = Long.rotateRight(b2, 33) * Z;
        long j2 = rotateRight;
        int i5 = i;
        while (true) {
            long rotateRight3 = Long.rotateRight(j2 + rotateRight2 + jArr[0] + A11.b(bArr2, i5 + 16), 37) * Z;
            long rotateRight4 = Long.rotateRight(rotateRight2 + jArr[1] + A11.b(bArr2, i5 + 48), 42) * Z;
            long j3 = jArr3[1] ^ rotateRight3;
            long j4 = rotateRight4 ^ jArr[0];
            long rotateRight5 = Long.rotateRight(jArr3[0] ^ q, 33);
            r(bArr2, i5, jArr[1] * Z, jArr3[0] + j3, jArr);
            int i6 = i5;
            long[] jArr4 = jArr3;
            rotateRight2 = j4;
            r(bArr, i6 + 32, jArr3[1] + rotateRight5, rotateRight2, jArr4);
            i5 = i6 + 64;
            i4 -= 64;
            if (i4 == 0) {
                return n(n(jArr[0], jArr4[0]) + (q(rotateRight2) * Z) + j3, n(jArr[1], jArr4[1]) + rotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j2 = rotateRight5;
            q = j3;
        }
    }

    @InterfaceC5299bJ2
    public static long n(long j, long j2) {
        long j3 = (j2 ^ j) * Z0;
        long j4 = (j ^ (j3 ^ (j3 >>> 47))) * Z0;
        return (j4 ^ (j4 >>> 47)) * Z0;
    }

    private static long o(byte[] bArr, int i, int i2) {
        long b = A11.b(bArr, i + 24);
        int i3 = i + i2;
        int i4 = i3 - 16;
        long b2 = A11.b(bArr, i) + ((i2 + A11.b(bArr, i4)) * Y);
        long rotateRight = Long.rotateRight(b2 + b, 52);
        long rotateRight2 = Long.rotateRight(b2, 37);
        long b3 = b2 + A11.b(bArr, i + 8);
        int i5 = i + 16;
        long b4 = b3 + A11.b(bArr, i5);
        long j = b + b4;
        long rotateRight3 = rotateRight + Long.rotateRight(b4, 31) + rotateRight2 + Long.rotateRight(b3, 7);
        long b5 = A11.b(bArr, i5) + A11.b(bArr, i3 - 32);
        long b6 = A11.b(bArr, i3 - 8);
        long rotateRight4 = Long.rotateRight(b5 + b6, 52);
        long rotateRight5 = Long.rotateRight(b5, 37);
        long b7 = b5 + A11.b(bArr, i3 - 24);
        long b8 = b7 + A11.b(bArr, i4);
        return q((q(((j + rotateRight4 + Long.rotateRight(b8, 31) + rotateRight5 + Long.rotateRight(b7, 7)) * Y0) + ((b6 + b8 + rotateRight3) * Y)) * Y) + rotateRight3) * Y0;
    }

    @InterfaceC5299bJ2
    public static long p(byte[] bArr, int i, int i2, long j) {
        int i3 = i2 & (-8);
        int i4 = i2 & 7;
        long j2 = j ^ (i2 * Z0);
        for (int i5 = 0; i5 < i3; i5 += 8) {
            j2 = (j2 ^ (q(A11.b(bArr, i + i5) * Z0) * Z0)) * Z0;
        }
        if (i4 != 0) {
            j2 = (A11.c(bArr, i + i3, i4) ^ j2) * Z0;
        }
        return q(q(j2) * Z0);
    }

    private static long q(long j) {
        return j ^ (j >>> 47);
    }

    private static void r(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = A11.b(bArr, i);
        long b2 = A11.b(bArr, i + 8);
        long b3 = A11.b(bArr, i + 16);
        long b4 = A11.b(bArr, i + 24);
        long j3 = j + b;
        long j4 = b2 + j3 + b3;
        jArr[0] = j4 + b4;
        jArr[1] = Long.rotateRight(j2 + j3 + b4, 51) + Long.rotateRight(j4, 23) + j3;
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return 64;
    }

    @Override // o.AbstractC9149r2, o.T0, o.InterfaceC9449sG0
    public AbstractC8471oG0 k(byte[] bArr, int i, int i2) {
        C10664xF1.f0(i, i + i2, bArr.length);
        return AbstractC8471oG0.j(l(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
