package com.google.android.gms.internal.measurement;

import o.C8077mf;
import o.S9;

/* loaded from: classes3.dex */
final class zzmh {
    public static final zzmi a;

    static {
        if (zzmg.w()) {
            zzmg.z();
        }
        a = new zzml();
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzmk(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + S9.c.M));
    }

    public static int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.b(charSequence, bArr, i, i2);
    }

    public static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b > -12 || b2 > -65 || b3 > -65) {
                        return -1;
                    }
                    return (b3 << C8077mf.r) ^ ((b2 << 8) ^ b);
                }
                throw new AssertionError();
            }
            byte b4 = bArr[i];
            if (b > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b;
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    public static boolean d(byte[] bArr) {
        return a.d(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) throws zzji {
        return a.c(bArr, i, i2);
    }

    public static boolean f(byte[] bArr, int i, int i2) {
        return a.d(bArr, i, i2);
    }
}
