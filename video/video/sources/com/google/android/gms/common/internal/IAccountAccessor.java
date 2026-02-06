package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface IAccountAccessor extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @InterfaceC5670cr1
        public static IAccountAccessor g1(@InterfaceC5670cr1 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                return (IAccountAccessor) queryLocalInterface;
            }
            return new zzw(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean O0(int i, @InterfaceC5670cr1 Parcel parcel, @InterfaceC5670cr1 Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                Account b = b();
                parcel2.writeNoException();
                com.google.android.gms.internal.common.zzc.d(parcel2, b);
                return true;
            }
            return false;
        }
    }

    @InterfaceC5670cr1
    Account b() throws RemoteException;
}
