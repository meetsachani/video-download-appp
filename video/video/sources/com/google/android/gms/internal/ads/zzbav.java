package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes2.dex */
public final class zzbav {
    public com.google.android.gms.ads.internal.client.zzbx a;
    public final Context b;
    public final String c;
    public final com.google.android.gms.ads.internal.client.zzeh d;
    public final AppOpenAd.AppOpenAdLoadCallback e;
    public final zzbph f = new zzbph();
    public final com.google.android.gms.ads.internal.client.zzq g = com.google.android.gms.ads.internal.client.zzq.a;

    public zzbav(Context context, String str, com.google.android.gms.ads.internal.client.zzeh zzehVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.b = context;
        this.c = str;
        this.d = zzehVar;
        this.e = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr B0 = com.google.android.gms.ads.internal.client.zzr.B0();
            com.google.android.gms.ads.internal.client.zzaz a = com.google.android.gms.ads.internal.client.zzbb.a();
            Context context = this.b;
            String str = this.c;
            com.google.android.gms.ads.internal.client.zzbx e = a.e(context, B0, str, this.f);
            this.a = e;
            if (e != null) {
                com.google.android.gms.ads.internal.client.zzeh zzehVar = this.d;
                zzehVar.o(currentTimeMillis);
                this.a.k7(new zzbai(this.e, str));
                this.a.C3(this.g.a(context, zzehVar));
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e2);
        }
    }
}
