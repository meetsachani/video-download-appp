package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.iE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1764iE {
    public static byte[] A03;
    public final C0962Of A00;
    public final InterfaceC1558er A01;
    public final List<C1763iD> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, C2638Cg0.r7, -60, C2638Cg0.r7};
    }

    public C1764iE(List<AbstractC0960Od> list, Bundle bundle, InterfaceC1558er interfaceC1558er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1558er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C1763iD(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C0962Of) AbstractC1195Xo.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C1764iE(List<AbstractC0960Od> list, InterfaceC1558er interfaceC1558er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1558er;
        for (AbstractC0960Od abstractC0960Od : list) {
            this.A02.add(new C1763iD(abstractC0960Od));
        }
        this.A00 = new C0962Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC1195Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        for (C1763iD c1763iD : this.A02) {
            Bundle bundle2 = c1763iD.A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C0962Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C1763iD c1763iD : this.A02) {
            c1763iD.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double A9V = this.A01.A9V();
        this.A00.A04(d, A9V);
        for (C1763iD c1763iD : this.A02) {
            c1763iD.A07(d, A9V);
        }
    }
}
