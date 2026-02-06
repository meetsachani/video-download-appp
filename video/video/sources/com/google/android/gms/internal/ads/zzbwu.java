package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes2.dex */
public final class zzbwu extends zzayk implements IInterface {
    public zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder r4(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        O0.writeString(str);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        g1.recycle();
        return readStrongBinder;
    }
}
