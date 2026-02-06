package o;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: o.pc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8795pc extends DialogInterface$OnCancelListenerC6458g30 {
    public C8795pc() {
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public Dialog R2(Bundle bundle) {
        return new DialogC8552oc(v(), P2());
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public void a3(Dialog dialog, int i) {
        if (dialog instanceof DialogC8552oc) {
            DialogC8552oc dialogC8552oc = (DialogC8552oc) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dialogC8552oc.q(1);
            return;
        }
        super.a3(dialog, i);
    }

    public C8795pc(int i) {
        super(i);
    }
}
