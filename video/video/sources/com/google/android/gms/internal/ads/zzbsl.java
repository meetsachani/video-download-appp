package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class zzbsl implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbsm X;

    public zzbsl(zzbsm zzbsmVar) {
        this.X = zzbsmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.X.c("User canceled the download.");
    }
}
