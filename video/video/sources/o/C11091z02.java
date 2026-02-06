package o;

import com.facebook.internal.C2379y;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.z02  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11091z02 {
    public static boolean b = false;
    @NotNull
    public static final String e = "_MTSDK_Default_";
    @NotNull
    public static final String f = "_filteredKey";
    @NotNull
    public static final C11091z02 a = new C11091z02();
    @NotNull
    public static HashSet<String> c = new HashSet<>();
    @NotNull
    public static Map<String, HashSet<String>> d = new HashMap();

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(C11091z02.class)) {
            return;
        }
        try {
            b = false;
            d = new HashMap();
            c = new HashSet<>();
        } catch (Throwable th) {
            SQ.c(th, C11091z02.class);
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (SQ.e(C11091z02.class)) {
            return;
        }
        try {
            a.c();
            HashSet<String> hashSet = c;
            if (hashSet != null) {
                if (hashSet.isEmpty()) {
                }
                b = true;
                return;
            }
            Map<String, HashSet<String>> map = d;
            if (map != null) {
                if (map.isEmpty()) {
                }
                b = true;
                return;
            }
            b = false;
        } catch (Throwable th) {
            SQ.c(th, C11091z02.class);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(9:11|(1:13)|14|15|16|(4:19|(3:21|22|23)(1:25)|24|17)|26|27|(2:29|30)(1:32))|35|(2:37|38)|14|15|16|(1:17)|26|27|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x0023, Exception -> 0x0063, TryCatch #0 {all -> 0x0023, blocks: (B:5:0x0009, B:8:0x0018, B:10:0x001c, B:18:0x002e, B:19:0x0033, B:20:0x0048, B:22:0x004e, B:24:0x005c, B:26:0x0063, B:28:0x0069, B:15:0x0025), top: B:33:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:5:0x0009, B:8:0x0018, B:10:0x001c, B:18:0x002e, B:19:0x0033, B:20:0x0048, B:22:0x004e, B:24:0x005c, B:26:0x0063, B:28:0x0069, B:15:0x0025), top: B:33:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(@NotNull Map<String, String> map, @NotNull String str) {
        JSONArray jSONArray;
        if (!SQ.e(C11091z02.class)) {
            try {
                C6562gT0.p(map, BreadcrumbAnalyticsEventReceiver.c);
                C6562gT0.p(str, "eventName");
                if (b) {
                    HashSet<String> hashSet = c;
                    if (hashSet != null) {
                        if (hashSet.isEmpty()) {
                        }
                        jSONArray = new JSONArray();
                        HashSet<String> hashSet2 = d.get(str);
                        for (String str2 : new ArrayList(map.keySet())) {
                            if (a.e(str2, hashSet2)) {
                                map.remove(str2);
                                jSONArray.put(str2);
                            }
                        }
                        if (jSONArray.length() <= 0) {
                            map.put(f, jSONArray.toString());
                            return;
                        }
                        return;
                    }
                    if (!d.containsKey(str)) {
                        return;
                    }
                    jSONArray = new JSONArray();
                    HashSet<String> hashSet22 = d.get(str);
                    while (r2.hasNext()) {
                    }
                    if (jSONArray.length() <= 0) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C11091z02.class);
            }
        }
    }

    public final void c() {
        int length;
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                int i = 0;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q != null) {
                    try {
                        c = new HashSet<>();
                        d = new HashMap();
                        JSONArray s = q.s();
                        if (s == null || s.length() == 0 || (length = s.length()) <= 0) {
                            return;
                        }
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = s.getJSONObject(i);
                            boolean has = jSONObject.has("key");
                            boolean has2 = jSONObject.has("value");
                            if (has && has2) {
                                String string = jSONObject.getString("key");
                                JSONArray jSONArray = jSONObject.getJSONArray("value");
                                if (string != null && jSONArray != null) {
                                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                                    HashSet<String> m2 = com.facebook.internal.l0.m(jSONArray);
                                    if (m2 != null) {
                                        if (string.equals(e)) {
                                            c = m2;
                                        } else {
                                            Map<String, HashSet<String>> map = d;
                                            C6562gT0.o(string, "sensitiveParamsScope");
                                            map.put(string, m2);
                                        }
                                    }
                                }
                            }
                            if (i2 < length) {
                                i = i2;
                            } else {
                                return;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean e(String str, HashSet<String> hashSet) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            if (!c.contains(str)) {
                if (hashSet != null && !hashSet.isEmpty()) {
                    if (hashSet.contains(str)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
