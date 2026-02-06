package o;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import o.C6968i90;
import o.HT1;

@HT1({HT1.a.X})
/* renamed from: o.hO1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class DialogFragmentC6786hO1 extends DialogFragment {
    public static final String Y0 = "RationaleDialogFragment";
    public C6968i90.a X;
    public C6968i90.b Y;
    public boolean Z = false;

    public static DialogFragmentC6786hO1 a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String[] strArr) {
        DialogFragmentC6786hO1 dialogFragmentC6786hO1 = new DialogFragmentC6786hO1();
        dialogFragmentC6786hO1.setArguments(new C6288fO1(str, str2, str3, i, i2, strArr).c());
        return dialogFragmentC6786hO1;
    }

    public void b(FragmentManager fragmentManager, String str) {
        if ((Build.VERSION.SDK_INT >= 26 && C6543gO1.a(fragmentManager)) || this.Z) {
            return;
        }
        show(fragmentManager, str);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof C6968i90.a) {
                this.X = (C6968i90.a) getParentFragment();
            }
            if (getParentFragment() instanceof C6968i90.b) {
                this.Y = (C6968i90.b) getParentFragment();
            }
        }
        if (context instanceof C6968i90.a) {
            this.X = (C6968i90.a) context;
        }
        if (context instanceof C6968i90.b) {
            this.Y = (C6968i90.b) context;
        }
    }

    @Override // android.app.DialogFragment
    @InterfaceC5670cr1
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        C6288fO1 c6288fO1 = new C6288fO1(getArguments());
        return c6288fO1.a(getActivity(), new DialogInterface$OnClickListenerC6045eO1(this, c6288fO1, this.X, this.Y));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.X = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.Z = true;
        super.onSaveInstanceState(bundle);
    }
}
