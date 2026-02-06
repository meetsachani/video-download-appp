package o;

/* loaded from: classes3.dex */
public final class E81 {
    public static final int a = 3;
    public static final int b = 3;
    public static final int c = 40;
    public static final int d = 10;

    public static int a(C5672cs c5672cs) {
        return b(c5672cs, true) + b(c5672cs, false);
    }

    public static int b(C5672cs c5672cs, boolean z) {
        int e;
        int d2;
        byte b2;
        if (z) {
            e = c5672cs.d();
        } else {
            e = c5672cs.e();
        }
        if (z) {
            d2 = c5672cs.e();
        } else {
            d2 = c5672cs.d();
        }
        byte[][] c2 = c5672cs.c();
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            byte b3 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < d2; i4++) {
                if (z) {
                    b2 = c2[i2][i4];
                } else {
                    b2 = c2[i4][i2];
                }
                if (b2 == b3) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b3 = b2;
                }
            }
            if (i3 >= 5) {
                i += i3 - 2;
            }
        }
        return i;
    }

    public static int c(C5672cs c5672cs) {
        byte[][] c2 = c5672cs.c();
        int e = c5672cs.e();
        int d2 = c5672cs.d();
        int i = 0;
        for (int i2 = 0; i2 < d2 - 1; i2++) {
            byte[] bArr = c2[i2];
            int i3 = 0;
            while (i3 < e - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    byte[] bArr2 = c2[i2 + 1];
                    if (b2 == bArr2[i3] && b2 == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    public static int d(C5672cs c5672cs) {
        byte[][] c2 = c5672cs.c();
        int e = c5672cs.e();
        int d2 = c5672cs.d();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            for (int i3 = 0; i3 < e; i3++) {
                byte[] bArr = c2[i2];
                int i4 = i3 + 6;
                if (i4 < e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (g(bArr, i3 - 4, i3) || g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < d2 && c2[i2][i3] == 1 && c2[i2 + 1][i3] == 0 && c2[i2 + 2][i3] == 1 && c2[i2 + 3][i3] == 1 && c2[i2 + 4][i3] == 1 && c2[i2 + 5][i3] == 0 && c2[i5][i3] == 1 && (h(c2, i3, i2 - 4, i2) || h(c2, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static int e(C5672cs c5672cs) {
        byte[][] c2 = c5672cs.c();
        int e = c5672cs.e();
        int d2 = c5672cs.d();
        int i = 0;
        for (int i2 = 0; i2 < d2; i2++) {
            byte[] bArr = c2[i2];
            for (int i3 = 0; i3 < e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int d3 = c5672cs.d() * c5672cs.e();
        return ((Math.abs((i << 1) - d3) * 10) / d3) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
