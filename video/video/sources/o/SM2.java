package o;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import o.TM2;

/* loaded from: classes.dex */
public class SM2 implements InterfaceC9615sx0 {
    public static final String d = AbstractC6949i41.f("WMFgUpdater");
    public final InterfaceC3748Nl2 a;
    public final InterfaceC9372rx0 b;
    public final InterfaceC8744pN2 c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ E22 X;
        public final /* synthetic */ UUID Y;
        public final /* synthetic */ Context Y0;
        public final /* synthetic */ C8880px0 Z;

        public a(final E22 val$future, final UUID val$id, final C8880px0 val$foregroundInfo, final Context val$context) {
            this.X = val$future;
            this.Y = val$id;
            this.Z = val$foregroundInfo;
            this.Y0 = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.X.isCancelled()) {
                    String uuid = this.Y.toString();
                    TM2.a i = SM2.this.c.i(uuid);
                    if (i != null && !i.e()) {
                        SM2.this.b.a(uuid, this.Z);
                        this.Y0.startService(androidx.work.impl.foreground.a.c(this.Y0, uuid, this.Z));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.X.p(null);
            } catch (Throwable th) {
                this.X.q(th);
            }
        }
    }

    public SM2(WorkDatabase workDatabase, InterfaceC9372rx0 foregroundProcessor, InterfaceC3748Nl2 taskExecutor) {
        this.b = foregroundProcessor;
        this.a = taskExecutor;
        this.c = workDatabase.L();
    }

    @Override // o.InterfaceC9615sx0
    public InterfaceFutureC8411o11<Void> a(final Context context, final UUID id, final C8880px0 foregroundInfo) {
        E22 u = E22.u();
        this.a.o(new a(u, id, foregroundInfo, context));
        return u;
    }
}
