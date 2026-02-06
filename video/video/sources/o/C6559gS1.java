package o;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.gS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6559gS1 {

    /* renamed from: o.gS1$a */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* renamed from: o.gS1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0282a extends Thread {
            public final int X;

            public C0282a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.X = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.X);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0282a(runnable, this.a, this.b);
        }
    }

    /* renamed from: o.gS1$b */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        public final Handler X;

        public b(Handler handler) {
            this.X = (Handler) C10907yF1.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.X.post((Runnable) C10907yF1.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.X + " is shutting down");
        }
    }

    /* renamed from: o.gS1$c */
    /* loaded from: classes.dex */
    public static class c<T> implements Runnable {
        public Callable<T> X;
        public InterfaceC10929yL<T> Y;
        public Handler Z;

        /* renamed from: o.gS1$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ InterfaceC10929yL X;
            public final /* synthetic */ Object Y;

            public a(InterfaceC10929yL interfaceC10929yL, Object obj) {
                this.X = interfaceC10929yL;
                this.Y = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.X.accept(this.Y);
            }
        }

        public c(Handler handler, Callable<T> callable, InterfaceC10929yL<T> interfaceC10929yL) {
            this.X = callable;
            this.Y = interfaceC10929yL;
            this.Z = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.X.call();
            } catch (Exception unused) {
                t = null;
            }
            this.Z.post(new a(this.Y, t));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new b(handler);
    }

    public static <T> void c(Executor executor, Callable<T> callable, InterfaceC10929yL<T> interfaceC10929yL) {
        executor.execute(new c(C4266St.a(), callable, interfaceC10929yL));
    }

    public static <T> T d(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
