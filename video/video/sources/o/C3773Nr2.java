package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3773Nr2;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.Nr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3773Nr2 implements InterfaceC8368nr {
    public final AbstractC5317bO0<a> X;
    public static final C3773Nr2 Y = new C3773Nr2(AbstractC5317bO0.L());
    public static final String Z = TD2.R0(0);
    public static final InterfaceC8368nr.a<C3773Nr2> Y0 = new InterfaceC8368nr.a() { // from class: o.Lr2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C3773Nr2.a(bundle);
        }
    };

    /* renamed from: o.Nr2$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8368nr {
        public static final String a1 = TD2.R0(0);
        public static final String b1 = TD2.R0(1);
        public static final String c1 = TD2.R0(3);
        public static final String d1 = TD2.R0(4);
        public static final InterfaceC8368nr.a<a> e1 = new InterfaceC8368nr.a() { // from class: o.Mr2
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return C3773Nr2.a.a(bundle);
            }
        };
        public final int X;
        public final C9593sr2 Y;
        public final int[] Y0;
        public final boolean Z;
        public final boolean[] Z0;

        public a(C9593sr2 c9593sr2, boolean z, int[] iArr, boolean[] zArr) {
            boolean z2;
            int i = c9593sr2.X;
            this.X = i;
            boolean z3 = false;
            if (i == iArr.length && i == zArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.a(z2);
            this.Y = c9593sr2;
            if (z && i > 1) {
                z3 = true;
            }
            this.Z = z3;
            this.Y0 = (int[]) iArr.clone();
            this.Z0 = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ a a(Bundle bundle) {
            C9593sr2 a = C9593sr2.d1.a((Bundle) C9542sf.g(bundle.getBundle(a1)));
            return new a(a, bundle.getBoolean(d1, false), (int[]) C3743Nk1.a(bundle.getIntArray(b1), new int[a.X]), (boolean[]) C3743Nk1.a(bundle.getBooleanArray(c1), new boolean[a.X]));
        }

        public a b(String str) {
            return new a(this.Y.b(str), this.Z, this.Y0, this.Z0);
        }

        public C9593sr2 c() {
            return this.Y;
        }

        public C10833xx0 d(int i) {
            return this.Y.c(i);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putBundle(a1, this.Y.e());
            bundle.putIntArray(b1, this.Y0);
            bundle.putBooleanArray(c1, this.Z0);
            bundle.putBoolean(d1, this.Z);
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.Z == aVar.Z && this.Y.equals(aVar.Y) && Arrays.equals(this.Y0, aVar.Y0) && Arrays.equals(this.Z0, aVar.Z0)) {
                    return true;
                }
            }
            return false;
        }

        public int f(int i) {
            return this.Y0[i];
        }

        public int g() {
            return this.Y.Z;
        }

        public boolean h() {
            return this.Z;
        }

        public int hashCode() {
            return (((((this.Y.hashCode() * 31) + (this.Z ? 1 : 0)) * 31) + Arrays.hashCode(this.Y0)) * 31) + Arrays.hashCode(this.Z0);
        }

        public boolean i() {
            return C4049Qo.f(this.Z0, true);
        }

        public boolean j() {
            return k(false);
        }

        public boolean k(boolean z) {
            for (int i = 0; i < this.Y0.length; i++) {
                if (n(i, z)) {
                    return true;
                }
            }
            return false;
        }

        public boolean l(int i) {
            return this.Z0[i];
        }

        public boolean m(int i) {
            return n(i, false);
        }

        public boolean n(int i, boolean z) {
            int i2 = this.Y0[i];
            if (i2 != 4) {
                if (!z || i2 != 3) {
                    return false;
                }
                return true;
            }
            return true;
        }
    }

    public C3773Nr2(List<a> list) {
        this.X = AbstractC5317bO0.F(list);
    }

    public static /* synthetic */ C3773Nr2 a(Bundle bundle) {
        AbstractC5317bO0 d;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        if (parcelableArrayList == null) {
            d = AbstractC5317bO0.L();
        } else {
            d = C8855pr.d(a.e1, parcelableArrayList);
        }
        return new C3773Nr2(d);
    }

    public boolean b(int i) {
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            if (this.X.get(i2).g() == i) {
                return true;
            }
        }
        return false;
    }

    public AbstractC5317bO0<a> c() {
        return this.X;
    }

    public boolean d() {
        return this.X.isEmpty();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Z, C8855pr.i(this.X));
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3773Nr2.class == obj.getClass()) {
            return this.X.equals(((C3773Nr2) obj).X);
        }
        return false;
    }

    public boolean f(int i) {
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            a aVar = this.X.get(i2);
            if (aVar.i() && aVar.g() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i) {
        return h(i, false);
    }

    public boolean h(int i, boolean z) {
        for (int i2 = 0; i2 < this.X.size(); i2++) {
            if (this.X.get(i2).g() == i && this.X.get(i2).k(z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Deprecated
    public boolean i(int i) {
        return j(i, false);
    }

    @Deprecated
    public boolean j(int i, boolean z) {
        if (b(i) && !h(i, z)) {
            return false;
        }
        return true;
    }
}
