package o;

/* loaded from: classes3.dex */
public final class UB extends FO1 {
    public static final UB Z;

    static {
        UB ub = new UB();
        Z = ub;
        ub.setStackTrace(FO1.Y);
    }

    public UB() {
    }

    public static UB a() {
        if (FO1.X) {
            return new UB();
        }
        return Z;
    }

    public static UB b(Throwable th) {
        if (FO1.X) {
            return new UB(th);
        }
        return Z;
    }

    public UB(Throwable th) {
        super(th);
    }
}
