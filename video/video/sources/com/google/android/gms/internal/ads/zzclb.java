package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclb {
    public final Map a;
    public final Map b;

    public zzclb(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final void a(zzfcg zzfcgVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfce zzfceVar : zzfcgVar.b.c) {
            Map map = this.a;
            String str = zzfceVar.a;
            if (map.containsKey(str) && (jSONObject2 = zzfceVar.b) != null) {
                ((zzcle) map.get(str)).a(jSONObject2);
            } else {
                Map map2 = this.b;
                if (map2.containsKey(str) && (jSONObject = zzfceVar.b) != null) {
                    zzcld zzcldVar = (zzcld) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzcldVar.a(hashMap);
                }
            }
        }
    }
}
