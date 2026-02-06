package o;

/* renamed from: o.Mm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3653Mm1 extends Number implements Comparable<C3653Mm1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = -1585823265;
    public byte X;

    public C3653Mm1() {
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.X;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(byte b) {
        this.X = (byte) (this.X + b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3653Mm1) || this.X != ((C3653Mm1) obj).byteValue()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.X;
    }

    public void g(Number number) {
        this.X = (byte) (this.X + number.byteValue());
    }

    public byte h(byte b) {
        byte b2 = (byte) (this.X + b);
        this.X = b2;
        return b2;
    }

    public int hashCode() {
        return this.X;
    }

    public byte i(Number number) {
        byte byteValue = (byte) (this.X + number.byteValue());
        this.X = byteValue;
        return byteValue;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C3653Mm1 c3653Mm1) {
        return C3482Ks1.a(this.X, c3653Mm1.X);
    }

    public void l() {
        this.X = (byte) (this.X - 1);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public byte m() {
        byte b = (byte) (this.X - 1);
        this.X = b;
        return b;
    }

    public byte n(byte b) {
        byte b2 = this.X;
        this.X = (byte) (b + b2);
        return b2;
    }

    public byte o(Number number) {
        byte b = this.X;
        this.X = (byte) (number.byteValue() + b);
        return b;
    }

    public byte p() {
        byte b = this.X;
        this.X = (byte) (b - 1);
        return b;
    }

    public byte q() {
        byte b = this.X;
        this.X = (byte) (b + 1);
        return b;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Byte getValue() {
        return Byte.valueOf(this.X);
    }

    public void s() {
        this.X = (byte) (this.X + 1);
    }

    public byte t() {
        byte b = (byte) (this.X + 1);
        this.X = b;
        return b;
    }

    public String toString() {
        return String.valueOf((int) this.X);
    }

    public void u(byte b) {
        this.X = b;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: v */
    public void setValue(Number number) {
        this.X = number.byteValue();
    }

    public void w(byte b) {
        this.X = (byte) (this.X - b);
    }

    public void x(Number number) {
        this.X = (byte) (this.X - number.byteValue());
    }

    public Byte y() {
        return Byte.valueOf(byteValue());
    }

    public C3653Mm1(byte b) {
        this.X = b;
    }

    public C3653Mm1(Number number) {
        this.X = number.byteValue();
    }

    public C3653Mm1(String str) {
        this.X = Byte.parseByte(str);
    }
}
