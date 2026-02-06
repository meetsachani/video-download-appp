package o;

/* renamed from: o.Rm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4140Rm1 extends Number implements Comparable<C4140Rm1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = 1587163916;
    public double X;

    public C4140Rm1() {
    }

    public Double A() {
        return Double.valueOf(doubleValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(double d) {
        this.X += d;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4140Rm1) && Double.doubleToLongBits(((C4140Rm1) obj).X) == Double.doubleToLongBits(this.X)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.X;
    }

    public void g(Number number) {
        this.X += number.doubleValue();
    }

    public double h(double d) {
        double d2 = this.X + d;
        this.X = d2;
        return d2;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.X);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public double i(Number number) {
        double doubleValue = this.X + number.doubleValue();
        this.X = doubleValue;
        return doubleValue;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C4140Rm1 c4140Rm1) {
        return Double.compare(this.X, c4140Rm1.X);
    }

    public void l() {
        this.X -= 1.0d;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) this.X;
    }

    public double m() {
        double d = this.X - 1.0d;
        this.X = d;
        return d;
    }

    public double n(double d) {
        double d2 = this.X;
        this.X = d + d2;
        return d2;
    }

    public double o(Number number) {
        double d = this.X;
        this.X = number.doubleValue() + d;
        return d;
    }

    public double p() {
        double d = this.X;
        this.X = d - 1.0d;
        return d;
    }

    public double q() {
        double d = this.X;
        this.X = 1.0d + d;
        return d;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Double getValue() {
        return Double.valueOf(this.X);
    }

    public void s() {
        this.X += 1.0d;
    }

    public double t() {
        double d = this.X + 1.0d;
        this.X = d;
        return d;
    }

    public String toString() {
        return String.valueOf(this.X);
    }

    public boolean u() {
        return Double.isInfinite(this.X);
    }

    public boolean v() {
        return Double.isNaN(this.X);
    }

    public void w(double d) {
        this.X = d;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: x */
    public void setValue(Number number) {
        this.X = number.doubleValue();
    }

    public void y(double d) {
        this.X -= d;
    }

    public void z(Number number) {
        this.X -= number.doubleValue();
    }

    public C4140Rm1(double d) {
        this.X = d;
    }

    public C4140Rm1(Number number) {
        this.X = number.doubleValue();
    }

    public C4140Rm1(String str) {
        this.X = Double.parseDouble(str);
    }
}
