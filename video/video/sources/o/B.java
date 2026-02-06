package o;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.HT1;
import o.SQ0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class B {
    public static final int b = 500;
    @NotNull
    public static final B a = new B();
    public static final int c = Process.myUid();
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    @Nullable
    public static String e = "";
    @NotNull
    public static final Runnable f = new Runnable() { // from class: o.A
        @Override // java.lang.Runnable
        public final void run() {
            B.b();
        }
    };

    public static final void b() {
        if (!SQ.e(B.class)) {
            try {
                com.facebook.M m = com.facebook.M.a;
                Object systemService = com.facebook.M.n().getSystemService(androidx.appcompat.widget.b.r);
                if (systemService != null) {
                    c((ActivityManager) systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception unused) {
            } catch (Throwable th) {
                SQ.c(th, B.class);
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void c(@Nullable ActivityManager activityManager) {
        if (!SQ.e(B.class) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == c) {
                            Thread thread = Looper.getMainLooper().getThread();
                            C6562gT0.o(thread, "getMainLooper().thread");
                            C5086aR0 c5086aR0 = C5086aR0.a;
                            String g = C5086aR0.g(thread);
                            if (!C6562gT0.g(g, e) && C5086aR0.k(thread)) {
                                e = g;
                                SQ0.a aVar = SQ0.a.a;
                                SQ0.a.a(processErrorStateInfo.shortMsg, g).g();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, B.class);
            }
        }
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2
    public static final void d() {
        if (SQ.e(B.class)) {
            return;
        }
        try {
            d.scheduleWithFixedDelay(f, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            SQ.c(th, B.class);
        }
    }
}
