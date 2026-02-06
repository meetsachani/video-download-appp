package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FH extends AbstractC1021Qq<FC> {
    public final int A00;
    public final C1673gi A01;
    public final View$OnClickListenerC0871Kr A02;
    public final List<String> A03;

    public FH(C1673gi c1673gi, List<String> screenshotUrls, int i, View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1673gi;
        this.A02 = view$OnClickListenerC0871Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A01 */
    public final FC A0F(ViewGroup viewGroup, int i) {
        FD fd = new FD(this.A01);
        if (C1123Up.A1D(this.A01)) {
            fd.setOnClickListener(new View$OnClickListenerC1540eZ(this));
        }
        return new FC(fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A02 */
    public final void A0K(FC fc, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        fc.A0p().setLayoutParams(marginLayoutParams);
        fc.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    public final int A0B() {
        return this.A03.size();
    }
}
