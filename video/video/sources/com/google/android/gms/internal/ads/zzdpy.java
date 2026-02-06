package com.google.android.gms.internal.ads;

import com.facebook.S;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.MB;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdpy {
    @InterfaceC11300zs1
    public JSONObject b;
    public final Executor c;
    public boolean d;
    @InterfaceC11300zs1
    public JSONObject e;
    public final Map a = new ConcurrentHashMap();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzdpy(Executor executor) {
        this.c = executor;
    }

    @MB
    public final JSONObject a() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p4)).booleanValue()) {
            return null;
        }
        return this.b;
    }

    @MB
    public final JSONObject b(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n4)).booleanValue() && str != null && str2 != null) {
            if (!this.d) {
                h();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.o4)).booleanValue()) {
                    g();
                }
            }
            Map map = (Map) this.a.get(str2);
            if (map != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                String a = zzdqa.a(this.e, str, str2);
                if (a != null) {
                    return (JSONObject) map.get(a);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void f() {
        g();
        this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpv
            @Override // java.lang.Runnable
            public final void run() {
                zzdpy.this.h();
            }
        });
    }

    public final void g() {
        if (!this.f.getAndSet(true)) {
            com.google.android.gms.ads.internal.zzv.t().j().Y(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpw
                @Override // java.lang.Runnable
                public final void run() {
                    r0.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdpy.this.h();
                        }
                    });
                }
            });
        }
    }

    public final synchronized void h() {
        JSONObject f;
        JSONObject jSONObject;
        Map map;
        try {
            this.d = true;
            zzbzh g = com.google.android.gms.ads.internal.zzv.t().j().g();
            if (g != null && (f = g.f()) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p4)).booleanValue()) {
                    jSONObject = f.optJSONObject("common_settings");
                } else {
                    jSONObject = null;
                }
                this.b = jSONObject;
                this.e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString(S.A);
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                Map map2 = this.a;
                                if (map2.containsKey(optString2)) {
                                    map = (Map) map2.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
