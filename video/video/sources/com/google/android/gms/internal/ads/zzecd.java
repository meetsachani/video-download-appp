package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzecd extends TimerTask {
    public final /* synthetic */ AlertDialog X;
    public final /* synthetic */ Timer Y;
    public final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm Z;

    public zzecd(zzece zzeceVar, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.X = alertDialog;
        this.Y = timer;
        this.Z = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.X.dismiss();
        this.Y.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.Z;
        if (zzmVar != null) {
            zzmVar.b();
        }
    }
}
