package o;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: o.tq2 */
/* loaded from: classes.dex */
public class View$OnLongClickListenerC9832tq2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static final String f1 = "TooltipCompatHandler";
    public static final long g1 = 2500;
    public static final long h1 = 15000;
    public static final long i1 = 3000;
    public static View$OnLongClickListenerC9832tq2 j1;
    public static View$OnLongClickListenerC9832tq2 k1;
    public final View X;
    public final CharSequence Y;
    public final int Z;
    public int a1;
    public int b1;
    public C10318vq2 c1;
    public boolean d1;
    public boolean e1;
    public final Runnable Y0 = new Runnable() { // from class: o.rq2
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC9832tq2.a(View$OnLongClickListenerC9832tq2.this);
        }
    };
    public final Runnable Z0 = new Runnable() { // from class: o.sq2
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC9832tq2.this.d();
        }
    };

    public View$OnLongClickListenerC9832tq2(View view, CharSequence charSequence) {
        this.X = view;
        this.Y = charSequence;
        this.Z = C7486kH2.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static /* synthetic */ void a(View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq2) {
        view$OnLongClickListenerC9832tq2.h(false);
    }

    public static void f(View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq2) {
        View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq22 = j1;
        if (view$OnLongClickListenerC9832tq22 != null) {
            view$OnLongClickListenerC9832tq22.b();
        }
        j1 = view$OnLongClickListenerC9832tq2;
        if (view$OnLongClickListenerC9832tq2 != null) {
            view$OnLongClickListenerC9832tq2.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq2 = j1;
        if (view$OnLongClickListenerC9832tq2 != null && view$OnLongClickListenerC9832tq2.X == view) {
            f(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq22 = k1;
            if (view$OnLongClickListenerC9832tq22 != null && view$OnLongClickListenerC9832tq22.X == view) {
                view$OnLongClickListenerC9832tq22.d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC9832tq2(view, charSequence);
    }

    public final void b() {
        this.X.removeCallbacks(this.Y0);
    }

    public final void c() {
        this.e1 = true;
    }

    public void d() {
        if (k1 == this) {
            k1 = null;
            C10318vq2 c10318vq2 = this.c1;
            if (c10318vq2 != null) {
                c10318vq2.c();
                this.c1 = null;
                c();
                this.X.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f1, "sActiveHandler.mPopup == null");
            }
        }
        if (j1 == this) {
            f(null);
        }
        this.X.removeCallbacks(this.Z0);
    }

    public final void e() {
        this.X.postDelayed(this.Y0, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (!this.X.isAttachedToWindow()) {
            return;
        }
        f(null);
        View$OnLongClickListenerC9832tq2 view$OnLongClickListenerC9832tq2 = k1;
        if (view$OnLongClickListenerC9832tq2 != null) {
            view$OnLongClickListenerC9832tq2.d();
        }
        k1 = this;
        this.d1 = z;
        C10318vq2 c10318vq2 = new C10318vq2(this.X.getContext());
        this.c1 = c10318vq2;
        c10318vq2.e(this.X, this.a1, this.b1, this.d1, this.Y);
        this.X.addOnAttachStateChangeListener(this);
        if (this.d1) {
            j2 = g1;
        } else {
            if ((C6516gH2.H0(this.X) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        this.X.removeCallbacks(this.Z0);
        this.X.postDelayed(this.Z0, j2);
    }

    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.e1 && Math.abs(x - this.a1) <= this.Z && Math.abs(y - this.b1) <= this.Z) {
            return false;
        }
        this.a1 = x;
        this.b1 = y;
        this.e1 = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.c1 != null && this.d1) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.X.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.X.isEnabled() && this.c1 == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.a1 = view.getWidth() / 2;
        this.b1 = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
