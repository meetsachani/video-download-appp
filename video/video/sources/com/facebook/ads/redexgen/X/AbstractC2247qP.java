package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.qP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2247qP implements InterfaceC04333b {
    public final C2207pj A00 = new C2207pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long A77 = A77();
        long A7s = A7s();
        if (A77 == C10323vs.b || A7s == C10323vs.b) {
            return 0;
        }
        if (A7s == 0) {
            return 100;
        }
        return C5C.A07((int) ((100 * A77) / A7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i) {
        A0H(i, C10323vs.b);
    }

    public final void A04(long j) {
        A0H(A7h(), j);
    }
}
