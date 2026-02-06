package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfi extends zzcx {
    public zzbmb X;

    public static /* synthetic */ void W7(zzfi zzfiVar) {
        zzbmb zzbmbVar = zzfiVar.X;
        if (zzbmbVar != null) {
            try {
                zzbmbVar.K0(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void B4(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void D6(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void I4(zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void P6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void Q3(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void T7(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void b6(zzbpl zzbplVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float d() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void d3(@InterfaceC11300zs1 String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String e() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List g() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void i() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void k() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfh
            @Override // java.lang.Runnable
            public final void run() {
                zzfi.W7(zzfi.this);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void n0(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean q() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void r0(@InterfaceC11300zs1 String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void u4(zzbmb zzbmbVar) throws RemoteException {
        this.X = zzbmbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void y1(zzfr zzfrVar) throws RemoteException {
    }
}
