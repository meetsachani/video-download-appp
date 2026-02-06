package o;

import android.util.Log;
import androidx.fragment.app.FragmentManager;

/* renamed from: o.Nl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3745Nl<T> extends FC1<T> {
    public static final String b = "BSPermissionsHelper";

    public AbstractC3745Nl(@InterfaceC5670cr1 T t) {
        super(t);
    }

    @Override // o.FC1
    public void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 String str3, @InterfaceC4698Xf2 int i, int i2, @InterfaceC5670cr1 String... strArr) {
        FragmentManager m = m();
        if (m.s0(C7029iO1.K2) instanceof C7029iO1) {
            Log.d(b, "Found existing fragment, not showing rationale.");
        } else {
            C7029iO1.e3(str, str2, str3, i, i2, strArr).f3(m, C7029iO1.K2);
        }
    }

    public abstract FragmentManager m();
}
