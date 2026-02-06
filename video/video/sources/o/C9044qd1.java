package o;

/* renamed from: o.qd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9044qd1 {
    public static float a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static float b(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((i5 * i5) + (i6 * i6));
    }

    public static int c(float f) {
        float f2;
        if (f < 0.0f) {
            f2 = -0.5f;
        } else {
            f2 = 0.5f;
        }
        return (int) (f + f2);
    }

    public static int d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
