package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfjz extends zzfkt {
    public zzfjz(ClientApi clientApi, Context context, int i, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfjx zzfjxVar, Clock clock) {
        super(clientApi, context, i, zzbplVar, zzfpVar, zzceVar, scheduledExecutorService, zzfjxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).k();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final InterfaceFutureC8411o11 k(Context context) {
        zzgds A = zzgds.A();
        com.google.android.gms.ads.internal.client.zzbx W4 = this.a.W4(ObjectWrapper.V3(context), new com.google.android.gms.ads.internal.client.zzr(), this.e.X, this.d, this.c);
        if (W4 != null) {
            try {
                W4.b2(this.e.Z, new zzfjy(this, A, W4));
                return A;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to load interstitial ad.", e);
                A.m(new zzfjt(1, "remote exception"));
                return A;
            }
        }
        A.m(new zzfjt(1, "Failed to create an interstitial ad manager."));
        return A;
    }
}
