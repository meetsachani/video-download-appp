package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class TK<T> {
    public static final String f = AbstractC6949i41.f("ConstraintTracker");
    public final InterfaceC3748Nl2 a;
    public final Context b;
    public final Object c = new Object();
    public final Set<PK<T>> d = new LinkedHashSet();
    public T e;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List X;

        public a(final List val$listenersList) {
            this.X = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (PK pk : this.X) {
                pk.a(TK.this.e);
            }
        }
    }

    public TK(Context context, InterfaceC3748Nl2 taskExecutor) {
        this.b = context.getApplicationContext();
        this.a = taskExecutor;
    }

    public void a(PK<T> listener) {
        synchronized (this.c) {
            try {
                if (this.d.add(listener)) {
                    if (this.d.size() == 1) {
                        this.e = b();
                        AbstractC6949i41.c().a(f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.e), new Throwable[0]);
                        e();
                    }
                    listener.a(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T b();

    public void c(PK<T> listener) {
        synchronized (this.c) {
            try {
                if (this.d.remove(listener) && this.d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(T newState) {
        synchronized (this.c) {
            try {
                T t = this.e;
                if (t != newState && (t == null || !t.equals(newState))) {
                    this.e = newState;
                    this.a.n().execute(new a(new ArrayList(this.d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
