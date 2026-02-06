package o;

import java.nio.ByteBuffer;
import o.S9;

/* loaded from: classes.dex */
public final class BD2 {
    public static final b a;
    public static final long b = -9187201950435737472L;
    public static final int c = 3;
    public static final int d = 0;
    public static final int e = -1;
    public static final int f = 16;

    /* loaded from: classes.dex */
    public static class a {
        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C9258rT0 {
            if (!m(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m(b3) && !m(b4)) {
                int r = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
                cArr[i] = l(r);
                cArr[i + 1] = q(r);
                return;
            }
            throw C9258rT0.d();
        }

        public static void i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static void j(byte b, byte b2, byte b3, char[] cArr, int i) throws C9258rT0 {
            if (!m(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m(b3)))) {
                cArr[i] = (char) (((b & C8077mf.q) << 12) | (r(b2) << 6) | r(b3));
                return;
            }
            throw C9258rT0.d();
        }

        public static void k(byte b, byte b2, char[] cArr, int i) throws C9258rT0 {
            if (b >= -62 && !m(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | r(b2));
                return;
            }
            throw C9258rT0.d();
        }

        public static char l(int i) {
            return (char) ((i >>> 10) + ED2.d);
        }

        public static boolean m(byte b) {
            if (b > -65) {
                return true;
            }
            return false;
        }

        public static boolean n(byte b) {
            if (b >= 0) {
                return true;
            }
            return false;
        }

        public static boolean o(byte b) {
            if (b < -16) {
                return true;
            }
            return false;
        }

        public static boolean p(byte b) {
            if (b < -32) {
                return true;
            }
            return false;
        }

        public static char q(int i) {
            return (char) ((i & 1023) + ED2.e);
        }

        public static int r(byte b) {
            return b & ED2.a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public static int m(ByteBuffer byteBuffer, int i, int i2) {
            int m = i + BD2.m(byteBuffer, i, i2);
            while (m < i2) {
                int i3 = m + 1;
                byte b = byteBuffer.get(m);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        m += 2;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return BD2.q(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = m + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || byteBuffer.get(i4) > -65))) {
                            return -1;
                        }
                        m += 3;
                    } else if (i3 >= i2 - 2) {
                        return BD2.q(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i5 = m + 2;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = m + 3;
                            if (byteBuffer.get(i5) <= -65) {
                                m += 4;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                } else {
                    m = i3;
                }
            }
            return 0;
        }

        public final String a(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0 {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return d(byteBuffer, i, i2);
            } else {
                return c(byteBuffer, i, i2);
            }
        }

        public abstract String b(byte[] bArr, int i, int i2) throws C9258rT0;

