package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o.B22;
import o.C10219vQ1;
import o.C6562gT0;
import o.C7591kj1;
import o.HT1;
import o.InterfaceC9511sW0;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class Q {
    @NotNull
    public static final String c = "com.facebook.appevents.UserDataStore.userData";
    @NotNull
    public static final String d = "com.facebook.appevents.UserDataStore.internalUserData";
    public static SharedPreferences e = null;
    public static final int g = 5;
    @NotNull
    public static final String h = ",";
    @NotNull
    public static final String k = "em";
    @NotNull
    public static final String l = "fn";
    @NotNull
    public static final String m = "ln";
    @NotNull
    public static final String n = "ph";
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final String f74o = "db";
    @NotNull
    public static final String p = "ge";
    @NotNull
    public static final String q = "ct";
    @NotNull
    public static final String r = "st";
    @NotNull
    public static final String s = "zp";
    @NotNull
    public static final String t = "country";
    @NotNull
    public static final Q a = new Q();
    public static final String b = Q.class.getSimpleName();
    @NotNull
    public static final AtomicBoolean f = new AtomicBoolean(false);
    @NotNull
    public static final ConcurrentHashMap<String, String> i = new ConcurrentHashMap<>();
    @NotNull
    public static final ConcurrentHashMap<String, String> j = new ConcurrentHashMap<>();

    @InterfaceC9511sW0
    public static final void d() {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            K.b.e().execute(new Runnable() { // from class: com.facebook.appevents.P
                @Override // java.lang.Runnable
                public final void run() {
                    Q.e();
                }
            });
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    public static final void e() {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            if (!f.get()) {
                Log.w(b, "initStore should have been called before calling setUserData");
                a.i();
            }
            i.clear();
            SharedPreferences sharedPreferences = e;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(c, null).apply();
            } else {
                C6562gT0.S("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String f() {
        if (SQ.e(Q.class)) {
            return null;
        }
        try {
            if (!f.get()) {
                a.i();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(i);
            hashMap.putAll(a.g());
            l0 l0Var = l0.a;
            return l0.o0(hashMap);
        } catch (Throwable th) {
            SQ.c(th, Q.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String h() {
        if (SQ.e(Q.class)) {
            return null;
        }
        try {
            if (!f.get()) {
                Log.w(b, "initStore should have been called before calling setUserID");
                a.i();
            }
            l0 l0Var = l0.a;
            return l0.o0(i);
        } catch (Throwable th) {
            SQ.c(th, Q.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final void j() {
        if (!SQ.e(Q.class)) {
            try {
                if (f.get()) {
                    return;
                }
                a.i();
            } catch (Throwable th) {
                SQ.c(th, Q.class);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
        r4 = new java.lang.String[0];
     */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(@NotNull Map<String, String> map) {
        List<String> r2;
        int i2;
        boolean z;
        if (!SQ.e(Q.class)) {
            try {
                C6562gT0.p(map, "ud");
                if (!f.get()) {
                    a.i();
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    l0 l0Var = l0.a;
                    Q q2 = a;
                    int i3 = 1;
                    int length = value.length() - 1;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 <= length) {
                        if (!z2) {
                            i2 = i4;
                        } else {
                            i2 = length;
                        }
                        if (C6562gT0.t(value.charAt(i2), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i4++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String R0 = l0.R0(q2.l(key, value.subSequence(i4, length + 1).toString()));
                    ConcurrentHashMap<String, String> concurrentHashMap = j;
                    if (concurrentHashMap.containsKey(key)) {
                        String str = concurrentHashMap.get(key);
                        String[] strArr = null;
                        if (str != null && (r2 = new C10219vQ1(",").r(str, 0)) != null) {
                            Object[] array = r2.toArray(new String[0]);
                            if (array != null) {
                                strArr = (String[]) array;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                        Set q3 = B22.q(Arrays.copyOf(strArr, strArr.length));
                        if (q3.contains(R0)) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (strArr.length == 0) {
                            sb.append(R0);
                        } else if (strArr.length < 5) {
                            sb.append(str);
                            sb.append(",");
                            sb.append(R0);
                        } else {
                            while (true) {
                                int i5 = i3 + 1;
                                sb.append(strArr[i3]);
                                sb.append(",");
                                if (i5 >= 5) {
                                    break;
                                }
                                i3 = i5;
                            }
                            sb.append(R0);
                            q3.remove(strArr[0]);
                        }
                        j.put(key, sb.toString());
                    } else {
                        concurrentHashMap.put(key, R0);
                    }
                }
                Q q4 = a;
                l0 l0Var2 = l0.a;
                q4.r(d, l0.o0(j));
            } catch (Throwable th) {
                SQ.c(th, Q.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void n(@Nullable final Bundle bundle) {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            K.b.e().execute(new Runnable() { // from class: com.facebook.appevents.N
                @Override // java.lang.Runnable
                public final void run() {
                    Q.p(bundle);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    @InterfaceC9511sW0
    public static final void o(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString(k, str);
            }
            if (str2 != null) {
                bundle.putString(l, str2);
            }
            if (str3 != null) {
                bundle.putString(m, str3);
            }
            if (str4 != null) {
                bundle.putString(n, str4);
            }
            if (str5 != null) {
                bundle.putString(f74o, str5);
            }
            if (str6 != null) {
                bundle.putString(p, str6);
            }
            if (str7 != null) {
                bundle.putString(q, str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString(s, str9);
            }
            if (str10 != null) {
                bundle.putString("country", str10);
            }
            n(bundle);
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    public static final void p(Bundle bundle) {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            if (!f.get()) {
                Log.w(b, "initStore should have been called before calling setUserData");
                a.i();
            }
            Q q2 = a;
            q2.q(bundle);
            l0 l0Var = l0.a;
            q2.r(c, l0.o0(i));
            q2.r(d, l0.o0(j));
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    public static final void s(String str, String str2) {
        if (SQ.e(Q.class)) {
            return;
        }
        try {
            C6562gT0.p(str, "$key");
            C6562gT0.p(str2, "$value");
            if (!f.get()) {
                a.i();
            }
            SharedPreferences sharedPreferences = e;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).apply();
            } else {
                C6562gT0.S("sharedPreferences");
                throw null;
            }
        } catch (Throwable th) {
            SQ.c(th, Q.class);
        }
    }

    public final Map<String, String> g() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b2 = C7591kj1.d.b();
            for (String str : j.keySet()) {
                if (b2.contains(str)) {
                    hashMap.put(str, j.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final synchronized void i() {
        if (SQ.e(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = f;
        if (atomicBoolean.get()) {
            return;
        }
        com.facebook.M m2 = com.facebook.M.a;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n());
        C6562gT0.o(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        e = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            String string = defaultSharedPreferences.getString(c, "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = e;
            if (sharedPreferences != null) {
                String string2 = sharedPreferences.getString(d, "");
                if (string2 == null) {
                    string2 = "";
                }
                ConcurrentHashMap<String, String> concurrentHashMap = i;
                l0 l0Var = l0.a;
                concurrentHashMap.putAll(l0.k0(string));
                j.putAll(l0.k0(string2));
                atomicBoolean.set(true);
                return;
            }
            C6562gT0.S("sharedPreferences");
            throw null;
        }
        C6562gT0.S("sharedPreferences");
        throw null;
    }

    public final boolean k(String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            return new C10219vQ1("[A-Fa-f0-9]{64}").m(str);
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final String l(String str, String str2) {
        String str3;
        int i2;
        boolean z;
        if (SQ.e(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (C6562gT0.t(str2.charAt(i2), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i3, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C6562gT0.g(k, str)) {
                    if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        Log.e(b, "Setting email failure: this is not a valid email address");
                        return "";
                    }
                } else if (C6562gT0.g(n, str)) {
                    return new C10219vQ1("[^0-9]").o(lowerCase, "");
                } else {
                    if (C6562gT0.g(p, str)) {
                        if (lowerCase.length() <= 0) {
                            str3 = "";
                        } else if (lowerCase != null) {
                            str3 = lowerCase.substring(0, 1);
                            C6562gT0.o(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        if (!C6562gT0.g("f", str3) && !C6562gT0.g("m", str3)) {
                            Log.e(b, "Setting gender failure: the supported value for gender is f or m");
                            return "";
                        }
                        return str3;
                    }
                }
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void q(Bundle bundle) {
        if (!SQ.e(this) && bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (k(obj2)) {
                            ConcurrentHashMap<String, String> concurrentHashMap = i;
                            if (obj2 != null) {
                                String lowerCase = obj2.toLowerCase();
                                C6562gT0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
                                concurrentHashMap.put(str, lowerCase);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            l0 l0Var = l0.a;
                            C6562gT0.o(str, "key");
                            String R0 = l0.R0(l(str, obj2));
                            if (R0 != null) {
                                i.put(str, R0);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final void r(final String str, final String str2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.M m2 = com.facebook.M.a;
            com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.appevents.O
                @Override // java.lang.Runnable
                public final void run() {
                    Q.s(str, str2);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
