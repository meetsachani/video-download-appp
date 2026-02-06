package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzefy extends zzbrd {
    public final zzedi X;
    public final /* synthetic */ zzega Y;

    public /* synthetic */ zzefy(zzega zzegaVar, zzedi zzediVar, zzefz zzefzVar) {
        this.Y = zzegaVar;
        this.X = zzediVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeew) this.X.c).Y1(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void P7(zzbqa zzbqaVar) throws RemoteException {
        zzega.c(this.Y, zzbqaVar);
        ((zzeew) this.X.c).p();
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final void u(String str) throws RemoteException {
        ((zzeew) this.X.c).O1(0, str);
    }
}
