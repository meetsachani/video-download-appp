package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1068Sm {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C1069Sn A00;
    public final C1070So A01;
    public final C1669ge A02;
    public final InterfaceC1649gK A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{122, 108, 71, 125, 96, 108, 106, 121, 107};
    }

    static {
        A01();
        A06 = C1068Sm.class.getSimpleName();
    }

    public C1068Sm(C1669ge c1669ge, CY cy, C1069Sn c1069Sn, C1070So c1070So) {
        this.A02 = c1669ge;
        this.A03 = cy.A5U(EnumC1650gL.A06);
        this.A00 = c1069Sn;
        this.A01 = c1070So;
        this.A03.A41(new C1681gq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (WU.A02(this)) {
            return;
        }
        if (!this.A03.AAe()) {
            this.A02.A05().AAO();
            return;
        }
        String btExtras = this.A03.A7i().optString(A00(0, 9, 7));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || C1123Up.A0j(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
