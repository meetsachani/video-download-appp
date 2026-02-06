package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzbyw extends zzayk implements zzbyy {
    public zzbyw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final zzbyv U0(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        zzbyv zzbytVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(2, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbytVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzbyv) {
                zzbytVar = (zzbyv) queryLocalInterface;
            } else {
                zzbytVar = new zzbyt(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbytVar;
    }
}
