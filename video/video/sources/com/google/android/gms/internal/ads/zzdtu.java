package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdtu implements zzdte {
    public final long a;
    public final zzdtj b;
    public final zzfbl c;

    public zzdtu(long j, Context context, zzdtj zzdtjVar, zzchb zzchbVar, String str) {
        this.a = j;
        this.b = zzdtjVar;
        zzfbn z = zzchbVar.z();
        z.a(context);
        z.w(str);
        this.c = z.c().a();
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.c.f7(zzmVar, new zzdts(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void c() {
        try {
            zzfbl zzfblVar = this.c;
            zzfblVar.e5(new zzdtt(this));
            zzfblVar.d0(ObjectWrapper.V3(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }
}
