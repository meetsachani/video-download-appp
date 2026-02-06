package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfn extends zzdm {
    @InterfaceC11300zs1
    public final OnAdMetadataChangedListener X;

    public zzfn(@InterfaceC11300zs1 OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.X = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void d() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.X;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.q();
        }
    }
}
