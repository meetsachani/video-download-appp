package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5317bO0;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.nS */
/* loaded from: classes2.dex */
public final class C8274nS implements InterfaceC8368nr {
    public final AbstractC5317bO0<C7284jS> X;
    public final long Y;
    public static final C8274nS Z = new C8274nS(AbstractC5317bO0.L(), 0);
    public static final String Y0 = TD2.R0(0);
    public static final String Z0 = TD2.R0(1);
    public static final InterfaceC8368nr.a<C8274nS> a1 = new InterfaceC8368nr.a() { // from class: o.mS
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C8274nS.a(bundle);
        }
    };

    public C8274nS(List<C7284jS> list, long j) {
        this.X = AbstractC5317bO0.F(list);
        this.Y = j;
    }

    public static /* synthetic */ C8274nS a(Bundle bundle) {
        return c(bundle);
    }

    public static AbstractC5317bO0<C7284jS> b(List<C7284jS> list) {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).Y0 == null) {
                r.g(list.get(i));
            }
        }
        return r.e();
    }

    public static final C8274nS c(Bundle bundle) {
        AbstractC5317bO0 d;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Y0);
        if (parcelableArrayList == null) {
            d = AbstractC5317bO0.L();
        } else {
            d = C8855pr.d(C7284jS.Q1, parcelableArrayList);
        }
        return new C8274nS(d, bundle.getLong(Z0));
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Y0, C8855pr.i(b(this.X)));
        bundle.putLong(Z0, this.Y);
        return bundle;
    }
}
