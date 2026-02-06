package o;

@Deprecated
/* loaded from: classes2.dex */
public final class FJ2 {
    public static final int a = 1380533830;
    public static final int b = 1463899717;
    public static final int c = 1718449184;
    public static final int d = 1684108385;
    public static final int e = 1380333108;
    public static final int f = 1685272116;
    public static final int g = 1;
    public static final int h = 3;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 17;
    public static final int l = 65534;

    public static int a(int i2, int i3) {
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 != 65534) {
                    return 0;
                }
            } else if (i3 != 32) {
                return 0;
            } else {
                return 4;
            }
        }
        return TD2.u0(i3);
    }

    public static int b(int i2) {
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                return 3;
            }
            if (i2 != 536870912 && i2 != 805306368) {
                throw new IllegalArgumentException();
            }
            return 1;
        }
        return 1;
    }
}
