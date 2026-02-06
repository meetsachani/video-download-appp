package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzcgx extends IInterface {
    void A1(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    void C7(String str, String str2, Bundle bundle) throws RemoteException;

    int I(String str) throws RemoteException;

    void W6(String str, String str2, Bundle bundle) throws RemoteException;

    void Z(Bundle bundle) throws RemoteException;

    long c() throws RemoteException;

    String d() throws RemoteException;

    String e() throws RemoteException;

    void e0(String str) throws RemoteException;

    Bundle e6(Bundle bundle) throws RemoteException;

    String g() throws RemoteException;

    void g0(String str) throws RemoteException;

    String h() throws RemoteException;

    String i() throws RemoteException;

    void m1(Bundle bundle) throws RemoteException;

    List q3(String str, String str2) throws RemoteException;

    void t3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    Map u7(String str, String str2, boolean z) throws RemoteException;

    void x0(Bundle bundle) throws RemoteException;
}
