package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzbtf extends zzayk implements zzbth {
    public zzbtf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final zzbte U0(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        zzbte zzbtcVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzbte) {
                zzbtcVar = (zzbte) queryLocalInterface;
            } else {
                zzbtcVar = new zzbtc(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbtcVar;
    }
}
