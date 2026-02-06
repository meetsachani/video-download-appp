package o;

/* renamed from: o.tu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9848tu2 extends A90 {
    public final float X;
    public final boolean Y;

    public C9848tu2(float f, boolean z) {
        this.X = f;
        this.Y = z;
    }

    @Override // o.A90
    public void c(float f, float f2, float f3, @InterfaceC5670cr1 C4992a32 c4992a32) {
        if (this.Y) {
            c4992a32.n(f2 - (this.X * f3), 0.0f);
            float f4 = this.X;
            c4992a32.o(f2, f4 * f3, (f4 * f3) + f2, 0.0f);
            c4992a32.n(f, 0.0f);
            return;
        }
        float f5 = this.X;
        c4992a32.o(f2 - (f5 * f3), 0.0f, f2, (-f5) * f3);
        c4992a32.o(f2 + (this.X * f3), 0.0f, f, 0.0f);
    }
}
