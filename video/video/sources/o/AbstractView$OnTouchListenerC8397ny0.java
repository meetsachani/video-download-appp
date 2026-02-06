package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: o.ny0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC8397ny0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float X;
    public final int Y;
    public final View Y0;
    public final int Z;
    public Runnable Z0;
    public Runnable a1;
    public boolean b1;
    public int c1;
    public final int[] d1 = new int[2];

    /* renamed from: o.ny0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC8397ny0.this.Y0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: o.ny0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC8397ny0.this.f();
        }
    }

    public AbstractView$OnTouchListenerC8397ny0(View view) {
        this.Y0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.X = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.Y = tapTimeout;
        this.Z = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean r(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f >= f4 && f2 >= f4 && f < (view.getRight() - view.getLeft()) + f3 && f2 < (view.getBottom() - view.getTop()) + f3) {
            return true;
        }
        return false;
    }

    public final void a() {
        Runnable runnable = this.a1;
        if (runnable != null) {
            this.Y0.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.Z0;
        if (runnable2 != null) {
            this.Y0.removeCallbacks(runnable2);
        }
    }

    public abstract T52 b();

    public boolean c() {
        T52 b2 = b();
        if (b2 != null && !b2.b()) {
            b2.show();
            return true;
        }
        return true;
    }

    public boolean d() {
        T52 b2 = b();
        if (b2 != null && b2.b()) {
            b2.dismiss();
            return true;
        }
        return true;
    }

    public void f() {
        a();
        View view = this.Y0;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.b1 = true;
        }
    }

    public final boolean g(MotionEvent motionEvent) {
        C10388w70 c10388w70;
        boolean z;
        View view = this.Y0;
        T52 b2 = b();
        if (b2 != null && b2.b() && (c10388w70 = (C10388w70) b2.p()) != null && c10388w70.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            s(view, obtainNoHistory);
            t(c10388w70, obtainNoHistory);
            boolean f = c10388w70.f(obtainNoHistory, this.c1);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (f && z) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.b1;
        if (z2) {
            if (!g(motionEvent) && d()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            if (q(motionEvent) && c()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.Y0.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.b1 = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.b1 = false;
        this.c1 = -1;
        Runnable runnable = this.Z0;
        if (runnable != null) {
            this.Y0.removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MotionEvent motionEvent) {
        View view = this.Y0;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.c1);
                    if (findPointerIndex >= 0 && !r(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.X)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.c1 = motionEvent.getPointerId(0);
            if (this.Z0 == null) {
                this.Z0 = new a();
            }
            view.postDelayed(this.Z0, this.Y);
            if (this.a1 == null) {
                this.a1 = new b();
            }
            view.postDelayed(this.a1, this.Z);
        }
        return false;
    }

    public final boolean s(View view, MotionEvent motionEvent) {
        int[] iArr = this.d1;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean t(View view, MotionEvent motionEvent) {
        int[] iArr = this.d1;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
