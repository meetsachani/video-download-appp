package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.internal.C2372q;

/* loaded from: classes.dex */
public final class BH2 {

    @FV(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, C2372q.n}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a extends MT1 implements VA0<F02<? super View>, HM<? super C7458kA2>, Object> {
        public /* synthetic */ Object Y0;
        public int Z;
        public final /* synthetic */ View Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, HM<? super a> hm) {
            super(2, hm);
            this.Z0 = view;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
            if (r1.b(r5, r4) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            if (r1.f(r5, r4) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            Object l = C7289jT0.l();
            int i = this.Z;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f02 = (F02) this.Y0;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                f02 = (F02) this.Y0;
                View view = this.Z0;
                this.Y0 = f02;
                this.Z = 1;
            }
            View view2 = this.Z0;
            if (view2 instanceof ViewGroup) {
                B02<View> f = C8720pH2.f((ViewGroup) view2);
                this.Y0 = null;
                this.Z = 2;
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super View> f02, HM<? super C7458kA2> hm) {
            return ((a) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.Z0, hm);
            aVar.Y0 = obj;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b extends C7964mB0 implements HA0<ViewParent, ViewParent> {
        public static final b e1 = new b();

        public b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements View.OnLayoutChangeListener {
        public final /* synthetic */ HA0 X;

        public e(HA0 ha0) {
            this.X = ha0;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.X.invoke(view);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public final /* synthetic */ HA0<View, C7458kA2> X;

        /* JADX WARN: Multi-variable type inference failed */
        public f(HA0<? super View, C7458kA2> ha0) {
            this.X = ha0;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.X.invoke(view);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ HA0<View, C7458kA2> X;
        public final /* synthetic */ View Y;

        /* JADX WARN: Multi-variable type inference failed */
        public g(HA0<? super View, C7458kA2> ha0, View view) {
            this.X = ha0;
            this.Y = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.invoke(this.Y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Runnable {
        public final /* synthetic */ FA0<C7458kA2> X;

        public h(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.invoke();
        }
    }

    public static final void A(View view, HA0<? super ViewGroup.LayoutParams, C7458kA2> ha0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ha0.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void B(View view, HA0<? super T, C7458kA2> ha0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C6562gT0.y(1, "T");
        ha0.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void D(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    public static final void E(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void F(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static final void b(View view, HA0<? super View, C7458kA2> ha0) {
        if (view.isAttachedToWindow()) {
            ha0.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, ha0));
        }
    }

    public static final void c(View view, HA0<? super View, C7458kA2> ha0) {
        if (!view.isAttachedToWindow()) {
            ha0.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new d(view, ha0));
        }
    }

    public static final void d(View view, HA0<? super View, C7458kA2> ha0) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            ha0.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new e(ha0));
        }
    }

    public static final void e(View view, HA0<? super View, C7458kA2> ha0) {
        view.addOnLayoutChangeListener(new f(ha0));
    }

    public static final ViewTreeObserver$OnPreDrawListenerC10826xv1 f(View view, HA0<? super View, C7458kA2> ha0) {
        return ViewTreeObserver$OnPreDrawListenerC10826xv1.a(view, new g(ha0, view));
    }

    public static final Bitmap g(View view, Bitmap.Config config) {
        if (view.isLaidOut()) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    public static final B02<View> i(View view) {
        return N02.b(new a(view, null));
    }

    public static final B02<ViewParent> j(View view) {
        return U02.t(view.getParent(), b.e1);
    }

    public static final int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(View view) {
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public static final boolean r(View view) {
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean s(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final Runnable t(View view, long j, FA0<C7458kA2> fa0) {
        h hVar = new h(fa0);
        view.postDelayed(hVar, j);
        return hVar;
    }

    public static final Runnable u(View view, long j, final FA0<C7458kA2> fa0) {
        Runnable runnable = new Runnable() { // from class: o.AH2
            @Override // java.lang.Runnable
            public final void run() {
                BH2.v(FA0.this);
            }
        };
        view.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    public static final void v(FA0 fa0) {
        fa0.invoke();
    }

    public static final void w(View view, boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static final void x(View view, boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static final void y(View view, int i) {
        view.setPadding(i, i, i, i);
    }

    public static final void z(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View X;
        public final /* synthetic */ HA0<View, C7458kA2> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, HA0<? super View, C7458kA2> ha0) {
            this.X = view;
            this.Y = ha0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.X.removeOnAttachStateChangeListener(this);
            this.Y.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View X;
        public final /* synthetic */ HA0<View, C7458kA2> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, HA0<? super View, C7458kA2> ha0) {
            this.X = view;
            this.Y = ha0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.X.removeOnAttachStateChangeListener(this);
            this.Y.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
