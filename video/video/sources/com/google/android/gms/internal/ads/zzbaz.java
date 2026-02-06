package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbaz implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbbb X;

    public zzbaz(zzbbb zzbbbVar) {
        this.X = zzbbbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void O0(@InterfaceC11300zs1 Bundle bundle) {
        Object obj;
        Object obj2;
        zzbbe zzbbeVar;
        zzbbe zzbbeVar2;
        zzbbb zzbbbVar = this.X;
        obj = zzbbbVar.c;
        synchronized (obj) {
            try {
                zzbbeVar = zzbbbVar.d;
                if (zzbbeVar != null) {
                    zzbbeVar2 = zzbbbVar.d;
                    zzbbbVar.f = zzbbeVar2.r0();
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to obtain a cache service instance.", e);
                zzbbb.h(this.X);
            }
            obj2 = this.X.c;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g1(int i) {
        Object obj;
        Object obj2;
        zzbbb zzbbbVar = this.X;
        obj = zzbbbVar.c;
        synchronized (obj) {
            zzbbbVar.f = null;
            obj2 = zzbbbVar.c;
            obj2.notifyAll();
        }
    }
}
