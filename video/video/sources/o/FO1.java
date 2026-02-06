package o;

/* loaded from: classes3.dex */
public abstract class FO1 extends Exception {
    public static final boolean X;
    public static final StackTraceElement[] Y;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        X = z;
        Y = new StackTraceElement[0];
    }

    public FO1() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public FO1(Throwable th) {
        super(th);
    }
}
