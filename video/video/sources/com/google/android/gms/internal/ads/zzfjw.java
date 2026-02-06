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
public final class zzfjw extends zzfkt {
    public zzfjw(ClientApi clientApi, Context context, int i, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfjx zzfjxVar, Clock clock) {
        super(clientApi, context, i, zzbplVar, zzfpVar, zzceVar, scheduledExecutorService, zzfjxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((zzban) obj).e();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final InterfaceFutureC8411o11 k(Context context) {
        zzgds A = zzgds.A();
        com.google.android.gms.ads.internal.client.zzbx T5 = this.a.T5(ObjectWrapper.V3(context), com.google.android.gms.ads.internal.client.zzr.B0(), this.e.X, this.d, this.c);
        if (T5 != null) {
            try {
                T5.k7(new zzfjv(this, A, this.e));
                T5.C3(this.e.Z);
                return A;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Failed to load app open ad.", e);
                A.m(new zzfjt(1, "remote exception"));
                return A;
            }
        }
        A.m(new zzfjt(1, "Failed to create an app open ad manager."));
        return A;
    }
}
