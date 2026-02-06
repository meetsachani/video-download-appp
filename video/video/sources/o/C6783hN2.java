package o;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import o.TM2;

/* renamed from: o.hN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6783hN2 implements InterfaceC6268fJ1 {
    public static final String c = AbstractC6949i41.f("WorkProgressUpdater");
    public final WorkDatabase a;
    public final InterfaceC3748Nl2 b;

    /* renamed from: o.hN2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ UUID X;
        public final /* synthetic */ androidx.work.b Y;
        public final /* synthetic */ E22 Z;

        public a(final UUID val$id, final androidx.work.b val$data, final E22 val$future) {
            this.X = val$id;
            this.Y = val$data;
            this.Z = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8501oN2 j;
            String uuid = this.X.toString();
            AbstractC6949i41 c = AbstractC6949i41.c();
            String str = C6783hN2.c;
            c.a(str, String.format("Updating progress for %s (%s)", this.X, this.Y), new Throwable[0]);
            C6783hN2.this.a.c();
            try {
                j = C6783hN2.this.a.L().j(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (j != null) {
                if (j.b == TM2.a.RUNNING) {
                    C6783hN2.this.a.K().d(new C6042eN2(uuid, this.Y));
                } else {
                    AbstractC6949i41.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.Z.p(null);
                C6783hN2.this.a.A();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public C6783hN2(WorkDatabase workDatabase, InterfaceC3748Nl2 taskExecutor) {
        this.a = workDatabase;
        this.b = taskExecutor;
    }

    @Override // o.InterfaceC6268fJ1
    public InterfaceFutureC8411o11<Void> a(final Context context, final UUID id, final androidx.work.b data) {
        E22 u = E22.u();
        this.b.o(new a(id, data, u));
        return u;
    }
}
