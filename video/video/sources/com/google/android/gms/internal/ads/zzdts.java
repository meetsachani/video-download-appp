package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzdts extends zzbww {
    public final /* synthetic */ zzdtu X;

    public zzdts(zzdtu zzdtuVar) {
        this.X = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void E(int i) throws RemoteException {
        zzdtj zzdtjVar;
        long j;
        zzdtu zzdtuVar = this.X;
        zzdtjVar = zzdtuVar.b;
        j = zzdtuVar.a;
        zzdtjVar.m(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtj zzdtjVar;
        long j;
        zzdtu zzdtuVar = this.X;
        zzdtjVar = zzdtuVar.b;
        j = zzdtuVar.a;
        zzdtjVar.m(j, zzeVar.X);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void g() throws RemoteException {
        zzdtj zzdtjVar;
        long j;
        zzdtu zzdtuVar = this.X;
        zzdtjVar = zzdtuVar.b;
        j = zzdtuVar.a;
        zzdtjVar.p(j);
    }
}
