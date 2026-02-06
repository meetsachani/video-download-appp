package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbij extends zzbhq {
    public final OnAdManagerAdViewLoadedListener X;

    public zzbij(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.X = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void N1(com.google.android.gms.ads.internal.client.zzbx zzbxVar, IObjectWrapper iObjectWrapper) {
        AdListener adListener;
        if (zzbxVar != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.o1(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbxVar.i() instanceof com.google.android.gms.ads.internal.client.zzg) {
                    com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbxVar.i();
                    if (zzgVar != null) {
                        adListener = zzgVar.W7();
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            }
            try {
                if (zzbxVar.j() instanceof zzazi) {
                    zzazi zzaziVar = (zzazi) zzbxVar.j();
                    if (zzaziVar != null) {
                        appEventListener = zzaziVar.X7();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.e("", e2);
            }
            com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzbii(this, adManagerAdView, zzbxVar));
        }
    }
}
