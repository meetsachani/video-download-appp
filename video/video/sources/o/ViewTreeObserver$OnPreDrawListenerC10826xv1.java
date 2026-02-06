package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: o.xv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC10826xv1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View X;
    public ViewTreeObserver Y;
    public final Runnable Z;

    public ViewTreeObserver$OnPreDrawListenerC10826xv1(View view, Runnable runnable) {
        this.X = view;
        this.Y = view.getViewTreeObserver();
        this.Z = runnable;
    }

    public static ViewTreeObserver$OnPreDrawListenerC10826xv1 a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC10826xv1 viewTreeObserver$OnPreDrawListenerC10826xv1 = new ViewTreeObserver$OnPreDrawListenerC10826xv1(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC10826xv1);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC10826xv1);
                return viewTreeObserver$OnPreDrawListenerC10826xv1;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.Y.isAlive()) {
            this.Y.removeOnPreDrawListener(this);
        } else {
            this.X.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.X.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.Z.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.Y = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
