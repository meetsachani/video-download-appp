package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzevf implements zzetv {
    public final zzbzn a;
    public final ScheduledExecutorService b;
    public final zzgdj c;

    public zzevf(String str, zzbaw zzbawVar, zzbzn zzbznVar, ScheduledExecutorService scheduledExecutorService, zzgdj zzgdjVar) {
        this.a = zzbznVar;
        this.b = scheduledExecutorService;
        this.c = zzgdjVar;
    }

    public static /* synthetic */ zzevg c(zzevf zzevfVar, Exception exc) {
        zzevfVar.a.x(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevg(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h3)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m3)).booleanValue()) {
                InterfaceFutureC8411o11 a = zzfry.a(Tasks.g(null), null);
                zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzevd
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgcy.h(new zzevg(null, -1));
                        }
                        return zzgcy.h(new zzevg(appSetIdInfo.a(), appSetIdInfo.b()));
                    }
                };
                zzgdj zzgdjVar = this.c;
                InterfaceFutureC8411o11 n = zzgcy.n(a, zzgcfVar, zzgdjVar);
                if (((Boolean) zzbei.a.e()).booleanValue()) {
                    n = zzgcy.o(n, ((Long) zzbei.b.e()).longValue(), TimeUnit.MILLISECONDS, this.b);
                }
                return zzgcy.e(n, Exception.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzeve
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        return zzevf.c(zzevf.this, (Exception) obj);
                    }
                }, zzgdjVar);
            }
        }
        return zzgcy.h(new zzevg(null, -1));
    }
}
