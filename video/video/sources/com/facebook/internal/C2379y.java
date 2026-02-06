package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import o.C10662xF;
import o.C10763xf2;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2379y {
    @NotNull
    public static final a z = new a(null);
    public final boolean a;
    @NotNull
    public final String b;
    public final boolean c;
    public final int d;
    @NotNull
    public final EnumSet<d0> e;
    @NotNull
    public final Map<String, Map<String, b>> f;
    public final boolean g;
    @NotNull
    public final C2372q h;
    @NotNull
    public final String i;
    @NotNull
    public final String j;
    public final boolean k;
    public final boolean l;
    @Nullable
    public final JSONArray m;
    @NotNull
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f118o;
    public final boolean p;
    @Nullable
    public final String q;
    @Nullable
    public final String r;
    @Nullable
    public final String s;
    @Nullable
    public final JSONArray t;
    @Nullable
    public final JSONArray u;
    @Nullable
    public final Map<String, Boolean> v;
    @Nullable
    public final JSONArray w;
    @Nullable
    public final JSONArray x;
    @Nullable
    public final JSONArray y;

    /* renamed from: com.facebook.internal.y$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @Nullable
        public final b a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Map<String, b> map;
            C6562gT0.p(str, "applicationId");
            C6562gT0.p(str2, "actionName");
            C6562gT0.p(str3, "featureName");
            if (str2.length() == 0 || str3.length() == 0) {
                return null;
            }
            C c = C.a;
            C2379y f = C.f(str);
            if (f == null) {
                map = null;
            } else {
                map = f.d().get(str2);
            }
            if (map == null) {
                return null;
            }
            return map.get(str3);
        }

        public a() {
        }
    }

    /* renamed from: com.facebook.internal.y$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NotNull
        public static final a e = new a(null);
        @NotNull
        public static final String f = "|";
        @NotNull
        public static final String g = "name";
        @NotNull
        public static final String h = "versions";
        @NotNull
        public static final String i = "url";
        @NotNull
        public final String a;
        @NotNull
        public final String b;
        @Nullable
        public final Uri c;
        @Nullable
        public final int[] d;

        /* renamed from: com.facebook.internal.y$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            @Nullable
            public final b a(@NotNull JSONObject jSONObject) {
                C6562gT0.p(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString("name");
                l0 l0Var = l0.a;
                Uri uri = null;
                if (l0.f0(optString)) {
                    return null;
                }
                C6562gT0.o(optString, "dialogNameWithFeature");
                List o5 = C10763xf2.o5(optString, new String[]{"|"}, false, 0, 6, null);
                if (o5.size() != 2) {
                    return null;
                }
                String str = (String) C10662xF.E2(o5);
                String str2 = (String) C10662xF.s3(o5);
                if (l0.f0(str) || l0.f0(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                if (!l0.f0(optString2)) {
                    uri = Uri.parse(optString2);
                }
                return new b(str, str2, uri, b(jSONObject.optJSONArray(b.h)), null);
            }

            public final int[] b(JSONArray jSONArray) {
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    int[] iArr = new int[length];
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            int i3 = -1;
                            int optInt = jSONArray.optInt(i, -1);
                            if (optInt == -1) {
                                String optString = jSONArray.optString(i);
                                l0 l0Var = l0.a;
                                if (!l0.f0(optString)) {
                                    try {
                                        C6562gT0.o(optString, "versionString");
                                        i3 = Integer.parseInt(optString);
                                    } catch (NumberFormatException e) {
                                        l0 l0Var2 = l0.a;
                                        l0.l0(l0.b, e);
                                    }
                                    optInt = i3;
                                }
                            }
                            iArr[i] = optInt;
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    return iArr;
                }
                return null;
            }

            public a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, C9516sY c9516sY) {
            this(str, str2, uri, iArr);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @Nullable
        public final Uri b() {
            return this.c;
        }

        @NotNull
        public final String c() {
            return this.b;
        }

        @Nullable
        public final int[] d() {
            return this.d;
        }

        public b(String str, String str2, Uri uri, int[] iArr) {
            this.a = str;
            this.b = str2;
            this.c = uri;
            this.d = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2379y(boolean z2, @NotNull String str, boolean z3, int i, @NotNull EnumSet<d0> enumSet, @NotNull Map<String, ? extends Map<String, b>> map, boolean z4, @NotNull C2372q c2372q, @NotNull String str2, @NotNull String str3, boolean z5, boolean z6, @Nullable JSONArray jSONArray, @NotNull String str4, boolean z7, boolean z8, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable Map<String, Boolean> map2, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5, @Nullable JSONArray jSONArray6) {
        C6562gT0.p(str, "nuxContent");
        C6562gT0.p(enumSet, "smartLoginOptions");
        C6562gT0.p(map, "dialogConfigurations");
        C6562gT0.p(c2372q, "errorClassification");
        C6562gT0.p(str2, "smartLoginBookmarkIconURL");
        C6562gT0.p(str3, "smartLoginMenuIconURL");
        C6562gT0.p(str4, "sdkUpdateMessage");
        this.a = z2;
        this.b = str;
        this.c = z3;
        this.d = i;
        this.e = enumSet;
        this.f = map;
        this.g = z4;
        this.h = c2372q;
        this.i = str2;
        this.j = str3;
        this.k = z5;
        this.l = z6;
        this.m = jSONArray;
        this.n = str4;
        this.f118o = z7;
        this.p = z8;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = jSONArray2;
        this.u = jSONArray3;
        this.v = map2;
        this.w = jSONArray4;
        this.x = jSONArray5;
        this.y = jSONArray6;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final b e(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return z.a(str, str2, str3);
    }

    public final boolean a() {
        return this.g;
    }

    @Nullable
    public final JSONArray b() {
        return this.w;
    }

    public final boolean c() {
        return this.l;
    }

    @NotNull
    public final Map<String, Map<String, b>> d() {
        return this.f;
    }

    @NotNull
    public final C2372q f() {
        return this.h;
    }

    @Nullable
    public final JSONArray g() {
        return this.m;
    }

    public final boolean h() {
        return this.k;
    }

    @Nullable
    public final JSONArray i() {
        return this.u;
    }

    @Nullable
    public final Map<String, Boolean> j() {
        return this.v;
    }

    public final boolean k() {
        return this.p;
    }

    @NotNull
    public final String l() {
        return this.b;
    }

    public final boolean m() {
        return this.c;
    }

    @Nullable
    public final JSONArray n() {
        return this.t;
    }

    @Nullable
    public final String o() {
        return this.q;
    }

    @Nullable
    public final JSONArray p() {
        return this.x;
    }

    @Nullable
    public final String q() {
        return this.s;
    }

    @NotNull
    public final String r() {
        return this.n;
    }

    @Nullable
    public final JSONArray s() {
        return this.y;
    }

    public final int t() {
        return this.d;
    }

    @NotNull
    public final String u() {
        return this.i;
    }

    @NotNull
    public final String v() {
        return this.j;
    }

    @NotNull
    public final EnumSet<d0> w() {
        return this.e;
    }

    @Nullable
    public final String x() {
        return this.r;
    }

    public final boolean y() {
        return this.f118o;
    }

    public final boolean z() {
        return this.a;
    }
}
