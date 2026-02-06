package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbjp implements zzbjw {
    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("Received log message: ".concat(valueOf));
    }
}
