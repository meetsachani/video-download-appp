package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.AbstractC5921dt2;
import o.BM1;

/* loaded from: classes.dex */
public abstract class VI2 extends AbstractC5921dt2 {
    public static final String a2 = "android:visibility:screenLocation";
    public static final int b2 = 1;
    public static final int c2 = 2;
    public int X1;
    public static final String Y1 = "android:visibility:visibility";
    public static final String Z1 = "android:visibility:parent";
    public static final String[] d2 = {Y1, Z1};

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            b(true);
        }

        public final void a() {
            if (!this.f) {
                AI2.g(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        public final void b(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                C8963qH2.c(viewGroup, z);
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            b(true);
            if (!this.f) {
                AI2.g(this.a, 0);
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            b(false);
            if (!this.f) {
                AI2.g(this.a, this.b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                AI2.g(this.a, 0);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final ViewGroup a;
        public final View b;
        public final View c;
        public boolean d = true;

        public c(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        public final void a() {
            this.c.setTag(BM1.a.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            abstractC5921dt2.u0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.a.getOverlay().add(this.b);
            } else {
                VI2.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.c.setTag(BM1.a.save_overlay_view, this.b);
                this.a.getOverlay().add(this.b);
                this.d = true;
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            if (this.d) {
                a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            a();
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public VI2() {
        this.X1 = 3;
    }

    private void R0(C3291It2 c3291It2) {
        c3291It2.a.put(Y1, Integer.valueOf(c3291It2.b.getVisibility()));
        c3291It2.a.put(Z1, c3291It2.b.getParent());
        int[] iArr = new int[2];
        c3291It2.b.getLocationOnScreen(iArr);
        c3291It2.a.put(a2, iArr);
    }

    public int S0() {
        return this.X1;
    }

    public final d T0(C3291It2 c3291It2, C3291It2 c3291It22) {
        d dVar = new d();
        dVar.a = false;
        dVar.b = false;
        if (c3291It2 != null && c3291It2.a.containsKey(Y1)) {
            dVar.c = ((Integer) c3291It2.a.get(Y1)).intValue();
            dVar.e = (ViewGroup) c3291It2.a.get(Z1);
        } else {
            dVar.c = -1;
            dVar.e = null;
        }
        if (c3291It22 != null && c3291It22.a.containsKey(Y1)) {
            dVar.d = ((Integer) c3291It22.a.get(Y1)).intValue();
            dVar.f = (ViewGroup) c3291It22.a.get(Z1);
        } else {
            dVar.d = -1;
            dVar.f = null;
        }
        if (c3291It2 != null && c3291It22 != null) {
            int i = dVar.c;
            int i2 = dVar.d;
            if (i != i2 || dVar.e != dVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        dVar.b = false;
                        dVar.a = true;
                        return dVar;
                    } else if (i2 == 0) {
                        dVar.b = true;
                        dVar.a = true;
                        return dVar;
                    }
                } else if (dVar.f == null) {
                    dVar.b = false;
                    dVar.a = true;
                    return dVar;
                } else if (dVar.e == null) {
                    dVar.b = true;
                    dVar.a = true;
                    return dVar;
                }
            }
        } else if (c3291It2 == null && dVar.d == 0) {
            dVar.b = true;
            dVar.a = true;
            return dVar;
        } else if (c3291It22 == null && dVar.c == 0) {
            dVar.b = false;
            dVar.a = true;
        }
        return dVar;
    }

    public boolean V0(C3291It2 c3291It2) {
        if (c3291It2 == null) {
            return false;
        }
        int intValue = ((Integer) c3291It2.a.get(Y1)).intValue();
        View view = (View) c3291It2.a.get(Z1);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    public Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return null;
    }

    public Animator X0(ViewGroup viewGroup, C3291It2 c3291It2, int i, C3291It2 c3291It22, int i2) {
        if ((this.X1 & 1) != 1 || c3291It22 == null) {
            return null;
        }
        if (c3291It2 == null) {
            View view = (View) c3291It22.b.getParent();
            if (T0(N(view, false), b0(view, false)).a) {
                return null;
            }
        }
        return W0(viewGroup, c3291It22.b, c3291It2, c3291It22);
    }

    public Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return null;
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r10.r1 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator a1(ViewGroup viewGroup, C3291It2 c3291It2, int i, C3291It2 c3291It22, int i2) {
        View view;
        View view2;
        boolean z;
        View view3;
        boolean z2;
        if ((this.X1 & 2) != 2 || c3291It2 == null) {
            return null;
        }
        View view4 = c3291It2.b;
        if (c3291It22 != null) {
            view = c3291It22.b;
        } else {
            view = null;
        }
        int i3 = BM1.a.save_overlay_view;
        View view5 = (View) view4.getTag(i3);
        if (view5 != null) {
            view3 = null;
            z2 = true;
        } else if (view != null && view.getParent() != null) {
            if (i2 == 4 || view4 == view) {
                view2 = view;
                z = false;
                view = null;
                if (z) {
                }
                View view6 = view2;
                view5 = view;
                view3 = view6;
                z2 = false;
            }
            view = null;
            view2 = null;
            z = true;
            if (z) {
            }
            View view62 = view2;
            view5 = view;
            view3 = view62;
            z2 = false;
        } else {
            if (view != null) {
                view2 = null;
                z = false;
                if (z) {
                    if (view4.getParent() != null) {
                        if (view4.getParent() instanceof View) {
                            View view7 = (View) view4.getParent();
                            if (!T0(b0(view7, true), N(view7, true)).a) {
                                view = C3193Ht2.a(viewGroup, view4, view7);
                            } else {
                                int id = view7.getId();
                                if (view7.getParent() == null) {
                                    if (id != -1) {
                                        if (viewGroup.findViewById(id) != null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    view3 = view2;
                    z2 = false;
                    view5 = view4;
                }
                View view622 = view2;
                view5 = view;
                view3 = view622;
                z2 = false;
            }
            view = null;
            view2 = null;
            z = true;
            if (z) {
            }
            View view6222 = view2;
            view5 = view;
            view3 = view6222;
            z2 = false;
        }
        if (view5 != null) {
            if (!z2) {
                int[] iArr = (int[]) c3291It2.a.get(a2);
                int i4 = iArr[0];
                int i5 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i4 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i5 - iArr2[1]) - view5.getTop());
                viewGroup.getOverlay().add(view5);
            }
            Animator Y0 = Y0(viewGroup, view5, c3291It2, c3291It22);
            if (!z2) {
                if (Y0 == null) {
                    viewGroup.getOverlay().remove(view5);
                    return Y0;
                }
                view4.setTag(i3, view5);
                c cVar = new c(viewGroup, view5, view4);
                Y0.addListener(cVar);
                Y0.addPauseListener(cVar);
                R().d(cVar);
            }
            return Y0;
        } else if (view3 == null) {
            return null;
        } else {
            int visibility = view3.getVisibility();
            AI2.g(view3, 0);
            Animator Y02 = Y0(viewGroup, view3, c3291It2, c3291It22);
            if (Y02 != null) {
                a aVar = new a(view3, i2, true);
                Y02.addListener(aVar);
                R().d(aVar);
                return Y02;
            }
            AI2.g(view3, visibility);
            return Y02;
        }
    }

    public void b1(int i) {
        if ((i & (-4)) == 0) {
            this.X1 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // o.AbstractC5921dt2
    public boolean f0(C3291It2 c3291It2, C3291It2 c3291It22) {
        if (c3291It2 == null && c3291It22 == null) {
            return false;
        }
        if (c3291It2 != null && c3291It22 != null && c3291It22.a.containsKey(Y1) != c3291It2.a.containsKey(Y1)) {
            return false;
        }
        d T0 = T0(c3291It2, c3291It22);
        if (!T0.a || (T0.c != 0 && T0.d != 0)) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        d T0 = T0(c3291It2, c3291It22);
        if (T0.a) {
            if (T0.e != null || T0.f != null) {
                if (T0.b) {
                    return X0(viewGroup, c3291It2, T0.c, c3291It22, T0.d);
                }
                return a1(viewGroup, c3291It2, T0.c, c3291It22, T0.d);
            }
            return null;
        }
        return null;
    }

    public VI2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X1 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.e);
        int k = C5206aw2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            b1(k);
        }
    }
}
