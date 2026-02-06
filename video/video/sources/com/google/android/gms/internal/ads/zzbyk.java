package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import o.InterfaceC5056aJ2;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public abstract class zzbyk {
    @InterfaceC8710pF0("ScionComponent.class")
    @InterfaceC5056aJ2
    public static zzbyk a;

    public static synchronized zzbyk b(Context context) {
        synchronized (zzbyk.class) {
            try {
                zzbyk zzbykVar = a;
                if (zzbykVar != null) {
                    return zzbykVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbcv.a(applicationContext);
                com.google.android.gms.ads.internal.util.zzg j = com.google.android.gms.ads.internal.zzv.t().j();
                j.g0(applicationContext);
                zzbyc zzbycVar = new zzbyc(null);
                zzbycVar.b(applicationContext);
                zzbycVar.c(com.google.android.gms.ads.internal.zzv.d());
                zzbycVar.a(j);
                zzbycVar.d(com.google.android.gms.ads.internal.zzv.s());
                zzbyk e = zzbycVar.e();
                a = e;
                ((zzbxw) ((zzbyd) e).e.b()).a();
                zzbyo zzbyoVar = (zzbyo) ((zzbyd) a).j.b();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I0)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.v();
                    Map c0 = com.google.android.gms.ads.internal.util.zzs.c0((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J0));
                    for (String str : c0.keySet()) {
                        zzbyoVar.c(str);
                    }
                    zzbyoVar.d(new zzbym(zzbyoVar, c0));
                }
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzbya a();
}
