package o;

import o.D80;

/* renamed from: o.eb2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6092eb2 implements InterfaceC7160ix0 {
    public static final float k = 10000.0f;
    public static final float l = 1500.0f;
    public static final float m = 200.0f;
    public static final float n = 50.0f;

    /* renamed from: o  reason: collision with root package name */
    public static final float f728o = 0.2f;
    public static final float p = 0.5f;
    public static final float q = 0.75f;
    public static final float r = 1.0f;
    public static final double s = 62.5d;
    public static final double t = Double.MAX_VALUE;
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final D80.p j;

    public C6092eb2() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new D80.p();
    }

    @Override // o.InterfaceC7160ix0
    public boolean a(float f, float f2) {
        if (Math.abs(f2) < this.e && Math.abs(f - d()) < this.d) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7160ix0
    public float b(float f, float f2) {
        float d = f - d();
        double d2 = this.a;
        return (float) (((-(d2 * d2)) * d) - (((d2 * 2.0d) * this.b) * f2));
    }

    public float c() {
        return (float) this.b;
    }

    public float d() {
        return (float) this.i;
    }

    public float e() {
        double d = this.a;
        return (float) (d * d);
    }

    public final void f() {
        if (this.c) {
            return;
        }
        if (this.i != Double.MAX_VALUE) {
            double d = this.b;
            if (d > 1.0d) {
                double d2 = this.a;
                this.f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.b;
                double d4 = this.a;
                this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.h = this.a * Math.sqrt(1.0d - (d * d));
            }
            this.c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public C6092eb2 g(float f) {
        if (f >= 0.0f) {
            this.b = f;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public C6092eb2 h(float f) {
        this.i = f;
        return this;
    }

    public C6092eb2 i(float f) {
        if (f > 0.0f) {
            this.a = Math.sqrt(f);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void j(double d) {
        double abs = Math.abs(d);
        this.d = abs;
        this.e = abs * 62.5d;
    }

    public D80.p k(double d, double d2, long j) {
        double pow;
        double cos;
        f();
        double d3 = j / 1000.0d;
        double d4 = d - this.i;
        double d5 = this.b;
        if (d5 > 1.0d) {
            double d6 = this.g;
            double d7 = this.f;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            pow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.f * d3) * d9);
            double d10 = this.g;
            double pow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.f;
            cos = pow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.a;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            pow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double pow3 = d14 * Math.pow(2.718281828459045d, (-this.a) * d3);
            double d15 = this.a;
            cos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (pow3 * (-d15));
        } else {
            double d16 = 1.0d / this.h;
            double d17 = this.a;
            double d18 = d16 * ((d5 * d17 * d4) + d2);
            pow = Math.pow(2.718281828459045d, (-d5) * d17 * d3) * ((Math.cos(this.h * d3) * d4) + (Math.sin(this.h * d3) * d18));
            double d19 = this.a;
            double d20 = this.b;
            double pow4 = Math.pow(2.718281828459045d, (-d20) * d19 * d3);
            double d21 = this.h;
            double sin = (-d21) * d4 * Math.sin(d21 * d3);
            double d22 = this.h;
            cos = ((-d19) * pow * d20) + (pow4 * (sin + (d18 * d22 * Math.cos(d22 * d3))));
        }
        D80.p pVar = this.j;
        pVar.a = (float) (pow + this.i);
        pVar.b = (float) cos;
        return pVar;
    }

    public C6092eb2(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new D80.p();
        this.i = f;
    }
}
