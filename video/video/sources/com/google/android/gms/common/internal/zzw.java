package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account b() throws RemoteException {
        Parcel O0 = O0(2, V3());
        Account account = (Account) com.google.android.gms.internal.common.zzc.a(O0, Account.CREATOR);
        O0.recycle();
        return account;
    }
}
