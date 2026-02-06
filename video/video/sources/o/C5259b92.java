package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.b92  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5259b92 extends VI2 {
    public static final String i2 = "android:slide:screenPosition";
    public g e2;
    public int f2;
    public static final TimeInterpolator g2 = new DecelerateInterpolator();
    public static final TimeInterpolator h2 = new AccelerateInterpolator();
    public static final g j2 = new a();
    public static final g k2 = new b();
    public static final g l2 = new c();
    public static final g m2 = new d();
    public static final g n2 = new e();
    public static final g o2 = new f();

    /* renamed from: o.b92$a */
    /* loaded from: classes.dex */
    public class a extends h {
        public a() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: o.b92$b */
    /* loaded from: classes.dex */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float b(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: o.b92$c */
    /* loaded from: classes.dex */
    public class c extends i {
        public c() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: o.b92$d */
    /* loaded from: classes.dex */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: o.b92$e */
    /* loaded from: classes.dex */
    public class e extends h {
        public e() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float b(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: o.b92$f */
    /* loaded from: classes.dex */
    public class f extends i {
        public f() {
            super(null);
        }

        @Override // o.C5259b92.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: o.b92$g */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* renamed from: o.b92$h */
    /* loaded from: classes.dex */
    public static abstract class h implements g {
        public h() {
        }

        @Override // o.C5259b92.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* renamed from: o.b92$i */
    /* loaded from: classes.dex */
    public static abstract class i implements g {
        public i() {
        }

        @Override // o.C5259b92.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.b92$j */
    /* loaded from: classes.dex */
    public @interface j {
    }

    public C5259b92() {
        this.e2 = o2;
        this.f2 = 80;
        d1(80);
    }

    private void R0(C3291It2 c3291It2) {
        int[] iArr = new int[2];
        c3291It2.b.getLocationOnScreen(iArr);
        c3291It2.a.put(i2, iArr);
    }

    @Override // o.VI2
    public Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        if (c3291It22 == null) {
            return null;
        }
        int[] iArr = (int[]) c3291It22.a.get(i2);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C3487Kt2.a(view, c3291It22, iArr[0], iArr[1], this.e2.b(viewGroup, view), this.e2.a(viewGroup, view), translationX, translationY, g2, this);
    }

    @Override // o.VI2
    public Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        if (c3291It2 == null) {
            return null;
        }
        int[] iArr = (int[]) c3291It2.a.get(i2);
        return C3487Kt2.a(view, c3291It2, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.e2.b(viewGroup, view), this.e2.a(viewGroup, view), h2, this);
    }

    public int c1() {
        return this.f2;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    public void d1(int i3) {
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 48) {
                    if (i3 != 80) {
                        if (i3 != 8388611) {
                            if (i3 == 8388613) {
                                this.e2 = n2;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.e2 = k2;
                        }
                    } else {
                        this.e2 = o2;
                    }
                } else {
                    this.e2 = l2;
                }
            } else {
                this.e2 = m2;
            }
        } else {
            this.e2 = j2;
        }
        this.f2 = i3;
        W52 w52 = new W52();
        w52.k(i3);
        N0(w52);
    }

    @Override // o.VI2, o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        super.m(c3291It2);
        R0(c3291It2);
    }

    @Override // o.VI2, o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        super.p(c3291It2);
        R0(c3291It2);
    }

    public C5259b92(int i3) {
        this.e2 = o2;
        this.f2 = 80;
        d1(i3);
    }

    public C5259b92(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e2 = o2;
        this.f2 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.h);
        int k = C5206aw2.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        d1(k);
    }
}
