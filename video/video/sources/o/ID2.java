package o;

import java.nio.ByteBuffer;
import o.CD2;
import o.S9;

/* loaded from: classes.dex */
public final class ID2 extends CD2 {

    /* loaded from: classes.dex */
    public static class a extends IllegalArgumentException {
        public a(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static int f(CharSequence charSequence) {
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
                    i2 += k(charSequence, i);
                    break;
                }
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + S9.c.M));
    }

    public static String g(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!CD2.a.g(b)) {
                    break;
                }
                i++;
                CD2.a.b(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (CD2.a.g(b2)) {
                    int i7 = i5 + 1;
                    CD2.a.b(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!CD2.a.g(b3)) {
                            break;
                        }
                        i8++;
                        CD2.a.b(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (CD2.a.i(b2)) {
                    if (i6 < i3) {
                        i += 2;
                        CD2.a.d(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (CD2.a.h(b2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i + 2;
                        i += 3;
                        CD2.a.c(b2, bArr[i6], bArr[i9], cArr, i5);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i10 = i + 3;
                    i += 4;
                    CD2.a.a(b2, bArr[i6], bArr[i + 2], bArr[i10], cArr, i5);
                    i5 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static String h(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!CD2.a.g(b)) {
                    break;
                }
                i++;
                CD2.a.b(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (CD2.a.g(b2)) {
                    int i7 = i5 + 1;
                    CD2.a.b(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!CD2.a.g(b3)) {
                            break;
                        }
                        i8++;
                        CD2.a.b(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (CD2.a.i(b2)) {
                    if (i6 < i3) {
                        i += 2;
                        CD2.a.d(b2, byteBuffer.get(i6), cArr, i5);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (CD2.a.h(b2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i + 2;
                        i += 3;
                        CD2.a.c(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i10 = i + 3;
                    i += 4;
                    CD2.a.a(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i7 <= i5 - 3) {
                bArr[i7] = (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1);
                int i9 = i7 + 2;
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else if (i7 <= i5 - 4) {
                int i10 = i6 + 1;
                if (i10 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i10);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i11 = i7 + 3;
                        bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 += 4;
                        bArr[i11] = (byte) ((codePoint & 63) | 128);
                        i6 = i10;
                    } else {
                        i6 = i10;
                    }
                }
                throw new a(i6 - 1, length);
            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                throw new a(i6, length);
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
            }
            i6++;
        }
        return i7;
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | CK1.x));
                    byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i3 = i + 1;
                if (i3 != length) {
                    try {
                        char charAt3 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i5 = position + 2;
                                try {
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    position += 3;
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                    i = i3;
                                } catch (IndexOutOfBoundsException unused3) {
                                    i = i3;
                                    position = i5;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                                }
                            } catch (IndexOutOfBoundsException unused4) {
                                position = i4;
                                i = i3;
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (byteBuffer.position() + Math.max(i, (position - byteBuffer.position()) + 1)));
                            }
                        } else {
                            i = i3;
                        }
                    } catch (IndexOutOfBoundsException unused5) {
                    }
                }
                throw new a(i, length);
            } else {
                int i6 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static int k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new a(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    @Override // o.CD2
    public String a(ByteBuffer byteBuffer, int i, int i2) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return g(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return h(byteBuffer, i, i2);
    }

    @Override // o.CD2
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        j(charSequence, byteBuffer);
    }

    @Override // o.CD2
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}
