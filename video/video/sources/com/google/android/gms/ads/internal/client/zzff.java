package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzff implements Runnable {
    public final /* synthetic */ zzfg X;

    public zzff(zzfg zzfgVar) {
        this.X = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        zzfg zzfgVar = this.X;
        zzbkVar = zzfgVar.X;
        if (zzbkVar != null) {
            try {
                zzbkVar2 = zzfgVar.X;
                zzbkVar2.E(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
