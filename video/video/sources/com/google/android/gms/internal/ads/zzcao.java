package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzcao extends zzcaq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference Y;

    public zzcao(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.Y = new WeakReference(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.Y.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            e();
        }
    }
}
