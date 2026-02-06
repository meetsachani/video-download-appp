package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
final class zzfbj implements OnAdMetadataChangedListener {
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdn X;
    public final /* synthetic */ zzfbl Y;

    public zzfbj(zzfbl zzfblVar, com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        this.X = zzdnVar;
        this.Y = zzfblVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void q() {
        zzdoh zzdohVar;
        zzdohVar = this.Y.d1;
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
