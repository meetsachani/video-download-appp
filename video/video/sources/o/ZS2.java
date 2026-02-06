package o;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class ZS2 extends FullScreenContentCallback {
    @InterfaceC5056aJ2
    public final AbstractAdViewAdapter f;
    @InterfaceC5056aJ2
    public final MediationInterstitialListener g;

    public ZS2(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f = abstractAdViewAdapter;
        this.g = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void b() {
        this.g.x(this.f);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void e() {
        this.g.z(this.f);
    }
}
