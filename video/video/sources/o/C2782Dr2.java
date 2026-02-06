package o;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.Dr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2782Dr2 implements InterfaceC8368nr {
    public final C9593sr2 X;
    public final AbstractC5317bO0<Integer> Y;
    public static final String Z = TD2.R0(0);
    public static final String Y0 = TD2.R0(1);
    public static final InterfaceC8368nr.a<C2782Dr2> Z0 = new InterfaceC8368nr.a() { // from class: o.Cr2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C2782Dr2.a(bundle);
        }
    };

    public C2782Dr2(C9593sr2 c9593sr2, int i) {
        this(c9593sr2, AbstractC5317bO0.M(Integer.valueOf(i)));
    }

    public static /* synthetic */ C2782Dr2 a(Bundle bundle) {
        return new C2782Dr2(C9593sr2.d1.a((Bundle) C9542sf.g(bundle.getBundle(Z))), C7775lT0.c((int[]) C9542sf.g(bundle.getIntArray(Y0))));
    }

    public int b() {
        return this.X.Z;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBundle(Z, this.X.e());
        bundle.putIntArray(Y0, C7775lT0.B(this.Y));
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2782Dr2.class == obj.getClass()) {
            C2782Dr2 c2782Dr2 = (C2782Dr2) obj;
            if (this.X.equals(c2782Dr2.X) && this.Y.equals(c2782Dr2.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.X.hashCode() + (this.Y.hashCode() * 31);
    }

    public C2782Dr2(C9593sr2 c9593sr2, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c9593sr2.X)) {
            throw new IndexOutOfBoundsException();
        }
        this.X = c9593sr2;
        this.Y = AbstractC5317bO0.F(list);
    }
}
