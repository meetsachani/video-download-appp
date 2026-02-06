package o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.C5128ad0;

/* loaded from: classes.dex */
public final class W4 {
    public final boolean a;
    public final Executor b;
    public final Map<InterfaceC6575gX0, d> c;
    public final ReferenceQueue<C5128ad0<?>> d;
    public C5128ad0.a e;
    public volatile boolean f;
    public volatile c g;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: o.W4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0238a implements Runnable {
            public final /* synthetic */ Runnable X;

            public RunnableC0238a(Runnable runnable) {
                this.X = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.X.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0238a(runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            W4.this.b();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class d extends WeakReference<C5128ad0<?>> {
        public final InterfaceC6575gX0 a;
        public final boolean b;
        public InterfaceC5580cT1<?> c;

        public d(InterfaceC6575gX0 interfaceC6575gX0, C5128ad0<?> c5128ad0, ReferenceQueue<? super C5128ad0<?>> referenceQueue, boolean z) {
            super(c5128ad0, referenceQueue);
            InterfaceC5580cT1<?> interfaceC5580cT1;
            this.a = (InterfaceC6575gX0) C10175vF1.e(interfaceC6575gX0);
            if (c5128ad0.d() && z) {
                interfaceC5580cT1 = (InterfaceC5580cT1) C10175vF1.e(c5128ad0.c());
            } else {
                interfaceC5580cT1 = null;
            }
            this.c = interfaceC5580cT1;
            this.b = c5128ad0.d();
        }

        public void a() {
            this.c = null;
            clear();
        }
    }

    public W4(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    public synchronized void a(InterfaceC6575gX0 interfaceC6575gX0, C5128ad0<?> c5128ad0) {
        d put = this.c.put(interfaceC6575gX0, new d(interfaceC6575gX0, c5128ad0, this.d, this.a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f) {
            try {
                c((d) this.d.remove());
                c cVar = this.g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(d dVar) {
        InterfaceC5580cT1<?> interfaceC5580cT1;
        synchronized (this) {
            this.c.remove(dVar.a);
            if (dVar.b && (interfaceC5580cT1 = dVar.c) != null) {
                this.e.b(dVar.a, new C5128ad0<>(interfaceC5580cT1, true, false, dVar.a, this.e));
            }
        }
    }

    public synchronized void d(InterfaceC6575gX0 interfaceC6575gX0) {
        d remove = this.c.remove(interfaceC6575gX0);
        if (remove != null) {
            remove.a();
        }
    }

    public synchronized C5128ad0<?> e(InterfaceC6575gX0 interfaceC6575gX0) {
        d dVar = this.c.get(interfaceC6575gX0);
        if (dVar == null) {
            return null;
        }
        C5128ad0<?> c5128ad0 = dVar.get();
        if (c5128ad0 == null) {
            c(dVar);
        }
        return c5128ad0;
    }

    public void f(c cVar) {
        this.g = cVar;
    }

    public void g(C5128ad0.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    public void h() {
        this.f = true;
        Executor executor = this.b;
        if (executor instanceof ExecutorService) {
            C8325ng0.d((ExecutorService) executor);
        }
    }

    public W4(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}
