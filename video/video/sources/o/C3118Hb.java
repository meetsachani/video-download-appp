package o;

import android.content.Context;
import androidx.fragment.app.FragmentManager;

/* renamed from: o.Hb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3118Hb extends AbstractC3745Nl<ActivityC3020Gb> {
    public C3118Hb(ActivityC3020Gb activityC3020Gb) {
        super(activityC3020Gb);
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

    @Override // o.AbstractC3745Nl
    public FragmentManager m() {
        return c().W0();
    }
}
