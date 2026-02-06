package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzbyv extends IInterface {
    void E3(IObjectWrapper iObjectWrapper, zzbyz zzbyzVar, zzbys zzbysVar) throws RemoteException;

    void O3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException;

    void R3(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException;

    void V1(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException;

    IObjectWrapper V2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void a6(List list, IObjectWrapper iObjectWrapper, zzbua zzbuaVar) throws RemoteException;

    void b0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void s0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void s4(zzbud zzbudVar) throws RemoteException;
}
