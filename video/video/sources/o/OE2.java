package o;

/* loaded from: classes.dex */
public class OE2 {
    public static String g = "VelocityMatrix";
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void a(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.c;
        float f8 = f5 + this.d;
        float f9 = f7 + (this.a * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.b * f6);
        float radians = (float) Math.toRadians(this.e);
        double radians2 = (float) Math.toRadians(this.f);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    public void b() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public void c(AbstractC8779pX0 abstractC8779pX0, float f) {
        if (abstractC8779pX0 != null) {
            this.e = abstractC8779pX0.c(f);
        }
    }

    public void d(AbstractC4678Xa2 abstractC4678Xa2, float f) {
        if (abstractC4678Xa2 != null) {
            this.e = abstractC4678Xa2.c(f);
            this.f = abstractC4678Xa2.a(f);
        }
    }

    public void e(AbstractC8779pX0 abstractC8779pX0, AbstractC8779pX0 abstractC8779pX02, float f) {
        if (abstractC8779pX0 != null) {
            this.a = abstractC8779pX0.c(f);
        }
        if (abstractC8779pX02 != null) {
            this.b = abstractC8779pX02.c(f);
        }
    }

    public void f(AbstractC4678Xa2 abstractC4678Xa2, AbstractC4678Xa2 abstractC4678Xa22, float f) {
        if (abstractC4678Xa2 != null) {
            this.a = abstractC4678Xa2.c(f);
        }
        if (abstractC4678Xa22 != null) {
            this.b = abstractC4678Xa22.c(f);
        }
    }

    public void g(AbstractC8779pX0 abstractC8779pX0, AbstractC8779pX0 abstractC8779pX02, float f) {
        if (abstractC8779pX0 != null) {
            this.c = abstractC8779pX0.c(f);
        }
        if (abstractC8779pX02 != null) {
            this.d = abstractC8779pX02.c(f);
        }
    }

    public void h(AbstractC4678Xa2 abstractC4678Xa2, AbstractC4678Xa2 abstractC4678Xa22, float f) {
        if (abstractC4678Xa2 != null) {
            this.c = abstractC4678Xa2.c(f);
        }
        if (abstractC4678Xa22 != null) {
            this.d = abstractC4678Xa22.c(f);
        }
    }
}
