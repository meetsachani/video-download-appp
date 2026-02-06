package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class zzcew implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult X;

    public zzcew(JsPromptResult jsPromptResult) {
        this.X = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.X.cancel();
    }
}
