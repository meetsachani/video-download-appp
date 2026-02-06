package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwn;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbwy;
import com.google.android.gms.internal.ads.zzbxe;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfm extends zzbwp {
    public static void X7(final zzbwx zzbwxVar) {
        com.google.android.gms.ads.internal.util.client.zzo.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                zzbwx zzbwxVar2 = zzbwx.this;
                if (zzbwxVar2 != null) {
                    try {
                        zzbwxVar2.E(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void A6(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void H4(zzdn zzdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void S6(zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        X7(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final Bundle b() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final zzdx c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final String d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void d0(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void d5(zzbxe zzbxeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String e() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void e5(zzbwt zzbwtVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    @InterfaceC11300zs1
    public final zzbwn f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void f7(zzm zzmVar, zzbwx zzbwxVar) throws RemoteException {
        X7(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final boolean o() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void r3(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void v1(zzbwy zzbwyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void v3(boolean z) {
    }
}
