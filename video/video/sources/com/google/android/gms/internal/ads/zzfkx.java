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
public final class zzfkx extends zzfkt {
    public zzfkx(ClientApi clientApi, Context context, int i, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfjx zzfjxVar, Clock clock) {
        super(clientApi, context, i, zzbplVar, zzfpVar, zzceVar, scheduledExecutorService, zzfjxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx j(Object obj) {
        try {
            return ((zzbwq) obj).c();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.c("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final InterfaceFutureC8411o11 k(Context context) {
        zzgds A = zzgds.A();
        zzbwq s3 = this.a.s3(ObjectWrapper.V3(context), this.e.X, this.d, this.c);
        zzfkw zzfkwVar = new zzfkw(this, A, s3);
        if (s3 != null) {
            try {
                s3.f7(this.e.Z, zzfkwVar);
                return A;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Failed to load rewarded ad.");
                A.m(new zzfjt(1, "remote exception"));
                return A;
            }
        }
        A.m(new zzfjt(1, "Failed to create a rewarded ad."));
        return A;
    }
}
