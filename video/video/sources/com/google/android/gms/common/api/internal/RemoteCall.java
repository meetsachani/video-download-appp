package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(@InterfaceC5670cr1 T t, @InterfaceC5670cr1 U u) throws RemoteException;
}
