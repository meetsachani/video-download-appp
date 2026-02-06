package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbji implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        try {
            zzfrt.k(zzcfbVar.getContext()).l();
            zzfru.j(zzcfbVar.getContext()).k();
            zzfrv.a(zzcfbVar.getContext()).b(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
