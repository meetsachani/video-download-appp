package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import o.C2705Cy;
import o.O22;

@ES1(21)
/* renamed from: o.Ft2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2997Ft2 {
    public static final int a = -1;
    @InterfaceC8568og
    public static final int b = 0;
    public static final int c = 0;
    public static final int d = 1;
    public static final RectF e = new RectF();

    /* renamed from: o.Ft2$a */
    /* loaded from: classes3.dex */
    public class a implements b {
        public final /* synthetic */ RectF a;
        public final /* synthetic */ RectF b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public a(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.a = rectF;
            this.b = rectF2;
            this.c = f;
            this.d = f2;
            this.e = f3;
        }

        @Override // o.C2997Ft2.b
        @InterfaceC5670cr1
        public YP a(@InterfaceC5670cr1 YP yp, @InterfaceC5670cr1 YP yp2) {
            return new M(C2997Ft2.m(yp.a(this.a), yp2.a(this.b), this.c, this.d, this.e));
        }
    }

    /* renamed from: o.Ft2$b */
    /* loaded from: classes3.dex */
    public interface b {
        @InterfaceC5670cr1
        YP a(@InterfaceC5670cr1 YP yp, @InterfaceC5670cr1 YP yp2);
    }

    public static float b(@InterfaceC5670cr1 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static O22 c(O22 o22, final RectF rectF) {
        return o22.z(new O22.c() { // from class: o.Dt2
            @Override // o.O22.c
            public final YP a(YP yp) {
                YP b2;
                b2 = YQ1.b(rectF, yp);
                return b2;
            }
        });
    }

    public static Shader d(@JF int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @InterfaceC5670cr1
    public static <T> T e(@InterfaceC11300zs1 T t, @InterfaceC5670cr1 T t2) {
        if (t != null) {
            return t;
        }
        return t2;
    }

    public static View f(View view, @PL0 int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() == i) {
                return view;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View g(View view, @PL0 int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return f(view, i);
    }

    public static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean k(O22 o22, RectF rectF) {
        if (o22.r().a(rectF) == 0.0f && o22.t().a(rectF) == 0.0f && o22.l().a(rectF) == 0.0f && o22.j().a(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    public static float l(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float m(float f, float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f4, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f5) {
        return n(f, f2, f3, f4, f5, false);
    }

    public static float n(float f, float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f4, @InterfaceC2501Av0(from = 0.0d) float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return l(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return l(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int o(int i, int i2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) l(i, i2, (f3 - f) / (f2 - f));
    }

    public static O22 p(O22 o22, O22 o222, RectF rectF, RectF rectF2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3) {
        if (f3 < f) {
            return o22;
        }
        if (f3 > f2) {
            return o222;
        }
        return y(o22, o222, rectF, new a(rectF, rectF2, f, f2, f3));
    }

    public static void q(TransitionSet transitionSet, @InterfaceC11300zs1 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static boolean r(Transition transition, Context context, @InterfaceC8568og int i) {
        int f;
        if (i != 0 && transition.getDuration() == -1 && (f = C9811tl1.f(context, i, -1)) != -1) {
            transition.setDuration(f);
            return true;
        }
        return false;
    }

    public static boolean s(Transition transition, Context context, @InterfaceC8568og int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(C9811tl1.g(context, i, timeInterpolator));
            return true;
        }
        return false;
    }

    public static boolean t(Transition transition, Context context, @InterfaceC8568og int i) {
        PathMotion v;
        if (i != 0 && (v = v(context, i)) != null) {
            transition.setPathMotion(v);
            return true;
        }
        return false;
    }

    public static void u(TransitionSet transitionSet, @InterfaceC11300zs1 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @InterfaceC11300zs1
    public static PathMotion v(Context context, @InterfaceC8568og int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new V81();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(C9624sz1.e(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    public static int w(Canvas canvas, Rect rect, int i) {
        RectF rectF = e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static void x(Canvas canvas, Rect rect, float f, float f2, float f3, int i, C2705Cy.a aVar) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            w(canvas, rect, i);
        }
        aVar.a(canvas);
        canvas.restoreToCount(save);
    }

    public static O22 y(O22 o22, O22 o222, RectF rectF, b bVar) {
        O22 o223;
        if (k(o22, rectF)) {
            o223 = o22;
        } else {
            o223 = o222;
        }
        return o223.w().L(bVar.a(o22.r(), o222.r())).Q(bVar.a(o22.t(), o222.t())).y(bVar.a(o22.j(), o222.j())).D(bVar.a(o22.l(), o222.l())).m();
    }
}
