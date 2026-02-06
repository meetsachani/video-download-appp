package com.facebook;

import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.C0376a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o.C3858Oo2;
import o.C6562gT0;
import o.C8319ne2;
import o.C8466oF;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class Y {
    @NotNull
    public static final a i = new a(null);
    @Nullable
    public static final String j = Y.class.getCanonicalName();
    @NotNull
    public static final String k = "FACEBOOK_NON_JSON_RESULT";
    @NotNull
    public static final String l = "success";
    @NotNull
    public static final String m = "code";
    @NotNull
    public static final String n = "body";
    @NotNull

    /* renamed from: o */
    public static final String f72o = "Response";
    @NotNull
    public final S a;
    @Nullable
    public final HttpURLConnection b;
    @Nullable
    public final String c;
    @Nullable
    public final JSONObject d;
    @Nullable
    public final JSONArray e;
    @Nullable
    public final C f;
    @Nullable
    public final JSONObject g;
    @Nullable
    public final JSONArray h;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> a(@NotNull List<S> list, @Nullable HttpURLConnection httpURLConnection, @Nullable C2416z c2416z) {
            C6562gT0.p(list, "requests");
            List<S> list2 = list;
            ArrayList arrayList = new ArrayList(C8466oF.b0(list2, 10));
            for (S s : list2) {
                arrayList.add(new Y(s, httpURLConnection, new C(httpURLConnection, c2416z)));
            }
            return arrayList;
        }

        public final Y b(S s, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            Boolean bool = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                C a = C.j1.a(jSONObject, obj2, httpURLConnection);
                if (a != null) {
                    Log.e(Y.j, a.toString());
                    if (a.g() == 190) {
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        if (com.facebook.internal.l0.b0(s.y())) {
                            if (a.v() != 493) {
                                C0376a.g1.p(null);
                            } else {
                                C0376a.d dVar = C0376a.g1;
                                C0376a i = dVar.i();
                                if (i != null) {
                                    bool = Boolean.valueOf(i.C());
                                }
                                if (C6562gT0.g(bool, Boolean.FALSE)) {
                                    dVar.h();
                                }
                            }
                        }
                    }
                    return new Y(s, httpURLConnection, a);
                }
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                Object P = com.facebook.internal.l0.P(jSONObject, "body", Y.k);
                if (P instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) P;
                    return new Y(s, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (P instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) P;
                    return new Y(s, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    obj = JSONObject.NULL;
                    C6562gT0.o(obj, "NULL");
                }
            }
            if (obj == JSONObject.NULL) {
                return new Y(s, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new C2416z(C6562gT0.C("Got unexpected object type in response, class: ", obj.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<Y> c(HttpURLConnection httpURLConnection, List<S> list, Object obj) throws C2416z, JSONException {
            JSONArray jSONArray;
            int responseCode;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            int i = 0;
            if (size == 1) {
                S s = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    if (httpURLConnection == null) {
                        responseCode = 200;
                    } else {
                        responseCode = httpURLConnection.getResponseCode();
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    jSONArray = jSONArray2;
                } catch (IOException e) {
                    arrayList.add(new Y(s, httpURLConnection, new C(httpURLConnection, e)));
                } catch (JSONException e2) {
                    arrayList.add(new Y(s, httpURLConnection, new C(httpURLConnection, e2)));
                }
                if (jSONArray instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) jSONArray;
                    if (jSONArray3.length() == size) {
                        int length = jSONArray3.length();
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                S s2 = list.get(i);
                                try {
                                    Object obj2 = ((JSONArray) jSONArray).get(i);
                                    C6562gT0.o(obj2, IconCompat.A);
                                    arrayList.add(b(s2, httpURLConnection, obj2, obj));
                                } catch (C2416z e3) {
                                    arrayList.add(new Y(s2, httpURLConnection, new C(httpURLConnection, e3)));
                                } catch (JSONException e4) {
                                    arrayList.add(new Y(s2, httpURLConnection, new C(httpURLConnection, e4)));
                                }
                                if (i2 >= length) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return arrayList;
                    }
                }
                throw new C2416z("Unexpected number of results");
            }
            jSONArray = obj;
            if (jSONArray instanceof JSONArray) {
            }
            throw new C2416z("Unexpected number of results");
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> d(@Nullable InputStream inputStream, @Nullable HttpURLConnection httpURLConnection, @NotNull X x) throws C2416z, JSONException, IOException {
            C6562gT0.p(x, "requests");
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            String x0 = com.facebook.internal.l0.x0(inputStream);
            com.facebook.internal.V.e.e(b0.INCLUDE_RAW_RESPONSES, Y.f72o, "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(x0.length()), x0);
            return e(x0, httpURLConnection, x);
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> e(@NotNull String str, @Nullable HttpURLConnection httpURLConnection, @NotNull X x) throws C2416z, JSONException, IOException {
            C6562gT0.p(str, "responseString");
            C6562gT0.p(x, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            C6562gT0.o(nextValue, "resultObject");
            List<Y> c = c(httpURLConnection, x, nextValue);
            com.facebook.internal.V.e.e(b0.REQUESTS, Y.f72o, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", x.D(), Integer.valueOf(str.length()), c);
            return c;
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> f(@NotNull HttpURLConnection httpURLConnection, @NotNull X x) {
            List<Y> a;
            InputStream inputStream;
            C6562gT0.p(httpURLConnection, "connection");
            C6562gT0.p(x, "requests");
            try {
                try {
                    try {
                        M m = M.a;
                        if (M.M()) {
                            if (httpURLConnection.getResponseCode() >= 400) {
                                inputStream = httpURLConnection.getErrorStream();
                            } else {
                                inputStream = httpURLConnection.getInputStream();
                            }
                            List<Y> d = d(inputStream, httpURLConnection, x);
                            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                            com.facebook.internal.l0.j(inputStream);
                            return d;
                        }
                        Log.e(Y.j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new C2416z("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    } catch (C2416z e) {
                        com.facebook.internal.V.e.e(b0.REQUESTS, Y.f72o, "Response <Error>: %s", e);
                        a = a(x, httpURLConnection, e);
                        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                        com.facebook.internal.l0.j(null);
                        return a;
                    }
                } catch (Exception e2) {
                    com.facebook.internal.V.e.e(b0.REQUESTS, Y.f72o, "Response <Error>: %s", e2);
                    a = a(x, httpURLConnection, new C2416z(e2));
                    com.facebook.internal.l0 l0Var22 = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.j(null);
                    return a;
                }
            } catch (Throwable th) {
                com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                com.facebook.internal.l0.j(null);
                throw th;
            }
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        NEXT,
        PREVIOUS;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public Y(@NotNull S s, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable C c) {
        C6562gT0.p(s, "request");
        this.a = s;
        this.b = httpURLConnection;
        this.c = str;
        this.d = jSONObject;
        this.e = jSONArray;
        this.f = c;
        this.g = jSONObject;
        this.h = jSONArray;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> b(@NotNull List<S> list, @Nullable HttpURLConnection httpURLConnection, @Nullable C2416z c2416z) {
        return i.a(list, httpURLConnection, c2416z);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> c(@Nullable InputStream inputStream, @Nullable HttpURLConnection httpURLConnection, @NotNull X x) throws C2416z, JSONException, IOException {
        return i.d(inputStream, httpURLConnection, x);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> d(@NotNull String str, @Nullable HttpURLConnection httpURLConnection, @NotNull X x) throws C2416z, JSONException, IOException {
        return i.e(str, httpURLConnection, x);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> e(@NotNull HttpURLConnection httpURLConnection, @NotNull X x) {
        return i.f(httpURLConnection, x);
    }

    @Nullable
    public final HttpURLConnection f() {
        return this.b;
    }

    @Nullable
    public final C g() {
        return this.f;
    }

    @Nullable
    public final JSONArray h() {
        return this.e;
    }

    @Nullable
    public final JSONObject i() {
        return this.d;
    }

    @Nullable
    public final JSONArray j() {
        return this.h;
    }

    @Nullable
    public final JSONObject k() {
        return this.g;
    }

    @Nullable
    public final String l() {
        return this.c;
    }

    @NotNull
    public final S m() {
        return this.a;
    }

    @Nullable
    public final S n(@NotNull b bVar) {
        String str;
        JSONObject optJSONObject;
        C6562gT0.p(bVar, "direction");
        JSONObject jSONObject = this.d;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("paging")) != null) {
            if (bVar == b.NEXT) {
                str = optJSONObject.optString("next");
            } else {
                str = optJSONObject.optString("previous");
            }
        } else {
            str = null;
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (com.facebook.internal.l0.f0(str)) {
            return null;
        }
        if (str != null && C6562gT0.g(str, this.a.N())) {
            return null;
        }
        try {
            return new S(this.a.y(), new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        String str;
        int responseCode;
        try {
            C8319ne2 c8319ne2 = C8319ne2.a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.b;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            str = String.format(locale, C3858Oo2.d1, Arrays.copyOf(new Object[]{Integer.valueOf(responseCode)}, 1));
            C6562gT0.o(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.d + ", error: " + this.f + "}";
        C6562gT0.o(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(@NotNull S s, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @Nullable JSONObject jSONObject) {
        this(s, httpURLConnection, str, jSONObject, null, null);
        C6562gT0.p(s, "request");
        C6562gT0.p(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(@NotNull S s, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @NotNull JSONArray jSONArray) {
        this(s, httpURLConnection, str, null, jSONArray, null);
        C6562gT0.p(s, "request");
        C6562gT0.p(str, "rawResponse");
        C6562gT0.p(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(@NotNull S s, @Nullable HttpURLConnection httpURLConnection, @NotNull C c) {
        this(s, httpURLConnection, null, null, null, c);
        C6562gT0.p(s, "request");
        C6562gT0.p(c, "error");
    }
}
