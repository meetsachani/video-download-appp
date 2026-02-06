package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public final class zzdy extends zzayk implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float d() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float e() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float g() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int h() throws RemoteException {
        Parcel g1 = g1(5, O0());
        int readInt = g1.readInt();
        g1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed i() throws RemoteException {
        zzed zzebVar;
        Parcel g1 = g1(11, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzed) {
                zzebVar = (zzed) queryLocalInterface;
            } else {
                zzebVar = new zzeb(readStrongBinder);
            }
        }
        g1.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void k() throws RemoteException {
        o1(2, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void l() throws RemoteException {
        o1(1, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n() throws RemoteException {
        o1(13, O0());
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n0(boolean z) throws RemoteException {
        Parcel O0 = O0();
        int i = zzaym.b;
        O0.writeInt(z ? 1 : 0);
        o1(3, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void n2(zzed zzedVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzedVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean o() throws RemoteException {
        Parcel g1 = g1(10, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean p() throws RemoteException {
        Parcel g1 = g1(12, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean r() throws RemoteException {
        Parcel g1 = g1(4, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
