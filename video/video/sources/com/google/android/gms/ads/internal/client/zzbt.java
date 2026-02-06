package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmp;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public interface zzbt extends IInterface {
    void B2(zzbhe zzbheVar) throws RemoteException;

    void E7(zzcp zzcpVar) throws RemoteException;

    void K3(zzbk zzbkVar) throws RemoteException;

    void L7(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void M2(zzbfv zzbfvVar) throws RemoteException;

    void N7(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void W2(zzbmp zzbmpVar) throws RemoteException;

    void Y3(String str, zzbhn zzbhnVar, @InterfaceC11300zs1 zzbhk zzbhkVar) throws RemoteException;

    zzbq d() throws RemoteException;

    void n7(zzbhr zzbhrVar, zzr zzrVar) throws RemoteException;

    void p7(zzbhh zzbhhVar) throws RemoteException;

    void q7(zzbhu zzbhuVar) throws RemoteException;

    void v4(zzbmg zzbmgVar) throws RemoteException;
}
