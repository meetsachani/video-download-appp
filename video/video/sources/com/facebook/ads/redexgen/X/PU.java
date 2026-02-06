package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1208Yb {
    public static byte[] A03;
    public C1673gi A00;
    public InterfaceC1207Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, C2638Cg0.C7, -27, -41, -110, -77, -42};
    }

    public PU(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, int i) {
        super(c1673gi);
        this.A00 = c1673gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC1847jd, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new View$OnClickListenerC1224Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final void A0D(C0931Na c0931Na, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public int getToolbarHeight() {
        return AbstractC1208Yb.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public InterfaceC1207Ya getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setCTAClickListener(View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setPageDetails(C0943Nm c0943Nm, String str, int i, C0949Ns c0949Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setProgress(float f) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1208Yb
    public void setToolbarListener(InterfaceC1207Ya interfaceC1207Ya) {
        this.A01 = interfaceC1207Ya;
    }
}
