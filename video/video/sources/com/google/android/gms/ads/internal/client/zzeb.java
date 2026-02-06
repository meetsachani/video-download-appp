package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzeb extends zzayk implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void U3(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(5, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void d() throws RemoteException {
        o1(4, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void g() throws RemoteException {
        o1(3, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void h() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void i() throws RemoteException {
        o1(1, O0());
    }
}
