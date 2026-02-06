package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.ix  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1807ix extends AbstractRunnableC1160Wc {
    public static byte[] A05;
    public static String[] A06 = {"oXE2C4io4CadFj", "SLi30xh9eEh4aNBWy87TaVqEnPCRDurp", "eis5RYtigxDn0kuTv6xEcFlmBnmepzOu", "7zfUioi34Z20h4XlF6Svx2fywMYufGtL", "3ch3CCIwylkue97fKtVgZja7Sq2vQTLD", "WcYwUSLGNymzaUHoHnyTUfb", "YL0d97V0Q3k08jxWq5XvLfGqClGTo7H3", "GhmWEJEURttFfnvoo6VO1smQO3ReaFoJ"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1864ju A01;
    public final /* synthetic */ O8 A02;
    public final /* synthetic */ C05407g A03;
    public final /* synthetic */ C1102Tu A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-97, -93, C2638Cg0.s7, -24, -27, -12, -8, -23, -10, -92, -8, -19, -15, -23, -13, -7, -8, -78, -74, C2638Cg0.r7, C2638Cg0.r7, C2638Cg0.o7, C2638Cg0.r7, -73, -67, -79, -4, -15, -11, -19, -9, -3, -4};
        String[] strArr = A06;
        if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "j4Ns4hKT00kRsJcq4mYGiSVRR39xkXLE";
        strArr2[4] = "aj4N2GTd0jkYX56rliTu9cnftT6aRfqb";
    }

    static {
        A01();
    }

    public C1807ix(C05407g c05407g, O8 o8, C1864ju c1864ju, long j, C1102Tu c1102Tu) {
        this.A03 = c05407g;
        this.A02 = o8;
        this.A01 = c1864ju;
        this.A00 = j;
        this.A04 = c1102Tu;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        Map A01;
        this.A03.A0T(this.A02);
        this.A03.A0Q(this.A01);
        A01 = this.A03.A01(this.A00);
        A01.put(A00(18, 5, 53), A00(0, 2, 86));
        A01.put(A00(23, 3, 46), A00(26, 7, 108));
        this.A03.A05(this.A04.A03(EnumC1106Ty.A04), A01);
        this.A03.ADp(new C1145Vm(AdErrorType.NETWORK_ERROR, A00(2, 16, 104)));
    }
}
