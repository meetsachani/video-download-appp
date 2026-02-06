package o;

/* renamed from: o.Qn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4047Qn1 extends Number implements Comparable<C4047Qn1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = -2135791679;
    public short X;

    public C4047Qn1() {
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(Number number) {
        this.X = (short) (this.X + number.shortValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4047Qn1) || this.X != ((C4047Qn1) obj).shortValue()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.X;
    }

    public void g(short s) {
        this.X = (short) (this.X + s);
    }

    public short h(Number number) {
        short shortValue = (short) (this.X + number.shortValue());
        this.X = shortValue;
        return shortValue;
    }

    public int hashCode() {
        return this.X;
    }

    public short i(short s) {
        short s2 = (short) (this.X + s);
        this.X = s2;
        return s2;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C4047Qn1 c4047Qn1) {
        return C3482Ks1.d(this.X, c4047Qn1.X);
    }

    public void l() {
        this.X = (short) (this.X - 1);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public short m() {
        short s = (short) (this.X - 1);
        this.X = s;
        return s;
    }

    public short n(Number number) {
        short s = this.X;
        this.X = (short) (number.shortValue() + s);
        return s;
    }

    public short o(short s) {
        short s2 = this.X;
        this.X = (short) (s + s2);
        return s2;
    }

    public short p() {
        short s = this.X;
        this.X = (short) (s - 1);
        return s;
    }

    public short q() {
        short s = this.X;
        this.X = (short) (s + 1);
        return s;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Short getValue() {
        return Short.valueOf(this.X);
    }

    public void s() {
        this.X = (short) (this.X + 1);
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.X;
    }

    public short t() {
        short s = (short) (this.X + 1);
        this.X = s;
        return s;
    }

    public String toString() {
        return String.valueOf((int) this.X);
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: u */
    public void setValue(Number number) {
        this.X = number.shortValue();
    }

    public void v(short s) {
        this.X = s;
    }

    public void w(Number number) {
        this.X = (short) (this.X - number.shortValue());
    }

    public void x(short s) {
        this.X = (short) (this.X - s);
    }

    public Short y() {
        return Short.valueOf(shortValue());
    }

    public C4047Qn1(short s) {
        this.X = s;
    }

    public C4047Qn1(Number number) {
        this.X = number.shortValue();
    }

    public C4047Qn1(String str) {
        this.X = Short.parseShort(str);
    }
}
