package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Jg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0834Jg extends AbstractC1386c3 {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, QC1.w};
    }

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC0834Jg(C1390c7 c1390c7, boolean z) {
        super(c1390c7, z);
        if (C1123Up.A17(c1390c7.A06())) {
            if (c1390c7.A0B() != null) {
                c1390c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (C1123Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1386c3
    public View$OnClickListenerC0871Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC1336bF abstractC1336bF) {
        if (C1123Up.A17(this.A07.A06()) && abstractC1336bF != null) {
            abstractC1336bF.setOnClickListener(AbstractC1377bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C1511e5 c1511e5) {
    }
}