        public final String c(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = byteBuffer.get(i);
                    if (!a.n(b)) {
                        break;
                    }
                    i++;
                    a.i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (a.n(b2)) {
                        int i7 = i5 + 1;
                        a.i(b2, cArr, i5);
                        int i8 = i6;
                        while (i8 < i3) {
                            byte b3 = byteBuffer.get(i8);
                            if (!a.n(b3)) {
                                break;
                            }
                            i8++;
                            a.i(b3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i8;
                    } else if (a.p(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.k(b2, byteBuffer.get(i6), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (a.o(b2)) {
                        if (i6 < i3 - 1) {
                            int i9 = i + 2;
                            i += 3;
                            a.j(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i10 = i + 3;
                        i += 4;
                        a.h(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i10), cArr, i5);
                        i5 += 2;
                    } else {
                        throw C9258rT0.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        public abstract String d(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0;

        public abstract int e(CharSequence charSequence, byte[] bArr, int i, int i2);

        public final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(BD2.i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                h(charSequence, byteBuffer);
            } else {
                g(charSequence, byteBuffer);
            }
        }

        public final void g(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                    throw new d(i, length);
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

        public abstract void h(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean i(ByteBuffer byteBuffer, int i, int i2) {
            if (k(0, byteBuffer, i, i2) != 0) {
                return false;
            }
            return true;
        }

        public final boolean j(byte[] bArr, int i, int i2) {
            if (l(0, bArr, i, i2) != 0) {
                return false;
            }
            return true;
        }

        public final int k(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return l(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return o(i, byteBuffer, i2, i3);
            } else {
                return n(i, byteBuffer, i2, i3);
            }
        }

        public abstract int l(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
            if (r8.get(r7) > (-65)) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int n(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = byteBuffer.get(i2);
                        if (i6 >= i3) {
                            return BD2.o(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i4 = i2 + 1;
                        b5 = byteBuffer.get(i2);
                        if (i4 >= i3) {
                            return BD2.o(b2, b5);
                        }
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                        i4 = i2;
                    }
                    if (b == 0) {
                        int i7 = i4 + 1;
                        byte b6 = byteBuffer.get(i4);
                        if (i7 >= i3) {
                            return BD2.p(b2, b5, b6);
                        }
                        b = b6;
                        i4 = i7;
                    }
                    if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                    return -1;
                }
                i2 = i5;
            }
            return m(byteBuffer, i2, i3);
        }

        public abstract int o(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        public static int p(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return q(bArr, i, i2);
        }

        public static int q(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return BD2.r(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i += 3;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return BD2.r(bArr, i3, i2);
                    } else {
                        int i5 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        @Override // o.BD2.b
        public String b(byte[] bArr, int i, int i2) throws C9258rT0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!a.n(b)) {
                        break;
                    }
                    i++;
                    a.i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (a.n(b2)) {
                        int i7 = i5 + 1;
                        a.i(b2, cArr, i5);
                        int i8 = i6;
                        while (i8 < i3) {
                            byte b3 = bArr[i8];
                            if (!a.n(b3)) {
                                break;
                            }
                            i8++;
                            a.i(b3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i8;
                    } else if (a.p(b2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.k(b2, bArr[i6], cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (a.o(b2)) {
                        if (i6 < i3 - 1) {
                            int i9 = i + 2;
                            i += 3;
                            a.j(b2, bArr[i6], bArr[i9], cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i10 = i + 3;
                        i += 4;
                        a.h(b2, bArr[i6], bArr[i + 2], bArr[i10], cArr, i5);
                        i5 += 2;
                    } else {
                        throw C9258rT0.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // o.BD2.b
        public String d(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0 {
            return c(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // o.BD2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                    throw new d(i6 - 1, length);
                } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new d(i6, length);
                } else {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                }
                i6++;
            }
            return i7;
        }

        @Override // o.BD2.b
        public void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            g(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
            if (r8[r7] > (-65)) goto L51;
         */
        @Override // o.BD2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int l(int i, byte[] bArr, int i2, int i3) {
            byte b;
            int i4;
            int i5;
            if (i != 0) {
                if (i2 >= i3) {
                    return i;
                }
                byte b2 = (byte) i;
                if (b2 < -32) {
                    if (b2 >= -62) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else if (b2 < -16) {
                    byte b3 = (byte) (~(i >> 8));
                    if (b3 == 0) {
                        int i6 = i2 + 1;
                        byte b4 = bArr[i2];
                        if (i6 >= i3) {
                            return BD2.o(b2, b4);
                        }
                        i2 = i6;
                        b3 = b4;
                    }
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i5 = i2 + 1;
                    }
                    return -1;
                } else {
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        i4 = i2 + 1;
                        b5 = bArr[i2];
                        if (i4 >= i3) {
                            return BD2.o(b2, b5);
                        }
                        b = 0;
                    } else {
                        b = (byte) (i >> 16);
                        i4 = i2;
                    }
                    if (b == 0) {
                        int i7 = i4 + 1;
                        byte b6 = bArr[i4];
                        if (i7 >= i3) {
                            return BD2.p(b2, b5, b6);
                        }
                        b = b6;
                        i4 = i7;
                    }
                    if (b5 <= -65 && (((b2 << 28) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                    return -1;
                }
                i2 = i5;
            }
            return p(bArr, i2, i3);
        }

        @Override // o.BD2.b
        public int o(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return n(i, byteBuffer, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {
        public static boolean p() {
            if (TB2.S() && TB2.T()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int q(long j, int i) {
            int s = s(j, i);
            long j2 = j + s;
            int i2 = i - s;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j3 = j2 + 1;
                    b = TB2.y(j2);
                    if (b >= 0) {
                        i2--;
                        j2 = j3;
                    } else {
                        j2 = j3;
                        break;
                    }
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b < -32) {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 -= 2;
                    if (b < -62) {
                        break;
                    }
                    long j4 = 1 + j2;
                    if (TB2.y(j2) > -65) {
                        break;
                    }
                    j2 = j4;
                } else if (b < -16) {
                    if (i3 < 2) {
                        return u(j2, b, i3);
                    }
                    i2 -= 3;
                    long j5 = 1 + j2;
                    byte y = TB2.y(j2);
                    if (y > -65 || ((b == -32 && y < -96) || (b == -19 && y >= -96))) {
                        break;
                    }
                    j2 += 2;
                    if (TB2.y(j5) > -65) {
                        break;
                    }
                } else if (i3 < 3) {
                    return u(j2, b, i3);
                } else {
                    i2 -= 4;
                    long j6 = 1 + j2;
                    byte y2 = TB2.y(j2);
                    if (y2 > -65 || (((b << 28) + (y2 + 112)) >> 30) != 0) {
                        break;
                    }
                    long j7 = 2 + j2;
                    if (TB2.y(j6) > -65) {
                        break;
                    }
                    j2 += 3;
                    if (TB2.y(j7) > -65) {
                        break;
                    }
                }
            }
            return -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int r(byte[] bArr, long j, int i) {
            int t = t(bArr, j, i);
            int i2 = i - t;
            long j2 = j + t;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i2 <= 0) {
                        break;
                    }
                    long j3 = j2 + 1;
                    b = TB2.A(bArr, j2);
                    if (b >= 0) {
                        i2--;
                        j2 = j3;
                    } else {
                        j2 = j3;
                        break;
                    }
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (b < -32) {
                    if (i3 == 0) {
                        return b;
                    }
                    i2 -= 2;
                    if (b < -62) {
                        break;
                    }
                    long j4 = 1 + j2;
                    if (TB2.A(bArr, j2) > -65) {
                        break;
                    }
                    j2 = j4;
                } else if (b < -16) {
                    if (i3 < 2) {
                        return v(bArr, b, j2, i3);
                    }
                    i2 -= 3;
                    long j5 = 1 + j2;
                    byte A = TB2.A(bArr, j2);
                    if (A > -65 || ((b == -32 && A < -96) || (b == -19 && A >= -96))) {
                        break;
                    }
                    j2 += 2;
                    if (TB2.A(bArr, j5) > -65) {
                        break;
                    }
                } else if (i3 < 3) {
                    return v(bArr, b, j2, i3);
                } else {
                    i2 -= 4;
                    long j6 = 1 + j2;
                    byte A2 = TB2.A(bArr, j2);
                    if (A2 > -65 || (((b << 28) + (A2 + 112)) >> 30) != 0) {
                        break;
                    }
                    long j7 = 2 + j2;
                    if (TB2.A(bArr, j6) > -65) {
                        break;
                    }
                    j2 += 3;
                    if (TB2.A(bArr, j7) > -65) {
                        break;
                    }
                }
            }
            return -1;
        }

        public static int s(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (TB2.y(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (TB2.K(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        public static int t(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (TB2.A(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        public static int u(long j, int i, int i2) {
            if (i2 == 0) {
                return BD2.n(i);
            }
            if (i2 == 1) {
                return BD2.o(i, TB2.y(j));
            }
            if (i2 == 2) {
                return BD2.p(i, TB2.y(j), TB2.y(j + 1));
            }
            throw new AssertionError();
        }

        public static int v(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return BD2.n(i);
            }
            if (i2 == 1) {
                return BD2.o(i, TB2.A(bArr, j));
            }
            if (i2 == 2) {
                return BD2.p(i, TB2.A(bArr, j), TB2.A(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // o.BD2.b
        public String b(byte[] bArr, int i, int i2) throws C9258rT0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte A = TB2.A(bArr, i);
                    if (!a.n(A)) {
                        break;
                    }
                    i++;
                    a.i(A, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte A2 = TB2.A(bArr, i);
                    if (a.n(A2)) {
                        int i7 = i5 + 1;
                        a.i(A2, cArr, i5);
                        while (i6 < i3) {
                            byte A3 = TB2.A(bArr, i6);
                            if (!a.n(A3)) {
                                break;
                            }
                            i6++;
                            a.i(A3, cArr, i7);
                            i7++;
                        }
                        i5 = i7;
                        i = i6;
                    } else if (a.p(A2)) {
                        if (i6 < i3) {
                            i += 2;
                            a.k(A2, TB2.A(bArr, i6), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (a.o(A2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i + 2;
                            i += 3;
                            a.j(A2, TB2.A(bArr, i6), TB2.A(bArr, i8), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i + 3;
                        i += 4;
                        a.h(A2, TB2.A(bArr, i6), TB2.A(bArr, i + 2), TB2.A(bArr, i9), cArr, i5);
                        i5 += 2;
                    } else {
                        throw C9258rT0.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // o.BD2.b
        public String d(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                long i3 = TB2.i(byteBuffer) + i;
                long j = i2 + i3;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i3 < j) {
                    byte y = TB2.y(i3);
                    if (!a.n(y)) {
                        break;
                    }
                    i3++;
                    a.i(y, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i3 < j) {
                    long j2 = i3 + 1;
                    byte y2 = TB2.y(i3);
                    if (a.n(y2)) {
                        int i6 = i5 + 1;
                        a.i(y2, cArr, i5);
                        long j3 = j2;
                        while (j3 < j) {
                            byte y3 = TB2.y(j3);
                            if (!a.n(y3)) {
                                break;
                            }
                            j3++;
                            a.i(y3, cArr, i6);
                            i6++;
                        }
                        i5 = i6;
                        i3 = j3;
                    } else if (a.p(y2)) {
                        if (j2 < j) {
                            i3 += 2;
                            a.k(y2, TB2.y(j2), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (a.o(y2)) {
                        if (j2 < j - 1) {
                            long j4 = 2 + i3;
                            i3 += 3;
                            a.j(y2, TB2.y(j2), TB2.y(j4), cArr, i5);
                            i5++;
                        } else {
                            throw C9258rT0.d();
                        }
                    } else if (j2 < j - 2) {
                        long j5 = i3 + 3;
                        i3 += 4;
                        a.h(y2, TB2.y(j2), TB2.y(2 + i3), TB2.y(j5), cArr, i5);
                        i5 += 2;
                    } else {
                        throw C9258rT0.d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // o.BD2.b
        public int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length <= i2 && bArr.length - i2 >= i) {
                int i4 = 0;
                while (true) {
                    j = 1;
                    if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                        break;
                    }
                    TB2.d0(bArr, j4, (byte) charAt);
                    i4++;
                    j4 = 1 + j4;
                }
                if (i4 == length) {
                    return (int) j4;
                }
                while (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 < 128 && j4 < j5) {
                        TB2.d0(bArr, j4, (byte) charAt2);
                        j3 = j5;
                        j2 = j;
                        j4 += j;
                    } else if (charAt2 < 2048 && j4 <= j5 - 2) {
                        j2 = j;
                        long j6 = j4 + j2;
                        TB2.d0(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        TB2.d0(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j3 = j5;
                    } else {
                        j2 = j;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                            j3 = j5;
                            if (j4 <= j3 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        TB2.d0(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                        TB2.d0(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j7 = j4 + 3;
                                        TB2.d0(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j4 += 4;
                                        TB2.d0(bArr, j7, (byte) ((codePoint & 63) | 128));
                                        i4 = i5;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new d(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new d(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                            }
                        }
                        TB2.d0(bArr, j4, (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1));
                        long j8 = j4 + 2;
                        j3 = j5;
                        TB2.d0(bArr, j4 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j4 += 3;
                        TB2.d0(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    }
                    i4++;
                    j = j2;
                    j5 = j3;
                }
                return (int) j4;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }

        @Override // o.BD2.b
        public void h(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j;
            char c;
            long j2;
            long j3;
            long j4;
            int i;
            char c2;
            char charAt;
            long i2 = TB2.i(byteBuffer);
            long position = byteBuffer.position() + i2;
            long limit = byteBuffer.limit() + i2;
            int length = charSequence.length();
            if (length <= limit - position) {
                int i3 = 0;
                while (true) {
                    j = 1;
                    c = 128;
                    if (i3 >= length || (charAt = charSequence.charAt(i3)) >= 128) {
                        break;
                    }
                    TB2.b0(position, (byte) charAt);
                    i3++;
                    position = 1 + position;
                }
                if (i3 == length) {
                    byteBuffer.position((int) (position - i2));
                    return;
                }
                while (i3 < length) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < c && position < limit) {
                        TB2.b0(position, (byte) charAt2);
                        j3 = i2;
                        j4 = limit;
                        c2 = c;
                        position += j;
                        j2 = j;
                    } else {
                        j2 = j;
                        if (charAt2 < 2048 && position <= limit - 2) {
                            long j5 = position + j2;
                            TB2.b0(position, (byte) ((charAt2 >>> 6) | 960));
                            position += 2;
                            TB2.b0(j5, (byte) ((charAt2 & '?') | 128));
                            j3 = i2;
                            j4 = limit;
                        } else if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                            j3 = i2;
                            j4 = limit;
                            if (position <= j4 - 4) {
                                int i4 = i3 + 1;
                                if (i4 != length) {
                                    char charAt3 = charSequence.charAt(i4);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        TB2.b0(position, (byte) ((codePoint >>> 18) | 240));
                                        c2 = 128;
                                        TB2.b0(position + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = position + 3;
                                        TB2.b0(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        position += 4;
                                        TB2.b0(j6, (byte) ((codePoint & 63) | 128));
                                        i3 = i4;
                                    } else {
                                        i3 = i4;
                                    }
                                }
                                throw new d(i3 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i = i3 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i)))) {
                                throw new d(i3, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                            }
                        } else {
                            TB2.b0(position, (byte) ((charAt2 >>> '\f') | com.facebook.internal.q0.n1));
                            j3 = i2;
                            long j7 = position + 2;
                            j4 = limit;
                            TB2.b0(position + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                            position += 3;
                            TB2.b0(j7, (byte) ((charAt2 & '?') | 128));
                        }
                        c2 = 128;
                    }
                    i3++;
                    c = c2;
                    j = j2;
                    i2 = j3;
                    limit = j4;
                }
                byteBuffer.position((int) (position - i2));
                return;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
            if (o.TB2.A(r12, r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (o.TB2.A(r12, r0) > (-65)) goto L56;
         */
        @Override // o.BD2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int l(int i, byte[] bArr, int i2, int i3) {
            byte b;
            long j;
            if ((i2 | i3 | (bArr.length - i3)) >= 0) {
                long j2 = i2;
                long j3 = i3;
                if (i != 0) {
                    if (j2 >= j3) {
                        return i;
                    }
                    byte b2 = (byte) i;
                    if (b2 < -32) {
                        if (b2 >= -62) {
                            long j4 = 1 + j2;
                            if (TB2.A(bArr, j2) <= -65) {
                                j2 = j4;
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        byte b3 = (byte) (~(i >> 8));
                        if (b3 == 0) {
                            long j5 = j2 + 1;
                            b3 = TB2.A(bArr, j2);
                            if (j5 >= j3) {
                                return BD2.o(b2, b3);
                            }
                            j2 = j5;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            j = j2 + 1;
                        }
                        return -1;
                    }
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j6 = j2 + 1;
                        b4 = TB2.A(bArr, j2);
                        if (j6 >= j3) {
                            return BD2.o(b2, b4);
                        }
                        b = 0;
                        j2 = j6;
                    } else {
                        b = (byte) (i >> 16);
                    }
                    if (b == 0) {
                        long j7 = j2 + 1;
                        b = TB2.A(bArr, j2);
                        if (j7 >= j3) {
                            return BD2.p(b2, b4, b);
                        }
                        j2 = j7;
                    }
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                        j = j2 + 1;
                    }
                    return -1;
                    j2 = j;
                }
                return r(bArr, j2, (int) (j3 - j2));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            if (o.TB2.y(r0) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
            if (o.TB2.y(r0) > (-65)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
            if (o.TB2.y(r0) > (-65)) goto L55;
         */
        @Override // o.BD2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int o(int i, ByteBuffer byteBuffer, int i2, int i3) {
            byte b;
            long j;
            if ((i2 | i3 | (byteBuffer.limit() - i3)) >= 0) {
                long i4 = TB2.i(byteBuffer) + i2;
                long j2 = (i3 - i2) + i4;
                if (i != 0) {
                    if (i4 >= j2) {
                        return i;
                    }
                    byte b2 = (byte) i;
                    if (b2 < -32) {
                        if (b2 >= -62) {
                            j = 1 + i4;
                        }
                        return -1;
                    } else if (b2 < -16) {
                        byte b3 = (byte) (~(i >> 8));
                        if (b3 == 0) {
                            long j3 = i4 + 1;
                            b3 = TB2.y(i4);
                            if (j3 >= j2) {
                                return BD2.o(b2, b3);
                            }
                            i4 = j3;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            j = 1 + i4;
                        }
                        return -1;
                    } else {
                        byte b4 = (byte) (~(i >> 8));
                        if (b4 == 0) {
                            long j4 = i4 + 1;
                            b4 = TB2.y(i4);
                            if (j4 >= j2) {
                                return BD2.o(b2, b4);
                            }
                            b = 0;
                            i4 = j4;
                        } else {
                            b = (byte) (i >> 16);
                        }
                        if (b == 0) {
                            long j5 = i4 + 1;
                            b = TB2.y(i4);
                            if (j5 >= j2) {
                                return BD2.p(b2, b4, b);
                            }
                            i4 = j5;
                        }
                        if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                            j = 1 + i4;
                        }
                        return -1;
                    }
                    i4 = j;
                }
                return q(i4, (int) (j2 - i4));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    static {
        b cVar;
        if (e.p() && !T8.c()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        a = cVar;
    }

    public static String g(ByteBuffer byteBuffer, int i, int i2) throws C9258rT0 {
        return a.a(byteBuffer, i, i2);
    }

    public static String h(byte[] bArr, int i, int i2) throws C9258rT0 {
        return a.b(bArr, i, i2);
    }

    public static int i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.e(charSequence, bArr, i, i2);
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        a.f(charSequence, byteBuffer);
    }

    public static int k(CharSequence charSequence) {
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
                    i2 += l(charSequence, i);
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

    public static int l(CharSequence charSequence, int i) {
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
                        throw new d(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public static int m(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    public static int n(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int o(int i, int i2) {
        if (i <= -12 && i2 <= -65) {
            return i ^ (i2 << 8);
        }
        return -1;
    }

    public static int p(int i, int i2, int i3) {
        if (i <= -12 && i2 <= -65 && i3 <= -65) {
            return (i ^ (i2 << 8)) ^ (i3 << 16);
        }
        return -1;
    }

    public static int q(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return p(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
                }
                throw new AssertionError();
            }
            return o(i, byteBuffer.get(i2));
        }
        return n(i);
    }

    public static int r(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return p(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return o(b2, bArr[i]);
        }
        return n(b2);
    }

    public static boolean s(ByteBuffer byteBuffer) {
        return a.i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean t(byte[] bArr) {
        return a.j(bArr, 0, bArr.length);
    }

    public static boolean u(byte[] bArr, int i, int i2) {
        return a.j(bArr, i, i2);
    }

    public static int v(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return a.k(i, byteBuffer, i2, i3);
    }

    public static int w(int i, byte[] bArr, int i2, int i3) {
        return a.l(i, bArr, i2, i3);
    }
}
