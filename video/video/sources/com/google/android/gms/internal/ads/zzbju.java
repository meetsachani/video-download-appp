package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbju implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map.keySet().contains("start")) {
            zzcfbVar.A0(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfbVar.A0(false);
        }
    }
}
