package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import o.C3885Ow0;

/* renamed from: o.jj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7347jj0 extends Q3 {
    public static final int n = Integer.MIN_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public static final int f777o = -1;
    public static final String p = "android.view.View";
    public static final Rect q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C3885Ow0.a<C10861y4> r = new a();
    public static final C3885Ow0.b<C10986ya2<C10861y4>, C10861y4> s = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* renamed from: o.jj0$a */
    /* loaded from: classes.dex */
    public class a implements C3885Ow0.a<C10861y4> {
        @Override // o.C3885Ow0.a
        /* renamed from: b */
        public void a(C10861y4 c10861y4, Rect rect) {
            c10861y4.s(rect);
        }
    }

    /* renamed from: o.jj0$b */
    /* loaded from: classes.dex */
    public class b implements C3885Ow0.b<C10986ya2<C10861y4>, C10861y4> {
        @Override // o.C3885Ow0.b
        /* renamed from: c */
        public C10861y4 a(C10986ya2<C10861y4> c10986ya2, int i) {
            return c10986ya2.z(i);
        }

        @Override // o.C3885Ow0.b
        /* renamed from: d */
        public int b(C10986ya2<C10861y4> c10986ya2) {
            return c10986ya2.y();
        }
    }

    /* renamed from: o.jj0$c */
    /* loaded from: classes.dex */
    public class c extends D4 {
        public c() {
        }

        @Override // o.D4
        public C10861y4 b(int i) {
            return C10861y4.R0(AbstractC7347jj0.this.L(i));
        }

        @Override // o.D4
        public C10861y4 d(int i) {
            int i2;
            if (i == 2) {
                i2 = AbstractC7347jj0.this.k;
            } else {
                i2 = AbstractC7347jj0.this.l;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // o.D4
        public boolean f(int i, int i2, Bundle bundle) {
            return AbstractC7347jj0.this.T(i, i2, bundle);
        }
    }

    public AbstractC7347jj0(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C6516gH2.Z(view) == 0) {
                C6516gH2.a2(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public static Rect E(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                        return rect;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect.set(-1, 0, -1, height);
                return rect;
            }
            rect.set(0, height, width, height);
            return rect;
        }
        rect.set(width, 0, width, height);
        return rect;
    }

    public static int J(int i) {
        if (i != 19) {
            if (i != 21) {
                if (i != 22) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.l;
    }

    public abstract int C(float f, float f2);

    public abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int i) {
        H(i, 0);
    }

    public final void H(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = this.i.getParent()) != null) {
            AccessibilityEvent q2 = q(i, 2048);
            R3.k(q2, i2);
            parent.requestSendAccessibilityEvent(this.i, q2);
        }
    }

    public final boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    public final boolean K(int i, Rect rect) {
        C10861y4 h;
        C10861y4 c10861y4;
        C10986ya2<C10861y4> y = y();
        int i2 = this.l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            h = null;
        } else {
            h = y.h(i2);
        }
        C10861y4 c10861y42 = h;
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.i, i, rect2);
            }
            c10861y4 = (C10861y4) C3885Ow0.c(y, s, r, c10861y42, rect2, i);
        } else {
            if (C6516gH2.e0(this.i) != 1) {
                z = false;
            }
            c10861y4 = (C10861y4) C3885Ow0.d(y, s, r, c10861y42, i, z, false);
        }
        if (c10861y4 != null) {
            i3 = y.n(y.l(c10861y4));
        }
        return X(i3);
    }

    public C10861y4 L(int i) {
        if (i == -1) {
            return u();
        }
        return t(i);
    }

    public final void M(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            K(i, rect);
        }
    }

    public abstract boolean N(int i, int i2, Bundle bundle);

    public abstract void R(int i, C10861y4 c10861y4);

    public boolean T(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return U(i, i2, bundle);
        }
        return V(i2, bundle);
    }

    public final boolean U(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return N(i, i2, bundle);
                    }
                    return n(i);
                }
                return W(i);
            }
            return o(i);
        }
        return X(i);
    }

    public final boolean V(int i, Bundle bundle) {
        return C6516gH2.q1(this.i, i, bundle);
    }

    public final boolean W(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        Y(i, 32768);
        return true;
    }

    public final boolean X(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        S(i, true);
        Y(i, 8);
        return true;
    }

    public final boolean Y(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    public final void Z(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        Y(i, 128);
        Y(i2, 256);
    }

    @Override // o.Q3
    public D4 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // o.Q3
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // o.Q3
    public void g(View view, C10861y4 c10861y4) {
        super.g(view, c10861y4);
        Q(c10861y4);
    }

    public final boolean n(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            Y(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        S(i, false);
        Y(i, 8);
        return true;
    }

    public final boolean p() {
        int i = this.l;
        if (i != Integer.MIN_VALUE && N(i, 16, null)) {
            return true;
        }
        return false;
    }

    public final AccessibilityEvent q(int i, int i2) {
        if (i != -1) {
            return r(i, i2);
        }
        return s(i2);
    }

    public final AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C10861y4 L = L(i);
        obtain.getText().add(L.a0());
        obtain.setContentDescription(L.D());
        obtain.setScrollable(L.I0());
        obtain.setPassword(L.G0());
        obtain.setEnabled(L.x0());
        obtain.setChecked(L.r0());
        P(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(L.y());
        E4.Y(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final C10861y4 t(int i) {
        boolean z;
        C10861y4 O0 = C10861y4.O0();
        O0.v1(true);
        O0.y1(true);
        O0.k1("android.view.View");
        Rect rect = q;
        O0.e1(rect);
        O0.f1(rect);
        O0.R1(this.i);
        R(i, O0);
        if (O0.a0() == null && O0.D() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O0.s(this.e);
        if (!this.e.equals(rect)) {
            int p2 = O0.p();
            if ((p2 & 64) == 0) {
                if ((p2 & 128) == 0) {
                    O0.P1(this.i.getContext().getPackageName());
                    O0.d2(this.i, i);
                    if (this.k == i) {
                        O0.b1(true);
                        O0.a(128);
                    } else {
                        O0.b1(false);
                        O0.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        O0.a(2);
                    } else if (O0.z0()) {
                        O0.a(1);
                    }
                    O0.z1(z);
                    this.i.getLocationOnScreen(this.g);
                    O0.t(this.d);
                    if (this.d.equals(rect)) {
                        O0.s(this.d);
                        if (O0.b != -1) {
                            C10861y4 O02 = C10861y4.O0();
                            for (int i2 = O0.b; i2 != -1; i2 = O02.b) {
                                O02.S1(this.i, -1);
                                O02.e1(q);
                                R(i2, O02);
                                O02.s(this.e);
                                Rect rect2 = this.d;
                                Rect rect3 = this.e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            O02.U0();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            O0.f1(this.d);
                            if (I(this.d)) {
                                O0.r2(true);
                            }
                        }
                    }
                    return O0;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final C10861y4 u() {
        C10861y4 P0 = C10861y4.P0(this.i);
        C6516gH2.n1(this.i, P0);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (P0.x() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P0.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return P0;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.m == Integer.MIN_VALUE) {
                    return false;
                }
                Z(Integer.MIN_VALUE);
                return true;
            }
            int C = C(motionEvent.getX(), motionEvent.getY());
            Z(C);
            if (C != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int J = J(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && K(J, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return K(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return K(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.k;
    }

    public final C10986ya2<C10861y4> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        C10986ya2<C10861y4> c10986ya2 = new C10986ya2<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c10986ya2.o(arrayList.get(i).intValue(), t(arrayList.get(i).intValue()));
        }
        return c10986ya2;
    }

    public final void z(int i, Rect rect) {
        L(i).s(rect);
    }

    public void O(AccessibilityEvent accessibilityEvent) {
    }

    public void Q(C10861y4 c10861y4) {
    }

    public void P(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void S(int i, boolean z) {
    }
}
