package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.sr2 */
/* loaded from: classes2.dex */
public final class C9593sr2 implements InterfaceC8368nr {
    public static final String a1 = "TrackGroup";
    public static final String b1 = TD2.R0(0);
    public static final String c1 = TD2.R0(1);
    public static final InterfaceC8368nr.a<C9593sr2> d1 = new InterfaceC8368nr.a() { // from class: o.rr2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C9593sr2.a(bundle);
        }
    };
    public final int X;
    public final String Y;
    public final C10833xx0[] Y0;
    public final int Z;
    public int Z0;

    public C9593sr2(C10833xx0... c10833xx0Arr) {
        this("", c10833xx0Arr);
    }

    public static /* synthetic */ C9593sr2 a(Bundle bundle) {
        AbstractC5317bO0 d;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b1);
        if (parcelableArrayList == null) {
            d = AbstractC5317bO0.L();
        } else {
            d = C8855pr.d(C10833xx0.m2, parcelableArrayList);
        }
        return new C9593sr2(bundle.getString(c1, ""), (C10833xx0[]) d.toArray(new C10833xx0[0]));
    }

    public static void f(String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, int i) {
        I31.e(a1, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + C9811tl1.d));
    }

    public static String g(@InterfaceC11300zs1 String str) {
        if (str != null && !str.equals(C10323vs.g1)) {
            return str;
        }
        return "";
    }

    public static int h(int i) {
        return i | 16384;
    }

    @OB
    public C9593sr2 b(String str) {
        return new C9593sr2(str, this.Y0);
    }

    public C10833xx0 c(int i) {
        return this.Y0[i];
    }

    public int d(C10833xx0 c10833xx0) {
        int i = 0;
        while (true) {
            C10833xx0[] c10833xx0Arr = this.Y0;
            if (i < c10833xx0Arr.length) {
                if (c10833xx0 == c10833xx0Arr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.Y0.length);
        for (C10833xx0 c10833xx0 : this.Y0) {
            arrayList.add(c10833xx0.j(true));
        }
        bundle.putParcelableArrayList(b1, arrayList);
        bundle.putString(c1, this.Y);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9593sr2.class == obj.getClass()) {
            C9593sr2 c9593sr2 = (C9593sr2) obj;
            if (this.Y.equals(c9593sr2.Y) && Arrays.equals(this.Y0, c9593sr2.Y0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.Z0 == 0) {
            this.Z0 = ((527 + this.Y.hashCode()) * 31) + Arrays.hashCode(this.Y0);
        }
        return this.Z0;
    }

    public final void i() {
        String g = g(this.Y0[0].Z);
        int h = h(this.Y0[0].Z0);
        int i = 1;
        while (true) {
            C10833xx0[] c10833xx0Arr = this.Y0;
            if (i < c10833xx0Arr.length) {
                if (!g.equals(g(c10833xx0Arr[i].Z))) {
                    C10833xx0[] c10833xx0Arr2 = this.Y0;
                    f("languages", c10833xx0Arr2[0].Z, c10833xx0Arr2[i].Z, i);
                    return;
                } else if (h != h(this.Y0[i].Z0)) {
                    f("role flags", Integer.toBinaryString(this.Y0[0].Z0), Integer.toBinaryString(this.Y0[i].Z0), i);
                    return;
                } else {
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public C9593sr2(String str, C10833xx0... c10833xx0Arr) {
        C9542sf.a(c10833xx0Arr.length > 0);
        this.Y = str;
        this.Y0 = c10833xx0Arr;
        this.X = c10833xx0Arr.length;
        int l = C4128Rj1.l(c10833xx0Arr[0].g1);
        this.Z = l == -1 ? C4128Rj1.l(c10833xx0Arr[0].f1) : l;
        i();
    }
}
