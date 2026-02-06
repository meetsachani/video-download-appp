package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class zzcz extends zzbx implements zzda {
    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean O0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int a = a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        } else {
            long readLong = parcel.readLong();
            zzbw.f(parcel);
            e1(parcel.readString(), parcel.readString(), (Bundle) zzbw.a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
