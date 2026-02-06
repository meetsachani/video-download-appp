package com.facebook.internal;

import com.facebook.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.C6670gv2;
import o.C8926q81;
import o.C9516sY;
import o.C9545sf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2372q {
    @NotNull
    public static final a g = new a(null);
    public static final int h = 2;
    public static final int i = 4;
    public static final int j = 9;
    public static final int k = 17;
    public static final int l = 102;
    public static final int m = 190;
    public static final int n = 412;

    /* renamed from: o  reason: collision with root package name */
    public static final int f116o = 341;
    public static final int p = 458;
    public static final int q = 493;
    @NotNull
    public static final String r = "recovery_message";
    @NotNull
    public static final String s = "name";
    @NotNull
    public static final String t = "other";
    @NotNull
    public static final String u = "transient";
    @NotNull
    public static final String v = "login_recoverable";
    @Nullable
    public static C2372q w;
    @Nullable
    public final Map<Integer, Set<Integer>> a;
    @Nullable
    public final Map<Integer, Set<Integer>> b;
    @Nullable
    public final Map<Integer, Set<Integer>> c;
    @Nullable
    public final String d;
    @Nullable
    public final String e;
    @Nullable
    public final String f;

    /* renamed from: com.facebook.internal.q$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public static /* synthetic */ void c() {
        }

        @InterfaceC9511sW0
        @Nullable
        public final C2372q a(@Nullable JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        if (C9545sf2.c2(optString, "other", true)) {
                            str4 = optJSONObject.optString(C2372q.r, null);
                            map4 = e(optJSONObject);
                        } else if (C9545sf2.c2(optString, C2372q.u, true)) {
                            str5 = optJSONObject.optString(C2372q.r, null);
                            map5 = e(optJSONObject);
                        } else if (C9545sf2.c2(optString, C2372q.v, true)) {
                            str6 = optJSONObject.optString(C2372q.r, null);
                            map6 = e(optJSONObject);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new C2372q(map, map2, map3, str, str2, str3);
        }

        @NotNull
        public final synchronized C2372q b() {
            C2372q c2372q;
            try {
                if (C2372q.w == null) {
                    C2372q.w = d();
                }
                c2372q = C2372q.w;
                if (c2372q == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th) {
                throw th;
            }
            return c2372q;
        }

        public final C2372q d() {
            return new C2372q(null, C8926q81.M(C6670gv2.a(2, null), C6670gv2.a(4, null), C6670gv2.a(9, null), C6670gv2.a(17, null), C6670gv2.a(Integer.valueOf((int) C2372q.f116o), null)), C8926q81.M(C6670gv2.a(102, null), C6670gv2.a(Integer.valueOf((int) C2372q.m), null), C6670gv2.a(Integer.valueOf((int) C2372q.n), null)), null, null, null);
        }

        public final Map<Integer, Set<Integer>> e(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.j0);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    int optInt2 = optJSONArray2.optInt(i3);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i4 >= length2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        } else {
                            hashSet = null;
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return hashMap;
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.internal.q$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C.a.valuesCustom().length];
            iArr[C.a.OTHER.ordinal()] = 1;
            iArr[C.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[C.a.TRANSIENT.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2372q(@Nullable Map<Integer, ? extends Set<Integer>> map, @Nullable Map<Integer, ? extends Set<Integer>> map2, @Nullable Map<Integer, ? extends Set<Integer>> map3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C2372q d(@Nullable JSONArray jSONArray) {
        return g.a(jSONArray);
    }

    @NotNull
    public static final synchronized C2372q e() {
        C2372q b2;
        synchronized (C2372q.class) {
            b2 = g.b();
        }
        return b2;
    }

    @NotNull
    public final C.a c(int i2, int i3, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return C.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.a;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = this.a.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return C.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = this.c.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return C.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.b;
        if (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = this.b.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
            return C.a.TRANSIENT;
        }
        return C.a.OTHER;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> f() {
        return this.c;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> g() {
        return this.a;
    }

    @Nullable
    public final String h(@Nullable C.a aVar) {
        int i2;
        if (aVar == null) {
            i2 = -1;
        } else {
            i2 = b.a[aVar.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return this.e;
            }
            return this.f;
        }
        return this.d;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> i() {
        return this.b;
    }
}
