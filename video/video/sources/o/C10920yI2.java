package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;
import o.C7025iN1;
import o.HT1;
import o.RL2;

@HT1({HT1.a.Y})
/* renamed from: o.yI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10920yI2 {
    public static final int a = 768;

    /* renamed from: o.yI2$a */
    /* loaded from: classes3.dex */
    public class a implements e {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;

        public a(boolean z, boolean z2, boolean z3, e eVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = eVar;
        }

        @Override // o.C10920yI2.e
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 f fVar) {
            if (this.a) {
                fVar.d += rl2.o();
            }
            boolean s = C10920yI2.s(view);
            if (this.b) {
                if (s) {
                    fVar.c += rl2.p();
                } else {
                    fVar.a += rl2.p();
                }
            }
            if (this.c) {
                if (s) {
                    fVar.a += rl2.q();
                } else {
                    fVar.c += rl2.q();
                }
            }
            fVar.a(view);
            e eVar = this.d;
            if (eVar != null) {
                return eVar.a(view, rl2, fVar);
            }
            return rl2;
        }
    }

    /* renamed from: o.yI2$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC10336vu1 {
        public final /* synthetic */ e a;
        public final /* synthetic */ f b;

        public b(e eVar, f fVar) {
            this.a = eVar;
            this.b = fVar;
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            return this.a.a(view, rl2, new f(this.b));
        }
    }

    /* renamed from: o.yI2$d */
    /* loaded from: classes3.dex */
    public class d implements QH2 {
        public final /* synthetic */ View a;

        public d(View view) {
            this.a = view;
        }

        @Override // o.QH2
        public void a(@InterfaceC5670cr1 Drawable drawable) {
            this.a.getOverlay().add(drawable);
        }

        @Override // o.QH2
        public void b(@InterfaceC5670cr1 Drawable drawable) {
            this.a.getOverlay().remove(drawable);
        }
    }

    /* renamed from: o.yI2$e */
    /* loaded from: classes3.dex */
    public interface e {
        RL2 a(View view, RL2 rl2, f fVar);
    }

    public static void A(@InterfaceC5670cr1 View view) {
        B(view, true);
    }

    public static void B(@InterfaceC5670cr1 View view, boolean z) {
        C10450wM2 G0;
        if (z && (G0 = C6516gH2.G0(view)) != null) {
            G0.k(RL2.p.d());
        } else {
            n(view).showSoftInput(view, 1);
        }
    }

    public static void b(@InterfaceC11300zs1 View view, @InterfaceC5670cr1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @InterfaceC5670cr1
    public static Rect c(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    @InterfaceC5670cr1
    public static Rect d(@InterfaceC5670cr1 View view) {
        return e(view, 0);
    }

    @InterfaceC5670cr1
    public static Rect e(@InterfaceC5670cr1 View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    public static void f(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        g(view, attributeSet, i, i2, null);
    }

    public static void g(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2, @InterfaceC11300zs1 e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C7025iN1.o.q4, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7025iN1.o.v4, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C7025iN1.o.w4, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C7025iN1.o.x4, false);
        obtainStyledAttributes.recycle();
        h(view, new a(z, z2, z3, eVar));
    }

    public static void h(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 e eVar) {
        C6516gH2.l2(view, new b(eVar, new f(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        w(view);
    }

    public static float i(@InterfaceC5670cr1 Context context, @InterfaceC9397s30(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @InterfaceC11300zs1
    public static Integer j(@InterfaceC5670cr1 View view) {
        ColorStateList g = Z60.g(view.getBackground());
        if (g != null) {
            return Integer.valueOf(g.getDefaultColor());
        }
        return null;
    }

    @InterfaceC5670cr1
    public static List<View> k(@InterfaceC11300zs1 View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    @InterfaceC11300zs1
    public static ViewGroup l(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @InterfaceC11300zs1
    @Deprecated
    public static QH2 m(@InterfaceC5670cr1 View view) {
        return o(l(view));
    }

    @InterfaceC11300zs1
    public static InputMethodManager n(@InterfaceC5670cr1 View view) {
        return (InputMethodManager) C10201vM.s(view.getContext(), InputMethodManager.class);
    }

    @InterfaceC11300zs1
    @Deprecated
    public static QH2 o(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return null;
        }
        return new d(view);
    }

    public static float p(@InterfaceC5670cr1 View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ((View) parent).getElevation();
        }
        return f2;
    }

    public static void q(@InterfaceC5670cr1 View view) {
        r(view, true);
    }

    public static void r(@InterfaceC5670cr1 View view, boolean z) {
        C10450wM2 G0;
        if (z && (G0 = C6516gH2.G0(view)) != null) {
            G0.d(RL2.p.d());
            return;
        }
        InputMethodManager n = n(view);
        if (n != null) {
            n.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean s(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode t(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void u(@InterfaceC11300zs1 View view, @InterfaceC5670cr1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            v(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void v(@InterfaceC5670cr1 ViewTreeObserver viewTreeObserver, @InterfaceC5670cr1 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void w(@InterfaceC5670cr1 View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void x(@InterfaceC5670cr1 View view) {
        y(view, true);
    }

    public static void y(@InterfaceC5670cr1 final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: o.xI2
            @Override // java.lang.Runnable
            public final void run() {
                C10920yI2.B(view, z);
            }
        });
    }

    public static void z(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    /* renamed from: o.yI2$f */
    /* loaded from: classes3.dex */
    public static class f {
        public int a;
        public int b;
        public int c;
        public int d;

        public f(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            view.setPaddingRelative(this.a, this.b, this.c, this.d);
        }

        public f(@InterfaceC5670cr1 f fVar) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.d = fVar.d;
        }
    }

    /* renamed from: o.yI2$c */
    /* loaded from: classes3.dex */
    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC5670cr1 View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
