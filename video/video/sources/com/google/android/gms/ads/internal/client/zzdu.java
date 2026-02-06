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
public final class zzdu extends zzayk implements IInterface {
    public zzdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdt r4(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        zzaym.f(O0, zzbplVar);
        O0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel g1 = g1(1, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdt) {
                zzdrVar = (zzdt) queryLocalInterface;
            } else {
                zzdrVar = new zzdr(readStrongBinder);
            }
        }
        g1.recycle();
        return zzdrVar;
    }
}
