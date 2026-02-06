package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.o;
import o.C3702Na0;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import o.KZ0;

/* loaded from: classes.dex */
public final class n implements KZ0 {
    public static final long e1 = 700;
    public int X;
    public int Y;
    public Handler Z0;
    public static final b d1 = new b(null);
    public static final n f1 = new n();
    public boolean Z = true;
    public boolean Y0 = true;
    public final j a1 = new j(this);
    public final Runnable b1 = new Runnable() { // from class: o.ZH1
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.n.j(androidx.lifecycle.n.this);
        }
    };
    public final o.a c1 = new d();

    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        @InterfaceC9511sW0
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @InterfaceC9511sW0
        public final KZ0 a() {
            return n.f1;
        }

        @InterfaceC9511sW0
        public final void c(Context context) {
            C6562gT0.p(context, "context");
            n.f1.i(context);
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends C3702Na0 {

        /* loaded from: classes.dex */
        public static final class a extends C3702Na0 {
            final /* synthetic */ n this$0;

            public a(n nVar) {
                this.this$0 = nVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                this.this$0.g();
            }
        }

        public c() {
        }

        @Override // o.C3702Na0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            if (Build.VERSION.SDK_INT < 29) {
                o.Y.b(activity).h(n.this.c1);
            }
        }

        @Override // o.C3702Na0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            n.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            a.a(activity, new a(n.this));
        }

        @Override // o.C3702Na0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            n.this.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements o.a {
        public d() {
        }

        @Override // androidx.lifecycle.o.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.o.a
        public void onResume() {
            n.this.f();
        }

        @Override // androidx.lifecycle.o.a
        public void onStart() {
            n.this.g();
        }
    }

    public static final void j(n nVar) {
        C6562gT0.p(nVar, "this$0");
        nVar.k();
        nVar.l();
    }

    @InterfaceC9511sW0
    public static final KZ0 m() {
        return d1.a();
    }

    @InterfaceC9511sW0
    public static final void n(Context context) {
        d1.c(context);
    }

    @Override // o.KZ0
    public f b() {
        return this.a1;
    }

    public final void e() {
        int i = this.Y - 1;
        this.Y = i;
        if (i == 0) {
            Handler handler = this.Z0;
            C6562gT0.m(handler);
            handler.postDelayed(this.b1, 700L);
        }
    }

    public final void f() {
        int i = this.Y + 1;
        this.Y = i;
        if (i == 1) {
            if (this.Z) {
                this.a1.l(f.a.ON_RESUME);
                this.Z = false;
                return;
            }
            Handler handler = this.Z0;
            C6562gT0.m(handler);
            handler.removeCallbacks(this.b1);
        }
    }

    public final void g() {
        int i = this.X + 1;
        this.X = i;
        if (i == 1 && this.Y0) {
            this.a1.l(f.a.ON_START);
            this.Y0 = false;
        }
    }

    public final void h() {
        this.X--;
        l();
    }

    public final void i(Context context) {
        C6562gT0.p(context, "context");
        this.Z0 = new Handler();
        this.a1.l(f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C6562gT0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.Y == 0) {
            this.Z = true;
            this.a1.l(f.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.X == 0 && this.Z) {
            this.a1.l(f.a.ON_STOP);
            this.Y0 = true;
        }
    }
}
