package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class W00 extends AbstractC3846Ol2 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new a());
    public volatile Handler c;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public static final String c = "arch_disk_io_";
        public final AtomicInteger a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(c + this.a.getAndIncrement());
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // o.AbstractC3846Ol2
    public void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // o.AbstractC3846Ol2
    public boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3846Ol2
    public void d(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                try {
                    if (this.c == null) {
                        this.c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.c.post(runnable);
    }
}
