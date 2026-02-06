package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.S;
import com.facebook.internal.C2378x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C6551gQ1;
import o.C6562gT0;
import o.C8319ne2;
import o.CC0;
import o.DC0;
import o.HT1;
import o.InterfaceC5056aJ2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: com.facebook.internal.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2378x {
    @NotNull
    public static final String c = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    @NotNull
    public static final String d = "com.facebook.internal.APP_GATEKEEPERS.%s";
    @NotNull
    public static final String e = "android";
    @NotNull
    public static final String f = "mobile_sdk_gk";
    @NotNull
    public static final String g = "gatekeepers";
    @NotNull
    public static final String h = "data";
    @NotNull
    public static final String i = "fields";
    @NotNull
    public static final String j = "platform";
    @NotNull
    public static final String k = "sdk_version";

    /* renamed from: o  reason: collision with root package name */
    public static final long f117o = 3600000;
    @Nullable
    public static Long p;
    @Nullable
    public static DC0 q;
    @NotNull
    public static final C2378x a = new C2378x();
    @Nullable
    public static final String b = C6551gQ1.d(C2378x.class).V();
    @NotNull
    public static final AtomicBoolean l = new AtomicBoolean(false);
    @NotNull
    public static final ConcurrentLinkedQueue<a> m = new ConcurrentLinkedQueue<>();
    @NotNull
    public static final Map<String, JSONObject> n = new ConcurrentHashMap();

    /* renamed from: com.facebook.internal.x$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    @InterfaceC9511sW0
    public static final boolean d(@NotNull String str, @Nullable String str2, boolean z) {
        Boolean bool;
        C6562gT0.p(str, "name");
        Map<String, Boolean> e2 = a.e(str2);
        if (!e2.containsKey(str) || (bool = e2.get(str)) == null) {
            return z;
        }
        return bool.booleanValue();
    }

    @InterfaceC9511sW0
    public static final synchronized void h(@Nullable a aVar) {
        synchronized (C2378x.class) {
            if (aVar != null) {
                try {
                    m.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.facebook.M m2 = com.facebook.M.a;
            final String o2 = com.facebook.M.o();
            C2378x c2378x = a;
            if (c2378x.f(p) && n.containsKey(o2)) {
                c2378x.k();
                return;
            }
            final Context n2 = com.facebook.M.n();
            C8319ne2 c8319ne2 = C8319ne2.a;
            final String format = String.format(d, Arrays.copyOf(new Object[]{o2}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            if (n2 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = n2.getSharedPreferences(c, 0).getString(format, null);
            l0 l0Var = l0.a;
            if (!l0.f0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    l0 l0Var2 = l0.a;
                    l0.l0(l0.b, e2);
                }
                if (jSONObject != null) {
                    j(o2, jSONObject);
                }
            }
            com.facebook.M m3 = com.facebook.M.a;
            Executor y = com.facebook.M.y();
            if (y == null) {
                return;
            }
            if (!l.compareAndSet(false, true)) {
                return;
            }
            y.execute(new Runnable() { // from class: com.facebook.internal.w
                @Override // java.lang.Runnable
                public final void run() {
                    C2378x.i(o2, n2, format);
                }
            });
        }
    }

    public static final void i(String str, Context context, String str2) {
        C6562gT0.p(str, "$applicationId");
        C6562gT0.p(context, "$context");
        C6562gT0.p(str2, "$gateKeepersKey");
        C2378x c2378x = a;
        JSONObject c2 = c2378x.c(str);
        if (c2.length() != 0) {
            j(str, c2);
            context.getSharedPreferences(c, 0).edit().putString(str2, c2.toString()).apply();
            p = Long.valueOf(System.currentTimeMillis());
        }
        c2378x.k();
        l.set(false);
    }

    @InterfaceC9511sW0
    @InterfaceC5056aJ2(otherwise = 2)
    @NotNull
    public static final synchronized JSONObject j(@NotNull String str, @Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (C2378x.class) {
            try {
                C6562gT0.p(str, "applicationId");
                jSONObject2 = n.get(str);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                int i2 = 0;
                JSONObject jSONObject3 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray(g);
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                            jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                        } catch (JSONException e2) {
                            l0 l0Var = l0.a;
                            l0.l0(l0.b, e2);
                        }
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                n.put(str, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static final void l(a aVar) {
        aVar.a();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONObject m(@NotNull String str, boolean z) {
        C6562gT0.p(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = n;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        }
        JSONObject c2 = a.c(str);
        com.facebook.M m2 = com.facebook.M.a;
        Context n2 = com.facebook.M.n();
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(d, Arrays.copyOf(new Object[]{str}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        n2.getSharedPreferences(c, 0).edit().putString(format, c2.toString()).apply();
        return j(str, c2);
    }

    @InterfaceC9511sW0
    public static final void n() {
        DC0 dc0 = q;
        if (dc0 == null) {
            return;
        }
        DC0.h(dc0, null, 1, null);
    }

    @InterfaceC9511sW0
    public static final void o(@NotNull String str, @NotNull CC0 cc0) {
        CC0 c2;
        C6562gT0.p(str, "applicationId");
        C6562gT0.p(cc0, "gateKeeper");
        DC0 dc0 = q;
        if (dc0 == null) {
            c2 = null;
        } else {
            c2 = dc0.c(str, cc0.e());
        }
        if (c2 != null) {
            DC0 dc02 = q;
            if (dc02 == null) {
                return;
            }
            dc02.i(str, cc0);
            return;
        }
        Log.w(b, "Missing gatekeeper runtime cache");
    }

    public static /* synthetic */ void p(String str, CC0 cc0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            com.facebook.M m2 = com.facebook.M.a;
            str = com.facebook.M.o();
        }
        o(str, cc0);
    }

    public final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        com.facebook.M m2 = com.facebook.M.a;
        bundle.putString(k, com.facebook.M.I());
        bundle.putString("fields", g);
        S.c cVar = com.facebook.S.n;
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{f}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        com.facebook.S H = cVar.H(null, format, null);
        H.r0(bundle);
        JSONObject k2 = H.l().k();
        if (k2 == null) {
            return new JSONObject();
        }
        return k2;
    }

    @NotNull
    public final Map<String, Boolean> e(@Nullable String str) {
        List<CC0> a2;
        g();
        if (str != null) {
            Map<String, JSONObject> map = n;
            if (map.containsKey(str)) {
                DC0 dc0 = q;
                if (dc0 == null) {
                    a2 = null;
                } else {
                    a2 = dc0.a(str);
                }
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    for (CC0 cc0 : a2) {
                        hashMap.put(cc0.e(), Boolean.valueOf(cc0.f()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C6562gT0.o(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                DC0 dc02 = q;
                if (dc02 == null) {
                    dc02 = new DC0();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new CC0((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                dc02.m(str, arrayList);
                q = dc02;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final boolean f(Long l2) {
        if (l2 == null || System.currentTimeMillis() - l2.longValue() >= 3600000) {
            return false;
        }
        return true;
    }

    public final void g() {
        h(null);
    }

    public final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = m;
            if (!concurrentLinkedQueue.isEmpty()) {
                final a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new Runnable() { // from class: com.facebook.internal.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2378x.l(C2378x.a.this);
                        }
                    });
                }
            } else {
                return;
            }
        }
    }
}
