package o;

/* renamed from: o.ln1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7850ln1 extends Number implements Comparable<C7850ln1>, InterfaceC3360Jm1<Number> {
    private static final long serialVersionUID = 62986528375L;
    public long X;

    public C7850ln1() {
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X;
    }

    public void e(long j) {
        this.X += j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7850ln1) || this.X != ((C7850ln1) obj).longValue()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) this.X;
    }

    public void g(Number number) {
        this.X += number.longValue();
    }

    public long h(long j) {
        long j2 = this.X + j;
        this.X = j2;
        return j2;
    }

    public int hashCode() {
        long j = this.X;
        return (int) (j ^ (j >>> 32));
    }

    public long i(Number number) {
        long longValue = this.X + number.longValue();
        this.X = longValue;
        return longValue;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.X;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C7850ln1 c7850ln1) {
        return C3482Ks1.c(this.X, c7850ln1.X);
    }

    public void l() {
        this.X--;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public long m() {
        long j = this.X - 1;
        this.X = j;
        return j;
    }

    public long n(long j) {
        long j2 = this.X;
        this.X = j + j2;
        return j2;
    }

    public long o(Number number) {
        long j = this.X;
        this.X = number.longValue() + j;
        return j;
    }

    public long p() {
        long j = this.X;
        this.X = j - 1;
        return j;
    }

    public long q() {
        long j = this.X;
        this.X = 1 + j;
        return j;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: r */
    public Long getValue() {
        return Long.valueOf(this.X);
    }

    public void s() {
        this.X++;
    }

    public long t() {
        long j = this.X + 1;
        this.X = j;
        return j;
    }

    public String toString() {
        return String.valueOf(this.X);
    }

    public void u(long j) {
        this.X = j;
    }

    @Override // o.InterfaceC3360Jm1
    /* renamed from: v */
    public void setValue(Number number) {
        this.X = number.longValue();
    }

    public void w(long j) {
        this.X -= j;
    }

    public void x(Number number) {
        this.X -= number.longValue();
    }

    public Long y() {
        return Long.valueOf(longValue());
    }

    public C7850ln1(long j) {
        this.X = j;
    }

    public C7850ln1(Number number) {
        this.X = number.longValue();
    }

    public C7850ln1(String str) {
        this.X = Long.parseLong(str);
    }
}
