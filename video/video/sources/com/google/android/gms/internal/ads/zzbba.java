package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbba implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzbbb X;

    public zzbba(zzbbb zzbbbVar) {
        this.X = zzbbbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void o1(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Object obj;
        zzbbe zzbbeVar;
        Object obj2;
        zzbbb zzbbbVar = this.X;
        obj = zzbbbVar.c;
        synchronized (obj) {
            try {
                zzbbbVar.f = null;
                zzbbeVar = zzbbbVar.d;
                if (zzbbeVar != null) {
                    zzbbbVar.d = null;
                }
                obj2 = zzbbbVar.c;
                obj2.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
