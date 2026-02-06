package o;

import o.S9;

@InterfaceC4238Sm
@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* loaded from: classes3.dex */
public final class DD2 {
    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt < 2048) {
                    i2 += (127 - charAt) >>> 31;
                    i++;
                } else {
                    i2 += b(charSequence, i);
                    break;
                }
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        long j = i2 + S9.c.M;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) != charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(f(i));
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public static boolean c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static boolean d(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        C10664xF1.f0(i, i3, bArr.length);
        while (i < i3) {
            if (bArr[i] < 0) {
                return e(bArr, i, i3);
            }
            i++;
        }
        return true;
    }

    public static boolean e(byte[] bArr, int i, int i2) {
        byte b;
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 != i2 && b2 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                } else if (b2 < -16) {
                    int i4 = i + 2;
                    if (i4 < i2 && (b = bArr[i3]) <= -65 && ((b2 != -32 || b >= -96) && (b2 != -19 || -96 > b))) {
                        i += 3;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                } else if (i + 3 >= i2) {
                    return false;
                } else {
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i + 3;
                        if (bArr[i5] <= -65) {
                            i += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return false;
                }
            }
            i = i3;
        }
        return true;
    }

    public static String f(int i) {
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        return sb.toString();
    }
}
