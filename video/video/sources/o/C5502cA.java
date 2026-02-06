package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import o.AbstractC5921dt2;
import o.BM1;

/* renamed from: o.cA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5502cA extends AbstractC5921dt2 {
    public static final String Y1 = "android:changeBounds:bounds";
    public static final String Z1 = "android:changeBounds:clip";
    public static final String a2 = "android:changeBounds:parent";
    public static final String b2 = "android:changeBounds:windowX";
    public static final String c2 = "android:changeBounds:windowY";
    public static final String[] d2 = {Y1, Z1, a2, b2, c2};
    public static final Property<i, PointF> e2 = new a(PointF.class, "topLeft");
    public static final Property<i, PointF> f2 = new b(PointF.class, "bottomRight");
    public static final Property<View, PointF> g2 = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> h2 = new d(PointF.class, "topLeft");
    public static final Property<View, PointF> i2 = new e(PointF.class, "position");
    public static final C11190zP1 j2 = new C11190zP1();
    public boolean X1;

    /* renamed from: o.cA$a */
    /* loaded from: classes.dex */
    public class a extends Property<i, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: o.cA$b */
    /* loaded from: classes.dex */
    public class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: o.cA$c */
    /* loaded from: classes.dex */
    public class c extends Property<View, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            AI2.e(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: o.cA$d */
    /* loaded from: classes.dex */
    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            AI2.e(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: o.cA$e */
    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AI2.e(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: o.cA$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        private final i mViewBounds;

        public f(i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: o.cA$g */
    /* loaded from: classes.dex */
    public static class g extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final View a;
        public final Rect b;
        public final boolean c;
        public final Rect d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public boolean n;

        public g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a = view;
            this.b = rect;
            this.c = z;
            this.d = rect2;
            this.e = z2;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.l = i7;
            this.m = i8;
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            View view = this.a;
            int i = BM1.a.transition_clip;
            this.a.setTag(i, null);
            this.a.setClipBounds((Rect) view.getTag(i));
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            Rect rect;
            this.a.setTag(BM1.a.transition_clip, this.a.getClipBounds());
            if (this.e) {
                rect = null;
            } else {
                rect = this.d;
            }
            this.a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            this.n = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.n) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.c) {
                    rect = this.b;
                }
            } else if (!this.e) {
                rect = this.d;
            }
            this.a.setClipBounds(rect);
            if (z) {
                AI2.e(this.a, this.f, this.g, this.h, this.i);
            } else {
                AI2.e(this.a, this.j, this.k, this.l, this.m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int max = Math.max(this.h - this.f, this.l - this.j);
            int max2 = Math.max(this.i - this.g, this.m - this.k);
            int i = z ? this.j : this.f;
            int i2 = z ? this.k : this.g;
            AI2.e(this.a, i, i2, max + i, max2 + i2);
            this.a.setClipBounds(z ? this.d : this.b);
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    /* renamed from: o.cA$h */
    /* loaded from: classes.dex */
    public static class h extends C10333vt2 {
        public boolean a = false;
        public final ViewGroup b;

        public h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            C8963qH2.c(this.b, true);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            if (!this.a) {
                C8963qH2.c(this.b, false);
            }
            abstractC5921dt2.u0(this);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            C8963qH2.c(this.b, false);
        }

        @Override // o.C10333vt2, o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            C8963qH2.c(this.b, false);
            this.a = true;
        }
    }

    /* renamed from: o.cA$i */
    /* loaded from: classes.dex */
    public static class i {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            AI2.e(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    public C5502cA() {
        this.X1 = false;
    }

    public final void R0(C3291It2 c3291It2) {
        View view = c3291It2.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            c3291It2.a.put(Y1, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c3291It2.a.put(a2, c3291It2.b.getParent());
            if (this.X1) {
                c3291It2.a.put(Z1, view.getClipBounds());
            }
        }
    }

    public boolean S0() {
        return this.X1;
    }

    public void T0(boolean z) {
        this.X1 = z;
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return d2;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        Rect rect;
        R0(c3291It2);
        if (this.X1 && (rect = (Rect) c3291It2.b.getTag(BM1.a.transition_clip)) != null) {
            c3291It2.a.put(Z1, rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        int i3;
        int i4;
        int i5;
        int i6;
        ObjectAnimator a3;
        boolean z;
        int i7;
        Rect rect;
        int i8;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator c3;
        if (c3291It2 == null || c3291It22 == null) {
            return null;
        }
        Map<String, Object> map = c3291It2.a;
        Map<String, Object> map2 = c3291It22.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(a2);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(a2);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c3291It22.b;
        Rect rect3 = (Rect) c3291It2.a.get(Y1);
        Rect rect4 = (Rect) c3291It22.a.get(Y1);
        int i9 = rect3.left;
        int i10 = rect4.left;
        int i11 = rect3.top;
        int i12 = rect4.top;
        int i13 = rect3.right;
        int i14 = rect4.right;
        int i15 = rect3.bottom;
        int i16 = rect4.bottom;
        int i17 = i13 - i9;
        int i18 = i15 - i11;
        int i19 = i14 - i10;
        int i20 = i16 - i12;
        Rect rect5 = (Rect) c3291It2.a.get(Z1);
        Rect rect6 = (Rect) c3291It22.a.get(Z1);
        if ((i17 != 0 && i18 != 0) || (i19 != 0 && i20 != 0)) {
            if (i9 == i10 && i11 == i12) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i13 != i14 || i15 != i16) {
                i3++;
            }
        } else {
            i3 = 0;
        }
        if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
            i3++;
        }
        int i21 = i3;
        if (i21 <= 0) {
            return null;
        }
        if (!this.X1) {
            AI2.e(view, i9, i11, i13, i15);
            if (i21 == 2) {
                if (i17 == i19 && i18 == i20) {
                    c3 = C4652Ws1.a(view, i2, P().a(i9, i11, i10, i12));
                } else {
                    i iVar = new i(view);
                    ObjectAnimator a4 = C4652Ws1.a(iVar, e2, P().a(i9, i11, i10, i12));
                    ObjectAnimator a5 = C4652Ws1.a(iVar, f2, P().a(i13, i15, i14, i16));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a4, a5);
                    animatorSet.addListener(new f(iVar));
                    c3 = animatorSet;
                }
            } else if (i9 == i10 && i11 == i12) {
                c3 = C4652Ws1.a(view, g2, P().a(i13, i15, i14, i16));
            } else {
                c3 = C4652Ws1.a(view, h2, P().a(i9, i11, i10, i12));
            }
        } else {
            AI2.e(view, i9, i11, Math.max(i17, i19) + i9, i11 + Math.max(i18, i20));
            if (i9 == i10 && i11 == i12) {
                a3 = null;
                i4 = i16;
                i6 = i10;
                i5 = i14;
            } else {
                i4 = i16;
                i5 = i14;
                i6 = i10;
                a3 = C4652Ws1.a(view, i2, P().a(i9, i11, i10, i12));
            }
            if (rect5 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i7 = 0;
                rect = new Rect(0, 0, i17, i18);
            } else {
                i7 = 0;
                rect = rect5;
            }
            if (rect6 == null) {
                i8 = 1;
            } else {
                i8 = i7;
            }
            if (i8 != 0) {
                rect2 = new Rect(i7, i7, i19, i20);
            } else {
                rect2 = rect6;
            }
            if (!rect.equals(rect2)) {
                view.setClipBounds(rect);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", j2, rect, rect2);
                g gVar = new g(view, rect, z, rect2, i8, i9, i11, i13, i15, i6, i12, i5, i4);
                objectAnimator.addListener(gVar);
                d(gVar);
            } else {
                objectAnimator = null;
            }
            c3 = C3193Ht2.c(a3, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C8963qH2.c(viewGroup4, true);
            R().d(new h(viewGroup4));
        }
        return c3;
    }

    public C5502cA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X1 = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.d);
        boolean e3 = C5206aw2.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        T0(e3);
    }
}
