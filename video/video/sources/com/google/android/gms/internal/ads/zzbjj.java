package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;
import o.C3855Oo;

/* loaded from: classes2.dex */
final class zzbjj implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        try {
            String str = (String) map.get("enabled");
            zzbjw zzbjwVar = zzbjv.a;
            if (!zzfui.c("true", str) && !zzfui.c(C3855Oo.a, str)) {
                return;
            }
            zzfrq.a(zzcfbVar.getContext()).b(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
