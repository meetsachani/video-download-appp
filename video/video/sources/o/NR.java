package o;

/* loaded from: classes3.dex */
public class NR extends Exception {
    private static final long serialVersionUID = 1;
    public long X;
    public String[] Y;

    public NR() {
        this.X = -1L;
    }

    public String[] a() {
        return (String[]) C4206Se.R(this.Y);
    }

    public long b() {
        return this.X;
    }

    public void c(String[] strArr) {
        this.Y = (String[]) C4206Se.R(strArr);
    }

    public void d(long j) {
        this.X = j;
    }

    public NR(String str) {
        super(str);
        this.X = -1L;
    }
}
