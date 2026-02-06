package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzbte extends IInterface {
    void G7(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException;

    void Z0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void h() throws RemoteException;

    void p6(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    void s1(Intent intent) throws RemoteException;

    void v2(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException;
}
