package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbwq;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcf extends zzayk implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void B1(zzbpl zzbplVar) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, zzbplVar);
        o1(8, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void P2(List list, zzce zzceVar) throws RemoteException {
        Parcel O0 = O0();
        O0.writeTypedList(list);
        zzaym.f(O0, zzceVar);
        o1(1, O0);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbx S(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(7, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) queryLocalInterface;
            } else {
                zzbvVar = new zzbv(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbwq f0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(3, O0);
        zzbwq W7 = zzbwp.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean g0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(2, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean k2(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(6, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean p1(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(4, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzban u(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(5, O0);
        zzban W7 = zzbam.W7(g1.readStrongBinder());
        g1.recycle();
        return W7;
    }
}
