package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdmb {
    public final Executor a;
    public final zzdlw b;
    public final zzdrx c;

    public zzdmb(Executor executor, zzdlw zzdlwVar, zzdrx zzdrxVar) {
        this.a = executor;
        this.b = zzdlwVar;
        this.c = zzdrxVar;
    }

    public final InterfaceFutureC8411o11 a(JSONObject jSONObject, String str) {
        InterfaceFutureC8411o11 h;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgcy.h(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            this.c.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_CUSTOM_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                h = zzgcy.h(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    h = zzgcy.h(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        h = zzgcy.h(new zzdma(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        h = zzgcy.m(this.b.e(optJSONObject, "image_value", null), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdly
                            @Override // com.google.android.gms.internal.ads.zzfur
                            public final Object apply(Object obj) {
                                return new zzdma(optString, (zzbft) obj);
                            }
                        }, this.a);
                    } else {
                        h = zzgcy.h(null);
                    }
                }
            }
            arrayList.add(h);
        }
        return zzgcy.m(zzgcy.d(arrayList), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdma zzdmaVar : (List) obj) {
                    if (zzdmaVar != null) {
                        arrayList2.add(zzdmaVar);
                    }
                }
                return arrayList2;
            }
        }, this.a);
    }
}
