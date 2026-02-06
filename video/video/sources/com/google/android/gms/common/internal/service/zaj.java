package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean r4(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            c6(parcel.readInt());
            return true;
        }
        return false;
    }
}
