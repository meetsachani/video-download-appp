package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzejn {
    @InterfaceC8710pF0("this")
    public final Map a = new HashMap();
    @InterfaceC8710pF0("this")
    public final Map b = new HashMap();
    @InterfaceC8710pF0("this")
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final Executor f;
    @InterfaceC11300zs1
    public JSONObject g;

    public zzejn(Executor executor) {
        this.f = executor;
    }

    public static final Bundle o(@InterfaceC11300zs1 JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        HashMap hashMap;
        Bundle bundle;
        try {
            Map b = b(str, str2);
            zzfyf h = h(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((zzfyf) b).entrySet()) {
                String str3 = (String) entry.getKey();
                if (h.containsKey(str3)) {
                    zzejr zzejrVar = (zzejr) h.get(str3);
                    List list = (List) entry.getValue();
                    boolean z = zzejrVar.b;
                    boolean z2 = zzejrVar.c;
                    boolean z3 = zzejrVar.d;
                    if (list != null && !list.isEmpty()) {
                        bundle = (Bundle) list.get(0);
                    } else {
                        bundle = new Bundle();
                    }
                    hashMap.put(str3, new zzejr(str3, z, z2, z3, bundle));
                }
            }
            zzgai it = h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzejr) entry2.getValue()).d) {
                    hashMap.put(str4, (zzejr) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Map b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.t().j().g().c()) && (map = (Map) this.c.get(str)) != null) {
                List<zzejp> list = (List) map.get(str2);
                if (list == null) {
                    String a = zzdqa.a(this.g, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jb)).booleanValue()) {
                        a = a.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(a);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzejp zzejpVar : list) {
                        String str3 = zzejpVar.a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzejpVar.b);
                    }
                    return zzfyf.c(hashMap);
                }
            }
            return zzfyf.d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.t().j().g().c())) {
            return zzfyf.d();
        }
        return zzfyf.c(this.b);
    }

    public final void f() {
        com.google.android.gms.ads.internal.zzv.t().j().Y(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejm
            @Override // java.lang.Runnable
            public final void run() {
                r0.f.execute(new zzejl(zzejn.this));
            }
        });
        this.f.execute(new zzejl(this));
    }

    public final synchronized void g(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.a;
            if (!map.containsKey(str)) {
                map.put(str, new zzejp(str, "", new Bundle()));
            }
        }
    }

    public final synchronized zzfyf h(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.t().j().g().c())) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x3), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y3), str);
                if (matches) {
                    hashMap = new HashMap(this.e);
                } else if (matches2) {
                    hashMap = new HashMap(this.d);
                }
                return zzfyf.c(hashMap);
            }
            return zzfyf.d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized List i(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle o2 = o(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        g(str2);
                        if (((zzejp) this.a.get(str2)) != null) {
                            arrayList.add(new zzejp(str2, str, o2));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void j() {
        this.b.clear();
        this.a.clear();
        this.e.clear();
        this.d.clear();
        m();
        n();
        k();
    }

    public final synchronized void k() {
        JSONObject f;
        try {
            if (!((Boolean) zzbfb.b.e()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y1)).booleanValue() && (f = com.google.android.gms.ads.internal.zzv.t().j().g().f()) != null) {
                    JSONArray jSONArray = f.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzejr zzejrVar = new zzejr(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.d.put(optString, zzejrVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.e.put(optString, zzejrVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.l("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void l(String str, String str2, List list) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Map map = this.c;
                Map map2 = (Map) map.get(str);
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map.put(str, map2);
                List list2 = (List) map2.get(str2);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.addAll(list);
                map2.put(str2, list2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m() {
        String optString;
        JSONArray optJSONArray;
        try {
            JSONObject f = com.google.android.gms.ads.internal.zzv.t().j().g().f();
            if (f != null) {
                try {
                    JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                    this.g = f.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jb)).booleanValue()) {
                                optString = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                            } else {
                                optString = jSONObject.optString("ad_unit_id", "");
                            }
                            String optString2 = jSONObject.optString(S.A, "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.addAll(i(optJSONArray.getJSONObject(i2), optString2));
                                }
                            }
                            l(optString2, optString, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        JSONObject f;
        if (!((Boolean) zzbfb.e.e()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.X1)).booleanValue() && (f = com.google.android.gms.ads.internal.zzv.t().j().g().f()) != null) {
                try {
                    JSONArray jSONArray = f.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle o2 = o(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.b.put(optString, new zzejr(optString, optBoolean2, optBoolean, true, o2));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.l("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
