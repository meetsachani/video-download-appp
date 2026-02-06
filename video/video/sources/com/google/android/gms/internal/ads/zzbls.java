package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbls implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcaf X;

    public zzbls(zzblt zzbltVar, zzcaf zzcafVar) {
        this.X = zzcafVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        this.X.d(new RuntimeException("Connection failed."));
    }
}
