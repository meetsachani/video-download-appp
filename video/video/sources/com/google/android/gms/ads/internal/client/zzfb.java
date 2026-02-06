package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzfb implements Runnable {
    public final /* synthetic */ zzfc X;

    public zzfb(zzfc zzfcVar) {
        this.X = zzfcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfe zzfeVar = this.X.X;
        if (zzfe.W7(zzfeVar) != null) {
            try {
                zzfe.W7(zzfeVar).E(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
