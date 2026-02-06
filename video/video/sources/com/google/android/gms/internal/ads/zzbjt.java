package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbjt implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (map.keySet().contains("start")) {
            zzcfbVar.M().o();
        } else if (map.keySet().contains("stop")) {
            zzcfbVar.M().r();
        } else if (map.keySet().contains("cancel")) {
            zzcfbVar.M().p();
        }
    }
}
