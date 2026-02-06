package o;

/* renamed from: o.Tm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4337Tm1 extends Number implements Comparable<C4337Tm1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = 5787169186L;
    public float X;

    public C4337Tm1() {
    }

    public Float A() {
        return Float.valueOf(floatValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(float f) {
        this.X += f;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C4337Tm1) && Float.floatToIntBits(((C4337Tm1) obj).X) == Float.floatToIntBits(this.X)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.X;
    }

    public void g(Number number) {
        this.X += number.floatValue();
    }

    public float h(float f) {
        float f2 = this.X + f;
        this.X = f2;
        return f2;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.X);
    }

    public float i(Number number) {
        float floatValue = this.X + number.floatValue();
        this.X = floatValue;
        return floatValue;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C4337Tm1 c4337Tm1) {
        return Float.compare(this.X, c4337Tm1.X);
    }

    public void l() {
        this.X -= 1.0f;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public float m() {
        float f = this.X - 1.0f;
        this.X = f;
        return f;
    }

    public float n(float f) {
        float f2 = this.X;
        this.X = f + f2;
        return f2;
    }

    public float o(Number number) {
        float f = this.X;
        this.X = number.floatValue() + f;
        return f;
    }

    public float p() {
        float f = this.X;
        this.X = f - 1.0f;
        return f;
    }

    public float q() {
        float f = this.X;
        this.X = 1.0f + f;
        return f;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Float getValue() {
        return Float.valueOf(this.X);
    }

    public void s() {
        this.X += 1.0f;
    }

    public float t() {
        float f = this.X + 1.0f;
        this.X = f;
        return f;
    }

    public String toString() {
        return String.valueOf(this.X);
    }

    public boolean u() {
        return Float.isInfinite(this.X);
    }

    public boolean v() {
        return Float.isNaN(this.X);
    }

    public void w(float f) {
        this.X = f;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: x */
    public void setValue(Number number) {
        this.X = number.floatValue();
    }

    public void y(float f) {
        this.X -= f;
    }

    public void z(Number number) {
        this.X -= number.floatValue();
    }

    public C4337Tm1(float f) {
        this.X = f;
    }

    public C4337Tm1(Number number) {
        this.X = number.floatValue();
    }

    public C4337Tm1(String str) {
        this.X = Float.parseFloat(str);
    }
}
