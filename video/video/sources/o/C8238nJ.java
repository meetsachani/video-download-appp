package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.nJ */
/* loaded from: classes.dex */
public class C8238nJ {
    public static final int a = 15;

    /* renamed from: o.nJ$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    @Deprecated
    public static Executor b(Handler handler) {
        Objects.requireNonNull(handler);
        return new ExecutorC7491kJ(handler);
    }

    public static ThreadPoolExecutor c(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: o.lJ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C8238nJ.a(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Handler d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
