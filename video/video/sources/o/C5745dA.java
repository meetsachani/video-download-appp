package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import o.AbstractC5921dt2;
import o.BM1;

/* renamed from: o.dA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5745dA extends AbstractC5921dt2 {
    public static final String Y1 = "android:clipBounds:bounds";
    public static final String X1 = "android:clipBounds:clip";
    public static final String[] Z1 = {X1};
    public static final Rect a2 = new Rect();

    /* renamed from: o.dA$a */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final Rect a;
        public final Rect b;
        public final View c;

        public a(View view, Rect rect, Rect rect2) {
            this.c = view;
            this.a = rect;
            this.b = rect2;
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            View view = this.c;
            int i = BM1.a.transition_clip;
            this.c.setClipBounds((Rect) view.getTag(i));
            this.c.setTag(i, null);
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            Rect clipBounds = this.c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = C5745dA.a2;
            }
            this.c.setTag(BM1.a.transition_clip, clipBounds);
            this.c.setClipBounds(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (!z) {
                this.c.setClipBounds(this.b);
            } else {
                this.c.setClipBounds(this.a);
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    public C5745dA() {
    }

    public final void R0(C3291It2 c3291It2, boolean z) {
        Rect rect;
        View view = c3291It2.b;
        if (view.getVisibility() != 8) {
            Rect rect2 = null;
            if (z) {
                rect = (Rect) view.getTag(BM1.a.transition_clip);
            } else {
                rect = null;
            }
            if (rect == null) {
                rect = view.getClipBounds();
            }
            if (rect != a2) {
                rect2 = rect;
            }
            c3291It2.a.put(X1, rect2);
            if (rect2 == null) {
                c3291It2.a.put(Y1, new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return Z1;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2, false);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        R0(c3291It2, true);
    }

    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        Rect rect;
        Rect rect2;
        if (c3291It2 == null || c3291It22 == null || !c3291It2.a.containsKey(X1) || !c3291It22.a.containsKey(X1)) {
            return null;
        }
        Rect rect3 = (Rect) c3291It2.a.get(X1);
        Rect rect4 = (Rect) c3291It22.a.get(X1);
        if (rect3 == null && rect4 == null) {
            return null;
        }
        if (rect3 == null) {
            rect = (Rect) c3291It2.a.get(Y1);
        } else {
            rect = rect3;
        }
        if (rect4 == null) {
            rect2 = (Rect) c3291It22.a.get(Y1);
        } else {
            rect2 = rect4;
        }
        if (rect.equals(rect2)) {
            return null;
        }
        c3291It22.b.setClipBounds(rect3);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(c3291It22.b, (Property<View, V>) AI2.d, (TypeEvaluator) new C11190zP1(new Rect()), (Object[]) new Rect[]{rect, rect2});
        a aVar = new a(c3291It22.b, rect3, rect4);
        ofObject.addListener(aVar);
        d(aVar);
        return ofObject;
    }

    public C5745dA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
