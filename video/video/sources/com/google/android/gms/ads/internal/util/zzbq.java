package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzbq extends zzayl implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                zzaym.c(parcel);
                boolean zzg = zzg(IObjectWrapper.Stub.g1(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.offline.buffering.zza) zzaym.a(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzg ? 1 : 0);
            } else {
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                zze(g1);
                parcel2.writeNoException();
            }
        } else {
            IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzaym.c(parcel);
            boolean zzf = zzf(g12, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
