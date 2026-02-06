package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes2.dex */
final class zzaw implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context X;

    public zzaw(zzax zzaxVar, Context context) {
        this.X = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.v();
        zzs.v(this.X, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
