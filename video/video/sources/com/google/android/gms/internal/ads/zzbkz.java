package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzbkz extends zzayk implements zzblb {
    public zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzbky I6(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i, zzbkv zzbkvVar) throws RemoteException {
        zzbky zzbkwVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzaym.f(O0, zzbkvVar);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (queryLocalInterface instanceof zzbky) {
                zzbkwVar = (zzbky) queryLocalInterface;
            } else {
                zzbkwVar = new zzbkw(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbkwVar;
    }
}
