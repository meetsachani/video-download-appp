package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdtp extends com.google.android.gms.ads.internal.client.zzbj {
    public final /* synthetic */ zzdtj X;
    public final /* synthetic */ zzdtq Y;

    public zzdtp(zzdtq zzdtqVar, zzdtj zzdtjVar) {
        this.X = zzdtjVar;
        this.Y = zzdtqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void E(int i) throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.d(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.d(j, zzeVar.X);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void c() throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.b(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void f() throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.c(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void g() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void h() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void i() throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.e(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void j() throws RemoteException {
        long j;
        zzdtq zzdtqVar = this.Y;
        zzdtj zzdtjVar = this.X;
        j = zzdtqVar.a;
        zzdtjVar.g(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void k() {
    }
}
