package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C10861y4;
import o.C6516gH2;
import o.C7729lH2;
import o.G4;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int g1 = 0;
    public static final int h1 = 1;
    public static final int i1 = 2;
    public static final int j1 = 0;
    public static final int k1 = 1;
    public static final int l1 = 2;
    public static final float m1 = 0.5f;
    public static final float n1 = 0.0f;
    public static final float o1 = 0.5f;
    public C7729lH2 X;
    public c Y;
    public boolean Y0;
    public boolean Z;
    public boolean a1;
    public float Z0 = 0.0f;
    public int b1 = 2;
    public float c1 = 0.5f;
    public float d1 = 0.0f;
    public float e1 = 0.5f;
    public final C7729lH2.c f1 = new a();

    /* loaded from: classes3.dex */
    public class a extends C7729lH2.c {
        public static final int d = -1;
        public int a;
        public int b = -1;

        public a() {
        }

        @Override // o.C7729lH2.c
        public int a(@InterfaceC5670cr1 View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.b1;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                }
            } else {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            }
            return SwipeDismissBehavior.Q(width, i, width2);
        }

        @Override // o.C7729lH2.c
        public int b(@InterfaceC5670cr1 View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o.C7729lH2.c
        public int d(@InterfaceC5670cr1 View view) {
            return view.getWidth();
        }

        @Override // o.C7729lH2.c
        public void i(@InterfaceC5670cr1 View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.Y0 = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.Y0 = false;
            }
        }

        @Override // o.C7729lH2.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.Y;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // o.C7729lH2.c
        public void k(@InterfaceC5670cr1 View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.d1;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.e1;
            float abs = Math.abs(i - this.a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.P(0.0f, 1.0f - SwipeDismissBehavior.S(width, width2, abs), 1.0f));
            }
        }

        @Override // o.C7729lH2.c
        public void l(@InterfaceC5670cr1 View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.a - width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.X.V(i, view.getTop())) {
                view.postOnAnimation(new d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.Y) != null) {
                cVar.a(view);
            }
        }

        @Override // o.C7729lH2.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.O(view)) {
                return true;
            }
            return false;
        }

        public final boolean n(@InterfaceC5670cr1 View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (view.getLayoutDirection() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.b1;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                        return true;
                    } else if (i <= 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
                if (i2 == 1) {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                        return true;
                    } else if (f < 0.0f) {
                        return true;
                    }
                }
                return false;
            }
            if (Math.abs(view.getLeft() - this.a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.c1)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements G4 {
        public b() {
        }

        @Override // o.G4
        public boolean a(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 G4.a aVar) {
            int width;
            boolean z = false;
            if (!SwipeDismissBehavior.this.O(view)) {
                return false;
            }
            if (view.getLayoutDirection() == 1) {
                z = true;
            }
            int i = SwipeDismissBehavior.this.b1;
            if ((i == 0 && z) || (i == 1 && !z)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            C6516gH2.j1(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.Y;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final View X;
        public final boolean Y;

        public d(View view, boolean z) {
            this.X = view;
            this.Y = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            C7729lH2 c7729lH2 = SwipeDismissBehavior.this.X;
            if (c7729lH2 != null && c7729lH2.o(true)) {
                this.X.postOnAnimation(this);
            } else if (this.Y && (cVar = SwipeDismissBehavior.this.Y) != null) {
                cVar.a(this.X);
            }
        }
    }

    public static float P(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int Q(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float S(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.X != null) {
            if (!this.Y0 || motionEvent.getActionMasked() != 3) {
                this.X.M(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean O(@InterfaceC5670cr1 View view) {
        return true;
    }

    public final void R(ViewGroup viewGroup) {
        C7729lH2 q;
        if (this.X == null) {
            if (this.a1) {
                q = C7729lH2.p(viewGroup, this.Z0, this.f1);
            } else {
                q = C7729lH2.q(viewGroup, this.f1);
            }
            this.X = q;
        }
    }

    public int T() {
        C7729lH2 c7729lH2 = this.X;
        if (c7729lH2 != null) {
            return c7729lH2.F();
        }
        return 0;
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public c U() {
        return this.Y;
    }

    public void V(float f) {
        this.c1 = P(0.0f, f, 1.0f);
    }

    public void W(float f) {
        this.e1 = P(0.0f, f, 1.0f);
    }

    public void X(@InterfaceC11300zs1 c cVar) {
        this.Y = cVar;
    }

    public void Y(float f) {
        this.Z0 = f;
        this.a1 = true;
    }

    public void Z(float f) {
        this.d1 = P(0.0f, f, 1.0f);
    }

    public void a0(int i) {
        this.b1 = i;
    }

    public final void b0(View view) {
        C6516gH2.y1(view, 1048576);
        if (O(view)) {
            C6516gH2.B1(view, C10861y4.a.z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        boolean z = this.Z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.Z = false;
            }
        } else {
            z = coordinatorLayout.G(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.Z = z;
        }
        if (z) {
            R(coordinatorLayout);
            if (!this.Y0 && this.X.W(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        boolean t = super.t(coordinatorLayout, v, i);
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            b0(v);
        }
        return t;
    }
}
