package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import o.C6516gH2;

/* loaded from: classes.dex */
public class k extends RecyclerView.o implements RecyclerView.t {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 500;
    public static final int O = 1500;
    public static final int P = 1200;
    public static final int Q = 500;
    public static final int R = 255;
    public static final int[] S = {16842919};
    public static final int[] T = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.u C;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f58o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.w(500);
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.u {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            k.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) k.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.G(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.D();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.c.setAlpha(floatValue);
            k.this.d.setAlpha(floatValue);
            k.this.D();
        }
    }

    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    public boolean A(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.f58o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean B(float f, float f2) {
        if (z()) {
            if (f > this.e) {
                return false;
            }
        } else if (f < this.q - this.e) {
            return false;
        }
        int i = this.l;
        int i2 = this.k;
        if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
            return true;
        }
        return false;
    }

    public boolean C() {
        if (this.v == 1) {
            return true;
        }
        return false;
    }

    public void D() {
        this.s.invalidate();
    }

    public final void E(int i) {
        m();
        this.s.postDelayed(this.B, i);
    }

    public final int F(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void G(int i) {
        if (i == 2 && this.v != 2) {
            this.c.setState(S);
            m();
        }
        if (i == 0) {
            D();
        } else {
            I();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(T);
            E(1200);
        } else if (i == 1) {
            E(1500);
        }
        this.v = i;
    }

    public final void H() {
        this.s.n(this);
        this.s.q(this);
        this.s.r(this.C);
    }

    public void I() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    public void J(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.a) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.u = z2;
        boolean z3 = this.t;
        if (!z3 && !z2) {
            if (this.v != 0) {
                G(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.f58o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        G(1);
    }

    public final void K(float f) {
        int[] t = t();
        float max = Math.max(t[0], Math.min(t[1], f));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        int F2 = F(this.m, max, t, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (F2 != 0) {
            this.s.scrollBy(0, F2);
        }
        this.m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean B = B(motionEvent.getX(), motionEvent.getY());
                boolean A = A(motionEvent.getX(), motionEvent.getY());
                if (B || A) {
                    if (A) {
                        this.w = 1;
                        this.p = (int) motionEvent.getX();
                    } else if (B) {
                        this.w = 2;
                        this.m = (int) motionEvent.getY();
                    }
                    G(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                G(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                I();
                if (this.w == 1) {
                    x(motionEvent.getX());
                }
                if (this.w == 2) {
                    K(motionEvent.getY());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean B = B(motionEvent.getX(), motionEvent.getY());
            boolean A = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0 || (!B && !A)) {
                return false;
            }
            if (A) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (B) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            G(2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d2) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    p(canvas);
                }
                if (this.u) {
                    o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        G(0);
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                n();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                H();
            }
        }
    }

    public final void m() {
        this.s.removeCallbacks(this.B);
    }

    public final void n() {
        this.s.y1(this);
        this.s.B1(this);
        this.s.C1(this.C);
        m();
    }

    public final void o(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = i - i2;
        int i4 = this.f58o;
        int i5 = this.n;
        int i6 = i4 - (i5 / 2);
        this.g.setBounds(0, 0, i5, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i3);
        this.h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    public final void p(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.c.setBounds(0, 0, i2, i5);
        this.d.setBounds(0, 0, this.f, this.r);
        if (z()) {
            this.d.draw(canvas);
            canvas.translate(this.e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    public final int[] q() {
        int[] iArr = this.y;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    public Drawable r() {
        return this.g;
    }

    public Drawable s() {
        return this.h;
    }

    public final int[] t() {
        int[] iArr = this.x;
        int i = this.b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    public Drawable u() {
        return this.c;
    }

    public Drawable v() {
        return this.d;
    }

    public void w(int i) {
        int i2 = this.A;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.z.cancel();
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    public final void x(float f) {
        int[] q = q();
        float max = Math.max(q[0], Math.min(q[1], f));
        if (Math.abs(this.f58o - max) < 2.0f) {
            return;
        }
        int F2 = F(this.p, max, q, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (F2 != 0) {
            this.s.scrollBy(F2, 0);
        }
        this.p = max;
    }

    public boolean y() {
        if (this.v == 2) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (C6516gH2.e0(this.s) == 1) {
            return true;
        }
        return false;
    }
}
