package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;
import o.UE;

/* loaded from: classes2.dex */
public final class zzbqo implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    public final zzbpr a;
    public UnifiedNativeAdMapper b;
    public zzbhb c;

    public zzbqo(zzbpr zzbprVar) {
        this.a = zzbprVar;
    }

    public final UnifiedNativeAdMapper A() {
        return this.b;
    }

    public final zzbhb B() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdOpened.");
        try {
            this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void b(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        int b = adError.b();
        String d = adError.d();
        String c = adError.c();
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b + ". ErrorMessage: " + d + ". ErrorDomain: " + c);
        try {
            this.a.Y1(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLeftApplication.");
        try {
            this.a.n();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error " + i + UE.h);
        try {
            this.a.A(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void e(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        int b = adError.b();
        String d = adError.d();
        String c = adError.c();
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b + ". ErrorMessage: " + d + ". ErrorDomain: " + c);
        try {
            this.a.Y1(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void f(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void g(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClosed.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void h(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLoaded.");
        try {
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void i(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void j(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLeftApplication.");
        try {
            this.a.n();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void k(MediationNativeAdapter mediationNativeAdapter, zzbhb zzbhbVar, String str) {
        try {
            this.a.V5(zzbhbVar.a(), str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void l(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdOpened.");
        try {
            this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void m(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.m()) {
                com.google.android.gms.ads.internal.util.client.zzo.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdImpression.");
        try {
            this.a.m();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void n(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.A(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void o(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClosed.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void p(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onVideoEnd.");
        try {
            this.a.B();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAppEvent.");
        try {
            this.a.b7(str, str2);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void r(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error " + i + UE.h);
        try {
            this.a.A(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void s(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.l()) {
                com.google.android.gms.ads.internal.util.client.zzo.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void t(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLeftApplication.");
        try {
            this.a.n();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void u(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        int b = adError.b();
        String d = adError.d();
        String c = adError.c();
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + b + ". ErrorMessage: " + d + ". ErrorDomain: " + c);
        try {
            this.a.Y1(adError.e());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void v(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLoaded.");
        try {
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void w(MediationNativeAdapter mediationNativeAdapter, zzbhb zzbhbVar) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbhbVar.b())));
        this.c = zzbhbVar;
        try {
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void x(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdClosed.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void y(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdLoaded.");
        this.b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.m(new zzbqb());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.r()) {
                unifiedNativeAdMapper.P(videoController);
            }
        }
        try {
            this.a.p();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void z(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.b("Adapter called onAdOpened.");
        try {
            this.a.o();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
