package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1871k1 extends AbstractC1617fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C1871k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1617fo
    public final void A03() {
        Y2 y2;
        Y2 y22;
        AnonymousClass76 anonymousClass76;
        C1855jl c1855jl;
        AnonymousClass76 anonymousClass762;
        C05487o c05487o;
        C1618fp c1618fp;
        Y2 y23;
        C05487o c05487o2;
        VA va;
        C05487o c05487o3;
        AnonymousClass76 anonymousClass763;
        C05487o c05487o4;
        C05487o c05487o5;
        C0937Ng A2A;
        AnonymousClass76 anonymousClass764;
        C1618fp c1618fp2;
        AnonymousClass76 anonymousClass765;
        C05487o c05487o6;
        y2 = this.A00.A0H;
        if (!y2.A07()) {
            y22 = this.A00.A0H;
            y22.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC1909kf A0F = anonymousClass76.A0F();
            c1855jl = this.A00.A02;
            A0F.A4Q(c1855jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c05487o = this.A00.A03;
            AbstractC0957Oa.A02(c05487o.A0y(), AbstractC1193Xm.A00(A00(0, 6, 63)));
            C1330b9 c1330b9 = new C1330b9();
            c1618fp = this.A00.A0B;
            C1330b9 A03 = c1330b9.A03(c1618fp);
            y23 = this.A00.A0H;
            C1330b9 A02 = A03.A02(y23);
            c05487o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c05487o2.A0z()).A05();
            va = this.A00.A05;
            c05487o3 = this.A00.A03;
            va.ABJ(c05487o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C1123Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C1169Wl A00 = C1169Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c05487o6 = this.A00.A03;
                A00.A0E(adPlacementType, c05487o6.A2E());
            }
            c05487o4 = this.A00.A03;
            if (c05487o4 == null) {
                A2A = null;
            } else {
                c05487o5 = this.A00.A03;
                A2A = c05487o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C0937Ng.A07(A2A, anonymousClass764);
            c1618fp2 = this.A00.A0B;
            c1618fp2.A0V();
        }
    }
}
