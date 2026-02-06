package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.C;
import com.facebook.internal.C2372q;
import com.facebook.internal.C2379y;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import o.C3542Lj;
import o.C6515gH1;
import o.C6562gT0;
import o.C8222nF;
import o.C8319ne2;
import o.C9670tA2;
import o.FK;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C {
    @NotNull
    public static final String A = "maca_rules";
    @NotNull
    public static final String B = "blocklist_events";
    @NotNull
    public static final String C = "redacted_events";
    @NotNull
    public static final String D = "sensitive_params";
    @NotNull
    public static final String H = "fields";
    public static boolean L = false;
    public static boolean M = false;
    @Nullable
    public static JSONArray N = null;
    @NotNull
    public static final String c = "com.facebook.internal.preferences.APP_SETTINGS";
    @NotNull
    public static final String d = "com.facebook.internal.APP_SETTINGS.%s";
    public static final int n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f110o = 16;
    public static final int p = 32;
    public static final int q = 256;
    public static final int r = 16384;
    @NotNull
    public static final String v = "sdk_update_message";
    @NotNull
    public static final String z = "standard_params";
    @NotNull
    public static final C a = new C();
    public static final String b = C.class.getSimpleName();
    @NotNull
    public static final String e = "supports_implicit_sdk_logging";
    @NotNull
    public static final String f = "gdpv4_nux_content";
    @NotNull
    public static final String g = "gdpv4_nux_enabled";
    @NotNull
    public static final String h = "android_dialog_configs";
    @NotNull
    public static final String i = "android_sdk_error_categories";
    @NotNull
    public static final String j = "app_events_session_timeout";
    @NotNull
    public static final String k = "app_events_feature_bitmask";
    @NotNull
    public static final String l = "auto_event_mapping_android";
    @NotNull
    public static final String s = "seamless_login";
    @NotNull
    public static final String t = "smart_login_bookmark_icon_url";
    @NotNull
    public static final String u = "smart_login_menu_icon_url";
    @NotNull
    public static final String m = "restrictive_data_filter_params";
    @NotNull
    public static final String w = "aam_rules";
    @NotNull
    public static final String x = "suggested_events_setting";
    @NotNull
    public static final String y = "protected_mode_rules";
    @NotNull
    public static final String E = "auto_log_app_events_default";
    @NotNull
    public static final String F = "auto_log_app_events_enabled";
    @NotNull
    public static final List<String> G = C8222nF.O(e, f, g, h, i, j, k, l, s, t, u, m, w, x, y, E, F);
    @NotNull
    public static final Map<String, C2379y> I = new ConcurrentHashMap();
    @NotNull
    public static final AtomicReference<a> J = new AtomicReference<>(a.NOT_LOADED);
    @NotNull
    public static final ConcurrentLinkedQueue<b> K = new ConcurrentLinkedQueue<>();

    /* loaded from: classes2.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(@Nullable C2379y c2379y);
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull b bVar) {
        C6562gT0.p(bVar, "callback");
        K.add(bVar);
        h();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2379y f(@Nullable String str) {
        if (str != null) {
            return I.get(str);
        }
        return null;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final Map<String, Boolean> g() {
        JSONObject jSONObject;
        com.facebook.M m2 = com.facebook.M.a;
        Context n2 = com.facebook.M.n();
        String o2 = com.facebook.M.o();
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(d, Arrays.copyOf(new Object[]{o2}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        String string = n2.getSharedPreferences(c, 0).getString(format, null);
        l0 l0Var = l0.a;
        if (!l0.f0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    l0 l0Var2 = l0.a;
                    l0.l0(l0.b, e2);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return a.l(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return null;
    }

    @InterfaceC9511sW0
    public static final void h() {
        com.facebook.M m2 = com.facebook.M.a;
        final Context n2 = com.facebook.M.n();
        final String o2 = com.facebook.M.o();
        l0 l0Var = l0.a;
        if (l0.f0(o2)) {
            J.set(a.ERROR);
            a.n();
        } else if (I.containsKey(o2)) {
            J.set(a.SUCCESS);
            a.n();
        } else {
            AtomicReference<a> atomicReference = J;
            a aVar = a.NOT_LOADED;
            a aVar2 = a.LOADING;
            if (!C6515gH1.a(atomicReference, aVar, aVar2) && !C6515gH1.a(atomicReference, a.ERROR, aVar2)) {
                a.n();
                return;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            final String format = String.format(d, Arrays.copyOf(new Object[]{o2}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.internal.z
                @Override // java.lang.Runnable
                public final void run() {
                    C.i(n2, format, o2);
                }
            });
        }
    }

    public static final void i(Context context, String str, String str2) {
        a aVar;
        JSONObject jSONObject;
        C6562gT0.p(context, "$context");
        C6562gT0.p(str, "$settingsKey");
        C6562gT0.p(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences(c, 0);
        C2379y c2379y = null;
        String string = sharedPreferences.getString(str, null);
        l0 l0Var = l0.a;
        if (!l0.f0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    l0 l0Var2 = l0.a;
                    l0.l0(l0.b, e2);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    c2379y = a.j(str2, jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C c2 = a;
        JSONObject e3 = c2.e(str2);
        if (e3 != null) {
            c2.j(str2, e3);
            sharedPreferences.edit().putString(str, e3.toString()).apply();
        }
        if (c2379y != null) {
            String r2 = c2379y.r();
            if (!L && r2 != null && r2.length() > 0) {
                L = true;
                Log.w(b, r2);
            }
        }
        C2378x c2378x = C2378x.a;
        C2378x.m(str2, true);
        C3542Lj c3542Lj = C3542Lj.a;
        C3542Lj.d();
        AtomicReference<a> atomicReference = J;
        if (I.containsKey(str2)) {
            aVar = a.SUCCESS;
        } else {
            aVar = a.ERROR;
        }
        atomicReference.set(aVar);
        c2.n();
    }

    public static final void o(b bVar) {
        bVar.a();
    }

    public static final void p(b bVar, C2379y c2379y) {
        bVar.b(c2379y);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2379y q(@NotNull String str, boolean z2) {
        C6562gT0.p(str, "applicationId");
        if (!z2) {
            Map<String, C2379y> map = I;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C c2 = a;
        JSONObject e2 = c2.e(str);
        if (e2 == null) {
            return null;
        }
        C2379y j2 = c2.j(str, e2);
        com.facebook.M m2 = com.facebook.M.a;
        if (C6562gT0.g(str, com.facebook.M.o())) {
            J.set(a.SUCCESS);
            c2.n();
        }
        return j2;
    }

    @InterfaceC9511sW0
    public static final void r(boolean z2) {
        M = z2;
        if (N != null && z2) {
            C9670tA2 c9670tA2 = C9670tA2.a;
            C9670tA2.c(String.valueOf(N));
        }
    }

    public final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(G);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        com.facebook.S H2 = com.facebook.S.n.H(null, FirebaseMessaging.r, null);
        H2.n0(true);
        H2.r0(bundle);
        JSONObject k2 = H2.l().k();
        if (k2 == null) {
            return new JSONObject();
        }
        return k2;
    }

    @NotNull
    public final C2379y j(@NotNull String str, @NotNull JSONObject jSONObject) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String jSONArray;
        C6562gT0.p(str, "applicationId");
        C6562gT0.p(jSONObject, "settingsJSON");
        JSONArray optJSONArray = jSONObject.optJSONArray(i);
        C2372q.a aVar = C2372q.g;
        C2372q a2 = aVar.a(optJSONArray);
        if (a2 == null) {
            a2 = aVar.b();
        }
        C2372q c2372q = a2;
        int optInt = jSONObject.optInt(k, 0);
        if ((optInt & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((optInt & 256) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((optInt & 16384) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(l);
        N = optJSONArray2;
        if (optJSONArray2 != null) {
            S s2 = S.a;
            if (S.b()) {
                C9670tA2 c9670tA2 = C9670tA2.a;
                if (optJSONArray2 == null) {
                    jSONArray = null;
                } else {
                    jSONArray = optJSONArray2.toString();
                }
                C9670tA2.c(jSONArray);
            }
        }
        boolean optBoolean = jSONObject.optBoolean(e, false);
        String optString = jSONObject.optString(f, "");
        C6562gT0.o(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject.optBoolean(g, false);
        FK fk = FK.a;
        int optInt2 = jSONObject.optInt(j, FK.a());
        EnumSet<d0> a3 = d0.Y.a(jSONObject.optLong(s));
        Map<String, Map<String, C2379y.b>> k2 = k(jSONObject.optJSONObject(h));
        String optString2 = jSONObject.optString(t);
        C6562gT0.o(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject.optString(u);
        C6562gT0.o(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject.optString(v);
        C6562gT0.o(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C2379y c2379y = new C2379y(optBoolean, optString, optBoolean2, optInt2, a3, k2, z2, c2372q, optString2, optString3, z3, z4, optJSONArray2, optString4, z5, z6, jSONObject.optString(w), jSONObject.optString(x), jSONObject.optString(m), m(jSONObject.optJSONObject(y), z), m(jSONObject.optJSONObject(y), A), l(jSONObject), m(jSONObject.optJSONObject(y), B), m(jSONObject.optJSONObject(y), C), m(jSONObject.optJSONObject(y), D));
        I.put(str, c2379y);
        return c2379y;
    }

    public final Map<String, Map<String, C2379y.b>> k(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                C2379y.b.a aVar = C2379y.b.e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                C6562gT0.o(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C2379y.b a2 = aVar.a(optJSONObject);
                if (a2 != null) {
                    String a3 = a2.a();
                    Map map = (Map) hashMap.get(a3);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a3, map);
                    }
                    map.put(a2.c(), a2);
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashMap;
    }

    public final Map<String, Boolean> l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull(E)) {
            try {
                hashMap.put(E, Boolean.valueOf(jSONObject.getBoolean(E)));
            } catch (JSONException e2) {
                l0 l0Var = l0.a;
                l0.l0(l0.b, e2);
            }
        }
        if (!jSONObject.isNull(F)) {
            try {
                hashMap.put(F, Boolean.valueOf(jSONObject.getBoolean(F)));
            } catch (JSONException e3) {
                l0 l0Var2 = l0.a;
                l0.l0(l0.b, e3);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public final JSONArray m(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public final synchronized void n() {
        a aVar = J.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            com.facebook.M m2 = com.facebook.M.a;
            final C2379y c2379y = I.get(com.facebook.M.o());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = K;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        final b poll = concurrentLinkedQueue.poll();
                        handler.post(new Runnable() { // from class: com.facebook.internal.A
                            @Override // java.lang.Runnable
                            public final void run() {
                                C.o(C.b.this);
                            }
                        });
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = K;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        final b poll2 = concurrentLinkedQueue2.poll();
                        handler.post(new Runnable() { // from class: com.facebook.internal.B
                            @Override // java.lang.Runnable
                            public final void run() {
                                C.p(C.b.this, c2379y);
                            }
                        });
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
