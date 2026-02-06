package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbui;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.KS1;

/* loaded from: classes2.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@InterfaceC5670cr1 Context context) {
        super(context, 0);
        Preconditions.s(context, "Context cannot be null");
    }

    public static /* synthetic */ void i(@InterfaceC5670cr1 AdManagerAdView adManagerAdView, @InterfaceC5670cr1 AdManagerAdRequest adManagerAdRequest) {
        try {
            adManagerAdView.Y0.r(adManagerAdRequest.j());
        } catch (IllegalStateException e) {
            zzbui.c(adManagerAdView.getContext()).b(e, "AdManagerAdView.loadAd");
        }
    }

    @KS1("android.permission.INTERNET")
    public void g(@InterfaceC5670cr1 final AdManagerAdRequest adManagerAdRequest) {
        Preconditions.k("#008 Must be called on the main UI thread.");
        zzbcv.a(getContext());
        if (((Boolean) zzbet.f.e()).booleanValue()) {
            if (((Boolean) zzbd.c().b(zzbcv.xb)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.b.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView.i(AdManagerAdView.this, adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.Y0.r(adManagerAdRequest.j());
    }

    @InterfaceC11300zs1
    public AdSize[] getAdSizes() {
        return this.Y0.c();
    }

    @InterfaceC11300zs1
    public AppEventListener getAppEventListener() {
        return this.Y0.m();
    }

    @InterfaceC5670cr1
    public VideoController getVideoController() {
        return this.Y0.k();
    }

    @InterfaceC11300zs1
    public VideoOptions getVideoOptions() {
        return this.Y0.l();
    }

    public void h() {
        this.Y0.t();
    }

    public final boolean j(zzbx zzbxVar) {
        return this.Y0.E(zzbxVar);
    }

    public void setAdSizes(@InterfaceC5670cr1 AdSize... adSizeArr) {
        if (adSizeArr != null && adSizeArr.length > 0) {
            this.Y0.y(adSizeArr);
            return;
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public void setAppEventListener(@InterfaceC11300zs1 AppEventListener appEventListener) {
        this.Y0.A(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.Y0.B(z);
    }

    public void setVideoOptions(@InterfaceC5670cr1 VideoOptions videoOptions) {
        this.Y0.D(videoOptions);
    }

    public AdManagerAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.s(context, "Context cannot be null");
    }

    public AdManagerAdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.s(context, "Context cannot be null");
    }
}
