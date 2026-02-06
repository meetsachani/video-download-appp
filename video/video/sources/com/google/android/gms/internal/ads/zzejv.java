package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzejv extends com.google.android.gms.ads.internal.client.zzbp {
    public final zzelc X;

    public zzejv(Context context, zzchb zzchbVar, zzfcn zzfcnVar, zzdiz zzdizVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzele zzeleVar = new zzele(zzdizVar, zzchbVar.n());
        zzeleVar.e(zzbkVar);
        this.X = new zzelc(new zzelo(zzchbVar, context, zzeleVar, zzfcnVar), zzfcnVar.l());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void Q4(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.X.d(zzmVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void U4(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.X.d(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String d() {
        return this.X.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String e() {
        return this.X.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean i() throws RemoteException {
        return this.X.e();
    }
}
