package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbjc implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject b;
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbfu G = zzcfbVar.G();
        if (G != null && (b = G.b()) != null) {
            zzcfbVar.a("nativeClickMetaReady", b);
        } else {
            zzcfbVar.a("nativeClickMetaReady", new JSONObject());
        }
    }
}
