package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC1522eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.C, C8077mf.A, 9, C8077mf.z, 7, C8077mf.r, 13, 7, C8077mf.q};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AEA() {
        boolean z;
        AbstractC1847jd abstractC1847jd;
        InterfaceC1214Yh interfaceC1214Yh;
        ZU zu;
        VA va;
        AbstractC1847jd abstractC1847jd2;
        C1524eI c1524eI;
        C1524eI c1524eI2;
        C1673gi c1673gi;
        ZU zu2;
        AbstractC1847jd abstractC1847jd3;
        AbstractC1847jd abstractC1847jd4;
        C1673gi c1673gi2;
        AbstractC1847jd abstractC1847jd5;
        AbstractC1847jd abstractC1847jd6;
        C1673gi c1673gi3;
        C0945No c0945No;
        C1673gi c1673gi4;
        C1673gi c1673gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC1847jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC1847jd.A2E())) {
                va = this.A00.A0S;
                abstractC1847jd2 = this.A00.A0O;
                String A2E = abstractC1847jd2.A2E();
                C1330b9 c1330b9 = new C1330b9();
                c1524eI = this.A00.A0B;
                C1330b9 A03 = c1330b9.A03(c1524eI.getViewabilityChecker());
                c1524eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1524eI2.getTouchDataRecorder()).A05());
                c1673gi = this.A00.A0R;
                C1169Wl A00 = C1169Wl.A00(c1673gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC1847jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC1847jd3.A2E());
                abstractC1847jd4 = this.A00.A0O;
                C0937Ng A2A = abstractC1847jd4.A2A();
                c1673gi2 = this.A00.A0R;
                C0937Ng.A07(A2A, c1673gi2);
                abstractC1847jd5 = this.A00.A0O;
                String A0y = abstractC1847jd5.A0y();
                abstractC1847jd6 = this.A00.A0O;
                AbstractC0957Oa.A02(A0y, AbstractC1193Xm.A00(abstractC1847jd6.A10()));
                c1673gi3 = this.A00.A0R;
                c1673gi3.A0F().A3L();
                c0945No = this.A00.A0P;
                if (c0945No.A0c()) {
                    c1673gi4 = this.A00.A0R;
                    c1673gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1214Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1214Yh.A4j(zu.A8G());
            return;
        }
        c1673gi5 = this.A00.A0R;
        c1673gi5.A0F().AET();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AEh() {
        InterfaceC1214Yh interfaceC1214Yh;
        ZU zu;
        interfaceC1214Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1214Yh.A4j(zu.A81());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AFQ() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1522eG
    public final void AGg() {
        InterfaceC1214Yh interfaceC1214Yh;
        interfaceC1214Yh = this.A00.A0W;
        interfaceC1214Yh.ADJ(15);
    }
}
