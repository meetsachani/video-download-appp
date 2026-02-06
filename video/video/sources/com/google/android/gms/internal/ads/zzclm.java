package com.google.android.gms.internal.ads;

import java.util.Map;
import o.C5515cD0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzclm implements zzcld {
    public final zzedd a;

    public zzclm(zzedd zzeddVar) {
        this.a = zzeddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue()) {
            return;
        }
        zzgcp zzgcpVar = (zzgcp) zzgcy.f(zzgcp.A(this.a.a(true)), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcll
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ka)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.t().y(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzv.t().w(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgcy.h(new C5515cD0(zzfyc.F()));
            }
        }, zzcaa.a);
    }
}
