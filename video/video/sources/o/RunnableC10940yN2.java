package o;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o.TM2;

/* renamed from: o.yN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC10940yN2 implements Runnable {
    public static final String o1 = AbstractC6949i41.f("WorkerWrapper");
    public Context X;
    public String Y;
    public WorkerParameters.a Y0;
    public List<InterfaceC6579gY1> Z;
    public C8501oN2 Z0;
    public ListenableWorker a1;
    public InterfaceC3748Nl2 b1;
    public androidx.work.a d1;
    public InterfaceC9372rx0 e1;
    public WorkDatabase f1;
    public InterfaceC8744pN2 g1;
    public InterfaceC8171n20 h1;
    public InterfaceC9479sN2 i1;
    public List<String> j1;
    public String k1;
    public volatile boolean n1;
    public ListenableWorker.a c1 = ListenableWorker.a.a();
    public E22<Boolean> l1 = E22.u();
    public InterfaceFutureC8411o11<ListenableWorker.a> m1 = null;

    /* renamed from: o.yN2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ InterfaceFutureC8411o11 X;
        public final /* synthetic */ E22 Y;

        public a(final InterfaceFutureC8411o11 val$runExpedited, final E22 val$future) {
            this.X = val$runExpedited;
            this.Y = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.get();
                AbstractC6949i41.c().a(RunnableC10940yN2.o1, String.format("Starting work for %s", RunnableC10940yN2.this.Z0.c), new Throwable[0]);
                RunnableC10940yN2 runnableC10940yN2 = RunnableC10940yN2.this;
                runnableC10940yN2.m1 = runnableC10940yN2.a1.startWork();
                this.Y.r(RunnableC10940yN2.this.m1);
            } catch (Throwable th) {
                this.Y.q(th);
            }
        }
    }

    /* renamed from: o.yN2$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ E22 X;
        public final /* synthetic */ String Y;

        public b(final E22 val$future, final String val$workDescription) {
            this.X = val$future;
            this.Y = val$workDescription;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.X.get();
                    if (aVar == null) {
                        AbstractC6949i41.c().b(RunnableC10940yN2.o1, String.format("%s returned a null result. Treating it as a failure.", RunnableC10940yN2.this.Z0.c), new Throwable[0]);
                    } else {
                        AbstractC6949i41.c().a(RunnableC10940yN2.o1, String.format("%s returned a %s result.", RunnableC10940yN2.this.Z0.c, aVar), new Throwable[0]);
                        RunnableC10940yN2.this.c1 = aVar;
                    }
                    RunnableC10940yN2.this.f();
                } catch (InterruptedException e) {
                    e = e;
                    AbstractC6949i41.c().b(RunnableC10940yN2.o1, String.format("%s failed because it threw an exception/error", this.Y), e);
                    RunnableC10940yN2.this.f();
                } catch (CancellationException e2) {
                    AbstractC6949i41.c().d(RunnableC10940yN2.o1, String.format("%s was cancelled", this.Y), e2);
                    RunnableC10940yN2.this.f();
                } catch (ExecutionException e3) {
                    e = e3;
                    AbstractC6949i41.c().b(RunnableC10940yN2.o1, String.format("%s failed because it threw an exception/error", this.Y), e);
                    RunnableC10940yN2.this.f();
                }
            } catch (Throwable th) {
                RunnableC10940yN2.this.f();
                throw th;
            }
        }
    }

    /* renamed from: o.yN2$c */
    /* loaded from: classes.dex */
    public static class c {
        public Context a;
        public ListenableWorker b;
        public InterfaceC9372rx0 c;
        public InterfaceC3748Nl2 d;
        public androidx.work.a e;
        public WorkDatabase f;
        public String g;
        public List<InterfaceC6579gY1> h;
        public WorkerParameters.a i = new WorkerParameters.a();

        public c(Context context, androidx.work.a configuration, InterfaceC3748Nl2 workTaskExecutor, InterfaceC9372rx0 foregroundProcessor, WorkDatabase database, String workSpecId) {
            this.a = context.getApplicationContext();
            this.d = workTaskExecutor;
            this.c = foregroundProcessor;
            this.e = configuration;
            this.f = database;
            this.g = workSpecId;
        }

        public RunnableC10940yN2 a() {
            return new RunnableC10940yN2(this);
        }

        public c b(WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.i = runtimeExtras;
            }
            return this;
        }

        public c c(List<InterfaceC6579gY1> schedulers) {
            this.h = schedulers;
            return this;
        }

        public c d(ListenableWorker worker) {
            this.b = worker;
            return this;
        }
    }

    public RunnableC10940yN2(c builder) {
        this.X = builder.a;
        this.b1 = builder.d;
        this.e1 = builder.c;
        this.Y = builder.g;
        this.Z = builder.h;
        this.Y0 = builder.i;
        this.a1 = builder.b;
        this.d1 = builder.e;
        WorkDatabase workDatabase = builder.f;
        this.f1 = workDatabase;
        this.g1 = workDatabase.L();
        this.h1 = this.f1.C();
        this.i1 = this.f1.M();
    }

    public final String a(List<String> tags) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.Y);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : tags) {
            if (z) {
                z = false;
            } else {
                sb.append(C6566gU0.h);
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public InterfaceFutureC8411o11<Boolean> b() {
        return this.l1;
    }

    public final void c(ListenableWorker.a result) {
        if (result instanceof ListenableWorker.a.c) {
            AbstractC6949i41.c().d(o1, String.format("Worker result SUCCESS for %s", this.k1), new Throwable[0]);
            if (this.Z0.d()) {
                h();
            } else {
                m();
            }
        } else if (result instanceof ListenableWorker.a.b) {
            AbstractC6949i41.c().d(o1, String.format("Worker result RETRY for %s", this.k1), new Throwable[0]);
            g();
        } else {
            AbstractC6949i41.c().d(o1, String.format("Worker result FAILURE for %s", this.k1), new Throwable[0]);
            if (this.Z0.d()) {
                h();
            } else {
                l();
            }
        }
    }

    public void d() {
        boolean z;
        this.n1 = true;
        n();
        InterfaceFutureC8411o11<ListenableWorker.a> interfaceFutureC8411o11 = this.m1;
        if (interfaceFutureC8411o11 != null) {
            z = interfaceFutureC8411o11.isDone();
            this.m1.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.a1;
        if (listenableWorker != null && !z) {
            listenableWorker.stop();
            return;
        }
        AbstractC6949i41.c().a(o1, String.format("WorkSpec %s is already done. Not interrupting.", this.Z0), new Throwable[0]);
    }

    public final void e(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.g1.i(str) != TM2.a.CANCELLED) {
                this.g1.t(TM2.a.FAILED, str);
            }
            linkedList.addAll(this.h1.a(str));
        }
    }

    public void f() {
        if (!n()) {
            this.f1.c();
            try {
                TM2.a i = this.g1.i(this.Y);
                this.f1.K().a(this.Y);
                if (i == null) {
                    i(false);
                } else if (i == TM2.a.RUNNING) {
                    c(this.c1);
                } else if (!i.e()) {
                    g();
                }
                this.f1.A();
                this.f1.i();
            } catch (Throwable th) {
                this.f1.i();
                throw th;
            }
        }
        List<InterfaceC6579gY1> list = this.Z;
        if (list != null) {
            for (InterfaceC6579gY1 interfaceC6579gY1 : list) {
                interfaceC6579gY1.c(this.Y);
            }
            C7792lY1.b(this.d1, this.f1, this.Z);
        }
    }

    public final void g() {
        this.f1.c();
        try {
            this.g1.t(TM2.a.ENQUEUED, this.Y);
            this.g1.F(this.Y, System.currentTimeMillis());
            this.g1.q(this.Y, -1L);
            this.f1.A();
        } finally {
            this.f1.i();
            i(true);
        }
    }

    public final void h() {
        this.f1.c();
        try {
            this.g1.F(this.Y, System.currentTimeMillis());
            this.g1.t(TM2.a.ENQUEUED, this.Y);
            this.g1.B(this.Y);
            this.g1.q(this.Y, -1L);
            this.f1.A();
        } finally {
            this.f1.i();
            i(false);
        }
    }

    public final void i(final boolean needsReschedule) {
        ListenableWorker listenableWorker;
        this.f1.c();
        try {
            if (!this.f1.L().A()) {
                C3107Gx1.c(this.X, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.g1.t(TM2.a.ENQUEUED, this.Y);
                this.g1.q(this.Y, -1L);
            }
            if (this.Z0 != null && (listenableWorker = this.a1) != null && listenableWorker.isRunInForeground()) {
                this.e1.b(this.Y);
            }
            this.f1.A();
            this.f1.i();
            this.l1.p(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.f1.i();
            throw th;
        }
    }

    public final void j() {
        TM2.a i = this.g1.i(this.Y);
        if (i == TM2.a.RUNNING) {
            AbstractC6949i41.c().a(o1, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.Y), new Throwable[0]);
            i(true);
            return;
        }
        AbstractC6949i41.c().a(o1, String.format("Status for %s is %s; not doing any work", this.Y, i), new Throwable[0]);
        i(false);
    }

    public final void k() {
        androidx.work.b b2;
        if (!n()) {
            this.f1.c();
            try {
                C8501oN2 j = this.g1.j(this.Y);
                this.Z0 = j;
                if (j == null) {
                    AbstractC6949i41.c().b(o1, String.format("Didn't find WorkSpec for id %s", this.Y), new Throwable[0]);
                    i(false);
                    this.f1.A();
                } else if (j.b != TM2.a.ENQUEUED) {
                    j();
                    this.f1.A();
                    AbstractC6949i41.c().a(o1, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.Z0.c), new Throwable[0]);
                } else {
                    if (j.d() || this.Z0.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C8501oN2 c8501oN2 = this.Z0;
                        if (c8501oN2.n != 0 && currentTimeMillis < c8501oN2.a()) {
                            AbstractC6949i41.c().a(o1, String.format("Delaying execution for %s because it is being executed before schedule.", this.Z0.c), new Throwable[0]);
                            i(true);
                            this.f1.A();
                            return;
                        }
                    }
                    this.f1.A();
                    this.f1.i();
                    if (this.Z0.d()) {
                        b2 = this.Z0.e;
                    } else {
                        AbstractC7036iQ0 b3 = this.d1.f().b(this.Z0.d);
                        if (b3 == null) {
                            AbstractC6949i41.c().b(o1, String.format("Could not create Input Merger %s", this.Z0.d), new Throwable[0]);
                            l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.Z0.e);
                        arrayList.addAll(this.g1.m(this.Y));
                        b2 = b3.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.Y), b2, this.j1, this.Y0, this.Z0.k, this.d1.e(), this.b1, this.d1.m(), new C6783hN2(this.f1, this.b1), new SM2(this.f1, this.e1, this.b1));
                    if (this.a1 == null) {
                        this.a1 = this.d1.m().b(this.X, this.Z0.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.a1;
                    if (listenableWorker == null) {
                        AbstractC6949i41.c().b(o1, String.format("Could not create Worker %s", this.Z0.c), new Throwable[0]);
                        l();
                    } else if (listenableWorker.isUsed()) {
                        AbstractC6949i41.c().b(o1, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.Z0.c), new Throwable[0]);
                        l();
                    } else {
                        this.a1.setUsed();
                        if (o()) {
                            if (n()) {
                                return;
                            }
                            E22 u = E22.u();
                            RM2 rm2 = new RM2(this.X, this.Z0, this.a1, workerParameters.b(), this.b1);
                            this.b1.n().execute(rm2);
                            InterfaceFutureC8411o11<Void> a2 = rm2.a();
                            a2.h4(new a(a2, u), this.b1.n());
                            u.h4(new b(u, this.k1), this.b1.m());
                            return;
                        }
                        j();
                    }
                }
            } finally {
                this.f1.i();
            }
        }
    }

    public void l() {
        this.f1.c();
        try {
            e(this.Y);
            this.g1.u(this.Y, ((ListenableWorker.a.C0053a) this.c1).c());
            this.f1.A();
        } finally {
            this.f1.i();
            i(false);
        }
    }

    public final void m() {
        this.f1.c();
        try {
            this.g1.t(TM2.a.SUCCEEDED, this.Y);
            this.g1.u(this.Y, ((ListenableWorker.a.c) this.c1).c());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.h1.a(this.Y)) {
                if (this.g1.i(str) == TM2.a.BLOCKED && this.h1.b(str)) {
                    AbstractC6949i41.c().d(o1, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.g1.t(TM2.a.ENQUEUED, str);
                    this.g1.F(str, currentTimeMillis);
                }
            }
            this.f1.A();
            this.f1.i();
            i(false);
        } catch (Throwable th) {
            this.f1.i();
            i(false);
            throw th;
        }
    }

    public final boolean n() {
        if (!this.n1) {
            return false;
        }
        AbstractC6949i41.c().a(o1, String.format("Work interrupted for %s", this.k1), new Throwable[0]);
        TM2.a i = this.g1.i(this.Y);
        if (i == null) {
            i(false);
        } else {
            i(!i.e());
        }
        return true;
    }

    public final boolean o() {
        boolean z;
        this.f1.c();
        try {
            if (this.g1.i(this.Y) == TM2.a.ENQUEUED) {
                this.g1.t(TM2.a.RUNNING, this.Y);
                this.g1.E(this.Y);
                z = true;
            } else {
                z = false;
            }
            this.f1.A();
            this.f1.i();
            return z;
        } catch (Throwable th) {
            this.f1.i();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b2 = this.i1.b(this.Y);
        this.j1 = b2;
        this.k1 = a(b2);
        k();
    }
}
