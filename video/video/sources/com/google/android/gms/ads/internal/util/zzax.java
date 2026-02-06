package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzax implements Runnable {
    public final /* synthetic */ Context X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ boolean Z;

    public zzax(zzay zzayVar, Context context, String str, boolean z, boolean z2) {
        this.X = context;
        this.Y = str;
        this.Z = z;
        this.Y0 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.v();
        Context context = this.X;
        AlertDialog.Builder l = zzs.l(context);
        l.setMessage(this.Y);
        if (this.Z) {
            l.setTitle("Error");
        } else {
            l.setTitle("Info");
        }
        if (this.Y0) {
            l.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            l.setPositiveButton("Learn More", new zzaw(this, context));
            l.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        l.create().show();
    }
}
