package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: o.o02  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8408o02 {
    public static final int i = 1;
    public static final int j = 0;
    public HandlerThread b;
    public Handler c;
    public final int f;
    public final int g;
    public final String h;
    public final Object a = new Object();
    public Handler.Callback e = new a();
    public int d = 0;

    /* renamed from: o.o02$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return true;
                }
                C8408o02.this.d((Runnable) message.obj);
                return true;
            }
            C8408o02.this.c();
            return true;
        }
    }

    /* renamed from: o.o02$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Callable X;
        public final /* synthetic */ Handler Y;
        public final /* synthetic */ d Z;

        /* renamed from: o.o02$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Object X;

            public a(Object obj) {
                this.X = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.Z.a(this.X);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.X = callable;
            this.Y = handler;
            this.Z = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.X.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.Y.post(new a(obj));
        }
    }

    /* renamed from: o.o02$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ AtomicReference X;
        public final /* synthetic */ Callable Y;
        public final /* synthetic */ AtomicBoolean Y0;
        public final /* synthetic */ ReentrantLock Z;
        public final /* synthetic */ Condition Z0;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.X = atomicReference;
            this.Y = callable;
            this.Z = reentrantLock;
            this.Y0 = atomicBoolean;
            this.Z0 = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.set(this.Y.call());
            } catch (Exception unused) {
            }
            this.Z.lock();
            try {
                this.Y0.set(false);
                this.Z0.signal();
            } finally {
                this.Z.unlock();
            }
        }
    }

    /* renamed from: o.o02$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public C8408o02(String str, int i2, int i3) {
        this.h = str;
        this.g = i2;
        this.f = i3;
    }

    public int a() {
        int i2;
        synchronized (this.a) {
            i2 = this.d;
        }
        return i2;
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void c() {
        synchronized (this.a) {
            try {
                if (this.c.hasMessages(1)) {
                    return;
                }
                this.b.quit();
                this.b = null;
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                    this.b = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(this.b.getLooper(), this.e);
                    this.d++;
                }
                this.c.removeMessages(0);
                Handler handler = this.c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, C4266St.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i2) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t = (T) atomicReference.get();
                reentrantLock.unlock();
                return t;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t2 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t2;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
