package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Zc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4889Zc1 extends Z81<View> {
    public final float k;
    public final float l;
    public final float m;

    /* renamed from: o.Zc1$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        public a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4889Zc1.this.b.setTranslationX(0.0f);
            C4889Zc1.this.k(0.0f, this.a, this.b);
        }
    }

    public C4889Zc1(@InterfaceC5670cr1 View view) {
        super(view);
        Resources resources = view.getResources();
        this.k = resources.getDimension(C7025iN1.f.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.l = resources.getDimension(C7025iN1.f.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.m = resources.getDimension(C7025iN1.f.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, 1.0f));
        V v = this.b;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public final boolean g(@KE0 int i, @KE0 int i2) {
        if ((Gravity.getAbsoluteGravity(i, this.b.getLayoutDirection()) & i2) == i2) {
            return true;
        }
        return false;
    }

    public void h(@InterfaceC5670cr1 C8827pk c8827pk, @KE0 int i, @InterfaceC11300zs1 Animator.AnimatorListener animatorListener, @InterfaceC11300zs1 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z;
        if (c8827pk.c() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean g = g(i, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(g);
        V v = this.b;
        Property property = View.TRANSLATION_X;
        if (g) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C10304vn0());
        ofFloat.setDuration(C5600ca.c(this.c, this.d, c8827pk.b()));
        ofFloat.addListener(new a(z, i));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public final int i(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                return marginLayoutParams.leftMargin;
            }
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public void j(@InterfaceC5670cr1 C8827pk c8827pk) {
        super.d(c8827pk);
    }

    @InterfaceC5056aJ2
    public void k(float f, boolean z, @KE0 int i) {
        boolean z2;
        int i2;
        float f2;
        float f3;
        float a2 = a(f);
        boolean g = g(i, 3);
        if (z == g) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f4 = width;
        if (f4 > 0.0f) {
            float f5 = height;
            if (f5 > 0.0f) {
                float f6 = this.k / f4;
                float f7 = this.l / f4;
                float f8 = this.m / f5;
                V v = this.b;
                if (g) {
                    f4 = 0.0f;
                }
                v.setPivotX(f4);
                if (!z2) {
                    f7 = -f6;
                }
                float a3 = C5600ca.a(0.0f, f7, a2);
                float f9 = a3 + 1.0f;
                float a4 = 1.0f - C5600ca.a(0.0f, f8, a2);
                if (!Float.isNaN(f9) && !Float.isNaN(a4)) {
                    this.b.setScaleX(f9);
                    this.b.setScaleY(a4);
                    V v2 = this.b;
                    if (v2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) v2;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (g) {
                                i2 = (width - childAt.getRight()) + childAt.getWidth();
                            } else {
                                i2 = -childAt.getLeft();
                            }
                            childAt.setPivotX(i2);
                            childAt.setPivotY(-childAt.getTop());
                            if (z2) {
                                f2 = 1.0f - a3;
                            } else {
                                f2 = 1.0f;
                            }
                            if (a4 != 0.0f) {
                                f3 = (f9 / a4) * f2;
                            } else {
                                f3 = 1.0f;
                            }
                            if (!Float.isNaN(f2) && !Float.isNaN(f3)) {
                                childAt.setScaleX(f2);
                                childAt.setScaleY(f3);
                            }
                        }
                    }
                }
            }
        }
    }

    public void l(@InterfaceC5670cr1 C8827pk c8827pk, @KE0 int i) {
        boolean z;
        if (super.e(c8827pk) == null) {
            return;
        }
        if (c8827pk.c() == 0) {
            z = true;
        } else {
            z = false;
        }
        k(c8827pk.b(), z, i);
    }
}
