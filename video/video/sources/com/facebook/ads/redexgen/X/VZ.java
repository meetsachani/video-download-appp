package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC1071Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C1864ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, ED2.a, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, ED2.a, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C1864ju c1864ju, boolean z) {
        this.A01 = uk;
        this.A00 = c1864ju;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1071Sp
    public final void ADL() {
        C1673gi c1673gi;
        long j;
        InterfaceC1103Tv interfaceC1103Tv;
        InterfaceC1103Tv interfaceC1103Tv2;
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1673gi = this.A01.A0g;
        InterfaceC0899Lt A0F = c1673gi.A0F();
        j = this.A01.A00;
        A0F.A3N(Y1.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC1103Tv = this.A01.A0I;
        if (interfaceC1103Tv != null) {
            interfaceC1103Tv2 = this.A01.A0I;
            interfaceC1103Tv2.ADp(C1145Vm.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1071Sp
    public final void ADT() {
        InterfaceC1103Tv interfaceC1103Tv;
        VW vw;
        C1673gi c1673gi;
        InterfaceC1103Tv interfaceC1103Tv2;
        C1673gi c1673gi2;
        boolean A0r;
        InterfaceC1103Tv interfaceC1103Tv3;
        C05407g c05407g;
        C05407g c05407g2;
        this.A01.A0e = this.A00;
        if (this.A02) {
            c05407g = this.A01.A0B;
            if (c05407g != null) {
                c05407g2 = this.A01.A0B;
                c05407g2.A0L();
            }
        }
        interfaceC1103Tv = this.A01.A0I;
        if (interfaceC1103Tv != null) {
            vw = this.A01.A0G;
            if (vw.equals(VW.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1103Tv3 = this.A01.A0I;
                    interfaceC1103Tv3.AEq();
                }
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1673gi = uk.A0g;
                    if (C1123Up.A1s(c1673gi) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        UK uk2 = this.A01;
                        c1673gi2 = this.A01.A0g;
                        uk2.A0P = AbstractC1458dD.A01(c1673gi2, this.A01.A13(), 4, new C1149Vr(this));
                        return;
                    }
                    UK uk3 = this.A01;
                    if (A04[3].length() != 28) {
                        A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                        interfaceC1103Tv2 = uk3.A0I;
                        interfaceC1103Tv2.ACq();
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
