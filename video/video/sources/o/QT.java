package o;

/* loaded from: classes3.dex */
public class QT extends ZP {
    public float a;

    public QT() {
        this.a = -1.0f;
    }

    @Override // o.ZP
    public void b(@InterfaceC5670cr1 C4992a32 c4992a32, float f, float f2, float f3) {
        float f4 = f3 * f2;
        c4992a32.r(0.0f, f4, 180.0f, 180.0f - f);
        double d = f4;
        c4992a32.n((float) (Math.sin(Math.toRadians(f)) * d), (float) (Math.sin(Math.toRadians(90.0f - f)) * d));
    }

    @Deprecated
    public QT(float f) {
        this.a = f;
    }
}
