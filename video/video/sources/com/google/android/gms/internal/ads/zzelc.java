package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzelc {
    public final zzelh a;
    public final String b;
    @InterfaceC11300zs1
    public com.google.android.gms.ads.internal.client.zzdx c;

    public zzelc(zzelh zzelhVar, String str) {
        this.a = zzelhVar;
        this.b = str;
    }

    @InterfaceC11300zs1
    public final synchronized String a() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.c;
            if (zzdxVar != null) {
                str = zzdxVar.g();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    @InterfaceC11300zs1
    public final synchronized String b() {
        String str;
        str = null;
        try {
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.c;
            if (zzdxVar != null) {
                str = zzdxVar.g();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void d(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.c = null;
        zzeli zzeliVar = new zzeli(i);
        zzelb zzelbVar = new zzelb(this);
        this.a.b(zzmVar, this.b, zzeliVar, zzelbVar);
    }

    public final synchronized boolean e() throws RemoteException {
        return this.a.a();
    }
}
