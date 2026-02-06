package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC10454wN2;
import o.AbstractC7277jQ0;
import o.C8893q00;
import o.GP0;
import o.InterfaceC9020qW1;

/* loaded from: classes.dex */
public final class a {
    public static final int m = 20;
    public final Executor a;
    public final Executor b;
    public final AbstractC10454wN2 c;
    public final AbstractC7277jQ0 d;
    public final InterfaceC9020qW1 e;
    public final GP0 f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0054a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);
        public final /* synthetic */ boolean b;

        public ThreadFactoryC0054a(final boolean val$isTaskExecutor) {
            this.b = val$isTaskExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            if (this.b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.a.incrementAndGet());
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        a a();
    }

    public a(b builder) {
        Executor executor = builder.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = builder.d;
        if (executor2 == null) {
            this.l = true;
            this.b = a(true);
        } else {
            this.l = false;
            this.b = executor2;
        }
        AbstractC10454wN2 abstractC10454wN2 = builder.b;
        if (abstractC10454wN2 == null) {
            this.c = AbstractC10454wN2.c();
        } else {
            this.c = abstractC10454wN2;
        }
        AbstractC7277jQ0 abstractC7277jQ0 = builder.c;
        if (abstractC7277jQ0 == null) {
            this.d = AbstractC7277jQ0.c();
        } else {
            this.d = abstractC7277jQ0;
        }
        InterfaceC9020qW1 interfaceC9020qW1 = builder.e;
        if (interfaceC9020qW1 == null) {
            this.e = new C8893q00();
        } else {
            this.e = interfaceC9020qW1;
        }
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.f = builder.f;
        this.g = builder.g;
    }

    public final Executor a(boolean isTaskExecutor) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(isTaskExecutor));
    }

    public final ThreadFactory b(boolean isTaskExecutor) {
        return new ThreadFactoryC0054a(isTaskExecutor);
    }

    public String c() {
        return this.g;
    }

    public GP0 d() {
        return this.f;
    }

    public Executor e() {
        return this.a;
    }

    public AbstractC7277jQ0 f() {
        return this.d;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.k;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.h;
    }

    public InterfaceC9020qW1 k() {
        return this.e;
    }

    public Executor l() {
        return this.b;
    }

    public AbstractC10454wN2 m() {
        return this.c;
    }

    public boolean n() {
        return this.l;
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Executor a;
        public AbstractC10454wN2 b;
        public AbstractC7277jQ0 c;
        public Executor d;
        public InterfaceC9020qW1 e;
        public GP0 f;
        public String g;
        public int h;
        public int i;
        public int j;
        public int k;

        public b() {
            this.h = 4;
            this.i = 0;
            this.j = Integer.MAX_VALUE;
            this.k = 20;
        }

        public a a() {
            return new a(this);
        }

        public b b(String processName) {
            this.g = processName;
            return this;
        }

        public b c(Executor executor) {
            this.a = executor;
            return this;
        }

        public b d(GP0 exceptionHandler) {
            this.f = exceptionHandler;
            return this;
        }

        public b e(AbstractC7277jQ0 inputMergerFactory) {
            this.c = inputMergerFactory;
            return this;
        }

        public b f(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId >= 1000) {
                this.i = minJobSchedulerId;
                this.j = maxJobSchedulerId;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        public b g(int maxSchedulerLimit) {
            if (maxSchedulerLimit >= 20) {
                this.k = Math.min(maxSchedulerLimit, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
        }

        public b h(int loggingLevel) {
            this.h = loggingLevel;
            return this;
        }

        public b i(InterfaceC9020qW1 runnableScheduler) {
            this.e = runnableScheduler;
            return this;
        }

        public b j(Executor taskExecutor) {
            this.d = taskExecutor;
            return this;
        }

        public b k(AbstractC10454wN2 workerFactory) {
            this.b = workerFactory;
            return this;
        }

        public b(a configuration) {
            this.a = configuration.a;
            this.b = configuration.c;
            this.c = configuration.d;
            this.d = configuration.b;
            this.h = configuration.h;
            this.i = configuration.i;
            this.j = configuration.j;
            this.k = configuration.k;
            this.e = configuration.e;
            this.f = configuration.f;
            this.g = configuration.g;
        }
    }
}
