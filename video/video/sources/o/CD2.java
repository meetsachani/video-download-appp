package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class CD2 {
    public static CD2 a;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (!f(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !f(b3) && !f(b4)) {
                int k = ((b & 7) << 18) | (k(b2) << 12) | (k(b3) << 6) | k(b4);
                cArr[i] = e(k);
                cArr[i + 1] = j(k);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static void c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (!f(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !f(b3)))) {
                cArr[i] = (char) (((b & C8077mf.q) << 12) | (k(b2) << 6) | k(b3));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b >= -62) {
                if (!f(b2)) {
                    cArr[i] = (char) (((b & 31) << 6) | k(b2));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        public static char e(int i) {
            return (char) ((i >>> 10) + ED2.d);
        }

        public static boolean f(byte b) {
            if (b > -65) {
                return true;
            }
            return false;
        }

        public static boolean g(byte b) {
            if (b >= 0) {
                return true;
            }
            return false;
        }

        public static boolean h(byte b) {
            if (b < -16) {
                return true;
            }
            return false;
        }

        public static boolean i(byte b) {
            if (b < -32) {
                return true;
            }
            return false;
        }

        public static char j(int i) {
            return (char) ((i & 1023) + ED2.e);
        }

        public static int k(byte b) {
            return b & ED2.a;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IllegalArgumentException {
        public b(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static CD2 d() {
        if (a == null) {
            a = new ID2();
        }
        return a;
    }

    public static void e(CD2 cd2) {
        a = cd2;
    }

    public abstract String a(ByteBuffer byteBuffer, int i, int i2);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
