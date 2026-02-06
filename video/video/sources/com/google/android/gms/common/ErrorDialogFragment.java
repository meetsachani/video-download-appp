package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class ErrorDialogFragment extends DialogFragment {
    public Dialog X;
    public DialogInterface.OnCancelListener Y;
    @InterfaceC11300zs1
    public Dialog Z;

    @InterfaceC5670cr1
    public static ErrorDialogFragment a(@InterfaceC5670cr1 Dialog dialog) {
        return b(dialog, null);
    }

    @InterfaceC5670cr1
    public static ErrorDialogFragment b(@InterfaceC5670cr1 Dialog dialog, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.s(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.X = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.Y = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@InterfaceC5670cr1 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.Y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @InterfaceC5670cr1
    public Dialog onCreateDialog(@InterfaceC11300zs1 Bundle bundle) {
        Dialog dialog = this.X;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.Z == null) {
                this.Z = new AlertDialog.Builder((Context) Preconditions.r(getActivity())).create();
            }
            return this.Z;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(@InterfaceC5670cr1 FragmentManager fragmentManager, @InterfaceC11300zs1 String str) {
        super.show(fragmentManager, str);
    }
}
