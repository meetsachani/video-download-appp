package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void L5(int i, @InterfaceC5670cr1 Bundle bundle) throws RemoteException;

    void Y2(int i, @InterfaceC5670cr1 IBinder iBinder, @InterfaceC5670cr1 Bundle bundle) throws RemoteException;

    void z7(int i, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
