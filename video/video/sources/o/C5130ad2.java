package o;

/* renamed from: o.ad2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5130ad2 extends Abstractanimation.InterpolatorC5161al1 {
    public C5373bd2 a;
    public C6335fb2 b;
    public InterfaceC4890Zc2 c;

    public C5130ad2() {
        C5373bd2 c5373bd2 = new C5373bd2();
        this.a = c5373bd2;
        this.c = c5373bd2;
    }

    @Override // o.Abstractanimation.InterpolatorC5161al1
    public float a() {
        return this.c.a();
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        C5373bd2 c5373bd2 = this.a;
        this.c = c5373bd2;
        c5373bd2.f(f, f2, f3, f4, f5, f6);
    }

    public String c(String str, float f) {
        return this.c.c(str, f);
    }

    public float d(float f) {
        return this.c.b(f);
    }

    public boolean e() {
        return this.c.d();
    }

    public void f(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.b == null) {
            this.b = new C6335fb2();
        }
        C6335fb2 c6335fb2 = this.b;
        this.c = c6335fb2;
        c6335fb2.h(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // o.Abstractanimation.InterpolatorC5161al1, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
