package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
import o.DialogInterface$OnCancelListenerC6458g30;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends DialogInterface$OnCancelListenerC6458g30 {
    public Dialog I2;
    public DialogInterface.OnCancelListener J2;
    @InterfaceC11300zs1
    public Dialog K2;

    @InterfaceC5670cr1
    public static SupportErrorDialogFragment e3(@InterfaceC5670cr1 Dialog dialog) {
        return f3(dialog, null);
    }

    @InterfaceC5670cr1
    public static SupportErrorDialogFragment f3(@InterfaceC5670cr1 Dialog dialog, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.s(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.I2 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.J2 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    @InterfaceC5670cr1
    public Dialog R2(@InterfaceC11300zs1 Bundle bundle) {
        Dialog dialog = this.I2;
        if (dialog == null) {
            Y2(false);
            if (this.K2 == null) {
                this.K2 = new AlertDialog.Builder((Context) Preconditions.r(v())).create();
            }
            return this.K2;
        }
        return dialog;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30
    public void c3(@InterfaceC5670cr1 FragmentManager fragmentManager, @InterfaceC11300zs1 String str) {
        super.c3(fragmentManager, str);
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, android.content.DialogInterface.OnCancelListener
    public void onCancel(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.J2;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
