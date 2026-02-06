package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes2.dex */
final class zzcey implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult X;
    public final /* synthetic */ EditText Y;

    public zzcey(JsPromptResult jsPromptResult, EditText editText) {
        this.X = jsPromptResult;
        this.Y = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.X.confirm(this.Y.getText().toString());
    }
}
