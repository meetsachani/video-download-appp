package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pR */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2190pR implements AnonymousClass24 {
    public final long A00;
    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C2192pT> A01;
    public static final C2190pR A03 = new C2190pR(C1840jW.A01(), 0);
    public static final String A04 = C5C.A0h(0);
    public static final String A05 = C5C.A0h(1);
    public static final AnonymousClass23<C2190pR> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.facebook.ads.redexgen.X.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2190pR.A01(bundle);
        }
    };

    public static /* synthetic */ C2190pR A01(Bundle bundle) {
        return A00(bundle);
    }

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2190pR(List<C2192pT> list, long j) {
        this.A01 = C1840jW.A03((C2192pT[]) list.toArray(new C2192pT[0]));
        this.A00 = j;
    }

    public static final C2190pR A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = C1840jW.A01();
        } else {
            A01 = AnonymousClass44.A01(C2192pT.A0I, cues);
        }
        return new C2190pR(A01, bundle.getLong(A05));
    }
}
