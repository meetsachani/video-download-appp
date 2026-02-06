package o;

import android.util.Log;
import com.facebook.internal.C2379y;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class NT1 {
    public static boolean b = false;
    @NotNull
    public static final String f = "_removed_";
    @NotNull
    public static final String g = "process_event_name";
    @NotNull
    public static final String h = "restrictive_param";
    @NotNull
    public static final String i = "_restrictedParams";
    @NotNull
    public static final NT1 a = new NT1();
    public static final String c = NT1.class.getCanonicalName();
    @NotNull
    public static final List<a> d = new ArrayList();
    @NotNull
    public static final Set<String> e = new CopyOnWriteArraySet();

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public String a;
        @NotNull
        public Map<String, String> b;

        public a(@NotNull String str, @NotNull Map<String, String> map) {
            C6562gT0.p(str, "eventName");
            C6562gT0.p(map, "restrictiveParams");
            this.a = str;
            this.b = map;
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public final Map<String, String> b() {
            return this.b;
        }

        public final void c(@NotNull String str) {
            C6562gT0.p(str, "<set-?>");
            this.a = str;
        }

        public final void d(@NotNull Map<String, String> map) {
            C6562gT0.p(map, "<set-?>");
            this.b = map;
        }
    }

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(NT1.class)) {
            return;
        }
        try {
            b = true;
            a.c();
        } catch (Throwable th) {
            SQ.c(th, NT1.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String e(@NotNull String str) {
        if (SQ.e(NT1.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "eventName");
            if (b) {
                if (a.d(str)) {
                    return f;
                }
            }
            return str;
        } catch (Throwable th) {
            SQ.c(th, NT1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void f(@NotNull Map<String, String> map, @NotNull String str) {
        if (!SQ.e(NT1.class)) {
            try {
                C6562gT0.p(map, BreadcrumbAnalyticsEventReceiver.c);
                C6562gT0.p(str, "eventName");
                if (b) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String b2 = a.b(str, str2);
                        if (b2 != null) {
                            hashMap.put(str2, b2);
                            map.remove(str2);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            map.put(i, jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, NT1.class);
            }
        }
    }

    public final String b(String str, String str2) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            try {
                for (a aVar : new ArrayList(d)) {
                    if (aVar != null && C6562gT0.g(str, aVar.a())) {
                        for (String str3 : aVar.b().keySet()) {
                            if (C6562gT0.g(str2, str3)) {
                                return aVar.b().get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e2) {
                Log.w(c, "getMatchedRuleType failed", e2);
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void c() {
        String q;
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q2 = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q2 == null || (q = q2.q()) == null || q.length() == 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(q);
                d.clear();
                e.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject(h);
                        C6562gT0.o(next, "key");
                        a aVar = new a(next, new HashMap());
                        if (optJSONObject != null) {
                            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                            aVar.d(com.facebook.internal.l0.p(optJSONObject));
                            d.add(aVar);
                        }
                        if (jSONObject2.has(g)) {
                            e.add(aVar.a());
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean d(String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            return e.contains(str);
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
