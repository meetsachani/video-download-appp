package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzf implements View.OnClickListener {
    public final /* synthetic */ zzm X;

    public zzf(zzm zzmVar) {
        this.X = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.X;
        zzmVar.q1 = 2;
        zzmVar.X.finish();
    }
}
