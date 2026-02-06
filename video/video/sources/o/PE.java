package o;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.C2326p;
import com.facebook.appevents.C2327q;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.lang.ref.WeakReference;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class PE {
    @NotNull
    public static final PE a = new PE();

    /* loaded from: classes2.dex */
    public static final class a implements View.OnClickListener {
        @NotNull
        public C2532Be0 X;
        @NotNull
        public WeakReference<View> Y;
        @Nullable
        public View.OnClickListener Y0;
        @NotNull
        public WeakReference<View> Z;
        public boolean Z0;

        public a(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            this.X = c2532Be0;
            this.Y = new WeakReference<>(view2);
            this.Z = new WeakReference<>(view);
            C9455sH2 c9455sH2 = C9455sH2.a;
            this.Y0 = C9455sH2.g(view2);
            this.Z0 = true;
        }

        public final boolean a() {
            return this.Z0;
        }

        public final void b(boolean z) {
            this.Z0 = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (!SQ.e(this)) {
                try {
                    if (!SQ.e(this) && !SQ.e(this)) {
                        C6562gT0.p(view, C9698tH2.A);
                        View.OnClickListener onClickListener = this.Y0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        View view2 = this.Z.get();
                        View view3 = this.Y.get();
                        if (view2 != null && view3 != null) {
                            PE pe = PE.a;
                            PE.d(this.X, view2, view3);
                        }
                    }
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements AdapterView.OnItemClickListener {
        @NotNull
        public C2532Be0 X;
        @NotNull
        public WeakReference<AdapterView<?>> Y;
        @Nullable
        public AdapterView.OnItemClickListener Y0;
        @NotNull
        public WeakReference<View> Z;
        public boolean Z0;

        public b(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull AdapterView<?> adapterView) {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(adapterView, "hostView");
            this.X = c2532Be0;
            this.Y = new WeakReference<>(adapterView);
            this.Z = new WeakReference<>(view);
            this.Y0 = adapterView.getOnItemClickListener();
            this.Z0 = true;
        }

        public final boolean a() {
            return this.Z0;
        }

        public final void b(boolean z) {
            this.Z0 = z;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@Nullable AdapterView<?> adapterView, @NotNull View view, int i, long j) {
            C6562gT0.p(view, C9698tH2.A);
            AdapterView.OnItemClickListener onItemClickListener = this.Y0;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = this.Z.get();
            AdapterView<?> adapterView2 = this.Y.get();
            if (view2 != null && adapterView2 != null) {
                PE pe = PE.a;
                PE.d(this.X, view2, adapterView2);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final a b(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
        if (SQ.e(PE.class)) {
            return null;
        }
        try {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            return new a(c2532Be0, view, view2);
        } catch (Throwable th) {
            SQ.c(th, PE.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final b c(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull AdapterView<?> adapterView) {
        if (SQ.e(PE.class)) {
            return null;
        }
        try {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(adapterView, "hostView");
            return new b(c2532Be0, view, adapterView);
        } catch (Throwable th) {
            SQ.c(th, PE.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull C2532Be0 c2532Be0, @NotNull View view, @NotNull View view2) {
        if (SQ.e(PE.class)) {
            return;
        }
        try {
            C6562gT0.p(c2532Be0, "mapping");
            C6562gT0.p(view, "rootView");
            C6562gT0.p(view2, "hostView");
            final String d = c2532Be0.d();
            final Bundle b2 = UE.f.b(c2532Be0, view, view2);
            a.f(b2);
            com.facebook.M m = com.facebook.M.a;
            com.facebook.M.y().execute(new Runnable() { // from class: o.OE
                @Override // java.lang.Runnable
                public final void run() {
                    PE.e(d, b2);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, PE.class);
        }
    }

    public static final void e(String str, Bundle bundle) {
        if (SQ.e(PE.class)) {
            return;
        }
        try {
            C6562gT0.p(str, "$eventName");
            C6562gT0.p(bundle, "$parameters");
            com.facebook.M m = com.facebook.M.a;
            C2327q.b.k(com.facebook.M.n()).q(str, bundle);
        } catch (Throwable th) {
            SQ.c(th, PE.class);
        }
    }

    public final void f(@NotNull Bundle bundle) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(bundle, BreadcrumbAnalyticsEventReceiver.c);
            String string = bundle.getString(C2326p.g0);
            if (string != null) {
                C5370bd c5370bd = C5370bd.a;
                bundle.putDouble(C2326p.g0, C5370bd.h(string));
            }
            bundle.putString(EK.c, "1");
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
