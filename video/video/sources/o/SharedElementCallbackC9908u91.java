package o;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import o.C7025iN1;

@ES1(21)
/* renamed from: o.u91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class SharedElementCallbackC9908u91 extends SharedElementCallback {
    @InterfaceC11300zs1
    public static WeakReference<View> f;
    @InterfaceC11300zs1
    public Rect d;
    public boolean a = true;
    public boolean b = true;
    public boolean c = false;
    @InterfaceC11300zs1
    public d e = new e();

    /* renamed from: o.u91$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC10087ut2 {
        public final /* synthetic */ Window a;

        public a(Window window) {
            this.a = window;
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            SharedElementCallbackC9908u91.j(this.a);
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            SharedElementCallbackC9908u91.i(this.a);
        }
    }

    /* renamed from: o.u91$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC10087ut2 {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (SharedElementCallbackC9908u91.f != null && (view = (View) SharedElementCallbackC9908u91.f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = SharedElementCallbackC9908u91.f = null;
            }
            this.a.finish();
            this.a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: o.u91$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC10087ut2 {
        public final /* synthetic */ Window a;

        public c(Window window) {
            this.a = window;
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            SharedElementCallbackC9908u91.i(this.a);
        }
    }

    /* renamed from: o.u91$d */
    /* loaded from: classes3.dex */
    public interface d {
        @InterfaceC11300zs1
        O22 a(@InterfaceC5670cr1 View view);
    }

    /* renamed from: o.u91$e */
    /* loaded from: classes3.dex */
    public static class e implements d {
        @Override // o.SharedElementCallbackC9908u91.d
        @InterfaceC11300zs1
        public O22 a(@InterfaceC5670cr1 View view) {
            if (view instanceof InterfaceC6946i32) {
                return ((InterfaceC6946i32) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @InterfaceC11300zs1
    public static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    public static void i(Window window) {
        Drawable f2 = f(window);
        if (f2 == null) {
            return;
        }
        f2.mutate().setColorFilter(C8356no.a(0, EnumC8600oo.CLEAR));
    }

    public static void j(Window window) {
        Drawable f2 = f(window);
        if (f2 == null) {
            return;
        }
        f2.mutate().clearColorFilter();
    }

    public static void p(Window window, C9422s91 c9422s91) {
        if (c9422s91.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(c9422s91.getDuration());
        }
    }

    @InterfaceC11300zs1
    public d e() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.b;
    }

    public void k(@InterfaceC11300zs1 d dVar) {
        this.e = dVar;
    }

    public void l(boolean z) {
        this.c = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public final void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof C9422s91) {
            C9422s91 c9422s91 = (C9422s91) sharedElementEnterTransition;
            if (!this.c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.b) {
                p(window, c9422s91);
                c9422s91.addListener(new a(window));
            }
        }
    }

    public final void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof C9422s91) {
            C9422s91 c9422s91 = (C9422s91) sharedElementReturnTransition;
            c9422s91.W(true);
            c9422s91.addListener(new b(activity));
            if (this.b) {
                p(window, c9422s91);
                c9422s91.addListener(new c(window));
            }
        }
    }

    @Override // android.app.SharedElementCallback
    @InterfaceC11300zs1
    public Parcelable onCaptureSharedElementSnapshot(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Matrix matrix, @InterfaceC5670cr1 RectF rectF) {
        f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @InterfaceC11300zs1
    public View onCreateSnapshotView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        O22 a2;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f) != null && this.e != null && (view = weakReference.get()) != null && (a2 = this.e.a(view)) != null) {
            onCreateSnapshotView.setTag(C7025iN1.h.mtrl_motion_snapshot_view, a2);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@InterfaceC5670cr1 List<String> list, @InterfaceC5670cr1 Map<String, View> map) {
        View view;
        Activity a2;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a2 = DM.a(view.getContext())) != null) {
            Window window = a2.getWindow();
            if (this.a) {
                n(window);
            } else {
                o(a2, window);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@InterfaceC5670cr1 List<String> list, @InterfaceC5670cr1 List<View> list2, @InterfaceC5670cr1 List<View> list3) {
        if (!list2.isEmpty()) {
            int i = C7025iN1.h.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, null);
            }
        }
        if (!this.a && !list2.isEmpty()) {
            this.d = C2997Ft2.j(list2.get(0));
        }
        this.a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@InterfaceC5670cr1 List<String> list, @InterfaceC5670cr1 List<View> list2, @InterfaceC5670cr1 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C7025iN1.h.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.a && !list2.isEmpty() && this.d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.d.height(), 1073741824));
            Rect rect = this.d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
