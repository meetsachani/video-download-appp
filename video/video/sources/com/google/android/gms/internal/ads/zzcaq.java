package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
abstract class zzcaq {
    public final WeakReference X;

    public zzcaq(View view) {
        this.X = new WeakReference(view);
    }

    public abstract void a(ViewTreeObserver viewTreeObserver);

    public abstract void b(ViewTreeObserver viewTreeObserver);

    @InterfaceC11300zs1
    public final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.X.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver c = c();
        if (c != null) {
            a(c);
        }
    }

    public final void e() {
        ViewTreeObserver c = c();
        if (c != null) {
            b(c);
        }
    }
}
