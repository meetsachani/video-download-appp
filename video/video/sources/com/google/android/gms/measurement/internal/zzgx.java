package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzgx implements com.google.android.gms.internal.measurement.zzo {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzgp b;

    public zzgx(zzgp zzgpVar, String str) {
        this.b = zzgpVar;
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String w(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
