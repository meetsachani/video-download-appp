package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o.C10763xf2;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class f {
    @NotNull
    public static final a d = new a(null);
    @NotNull
    public static final f e = new f();
    @NotNull
    public final ExecutorService a;
    @NotNull
    public final ScheduledExecutorService b;
    @NotNull
    public final Executor c;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final ExecutorService b() {
            return f.e.a;
        }

        @InterfaceC9511sW0
        @NotNull
        public final Executor c() {
            return f.e.c;
        }

        public final boolean d() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale locale = Locale.US;
            C6562gT0.o(locale, "US");
            String lowerCase = property.toLowerCase(locale);
            C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return C10763xf2.n3(lowerCase, "android", false, 2, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final ScheduledExecutorService e() {
            return f.e.b;
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Executor {
        @NotNull
        public static final a Y = new a(null);
        public static final int Z = 15;
        @NotNull
        public final ThreadLocal<Integer> X = new ThreadLocal<>();

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public final int b() {
            Integer num = this.X.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.X.remove();
                return intValue;
            }
            this.X.set(Integer.valueOf(intValue));
            return intValue;
        }

        public final int c() {
            Integer num = this.X.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.X.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable runnable) {
            C6562gT0.p(runnable, "command");
            try {
                if (c() <= 15) {
                    runnable.run();
                } else {
                    f.d.b().execute(runnable);
                }
                b();
            } catch (Throwable th) {
                b();
                throw th;
            }
        }
    }

    public f() {
        ExecutorService a2;
        if (!d.d()) {
            a2 = Executors.newCachedThreadPool();
            C6562gT0.o(a2, "newCachedThreadPool()");
        } else {
            a2 = C2330b.b.a();
        }
        this.a = a2;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        C6562gT0.o(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.b = newSingleThreadScheduledExecutor;
        this.c = new b();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ExecutorService e() {
        return d.b();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Executor f() {
        return d.c();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final ScheduledExecutorService g() {
        return d.e();
    }
}
