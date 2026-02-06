package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class zzcet implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult X;

    public zzcet(JsResult jsResult) {
        this.X = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.X.cancel();
    }
}
