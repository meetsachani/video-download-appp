package o;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import o.ZC1;

/* loaded from: classes.dex */
public final class ZC1 {

    /* loaded from: classes.dex */
    public static final class a<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ Activity X;

        public a(Activity activity) {
            this.X = activity;
        }

        @Override // o.InterfaceC4076Qv0
        /* renamed from: a */
        public final Object c(Rect rect, HM<? super C7458kA2> hm) {
            C2417Aa.a.a(this.X, rect);
            return C7458kA2.a;
        }
    }

    @FV(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<AI1<? super Rect>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ View b1;

        /* loaded from: classes.dex */
        public static final class a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ AI1<Rect> X;
            public final /* synthetic */ View Y;
            public final /* synthetic */ View.OnLayoutChangeListener Y0;
            public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener Z;

            /* JADX WARN: Multi-variable type inference failed */
            public a(AI1<? super Rect> ai1, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.X = ai1;
                this.Y = view;
                this.Z = onScrollChangedListener;
                this.Y0 = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C6562gT0.p(view, "v");
                this.X.B(ZC1.c(this.Y));
                this.Y.getViewTreeObserver().addOnScrollChangedListener(this.Z);
                this.Y.addOnLayoutChangeListener(this.Y0);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                C6562gT0.p(view, "v");
                view.getViewTreeObserver().removeOnScrollChangedListener(this.Z);
                view.removeOnLayoutChangeListener(this.Y0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, HM<? super b> hm) {
            super(2, hm);
            this.b1 = view;
        }

        public static final void m0(AI1 ai1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            C6562gT0.m(view);
            ai1.B(ZC1.c(view));
        }

        public static final void n0(AI1 ai1, View view) {
            ai1.B(ZC1.c(view));
        }

        public static final C7458kA2 o0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, a aVar) {
            view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
            view.removeOnAttachStateChangeListener(aVar);
            return C7458kA2.a;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                final AI1 ai1 = (AI1) this.a1;
                final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: o.aD1
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        ZC1.b.m0(AI1.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
                    }
                };
                final View view = this.b1;
                final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.bD1
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        ZC1.b.n0(AI1.this, view);
                    }
                };
                final a aVar = new a(ai1, this.b1, onScrollChangedListener, onLayoutChangeListener);
                if (this.b1.isAttachedToWindow()) {
                    ai1.B(ZC1.c(this.b1));
                    this.b1.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.b1.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.b1.addOnAttachStateChangeListener(aVar);
                final View view2 = this.b1;
                FA0 fa0 = new FA0() { // from class: o.cD1
                    @Override // o.FA0
                    public final Object invoke() {
                        C7458kA2 o0;
                        o0 = ZC1.b.o0(view2, onScrollChangedListener, onLayoutChangeListener, aVar);
                        return o0;
                    }
                };
                this.Z0 = 1;
                if (C10919yI1.b(ai1, fa0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: l0 */
        public final Object i(AI1<? super Rect> ai1, HM<? super C7458kA2> hm) {
            return ((b) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    public static final Object b(Activity activity, View view, HM<? super C7458kA2> hm) {
        Object a2 = C4467Uv0.r(new b(view, null)).a(new a(activity), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    public static final Rect c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
