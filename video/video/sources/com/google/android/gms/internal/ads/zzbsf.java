package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class zzbsf implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbsg X;

    public zzbsf(zzbsg zzbsgVar) {
        this.X = zzbsgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.X.c("Operation denied by user.");
    }
}
