package o;

/* renamed from: o.Bx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2605Bx0 extends FO1 {
    public static final C2605Bx0 Z;

    static {
        C2605Bx0 c2605Bx0 = new C2605Bx0();
        Z = c2605Bx0;
        c2605Bx0.setStackTrace(FO1.Y);
    }

    public C2605Bx0() {
    }

    public static C2605Bx0 a() {
        if (FO1.X) {
            return new C2605Bx0();
        }
        return Z;
    }

    public static C2605Bx0 b(Throwable th) {
        if (FO1.X) {
            return new C2605Bx0(th);
        }
        return Z;
    }

    public C2605Bx0(Throwable th) {
        super(th);
    }
}
