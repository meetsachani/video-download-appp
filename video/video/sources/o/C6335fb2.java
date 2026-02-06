package o;

import java.io.PrintStream;

/* renamed from: o.fb2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6335fb2 implements InterfaceC4890Zc2 {
    public static final double l = Double.MAX_VALUE;
    public double c;
    public double d;
    public double e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public double a = 0.5d;
    public boolean b = false;
    public int k = 0;

    @Override // o.InterfaceC4890Zc2
    public float a() {
        return 0.0f;
    }

    @Override // o.InterfaceC4890Zc2
    public float b(float f) {
        return this.h;
    }

    @Override // o.InterfaceC4890Zc2
    public String c(String str, float f) {
        return null;
    }

    @Override // o.InterfaceC4890Zc2
    public boolean d() {
        double d = this.g - this.d;
        double d2 = this.c;
        double d3 = this.h;
        if (Math.sqrt((((d3 * d3) * this.i) + ((d2 * d) * d)) / d2) <= this.j) {
            return true;
        }
        return false;
    }

    public final void e(double d) {
        if (d > 0.0d) {
            double d2 = this.c;
            double d3 = this.a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.i) * d) * 4.0d)) + 1.0d);
            double d4 = d / sqrt;
            int i = 0;
            while (i < sqrt) {
                float f = this.g;
                double d5 = this.d;
                float f2 = this.h;
                double d6 = d2;
                float f3 = this.i;
                double d7 = d3;
                double d8 = f2 + ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d);
                double d9 = ((((-((f + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / f3) * d4;
                double d10 = f2 + (d9 / 2.0d);
                float f4 = f2 + ((float) d9);
                this.h = f4;
                float f5 = f + ((float) (d10 * d4));
                this.g = f5;
                int i2 = this.k;
                if (i2 > 0) {
                    if (f5 < 0.0f && (i2 & 1) == 1) {
                        this.g = -f5;
                        this.h = -f4;
                    }
                    float f6 = this.g;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.g = 2.0f - f6;
                        this.h = -this.h;
                    }
                }
                i++;
                d2 = d6;
                d3 = d7;
            }
        }
    }

    public float f() {
        double d = this.c;
        return ((float) (((-d) * (this.g - this.d)) - (this.a * this.h))) / this.i;
    }

    public void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    @Override // o.InterfaceC4890Zc2
    public float getInterpolation(float f) {
        e(f - this.f);
        this.f = f;
        if (d()) {
            this.g = (float) this.d;
        }
        return this.g;
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.d = f2;
        this.a = f6;
        this.b = false;
        this.g = f;
        this.e = f3;
        this.c = f5;
        this.i = f4;
        this.j = f7;
        this.k = i;
        this.f = 0.0f;
    }
}
