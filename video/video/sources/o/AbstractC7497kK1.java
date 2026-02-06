package o;

import java.util.concurrent.Executor;

/* renamed from: o.kK1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7497kK1 {

    /* renamed from: o.kK1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final AbstractC7497kK1 a = new C7740lK1();
    }

    public static AbstractC7497kK1 b() {
        if (C6528gK2.a(C6528gK2.L)) {
            return a.a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(Executor executor, Runnable runnable);

    public abstract void c(C7254jK1 c7254jK1, Executor executor, Runnable runnable);
}
