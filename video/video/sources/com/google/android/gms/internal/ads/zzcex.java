package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class zzcex implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult X;

    public zzcex(JsPromptResult jsPromptResult) {
        this.X = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.X.cancel();
    }
}
