package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Sl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1067Sl implements InterfaceC1625fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, ED2.a, 51, ED2.a, 107, 60, C3307Iz.d0, 53, C3307Iz.a0, 40, 35, C8077mf.H, 5, 3, C8077mf.z, C8077mf.u, C8077mf.q, 9, 8, 92, 70, 78, QC1.w, 111, 107, QC1.w, 111, C4715Xk.i, QC1.w, 111, 111, 114, 111, C4715Xk.i, 114, 126, 126, 104, 111, 111, QC1.w, 121, 124, 74, 93, 89, 74, 93, C8077mf.q, 93, 74, 95, 67, 70, 74, 75, C8077mf.q, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, ED2.a, 62, 19, ED2.a, C4715Xk.i, 32, 60, 53, 36, 53, C8077mf.r, 17, 58, 13, 13, C8077mf.r, 13};
    }

    static {
        A01();
    }

    public C1067Sl(WD wd, WA wa, long j) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j;
    }

    private final void A02(C1637g8 c1637g8) {
        C1673gi c1673gi;
        long j;
        C1673gi c1673gi2;
        long j2;
        WE we;
        C1673gi c1673gi3;
        C1673gi c1673gi4;
        long j3;
        W9.A06(this.A01);
        try {
            InterfaceC1623fu response = c1637g8.A00();
            if (response != null) {
                String A73 = response.A73();
                we = this.A02.A06;
                c1673gi3 = this.A02.A05;
                WG serverResponse = we.A07(c1673gi3, A73, this.A00);
                if (serverResponse.A01() == WF.A03) {
                    R4 r4 = (R4) serverResponse;
                    String A042 = r4.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(r4.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A73 = A042;
                    }
                    c1673gi4 = this.A02.A05;
                    InterfaceC0899Lt A0F = c1673gi4.A0F();
                    j3 = this.A02.A01;
                    A0F.A3W(Y1.A01(j3), adErrorTypeFromCode.getErrorCode(), A73, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C1145Vm.A01(adErrorTypeFromCode, A73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c1637g8.getMessage();
            c1673gi2 = this.A02.A05;
            InterfaceC0899Lt A0F2 = c1673gi2.A0F();
            j2 = this.A02.A01;
            long A01 = Y1.A01(j2);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3W(A01, errorCode, message, isPublicError);
            this.A02.A0E(C1145Vm.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c1637g8.getMessage();
            c1673gi = this.A02.A05;
            InterfaceC0899Lt A0F3 = c1673gi.A0F();
            j = this.A02.A01;
            A0F3.A3W(Y1.A01(j), adErrorType2.getErrorCode(), A00(16, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C1145Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADR(InterfaceC1623fu interfaceC1623fu) {
        C1673gi c1673gi;
        C1673gi c1673gi2;
        AbstractC1156Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC1623fu != null) {
            String A73 = interfaceC1623fu.A73();
            c1673gi = this.A02.A05;
            int A02 = C1123Up.A02(c1673gi);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1673gi2 = this.A02.A05;
                C1169Wl.A00(c1673gi2).A0C(A73);
            }
            W9.A06(this.A01);
            this.A02.A0O(A73, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1625fw
    public final void ADq(Exception exc) {
        C1673gi c1673gi;
        long j;
        AbstractC1156Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C1637g8.class.equals(exc.getClass())) {
            A02((C1637g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1673gi = this.A02.A05;
        InterfaceC0899Lt A0F = c1673gi.A0F();
        j = this.A02.A01;
        A0F.A3W(Y1.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C1145Vm.A01(adErrorType, errorMessage));
    }
}
