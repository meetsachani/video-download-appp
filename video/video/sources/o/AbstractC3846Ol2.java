package o;

/* renamed from: o.Ol2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3846Ol2 {
    public abstract void a(Runnable runnable);

    public void b(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(Runnable runnable);
}
