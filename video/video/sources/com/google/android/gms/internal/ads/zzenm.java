package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzenm implements zzetv {
    @InterfaceC5056aJ2
    public final zzbzn a;
    @InterfaceC5056aJ2
    public AppSetIdClient b;
    public final ScheduledExecutorService c;
    public final zzgdj d;
    public final Context e;

    public zzenm(Context context, zzbzn zzbznVar, ScheduledExecutorService scheduledExecutorService, zzgdj zzgdjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l3)).booleanValue()) {
            this.b = AppSet.a(context);
        }
        this.e = context;
        this.a = zzbznVar;
        this.c = scheduledExecutorService;
        this.d = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        Task<AppSetIdInfo> b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h3)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m3)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.i3)).booleanValue()) {
                    return zzgcy.m(zzfry.a(this.b.b(), null), new zzfur() { // from class: com.google.android.gms.internal.ads.zzenj
                        @Override // com.google.android.gms.internal.ads.zzfur
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzenn(appSetIdInfo.a(), appSetIdInfo.b());
                        }
                    }, zzcaa.g);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l3)).booleanValue()) {
                    b = zzfdt.a(this.e);
                } else {
                    b = this.b.b();
                }
                if (b == null) {
                    return zzgcy.h(new zzenn(null, -1));
                }
                InterfaceFutureC8411o11 n = zzgcy.n(zzfry.a(b, null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzenk
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgcy.h(new zzenn(null, -1));
                        }
                        return zzgcy.h(new zzenn(appSetIdInfo.a(), appSetIdInfo.b()));
                    }
                }, zzcaa.g);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j3)).booleanValue()) {
                    n = zzgcy.o(n, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k3)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zzgcy.e(n, Exception.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzenl
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        zzenm.this.a.x((Exception) obj, "AppSetIdInfoSignal");
                        return new zzenn(null, -1);
                    }
                }, this.d);
            }
        }
        return zzgcy.h(new zzenn(null, -1));
    }
}
