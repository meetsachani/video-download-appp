package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbjb implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject a;
        zzcfb zzcfbVar = (zzcfb) obj;
        zzbfu G = zzcfbVar.G();
        if (G != null && (a = G.a()) != null) {
            zzcfbVar.a("nativeAdViewSignalsReady", a);
        } else {
            zzcfbVar.a("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
