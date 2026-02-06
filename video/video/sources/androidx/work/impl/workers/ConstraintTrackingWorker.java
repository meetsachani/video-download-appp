package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import o.AbstractC6949i41;
import o.C8501oN2;
import o.E22;
import o.InterfaceC3748Nl2;
import o.InterfaceFutureC8411o11;
import o.MM2;
import o.NM2;
import o.ZM2;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements MM2 {
    public static final String f1 = AbstractC6949i41.f("ConstraintTrkngWrkr");
    public static final String g1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    public WorkerParameters a1;
    public final Object b1;
    public volatile boolean c1;
    public E22<ListenableWorker.a> d1;
    public ListenableWorker e1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ InterfaceFutureC8411o11 X;

        public b(final InterfaceFutureC8411o11 val$innerFuture) {
            this.X = val$innerFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.b1) {
                try {
                    if (ConstraintTrackingWorker.this.c1) {
                        ConstraintTrackingWorker.this.e();
                    } else {
                        ConstraintTrackingWorker.this.d1.r(this.X);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        this.a1 = workerParams;
        this.b1 = new Object();
        this.c1 = false;
        this.d1 = E22.u();
    }

    public ListenableWorker a() {
        return this.e1;
    }

    @Override // o.MM2
    public void b(List<String> workSpecIds) {
        AbstractC6949i41.c().a(f1, String.format("Constraints changed for %s", workSpecIds), new Throwable[0]);
        synchronized (this.b1) {
            this.c1 = true;
        }
    }

    public WorkDatabase c() {
        return ZM2.H(getApplicationContext()).M();
    }

    public void d() {
        this.d1.p(ListenableWorker.a.a());
    }

    public void e() {
        this.d1.p(ListenableWorker.a.d());
    }

    @Override // o.MM2
    public void f(List<String> workSpecIds) {
    }

    public void g() {
        String A = getInputData().A(g1);
        if (TextUtils.isEmpty(A)) {
            AbstractC6949i41.c().b(f1, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        ListenableWorker b2 = getWorkerFactory().b(getApplicationContext(), A, this.a1);
        this.e1 = b2;
        if (b2 == null) {
            AbstractC6949i41.c().a(f1, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        C8501oN2 j = c().L().j(getId().toString());
        if (j == null) {
            d();
            return;
        }
        NM2 nm2 = new NM2(getApplicationContext(), getTaskExecutor(), this);
        nm2.d(Collections.singletonList(j));
        if (nm2.c(getId().toString())) {
            AbstractC6949i41.c().a(f1, String.format("Constraints met for delegate %s", A), new Throwable[0]);
            try {
                InterfaceFutureC8411o11<ListenableWorker.a> startWork = this.e1.startWork();
                startWork.h4(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                AbstractC6949i41 c = AbstractC6949i41.c();
                String str = f1;
                c.a(str, String.format("Delegated worker %s threw exception in startWork.", A), th);
                synchronized (this.b1) {
                    try {
                        if (this.c1) {
                            AbstractC6949i41.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            e();
                        } else {
                            d();
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        AbstractC6949i41.c().a(f1, String.format("Constraints not met for delegate %s. Requesting retry.", A), new Throwable[0]);
        e();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC3748Nl2 getTaskExecutor() {
        return ZM2.H(getApplicationContext()).O();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.e1;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.e1;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.e1.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC8411o11<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.d1;
    }
}
