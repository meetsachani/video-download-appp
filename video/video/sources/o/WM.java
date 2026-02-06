package o;

/* loaded from: classes4.dex */
public class WM extends RuntimeException {
    public Throwable X;

    public WM(String str) {
        super(str);
        this.X = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.X;
    }

    public WM(String str, Throwable th) {
        super(str);
        this.X = th;
    }

    public WM(Throwable th) {
        super(th.getMessage());
        this.X = th;
    }
}
