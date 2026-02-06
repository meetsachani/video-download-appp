package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC1238Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC1236Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, C8077mf.q, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, C8077mf.r, 7, C8077mf.u, 13, C8077mf.r, C8077mf.z, C8077mf.m, C8077mf.n, 5, 76, 36, C3307Iz.c0, C3307Iz.d0, C3307Iz.c0, 49, 42, C4715Xk.i, 35, C3307Iz.Y, C4715Xk.i, 48, C3307Iz.Z, 50, C3307Iz.e0, 48, 54, C3307Iz.c0, C3307Iz.d0, C3307Iz.X, C4715Xk.i, 36, C3307Iz.f0, C3307Iz.e0, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC1236Zd abstractC1236Zd) {
        this.A00 = abstractC1236Zd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void A53() {
        InterfaceC1214Yh interfaceC1214Yh;
        InterfaceC1214Yh interfaceC1214Yh2;
        interfaceC1214Yh = this.A00.A09;
        if (interfaceC1214Yh == null) {
            return;
        }
        interfaceC1214Yh2 = this.A00.A09;
        interfaceC1214Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void A54() {
        InterfaceC1215Yi interfaceC1215Yi;
        InterfaceC1235Zc interfaceC1235Zc;
        InterfaceC1235Zc interfaceC1235Zc2;
        InterfaceC1215Yi interfaceC1215Yi2;
        this.A00.A0P();
        interfaceC1215Yi = this.A00.A0A;
        if (interfaceC1215Yi != null) {
            interfaceC1215Yi2 = this.A00.A0A;
            interfaceC1215Yi2.AFi(true);
        }
        interfaceC1235Zc = this.A00.A05;
        if (interfaceC1235Zc != null) {
            interfaceC1235Zc2 = this.A00.A05;
            interfaceC1235Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void A9c() {
        C0967Ok c0967Ok;
        C0967Ok c0967Ok2;
        C0967Ok c0967Ok3;
        C1673gi c1673gi;
        c0967Ok = this.A00.A04;
        if (c0967Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC1236Zd.A03(this.A00);
        c0967Ok2 = this.A00.A04;
        if (c0967Ok2.A02() != null) {
            AbstractC1236Zd abstractC1236Zd = this.A00;
            c0967Ok3 = this.A00.A04;
            abstractC1236Zd.A0H(c0967Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c1673gi = this.A00.A07;
        if (C1123Up.A2Z(c1673gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void AAp() {
        C0963Og c0963Og;
        C0966Oj c0966Oj;
        C1673gi c1673gi;
        C0963Og c0963Og2;
        String str;
        c0963Og = this.A00.A06;
        if (!TextUtils.isEmpty(c0963Og.A0I())) {
            X6 x6 = new X6();
            c1673gi = this.A00.A07;
            c0963Og2 = this.A00.A06;
            Uri A00 = XB.A00(c0963Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x6, c1673gi, A00, str);
        }
        c0966Oj = this.A00.A03;
        c0966Oj.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void AAq() {
        InterfaceC1215Yi interfaceC1215Yi;
        C0963Og c0963Og;
        C0966Oj c0966Oj;
        C1673gi c1673gi;
        C0963Og c0963Og2;
        String str;
        InterfaceC1215Yi interfaceC1215Yi2;
        this.A00.A0P();
        interfaceC1215Yi = this.A00.A0A;
        if (interfaceC1215Yi != null) {
            interfaceC1215Yi2 = this.A00.A0A;
            interfaceC1215Yi2.AFi(true);
        }
        c0963Og = this.A00.A06;
        if (!TextUtils.isEmpty(c0963Og.A0C())) {
            X6 x6 = new X6();
            c1673gi = this.A00.A07;
            c0963Og2 = this.A00.A06;
            Uri A00 = XB.A00(c0963Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x6, c1673gi, A00, str);
        }
        c0966Oj = this.A00.A03;
        c0966Oj.A06();
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void AEr(EnumC0965Oi enumC0965Oi) {
        EnumC0965Oi enumC0965Oi2;
        C0963Og c0963Og;
        C0967Ok A0B;
        C0963Og c0963Og2;
        C0963Og c0963Og3;
        AbstractC1236Zd.A02(this.A00);
        this.A00.A02 = enumC0965Oi;
        enumC0965Oi2 = this.A00.A02;
        if (enumC0965Oi2 != EnumC0965Oi.A04) {
            AbstractC1236Zd abstractC1236Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c0963Og2 = abstractC1236Zd.A06;
                A0B = c0963Og2.A0B();
            } else {
                c0963Og = abstractC1236Zd.A06;
                A0B = c0963Og.A0B();
            }
        } else {
            c0963Og3 = this.A00.A06;
            A0B = c0963Og3.A0A();
        }
        AbstractC1236Zd abstractC1236Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC1236Zd2.A0H(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1238Zf
    public final void AF4(C0967Ok c0967Ok) {
        C0966Oj c0966Oj;
        AbstractC1236Zd.A02(this.A00);
        c0966Oj = this.A00.A03;
        c0966Oj.A07(c0967Ok.A01());
        if (!c0967Ok.A05().isEmpty()) {
            AbstractC1236Zd abstractC1236Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC1236Zd.A0H(c0967Ok);
            return;
        }
        this.A00.A0G(c0967Ok);
    }
}
