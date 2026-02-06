package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.oH0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8475oH0 extends AbstractC5803dO1 {
    public static final int f1 = 0;
    public static final String g1 = TD2.R0(1);
    public static final String h1 = TD2.R0(2);
    public static final InterfaceC8368nr.a<C8475oH0> i1 = new InterfaceC8368nr.a() { // from class: o.nH0
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            C8475oH0 f;
            f = C8475oH0.f(bundle);
            return f;
        }
    };
    public final boolean d1;
    public final boolean e1;

    public C8475oH0() {
        this.d1 = false;
        this.e1 = false;
    }

    public static C8475oH0 f(Bundle bundle) {
        boolean z;
        if (bundle.getInt(AbstractC5803dO1.b1, -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        if (bundle.getBoolean(g1, false)) {
            return new C8475oH0(bundle.getBoolean(h1, false));
        }
        return new C8475oH0();
    }

    @Override // o.AbstractC5803dO1
    public boolean c() {
        return this.d1;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5803dO1.b1, 0);
        bundle.putBoolean(g1, this.d1);
        bundle.putBoolean(h1, this.e1);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof C8475oH0)) {
            return false;
        }
        C8475oH0 c8475oH0 = (C8475oH0) obj;
        if (this.e1 != c8475oH0.e1 || this.d1 != c8475oH0.d1) {
            return false;
        }
        return true;
    }

    public boolean g() {
        return this.e1;
    }

    public int hashCode() {
        return C2593Bt1.b(Boolean.valueOf(this.d1), Boolean.valueOf(this.e1));
    }

    public C8475oH0(boolean z) {
        this.d1 = true;
        this.e1 = z;
    }
}
