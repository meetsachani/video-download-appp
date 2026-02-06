package o;

/* renamed from: o.n31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8176n31 {
    public static final <T> T a(C7915m31 c7915m31, FA0<? extends T> fa0) {
        T invoke;
        C6562gT0.p(c7915m31, "<this>");
        C6562gT0.p(fa0, "block");
        synchronized (c7915m31) {
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
