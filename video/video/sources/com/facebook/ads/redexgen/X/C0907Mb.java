package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0907Mb implements XN {
    public final /* synthetic */ MW A00;

    public C0907Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C0907Mb(MW mw, C0918Mm c0918Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z;
        C0945No c0945No;
        boolean z2;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z = this.A00.A0T;
            if (!z) {
                z2 = this.A00.A0D;
                if (z2) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c0945No = this.A00.A0H;
            if (c0945No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
        C0945No c0945No;
        C0945No c0945No2;
        c0945No = this.A00.A0H;
        if (c0945No.A0A() > 0) {
            c0945No2 = this.A00.A0H;
            if (f == c0945No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
