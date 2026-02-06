package o;

/* renamed from: o.tO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9726tO2 implements InterfaceC9483sO2 {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public C9726tO2(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // o.InterfaceC9483sO2
    public float a() {
        return this.b;
    }

    @Override // o.InterfaceC9483sO2
    public float b() {
        return this.d;
    }

    @Override // o.InterfaceC9483sO2
    public float c() {
        return this.c;
    }

    @Override // o.InterfaceC9483sO2
    public float d() {
        return this.a;
    }

    public final float e(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    public final float f(float f) {
        if (f == 1.0f) {
            return this.b;
        }
        if (f == 0.0f) {
            return this.c;
        }
        float f2 = this.b;
        float f3 = this.c;
        double d = 1.0f / f3;
        return (float) C9293rd1.c(1.0d / (d + (((1.0f / f2) - d) * f)), f3, f2);
    }

    public void g(float f) throws IllegalArgumentException {
        if (f <= 1.0f && f >= 0.0f) {
            this.d = f;
            this.a = f(f);
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }

    public void h(float f) throws IllegalArgumentException {
        if (f <= this.b && f >= this.c) {
            this.a = f;
            this.d = e(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.c + " , " + this.b + C6566gU0.g);
    }
}
