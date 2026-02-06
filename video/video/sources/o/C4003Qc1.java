package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Qc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4003Qc1 extends Z81<View> {
    public static final float q = 0.9f;
    public final float k;
    public final float l;
    public float m;
    @InterfaceC11300zs1
    public Rect n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Rect f590o;
    @InterfaceC11300zs1
    public float[] p;

    /* renamed from: o.Qc1$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public C4003Qc1(@InterfaceC5670cr1 View view) {
        super(view);
        Resources resources = view.getResources();
        this.k = resources.getDimension(C7025iN1.f.m3_back_progress_main_container_min_edge_gap);
        this.l = resources.getDimension(C7025iN1.f.m3_back_progress_main_container_max_translation_y);
    }

    public static float[] r(float[] fArr, float f, float f2) {
        return new float[]{C5600ca.a(fArr[0], f, f2), C5600ca.a(fArr[1], f, f2), C5600ca.a(fArr[2], f, f2), C5600ca.a(fArr[3], f, f2), C5600ca.a(fArr[4], f, f2), C5600ca.a(fArr[5], f, f2), C5600ca.a(fArr[6], f, f2), C5600ca.a(fArr[7], f, f2)};
    }

    public static float[] s(float[] fArr, float[] fArr2, float f) {
        return new float[]{C5600ca.a(fArr[0], fArr2[0], f), C5600ca.a(fArr[1], fArr2[1], f), C5600ca.a(fArr[2], fArr2[2], f), C5600ca.a(fArr[3], fArr2[3], f), C5600ca.a(fArr[4], fArr2[4], f), C5600ca.a(fArr[5], fArr2[5], f), C5600ca.a(fArr[6], fArr2[6], f), C5600ca.a(fArr[7], fArr2[7], f)};
    }

    public final float[] h() {
        WindowInsets rootWindowInsets;
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = this.b.getRootWindowInsets()) != null) {
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            int i5 = displayMetrics.widthPixels;
            int i6 = displayMetrics.heightPixels;
            int[] iArr = new int[2];
            this.b.getLocationOnScreen(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            int width = this.b.getWidth();
            int height = this.b.getHeight();
            if (i7 == 0 && i8 == 0) {
                i = q(rootWindowInsets, 0);
            } else {
                i = 0;
            }
            int i9 = width + i7;
            if (i9 >= i5 && i8 == 0) {
                i2 = q(rootWindowInsets, 1);
            } else {
                i2 = 0;
            }
            if (i9 >= i5 && i8 + height >= i6) {
                i3 = q(rootWindowInsets, 2);
            } else {
                i3 = 0;
            }
            if (i7 == 0 && i8 + height >= i6) {
                i4 = q(rootWindowInsets, 3);
            } else {
                i4 = 0;
            }
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            return new float[]{f, f, f2, f2, f3, f3, f4, f4};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void i(@InterfaceC11300zs1 View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet l = l(view);
        V v = this.b;
        if (v instanceof ClippableRoundedCornerLayout) {
            l.playTogether(k((ClippableRoundedCornerLayout) v));
        }
        l.setDuration(this.e);
        l.start();
        t();
    }

    public void j() {
        this.p = null;
    }

    @InterfaceC5670cr1
    public final ValueAnimator k(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: o.Oc1
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                Object s;
                s = C4003Qc1.s((float[]) obj, (float[]) obj2, f);
                return s;
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), n());
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Pc1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClippableRoundedCornerLayout.this.e((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return ofObject;
    }

    @InterfaceC5670cr1
    public final AnimatorSet l(@InterfaceC11300zs1 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.b, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    public void m(long j, @InterfaceC11300zs1 View view) {
        AnimatorSet l = l(view);
        l.setDuration(j);
        l.start();
        t();
    }

    @InterfaceC5670cr1
    public float[] n() {
        if (this.p == null) {
            this.p = h();
        }
        return this.p;
    }

    @InterfaceC11300zs1
    public Rect o() {
        return this.f590o;
    }

    @InterfaceC11300zs1
    public Rect p() {
        return this.n;
    }

    @ES1(31)
    public final int q(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            return radius;
        }
        return 0;
    }

    public final void t() {
        this.m = 0.0f;
        this.n = null;
        this.f590o = null;
    }

    @InterfaceC5056aJ2
    public void u(float f, @InterfaceC11300zs1 View view) {
        this.n = C10920yI2.d(this.b);
        if (view != null) {
            this.f590o = C10920yI2.c(this.b, view);
        }
        this.m = f;
    }

    public void v(@InterfaceC5670cr1 C8827pk c8827pk, @InterfaceC11300zs1 View view) {
        super.d(c8827pk);
        u(c8827pk.e(), view);
    }

    @InterfaceC5056aJ2
    public void w(float f, boolean z, float f2, float f3) {
        int i;
        float a2 = a(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a3 = C5600ca.a(1.0f, 0.9f, a2);
            float a4 = C5600ca.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.k), a2);
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            float f4 = a4 * i;
            float min = Math.min(Math.max(0.0f, ((height - (a3 * height)) / 2.0f) - this.k), this.l);
            float f5 = f2 - this.m;
            float a5 = C5600ca.a(0.0f, min, Math.abs(f5) / height) * Math.signum(f5);
            if (!Float.isNaN(a3) && !Float.isNaN(f4) && !Float.isNaN(a5)) {
                this.b.setScaleX(a3);
                this.b.setScaleY(a3);
                this.b.setTranslationX(f4);
                this.b.setTranslationY(a5);
                V v = this.b;
                if (v instanceof ClippableRoundedCornerLayout) {
                    ((ClippableRoundedCornerLayout) v).e(r(n(), f3, a2));
                }
            }
        }
    }

    public void x(@InterfaceC5670cr1 C8827pk c8827pk, @InterfaceC11300zs1 View view, float f) {
        boolean z;
        if (super.e(c8827pk) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        if (c8827pk.c() == 0) {
            z = true;
        } else {
            z = false;
        }
        w(c8827pk.b(), z, c8827pk.e(), f);
    }
}
