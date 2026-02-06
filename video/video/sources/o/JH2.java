package o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.OH2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class JH2 implements ViewTreeObserver.OnGlobalLayoutListener {
    @NotNull
    public static final a Y0 = new a(null);
    @NotNull
    public static final Map<Integer, JH2> Z0 = new HashMap();
    public static final int a1 = 300;
    @NotNull
    public final WeakReference<Activity> X;
    @NotNull
    public final Handler Y;
    @NotNull
    public final AtomicBoolean Z;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void a(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            int hashCode = activity.hashCode();
            Map b = JH2.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b.get(valueOf);
            if (obj == null) {
                obj = new JH2(activity, null);
                b.put(valueOf, obj);
            }
            JH2.c((JH2) obj);
        }

        @InterfaceC9511sW0
        public final void b(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            JH2 jh2 = (JH2) JH2.b().remove(Integer.valueOf(activity.hashCode()));
            if (jh2 == null) {
                return;
            }
            JH2.d(jh2);
        }

        public a() {
        }
    }

    public /* synthetic */ JH2(Activity activity, C9516sY c9516sY) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (SQ.e(JH2.class)) {
            return null;
        }
        try {
            return Z0;
        } catch (Throwable th) {
            SQ.c(th, JH2.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(JH2 jh2) {
        if (SQ.e(JH2.class)) {
            return;
        }
        try {
            jh2.g();
        } catch (Throwable th) {
            SQ.c(th, JH2.class);
        }
    }

    public static final /* synthetic */ void d(JH2 jh2) {
        if (SQ.e(JH2.class)) {
            return;
        }
        try {
            jh2.i();
        } catch (Throwable th) {
            SQ.c(th, JH2.class);
        }
    }

    public static final void f(JH2 jh2) {
        if (!SQ.e(JH2.class)) {
            try {
                C6562gT0.p(jh2, "this$0");
                try {
                    C5370bd c5370bd = C5370bd.a;
                    View e = C5370bd.e(jh2.X.get());
                    Activity activity = jh2.X.get();
                    if (e != null && activity != null) {
                        C6359fh2 c6359fh2 = C6359fh2.a;
                        for (View view : C6359fh2.a(e)) {
                            A02 a02 = A02.a;
                            if (!A02.g(view)) {
                                C6359fh2 c6359fh22 = C6359fh2.a;
                                String d = C6359fh2.d(view);
                                if (d.length() > 0 && d.length() <= 300) {
                                    OH2.a aVar = OH2.Z0;
                                    String localClassName = activity.getLocalClassName();
                                    C6562gT0.o(localClassName, "activity.localClassName");
                                    aVar.d(view, e, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, JH2.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void h(@NotNull Activity activity) {
        if (SQ.e(JH2.class)) {
            return;
        }
        try {
            Y0.a(activity);
        } catch (Throwable th) {
            SQ.c(th, JH2.class);
        }
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull Activity activity) {
        if (SQ.e(JH2.class)) {
            return;
        }
        try {
            Y0.b(activity);
        } catch (Throwable th) {
            SQ.c(th, JH2.class);
        }
    }

    public final void e() {
        if (SQ.e(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: o.IH2
                @Override // java.lang.Runnable
                public final void run() {
                    JH2.f(JH2.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.Y.post(runnable);
            }
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void g() {
        if (!SQ.e(this)) {
            try {
                if (!this.Z.getAndSet(true)) {
                    C5370bd c5370bd = C5370bd.a;
                    View e = C5370bd.e(this.X.get());
                    if (e != null) {
                        ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            e();
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void i() {
        if (!SQ.e(this)) {
            try {
                if (this.Z.getAndSet(false)) {
                    C5370bd c5370bd = C5370bd.a;
                    View e = C5370bd.e(this.X.get());
                    if (e != null) {
                        ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                        if (!viewTreeObserver.isAlive()) {
                            return;
                        }
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (SQ.e(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public JH2(Activity activity) {
        this.X = new WeakReference<>(activity);
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new AtomicBoolean(false);
    }
}
