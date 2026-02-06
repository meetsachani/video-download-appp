package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbbo implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcaf X;
    public final /* synthetic */ zzbbp Y;

    public zzbbo(zzbbp zzbbpVar, zzcaf zzcafVar) {
        this.X = zzcafVar;
        this.Y = zzbbpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Object obj;
        obj = this.Y.d;
        synchronized (obj) {
            this.X.d(new RuntimeException("Connection failed."));
        }
    }
}
