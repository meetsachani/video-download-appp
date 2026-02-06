package o;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.bg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5383bg0 {
    public static final Logger c = Logger.getLogger(C5383bg0.class.getName());
    @InterfaceC7980mF0("this")
    @MB
    public a a;
    @InterfaceC7980mF0("this")
    public boolean b;

    /* renamed from: o.bg0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public final Runnable a;
        public final Executor b;
        @MB
        public a c;

        public a(Runnable runnable, Executor executor, @MB a aVar) {
            this.a = runnable;
            this.b = executor;
            this.c = aVar;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C10664xF1.F(runnable, "Runnable was null.");
        C10664xF1.F(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (!this.b) {
                    this.a = new a(runnable, executor, this.a);
                } else {
                    c(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                a aVar = this.a;
                a aVar2 = null;
                this.a = null;
                while (aVar != null) {
                    a aVar3 = aVar.c;
                    aVar.c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    c(aVar2.a, aVar2.b);
                    aVar2 = aVar2.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
