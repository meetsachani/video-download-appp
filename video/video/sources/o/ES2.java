package o;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class ES2 implements DialogInterface.OnClickListener {
    public static final ES2 X = new ES2();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
