package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.Log;

/* loaded from: classes4.dex */
public class B5 extends FC1<Activity> {
    public static final String b = "ActPermissionHelper";

    public B5(Activity activity) {
        super(activity);
    }

    @Override // o.FC1
    public void a(int i, @InterfaceC5670cr1 String... strArr) {
        C5240b5.M(c(), strArr, i);
    }

    @Override // o.FC1
    public Context b() {
        return c();
    }

    @Override // o.FC1
    public boolean i(@InterfaceC5670cr1 String str) {
        return C5240b5.S(c(), str);
    }

    @Override // o.FC1
    public void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String... strArr) {
        FragmentManager fragmentManager = c().getFragmentManager();
        if (fragmentManager.findFragmentByTag(DialogFragmentC6786hO1.Y0) instanceof DialogFragmentC6786hO1) {
            Log.d(b, "Found existing fragment, not showing rationale.");
        } else {
            DialogFragmentC6786hO1.a(str2, str3, str, i, i2, strArr).b(fragmentManager, DialogFragmentC6786hO1.Y0);
        }
    }
}
