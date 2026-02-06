package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzcfg implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzbxv X;
    public final /* synthetic */ zzcfj Y;

    public zzcfg(zzcfj zzcfjVar, zzbxv zzbxvVar) {
        this.X = zzbxvVar;
        this.Y = zzcfjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Y.B(view, this.X, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
