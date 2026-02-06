package o;

/* renamed from: o.Sj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4229Sj2 {
    public static final <T> T a(C4032Qj2 c4032Qj2, FA0<? extends T> fa0) {
        T invoke;
        C6562gT0.p(c4032Qj2, "lock");
        C6562gT0.p(fa0, "action");
        synchronized (c4032Qj2) {
            try {
                invoke = fa0.invoke();
                UP0.d(1);
            } catch (Throwable th) {
                UP0.d(1);
                UP0.c(1);
                throw th;
            }
        }
        UP0.c(1);
        return invoke;
    }
}
