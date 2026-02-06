package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigContainer {
    public static final String h = "configs_key";
    public static final String i = "fetch_time_key";
    public static final String j = "abt_experiments_key";
    public static final String k = "personalization_metadata_key";
    public static final String l = "template_version_number_key";
    public static final String m = "rollout_metadata_key";
    public static final String n = "affectedParameterKeys";

    /* renamed from: o  reason: collision with root package name */
    public static final String f389o = "rolloutId";
    public static final String p = "variantId";
    public static final Date q = new Date(0);
    public JSONObject a;
    public JSONObject b;
    public Date c;
    public JSONArray d;
    public JSONObject e;
    public long f;
    public JSONArray g;

    /* loaded from: classes3.dex */
    public static class Builder {
        public JSONObject a;
        public Date b;
        public JSONArray c;
        public JSONObject d;
        public long e;
        public JSONArray f;

        public ConfigContainer a() throws JSONException {
            return new ConfigContainer(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public Builder b(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public Builder c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder d(JSONArray jSONArray) {
            try {
                this.c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder e(Date date) {
            this.b = date;
            return this;
        }

        public Builder f(JSONObject jSONObject) {
            try {
                this.d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder g(JSONArray jSONArray) {
            try {
                this.f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder h(long j) {
            this.e = j;
            return this;
        }

        private Builder() {
            this.a = new JSONObject();
            this.b = ConfigContainer.q;
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.e = 0L;
            this.f = new JSONArray();
        }

        public Builder(ConfigContainer configContainer) {
            this.a = configContainer.g();
            this.b = configContainer.h();
            this.c = configContainer.e();
            this.d = configContainer.i();
            this.e = configContainer.k();
            this.f = configContainer.j();
        }
    }

    public static ConfigContainer b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(k);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(m);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject(h), new Date(jSONObject.getLong(i)), jSONObject.getJSONArray(j), jSONObject2, jSONObject.optLong(l), optJSONArray);
    }

    public static ConfigContainer d(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static Builder l() {
        return new Builder();
    }

    public static Builder m(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }

    public final Map<String, Map<String, String>> c() throws JSONException {
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < j().length(); i2++) {
            JSONObject jSONObject = j().getJSONObject(i2);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray(n);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string3 = jSONArray.getString(i3);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    public JSONArray e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigContainer)) {
            return false;
        }
        return this.a.toString().equals(((ConfigContainer) obj).toString());
    }

    public Set<String> f(ConfigContainer configContainer) throws JSONException {
        JSONObject g = d(configContainer.a).g();
        Map<String, Map<String, String>> c = c();
        Map<String, Map<String, String>> c2 = configContainer.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!configContainer.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(configContainer.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !configContainer.i().has(next)) || (!i().has(next) && configContainer.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && configContainer.i().has(next) && !i().getJSONObject(next).toString().equals(configContainer.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (c.containsKey(next) != c2.containsKey(next)) {
                hashSet.add(next);
            } else if (c.containsKey(next) && c2.containsKey(next) && !c.get(next).equals(c2.get(next))) {
                hashSet.add(next);
            } else {
                g.remove(next);
            }
        }
        Iterator<String> keys2 = g.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.b;
    }

    public Date h() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public JSONObject i() {
        return this.e;
    }

    public JSONArray j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(h, jSONObject);
        jSONObject3.put(i, date.getTime());
        jSONObject3.put(j, jSONArray);
        jSONObject3.put(k, jSONObject2);
        jSONObject3.put(l, j2);
        jSONObject3.put(m, jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = j2;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }
}
