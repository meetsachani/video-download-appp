package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbpl;

/* loaded from: classes2.dex */
public final class zzby extends zzayk implements IInterface {
    public zzby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder r4(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbpl zzbplVar, int i, int i2) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.d(O0, zzrVar);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        O0.writeInt(i2);
        Parcel g1 = g1(2, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        g1.recycle();
        return readStrongBinder;
    }
}
