package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class zzcev implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult X;

    public zzcev(JsResult jsResult) {
        this.X = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.X.confirm();
    }
}
