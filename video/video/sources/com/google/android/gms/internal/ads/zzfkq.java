package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfkq implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdx Y;
    public final /* synthetic */ zzfkt Z;

    public zzfkq(zzfkt zzfktVar, long j, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.X = j;
        this.Y = zzdxVar;
        this.Z = zzfktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkc zzfkcVar;
        zzfkc zzfkcVar2;
        String i;
        zzfkk zzfkkVar;
        zzfkt zzfktVar = this.Z;
        zzfkcVar = zzfktVar.n;
        if (zzfkcVar != null) {
            long j = this.X;
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.Y;
            zzfkcVar2 = zzfktVar.n;
            i = zzfkt.i(zzdxVar);
            zzfkkVar = zzfktVar.p;
            zzfkcVar2.c(j, i, zzfkkVar);
        }
    }
}
