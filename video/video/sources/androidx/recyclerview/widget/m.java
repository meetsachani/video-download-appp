package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import o.C6516gH2;
import o.C8982qM1;
import o.OT0;
import o.PT0;
import o.TC0;

/* loaded from: classes.dex */
public class m extends RecyclerView.o implements RecyclerView.r {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    public static final String Q = "ItemTouchHelper";
    public static final boolean R = false;
    public static final int S = -1;
    public static final int T = 8;
    public static final int U = 255;
    public static final int V = 65280;
    public static final int W = 16711680;
    public static final int X = 1000;
    public g A;
    public Rect C;
    public long D;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public f m;

    /* renamed from: o  reason: collision with root package name */
    public int f59o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public List<RecyclerView.H> u;
    public List<Integer> v;
    public TC0 z;
    public final List<View> a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.H c = null;
    public int l = -1;
    public int n = 0;
    public List<h> p = new ArrayList();
    public final Runnable s = new a();
    public RecyclerView.k w = null;
    public View x = null;
    public int y = -1;
    public final RecyclerView.t B = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            if (mVar.c != null && mVar.E()) {
                m mVar2 = m.this;
                RecyclerView.H h = mVar2.c;
                if (h != null) {
                    mVar2.z(h);
                }
                m mVar3 = m.this;
                mVar3.r.removeCallbacks(mVar3.s);
                C6516gH2.w1(m.this.r, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            m.this.z.b(motionEvent);
            VelocityTracker velocityTracker = m.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(m.this.l);
                if (findPointerIndex >= 0) {
                    m.this.o(actionMasked, motionEvent, findPointerIndex);
                }
                m mVar = m.this;
                RecyclerView.H h = mVar.c;
                if (h != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    int pointerId = motionEvent.getPointerId(actionIndex);
                                    m mVar2 = m.this;
                                    if (pointerId == mVar2.l) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        mVar2.l = motionEvent.getPointerId(i);
                                        m mVar3 = m.this;
                                        mVar3.M(motionEvent, mVar3.f59o, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VelocityTracker velocityTracker2 = mVar.t;
                            if (velocityTracker2 != null) {
                                velocityTracker2.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            mVar.M(motionEvent, mVar.f59o, findPointerIndex);
                            m.this.z(h);
                            m mVar4 = m.this;
                            mVar4.r.removeCallbacks(mVar4.s);
                            m.this.s.run();
                            m.this.r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    m.this.F(null, 0);
                    m.this.l = -1;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h s;
            m.this.z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.l = motionEvent.getPointerId(0);
                m.this.d = motionEvent.getX();
                m.this.e = motionEvent.getY();
                m.this.A();
                m mVar = m.this;
                if (mVar.c == null && (s = mVar.s(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.d -= s.j;
                    mVar2.e -= s.k;
                    mVar2.r(s.e, true);
                    if (m.this.a.remove(s.e.a)) {
                        m mVar3 = m.this;
                        mVar3.m.c(mVar3.r, s.e);
                    }
                    m.this.F(s.e, s.f);
                    m mVar4 = m.this;
                    mVar4.M(motionEvent, mVar4.f59o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = m.this.l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    m.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                m mVar5 = m.this;
                mVar5.l = -1;
                mVar5.F(null, 0);
            }
            VelocityTracker velocityTracker = m.this.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z) {
            if (!z) {
                return;
            }
            m.this.F(null, 0);
        }
    }

    /* loaded from: classes.dex */
    public class c extends h {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f60o;
        public final /* synthetic */ RecyclerView.H p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.H h, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.H h2) {
            super(h, i, i2, f, f2, f3, f4);
            this.f60o = i3;
            this.p = h2;
        }

        @Override // androidx.recyclerview.widget.m.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.l) {
                if (this.f60o <= 0) {
                    m mVar = m.this;
                    mVar.m.c(mVar.r, this.p);
                } else {
                    m.this.a.add(this.p.a);
                    this.i = true;
                    int i = this.f60o;
                    if (i > 0) {
                        m.this.B(this, i);
                    }
                }
                m mVar2 = m.this;
                View view = mVar2.x;
                View view2 = this.p.a;
                if (view == view2) {
                    mVar2.D(view2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ h X;
        public final /* synthetic */ int Y;

        public d(h hVar, int i) {
            this.X = hVar;
            this.Y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                h hVar = this.X;
                if (!hVar.l && hVar.e.j() != -1) {
                    RecyclerView.m itemAnimator = m.this.r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.r(null)) && !m.this.x()) {
                        m.this.m.D(this.X.e, this.Y);
                    } else {
                        m.this.r.post(this);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements RecyclerView.k {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i, int i2) {
            m mVar = m.this;
            View view = mVar.x;
            if (view != null) {
                int i3 = mVar.y;
                if (i3 == -1) {
                    i3 = mVar.r.indexOfChild(view);
                    m.this.y = i3;
                }
                if (i2 == i - 1) {
                    return i3;
                }
                if (i2 >= i3) {
                    return i2 + 1;
                }
            }
            return i2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public static final int b = 200;
        public static final int c = 250;
        public static final int d = 3158064;
        public static final int e = 789516;
        public static final Interpolator f = new a();
        public static final Interpolator g = new b();
        public static final long h = 2000;
        public int a = -1;

        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int e(int i, int i2) {
            int i3;
            int i4 = i & e;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & e) << 2;
            }
            return i5 | i3;
        }

        public static OT0 i() {
            return PT0.a;
        }

        public static int u(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int v(int i, int i2) {
            int u = u(0, i2 | i);
            return u(2, i) | u(1, i2) | u;
        }

        public abstract boolean A(RecyclerView recyclerView, RecyclerView.H h2, RecyclerView.H h3);

        public void B(RecyclerView recyclerView, RecyclerView.H h2, int i, RecyclerView.H h3, int i2, int i3, int i4) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).d(h2.a, h3.a, i3, i4);
                return;
            }
            if (layoutManager.s()) {
                if (layoutManager.d0(h3.a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.M1(i2);
                }
                if (layoutManager.g0(h3.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.M1(i2);
                }
            }
            if (layoutManager.t()) {
                if (layoutManager.h0(h3.a) <= recyclerView.getPaddingTop()) {
                    recyclerView.M1(i2);
                }
                if (layoutManager.b0(h3.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.M1(i2);
                }
            }
        }

        public void C(RecyclerView.H h2, int i) {
            if (h2 != null) {
                PT0.a.b(h2.a);
            }
        }

        public abstract void D(RecyclerView.H h2, int i);

        public boolean a(RecyclerView recyclerView, RecyclerView.H h2, RecyclerView.H h3) {
            return true;
        }

        public RecyclerView.H b(RecyclerView.H h2, List<RecyclerView.H> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = h2.a.getWidth() + i;
            int height = i2 + h2.a.getHeight();
            int left2 = i - h2.a.getLeft();
            int top2 = i2 - h2.a.getTop();
            int size = list.size();
            RecyclerView.H h3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.H h4 = list.get(i4);
                if (left2 > 0 && (right = h4.a.getRight() - width) < 0 && h4.a.getRight() > h2.a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    h3 = h4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = h4.a.getLeft() - i) > 0 && h4.a.getLeft() < h2.a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    h3 = h4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = h4.a.getTop() - i2) > 0 && h4.a.getTop() < h2.a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    h3 = h4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = h4.a.getBottom() - height) < 0 && h4.a.getBottom() > h2.a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    h3 = h4;
                    i3 = abs;
                }
            }
            return h3;
        }

        public void c(RecyclerView recyclerView, RecyclerView.H h2) {
            PT0.a.a(h2.a);
        }

        public int d(int i, int i2) {
            int i3;
            int i4 = i & d;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & d) >> 2;
            }
            return i5 | i3;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.H h2) {
            return d(l(recyclerView, h2), C6516gH2.e0(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i, float f2, float f3) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.o();
            } else {
                return itemAnimator.p();
            }
        }

        public int h() {
            return 0;
        }

        public final int j(RecyclerView recyclerView) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(C8982qM1.b.d);
            }
            return this.a;
        }

        public float k(RecyclerView.H h2) {
            return 0.5f;
        }

        public abstract int l(RecyclerView recyclerView, RecyclerView.H h2);

        public float m(float f2) {
            return f2;
        }

        public float n(RecyclerView.H h2) {
            return 0.5f;
        }

        public float o(float f2) {
            return f2;
        }

        public boolean p(RecyclerView recyclerView, RecyclerView.H h2) {
            if ((f(recyclerView, h2) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        public boolean q(RecyclerView recyclerView, RecyclerView.H h2) {
            if ((f(recyclerView, h2) & 65280) != 0) {
                return true;
            }
            return false;
        }

        public int r(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f2 = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * j(recyclerView) * g.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= 2000) {
                f2 = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f.getInterpolation(f2));
            if (interpolation == 0) {
                if (i2 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.H h2, float f2, float f3, int i, boolean z) {
            PT0.a.c(canvas, recyclerView, h2.a, f2, f3, i, z);
        }

        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.H h2, float f2, float f3, int i, boolean z) {
            PT0.a.d(canvas, recyclerView, h2.a, f2, f3, i, z);
        }

        public void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.H h2, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.e, hVar.j, hVar.k, hVar.f, false);
                canvas.restoreToCount(save);
            }
            if (h2 != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, h2, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.H h2, List<h> list, int i, float f2, float f3) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.e, hVar.j, hVar.k, hVar.f, false);
                canvas.restoreToCount(save);
            }
            if (h2 != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, h2, f2, f3, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                h hVar2 = list.get(i3);
                boolean z2 = hVar2.m;
                if (z2 && !hVar2.i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {
        public boolean X = true;

        public g() {
        }

        public void a() {
            this.X = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.H w0;
            if (this.X && (t = m.this.t(motionEvent)) != null && (w0 = m.this.r.w0(t)) != null) {
                m mVar = m.this;
                if (mVar.m.p(mVar.r, w0)) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i = m.this.l;
                    if (pointerId == i) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        m mVar2 = m.this;
                        mVar2.d = x;
                        mVar2.e = y;
                        mVar2.i = 0.0f;
                        mVar2.h = 0.0f;
                        if (mVar2.m.t()) {
                            m.this.F(w0, 2);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.H e;
        public final int f;
        public final ValueAnimator g;
        public final int h;
        public boolean i;
        public float j;
        public float k;
        public boolean l = false;
        public boolean m = false;
        public float n;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.H h, int i, int i2, float f, float f2, float f3, float f4) {
            this.f = i2;
            this.h = i;
            this.e = h;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(h.a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.g.cancel();
        }

        public void b(long j) {
            this.g.setDuration(j);
        }

        public void c(float f) {
            this.n = f;
        }

        public void d() {
            this.e.K(false);
            this.g.start();
        }

        public void e() {
            float f = this.a;
            float f2 = this.c;
            if (f == f2) {
                this.j = this.e.a.getTranslationX();
            } else {
                this.j = f + (this.n * (f2 - f));
            }
            float f3 = this.b;
            float f4 = this.d;
            if (f3 == f4) {
                this.k = this.e.a.getTranslationY();
            } else {
                this.k = f3 + (this.n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.K(true);
            }
            this.m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i extends f {
        public int i;
        public int j;

        public i(int i, int i2) {
            this.i = i2;
            this.j = i;
        }

        public int E(RecyclerView recyclerView, RecyclerView.H h) {
            return this.j;
        }

        public int F(RecyclerView recyclerView, RecyclerView.H h) {
            return this.i;
        }

        public void G(int i) {
            this.j = i;
        }

        public void H(int i) {
            this.i = i;
        }

        @Override // androidx.recyclerview.widget.m.f
        public int l(RecyclerView recyclerView, RecyclerView.H h) {
            return f.v(E(recyclerView, h), F(recyclerView, h));
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void d(View view, View view2, int i, int i2);
    }

    public m(f fVar) {
        this.m = fVar;
    }

    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.n(this);
        this.r.q(this.B);
        this.r.p(this);
        I();
    }

    private void q() {
        this.r.y1(this);
        this.r.B1(this.B);
        this.r.A1(this);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(0);
            hVar.a();
            this.m.c(this.r, hVar.e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        C();
        K();
    }

    public static boolean y(View view, float f2, float f3, float f4, float f5) {
        if (f2 >= f4 && f2 <= f4 + view.getWidth() && f3 >= f5 && f3 <= f5 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public void A() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
    }

    public void B(h hVar, int i2) {
        this.r.post(new d(hVar, i2));
    }

    public final void C() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    public void D(View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r6 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r6 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E() {
        long j2;
        int i2;
        int i3;
        int i4;
        if (this.c == null) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = this.D;
        if (j3 == Long.MIN_VALUE) {
            j2 = 0;
        } else {
            j2 = currentTimeMillis - j3;
        }
        long j4 = j2;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        if (this.C == null) {
            this.C = new Rect();
        }
        layoutManager.r(this.c.a, this.C);
        if (layoutManager.s()) {
            int i5 = (int) (this.j + this.h);
            int paddingLeft = (i5 - this.C.left) - this.r.getPaddingLeft();
            float f2 = this.h;
            if ((f2 < 0.0f && paddingLeft < 0) || (f2 > 0.0f && (paddingLeft = ((i5 + this.c.a.getWidth()) + this.C.right) - (this.r.getWidth() - this.r.getPaddingRight())) > 0)) {
                i2 = paddingLeft;
                if (layoutManager.t()) {
                    int i6 = (int) (this.k + this.i);
                    i3 = (i6 - this.C.top) - this.r.getPaddingTop();
                    float f3 = this.i;
                    if (f3 < 0.0f) {
                    }
                    if (f3 > 0.0f) {
                        i3 = ((i6 + this.c.a.getHeight()) + this.C.bottom) - (this.r.getHeight() - this.r.getPaddingBottom());
                    }
                }
                i3 = 0;
                if (i2 != 0) {
                    i2 = this.m.r(this.r, this.c.a.getWidth(), i2, this.r.getWidth(), j4);
                }
                i4 = i2;
                if (i3 == 0) {
                    i3 = this.m.r(this.r, this.c.a.getHeight(), i3, this.r.getHeight(), j4);
                }
                if (i4 != 0 && i3 == 0) {
                    this.D = Long.MIN_VALUE;
                    return false;
                }
                if (this.D == Long.MIN_VALUE) {
                    this.D = currentTimeMillis;
                }
                this.r.scrollBy(i4, i3);
                return true;
            }
        }
        i2 = 0;
        if (layoutManager.t()) {
        }
        i3 = 0;
        if (i2 != 0) {
        }
        i4 = i2;
        if (i3 == 0) {
        }
        if (i4 != 0) {
        }
        if (this.D == Long.MIN_VALUE) {
        }
        this.r.scrollBy(i4, i3);
        return true;
    }

    public void F(RecyclerView.H h2, int i2) {
        boolean z;
        int L2;
        float f2;
        float signum;
        if (h2 == this.c && i2 == this.n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        int i3 = this.n;
        r(h2, true);
        this.n = i2;
        if (i2 == 2) {
            if (h2 != null) {
                this.x = h2.a;
                l();
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i4 = (1 << ((i2 * 8) + 8)) - 1;
        RecyclerView.H h3 = this.c;
        boolean z2 = false;
        if (h3 != null) {
            if (h3.a.getParent() != null) {
                if (i3 == 2) {
                    L2 = 0;
                } else {
                    L2 = L(h3);
                }
                C();
                int i5 = 4;
                if (L2 != 1 && L2 != 2) {
                    if (L2 != 4 && L2 != 8 && L2 != 16 && L2 != 32) {
                        f2 = 0.0f;
                        signum = 0.0f;
                    } else {
                        signum = 0.0f;
                        f2 = Math.signum(this.h) * this.r.getWidth();
                    }
                } else {
                    f2 = 0.0f;
                    signum = Math.signum(this.i) * this.r.getHeight();
                }
                if (i3 == 2) {
                    i5 = 8;
                } else if (L2 > 0) {
                    i5 = 2;
                }
                w(this.b);
                float[] fArr = this.b;
                float f3 = fArr[0];
                float f4 = fArr[1];
                z = false;
                c cVar = new c(h3, i5, i3, f3, f4, f2, signum, L2, h3);
                cVar.b(this.m.g(this.r, i5, f2 - f3, signum - f4));
                this.p.add(cVar);
                cVar.d();
                z2 = true;
            } else {
                z = false;
                D(h3.a);
                this.m.c(this.r, h3);
                z2 = false;
            }
            this.c = null;
        } else {
            z = false;
        }
        if (h2 != null) {
            this.f59o = (this.m.f(this.r, h2) & i4) >> (this.n * 8);
            this.j = h2.a.getLeft();
            this.k = h2.a.getTop();
            this.c = h2;
            if (i2 == 2) {
                h2.a.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.r.getLayoutManager().S1();
        }
        this.m.C(this.c, this.n);
        this.r.invalidate();
    }

    public void H(RecyclerView.H h2) {
        if (!this.m.p(this.r, h2)) {
            Log.e(Q, "Start drag has been called but dragging is not enabled");
        } else if (h2.a.getParent() != this.r) {
            Log.e(Q, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            A();
            this.i = 0.0f;
            this.h = 0.0f;
            F(h2, 2);
        }
    }

    public final void I() {
        this.A = new g();
        this.z = new TC0(this.r.getContext(), this.A);
    }

    public void J(RecyclerView.H h2) {
        if (!this.m.q(this.r, h2)) {
            Log.e(Q, "Start swipe has been called but swiping is not enabled");
        } else if (h2.a.getParent() != this.r) {
            Log.e(Q, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            A();
            this.i = 0.0f;
            this.h = 0.0f;
            F(h2, 1);
        }
    }

    public final void K() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    public final int L(RecyclerView.H h2) {
        if (this.n == 2) {
            return 0;
        }
        int l = this.m.l(this.r, h2);
        int d2 = (this.m.d(l, C6516gH2.e0(this.r)) & 65280) >> 8;
        if (d2 == 0) {
            return 0;
        }
        int i2 = (l & 65280) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            int n = n(h2, d2);
            if (n > 0) {
                if ((i2 & n) == 0) {
                    return f.e(n, C6516gH2.e0(this.r));
                }
                return n;
            }
            int p = p(h2, d2);
            if (p > 0) {
                return p;
            }
        } else {
            int p2 = p(h2, d2);
            if (p2 > 0) {
                return p2;
            }
            int n2 = n(h2, d2);
            if (n2 > 0) {
                if ((i2 & n2) == 0) {
                    return f.e(n2, C6516gH2.e0(this.r));
                }
                return n2;
            }
        }
        return 0;
    }

    public void M(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((i2 & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i2 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i2 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        D(view);
        RecyclerView.H w0 = this.r.w0(view);
        if (w0 != null) {
            RecyclerView.H h2 = this.c;
            if (h2 != null && w0 == h2) {
                F(null, 0);
                return;
            }
            r(w0, false);
            if (this.a.remove(w0.a)) {
                this.m.c(this.r, w0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.D d2) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d2) {
        float f2;
        float f3;
        this.y = -1;
        if (this.c != null) {
            w(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.y(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d2) {
        float f2;
        float f3;
        if (this.c != null) {
            w(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.z(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    public final void l() {
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                q();
            }
            this.r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f = resources.getDimension(C8982qM1.b.f);
                this.g = resources.getDimension(C8982qM1.b.e);
                G();
            }
        }
    }

    public final int n(RecyclerView.H h2, int i2) {
        int i3;
        if ((i2 & 12) != 0) {
            int i4 = 4;
            if (this.h > 0.0f) {
                i3 = 8;
            } else {
                i3 = 4;
            }
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.o(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (xVelocity > 0.0f) {
                    i4 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i4 & i2) != 0 && i3 == i4 && abs >= this.m.m(this.f) && abs > Math.abs(yVelocity)) {
                    return i4;
                }
            }
            float width = this.r.getWidth() * this.m.n(h2);
            if ((i2 & i3) != 0 && Math.abs(this.h) > width) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    public void o(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.H v;
        int f2;
        if (this.c == null && i2 == 2 && this.n != 2 && this.m.s() && this.r.getScrollState() != 1 && (v = v(motionEvent)) != null && (f2 = (this.m.f(this.r, v) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i3);
            float y = motionEvent.getY(i3);
            float f3 = x - this.d;
            float f4 = y - this.e;
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            int i4 = this.q;
            if (abs >= i4 || abs2 >= i4) {
                if (abs > abs2) {
                    if (f3 >= 0.0f || (f2 & 4) != 0) {
                        if (f3 > 0.0f && (f2 & 8) == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (f4 >= 0.0f || (f2 & 1) != 0) {
                    if (f4 > 0.0f && (f2 & 2) == 0) {
                        return;
                    }
                } else {
                    return;
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                F(v, 1);
            }
        }
    }

    public final int p(RecyclerView.H h2, int i2) {
        int i3;
        if ((i2 & 3) != 0) {
            int i4 = 1;
            if (this.i > 0.0f) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.m.o(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (yVelocity > 0.0f) {
                    i4 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i4 & i2) != 0 && i4 == i3 && abs >= this.m.m(this.f) && abs > Math.abs(xVelocity)) {
                    return i4;
                }
            }
            float height = this.r.getHeight() * this.m.n(h2);
            if ((i2 & i3) != 0 && Math.abs(this.i) > height) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    public void r(RecyclerView.H h2, boolean z) {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e == h2) {
                hVar.l |= z;
                if (!hVar.m) {
                    hVar.a();
                }
                this.p.remove(size);
                return;
            }
        }
    }

    public h s(MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        View t = t(motionEvent);
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            if (hVar.e.a == t) {
                return hVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.H h2 = this.c;
        if (h2 != null) {
            View view = h2.a;
            if (y(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            h hVar = this.p.get(size);
            View view2 = hVar.e.a;
            if (y(view2, x, y, hVar.j, hVar.k)) {
                return view2;
            }
        }
        return this.r.d0(x, y);
    }

    public final List<RecyclerView.H> u(RecyclerView.H h2) {
        RecyclerView.H h3 = h2;
        List<RecyclerView.H> list = this.u;
        if (list == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            list.clear();
            this.v.clear();
        }
        int h4 = this.m.h();
        int round = Math.round(this.j + this.h) - h4;
        int round2 = Math.round(this.k + this.i) - h4;
        int i2 = h4 * 2;
        int width = h3.a.getWidth() + round + i2;
        int height = h3.a.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int V2 = layoutManager.V();
        int i5 = 0;
        while (i5 < V2) {
            View U2 = layoutManager.U(i5);
            if (U2 != h3.a && U2.getBottom() >= round2 && U2.getTop() <= height && U2.getRight() >= round && U2.getLeft() <= width) {
                RecyclerView.H w0 = this.r.w0(U2);
                if (this.m.a(this.r, this.c, w0)) {
                    int abs = Math.abs(i3 - ((U2.getLeft() + U2.getRight()) / 2));
                    int abs2 = Math.abs(i4 - ((U2.getTop() + U2.getBottom()) / 2));
                    int i6 = (abs * abs) + (abs2 * abs2);
                    int size = this.u.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.v.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.u.add(i7, w0);
                    this.v.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            h3 = h2;
        }
        return this.u;
    }

    public final RecyclerView.H v(MotionEvent motionEvent) {
        View t;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int i2 = this.l;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.e);
        int i3 = this.q;
        if (abs < i3 && abs2 < i3) {
            return null;
        }
        if (abs > abs2 && layoutManager.s()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.t()) || (t = t(motionEvent)) == null) {
            return null;
        }
        return this.r.w0(t);
    }

    public final void w(float[] fArr) {
        if ((this.f59o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.f59o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public boolean x() {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.p.get(i2).m) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.H h2) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            float k = this.m.k(h2);
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.k + this.i);
            if (Math.abs(i3 - h2.a.getTop()) >= h2.a.getHeight() * k || Math.abs(i2 - h2.a.getLeft()) >= h2.a.getWidth() * k) {
                List<RecyclerView.H> u = u(h2);
                if (u.size() != 0) {
                    RecyclerView.H b2 = this.m.b(h2, u, i2, i3);
                    if (b2 == null) {
                        this.u.clear();
                        this.v.clear();
                        return;
                    }
                    int j2 = b2.j();
                    int j3 = h2.j();
                    if (this.m.A(this.r, h2, b2)) {
                        this.m.B(this.r, h2, j3, b2, j2, i2, i3);
                    }
                }
            }
        }
    }
}
