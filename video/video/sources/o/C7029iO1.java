package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import o.C6968i90;
import o.HT1;

@HT1({HT1.a.X})
/* renamed from: o.iO1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7029iO1 extends C8795pc {
    public static final String K2 = "RationaleDialogFragmentCompat";
    public C6968i90.a I2;
    public C6968i90.b J2;

    public static C7029iO1 e3(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String[] strArr) {
        C7029iO1 c7029iO1 = new C7029iO1();
        c7029iO1.f2(new C6288fO1(str2, str3, str, i, i2, strArr).c());
        return c7029iO1;
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void K0(Context context) {
        super.K0(context);
        if (N() != null) {
            if (N() instanceof C6968i90.a) {
                this.I2 = (C6968i90.a) N();
            }
            if (N() instanceof C6968i90.b) {
                this.J2 = (C6968i90.b) N();
            }
        }
        if (context instanceof C6968i90.a) {
            this.I2 = (C6968i90.a) context;
        }
        if (context instanceof C6968i90.b) {
            this.J2 = (C6968i90.b) context;
        }
    }

    @Override // o.C8795pc, o.DialogInterface$OnCancelListenerC6458g30
    @InterfaceC5670cr1
    public Dialog R2(Bundle bundle) {
        X2(false);
        C6288fO1 c6288fO1 = new C6288fO1(s());
        return c6288fO1.b(v(), new DialogInterface$OnClickListenerC6045eO1(this, c6288fO1, this.I2, this.J2));
    }

    @Override // o.DialogInterface$OnCancelListenerC6458g30, androidx.fragment.app.Fragment
    public void V0() {
        super.V0();
        this.I2 = null;
        this.J2 = null;
    }

    public void f3(FragmentManager fragmentManager, String str) {
        if (fragmentManager.e1()) {
            return;
        }
        c3(fragmentManager, str);
    }
}
