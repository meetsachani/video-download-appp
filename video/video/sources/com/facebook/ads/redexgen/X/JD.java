package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network/classes2.dex */
public final class JD extends FrameLayout implements InterfaceC1215Yi {
    public static String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public String A00;
    public final InterfaceC1214Yh A01;
    public final C1457dC A02;

    public JD(C1673gi c1673gi, InterfaceC1214Yh interfaceC1214Yh, C1457dC c1457dC, String str) {
        super(c1673gi);
        this.A02 = c1457dC;
        this.A01 = interfaceC1214Yh;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AAu(Intent intent, Bundle bundle, C1035Re c1035Re) {
        C1457dC.A0B().incrementAndGet();
        this.A02.A0V();
        YB.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A45(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AE2();
        }
        AtomicInteger A0B = C1457dC.A0B();
        String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        A0B.decrementAndGet();
    }

    public void setListener(InterfaceC1214Yh interfaceC1214Yh) {
    }
}
