package o;

/* renamed from: o.y81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10879y81 extends A90 {
    public final float X;

    public C10879y81(float f) {
        this.X = f - 0.001f;
    }

    @Override // o.A90
    public boolean b() {
        return true;
    }

    @Override // o.A90
    public void c(float f, float f2, float f3, @InterfaceC5670cr1 C4992a32 c4992a32) {
        float sqrt = (float) ((this.X * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.X, 2.0d) - Math.pow(sqrt, 2.0d));
        c4992a32.q(f2 - sqrt, ((float) (-((this.X * Math.sqrt(2.0d)) - this.X))) + sqrt2);
        c4992a32.n(f2, (float) (-((this.X * Math.sqrt(2.0d)) - this.X)));
        c4992a32.n(f2 + sqrt, ((float) (-((this.X * Math.sqrt(2.0d)) - this.X))) + sqrt2);
    }
}
