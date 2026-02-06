package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzblr implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcaf X;
    public final /* synthetic */ zzblt Y;

    public zzblr(zzblt zzbltVar, zzcaf zzcafVar) {
        this.X = zzcafVar;
        this.Y = zzbltVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        zzblg zzblgVar;
        try {
            zzcaf zzcafVar = this.X;
            zzblgVar = this.Y.a;
            zzcafVar.c(zzblgVar.q0());
        } catch (DeadObjectException e) {
            this.X.d(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        this.X.d(new RuntimeException("onConnectionSuspended: " + i));
    }
}
