package o;

/* renamed from: o.xk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10781xk0 {
    public static final float a = 0.5f;

    public static void a(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f * 2.0f) - 1.0f;
    }
}
