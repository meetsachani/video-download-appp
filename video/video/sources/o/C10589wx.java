package o;

/* renamed from: o.wx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10589wx {
    public static final String a = "CameraOrientationUtil";

    public static int a(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return 3;
                    }
                    throw new IllegalStateException("Invalid sensor rotation: " + i);
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int b(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C7433k41.h(a)) {
            C7433k41.a(a, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C4731Xo.d1;
                    }
                    throw new IllegalArgumentException("Unsupported surface rotation: " + i);
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }
}
