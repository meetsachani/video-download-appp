package o;

import o.HT1;

/* renamed from: o.Xo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4731Xo extends A90 implements Cloneable {
    public static final int b1 = 90;
    public static final int c1 = 180;
    public static final int d1 = 270;
    public static final int e1 = 180;
    public static final float f1 = 1.75f;
    public float X;
    public float Y;
    public float Y0;
    public float Z;
    public float Z0;
    public float a1 = -1.0f;

    public C4731Xo(float f, float f2, float f3) {
        this.Y = f;
        this.X = f2;
        k(f3);
        this.Z0 = 0.0f;
    }

    @Override // o.A90
    public void c(float f, float f2, float f3, @InterfaceC5670cr1 C4992a32 c4992a32) {
        boolean z;
        float f4;
        float f5;
        float f6 = this.Z;
        if (f6 == 0.0f) {
            c4992a32.n(f, 0.0f);
            return;
        }
        float f7 = ((this.Y * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.X;
        float f9 = f2 + this.Z0;
        float f10 = (this.Y0 * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            c4992a32.n(f, 0.0f);
            return;
        }
        float f11 = this.a1;
        float f12 = f11 * f3;
        if (f11 != -1.0f && Math.abs((f11 * 2.0f) - f6) >= 0.1f) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f10;
            f5 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        c4992a32.n(f15, 0.0f);
        float f18 = f15 - f8;
        float f19 = f15 + f8;
        float f20 = f8 * 2.0f;
        c4992a32.a(f18, 0.0f, f19, f20, 270.0f, degrees);
        if (z2) {
            c4992a32.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f21 = this.Y;
            float f22 = f12 * 2.0f;
            float f23 = f21 + f22;
            float f24 = f9 - f7;
            c4992a32.a(f24, -(f12 + f21), f23 + f24, f21 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f9 + f7;
            float f26 = this.Y;
            c4992a32.n(f25 - ((f26 / 2.0f) + f12), f26 + f12);
            float f27 = this.Y;
            c4992a32.a(f25 - (f22 + f27), -(f12 + f27), f25, f27 + f12, 90.0f, f17 - 90.0f);
        }
        c4992a32.a(f16 - f8, 0.0f, f16 + f8, f20, 270.0f - degrees, degrees);
        c4992a32.n(f, 0.0f);
    }

    public float e() {
        return this.Y0;
    }

    public float f() {
        return this.a1;
    }

    public float g() {
        return this.Y;
    }

    public float h() {
        return this.X;
    }

    @HT1({HT1.a.Y})
    public float i() {
        return this.Z;
    }

    @HT1({HT1.a.Y})
    public float j() {
        return this.Z0;
    }

    public void k(@InterfaceC2501Av0(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.Y0 = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void l(float f) {
        this.a1 = f;
    }

    public void m(float f) {
        this.Y = f;
    }

    public void n(float f) {
        this.X = f;
    }

    @HT1({HT1.a.Y})
    public void o(float f) {
        this.Z = f;
    }

    public void p(float f) {
        this.Z0 = f;
    }
}
