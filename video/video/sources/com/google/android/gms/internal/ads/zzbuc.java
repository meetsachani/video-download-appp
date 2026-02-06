package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbuc {
    public static zzbyv e;
    public final Context a;
    public final AdFormat b;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzeh c;
    @InterfaceC11300zs1
    public final String d;

    public zzbuc(Context context, AdFormat adFormat, @InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzeh zzehVar, @InterfaceC11300zs1 String str) {
        this.a = context;
        this.b = adFormat;
        this.c = zzehVar;
        this.d = str;
    }

    @InterfaceC11300zs1
    public static zzbyv a(Context context) {
        zzbyv zzbyvVar;
        synchronized (zzbuc.class) {
            try {
                if (e == null) {
                    e = com.google.android.gms.ads.internal.client.zzbb.a().t(context, new zzbph());
                }
                zzbyvVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyvVar;
    }

    public final void b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm a;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.a;
        zzbyv a2 = a(context);
        if (a2 == null) {
            queryInfoGenerationCallback.a("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper V3 = ObjectWrapper.V3(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.c;
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.g(currentTimeMillis);
            a = zznVar.a();
        } else {
            zzehVar.o(currentTimeMillis);
            a = com.google.android.gms.ads.internal.client.zzq.a.a(context, zzehVar);
        }
        try {
            a2.E3(V3, new zzbyz(this.d, this.b.name(), null, a, 0, null), new zzbub(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.a("Internal Error.");
        }
    }
}
