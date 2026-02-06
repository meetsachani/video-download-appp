package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface zzbvd extends IInterface {
    void s5(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException;

    void t1(ParcelFileDescriptor parcelFileDescriptor, zzbvl zzbvlVar) throws RemoteException;

    @Deprecated
    void y6(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;
}
