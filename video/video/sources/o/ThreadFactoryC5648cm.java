package o;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.cm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ThreadFactoryC5648cm implements ThreadFactory {
    public final AtomicLong a;
    public final ThreadFactory b;
    public final Thread.UncaughtExceptionHandler c;
    public final String d;
    public final Integer e;
    public final Boolean f;

    /* renamed from: o.cm$b */
    /* loaded from: classes4.dex */
    public static class b implements InterfaceC4943Zq<ThreadFactoryC5648cm> {
        public ThreadFactory X;
        public Thread.UncaughtExceptionHandler Y;
        public Integer Y0;
        public String Z;
        public Boolean Z0;

        @Override // o.InterfaceC4943Zq
        /* renamed from: f */
        public ThreadFactoryC5648cm build() {
            ThreadFactoryC5648cm threadFactoryC5648cm = new ThreadFactoryC5648cm(this);
            j();
            return threadFactoryC5648cm;
        }

        public b g(boolean z) {
            this.Z0 = Boolean.valueOf(z);
            return this;
        }

        public b h(String str) {
            C11147zE2.V(str, "pattern", new Object[0]);
            this.Z = str;
            return this;
        }

        public b i(int i) {
            this.Y0 = Integer.valueOf(i);
            return this;
        }

        public void j() {
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.Y0 = null;
            this.Z0 = null;
        }

        public b k(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            C11147zE2.V(uncaughtExceptionHandler, "handler", new Object[0]);
            this.Y = uncaughtExceptionHandler;
            return this;
        }

        public b l(ThreadFactory threadFactory) {
            C11147zE2.V(threadFactory, "factory", new Object[0]);
            this.X = threadFactory;
            return this;
        }
    }

    public final Boolean a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final Integer c() {
        return this.e;
    }

    public long d() {
        return this.a.get();
    }

    public final Thread.UncaughtExceptionHandler e() {
        return this.c;
    }

    public final ThreadFactory f() {
        return this.b;
    }

    public final void g(Thread thread) {
        if (b() != null) {
            thread.setName(String.format(b(), Long.valueOf(this.a.incrementAndGet())));
        }
        if (e() != null) {
            thread.setUncaughtExceptionHandler(e());
        }
        if (c() != null) {
            thread.setPriority(c().intValue());
        }
        if (a() != null) {
            thread.setDaemon(a().booleanValue());
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = f().newThread(runnable);
        g(newThread);
        return newThread;
    }

    public ThreadFactoryC5648cm(b bVar) {
        if (bVar.X != null) {
            this.b = bVar.X;
        } else {
            this.b = Executors.defaultThreadFactory();
        }
        this.d = bVar.Z;
        this.e = bVar.Y0;
        this.f = bVar.Z0;
        this.c = bVar.Y;
        this.a = new AtomicLong();
    }
}
