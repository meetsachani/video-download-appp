package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbse implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbsg X;

    public zzbse(zzbsg zzbsgVar) {
        this.X = zzbsgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        zzbsg zzbsgVar = this.X;
        Intent i2 = zzbsgVar.i();
        com.google.android.gms.ads.internal.zzv.v();
        context = zzbsgVar.d;
        com.google.android.gms.ads.internal.util.zzs.u(context, i2);
    }
}
