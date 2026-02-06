package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzazp implements Runnable {
    public final /* synthetic */ View X;
    public final /* synthetic */ zzazt Y;

    public zzazp(zzazt zzaztVar, View view) {
        this.X = view;
        this.Y = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.b(this.X);
    }
}
