package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;
import o.HT1;

@ES1(21)
/* renamed from: o.c92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5501c92 implements WI2 {
    public static final int c = -1;
    public int a;
    @PK1
    public int b = -1;

    /* renamed from: o.c92$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;

        public a(View view, float f) {
            this.a = view;
            this.b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setTranslationX(this.b);
        }
    }

    /* renamed from: o.c92$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;

        public b(View view, float f) {
            this.a = view;
            this.b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setTranslationY(this.b);
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.c92$c */
    /* loaded from: classes3.dex */
    public @interface c {
    }

    public C5501c92(int i) {
        this.a = i;
    }

    public static Animator c(View view, View view2, int i, @PK1 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (j(view)) {
                                    f2 = translationX - i2;
                                } else {
                                    f2 = i2 + translationX;
                                }
                                return e(view2, f2, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (j(view)) {
                            f = i2 + translationX;
                        } else {
                            f = translationX - i2;
                        }
                        return e(view2, f, translationX, translationX);
                    }
                    return f(view2, i2 + translationY, translationY, translationY);
                }
                return f(view2, translationY - i2, translationY, translationY);
            }
            return e(view2, translationX - i2, translationX, translationX);
        }
        return e(view2, i2 + translationX, translationX, translationX);
    }

    public static Animator d(View view, View view2, int i, @PK1 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (j(view)) {
                                    f2 = i2 + translationX;
                                } else {
                                    f2 = translationX - i2;
                                }
                                return e(view2, translationX, f2, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (j(view)) {
                            f = translationX - i2;
                        } else {
                            f = i2 + translationX;
                        }
                        return e(view2, translationX, f, translationX);
                    }
                    return f(view2, translationY, translationY - i2, translationY);
                }
                return f(view2, translationY, i2 + translationY, translationY);
            }
            return e(view2, translationX, i2 + translationX, translationX);
        }
        return e(view2, translationX, translationX - i2, translationX);
    }

    public static Animator e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new a(view, f3));
        return ofPropertyValuesHolder;
    }

    public static Animator f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new b(view, f3));
        return ofPropertyValuesHolder;
    }

    public static boolean j(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator a(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        return d(viewGroup, view, this.a, h(view.getContext()));
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator b(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        return c(viewGroup, view, this.a, h(view.getContext()));
    }

    @PK1
    public int g() {
        return this.b;
    }

    public final int h(Context context) {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_transition_shared_axis_slide_distance);
    }

    public int i() {
        return this.a;
    }

    public void k(@PK1 int i) {
        if (i >= 0) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void l(int i) {
        this.a = i;
    }
}
