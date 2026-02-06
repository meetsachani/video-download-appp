package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: o.rh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9310rh2 extends AbstractC3745Nl<Fragment> {
    public C9310rh2(@InterfaceC5670cr1 Fragment fragment) {
        super(fragment);
    }

    @Override // o.FC1
    public void a(int i, @InterfaceC5670cr1 String... strArr) {
        c().R1(strArr, i);
    }

    @Override // o.FC1
    public Context b() {
        return c().o();
    }

    @Override // o.FC1
    public boolean i(@InterfaceC5670cr1 String str) {
        return c().z2(str);
    }

    @Override // o.AbstractC3745Nl
    public FragmentManager m() {
        return c().u();
    }
}
