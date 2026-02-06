package o;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class SS2 extends AdListener implements AppEventListener, zza {
    @InterfaceC5056aJ2
    public final AbstractAdViewAdapter X;
    @InterfaceC5056aJ2
    public final MediationBannerListener Y;

    public SS2(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.X = abstractAdViewAdapter;
        this.Y = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void e() {
        this.Y.o(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void g(LoadAdError loadAdError) {
        this.Y.e(this.X, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void k() {
        this.Y.h(this.X);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void n() {
        this.Y.l(this.X);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void u(String str, String str2) {
        this.Y.q(this.X, str, str2);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void y() {
        this.Y.f(this.X);
    }
}
