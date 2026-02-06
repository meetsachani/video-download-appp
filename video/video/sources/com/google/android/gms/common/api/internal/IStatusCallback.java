package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface IStatusCallback extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @InterfaceC5670cr1
        public static IStatusCallback h5(@InterfaceC5670cr1 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof IStatusCallback) {
                return (IStatusCallback) queryLocalInterface;
            }
            return new zaby(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean r4(int i, @InterfaceC5670cr1 Parcel parcel, @InterfaceC5670cr1 Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                F5((Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR));
                return true;
            }
            return false;
        }
    }

    void F5(@InterfaceC5670cr1 Status status) throws RemoteException;
}
