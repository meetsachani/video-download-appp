package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Mm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0918Mm implements InterfaceC1041Rk {
    public static String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ MW A00;

    public C0918Mm(MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1041Rk
    public final boolean AAI() {
        boolean z;
        C1534eS c1534eS;
        C1534eS c1534eS2;
        VI vi;
        InterfaceC1214Yh interfaceC1214Yh;
        ZU zu;
        VI vi2;
        InterfaceC1214Yh interfaceC1214Yh2;
        ZU zu2;
        z = this.A00.A0E;
        if (z) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                AbstractC1208Yb abstractC1208Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC1208Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                vi2 = this.A00.A0L;
                vi2.A04(VH.A07, null);
                interfaceC1214Yh2 = this.A00.A0O;
                zu2 = this.A00.A0P;
                interfaceC1214Yh2.A4j(zu2.A7w());
            } else {
                c1534eS = this.A00.A09;
                if (c1534eS != null) {
                    c1534eS2 = this.A00.A09;
                    if (c1534eS2.A0h()) {
                        vi = this.A00.A0L;
                        vi.A04(VH.A07, null);
                        interfaceC1214Yh = this.A00.A0O;
                        zu = this.A00.A0P;
                        interfaceC1214Yh.A4j(zu.A7w());
                    }
                }
            }
            return true;
        }
        return false;
    }
}
