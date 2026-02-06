package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* loaded from: classes3.dex */
public class SH2 extends AbstractC8645oz0 {
    public final List<Fragment> n;

    public SH2(@InterfaceC5670cr1 FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager, 1);
        this.n = list;
    }

    @Override // o.AbstractC3694Mx1
    public int e() {
        return this.n.size();
    }

    @Override // o.AbstractC8645oz0
    @InterfaceC5670cr1
    public Fragment v(int i) {
        return this.n.get(i);
    }
}
