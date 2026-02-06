package o;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.v01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10115v01 {

    /* renamed from: o.v01$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public final double a;
        public final double b;

        public AbstractC10115v01 a(double d, double d2) {
            boolean z;
            boolean z2 = false;
            if (C10866y50.d(d) && C10866y50.d(d2)) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.d(z);
            double d3 = this.a;
            if (d == d3) {
                if (d2 != this.b) {
                    z2 = true;
                }
                C10664xF1.d(z2);
                return new e(this.a);
            }
            return b((d2 - this.b) / (d - d3));
        }

        public AbstractC10115v01 b(double d) {
            C10664xF1.d(!Double.isNaN(d));
            if (C10866y50.d(d)) {
                return new d(d, this.b - (this.a * d));
            }
            return new e(this.a);
        }

        public b(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    public static AbstractC10115v01 a() {
        return c.a;
    }

    public static AbstractC10115v01 b(double d2) {
        C10664xF1.d(C10866y50.d(d2));
        return new d(0.0d, d2);
    }

    public static b f(double d2, double d3) {
        boolean z;
        if (C10866y50.d(d2) && C10866y50.d(d3)) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        return new b(d2, d3);
    }

    public static AbstractC10115v01 i(double d2) {
        C10664xF1.d(C10866y50.d(d2));
        return new e(d2);
    }

    public abstract AbstractC10115v01 c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double d2);

    /* renamed from: o.v01$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC10115v01 {
        public final double a;
        @MB
        @SY0
        public AbstractC10115v01 b;

        public e(double d) {
            this.a = d;
            this.b = null;
        }

        private AbstractC10115v01 j() {
            return new d(0.0d, this.a, this);
        }

        @Override // o.AbstractC10115v01
        public AbstractC10115v01 c() {
            AbstractC10115v01 abstractC10115v01 = this.b;
            if (abstractC10115v01 == null) {
                AbstractC10115v01 j = j();
                this.b = j;
                return j;
            }
            return abstractC10115v01;
        }

        @Override // o.AbstractC10115v01
        public boolean d() {
            return false;
        }

        @Override // o.AbstractC10115v01
        public boolean e() {
            return true;
        }

        @Override // o.AbstractC10115v01
        public double g() {
            throw new IllegalStateException();
        }

        @Override // o.AbstractC10115v01
        public double h(double d) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.a));
        }

        public e(double d, AbstractC10115v01 abstractC10115v01) {
            this.a = d;
            this.b = abstractC10115v01;
        }
    }

    /* renamed from: o.v01$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC10115v01 {
        public final double a;
        public final double b;
        @MB
        @SY0
        public AbstractC10115v01 c;

        public d(double d, double d2) {
            this.a = d;
            this.b = d2;
            this.c = null;
        }

        @Override // o.AbstractC10115v01
        public AbstractC10115v01 c() {
            AbstractC10115v01 abstractC10115v01 = this.c;
            if (abstractC10115v01 == null) {
                AbstractC10115v01 j = j();
                this.c = j;
                return j;
            }
            return abstractC10115v01;
        }

        @Override // o.AbstractC10115v01
        public boolean d() {
            if (this.a == 0.0d) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC10115v01
        public boolean e() {
            return false;
        }

        @Override // o.AbstractC10115v01
        public double g() {
            return this.a;
        }

        @Override // o.AbstractC10115v01
        public double h(double d) {
            return (d * this.a) + this.b;
        }

        public final AbstractC10115v01 j() {
            double d = this.a;
            if (d != 0.0d) {
                return new d(1.0d / d, (this.b * (-1.0d)) / d, this);
            }
            return new e(this.b, this);
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.a), Double.valueOf(this.b));
        }

        public d(double d, double d2, AbstractC10115v01 abstractC10115v01) {
            this.a = d;
            this.b = d2;
            this.c = abstractC10115v01;
        }
    }

    /* renamed from: o.v01$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC10115v01 {
        public static final c a = new c();

        @Override // o.AbstractC10115v01
        public boolean d() {
            return false;
        }

        @Override // o.AbstractC10115v01
        public boolean e() {
            return false;
        }

        @Override // o.AbstractC10115v01
        public double g() {
            return Double.NaN;
        }

        @Override // o.AbstractC10115v01
        public double h(double d) {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // o.AbstractC10115v01
        public AbstractC10115v01 c() {
            return this;
        }
    }
}
