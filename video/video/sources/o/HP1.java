package o;

import com.facebook.internal.C2379y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class HP1 {
    public static boolean b;
    @NotNull
    public static final HP1 a = new HP1();
    @NotNull
    public static Map<String, HashSet<String>> c = new HashMap();

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(HP1.class)) {
            return;
        }
        try {
            b = false;
            c = new HashMap();
        } catch (Throwable th) {
            SQ.c(th, HP1.class);
        }
    }

    @InterfaceC9511sW0
    public static final void b() {
        if (!SQ.e(HP1.class)) {
            try {
                a.d();
                if (!c.isEmpty()) {
                    b = true;
                }
            } catch (Throwable th) {
                SQ.c(th, HP1.class);
            }
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String e(@NotNull String str) {
        if (SQ.e(HP1.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "eventName");
            if (b) {
                String c2 = a.c(str);
                if (c2 != null) {
                    return c2;
                }
            }
            return str;
        } catch (Throwable th) {
            SQ.c(th, HP1.class);
            return null;
        }
    }

    public final String c(String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            for (String str2 : c.keySet()) {
                HashSet<String> hashSet = c.get(str2);
                if (hashSet != null && hashSet.contains(str)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void d() {
        int length;
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                int i = 0;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q != null) {
                    try {
                        c = new HashMap();
                        JSONArray p = q.p();
                        if (p == null || p.length() == 0 || (length = p.length()) <= 0) {
                            return;
                        }
                        while (true) {
                            int i2 = i + 1;
                            JSONObject jSONObject = p.getJSONObject(i);
                            boolean has = jSONObject.has("key");
                            boolean has2 = jSONObject.has("value");
                            if (has && has2) {
                                String string = jSONObject.getString("key");
                                JSONArray jSONArray = jSONObject.getJSONArray("value");
                                if (string != null) {
                                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                                    HashSet<String> m2 = com.facebook.internal.l0.m(jSONArray);
                                    if (m2 != null) {
                                        Map<String, HashSet<String>> map = c;
                                        C6562gT0.o(string, "redactedString");
                                        map.put(string, m2);
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
}
