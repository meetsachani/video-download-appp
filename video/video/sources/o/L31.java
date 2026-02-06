package o;

/* loaded from: classes4.dex */
public class L31 extends RuntimeException {
    private static final long serialVersionUID = 8486587136871052495L;
    public Throwable X;

    public L31() {
        this.X = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.X;
    }

    public L31(String str) {
        super(str);
        this.X = null;
    }

    public L31(Throwable th) {
        this(th == null ? null : th.toString(), th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L31(String str, Throwable th) {
        super(r0.toString());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th);
        stringBuffer.append(C9811tl1.d);
        this.X = th;
    }
}
