package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdoc extends VideoController.VideoLifecycleCallbacks {
    public final zzdio a;

    public zzdoc(zzdio zzdioVar) {
        this.a = zzdioVar;
    }

    @InterfaceC11300zs1
    public static com.google.android.gms.ads.internal.client.zzed f(zzdio zzdioVar) {
        com.google.android.gms.ads.internal.client.zzea W = zzdioVar.W();
        if (W == null) {
            return null;
        }
        try {
            return W.i();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void a() {
        com.google.android.gms.ads.internal.client.zzed f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.d();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void c() {
        com.google.android.gms.ads.internal.client.zzed f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.g();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void e() {
        com.google.android.gms.ads.internal.client.zzed f = f(this.a);
        if (f == null) {
            return;
        }
        try {
            f.i();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to call onVideoEnd()", e);
        }
    }
}
