package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzac extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean O0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                com.google.android.gms.internal.common.zzc.b(parcel);
                z7(parcel.readInt(), parcel.readStrongBinder(), (zzk) com.google.android.gms.internal.common.zzc.a(parcel, zzk.CREATOR));
            } else {
                com.google.android.gms.internal.common.zzc.b(parcel);
                L5(parcel.readInt(), (Bundle) com.google.android.gms.internal.common.zzc.a(parcel, Bundle.CREATOR));
            }
        } else {
            com.google.android.gms.internal.common.zzc.b(parcel);
            Y2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) com.google.android.gms.internal.common.zzc.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
