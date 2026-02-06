package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC6949i41;
import o.C10187vI1;
import o.C10192vJ2;
import o.C9965uN2;
import o.ExecutorC8412o12;
import o.InterfaceC3748Nl2;
import o.InterfaceC5625cg0;
import o.ZM2;

/* loaded from: classes.dex */
public class d implements InterfaceC5625cg0 {
    public static final String f1 = AbstractC6949i41.f("SystemAlarmDispatcher");
    public static final String g1 = "ProcessCommand";
    public static final String h1 = "KEY_START_ID";
    public static final int i1 = 0;
    public final Context X;
    public final InterfaceC3748Nl2 Y;
    public final C10187vI1 Y0;
    public final C9965uN2 Z;
    public final ZM2 Z0;
    public final androidx.work.impl.background.systemalarm.a a1;
    public final Handler b1;
    public final List<Intent> c1;
    public Intent d1;
    public c e1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0056d runnableC0056d;
            synchronized (d.this.c1) {
                d dVar2 = d.this;
                dVar2.d1 = dVar2.c1.get(0);
            }
            Intent intent = d.this.d1;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.d1.getIntExtra(d.h1, 0);
                AbstractC6949i41 c = AbstractC6949i41.c();
                String str = d.f1;
                c.a(str, String.format("Processing command %s, %s", d.this.d1, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b = C10192vJ2.b(d.this.X, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC6949i41.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.acquire();
                    d dVar3 = d.this;
                    dVar3.a1.p(dVar3.d1, intExtra, dVar3);
                    AbstractC6949i41.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    dVar = d.this;
                    runnableC0056d = new RunnableC0056d(dVar);
                } catch (Throwable th) {
                    try {
                        AbstractC6949i41 c2 = AbstractC6949i41.c();
                        String str2 = d.f1;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC6949i41.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        dVar = d.this;
                        runnableC0056d = new RunnableC0056d(dVar);
                    } catch (Throwable th2) {
                        AbstractC6949i41.c().a(d.f1, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0056d(dVar4));
                        throw th2;
                    }
                }
                dVar.k(runnableC0056d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public final d X;
        public final Intent Y;
        public final int Z;

        public b(d dispatcher, Intent intent, int startId) {
            this.X = dispatcher;
            this.Y = intent;
            this.Z = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.Y, this.Z);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void c();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0056d implements Runnable {
        public final d X;

        public RunnableC0056d(d dispatcher) {
            this.X = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.c();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(final Intent intent, final int startId) {
        AbstractC6949i41 c2 = AbstractC6949i41.c();
        String str = f1;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(startId)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC6949i41.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if (androidx.work.impl.background.systemalarm.a.c1.equals(action) && i(androidx.work.impl.background.systemalarm.a.c1)) {
            return false;
        } else {
            intent.putExtra(h1, startId);
            synchronized (this.c1) {
                try {
                    boolean isEmpty = this.c1.isEmpty();
                    this.c1.add(intent);
                    if (isEmpty) {
                        l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public final void b() {
        if (this.b1.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public void c() {
        AbstractC6949i41 c2 = AbstractC6949i41.c();
        String str = f1;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.c1) {
            try {
                if (this.d1 != null) {
                    AbstractC6949i41.c().a(str, String.format("Removing command %s", this.d1), new Throwable[0]);
                    if (this.c1.remove(0).equals(this.d1)) {
                        this.d1 = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                ExecutorC8412o12 m = this.Y.m();
                if (!this.a1.o() && this.c1.isEmpty() && !m.c()) {
                    AbstractC6949i41.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.e1;
                    if (cVar != null) {
                        cVar.c();
                    }
                } else if (!this.c1.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C10187vI1 d() {
        return this.Y0;
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.c(this.X, workSpecId, needsReschedule), 0));
    }

    public InterfaceC3748Nl2 f() {
        return this.Y;
    }

    public ZM2 g() {
        return this.Z0;
    }

    public C9965uN2 h() {
        return this.Z;
    }

    public final boolean i(String action) {
        b();
        synchronized (this.c1) {
            try {
                for (Intent intent : this.c1) {
                    if (action.equals(intent.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        AbstractC6949i41.c().a(f1, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.Y0.j(this);
        this.Z.d();
        this.e1 = null;
    }

    public void k(Runnable runnable) {
        this.b1.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock b2 = C10192vJ2.b(this.X, g1);
        try {
            b2.acquire();
            this.Z0.O().o(new a());
        } finally {
            b2.release();
        }
    }

    public void m(c listener) {
        if (this.e1 != null) {
            AbstractC6949i41.c().b(f1, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.e1 = listener;
        }
    }

    public d(Context context, C10187vI1 processor, ZM2 workManager) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext;
        this.a1 = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.Z = new C9965uN2();
        workManager = workManager == null ? ZM2.H(context) : workManager;
        this.Z0 = workManager;
        processor = processor == null ? workManager.J() : processor;
        this.Y0 = processor;
        this.Y = workManager.O();
        processor.c(this);
        this.c1 = new ArrayList();
        this.d1 = null;
        this.b1 = new Handler(Looper.getMainLooper());
    }
}
