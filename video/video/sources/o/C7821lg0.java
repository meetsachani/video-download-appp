package o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: o.lg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7821lg0 implements GT1 {
    public final Executor a;

    /* renamed from: o.lg0$a */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public final /* synthetic */ Handler X;

        public a(Handler handler) {
            this.X = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.X.post(runnable);
        }
    }

    /* renamed from: o.lg0$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public final AbstractC5091aS1 X;
        public final DT1 Y;
        public final Runnable Z;

        public b(AbstractC5091aS1 abstractC5091aS1, DT1 dt1, Runnable runnable) {
            this.X = abstractC5091aS1;
            this.Y = dt1;
            this.Z = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.K()) {
                this.X.o("canceled-at-delivery");
                return;
            }
            if (this.Y.b()) {
                this.X.l(this.Y.a);
            } else {
                this.X.j(this.Y.c);
            }
            if (this.Y.d) {
                this.X.g("intermediate-response");
            } else {
                this.X.o("done");
            }
            Runnable runnable = this.Z;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C7821lg0(Handler handler) {
        this.a = new a(handler);
    }

    @Override // o.GT1
    public void a(AbstractC5091aS1<?> abstractC5091aS1, DT1<?> dt1, Runnable runnable) {
        abstractC5091aS1.L();
        abstractC5091aS1.g("post-response");
        this.a.execute(new b(abstractC5091aS1, dt1, runnable));
    }

    @Override // o.GT1
    public void b(AbstractC5091aS1<?> abstractC5091aS1, C6524gJ2 c6524gJ2) {
        abstractC5091aS1.g("post-error");
        this.a.execute(new b(abstractC5091aS1, DT1.a(c6524gJ2), null));
    }

    @Override // o.GT1
    public void c(AbstractC5091aS1<?> abstractC5091aS1, DT1<?> dt1) {
        a(abstractC5091aS1, dt1, null);
    }

    public C7821lg0(Executor executor) {
        this.a = executor;
    }
}
