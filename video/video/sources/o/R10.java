package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class R10 {
    public static final String d = AbstractC6949i41.f("DelayedWorkTracker");
    public final ME0 a;
    public final InterfaceC9020qW1 b;
    public final Map<String, Runnable> c = new HashMap();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ C8501oN2 X;

        public a(final C8501oN2 val$workSpec) {
            this.X = val$workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6949i41.c().a(R10.d, String.format("Scheduling work %s", this.X.a), new Throwable[0]);
            R10.this.a.a(this.X);
        }
    }

    public R10(ME0 scheduler, InterfaceC9020qW1 runnableScheduler) {
        this.a = scheduler;
        this.b = runnableScheduler;
    }

    public void a(final C8501oN2 workSpec) {
        Runnable remove = this.c.remove(workSpec.a);
        if (remove != null) {
            this.b.a(remove);
        }
        a aVar = new a(workSpec);
        this.c.put(workSpec.a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.b.b(workSpec.a() - currentTimeMillis, aVar);
    }

    public void b(String workSpecId) {
        Runnable remove = this.c.remove(workSpecId);
        if (remove != null) {
            this.b.a(remove);
        }
    }
}
