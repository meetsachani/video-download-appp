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

/* renamed from: o.t91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9665t91 extends AbstractC5921dt2 {
    public static final int A2 = 1;
    public static final int B2 = 2;
    public static final int C2 = 3;
    public static final int D2 = 0;
    public static final int E2 = 1;
    public static final int F2 = 2;
    public static final String G2 = "t91";
    public static final String H2 = "materialContainerTransition:bounds";
    public static final String I2 = "materialContainerTransition:shapeAppearance";
    public static final String[] J2 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final f K2 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    public static final f L2 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
    public static final f M2 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
    public static final f N2 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    public static final float O2 = -1.0f;
    public static final int w2 = 0;
    public static final int x2 = 1;
    public static final int y2 = 2;
    public static final int z2 = 0;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    @PL0
    public int b2;
    @PL0
    public int c2;
    @PL0
    public int d2;
    @JF
    public int e2;
    @JF
    public int f2;
    @JF
    public int g2;
    @JF
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    @InterfaceC11300zs1
    public View l2;
    @InterfaceC11300zs1
    public View m2;
    @InterfaceC11300zs1
    public O22 n2;
    @InterfaceC11300zs1
    public O22 o2;
    @InterfaceC11300zs1
    public e p2;
    @InterfaceC11300zs1
    public e q2;
    @InterfaceC11300zs1
    public e r2;
    @InterfaceC11300zs1
    public e s2;
    public boolean t2;
    public float u2;
    public float v2;

    /* renamed from: o.t91$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ h a;

        public a(h hVar) {
            this.a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: o.t91$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC9844tt2 {
        public final /* synthetic */ View a;
        public final /* synthetic */ h b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public b(View view, h hVar, View view2, View view3) {
            this.a = view;
            this.b = hVar;
            this.c = view2;
            this.d = view3;
        }

        @Override // o.AbstractC9844tt2, o.AbstractC5921dt2.j
        public void g(@InterfaceC5670cr1 AbstractC5921dt2 abstractC5921dt2) {
            C9665t91.this.u0(this);
            if (C9665t91.this.Y1) {
                return;
            }
            this.c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            this.a.getOverlay().remove(this.b);
        }

        @Override // o.AbstractC9844tt2, o.AbstractC5921dt2.j
        public void j(@InterfaceC5670cr1 AbstractC5921dt2 abstractC5921dt2) {
            this.a.getOverlay().add(this.b);
            this.c.setAlpha(0.0f);
            this.d.setAlpha(0.0f);
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.t91$c */
    /* loaded from: classes3.dex */
    public @interface c {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.t91$d */
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* renamed from: o.t91$e */
    /* loaded from: classes3.dex */
    public static class e {
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public final float a;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public final float b;

        public e(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
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

    /* renamed from: o.t91$f */
    /* loaded from: classes3.dex */
    public static class f {
        @InterfaceC5670cr1
        public final e a;
        @InterfaceC5670cr1
        public final e b;
        @InterfaceC5670cr1
        public final e c;
        @InterfaceC5670cr1
        public final e d;

        public /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        public f(@InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 e eVar2, @InterfaceC5670cr1 e eVar3, @InterfaceC5670cr1 e eVar4) {
            this.a = eVar;
            this.b = eVar2;
            this.c = eVar3;
            this.d = eVar4;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.t91$g */
    /* loaded from: classes3.dex */
    public @interface g {
    }

    /* renamed from: o.t91$h */
    /* loaded from: classes3.dex */
    public static final class h extends Drawable {
        public static final int M = 754974720;
        public static final int N = -7829368;
        public static final float O = 0.3f;
        public static final float P = 1.5f;
        public final f A;
        public final InterfaceC7837lk0 B;
        public final InterfaceC8381nu0 C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public C8828pk0 G;
        public C9360ru0 H;
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
        public final B81 n;

        /* renamed from: o  reason: collision with root package name */
        public final PathMeasure f869o;
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

        /* renamed from: o.t91$h$a */
        /* loaded from: classes3.dex */
        public class a implements C2705Cy.a {
            public a() {
            }

            @Override // o.C2705Cy.a
            public void a(Canvas canvas) {
                h.this.a.draw(canvas);
            }
        }

        /* renamed from: o.t91$h$b */
        /* loaded from: classes3.dex */
        public class b implements C2705Cy.a {
            public b() {
            }

            @Override // o.C2705Cy.a
            public void a(Canvas canvas) {
                h.this.e.draw(canvas);
            }
        }

        public /* synthetic */ h(AbstractC9139qz1 abstractC9139qz1, View view, RectF rectF, O22 o22, float f, View view2, RectF rectF2, O22 o222, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, InterfaceC7837lk0 interfaceC7837lk0, InterfaceC8381nu0 interfaceC8381nu0, f fVar, boolean z3, a aVar) {
            this(abstractC9139qz1, view, rectF, o22, f, view2, rectF2, o222, f2, i, i2, i3, i4, z, z2, interfaceC7837lk0, interfaceC8381nu0, fVar, z3);
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
            C3095Gt2.x(canvas, bounds, rectF.left, rectF.top, this.H.b, this.G.b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            C3095Gt2.x(canvas, bounds, rectF.left, rectF.top, this.H.a, this.G.a, new a());
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
                l = C3095Gt2.l(0.0f, 255.0f, f);
            } else {
                l = C3095Gt2.l(255.0f, 0.0f, f);
            }
            paint.setAlpha((int) l);
            this.f869o.getPosTan(this.p * f, this.q, null);
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
                this.f869o.getPosTan(this.p * f2, fArr, null);
                float[] fArr2 = this.q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            C9360ru0 a2 = this.C.a(f, ((Float) C10907yF1.l(Float.valueOf(this.A.b.a))).floatValue(), ((Float) C10907yF1.l(Float.valueOf(this.A.b.b))).floatValue(), this.b.width(), this.b.height(), this.f.width(), this.f.height());
            this.H = a2;
            RectF rectF2 = this.w;
            float f8 = a2.c;
            rectF2.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, a2.d + f7);
            RectF rectF3 = this.y;
            C9360ru0 c9360ru0 = this.H;
            float f9 = c9360ru0.e;
            rectF3.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), c9360ru0.f + f7);
            this.x.set(this.w);
            this.z.set(this.y);
            float floatValue = ((Float) C10907yF1.l(Float.valueOf(this.A.c.a))).floatValue();
            float floatValue2 = ((Float) C10907yF1.l(Float.valueOf(this.A.c.b))).floatValue();
            boolean b2 = this.C.b(this.H);
            if (b2) {
                rectF = this.x;
            } else {
                rectF = this.z;
            }
            float m = C3095Gt2.m(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b2) {
                m = 1.0f - m;
            }
            this.C.c(rectF, m, this.H);
            this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
            this.n.b(f, this.c, this.g, this.w, this.x, this.z, this.A.d);
            this.J = C3095Gt2.l(this.d, this.h, f);
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

        public h(AbstractC9139qz1 abstractC9139qz1, View view, RectF rectF, O22 o22, float f, View view2, RectF rectF2, O22 o222, float f2, @JF int i, @JF int i2, @JF int i3, int i4, boolean z, boolean z2, InterfaceC7837lk0 interfaceC7837lk0, InterfaceC8381nu0 interfaceC8381nu0, f fVar, boolean z3) {
            Paint paint = new Paint();
            this.i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.n = new B81();
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
            this.B = interfaceC7837lk0;
            this.C = interfaceC8381nu0;
            this.A = fVar;
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
            PathMeasure pathMeasure = new PathMeasure(abstractC9139qz1.a(m.x, m.y, m2.x, m2.y), false);
            this.f869o = pathMeasure;
            this.p = pathMeasure.getLength();
            float[] fArr = {rectF.centerX(), rectF.top};
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C3095Gt2.d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public C9665t91() {
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = false;
        this.b2 = 16908290;
        this.c2 = -1;
        this.d2 = -1;
        this.e2 = 0;
        this.f2 = 0;
        this.g2 = 0;
        this.h2 = 1375731712;
        this.i2 = 0;
        this.j2 = 0;
        this.k2 = 0;
        this.t2 = Build.VERSION.SDK_INT >= 28;
        this.u2 = -1.0f;
        this.v2 = -1.0f;
    }

    private void B1(Context context, boolean z) {
        int i;
        C3095Gt2.s(this, context, C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b);
        if (z) {
            i = C7025iN1.c.motionDurationLong2;
        } else {
            i = C7025iN1.c.motionDurationMedium4;
        }
        C3095Gt2.r(this, context, i);
        if (!this.Z1) {
            C3095Gt2.t(this, context, C7025iN1.c.motionPath);
        }
    }

    public static RectF T0(View view, @InterfaceC11300zs1 View view2, float f2, float f3) {
        if (view2 != null) {
            RectF h2 = C3095Gt2.h(view2);
            h2.offset(f2, f3);
            return h2;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    public static O22 V0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RectF rectF, @InterfaceC11300zs1 O22 o22) {
        return C3095Gt2.c(m1(view, o22), rectF);
    }

    public static void W0(@InterfaceC5670cr1 C3291It2 c3291It2, @InterfaceC11300zs1 View view, @PL0 int i, @InterfaceC11300zs1 O22 o22) {
        RectF h2;
        if (i != -1) {
            c3291It2.b = C3095Gt2.g(c3291It2.b, i);
        } else if (view != null) {
            c3291It2.b = view;
        } else {
            View view2 = c3291It2.b;
            int i2 = C7025iN1.h.mtrl_motion_snapshot_view;
            if (view2.getTag(i2) instanceof View) {
                c3291It2.b.setTag(i2, null);
                c3291It2.b = (View) c3291It2.b.getTag(i2);
            }
        }
        View view3 = c3291It2.b;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            h2 = C3095Gt2.i(view3);
        } else {
            h2 = C3095Gt2.h(view3);
        }
        c3291It2.a.put("materialContainerTransition:bounds", h2);
        c3291It2.a.put("materialContainerTransition:shapeAppearance", V0(view3, h2, o22));
    }

    public static float a1(float f2, View view) {
        if (f2 != -1.0f) {
            return f2;
        }
        return view.getElevation();
    }

    public static O22 m1(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 O22 o22) {
        if (o22 != null) {
            return o22;
        }
        int i = C7025iN1.h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof O22) {
            return (O22) view.getTag(i);
        }
        Context context = view.getContext();
        int v1 = v1(context);
        if (v1 != -1) {
            return O22.b(context, v1, 0).m();
        }
        if (view instanceof InterfaceC6946i32) {
            return ((InterfaceC6946i32) view).getShapeAppearanceModel();
        }
        return O22.a().m();
    }

    @InterfaceC4698Xf2
    public static int v1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C7025iN1.c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public boolean A1() {
        return this.Y1;
    }

    public void C1(@JF int i) {
        this.e2 = i;
        this.f2 = i;
        this.g2 = i;
    }

    public void D1(@JF int i) {
        this.e2 = i;
    }

    public void E1(boolean z) {
        this.X1 = z;
    }

    public void F1(@PL0 int i) {
        this.b2 = i;
    }

    public void G1(boolean z) {
        this.t2 = z;
    }

    public void H1(@JF int i) {
        this.g2 = i;
    }

    public void J1(float f2) {
        this.v2 = f2;
    }

    public void K1(@InterfaceC11300zs1 O22 o22) {
        this.o2 = o22;
    }

    public void L1(@InterfaceC11300zs1 View view) {
        this.m2 = view;
    }

    @Override // o.AbstractC5921dt2
    public void M0(@InterfaceC11300zs1 AbstractC9139qz1 abstractC9139qz1) {
        super.M0(abstractC9139qz1);
        this.Z1 = true;
    }

    public void M1(@PL0 int i) {
        this.d2 = i;
    }

    public void N1(int i) {
        this.j2 = i;
    }

    public void O1(@InterfaceC11300zs1 e eVar) {
        this.p2 = eVar;
    }

    public void P1(int i) {
        this.k2 = i;
    }

    public void Q1(boolean z) {
        this.Y1 = z;
    }

    public void R1(@InterfaceC11300zs1 e eVar) {
        this.r2 = eVar;
    }

    public final f S0(boolean z) {
        AbstractC9139qz1 P = P();
        if (!(P instanceof C3811Od) && !(P instanceof W81)) {
            return t1(z, K2, L2);
        }
        return t1(z, M2, N2);
    }

    public void S1(@InterfaceC11300zs1 e eVar) {
        this.q2 = eVar;
    }

    public void U1(@JF int i) {
        this.h2 = i;
    }

    public void V1(@InterfaceC11300zs1 e eVar) {
        this.s2 = eVar;
    }

    public void W1(@JF int i) {
        this.f2 = i;
    }

    @JF
    public int X0() {
        return this.e2;
    }

    public void X1(float f2) {
        this.u2 = f2;
    }

    @PL0
    public int Y0() {
        return this.b2;
    }

    public void Y1(@InterfaceC11300zs1 O22 o22) {
        this.n2 = o22;
    }

    @Override // o.AbstractC5921dt2
    @InterfaceC11300zs1
    public String[] Z() {
        return J2;
    }

    public void Z1(@InterfaceC11300zs1 View view) {
        this.l2 = view;
    }

    public void a2(@PL0 int i) {
        this.c2 = i;
    }

    @JF
    public int b1() {
        return this.g2;
    }

    public void b2(int i) {
        this.i2 = i;
    }

    public float c1() {
        return this.v2;
    }

    @InterfaceC11300zs1
    public O22 d1() {
        return this.o2;
    }

    @InterfaceC11300zs1
    public View e1() {
        return this.m2;
    }

    @PL0
    public int f1() {
        return this.d2;
    }

    public int g1() {
        return this.j2;
    }

    @InterfaceC11300zs1
    public e h1() {
        return this.p2;
    }

    public int i1() {
        return this.k2;
    }

    @InterfaceC11300zs1
    public e j1() {
        return this.r2;
    }

    @InterfaceC11300zs1
    public e k1() {
        return this.q2;
    }

    @JF
    public int l1() {
        return this.h2;
    }

    @Override // o.AbstractC5921dt2
    public void m(@InterfaceC5670cr1 C3291It2 c3291It2) {
        W0(c3291It2, this.m2, this.d2, this.o2);
    }

    @InterfaceC11300zs1
    public e n1() {
        return this.s2;
    }

    @JF
    public int o1() {
        return this.f2;
    }

    @Override // o.AbstractC5921dt2
    public void p(@InterfaceC5670cr1 C3291It2 c3291It2) {
        W0(c3291It2, this.l2, this.c2, this.n2);
    }

    public float p1() {
        return this.u2;
    }

    @InterfaceC11300zs1
    public O22 q1() {
        return this.n2;
    }

    @InterfaceC11300zs1
    public View r1() {
        return this.l2;
    }

    @PL0
    public int s1() {
        return this.c2;
    }

    @Override // o.AbstractC5921dt2
    @InterfaceC11300zs1
    public Animator t(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC11300zs1 C3291It2 c3291It2, @InterfaceC11300zs1 C3291It2 c3291It22) {
        View view;
        View f2;
        View view2 = null;
        if (c3291It2 != null && c3291It22 != null) {
            RectF rectF = (RectF) c3291It2.a.get("materialContainerTransition:bounds");
            O22 o22 = (O22) c3291It2.a.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && o22 != null) {
                RectF rectF2 = (RectF) c3291It22.a.get("materialContainerTransition:bounds");
                O22 o222 = (O22) c3291It22.a.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && o222 != null) {
                    View view3 = c3291It2.b;
                    View view4 = c3291It22.b;
                    if (view4.getParent() != null) {
                        view = view4;
                    } else {
                        view = view3;
                    }
                    if (this.b2 == view.getId()) {
                        f2 = (View) view.getParent();
                        view2 = view;
                    } else {
                        f2 = C3095Gt2.f(view, this.b2);
                    }
                    RectF h2 = C3095Gt2.h(f2);
                    float f3 = -h2.left;
                    float f4 = -h2.top;
                    RectF T0 = T0(f2, view2, f3, f4);
                    rectF.offset(f3, f4);
                    rectF2.offset(f3, f4);
                    boolean z1 = z1(rectF, rectF2);
                    if (!this.a2) {
                        B1(view.getContext(), z1);
                    }
                    h hVar = new h(P(), view3, rectF, o22, a1(this.u2, view3), view4, rectF2, o222, a1(this.v2, view4), this.e2, this.f2, this.g2, this.h2, z1, this.t2, C8098mk0.a(this.j2, z1), C8625ou0.a(this.k2, z1, rectF, rectF2), S0(z1), this.X1, null);
                    hVar.setBounds(Math.round(T0.left), Math.round(T0.top), Math.round(T0.right), Math.round(T0.bottom));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new a(hVar));
                    d(new b(f2, hVar, view3, view4));
                    return ofFloat;
                }
                Log.w(G2, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w(G2, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public final f t1(boolean z, f fVar, f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new f((e) C3095Gt2.e(this.p2, fVar.a), (e) C3095Gt2.e(this.q2, fVar.b), (e) C3095Gt2.e(this.r2, fVar.c), (e) C3095Gt2.e(this.s2, fVar.d), null);
    }

    public int u1() {
        return this.i2;
    }

    public boolean w1() {
        return this.X1;
    }

    public boolean y1() {
        return this.t2;
    }

    public final boolean z1(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 RectF rectF2) {
        int i = this.i2;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.i2);
        } else if (C3095Gt2.b(rectF2) <= C3095Gt2.b(rectF)) {
            return false;
        } else {
            return true;
        }
    }

    public C9665t91(@InterfaceC5670cr1 Context context, boolean z) {
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = false;
        this.b2 = 16908290;
        this.c2 = -1;
        this.d2 = -1;
        this.e2 = 0;
        this.f2 = 0;
        this.g2 = 0;
        this.h2 = 1375731712;
        this.i2 = 0;
        this.j2 = 0;
        this.k2 = 0;
        this.t2 = Build.VERSION.SDK_INT >= 28;
        this.u2 = -1.0f;
        this.v2 = -1.0f;
        B1(context, z);
        this.a2 = true;
    }
}
