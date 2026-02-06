package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbjs implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfbVar.d1();
        } else if ("resume".equals(str)) {
            zzcfbVar.M0();
        }
    }
}
