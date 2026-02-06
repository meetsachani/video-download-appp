package o;

/* renamed from: o.m31  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7915m31 {
    public final <T> T a(FA0<? extends T> fa0) {
        T invoke;
        C6562gT0.p(fa0, "block");
        synchronized (this) {
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
