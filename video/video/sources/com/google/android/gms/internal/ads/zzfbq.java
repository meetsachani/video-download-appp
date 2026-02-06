package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
final class zzfbq implements OnAdMetadataChangedListener {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzcb X;
    public final /* synthetic */ zzfbr Y;

    public zzfbq(zzfbr zzfbrVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.X = zzcbVar;
        this.Y = zzfbrVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void q() {
        zzdoh zzdohVar;
        zzdohVar = this.Y.Y0;
        if (zzdohVar != null) {
            try {
                this.X.d();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            }
        }
    }
}
