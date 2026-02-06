package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public interface zzbwq extends IInterface {
    void A6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void H4(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException;

    void S6(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException;

    Bundle b() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdx c() throws RemoteException;

    @InterfaceC11300zs1
    String d() throws RemoteException;

    void d0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void d5(zzbxe zzbxeVar) throws RemoteException;

    String e() throws RemoteException;

    void e5(zzbwt zzbwtVar) throws RemoteException;

    zzbwn f() throws RemoteException;

    void f7(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwx zzbwxVar) throws RemoteException;

    boolean o() throws RemoteException;

    void r3(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    void v1(zzbwy zzbwyVar) throws RemoteException;

    void v3(boolean z) throws RemoteException;
}
