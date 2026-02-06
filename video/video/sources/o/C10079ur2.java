package o;

import android.os.Bundle;
import java.util.ArrayList;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.ur2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10079ur2 implements InterfaceC8368nr {
    public static final String Y0 = "TrackGroupArray";
    public static final C10079ur2 Z0 = new C10079ur2(new C9593sr2[0]);
    public static final String a1 = TD2.R0(0);
    public static final InterfaceC8368nr.a<C10079ur2> b1 = new InterfaceC8368nr.a() { // from class: o.tr2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C10079ur2.a(bundle);
        }
    };
    public final int X;
    public final AbstractC5317bO0<C9593sr2> Y;
    public int Z;

    public C10079ur2(C9593sr2... c9593sr2Arr) {
        this.Y = AbstractC5317bO0.H(c9593sr2Arr);
        this.X = c9593sr2Arr.length;
        f();
    }

    public static /* synthetic */ C10079ur2 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(a1);
        if (parcelableArrayList == null) {
            return new C10079ur2(new C9593sr2[0]);
        }
        return new C10079ur2((C9593sr2[]) C8855pr.d(C9593sr2.d1, parcelableArrayList).toArray(new C9593sr2[0]));
    }

    private void f() {
        int i = 0;
        while (i < this.Y.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.Y.size(); i3++) {
                if (this.Y.get(i).equals(this.Y.get(i3))) {
                    I31.e(Y0, "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public C9593sr2 b(int i) {
        return this.Y.get(i);
    }

    public int c(C9593sr2 c9593sr2) {
        int indexOf = this.Y.indexOf(c9593sr2);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean d() {
        if (this.X == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a1, C8855pr.i(this.Y));
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10079ur2.class == obj.getClass()) {
            C10079ur2 c10079ur2 = (C10079ur2) obj;
            if (this.X == c10079ur2.X && this.Y.equals(c10079ur2.Y)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.Z == 0) {
            this.Z = this.Y.hashCode();
        }
        return this.Z;
    }
}
