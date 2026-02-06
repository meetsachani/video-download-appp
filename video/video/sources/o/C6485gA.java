package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import o.BM1;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.gA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6485gA extends AbstractC5921dt2 {
    public static final String c2 = "android:changeTransform:parent";
    public static final String e2 = "android:changeTransform:intermediateParentMatrix";
    public static final String f2 = "android:changeTransform:intermediateMatrix";
    public boolean X1;
    public boolean Y1;
    public Matrix Z1;
    public static final String a2 = "android:changeTransform:matrix";
    public static final String b2 = "android:changeTransform:transforms";
    public static final String d2 = "android:changeTransform:parentMatrix";
    public static final String[] g2 = {a2, b2, d2};
    public static final Property<e, float[]> h2 = new a(float[].class, "nonTranslations");
    public static final Property<e, PointF> i2 = new b(PointF.class, "translations");
    public static final boolean j2 = true;

    /* renamed from: o.gA$a */
    /* loaded from: classes.dex */
    public class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* renamed from: o.gA$b */
    /* loaded from: classes.dex */
    public class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* renamed from: o.gA$c */
    /* loaded from: classes.dex */
    public static class c extends C10333vt2 {
        public View a;
        public InterfaceC5758dD0 b;

        public c(View view, InterfaceC5758dD0 interfaceC5758dD0) {
            this.a = view;
            this.b = interfaceC5758dD0;
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            this.b.setVisibility(0);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
            C6741hD0.b(this.a);
            this.a.setTag(BM1.a.transition_transform, null);
            this.a.setTag(BM1.a.parent_matrix, null);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            this.b.setVisibility(4);
        }
    }

    /* renamed from: o.gA$d */
    /* loaded from: classes.dex */
    public static class d extends AnimatorListenerAdapter {
        public boolean a;
        public final Matrix b = new Matrix();
        public final boolean c;
        public final boolean d;
        public final View e;
        public final f f;
        public final e g;
        public final Matrix h;

        public d(View view, f fVar, e eVar, Matrix matrix, boolean z, boolean z2) {
            this.c = z;
            this.d = z2;
            this.e = view;
            this.f = fVar;
            this.g = eVar;
            this.h = matrix;
        }

        public final void a(Matrix matrix) {
            this.b.set(matrix);
            this.e.setTag(BM1.a.transition_transform, this.b);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                if (this.c && this.d) {
                    a(this.h);
                } else {
                    this.e.setTag(BM1.a.transition_transform, null);
                    this.e.setTag(BM1.a.parent_matrix, null);
                }
            }
            AI2.d(this.e, null);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            C6485gA.Y0(this.e);
        }
    }

    /* renamed from: o.gA$e */
    /* loaded from: classes.dex */
    public static class e {
        public final Matrix a = new Matrix();
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        public Matrix a() {
            return this.a;
        }

        public final void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            AI2.d(this.b, this.a);
        }

        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    /* renamed from: o.gA$f */
    /* loaded from: classes.dex */
    public static class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = C6516gH2.F0(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            C6485gA.d1(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.a != this.a || fVar.b != this.b || fVar.c != this.c || fVar.d != this.d || fVar.e != this.e || fVar.f != this.f || fVar.g != this.g || fVar.h != this.h) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.a;
            int i8 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.b;
            if (f2 != 0.0f) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.c;
            if (f3 != 0.0f) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.d;
            if (f4 != 0.0f) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.e;
            if (f5 != 0.0f) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f;
            if (f6 != 0.0f) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.g;
            if (f7 != 0.0f) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.h;
            if (f8 != 0.0f) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }
    }

    public C6485gA() {
        this.X1 = true;
        this.Y1 = true;
        this.Z1 = new Matrix();
    }

    private void R0(C3291It2 c3291It2) {
        Matrix matrix;
        View view = c3291It2.b;
        if (view.getVisibility() != 8) {
            c3291It2.a.put(c2, view.getParent());
            c3291It2.a.put(b2, new f(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 != null && !matrix2.isIdentity()) {
                matrix = new Matrix(matrix2);
            } else {
                matrix = null;
            }
            c3291It2.a.put(a2, matrix);
            if (this.Y1) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                AI2.h(viewGroup, matrix3);
                matrix3.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
                c3291It2.a.put(d2, matrix3);
                c3291It2.a.put(f2, view.getTag(BM1.a.transition_transform));
                c3291It2.a.put(e2, view.getTag(BM1.a.parent_matrix));
            }
        }
    }

    public static void Y0(View view) {
        d1(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void d1(View view, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        view.setTranslationX(f3);
        view.setTranslationY(f4);
        C6516gH2.H2(view, f5);
        view.setScaleX(f6);
        view.setScaleY(f7);
        view.setRotationX(f8);
        view.setRotationY(f9);
        view.setRotation(f10);
    }

    public final void S0(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        View view = c3291It22.b;
        Matrix matrix = new Matrix((Matrix) c3291It22.a.get(d2));
        AI2.i(viewGroup, matrix);
        InterfaceC5758dD0 a3 = C6741hD0.a(view, viewGroup, matrix);
        if (a3 != null) {
            a3.a((ViewGroup) c3291It2.a.get(c2), c3291It2.b);
            AbstractC5921dt2 abstractC5921dt2 = this;
            while (true) {
                AbstractC5921dt2 abstractC5921dt22 = abstractC5921dt2.m1;
                if (abstractC5921dt22 == null) {
                    break;
                }
                abstractC5921dt2 = abstractC5921dt22;
            }
            abstractC5921dt2.d(new c(view, a3));
            if (j2) {
                View view2 = c3291It2.b;
                if (view2 != c3291It22.b) {
                    AI2.f(view2, 0.0f);
                }
                AI2.f(view, 1.0f);
            }
        }
    }

    public final ObjectAnimator T0(C3291It2 c3291It2, C3291It2 c3291It22, boolean z) {
        Matrix matrix = (Matrix) c3291It2.a.get(a2);
        Matrix matrix2 = (Matrix) c3291It22.a.get(a2);
        if (matrix == null) {
            matrix = C10511wd1.a;
        }
        if (matrix2 == null) {
            matrix2 = C10511wd1.a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) c3291It22.a.get(b2);
        View view = c3291It22.b;
        Y0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(h2, new C6170ev0(new float[9]), fArr, fArr2), OJ1.a(i2, P().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        d dVar = new d(view, fVar, eVar, matrix3, z, this.X1);
        ofPropertyValuesHolder.addListener(dVar);
        ofPropertyValuesHolder.addPauseListener(dVar);
        return ofPropertyValuesHolder;
    }

    public boolean V0() {
        return this.Y1;
    }

    public boolean W0() {
        return this.X1;
    }

    public final boolean X0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (h0(viewGroup) && h0(viewGroup2)) {
            C3291It2 N = N(viewGroup, true);
            if (N != null && viewGroup2 == N.b) {
                return true;
            }
            return false;
        } else if (viewGroup == viewGroup2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return g2;
    }

    public final void a1(C3291It2 c3291It2, C3291It2 c3291It22) {
        Matrix matrix = (Matrix) c3291It22.a.get(d2);
        c3291It22.b.setTag(BM1.a.parent_matrix, matrix);
        Matrix matrix2 = this.Z1;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) c3291It2.a.get(a2);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            c3291It2.a.put(a2, matrix3);
        }
        matrix3.postConcat((Matrix) c3291It2.a.get(d2));
        matrix3.postConcat(matrix2);
    }

    public void b1(boolean z) {
        this.Y1 = z;
    }

    public void c1(boolean z) {
        this.X1 = z;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        R0(c3291It2);
        if (!j2) {
            ((ViewGroup) c3291It2.b.getParent()).startViewTransition(c3291It2.b);
        }
    }

    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        boolean z;
        if (c3291It2 != null && c3291It22 != null && c3291It2.a.containsKey(c2) && c3291It22.a.containsKey(c2)) {
            ViewGroup viewGroup2 = (ViewGroup) c3291It2.a.get(c2);
            ViewGroup viewGroup3 = (ViewGroup) c3291It22.a.get(c2);
            if (this.Y1 && !X0(viewGroup2, viewGroup3)) {
                z = true;
            } else {
                z = false;
            }
            Matrix matrix = (Matrix) c3291It2.a.get(f2);
            if (matrix != null) {
                c3291It2.a.put(a2, matrix);
            }
            Matrix matrix2 = (Matrix) c3291It2.a.get(e2);
            if (matrix2 != null) {
                c3291It2.a.put(d2, matrix2);
            }
            if (z) {
                a1(c3291It2, c3291It22);
            }
            ObjectAnimator T0 = T0(c3291It2, c3291It22, z);
            if (z && T0 != null && this.X1) {
                S0(viewGroup, c3291It2, c3291It22);
                return T0;
            }
            if (!j2) {
                viewGroup2.endViewTransition(c3291It2.b);
            }
            return T0;
        }
        return null;
    }

    public C6485gA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X1 = true;
        this.Y1 = true;
        this.Z1 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.X1 = C5206aw2.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.Y1 = C5206aw2.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
