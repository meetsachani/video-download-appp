package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.B60;
import o.C4590Wd;
import o.C5510cC;
import o.C5600ca;
import o.C6160es2;
import o.C6403fs2;
import o.C7025iN1;
import o.C7069ia;
import o.C8801pd1;
import o.C9076ql1;
import o.C9568sl1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC5670cr1;
import o.NC;
import o.NE1;
import o.UC;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect a1;
    public final RectF b1;
    public final RectF c1;
    public final int[] d1;
    public float e1;
    public float f1;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ UC a;
        public final /* synthetic */ Drawable b;

        public c(UC uc, Drawable drawable) {
            this.a = uc;
            this.b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ UC a;

        public d(UC uc) {
            this.a = uc;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UC.e revealInfo = this.a.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        @InterfaceC11300zs1
        public C9076ql1 a;
        public NE1 b;
    }

    public FabTransformationBehavior() {
        this.a1 = new Rect();
        this.b1 = new RectF();
        this.c1 = new RectF();
        this.d1 = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @InterfaceC5670cr1
    public AnimatorSet T(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, boolean z, boolean z2) {
        e o0 = o0(view2.getContext(), z);
        if (z) {
            this.e1 = view.getTranslationX();
            this.f1 = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h0(view, view2, z, z2, o0, arrayList, arrayList2);
        RectF rectF = this.b1;
        m0(view, view2, z, z2, o0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        g0(view, view2, z, o0, arrayList);
        j0(view, view2, z, z2, o0, arrayList, arrayList2);
        i0(view, view2, z, z2, o0, width, height, arrayList, arrayList2);
        f0(view, view2, z, z2, o0, arrayList, arrayList2);
        e0(view, view2, z, z2, o0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C7069ia.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @InterfaceC11300zs1
    public final ViewGroup U(@InterfaceC5670cr1 View view) {
        View findViewById = view.findViewById(C7025iN1.h.mtrl_child_content_container);
        if (findViewById != null) {
            return p0(findViewById);
        }
        if (!(view instanceof C6403fs2) && !(view instanceof C6160es2)) {
            return p0(view);
        }
        return p0(((ViewGroup) view).getChildAt(0));
    }

    public final void V(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 C9568sl1 c9568sl1, @InterfaceC5670cr1 C9568sl1 c9568sl12, float f, float f2, float f3, float f4, @InterfaceC5670cr1 RectF rectF) {
        float c0 = c0(eVar, c9568sl1, f, f3);
        float c02 = c0(eVar, c9568sl12, f2, f4);
        Rect rect = this.a1;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.b1;
        rectF2.set(rect);
        RectF rectF3 = this.c1;
        d0(view, rectF3);
        rectF3.offset(c0, c02);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void W(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RectF rectF) {
        d0(view, rectF);
        rectF.offset(this.e1, this.f1);
    }

    @InterfaceC5670cr1
    public final Pair<C9568sl1, C9568sl1> X(float f, float f2, boolean z, @InterfaceC5670cr1 e eVar) {
        C9568sl1 h;
        C9568sl1 h2;
        int i;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z && f2 < 0.0f) || (!z && i > 0)) {
                h = eVar.a.h("translationXCurveUpwards");
                h2 = eVar.a.h("translationYCurveUpwards");
            } else {
                h = eVar.a.h("translationXCurveDownwards");
                h2 = eVar.a.h("translationYCurveDownwards");
            }
        } else {
            h = eVar.a.h("translationXLinear");
            h2 = eVar.a.h("translationYLinear");
        }
        return new Pair<>(h, h2);
    }

    public final float Y(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 NE1 ne1) {
        RectF rectF = this.b1;
        RectF rectF2 = this.c1;
        W(view, rectF);
        d0(view2, rectF2);
        rectF2.offset(-a0(view, view2, ne1), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float Z(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 NE1 ne1) {
        RectF rectF = this.b1;
        RectF rectF2 = this.c1;
        W(view, rectF);
        d0(view2, rectF2);
        rectF2.offset(0.0f, -b0(view, view2, ne1));
        return rectF.centerY() - rectF2.top;
    }

    public final float a0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 NE1 ne1) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.b1;
        RectF rectF2 = this.c1;
        W(view, rectF);
        d0(view2, rectF2);
        int i = ne1.a & 7;
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                    return f + ne1.b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f = centerX - centerX2;
        return f + ne1.b;
    }

    public final float b0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 NE1 ne1) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.b1;
        RectF rectF2 = this.c1;
        W(view, rectF);
        d0(view2, rectF2);
        int i = ne1.a & 112;
        if (i != 16) {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                    return f + ne1.c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f = centerY - centerY2;
        return f + ne1.c;
    }

    public final float c0(@InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 C9568sl1 c9568sl1, float f, float f2) {
        long c2 = c9568sl1.c();
        long d2 = c9568sl1.d();
        C9568sl1 h = eVar.a.h("expansion");
        return C5600ca.a(f, f2, c9568sl1.e().getInterpolation(((float) (((h.c() + h.d()) + 17) - c2)) / ((float) d2)));
    }

    public final void d0(@InterfaceC5670cr1 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.d1;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void e0(View view, View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup U;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup) || (U = U(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                C5510cC.a.set(U, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(U, C5510cC.a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(U, C5510cC.a, 0.0f);
        }
        eVar.a.h("contentFade").a(ofFloat);
        list.add(ofFloat);
    }

    public final void f0(@InterfaceC5670cr1 View view, View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof UC)) {
            return;
        }
        UC uc = (UC) view2;
        int n0 = n0(view);
        int i = 16777215 & n0;
        if (z) {
            if (!z2) {
                uc.setCircularRevealScrimColor(n0);
            }
            ofInt = ObjectAnimator.ofInt(uc, UC.d.a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(uc, UC.d.a, n0);
        }
        ofInt.setEvaluator(C4590Wd.b());
        eVar.a.h("color").a(ofInt);
        list.add(ofInt);
    }

    public final void g0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, boolean z, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list) {
        float a0 = a0(view, view2, eVar.b);
        float b0 = b0(view, view2, eVar.b);
        Pair<C9568sl1, C9568sl1> X = X(a0, b0, z, eVar);
        C9568sl1 c9568sl1 = (C9568sl1) X.first;
        C9568sl1 c9568sl12 = (C9568sl1) X.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            a0 = this.e1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, a0);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            b0 = this.f1;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, b0);
        c9568sl1.a(ofFloat);
        c9568sl12.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final void h0(View view, @InterfaceC5670cr1 View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -elevation);
        }
        eVar.a.h("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void i0(@InterfaceC5670cr1 View view, View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, float f, float f2, @InterfaceC5670cr1 List<Animator> list, @InterfaceC5670cr1 List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof UC)) {
            return;
        }
        UC uc = (UC) view2;
        float Y = Y(view, view2, eVar.b);
        float Z = Z(view, view2, eVar.b);
        ((FloatingActionButton) view).j(this.a1);
        float width = this.a1.width() / 2.0f;
        C9568sl1 h = eVar.a.h("expansion");
        if (z) {
            if (!z2) {
                uc.setRevealInfo(new UC.e(Y, Z, width));
            }
            if (z2) {
                width = uc.getRevealInfo().c;
            }
            animator = NC.a(uc, Y, Z, C8801pd1.c(Y, Z, 0.0f, 0.0f, f, f2));
            animator.addListener(new d(uc));
            l0(view2, h.c(), (int) Y, (int) Z, width, list);
        } else {
            float f3 = uc.getRevealInfo().c;
            Animator a2 = NC.a(uc, Y, Z, width);
            int i = (int) Y;
            int i2 = (int) Z;
            l0(view2, h.c(), i, i2, f3, list);
            k0(view2, h.c(), h.d(), eVar.a.i(), i, i2, width, list);
            animator = a2;
        }
        h.a(animator);
        list.add(animator);
        list2.add(NC.c(uc));
    }

    public final void j0(View view, View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list, @InterfaceC5670cr1 List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof UC) && (view instanceof ImageView)) {
            UC uc = (UC) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, B60.a, 0);
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, B60.a, 255);
                }
                ofInt.addUpdateListener(new b(view2));
                eVar.a.h("iconFade").a(ofInt);
                list.add(ofInt);
                list2.add(new c(uc, drawable));
            }
        }
    }

    public final void k0(View view, long j, long j2, long j3, int i, int i2, float f, @InterfaceC5670cr1 List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    public final void l0(View view, long j, int i, int i2, float f, @InterfaceC5670cr1 List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC2591Bt
    public boolean m(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public final void m0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, boolean z, boolean z2, @InterfaceC5670cr1 e eVar, @InterfaceC5670cr1 List<Animator> list, List<Animator.AnimatorListener> list2, @InterfaceC5670cr1 RectF rectF) {
        C9568sl1 c9568sl1;
        C9568sl1 c9568sl12;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float a0 = a0(view, view2, eVar.b);
        float b0 = b0(view, view2, eVar.b);
        Pair<C9568sl1, C9568sl1> X = X(a0, b0, z, eVar);
        C9568sl1 c9568sl13 = (C9568sl1) X.first;
        C9568sl1 c9568sl14 = (C9568sl1) X.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-a0);
                view2.setTranslationY(-b0);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            c9568sl1 = c9568sl14;
            c9568sl12 = c9568sl13;
            V(view2, eVar, c9568sl12, c9568sl1, -a0, -b0, 0.0f, 0.0f, rectF);
        } else {
            c9568sl1 = c9568sl14;
            c9568sl12 = c9568sl13;
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -a0);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -b0);
        }
        c9568sl12.a(ofFloat);
        c9568sl1.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public final int n0(@InterfaceC5670cr1 View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @InterfaceC2591Bt
    public void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
        if (gVar.h == 0) {
            gVar.h = 80;
        }
    }

    public abstract e o0(Context context, boolean z);

    @InterfaceC11300zs1
    public final ViewGroup p0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = new Rect();
        this.b1 = new RectF();
        this.c1 = new RectF();
        this.d1 = new int[2];
    }
}
