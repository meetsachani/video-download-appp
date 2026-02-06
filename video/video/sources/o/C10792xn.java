package o;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: o.xn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10792xn implements Cloneable {
    public int[] X;
    public int Y;

    public C10792xn() {
        this.Y = 0;
        this.X = new int[1];
    }

    public static int[] p(int i) {
        return new int[(i + 31) / 32];
    }

    public void b(boolean z) {
        g(this.Y + 1);
        if (z) {
            int[] iArr = this.X;
            int i = this.Y;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.Y++;
    }

    public void c(C10792xn c10792xn) {
        int i = c10792xn.Y;
        g(this.Y + i);
        for (int i2 = 0; i2 < i; i2++) {
            b(c10792xn.i(i2));
        }
    }

    public void d(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            g(this.Y + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                b(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public void e() {
        int length = this.X.length;
        for (int i = 0; i < length; i++) {
            this.X[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10792xn)) {
            return false;
        }
        C10792xn c10792xn = (C10792xn) obj;
        if (this.Y != c10792xn.Y || !Arrays.equals(this.X, c10792xn.X)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C10792xn clone() {
        return new C10792xn((int[]) this.X.clone(), this.Y);
    }

    public final void g(int i) {
        if (i > (this.X.length << 5)) {
            int[] p = p(i);
            int[] iArr = this.X;
            System.arraycopy(iArr, 0, p, 0, iArr.length);
            this.X = p;
        }
    }

    public void h(int i) {
        int[] iArr = this.X;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    public int hashCode() {
        return (this.Y * 31) + Arrays.hashCode(this.X);
    }

    public boolean i(int i) {
        if (((1 << (i & 31)) & this.X[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public int[] j() {
        return this.X;
    }

    public int k(int i) {
        int i2 = this.Y;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.X[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.X;
            if (i3 == iArr.length) {
                return this.Y;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.Y;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int l(int i) {
        int i2 = this.Y;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.X[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.X;
            if (i3 == iArr.length) {
                return this.Y;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.Y;
        if (numberOfTrailingZeros > i5) {
            return i5;
        }
        return numberOfTrailingZeros;
    }

    public int m() {
        return this.Y;
    }

    public int n() {
        return (this.Y + 7) / 8;
    }

    public boolean o(int i, int i2, boolean z) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.Y) {
            if (i2 == i) {
                return true;
            }
            int i4 = i2 - 1;
            int i5 = i / 32;
            int i6 = i4 / 32;
            for (int i7 = i5; i7 <= i6; i7++) {
                int i8 = 31;
                if (i7 > i5) {
                    i3 = 0;
                } else {
                    i3 = i & 31;
                }
                if (i7 >= i6) {
                    i8 = 31 & i4;
                }
                int i9 = (2 << i8) - (1 << i3);
                int i10 = this.X[i7] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public void q() {
        int[] iArr = new int[this.X.length];
        int i = (this.Y - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.X[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.Y;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.X = iArr;
    }

    public void r(int i) {
        int[] iArr = this.X;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public void s(int i, int i2) {
        this.X[i / 32] = i2;
    }

    public void t(int i, int i2) {
        int i3;
        if (i2 >= i && i >= 0 && i2 <= this.Y) {
            if (i2 != i) {
                int i4 = i2 - 1;
                int i5 = i / 32;
                int i6 = i4 / 32;
                for (int i7 = i5; i7 <= i6; i7++) {
                    int i8 = 31;
                    if (i7 > i5) {
                        i3 = 0;
                    } else {
                        i3 = i & 31;
                    }
                    if (i7 >= i6) {
                        i8 = 31 & i4;
                    }
                    int i9 = (2 << i8) - (1 << i3);
                    int[] iArr = this.X;
                    iArr[i7] = i9 | iArr[i7];
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        char c;
        int i = this.Y;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.Y; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (i(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public void u(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (i(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public void v(C10792xn c10792xn) {
        if (this.Y == c10792xn.Y) {
            int i = 0;
            while (true) {
                int[] iArr = this.X;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ c10792xn.X[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public C10792xn(int i) {
        this.Y = i;
        this.X = p(i);
    }

    public C10792xn(int[] iArr, int i) {
        this.X = iArr;
        this.Y = i;
    }
}
