package o;

/* renamed from: o.hu1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6908hu1 extends A90 {
    public final A90 X;
    public final float Y;

    public C6908hu1(@InterfaceC5670cr1 A90 a90, float f) {
        this.X = a90;
        this.Y = f;
    }

    @Override // o.A90
    public boolean b() {
        return this.X.b();
    }

    @Override // o.A90
    public void c(float f, float f2, float f3, @InterfaceC5670cr1 C4992a32 c4992a32) {
        this.X.c(f, f2 - this.Y, f3, c4992a32);
    }
}
