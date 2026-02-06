package o;

import java.util.Arrays;
import o.TD0;

/* renamed from: o.An  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2469An implements Cloneable {
    public final int X;
    public final int Y;
    public final int[] Y0;
    public final int Z;

    public C2469An(int i) {
        this(i, i);
    }

    public static C2469An n(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i2 < str.length()) {
                if (str.charAt(i2) != '\n' && str.charAt(i2) != '\r') {
                    if (str.substring(i2, str2.length() + i2).equals(str2)) {
                        i2 += str2.length();
                        zArr[i3] = true;
                    } else if (str.substring(i2, str3.length() + i2).equals(str3)) {
                        i2 += str3.length();
                        zArr[i3] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i2));
                    }
                    i3++;
                } else {
                    if (i3 > i4) {
                        if (i == -1) {
                            i = i3 - i4;
                        } else if (i3 - i4 != i) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i5++;
                        i4 = i3;
                    }
                    i2++;
                }
            }
            if (i3 > i4) {
                if (i == -1) {
                    i = i3 - i4;
                } else if (i3 - i4 != i) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i5++;
            }
            C2469An c2469An = new C2469An(i, i5);
            for (int i6 = 0; i6 < i3; i6++) {
                if (zArr[i6]) {
                    c2469An.q(i6 % i, i6 / i);
                }
            }
            return c2469An;
        }
        throw new IllegalArgumentException();
    }

    public static C2469An o(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        C2469An c2469An = new C2469An(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    c2469An.q(i2, i);
                }
            }
        }
        return c2469An;
    }

    public final String b(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.Y * (this.X + 1));
        for (int i = 0; i < this.Y; i++) {
            for (int i2 = 0; i2 < this.X; i2++) {
                if (f(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void c() {
        int length = this.Y0.length;
        for (int i = 0; i < length; i++) {
            this.Y0[i] = 0;
        }
    }

    /* renamed from: d */
    public C2469An clone() {
        return new C2469An(this.X, this.Y, this.Z, (int[]) this.Y0.clone());
    }

    public void e(int i, int i2) {
        int i3 = (i2 * this.Z) + (i / 32);
        int[] iArr = this.Y0;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2469An)) {
            return false;
        }
        C2469An c2469An = (C2469An) obj;
        if (this.X != c2469An.X || this.Y != c2469An.Y || this.Z != c2469An.Z || !Arrays.equals(this.Y0, c2469An.Y0)) {
            return false;
        }
        return true;
    }

    public boolean f(int i, int i2) {
        if (((this.Y0[(i2 * this.Z) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int[] g() {
        int length = this.Y0.length - 1;
        while (length >= 0 && this.Y0[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.Z;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.Y0[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int[] h() {
        int i = this.X;
        int i2 = this.Y;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.Y; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.Z;
                if (i6 < i7) {
                    int i8 = this.Y0[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 >= i && i4 >= i2) {
            return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
        }
        return null;
    }

    public int hashCode() {
        int i = this.X;
        return (((((((i * 31) + i) * 31) + this.Y) * 31) + this.Z) * 31) + Arrays.hashCode(this.Y0);
    }

    public int i() {
        return this.Y;
    }

    public C10792xn j(int i, C10792xn c10792xn) {
        if (c10792xn != null && c10792xn.m() >= this.X) {
            c10792xn.e();
        } else {
            c10792xn = new C10792xn(this.X);
        }
        int i2 = i * this.Z;
        for (int i3 = 0; i3 < this.Z; i3++) {
            c10792xn.s(i3 << 5, this.Y0[i2 + i3]);
        }
        return c10792xn;
    }

    public int k() {
        return this.Z;
    }

    public int[] l() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.Y0;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.Z;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public int m() {
        return this.X;
    }

    public void p() {
        int m = m();
        int i = i();
        C10792xn c10792xn = new C10792xn(m);
        C10792xn c10792xn2 = new C10792xn(m);
        for (int i2 = 0; i2 < (i + 1) / 2; i2++) {
            c10792xn = j(i2, c10792xn);
            int i3 = (i - 1) - i2;
            c10792xn2 = j(i3, c10792xn2);
            c10792xn.q();
            c10792xn2.q();
            s(i2, c10792xn2);
            s(i3, c10792xn);
        }
    }

    public void q(int i, int i2) {
        int i3 = (i2 * this.Z) + (i / 32);
        int[] iArr = this.Y0;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void r(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.Y && i5 <= this.X) {
                    while (i2 < i6) {
                        int i7 = this.Z * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.Y0;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public void s(int i, C10792xn c10792xn) {
        int[] j = c10792xn.j();
        int[] iArr = this.Y0;
        int i2 = this.Z;
        System.arraycopy(j, 0, iArr, i * i2, i2);
    }

    public String t(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return t("X ", TD0.a.Y0);
    }

    @Deprecated
    public String u(String str, String str2, String str3) {
        return b(str, str2, str3);
    }

    public void v(int i, int i2) {
        int i3 = (i2 * this.Z) + (i / 32);
        int[] iArr = this.Y0;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public void w(C2469An c2469An) {
        if (this.X == c2469An.m() && this.Y == c2469An.i() && this.Z == c2469An.k()) {
            C10792xn c10792xn = new C10792xn(this.X);
            for (int i = 0; i < this.Y; i++) {
                int i2 = this.Z * i;
                int[] j = c2469An.j(i, c10792xn).j();
                for (int i3 = 0; i3 < this.Z; i3++) {
                    int[] iArr = this.Y0;
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] ^ j[i3];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public C2469An(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.X = i;
            this.Y = i2;
            int i3 = (i + 31) / 32;
            this.Z = i3;
            this.Y0 = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public C2469An(int i, int i2, int i3, int[] iArr) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = iArr;
    }
}
