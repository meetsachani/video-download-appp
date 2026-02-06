package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C2705Cy;
import o.C7025iN1;
import o.HT1;

@ES1(21)
/* renamed from: o.s91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9422s91 extends Transition {
    public static final int A1 = 3;
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int D1 = 2;
    public static final String E1 = "s91";
    public static final String F1 = "materialContainerTransition:bounds";
    public static final String G1 = "materialContainerTransition:shapeAppearance";
    public static final String[] H1 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final g I1 = new g(new f(0.0f, 0.25f), new f(0.0f, 1.0f), new f(0.0f, 1.0f), new f(0.0f, 0.75f), null);
    public static final g J1 = new g(new f(0.6f, 0.9f), new f(0.0f, 1.0f), new f(0.0f, 0.9f), new f(0.3f, 0.9f), null);
    public static final g K1 = new g(new f(0.1f, 0.4f), new f(0.1f, 1.0f), new f(0.1f, 1.0f), new f(0.1f, 0.9f), null);
    public static final g L1 = new g(new f(0.6f, 0.9f), new f(0.0f, 0.9f), new f(0.0f, 0.9f), new f(0.2f, 0.9f), null);
    public static final float M1 = -1.0f;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final int w1 = 2;
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 2;
    public boolean X;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    @PL0
    public int Z0;
    @PL0
    public int a1;
    @PL0
    public int b1;
    @JF
    public int c1;
    @JF
    public int d1;
    @JF
    public int e1;
    @JF
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    @InterfaceC11300zs1
    public View j1;
    @InterfaceC11300zs1
    public View k1;
    @InterfaceC11300zs1
    public O22 l1;
    @InterfaceC11300zs1
    public O22 m1;
    @InterfaceC11300zs1
    public f n1;
    @InterfaceC11300zs1
    public f o1;
    @InterfaceC11300zs1
    public f p1;
    @InterfaceC11300zs1
    public f q1;
    public boolean r1;
    public float s1;
    public float t1;

    /* renamed from: o.s91$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: o.s91$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC10087ut2 {
        public final /* synthetic */ View a;
        public final /* synthetic */ c b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public b(View view, c cVar, View view2, View view3) {
            this.a = view;
            this.b = cVar;
            this.c = view2;
            this.d = view3;
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@InterfaceC5670cr1 Transition transition) {
            C9422s91.this.removeListener(this);
            if (C9422s91.this.Y) {
                return;
            }
            this.c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            this.a.getOverlay().remove(this.b);
        }

        @Override // o.AbstractC10087ut2, android.transition.Transition.TransitionListener
        public void onTransitionStart(@InterfaceC5670cr1 Transition transition) {
            this.a.getOverlay().add(this.b);
            this.c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
        }
    }

    /* renamed from: o.s91$c */
    /* loaded from: classes3.dex */
    public static final class c extends Drawable {
        public static final int M = 754974720;
        public static final int N = -7829368;
        public static final float O = 0.3f;
        public static final float P = 1.5f;
        public final g A;
        public final InterfaceC7594kk0 B;
        public final InterfaceC8138mu0 C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public C8585ok0 G;
        public C9111qu0 H;
        public RectF I;
        public float J;
        public float K;
        public float L;
        public final View a;
        public final RectF b;
        public final O22 c;
        public final float d;
        public final View e;
        public final RectF f;
        public final O22 g;
        public final float h;
        public final Paint i;
        public final Paint j;
        public final Paint k;
        public final Paint l;
        public final Paint m;
        public final A81 n;

        /* renamed from: o  reason: collision with root package name */
        public final PathMeasure f858o;
        public final float p;
        public final float[] q;
        public final boolean r;
        public final float s;
        public final float t;
        public final boolean u;
        public final C4394Uc1 v;
        public final RectF w;
        public final RectF x;
        public final RectF y;
        public final RectF z;

        /* renamed from: o.s91$c$a */
        /* loaded from: classes3.dex */
        public class a implements C2705Cy.a {
            public a() {
            }

            @Override // o.C2705Cy.a
            public void a(Canvas canvas) {
                c.this.a.draw(canvas);
            }
        }

        /* renamed from: o.s91$c$b */
        /* loaded from: classes3.dex */
        public class b implements C2705Cy.a {
            public b() {
            }

            @Override // o.C2705Cy.a
            public void a(Canvas canvas) {
                c.this.e.draw(canvas);
            }
        }

        public /* synthetic */ c(PathMotion pathMotion, View view, RectF rectF, O22 o22, float f, View view2, RectF rectF2, O22 o222, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC7594kk0 interfaceC7594kk0, InterfaceC8138mu0 interfaceC8138mu0, g gVar, boolean z3, a aVar) {
            this(pathMotion, view, rectF, o22, f, view2, rectF2, o222, f2, i, i2, i3, i4, z, z2, interfaceC7594kk0, interfaceC8138mu0, gVar, z3);
        }

        public static float d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        public static float e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        public static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@InterfaceC5670cr1 Canvas canvas) {
            int i;
            if (this.m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.m);
            }
            if (this.D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.u && this.J > 0.0f) {
                h(canvas);
            }
            this.n.a(canvas);
            n(canvas, this.i);
            if (this.G.c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(i);
                f(canvas, this.w, this.F, -65281);
                g(canvas, this.x, -256);
                g(canvas, this.w, -16711936);
                g(canvas, this.z, -16711681);
                g(canvas, this.y, -16776961);
            }
        }

        public final void f(Canvas canvas, RectF rectF, Path path, @JF int i) {
            PointF m = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.E.setColor(i);
            canvas.drawPath(path, this.E);
        }

        public final void g(Canvas canvas, RectF rectF, @JF int i) {
            this.E.setColor(i);
            canvas.drawRect(rectF, this.E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public final void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            C4394Uc1 c4394Uc1 = this.v;
            RectF rectF = this.I;
            c4394Uc1.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.v.x0(this.J);
            this.v.M0((int) this.K);
            this.v.setShapeAppearanceModel(this.n.c());
            this.v.draw(canvas);
        }

        public final void j(Canvas canvas) {
            O22 c = this.n.c();
            if (c.v(this.I)) {
                float a2 = c.r().a(this.I);
                canvas.drawRoundRect(this.I, a2, a2, this.l);
                return;
            }
            canvas.drawPath(this.n.d(), this.l);
        }

        public final void k(Canvas canvas) {
            n(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.y;
            C2997Ft2.x(canvas, bounds, rectF.left, rectF.top, this.H.b, this.G.b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            C2997Ft2.x(canvas, bounds, rectF.left, rectF.top, this.H.a, this.G.a, new a());
        }

        public final void n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        public final void o(float f) {
            if (this.L != f) {
                p(f);
            }
        }

        public final void p(float f) {
            float l;
            float f2;
            float f3;
            RectF rectF;
            this.L = f;
            Paint paint = this.m;
            if (this.r) {
                l = C2997Ft2.l(0.0f, 255.0f, f);
            } else {
                l = C2997Ft2.l(255.0f, 0.0f, f);
            }
            paint.setAlpha((int) l);
            this.f858o.getPosTan(this.p * f, this.q, null);
            float[] fArr = this.q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.f858o.getPosTan(this.p * f2, fArr, null);
                float[] fArr2 = this.q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            C9111qu0 a2 = this.C.a(f, ((Float) C10907yF1.l(Float.valueOf(this.A.b.a))).floatValue(), ((Float) C10907yF1.l(Float.valueOf(this.A.b.b))).floatValue(), this.b.width(), this.b.height(), this.f.width(), this.f.height());
            this.H = a2;
            RectF rectF2 = this.w;
            float f8 = a2.c;
            rectF2.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, a2.d + f7);
            RectF rectF3 = this.y;
            C9111qu0 c9111qu0 = this.H;
            float f9 = c9111qu0.e;
            rectF3.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), c9111qu0.f + f7);
            this.x.set(this.w);
            this.z.set(this.y);
            float floatValue = ((Float) C10907yF1.l(Float.valueOf(this.A.c.a))).floatValue();
            float floatValue2 = ((Float) C10907yF1.l(Float.valueOf(this.A.c.b))).floatValue();
            boolean c = this.C.c(this.H);
            if (c) {
                rectF = this.x;
            } else {
                rectF = this.z;
            }
            float m = C2997Ft2.m(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!c) {
                m = 1.0f - m;
            }
            this.C.b(rectF, m, this.H);
            this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
            this.n.b(f, this.c, this.g, this.w, this.x, this.z, this.A.d);
            this.J = C2997Ft2.l(this.d, this.h, f);
            float d = d(this.I, this.s);
            float e = e(this.I, this.t);
            float f10 = this.J;
            float f11 = (int) (e * f10);
            this.K = f11;
            this.l.setShadowLayer(f10, (int) (d * f10), f11, 754974720);
            this.G = this.B.a(f, ((Float) C10907yF1.l(Float.valueOf(this.A.a.a))).floatValue(), ((Float) C10907yF1.l(Float.valueOf(this.A.a.b))).floatValue(), 0.35f);
            if (this.j.getColor() != 0) {
                this.j.setAlpha(this.G.a);
            }
            if (this.k.getColor() != 0) {
                this.k.setAlpha(this.G.b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public c(PathMotion pathMotion, View view, RectF rectF, O22 o22, float f, View view2, RectF rectF2, O22 o222, float f2, @JF int i, @JF int i2, @JF int i3, int i4, boolean z, boolean z2, InterfaceC7594kk0 interfaceC7594kk0, InterfaceC8138mu0 interfaceC8138mu0, g gVar, boolean z3) {
            Paint paint = new Paint();
            this.i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.n = new A81();
            this.q = r5;
            C4394Uc1 c4394Uc1 = new C4394Uc1();
            this.v = c4394Uc1;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.a = view;
            this.b = rectF;
            this.c = o22;
            this.d = f;
            this.e = view2;
            this.f = rectF2;
            this.g = o222;
            this.h = f2;
            this.r = z;
            this.u = z2;
            this.B = interfaceC7594kk0;
            this.C = interfaceC8138mu0;
            this.A = gVar;
            this.D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.s = displayMetrics.widthPixels;
            this.t = displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            c4394Uc1.y0(ColorStateList.valueOf(0));
            c4394Uc1.I0(2);
            c4394Uc1.F0(false);
            c4394Uc1.G0(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.w = rectF3;
            this.x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.y = rectF4;
            this.z = new RectF(rectF4);
            PointF m = m(rectF);
            PointF m2 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.f858o = pathMeasure;
            this.p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C2997Ft2.d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.s91$d */
    /* loaded from: classes3.dex */
    public @interface d {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.s91$e */
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* renamed from: o.s91$f */
    /* loaded from: classes3.dex */
    public static class f {
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public final float a;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public final float b;

        public f(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
            this.a = f;
            this.b = f2;
        }

        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float c() {
            return this.b;
        }

        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float d() {
            return this.a;
        }
    }

    /* renamed from: o.s91$g */
    /* loaded from: classes3.dex */
    public static class g {
        @InterfaceC5670cr1
        public final f a;
        @InterfaceC5670cr1
        public final f b;
        @InterfaceC5670cr1
        public final f c;
        @InterfaceC5670cr1
        public final f d;

        public /* synthetic */ g(f fVar, f fVar2, f fVar3, f fVar4, a aVar) {
            this(fVar, fVar2, fVar3, fVar4);
        }

        public g(@InterfaceC5670cr1 f fVar, @InterfaceC5670cr1 f fVar2, @InterfaceC5670cr1 f fVar3, @InterfaceC5670cr1 f fVar4) {
            this.a = fVar;
            this.b = fVar2;
            this.c = fVar3;
            this.d = fVar4;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.s91$h */
    /* loaded from: classes3.dex */
    public @interface h {
    }

    public C9422s91() {
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.Y0 = false;
        this.Z0 = 16908290;
        this.a1 = -1;
        this.b1 = -1;
        this.c1 = 0;
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = 1375731712;
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = 0;
        this.r1 = Build.VERSION.SDK_INT >= 28;
        this.s1 = -1.0f;
        this.t1 = -1.0f;
    }

    @InterfaceC4698Xf2
    public static int D(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C7025iN1.c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static RectF d(View view, @InterfaceC11300zs1 View view2, float f2, float f3) {
        if (view2 != null) {
            RectF h2 = C2997Ft2.h(view2);
            h2.offset(f2, f3);
            return h2;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    public static O22 e(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RectF rectF, @InterfaceC11300zs1 O22 o22) {
        return C2997Ft2.c(u(view, o22), rectF);
    }

    public static void f(@InterfaceC5670cr1 TransitionValues transitionValues, @InterfaceC11300zs1 View view, @PL0 int i, @InterfaceC11300zs1 O22 o22) {
        RectF h2;
        if (i != -1) {
            transitionValues.view = C2997Ft2.g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i2 = C7025iN1.h.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                transitionValues.view.setTag(i2, null);
                transitionValues.view = (View) transitionValues.view.getTag(i2);
            }
        }
        View view3 = transitionValues.view;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            h2 = C2997Ft2.i(view3);
        } else {
            h2 = C2997Ft2.h(view3);
        }
        transitionValues.values.put("materialContainerTransition:bounds", h2);
        transitionValues.values.put("materialContainerTransition:shapeAppearance", e(view3, h2, o22));
    }

    public static float i(float f2, View view) {
        if (f2 != -1.0f) {
            return f2;
        }
        return view.getElevation();
    }

    public static O22 u(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 O22 o22) {
        if (o22 != null) {
            return o22;
        }
        int i = C7025iN1.h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof O22) {
            return (O22) view.getTag(i);
        }
        Context context = view.getContext();
        int D = D(context);
        if (D != -1) {
            return O22.b(context, D, 0).m();
        }
        if (view instanceof InterfaceC6946i32) {
            return ((InterfaceC6946i32) view).getShapeAppearanceModel();
        }
        return O22.a().m();
    }

    @PL0
    public int A() {
        return this.a1;
    }

    public final g B(boolean z, g gVar, g gVar2) {
        if (!z) {
            gVar = gVar2;
        }
        return new g((f) C2997Ft2.e(this.n1, gVar.a), (f) C2997Ft2.e(this.o1, gVar.b), (f) C2997Ft2.e(this.p1, gVar.c), (f) C2997Ft2.e(this.q1, gVar.d), null);
    }

    public int C() {
        return this.g1;
    }

    public boolean E() {
        return this.X;
    }

    public boolean F() {
        return this.r1;
    }

    public final boolean G(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 RectF rectF2) {
        int i = this.g1;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.g1);
        } else if (C2997Ft2.b(rectF2) <= C2997Ft2.b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean H() {
        return this.Y;
    }

    public final void I(Context context, boolean z) {
        int i;
        C2997Ft2.s(this, context, C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b);
        if (z) {
            i = C7025iN1.c.motionDurationLong2;
        } else {
            i = C7025iN1.c.motionDurationMedium4;
        }
        C2997Ft2.r(this, context, i);
        if (!this.Z) {
            C2997Ft2.t(this, context, C7025iN1.c.motionPath);
        }
    }

    public void J(@JF int i) {
        this.c1 = i;
        this.d1 = i;
        this.e1 = i;
    }

    public void K(@JF int i) {
        this.c1 = i;
    }

    public void L(boolean z) {
        this.X = z;
    }

    public void M(@PL0 int i) {
        this.Z0 = i;
    }

    public void N(boolean z) {
        this.r1 = z;
    }

    public void O(@JF int i) {
        this.e1 = i;
    }

    public void P(float f2) {
        this.t1 = f2;
    }

    public void Q(@InterfaceC11300zs1 O22 o22) {
        this.m1 = o22;
    }

    public void R(@InterfaceC11300zs1 View view) {
        this.k1 = view;
    }

    public void S(@PL0 int i) {
        this.b1 = i;
    }

    public void T(int i) {
        this.h1 = i;
    }

    public void U(@InterfaceC11300zs1 f fVar) {
        this.n1 = fVar;
    }

    public void V(int i) {
        this.i1 = i;
    }

    public void W(boolean z) {
        this.Y = z;
    }

    public void X(@InterfaceC11300zs1 f fVar) {
        this.p1 = fVar;
    }

    public void Y(@InterfaceC11300zs1 f fVar) {
        this.o1 = fVar;
    }

    public void Z(@JF int i) {
        this.f1 = i;
    }

    public void b0(@InterfaceC11300zs1 f fVar) {
        this.q1 = fVar;
    }

    public final g c(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof V81)) {
            return B(z, I1, J1);
        }
        return B(z, K1, L1);
    }

    public void c0(@JF int i) {
        this.d1 = i;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@InterfaceC5670cr1 TransitionValues transitionValues) {
        f(transitionValues, this.k1, this.b1, this.m1);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@InterfaceC5670cr1 TransitionValues transitionValues) {
        f(transitionValues, this.j1, this.a1, this.l1);
    }

    @Override // android.transition.Transition
    @InterfaceC11300zs1
    public Animator createAnimator(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC11300zs1 TransitionValues transitionValues, @InterfaceC11300zs1 TransitionValues transitionValues2) {
        View view;
        View f2;
        View view2 = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            O22 o22 = (O22) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && o22 != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                O22 o222 = (O22) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && o222 != null) {
                    View view3 = transitionValues.view;
                    View view4 = transitionValues2.view;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.Z0 == view.getId()) {
                        f2 = (View) view.getParent();
                        view2 = view;
                    } else {
                        f2 = C2997Ft2.f(view, this.Z0);
                    }
                    RectF h2 = C2997Ft2.h(f2);
                    float f3 = -h2.left;
                    float f4 = -h2.top;
                    RectF d2 = d(f2, view2, f3, f4);
                    rectF.offset(f3, f4);
                    rectF2.offset(f3, f4);
                    boolean G = G(rectF, rectF2);
                    if (!this.Y0) {
                        I(view.getContext(), G);
                    }
                    c cVar = new c(getPathMotion(), view3, rectF, o22, i(this.s1, view3), view4, rectF2, o222, i(this.t1, view4), this.c1, this.d1, this.e1, this.f1, G, this.r1, C8341nk0.a(this.h1, G), C8868pu0.a(this.i1, G, rectF, rectF2), c(G), this.X, null);
                    cVar.setBounds(Math.round(d2.left), Math.round(d2.top), Math.round(d2.right), Math.round(d2.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(cVar));
                    addListener(new b(f2, cVar, view3, view4));
                    return ofFloat;
                }
                Log.w(E1, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(E1, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public void d0(float f2) {
        this.s1 = f2;
    }

    public void f0(@InterfaceC11300zs1 O22 o22) {
        this.l1 = o22;
    }

    @JF
    public int g() {
        return this.c1;
    }

    public void g0(@InterfaceC11300zs1 View view) {
        this.j1 = view;
    }

    @Override // android.transition.Transition
    @InterfaceC11300zs1
    public String[] getTransitionProperties() {
        return H1;
    }

    @PL0
    public int h() {
        return this.Z0;
    }

    public void h0(@PL0 int i) {
        this.a1 = i;
    }

    public void i0(int i) {
        this.g1 = i;
    }

    @JF
    public int j() {
        return this.e1;
    }

    public float k() {
        return this.t1;
    }

    @InterfaceC11300zs1
    public O22 l() {
        return this.m1;
    }

    @InterfaceC11300zs1
    public View m() {
        return this.k1;
    }

    @PL0
    public int n() {
        return this.b1;
    }

    public int o() {
        return this.h1;
    }

    @InterfaceC11300zs1
    public f p() {
        return this.n1;
    }

    public int q() {
        return this.i1;
    }

    @InterfaceC11300zs1
    public f r() {
        return this.p1;
    }

    @InterfaceC11300zs1
    public f s() {
        return this.o1;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@InterfaceC11300zs1 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.Z = true;
    }

    @JF
    public int t() {
        return this.f1;
    }

    @InterfaceC11300zs1
    public f v() {
        return this.q1;
    }

    @JF
    public int w() {
        return this.d1;
    }

    public float x() {
        return this.s1;
    }

    @InterfaceC11300zs1
    public O22 y() {
        return this.l1;
    }

    @InterfaceC11300zs1
    public View z() {
        return this.j1;
    }

    public C9422s91(@InterfaceC5670cr1 Context context, boolean z) {
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.Y0 = false;
        this.Z0 = 16908290;
        this.a1 = -1;
        this.b1 = -1;
        this.c1 = 0;
        this.d1 = 0;
        this.e1 = 0;
        this.f1 = 1375731712;
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = 0;
        this.r1 = Build.VERSION.SDK_INT >= 28;
        this.s1 = -1.0f;
        this.t1 = -1.0f;
        I(context, z);
        this.Y0 = true;
    }
}
