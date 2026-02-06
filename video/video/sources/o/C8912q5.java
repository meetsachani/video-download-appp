package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.C2327q;
import com.facebook.internal.C2375u;
import com.facebook.internal.C2379y;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.q5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8912q5 {
    @NotNull
    public static final C8912q5 a = new C8912q5();
    @NotNull
    public static final String b;
    @NotNull
    public static final String c = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final long d = 1000;
    public static final ScheduledExecutorService e;
    @Nullable
    public static volatile ScheduledFuture<?> f;
    @NotNull
    public static final Object g;
    @NotNull
    public static final AtomicInteger h;
    @Nullable
    public static volatile X12 i;
    @NotNull
    public static final AtomicBoolean j;
    @Nullable
    public static String k;
    public static long l;
    public static int m;
    @Nullable
    public static WeakReference<Activity> n;

    /* renamed from: o.q5$a */
    /* loaded from: classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityCreated");
            C5370bd c5370bd = C5370bd.a;
            C5370bd.a();
            C8912q5 c8912q5 = C8912q5.a;
            C8912q5.q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityDestroyed");
            C8912q5.a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityPaused");
            C5370bd c5370bd = C5370bd.a;
            C5370bd.a();
            C8912q5.a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityResumed");
            C5370bd c5370bd = C5370bd.a;
            C5370bd.a();
            C8912q5 c8912q5 = C8912q5.a;
            C8912q5.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(bundle, "outState");
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C8912q5 c8912q5 = C8912q5.a;
            C8912q5.m++;
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            com.facebook.internal.V.e.d(com.facebook.b0.APP_EVENTS, C8912q5.b, "onActivityStopped");
            C2327q.b.o();
            C8912q5 c8912q5 = C8912q5.a;
            C8912q5.m--;
        }
    }

    static {
        String canonicalName = C8912q5.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
        e = Executors.newSingleThreadScheduledExecutor();
        g = new Object();
        h = new AtomicInteger(0);
        j = new AtomicBoolean(false);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Activity l() {
        WeakReference<Activity> weakReference = n;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final UUID m() {
        X12 x12;
        if (i == null || (x12 = i) == null) {
            return null;
        }
        return x12.e();
    }

    @InterfaceC9511sW0
    @HT1({HT1.a.Y})
    public static final boolean o() {
        if (m == 0) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean p() {
        return j.get();
    }

    @InterfaceC9511sW0
    public static final void q(@Nullable Activity activity) {
        e.execute(new Runnable() { // from class: o.o5
            @Override // java.lang.Runnable
            public final void run() {
                C8912q5.r();
            }
        });
    }

    public static final void r() {
        if (i == null) {
            i = X12.g.b();
        }
    }

    public static final void u(final long j2, final String str) {
        C6562gT0.p(str, "$activityName");
        if (i == null) {
            i = new X12(Long.valueOf(j2), null, null, 4, null);
        }
        X12 x12 = i;
        if (x12 != null) {
            x12.n(Long.valueOf(j2));
        }
        if (h.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: o.n5
                @Override // java.lang.Runnable
                public final void run() {
                    C8912q5.v(j2, str);
                }
            };
            synchronized (g) {
                f = e.schedule(runnable, a.n(), TimeUnit.SECONDS);
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
        }
        long j3 = l;
        long j4 = 0;
        if (j3 > 0) {
            j4 = (j2 - j3) / 1000;
        }
        C3542Lj c3542Lj = C3542Lj.a;
        C3542Lj.e(str, j4);
        X12 x122 = i;
        if (x122 == null) {
            return;
        }
        x122.p();
    }

    public static final void v(long j2, String str) {
        C6562gT0.p(str, "$activityName");
        if (i == null) {
            i = new X12(Long.valueOf(j2), null, null, 4, null);
        }
        if (h.get() <= 0) {
            Z12 z12 = Z12.a;
            Z12.e(str, i, k);
            X12.g.a();
            i = null;
        }
        synchronized (g) {
            f = null;
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    @InterfaceC9511sW0
    public static final void w(@NotNull Activity activity) {
        C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        n = new WeakReference<>(activity);
        h.incrementAndGet();
        a.k();
        final long currentTimeMillis = System.currentTimeMillis();
        l = currentTimeMillis;
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        final String u = com.facebook.internal.l0.u(activity);
        SE se = SE.a;
        SE.l(activity);
        C5396bj1 c5396bj1 = C5396bj1.a;
        C5396bj1.d(activity);
        C6857hh2 c6857hh2 = C6857hh2.a;
        C6857hh2.i(activity);
        VO0 vo0 = VO0.a;
        VO0.b();
        final Context applicationContext = activity.getApplicationContext();
        e.execute(new Runnable() { // from class: o.l5
            @Override // java.lang.Runnable
            public final void run() {
                C8912q5.x(currentTimeMillis, u, applicationContext);
            }
        });
    }

    public static final void x(long j2, String str, Context context) {
        Long f2;
        X12 x12;
        C6562gT0.p(str, "$activityName");
        X12 x122 = i;
        if (x122 == null) {
            f2 = null;
        } else {
            f2 = x122.f();
        }
        if (i == null) {
            i = new X12(Long.valueOf(j2), null, null, 4, null);
            Z12 z12 = Z12.a;
            String str2 = k;
            C6562gT0.o(context, "appContext");
            Z12.c(str, null, str2, context);
        } else if (f2 != null) {
            long longValue = j2 - f2.longValue();
            if (longValue > a.n() * 1000) {
                Z12 z122 = Z12.a;
                Z12.e(str, i, k);
                String str3 = k;
                C6562gT0.o(context, "appContext");
                Z12.c(str, null, str3, context);
                i = new X12(Long.valueOf(j2), null, null, 4, null);
            } else if (longValue > 1000 && (x12 = i) != null) {
                x12.k();
            }
        }
        X12 x123 = i;
        if (x123 != null) {
            x123.n(Long.valueOf(j2));
        }
        X12 x124 = i;
        if (x124 == null) {
            return;
        }
        x124.p();
    }

    @InterfaceC9511sW0
    public static final void y(@NotNull Application application, @Nullable String str) {
        C6562gT0.p(application, "application");
        if (!j.compareAndSet(false, true)) {
            return;
        }
        C2375u c2375u = C2375u.a;
        C2375u.a(C2375u.b.CodelessEvents, new C2375u.a() { // from class: o.p5
            @Override // com.facebook.internal.C2375u.a
            public final void a(boolean z) {
                C8912q5.z(z);
            }
        });
        k = str;
        application.registerActivityLifecycleCallbacks(new a());
    }

    public static final void z(boolean z) {
        if (z) {
            SE se = SE.a;
            SE.f();
            return;
        }
        SE se2 = SE.a;
        SE.e();
    }

    public final void k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (g) {
            try {
                if (f != null && (scheduledFuture = f) != null) {
                    scheduledFuture.cancel(false);
                }
                f = null;
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int n() {
        com.facebook.internal.C c2 = com.facebook.internal.C.a;
        com.facebook.M m2 = com.facebook.M.a;
        C2379y f2 = com.facebook.internal.C.f(com.facebook.M.o());
        if (f2 == null) {
            FK fk = FK.a;
            return FK.a();
        }
        return f2.t();
    }

    public final void s(Activity activity) {
        SE se = SE.a;
        SE.j(activity);
    }

    public final void t(Activity activity) {
        AtomicInteger atomicInteger = h;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(b, c);
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        final String u = com.facebook.internal.l0.u(activity);
        SE se = SE.a;
        SE.k(activity);
        e.execute(new Runnable() { // from class: o.m5
            @Override // java.lang.Runnable
            public final void run() {
                C8912q5.u(currentTimeMillis, u);
            }
        });
    }
}
