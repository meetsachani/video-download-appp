package o;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class UO0 {
    public static SharedPreferences b = null;
    @NotNull
    public static final String e = "purchaseTime";
    @NotNull
    public static final String f = "com.facebook.internal.iap.PRODUCT_DETAILS";
    @NotNull
    public static final String g = "LAST_CLEARED_TIME";
    @NotNull
    public static final String h = "PURCHASE_DETAILS_SET";
    @NotNull
    public static final String i = "LAST_QUERY_PURCHASE_HISTORY_TIME";
    public static final int j = 604800;
    public static final int k = 86400;
    @NotNull
    public static final UO0 a = new UO0();
    @NotNull
    public static final Set<String> c = new CopyOnWriteArraySet();
    @NotNull
    public static final Map<String, Long> d = new ConcurrentHashMap();

    @InterfaceC9511sW0
    public static final boolean d() {
        if (SQ.e(UO0.class)) {
            return false;
        }
        try {
            a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                long j2 = sharedPreferences.getLong(i, 0L);
                if (j2 != 0 && currentTimeMillis - j2 < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong(i, currentTimeMillis).apply();
                    return true;
                }
                C6562gT0.S("sharedPreferences");
                throw null;
            }
            C6562gT0.S("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            SQ.c(th, UO0.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull Map<String, JSONObject> map, @NotNull Map<String, ? extends JSONObject> map2) {
        if (SQ.e(UO0.class)) {
            return;
        }
        try {
            C6562gT0.p(map, "purchaseDetailsMap");
            C6562gT0.p(map2, "skuDetailsMap");
            UO0 uo0 = a;
            uo0.g();
            uo0.f(uo0.c(uo0.a(map), map2));
        } catch (Throwable th) {
            SQ.c(th, UO0.class);
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final Map<String, JSONObject> a(@NotNull Map<String, JSONObject> map) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : C8926q81.D0(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has(C9998uW1.j)) {
                        String string = jSONObject.getString(C9998uW1.j);
                        if (d.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set<String> set = c;
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) string);
                            sb.append(C10928yK2.l);
                            sb.append(currentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet(h, c).apply();
                return new HashMap(map);
            }
            C6562gT0.S("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    public final void b() {
        if (!SQ.e(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = b;
                if (sharedPreferences != null) {
                    long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                    if (j2 == 0) {
                        SharedPreferences sharedPreferences2 = b;
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                            return;
                        } else {
                            C6562gT0.S("sharedPreferences");
                            throw null;
                        }
                    } else if (currentTimeMillis - j2 > 604800) {
                        for (Map.Entry entry : C8926q81.D0(d).entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Number) entry.getValue()).longValue();
                            if (currentTimeMillis - longValue > 86400) {
                                Set<String> set = c;
                                set.remove(str + C10928yK2.l + longValue);
                                d.remove(str);
                            }
                        }
                        SharedPreferences sharedPreferences3 = b;
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putStringSet(h, c).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                            return;
                        } else {
                            C6562gT0.S("sharedPreferences");
                            throw null;
                        }
                    } else {
                        return;
                    }
                }
                C6562gT0.S("sharedPreferences");
                throw null;
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public final Map<String, String> c(@NotNull Map<String, ? extends JSONObject> map, @NotNull Map<String, ? extends JSONObject> map2) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            C6562gT0.p(map, "purchaseDetailsMap");
            C6562gT0.p(map2, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
                JSONObject value = entry.getValue();
                JSONObject jSONObject = map2.get(entry.getKey());
                if (value != null && value.has(e)) {
                    try {
                        if (currentTimeMillis - (value.getLong(e) / 1000) <= 86400 && jSONObject != null) {
                            String jSONObject2 = value.toString();
                            C6562gT0.o(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            C6562gT0.o(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void f(Map<String, String> map) {
        if (!SQ.e(this)) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key != null && value != null) {
                        C3542Lj c3542Lj = C3542Lj.a;
                        C3542Lj.f(key, value, false);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(SO0.y, 0);
            SharedPreferences sharedPreferences2 = com.facebook.M.n().getSharedPreferences(SO0.z, 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = com.facebook.M.n().getSharedPreferences(f, 0);
            C6562gT0.o(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            b = sharedPreferences3;
            Set<String> set = c;
            if (sharedPreferences3 != null) {
                Set<String> stringSet = sharedPreferences3.getStringSet(h, new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                set.addAll(stringSet);
                for (String str : set) {
                    List o5 = C10763xf2.o5(str, new String[]{";"}, false, 2, 2, null);
                    d.put(o5.get(0), Long.valueOf(Long.parseLong((String) o5.get(1))));
                }
                b();
                return;
            }
            C6562gT0.S("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
