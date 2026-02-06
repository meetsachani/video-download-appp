package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbwz extends RewardedAd {
    public volatile String a;
    public final zzbwq b;
    public final Context c;
    public final zzbxi d;
    @InterfaceC11300zs1
    public OnAdMetadataChangedListener e;
    @InterfaceC11300zs1
    public OnPaidEventListener f;
    @InterfaceC11300zs1
    public FullScreenContentCallback g;
    public final long h;

    public zzbwz(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzbb.a().s(context, str, new zzbph()));
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle a() {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                return zzbwqVar.b();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC5670cr1
    public final String b() {
        String str;
        if (this.a != null && !this.a.isEmpty()) {
            return this.a;
        }
        synchronized (this) {
            try {
                String d = this.b.d();
                if (d != null && !d.isEmpty()) {
                    this.a = d;
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
            str = this.a;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC11300zs1
    public final FullScreenContentCallback c() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC11300zs1
    public final OnAdMetadataChangedListener d() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC11300zs1
    public final OnPaidEventListener e() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC5670cr1
    public final ResponseInfo f() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzdxVar = zzbwqVar.c();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.g(zzdxVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @InterfaceC5670cr1
    public final RewardItem g() {
        zzbwn zzbwnVar;
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwnVar = zzbwqVar.f();
            } else {
                zzbwnVar = null;
            }
            if (zzbwnVar == null) {
                return RewardItem.a;
            }
            return new zzbxa(zzbwnVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return RewardItem.a;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void l(@InterfaceC11300zs1 FullScreenContentCallback fullScreenContentCallback) {
        this.g = fullScreenContentCallback;
        this.d.W7(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void m(boolean z) {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.v3(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void n(@InterfaceC11300zs1 OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.e = onAdMetadataChangedListener;
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.H4(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void o(@InterfaceC11300zs1 OnPaidEventListener onPaidEventListener) {
        try {
            this.f = onPaidEventListener;
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.r3(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void p(@InterfaceC11300zs1 ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbwq zzbwqVar = this.b;
                if (zzbwqVar != null) {
                    zzbwqVar.d5(new zzbxe(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void q(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzbxi zzbxiVar = this.d;
        zzbxiVar.X7(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzbwqVar.e5(zzbxiVar);
                zzbwqVar.d0(ObjectWrapper.V3(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public final void r(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbwq zzbwqVar = this.b;
            if (zzbwqVar != null) {
                zzehVar.o(this.h);
                zzbwqVar.f7(com.google.android.gms.ads.internal.client.zzq.a.a(this.c, zzehVar), new zzbxd(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    public zzbwz(Context context, String str, zzbwq zzbwqVar) {
        this.h = System.currentTimeMillis();
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = zzbwqVar;
        this.d = new zzbxi();
    }
}
