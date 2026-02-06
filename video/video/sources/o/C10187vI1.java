package o;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o.RunnableC10940yN2;

/* renamed from: o.vI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10187vI1 implements InterfaceC5625cg0, InterfaceC9372rx0 {
    public static final String g1 = AbstractC6949i41.f("Processor");
    public static final String h1 = "ProcessorForegroundLck";
    public Context Y;
    public InterfaceC3748Nl2 Y0;
    public androidx.work.a Z;
    public WorkDatabase Z0;
    public List<InterfaceC6579gY1> c1;
    public Map<String, RunnableC10940yN2> b1 = new HashMap();
    public Map<String, RunnableC10940yN2> a1 = new HashMap();
    public Set<String> d1 = new HashSet();
    public final List<InterfaceC5625cg0> e1 = new ArrayList();
    public PowerManager.WakeLock X = null;
    public final Object f1 = new Object();

    /* renamed from: o.vI1$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public InterfaceC5625cg0 X;
        public String Y;
        public InterfaceFutureC8411o11<Boolean> Z;

        public a(InterfaceC5625cg0 executionListener, String workSpecId, InterfaceFutureC8411o11<Boolean> future) {
            this.X = executionListener;
            this.Y = workSpecId;
            this.Z = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.Z.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.X.e(this.Y, z);
        }
    }

    public C10187vI1(Context appContext, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, WorkDatabase workDatabase, List<InterfaceC6579gY1> schedulers) {
        this.Y = appContext;
        this.Z = configuration;
        this.Y0 = workTaskExecutor;
        this.Z0 = workDatabase;
        this.c1 = schedulers;
    }

    public static boolean f(String id, RunnableC10940yN2 wrapper) {
        if (wrapper != null) {
            wrapper.d();
            AbstractC6949i41.c().a(g1, String.format("WorkerWrapper interrupted for %s", id), new Throwable[0]);
            return true;
        }
        AbstractC6949i41.c().a(g1, String.format("WorkerWrapper could not be found for %s", id), new Throwable[0]);
        return false;
    }

    @Override // o.InterfaceC9372rx0
    public void a(String workSpecId, C8880px0 foregroundInfo) {
        synchronized (this.f1) {
            try {
                AbstractC6949i41.c().d(g1, String.format("Moving WorkSpec (%s) to the foreground", workSpecId), new Throwable[0]);
                RunnableC10940yN2 remove = this.b1.remove(workSpecId);
                if (remove != null) {
                    if (this.X == null) {
                        PowerManager.WakeLock b = C10192vJ2.b(this.Y, h1);
                        this.X = b;
                        b.acquire();
                    }
                    this.a1.put(workSpecId, remove);
                    C10201vM.B(this.Y, androidx.work.impl.foreground.a.d(this.Y, workSpecId, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC9372rx0
    public void b(String workSpecId) {
        synchronized (this.f1) {
            this.a1.remove(workSpecId);
            n();
        }
    }

    public void c(InterfaceC5625cg0 executionListener) {
        synchronized (this.f1) {
            this.e1.add(executionListener);
        }
    }

    public boolean d() {
        boolean z;
        synchronized (this.f1) {
            try {
                if (this.b1.isEmpty() && this.a1.isEmpty()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC5625cg0
    public void e(final String workSpecId, boolean needsReschedule) {
        synchronized (this.f1) {
            try {
                this.b1.remove(workSpecId);
                AbstractC6949i41.c().a(g1, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
                for (InterfaceC5625cg0 interfaceC5625cg0 : this.e1) {
                    interfaceC5625cg0.e(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g(String id) {
        boolean contains;
        synchronized (this.f1) {
            contains = this.d1.contains(id);
        }
        return contains;
    }

    public boolean h(String workSpecId) {
        boolean z;
        synchronized (this.f1) {
            try {
                if (!this.b1.containsKey(workSpecId) && !this.a1.containsKey(workSpecId)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public boolean i(String workSpecId) {
        boolean containsKey;
        synchronized (this.f1) {
            containsKey = this.a1.containsKey(workSpecId);
        }
        return containsKey;
    }

    public void j(InterfaceC5625cg0 executionListener) {
        synchronized (this.f1) {
            this.e1.remove(executionListener);
        }
    }

    public boolean k(String id) {
        return l(id, null);
    }

    public boolean l(String id, WorkerParameters.a runtimeExtras) {
        Throwable th;
        synchronized (this.f1) {
            try {
                try {
                    if (h(id)) {
                        try {
                            AbstractC6949i41.c().a(g1, String.format("Work %s is already enqueued for processing", id), new Throwable[0]);
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    RunnableC10940yN2 a2 = new RunnableC10940yN2.c(this.Y, this.Z, this.Y0, this, this.Z0, id).c(this.c1).b(runtimeExtras).a();
                    InterfaceFutureC8411o11<Boolean> b = a2.b();
                    b.h4(new a(this, id, b), this.Y0.n());
                    this.b1.put(id, a2);
                    this.Y0.m().execute(a2);
                    AbstractC6949i41.c().a(g1, String.format("%s: processing %s", getClass().getSimpleName(), id), new Throwable[0]);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public boolean m(String id) {
        boolean f;
        synchronized (this.f1) {
            try {
                boolean z = false;
                AbstractC6949i41.c().a(g1, String.format("Processor cancelling %s", id), new Throwable[0]);
                this.d1.add(id);
                RunnableC10940yN2 remove = this.a1.remove(id);
                if (remove != null) {
                    z = true;
                }
                if (remove == null) {
                    remove = this.b1.remove(id);
                }
                f = f(id, remove);
                if (z) {
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public final void n() {
        synchronized (this.f1) {
            try {
                if (this.a1.isEmpty()) {
                    this.Y.startService(androidx.work.impl.foreground.a.g(this.Y));
                    PowerManager.WakeLock wakeLock = this.X;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.X = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(String id) {
        boolean f;
        synchronized (this.f1) {
            AbstractC6949i41.c().a(g1, String.format("Processor stopping foreground work %s", id), new Throwable[0]);
            f = f(id, this.a1.remove(id));
        }
        return f;
    }

    public boolean p(String id) {
        boolean f;
        synchronized (this.f1) {
            AbstractC6949i41.c().a(g1, String.format("Processor stopping background work %s", id), new Throwable[0]);
            f = f(id, this.b1.remove(id));
        }
        return f;
    }
}
