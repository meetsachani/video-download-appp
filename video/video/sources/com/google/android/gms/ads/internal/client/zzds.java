package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzds extends zzayl implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
            zzaym.c(parcel);
            x3(readString, g1, g12);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
