package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public class YR implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C0996Pp A01;

    public YR(C0996Pp c0996Pp, EditText editText) {
        this.A01 = c0996Pp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new Q1(this, dialogInterface));
    }
}
