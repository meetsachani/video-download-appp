package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class zzeeo extends zzbqx {
    public final zzedi X;
    public final /* synthetic */ zzeeq Y;

    public /* synthetic */ zzeeo(zzeeq zzeeqVar, zzedi zzediVar, zzeep zzeepVar) {
        this.Y = zzeeqVar;
        this.X = zzediVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void G(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeew) this.X.c).Y1(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void S4(zzbpu zzbpuVar) throws RemoteException {
        zzeeq.d(this.Y, zzbpuVar);
        ((zzeew) this.X.c).p();
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void Z0(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzeeq.e(this.Y, (View) ObjectWrapper.o1(iObjectWrapper));
        ((zzeew) this.X.c).p();
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void u(String str) throws RemoteException {
        ((zzeew) this.X.c).O1(0, str);
    }
}
