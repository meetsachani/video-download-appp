package o;

@InterfaceC7311ja0
/* renamed from: o.nn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8353nn0 extends AbstractC9149r2 {
    public static final InterfaceC9449sG0 X = new C8353nn0();
    public static final long Y = -4348849565147123417L;
    public static final long Y0 = -7286425919675154353L;
    public static final long Z = -5435081209227447693L;

    @InterfaceC5299bJ2
    public static long l(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return m(bArr, i, i2);
            }
            return o(bArr, i, i2);
        } else if (i2 <= 64) {
            return p(bArr, i, i2);
        } else {
            return q(bArr, i, i2);
        }
    }

    public static long m(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = (i2 * 2) + Y0;
            long b = A11.b(bArr, i) + Y0;
            long b2 = A11.b(bArr, (i + i2) - 8);
            return n((Long.rotateRight(b2, 37) * j) + b, (Long.rotateRight(b, 25) + b2) * j, j);
        } else if (i2 >= 4) {
            return n(i2 + ((A11.a(bArr, i) & 4294967295L) << 3), A11.a(bArr, (i + i2) - 4) & 4294967295L, (i2 * 2) + Y0);
        } else if (i2 <= 0) {
            return Y0;
        } else {
            return r((((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8)) * Y0) ^ ((i2 + ((bArr[i + (i2 - 1)] & 255) << 2)) * Y)) * Y0;
        }
    }

    public static long n(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long o(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + Y0;
        long b = A11.b(bArr, i) * Z;
        long b2 = A11.b(bArr, i + 8);
        int i3 = i + i2;
        long b3 = A11.b(bArr, i3 - 8) * j;
        return n(Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (A11.b(bArr, i3 - 16) * Y0), b + Long.rotateRight(b2 + Y0, 18) + b3, j);
    }

    public static long p(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) + Y0;
        long b = A11.b(bArr, i) * Y0;
        long b2 = A11.b(bArr, i + 8);
        int i3 = i + i2;
        long b3 = A11.b(bArr, i3 - 8) * j;
        long rotateRight = Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (A11.b(bArr, i3 - 16) * Y0);
        long n = n(rotateRight, b3 + Long.rotateRight(b2 + Y0, 18) + b, j);
        long b4 = A11.b(bArr, i + 16) * j;
        long b5 = A11.b(bArr, i + 24);
        long b6 = (rotateRight + A11.b(bArr, i3 - 32)) * j;
        return n(Long.rotateRight(b4 + b5, 43) + Long.rotateRight(b6, 30) + ((n + A11.b(bArr, i3 - 24)) * j), b4 + Long.rotateRight(b5 + b, 18) + b6, j);
    }

    public static long q(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long j = 81;
        long j2 = Z;
        long j3 = (j * Z) + 113;
        long r = r((j3 * Y0) + 113) * Y0;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c = 1;
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = i4 + i5;
        int i7 = i6 - 63;
        long j4 = j3;
        long b = (j * Y0) + A11.b(bArr, i);
        int i8 = i;
        while (true) {
            long j5 = j2;
            long rotateRight = (Long.rotateRight(((b + j4) + jArr[0]) + A11.b(bArr2, i8 + 8), 37) * j5) ^ jArr2[c];
            char c2 = c;
            long rotateRight2 = (Long.rotateRight(j4 + jArr[c] + A11.b(bArr2, i8 + 48), 42) * j5) + jArr[0] + A11.b(bArr2, i8 + 40);
            long rotateRight3 = Long.rotateRight(r + jArr2[0], 33) * j5;
            s(bArr2, i8, jArr[c2] * j5, rotateRight + jArr2[0], jArr);
            int i9 = i8;
            long[] jArr3 = jArr;
            s(bArr2, i9 + 32, jArr2[c2] + rotateRight3, rotateRight2 + A11.b(bArr2, i9 + 16), jArr2);
            i8 = i9 + 64;
            if (i8 == i4) {
                long j6 = ((rotateRight & 255) << c2) + j5;
                long j7 = jArr2[0] + i5;
                jArr2[0] = j7;
                long j8 = jArr3[0] + j7;
                jArr3[0] = j8;
                jArr2[0] = jArr2[0] + j8;
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr3[0]) + A11.b(bArr2, i6 - 55), 37) * j6) ^ (jArr2[c2] * 9);
                long rotateRight5 = (Long.rotateRight(rotateRight2 + jArr3[c2] + A11.b(bArr2, i6 - 15), 42) * j6) + (jArr3[0] * 9) + A11.b(bArr2, i6 - 23);
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j6;
                s(bArr2, i7, jArr3[c2] * j6, jArr2[0] + rotateRight4, jArr3);
                s(bArr2, i6 - 31, jArr2[c2] + rotateRight6, A11.b(bArr2, i6 - 47) + rotateRight5, jArr2);
                return n(n(jArr3[0], jArr2[0], j6) + (r(rotateRight5) * Y) + rotateRight4, n(jArr3[c2], jArr2[c2], j6) + rotateRight6, j6);
            }
            bArr2 = bArr;
            b = rotateRight3;
            j2 = j5;
            r = rotateRight;
            c = c2;
            j4 = rotateRight2;
            jArr = jArr3;
        }
    }

    public static long r(long j) {
        return j ^ (j >>> 47);
    }

    public static void s(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = A11.b(bArr, i);
        long b2 = A11.b(bArr, i + 8);
        long b3 = A11.b(bArr, i + 16);
        long b4 = A11.b(bArr, i + 24);
        long j3 = j + b;
        long j4 = b2 + j3 + b3;
        jArr[0] = j4 + b4;
        jArr[1] = Long.rotateRight(j2 + j3 + b4, 21) + Long.rotateRight(j4, 44) + j3;
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
        return "Hashing.farmHashFingerprint64()";
    }
}
