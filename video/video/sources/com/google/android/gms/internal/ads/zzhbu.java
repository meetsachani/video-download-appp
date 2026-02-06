package com.google.android.gms.internal.ads;

import com.facebook.internal.q0;
import java.nio.ByteBuffer;
import o.S9;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhbu {
    public static final zzhbr a;

    static {
        if (zzhbp.a() && zzhbp.b()) {
            int i = zzgwx.a;
        }
        a = new zzhbs();
    }

    public static /* bridge */ /* synthetic */ int c(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return k(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return j(b, bArr[i]);
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i7 <= i3 - 3) {
                bArr[i7] = (byte) ((charAt2 >>> '\f') | q0.n1);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            } else if (i7 <= i3 - 4) {
                int i8 = i6 + 1;
                if (i8 != str.length()) {
                    char charAt3 = str.charAt(i8);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int i9 = i7 + 3;
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 += 4;
                        bArr[i9] = (byte) ((codePoint & 63) | 128);
                        i6 = i8;
                    } else {
                        i6 = i8;
                    }
                }
                throw new zzhbt(i6 - 1, length);
            } else if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                throw new zzhbt(i6, length);
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
            }
            i6++;
        }
        return i7;
    }

    public static int e(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new zzhbt(i2, length2);
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

    public static int f(int i, byte[] bArr, int i2, int i3) {
        return a.a(i, bArr, i2, i3);
    }

    public static String g(ByteBuffer byteBuffer, int i, int i2) throws zzgzh {
        zzhbr zzhbrVar = a;
        if (byteBuffer.hasArray()) {
            return zzhbrVar.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (byteBuffer.isDirect()) {
            return zzhbr.c(byteBuffer, i, i2);
        } else {
            return zzhbr.c(byteBuffer, i, i2);
        }
    }

    public static String h(byte[] bArr, int i, int i2) throws zzgzh {
        return a.b(bArr, i, i2);
    }

    public static boolean i(byte[] bArr, int i, int i2) {
        if (a.a(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }

    public static int j(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int k(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
