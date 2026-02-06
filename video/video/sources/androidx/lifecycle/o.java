package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.f;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import o.KZ0;
import o.MZ0;

/* loaded from: classes.dex */
public class o extends Fragment {
    public static final b Y = new b(null);
    public static final String Z = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    public a X;

    /* loaded from: classes.dex */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public static /* synthetic */ void c(Activity activity) {
        }

        @InterfaceC9511sW0
        public final void a(Activity activity, f.a aVar) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(aVar, "event");
            if (activity instanceof MZ0) {
                ((MZ0) activity).b().l(aVar);
            } else if (activity instanceof KZ0) {
                f b = ((KZ0) activity).b();
                if (b instanceof j) {
                    ((j) b).l(aVar);
                }
            }
        }

        public final o b(Activity activity) {
            C6562gT0.p(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(o.Z);
            C6562gT0.n(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (o) findFragmentByTag;
        }

        @InterfaceC9511sW0
        public final void d(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(o.Z) == null) {
                fragmentManager.beginTransaction().add(new o(), o.Z).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @InterfaceC9511sW0
            public final void a(Activity activity) {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }

        @InterfaceC9511sW0
        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            o.Y.a(activity, f.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }
    }

    @InterfaceC9511sW0
    public static final void b(Activity activity, f.a aVar) {
        Y.a(activity, aVar);
    }

    public static final o f(Activity activity) {
        return Y.b(activity);
    }

    @InterfaceC9511sW0
    public static final void g(Activity activity) {
        Y.d(activity);
    }

    public final void a(f.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = Y;
            Activity activity = getActivity();
            C6562gT0.o(activity, androidx.appcompat.widget.b.r);
            bVar.a(activity, aVar);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public final void h(a aVar) {
        this.X = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.X);
        a(f.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(f.a.ON_DESTROY);
        this.X = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(f.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.X);
        a(f.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.X);
        a(f.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(f.a.ON_STOP);
    }
}
