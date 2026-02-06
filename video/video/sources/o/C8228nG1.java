package o;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.nG1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8228nG1 {
    @NotNull
    public static final String c = "SUGGESTED_EVENTS_HISTORY";
    @NotNull
    public static final String d = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
    public static SharedPreferences e;
    @NotNull
    public static final C8228nG1 a = new C8228nG1();
    @NotNull
    public static final Map<String, String> b = new LinkedHashMap();
    @NotNull
    public static final AtomicBoolean f = new AtomicBoolean(false);

    @InterfaceC9511sW0
    public static final void a(@NotNull String str, @NotNull String str2) {
        if (SQ.e(C8228nG1.class)) {
            return;
        }
        try {
            C6562gT0.p(str, "pathID");
            C6562gT0.p(str2, "predictedEvent");
            if (!f.get()) {
                a.c();
            }
            Map<String, String> map = b;
            map.put(str, str2);
            SharedPreferences sharedPreferences = e;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                edit.putString(c, com.facebook.internal.l0.o0(C8926q81.D0(map))).apply();
                return;
            }
            C6562gT0.S("shardPreferences");
            throw null;
        } catch (Throwable th) {
            SQ.c(th, C8228nG1.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String b(@NotNull View view, @NotNull String str) {
        if (SQ.e(C8228nG1.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            C6562gT0.p(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    C9455sH2 c9455sH2 = C9455sH2.a;
                    view = C9455sH2.j(view);
                }
                jSONObject.put(C9698tH2.c, jSONArray);
            } catch (JSONException unused) {
            }
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            return com.facebook.internal.l0.R0(jSONObject.toString());
        } catch (Throwable th) {
            SQ.c(th, C8228nG1.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String d(@NotNull String str) {
        if (SQ.e(C8228nG1.class)) {
            return null;
        }
        try {
            C6562gT0.p(str, "pathID");
            Map<String, String> map = b;
            if (!map.containsKey(str)) {
                return null;
            }
            return map.get(str);
        } catch (Throwable th) {
            SQ.c(th, C8228nG1.class);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (!SQ.e(this)) {
            try {
                AtomicBoolean atomicBoolean = f;
                if (atomicBoolean.get()) {
                    return;
                }
                com.facebook.M m = com.facebook.M.a;
                SharedPreferences sharedPreferences = com.facebook.M.n().getSharedPreferences(d, 0);
                C6562gT0.o(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
                e = sharedPreferences;
                Map<String, String> map = b;
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                SharedPreferences sharedPreferences2 = e;
                if (sharedPreferences2 != null) {
                    String string = sharedPreferences2.getString(c, "");
                    if (string != null) {
                        str = string;
                    }
                    map.putAll(com.facebook.internal.l0.k0(str));
                    atomicBoolean.set(true);
                    return;
                }
                C6562gT0.S("shardPreferences");
                throw null;
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
