package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class NG0<V extends View> extends KH2<V> {
    public static final int f1 = -1;
    @InterfaceC11300zs1
    public Runnable Y0;
    public OverScroller Z0;
    public boolean a1;
    public int b1;
    public int c1;
    public int d1;
    @InterfaceC11300zs1
    public VelocityTracker e1;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final CoordinatorLayout X;
        public final V Y;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.X = coordinatorLayout;
            this.Y = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.Y != null && (overScroller = NG0.this.Z0) != null) {
                if (overScroller.computeScrollOffset()) {
                    NG0 ng0 = NG0.this;
                    ng0.e0(this.X, this.Y, ng0.Z0.getCurrY());
                    this.Y.postOnAnimation(this);
                    return;
                }
                NG0.this.c0(this.X, this.Y);
            }
        }
    }

    public NG0() {
        this.b1 = -1;
        this.d1 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean L(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        this.b1 = motionEvent.getPointerId(i);
                        this.c1 = (int) (motionEvent.getY(i) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.b1);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                this.c1 = y;
                d0(coordinatorLayout, v, this.c1 - y, Z(v), 0);
            }
            z = false;
            velocityTracker2 = this.e1;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.a1 && !z) {
                return false;
            }
            return true;
        }
        VelocityTracker velocityTracker3 = this.e1;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.e1.computeCurrentVelocity(1000);
            Y(coordinatorLayout, v, -a0(v), 0, this.e1.getYVelocity(this.b1));
            z = true;
            this.a1 = false;
            this.b1 = -1;
            velocityTracker = this.e1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e1 = null;
            }
            velocityTracker2 = this.e1;
            if (velocityTracker2 != null) {
            }
            if (this.a1) {
            }
            return true;
        }
        z = false;
        this.a1 = false;
        this.b1 = -1;
        velocityTracker = this.e1;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.e1;
        if (velocityTracker2 != null) {
        }
        if (this.a1) {
        }
        return true;
    }

    public boolean W(V v) {
        return false;
    }

    public final void X() {
        if (this.e1 == null) {
            this.e1 = VelocityTracker.obtain();
        }
    }

    public final boolean Y(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i, int i2, float f) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.Y0 = null;
        }
        if (this.Z0 == null) {
            this.Z0 = new OverScroller(v.getContext());
        }
        this.Z0.fling(0, O(), 0, Math.round(f), 0, 0, i, i2);
        if (this.Z0.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v);
            this.Y0 = aVar;
            v.postOnAnimation(aVar);
            return true;
        }
        c0(coordinatorLayout, v);
        return false;
    }

    public int Z(@InterfaceC5670cr1 V v) {
        return -v.getHeight();
    }

    public int a0(@InterfaceC5670cr1 V v) {
        return v.getHeight();
    }

    public int b0() {
        return O();
    }

    public final int d0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return f0(coordinatorLayout, v, b0() - i, i2, i3);
    }

    public int e0(CoordinatorLayout coordinatorLayout, V v, int i) {
        return f0(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int f0(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int e;
        int O = O();
        if (i2 != 0 && O >= i2 && O <= i3 && O != (e = C9293rd1.e(i, i2, i3))) {
            U(e);
            return O - e;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.d1 < 0) {
            this.d1 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.a1) {
            int i = this.b1;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.c1) > this.d1) {
                this.c1 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.b1 = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (W(v) && coordinatorLayout.G(v, x, y2)) {
                z = true;
            } else {
                z = false;
            }
            this.a1 = z;
            if (z) {
                this.c1 = y2;
                this.b1 = motionEvent.getPointerId(0);
                X();
                OverScroller overScroller = this.Z0;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.Z0.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.e1;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public NG0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b1 = -1;
        this.d1 = -1;
    }

    public void c0(CoordinatorLayout coordinatorLayout, V v) {
    }
}
