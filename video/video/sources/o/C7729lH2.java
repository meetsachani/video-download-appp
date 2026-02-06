package o;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: o.lH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7729lH2 {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 20;
    public static final int L = 256;
    public static final int M = 600;
    public static final Interpolator N = new a();
    public static final String x = "ViewDragHelper";
    public static final int y = -1;
    public static final int z = 0;
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public int f796o;
    public final int p;
    public int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final Runnable w = new b();

    /* renamed from: o.lH2$a */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: o.lH2$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7729lH2.this.R(0);
        }
    }

    public C7729lH2(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup != null) {
            if (cVar != null) {
                this.v = viewGroup;
                this.s = cVar;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.p = i;
                this.f796o = i;
                this.b = viewConfiguration.getScaledTouchSlop();
                this.m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.r = new OverScroller(context, N);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public static C7729lH2 p(ViewGroup viewGroup, float f, c cVar) {
        C7729lH2 q = q(viewGroup, cVar);
        q.b = (int) (q.b * (1.0f / f));
        return q;
    }

    public static C7729lH2 q(ViewGroup viewGroup, c cVar) {
        return new C7729lH2(viewGroup.getContext(), viewGroup, cVar);
    }

    public int A() {
        return this.p;
    }

    public int B() {
        return this.f796o;
    }

    public final int C(int i, int i2) {
        int i3;
        if (i < this.v.getLeft() + this.f796o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.v.getTop() + this.f796o) {
            i3 |= 4;
        }
        if (i > this.v.getRight() - this.f796o) {
            i3 |= 2;
        }
        if (i2 > this.v.getBottom() - this.f796o) {
            return i3 | 8;
        }
        return i3;
    }

    public float D() {
        return this.n;
    }

    public int E() {
        return this.b;
    }

    public int F() {
        return this.a;
    }

    public boolean G(int i, int i2) {
        return L(this.t, i, i2);
    }

    public boolean H(int i) {
        int length = this.h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (I(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i, int i2) {
        if (J(i2) && (i & this.h[i2]) != 0) {
            return true;
        }
        return false;
    }

    public boolean J(int i) {
        if (((1 << i) & this.k) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K(int i) {
        if (!J(i)) {
            Log.e(x, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public boolean L(View view, int i, int i2) {
        if (view == null || i < view.getLeft() || i >= view.getRight() || i2 < view.getTop() || i2 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    public void M(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View v = v((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.t;
                                                if (v == view && Y(view, pointerId2)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        N();
                                    }
                                }
                                l(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        P(x2, y2, pointerId3);
                        if (this.a == 0) {
                            Y(v((int) x2, (int) y2), pointerId3);
                            int i3 = this.h[pointerId3];
                            int i4 = this.q;
                            if ((i3 & i4) != 0) {
                                this.s.h(i3 & i4, pointerId3);
                                return;
                            }
                            return;
                        } else if (G((int) x2, (int) y2)) {
                            Y(this.t, pointerId3);
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.a == 1) {
                        r(0.0f, 0.0f);
                    }
                    c();
                    return;
                } else if (this.a == 1) {
                    if (K(this.c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.c);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i5 = this.c;
                        int i6 = (int) (x3 - fArr[i5]);
                        int i7 = (int) (y3 - this.g[i5]);
                        t(this.t.getLeft() + i6, this.t.getTop() + i7, i6, i7);
                        Q(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (K(pointerId4)) {
                            float x4 = motionEvent.getX(i2);
                            float y4 = motionEvent.getY(i2);
                            float f = x4 - this.d[pointerId4];
                            float f2 = y4 - this.e[pointerId4];
                            O(f, f2, pointerId4);
                            if (this.a != 1) {
                                View v2 = v((int) x4, (int) y4);
                                if (h(v2, f, f2) && Y(v2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                    Q(motionEvent);
                    return;
                }
            }
            if (this.a == 1) {
                N();
            }
            c();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View v3 = v((int) x5, (int) y5);
        P(x5, y5, pointerId5);
        Y(v3, pointerId5);
        int i8 = this.h[pointerId5];
        int i9 = this.q;
        if ((i8 & i9) != 0) {
            this.s.h(i8 & i9, pointerId5);
        }
    }

    public final void N() {
        this.l.computeCurrentVelocity(1000, this.m);
        r(i(this.l.getXVelocity(this.c), this.n, this.m), i(this.l.getYVelocity(this.c), this.n, this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.lH2$c] */
    public final void O(float f, float f2, int i) {
        boolean e = e(f, f2, i, 1);
        boolean z2 = e;
        if (e(f2, f, i, 4)) {
            z2 = e | true;
        }
        boolean z3 = z2;
        if (e(f, f2, i, 2)) {
            z3 = (z2 ? 1 : 0) | true;
        }
        ?? r0 = z3;
        if (e(f2, f, i, 8)) {
            r0 = (z3 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.f(r0, i);
        }
    }

    public final void P(float f, float f2, int i) {
        u(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.e;
        this.g[i] = f2;
        fArr2[i] = f2;
        this.h[i] = C((int) f, (int) f2);
        this.k |= 1 << i;
    }

    public final void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (K(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y2;
            }
        }
    }

    public void R(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.j(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public void S(int i) {
        this.f796o = i;
    }

    public void T(int i) {
        this.q = i;
    }

    public void U(float f) {
        this.n = f;
    }

    public boolean V(int i, int i2) {
        if (this.u) {
            return x(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
        if (r12 != r11) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean W(MotionEvent motionEvent) {
        boolean z2;
        View v;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                l(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            P(x2, y2, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                int i2 = this.h[pointerId];
                                int i3 = this.q;
                                if ((i2 & i3) != 0) {
                                    this.s.h(i2 & i3, pointerId);
                                }
                            } else if (i == 2 && (v = v((int) x2, (int) y2)) == this.t) {
                                Y(v, pointerId);
                            }
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        int pointerId2 = motionEvent.getPointerId(i4);
                        if (K(pointerId2)) {
                            float x3 = motionEvent.getX(i4);
                            float y3 = motionEvent.getY(i4);
                            float f = x3 - this.d[pointerId2];
                            float f2 = y3 - this.e[pointerId2];
                            View v2 = v((int) x3, (int) y3);
                            if (v2 != null && h(v2, f, f2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                int left = v2.getLeft();
                                int i5 = (int) f;
                                int a2 = this.s.a(v2, left + i5, i5);
                                int top = v2.getTop();
                                int i6 = (int) f2;
                                int b2 = this.s.b(v2, top + i6, i6);
                                int d = this.s.d(v2);
                                int e = this.s.e(v2);
                                if (d != 0) {
                                    if (d > 0) {
                                    }
                                }
                                if (e == 0) {
                                    break;
                                } else if (e > 0 && b2 == top) {
                                    break;
                                }
                            }
                            O(f, f2, pointerId2);
                            if (this.a != 1) {
                                if (z2 && Y(v2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    Q(motionEvent);
                }
            }
            c();
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            P(x4, y4, pointerId3);
            View v3 = v((int) x4, (int) y4);
            if (v3 == this.t && this.a == 2) {
                Y(v3, pointerId3);
            }
            int i7 = this.h[pointerId3];
            int i8 = this.q;
            if ((i7 & i8) != 0) {
                this.s.h(i7 & i8, pointerId3);
            }
        }
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public boolean X(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean x2 = x(i, i2, 0, 0);
        if (!x2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return x2;
    }

    public boolean Y(View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view != null && this.s.m(view, i)) {
            this.c = i;
            d(view, i);
            return true;
        }
        return false;
    }

    public void a() {
        c();
        if (this.a == 2) {
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            this.r.abortAnimation();
            int currX2 = this.r.getCurrX();
            int currY2 = this.r.getCurrY();
            this.s.k(this.t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    public boolean b(View view, boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && b(childAt, true, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2) {
            if (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void c() {
        this.c = -1;
        k();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void d(View view, int i) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i;
            this.s.i(view, i);
            R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + C9811tl1.d);
    }

    public final boolean e(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) == i2 && (this.q & i2) != 0 && (this.j[i] & i2) != i2 && (this.i[i] & i2) != i2) {
            int i3 = this.b;
            if (abs > i3 || abs2 > i3) {
                if (abs < abs2 * 0.5f && this.s.g(i2)) {
                    int[] iArr = this.j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.i[i] & i2) == 0 && abs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(int i) {
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (g(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i, int i2) {
        boolean z2;
        boolean z3;
        if (!J(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (z2 && z3) {
            int i3 = this.b;
            if ((f * f) + (f2 * f2) <= i3 * i3) {
                return false;
            }
            return true;
        } else if (z2) {
            if (Math.abs(f) <= this.b) {
                return false;
            }
            return true;
        } else if (!z3 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean h(View view, float f, float f2) {
        boolean z2;
        boolean z3;
        if (view == null) {
            return false;
        }
        if (this.s.d(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.s.e(view) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            int i = this.b;
            if ((f * f) + (f2 * f2) <= i * i) {
                return false;
            }
            return true;
        } else if (z2) {
            if (Math.abs(f) <= this.b) {
                return false;
            }
            return true;
        } else if (!z3 || Math.abs(f2) <= this.b) {
            return false;
        } else {
            return true;
        }
    }

    public final float i(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            if (f > 0.0f) {
                return f3;
            }
            return -f3;
        }
        return f;
    }

    public final int j(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            if (i > 0) {
                return i3;
            }
            return -i3;
        }
        return i;
    }

    public final void k() {
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    public final void l(int i) {
        if (this.d != null && J(i)) {
            this.d[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k = (~(1 << i)) & this.k;
        }
    }

    public final int m(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f = width / 2;
        float s = f + (s(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(s / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final int n(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int j = j(i3, (int) this.n, (int) this.m);
        int j2 = j(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(j);
        int abs4 = Math.abs(j2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (j != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (j2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m(i, j, this.s.d(view)) * f5) + (m(i2, j2, this.s.e(view)) * (f3 / f4)));
    }

    public boolean o(boolean z2) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                C6516gH2.j1(this.t, left);
            }
            if (top != 0) {
                C6516gH2.k1(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.k(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.v.post(this.w);
                } else {
                    R(0);
                }
            }
        }
        if (this.a != 2) {
            return false;
        }
        return true;
    }

    public final void r(float f, float f2) {
        this.u = true;
        this.s.l(this.t, f, f2);
        this.u = false;
        if (this.a == 1) {
            R(0);
        }
    }

    public final float s(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final void t(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i3 != 0) {
            i = this.s.a(this.t, i, i3);
            C6516gH2.j1(this.t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.s.b(this.t, i2, i4);
            C6516gH2.k1(this.t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.s.k(this.t, i5, i6, i5 - left, i6 - top);
    }

    public final void u(int i) {
        float[] fArr = this.d;
        if (fArr != null && fArr.length > i) {
            return;
        }
        int i2 = i + 1;
        float[] fArr2 = new float[i2];
        float[] fArr3 = new float[i2];
        float[] fArr4 = new float[i2];
        float[] fArr5 = new float[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        if (fArr != null) {
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            float[] fArr6 = this.e;
            System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
            float[] fArr7 = this.f;
            System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
            float[] fArr8 = this.g;
            System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            int[] iArr4 = this.h;
            System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
            int[] iArr5 = this.i;
            System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
            int[] iArr6 = this.j;
            System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
        }
        this.d = fArr2;
        this.e = fArr3;
        this.f = fArr4;
        this.g = fArr5;
        this.h = iArr;
        this.i = iArr2;
        this.j = iArr3;
    }

    public View v(int i, int i2) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.v.getChildAt(this.s.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i, int i2, int i3, int i4) {
        if (this.u) {
            this.r.fling(this.t.getLeft(), this.t.getTop(), (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c), i, i3, i2, i4);
            R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public final boolean x(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.r.abortAnimation();
            R(0);
            return false;
        }
        this.r.startScroll(left, top, i5, i6, n(this.t, i5, i6, i3, i4));
        R(2);
        return true;
    }

    public int y() {
        return this.c;
    }

    public View z() {
        return this.t;
    }

    /* renamed from: o.lH2$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public int a(View view, int i, int i2) {
            return 0;
        }

        public int b(View view, int i, int i2) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i) {
            return false;
        }

        public abstract boolean m(View view, int i);

        public int c(int i) {
            return i;
        }

        public void j(int i) {
        }

        public void f(int i, int i2) {
        }

        public void h(int i, int i2) {
        }

        public void i(View view, int i) {
        }

        public void l(View view, float f, float f2) {
        }

        public void k(View view, int i, int i2, int i3, int i4) {
        }
    }
}
