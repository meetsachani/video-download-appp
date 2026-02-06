package o;

import android.content.Context;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public class RM2 implements Runnable {
    public static final String b1 = AbstractC6949i41.f("WorkForegroundRunnable");
    public final E22<Void> X = E22.u();
    public final Context Y;
    public final ListenableWorker Y0;
    public final C8501oN2 Z;
    public final InterfaceC9615sx0 Z0;
    public final InterfaceC3748Nl2 a1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ E22 X;

        public a(final E22 val$foregroundFuture) {
            this.X = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.r(RM2.this.Y0.getForegroundInfoAsync());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ E22 X;

        public b(final E22 val$foregroundFuture) {
            this.X = val$foregroundFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C8880px0 c8880px0 = (C8880px0) this.X.get();
                if (c8880px0 != null) {
                    AbstractC6949i41.c().a(RM2.b1, String.format("Updating notification for %s", RM2.this.Z.c), new Throwable[0]);
                    RM2.this.Y0.setRunInForeground(true);
                    RM2 rm2 = RM2.this;
                    rm2.X.r(rm2.Z0.a(rm2.Y, rm2.Y0.getId(), c8880px0));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RM2.this.Z.c));
            } catch (Throwable th) {
                RM2.this.X.q(th);
            }
        }
    }

    public RM2(Context context, C8501oN2 workSpec, ListenableWorker worker, InterfaceC9615sx0 foregroundUpdater, InterfaceC3748Nl2 taskExecutor) {
        this.Y = context;
        this.Z = workSpec;
        this.Y0 = worker;
        this.Z0 = foregroundUpdater;
        this.a1 = taskExecutor;
    }

    public InterfaceFutureC8411o11<Void> a() {
        return this.X;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.Z.q && !C2775Dq.k()) {
            E22 u = E22.u();
            this.a1.n().execute(new a(u));
            u.h4(new b(u), this.a1.n());
            return;
        }
        this.X.p(null);
    }
}
