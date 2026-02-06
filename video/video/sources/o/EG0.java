package o;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class EG0 {
    public static final long a = -862048943;
    public static final long b = 461845907;
    public static final int c = 1073741824;

    public static int a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 > 0) {
                return i2;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    public static boolean b(int i, int i2, double d) {
        if (i > d * i2 && i2 < 1073741824) {
            return true;
        }
        return false;
    }

    public static int c(int i) {
        return (int) (Integer.rotateLeft((int) (i * a), 15) * b);
    }

    public static int d(@MB Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return c(hashCode);
    }
}
