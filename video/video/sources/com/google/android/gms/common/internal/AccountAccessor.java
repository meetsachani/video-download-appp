package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class AccountAccessor extends IAccountAccessor.Stub {
    @InterfaceC11300zs1
    @KeepForSdk
    public static Account o1(@InterfaceC5670cr1 IAccountAccessor iAccountAccessor) {
        if (iAccountAccessor == null) {
            return null;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return iAccountAccessor.b();
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    @InterfaceC5670cr1
    public final Account b() {
        throw null;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        throw null;
    }
}
