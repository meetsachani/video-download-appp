package o;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public abstract class VC1<S> extends Fragment {
    public final LinkedHashSet<AbstractC6912hv1<S>> h2 = new LinkedHashSet<>();

    public boolean G2(AbstractC6912hv1<S> abstractC6912hv1) {
        return this.h2.add(abstractC6912hv1);
    }

    public void H2() {
        this.h2.clear();
    }

    public abstract InterfaceC9015qV<S> I2();

    public boolean J2(AbstractC6912hv1<S> abstractC6912hv1) {
        return this.h2.remove(abstractC6912hv1);
    }
}
