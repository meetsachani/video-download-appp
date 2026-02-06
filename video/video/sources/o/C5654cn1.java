package o;

/* renamed from: o.cn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5654cn1 extends Number implements Comparable<C5654cn1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = 512176391864L;
    public int X;

    public C5654cn1() {
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(int i) {
        this.X += i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5654cn1) || this.X != ((C5654cn1) obj).intValue()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.X;
    }

    public void g(Number number) {
        this.X += number.intValue();
    }

    public int h(int i) {
        int i2 = this.X + i;
        this.X = i2;
        return i2;
    }

    public int hashCode() {
        return this.X;
    }

    public int i(Number number) {
        int intValue = this.X + number.intValue();
        this.X = intValue;
        return intValue;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C5654cn1 c5654cn1) {
        return C3482Ks1.b(this.X, c5654cn1.X);
    }

    public void l() {
        this.X--;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public int m() {
        int i = this.X - 1;
        this.X = i;
        return i;
    }

    public int n(int i) {
        int i2 = this.X;
        this.X = i + i2;
        return i2;
    }

    public int o(Number number) {
        int i = this.X;
        this.X = number.intValue() + i;
        return i;
    }

    public int p() {
        int i = this.X;
        this.X = i - 1;
        return i;
    }

    public int q() {
        int i = this.X;
        this.X = i + 1;
        return i;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Integer getValue() {
        return Integer.valueOf(this.X);
    }

    public void s() {
        this.X++;
    }

    public int t() {
        int i = this.X + 1;
        this.X = i;
        return i;
    }

    public String toString() {
        return String.valueOf(this.X);
    }

    public void u(int i) {
        this.X = i;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: v */
    public void setValue(Number number) {
        this.X = number.intValue();
    }

    public void w(int i) {
        this.X -= i;
    }

    public void x(Number number) {
        this.X -= number.intValue();
    }

    public Integer y() {
        return Integer.valueOf(intValue());
    }

    public C5654cn1(int i) {
        this.X = i;
    }

    public C5654cn1(Number number) {
        this.X = number.intValue();
    }

    public C5654cn1(String str) {
        this.X = Integer.parseInt(str);
    }
}
