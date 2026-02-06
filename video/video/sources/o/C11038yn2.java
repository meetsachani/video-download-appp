package o;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.yn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11038yn2 {
    @MB
    public String a = null;
    @MB
    public Boolean b = null;
    @MB
    public Integer c = null;
    @MB
    public Thread.UncaughtExceptionHandler d = null;
    @MB
    public ThreadFactory e = null;

    /* renamed from: o.yn2$a */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        public final /* synthetic */ ThreadFactory a;
        public final /* synthetic */ String b;
        public final /* synthetic */ AtomicLong c;
        public final /* synthetic */ Boolean d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ Thread.UncaughtExceptionHandler f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = threadFactory;
            this.b = str;
            this.c = atomicLong;
            this.d = bool;
            this.e = num;
            this.f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(runnable);
            String str = this.b;
            if (str != null) {
                AtomicLong atomicLong = this.c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(C11038yn2.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    public static ThreadFactory c(C11038yn2 c11038yn2) {
        AtomicLong atomicLong;
        String str = c11038yn2.a;
        Boolean bool = c11038yn2.b;
        Integer num = c11038yn2.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c11038yn2.d;
        ThreadFactory threadFactory = c11038yn2.e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        ThreadFactory threadFactory2 = threadFactory;
        if (str != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        return new a(threadFactory2, str, atomicLong, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    @QB
    public ThreadFactory b() {
        return c(this);
    }

    public C11038yn2 e(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public C11038yn2 f(String str) {
        d(str, 0);
        this.a = str;
        return this;
    }

    public C11038yn2 g(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "Thread priority (%s) must be >= %s", i, 1);
        if (i <= 10) {
            z2 = true;
        }
        C10664xF1.m(z2, "Thread priority (%s) must be <= %s", i, 10);
        this.c = Integer.valueOf(i);
        return this;
    }

    public C11038yn2 h(ThreadFactory threadFactory) {
        this.e = (ThreadFactory) C10664xF1.E(threadFactory);
        return this;
    }

    public C11038yn2 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.d = (Thread.UncaughtExceptionHandler) C10664xF1.E(uncaughtExceptionHandler);
        return this;
    }
}
