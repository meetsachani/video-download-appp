package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.S;
import com.facebook.X;
import com.facebook.internal.C2358c;
import com.facebook.internal.V;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o.C10763xf2;
import o.C4128Rj1;
import o.C5445bv2;
import o.C6562gT0;
import o.C6566gU0;
import o.C7330jf;
import o.C8319ne2;
import o.C9516sY;
import o.C9545sf2;
import o.HB;
import o.InterfaceC5056aJ2;
import o.InterfaceC7058iW0;
import o.InterfaceC8289nW0;
import o.InterfaceC9511sW0;
import o.VI0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S {
    @NotNull
    public static final String A = "format";
    @NotNull
    public static final String B = "json";
    @NotNull
    public static final String C = "sdk";
    @NotNull
    public static final String D = "android";
    @NotNull
    public static final String E = "access_token";
    @NotNull
    public static final String F = "name";
    @NotNull
    public static final String G = "omit_response_on_success";
    @NotNull
    public static final String H = "depends_on";
    @NotNull
    public static final String I = "batch_app_id";
    @NotNull
    public static final String J = "relative_url";
    @NotNull
    public static final String K = "body";
    @NotNull
    public static final String L = "method";
    @NotNull
    public static final String M = "batch";
    @NotNull
    public static final String N = "file";
    @NotNull
    public static final String O = "attached_files";
    @NotNull
    public static final String P = "yyyy-MM-dd'T'HH:mm:ssZ";
    @NotNull
    public static final String Q = "debug";
    @NotNull
    public static final String R = "info";
    @NotNull
    public static final String S = "warning";
    @NotNull
    public static final String T = "__debug__";
    @NotNull
    public static final String U = "messages";
    @NotNull
    public static final String V = "message";
    @NotNull
    public static final String W = "type";
    @NotNull
    public static final String X = "link";
    @NotNull
    public static final String Y = "picture";
    @NotNull
    public static final String Z = "caption";
    @NotNull
    public static final String a0 = "fields";
    @NotNull
    public static final String b0;
    @Nullable
    public static String c0 = null;
    public static final Pattern d0;
    @Nullable
    public static volatile String e0 = null;

    /* renamed from: o  reason: collision with root package name */
    public static final int f71o = 50;
    @NotNull
    public static final String q = "/videos";
    @NotNull
    public static final String r = "me";
    @NotNull
    public static final String s = "me/friends";
    @NotNull
    public static final String t = "me/photos";
    @NotNull
    public static final String u = "search";
    @NotNull
    public static final String v = "FBAndroidSDK";
    @NotNull
    public static final String w = "User-Agent";
    @NotNull
    public static final String x = "Content-Type";
    @NotNull
    public static final String y = "Accept-Language";
    @NotNull
    public static final String z = "Content-Encoding";
    @Nullable
    public C0376a a;
    @Nullable
    public String b;
    @Nullable
    public JSONObject c;
    @Nullable
    public String d;
    @Nullable
    public String e;
    public boolean f;
    @NotNull
    public Bundle g;
    @Nullable
    public Object h;
    @Nullable
    public String i;
    @Nullable
    public b j;
    @Nullable
    public Z k;
    public boolean l;
    @Nullable
    public String m;
    @NotNull
    public static final c n = new c(null);
    @InterfaceC7058iW0
    public static final String p = S.class.getSimpleName();

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public final S a;
        @Nullable
        public final Object b;

        public a(@NotNull S s, @Nullable Object obj) {
            C6562gT0.p(s, "request");
            this.a = s;
            this.b = obj;
        }

        @NotNull
        public final S a() {
            return this.a;
        }

        @Nullable
        public final Object b() {
            return this.b;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@NotNull Y y);
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* loaded from: classes2.dex */
        public static final class a implements b {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            @Override // com.facebook.S.b
            public void a(@NotNull Y y) {
                JSONArray optJSONArray;
                C6562gT0.p(y, "response");
                if (this.a != null) {
                    JSONObject i = y.i();
                    if (i == null) {
                        optJSONArray = null;
                    } else {
                        optJSONArray = i.optJSONArray("data");
                    }
                    this.a.a(optJSONArray, y);
                }
            }
        }

        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public static final void J(e eVar, Y y) {
            C6562gT0.p(y, "response");
            if (eVar == null) {
                return;
            }
            eVar.a(y.i(), y);
        }

        public static final void M(d dVar, Y y) {
            JSONArray optJSONArray;
            C6562gT0.p(y, "response");
            if (dVar != null) {
                JSONObject i = y.i();
                if (i == null) {
                    optJSONArray = null;
                } else {
                    optJSONArray = i.optJSONArray("data");
                }
                dVar.a(optJSONArray, y);
            }
        }

        public static final void X(ArrayList arrayList, X x) {
            C6562gT0.p(arrayList, "$callbacks");
            C6562gT0.p(x, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                C6562gT0.o(obj, "pair.second");
                ((b) pair.first).a((Y) obj);
            }
            for (X.a aVar : x.B()) {
                aVar.a(x);
            }
        }

        @InterfaceC5056aJ2(otherwise = 2)
        public static /* synthetic */ void x() {
        }

        public final boolean A(X x) {
            Iterator<S> it = x.iterator();
            while (it.hasNext()) {
                S next = it.next();
                for (String str : next.K().keySet()) {
                    if (C(next.K().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean B(String str) {
            Matcher matcher = S.d0.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C6562gT0.o(str, "matcher.group(1)");
            }
            if (C9545sf2.J2(str, "me/", false, 2, null) || C9545sf2.J2(str, "/me/", false, 2, null)) {
                return true;
            }
            return false;
        }

        public final boolean C(Object obj) {
            if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof h)) {
                return false;
            }
            return true;
        }

        public final boolean D(Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
                return false;
            }
            return true;
        }

        @InterfaceC9511sW0
        @NotNull
        public final S E(@Nullable C0376a c0376a, @NotNull Context context, @Nullable b bVar) {
            C6562gT0.p(context, "context");
            return F(c0376a, context, null, bVar);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S F(@Nullable C0376a c0376a, @NotNull Context context, @Nullable String str, @Nullable b bVar) {
            String h;
            C6562gT0.p(context, "context");
            if (str == null && c0376a != null) {
                str = c0376a.h();
            }
            if (str == null) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                str = com.facebook.internal.l0.K(context);
            }
            if (str != null) {
                String C = C6562gT0.C(str, "/custom_audience_third_party_id");
                C2358c f = C2358c.f.f(context);
                Bundle bundle = new Bundle();
                if (c0376a == null) {
                    if (f != null) {
                        if (f.j() != null) {
                            h = f.j();
                        } else {
                            h = f.h();
                        }
                        if (h != null) {
                            bundle.putString("udid", h);
                        }
                    } else {
                        throw new C2416z("There is no access token and attribution identifiers could not be retrieved");
                    }
                }
                M m = M.a;
                if (M.E(context) || (f != null && f.l())) {
                    bundle.putString("limit_event_usage", "1");
                }
                return new S(c0376a, C, bundle, Z.GET, bVar, null, 32, null);
            }
            throw new C2416z("Facebook App ID cannot be determined");
        }

        @InterfaceC9511sW0
        @NotNull
        public final S G(@Nullable C0376a c0376a, @Nullable String str, @Nullable b bVar) {
            return new S(c0376a, str, null, Z.DELETE, bVar, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S H(@Nullable C0376a c0376a, @Nullable String str, @Nullable b bVar) {
            return new S(c0376a, str, null, null, bVar, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S I(@Nullable C0376a c0376a, @Nullable final e eVar) {
            return new S(c0376a, "me", null, null, new b() { // from class: com.facebook.U
                @Override // com.facebook.S.b
                public final void a(Y y) {
                    S.c.J(S.e.this, y);
                }
            }, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S K(@Nullable C0376a c0376a, @Nullable d dVar) {
            return new S(c0376a, S.s, null, null, new a(dVar), null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S L(@Nullable C0376a c0376a, @Nullable Location location, int i, int i2, @Nullable String str, @Nullable final d dVar) {
            if (location == null) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (com.facebook.internal.l0.f0(str)) {
                    throw new C2416z("Either location or searchText must be specified.");
                }
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i2);
            if (location != null) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString(C5445bv2.m0, format);
                bundle.putInt("distance", i);
            }
            com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
            if (!com.facebook.internal.l0.f0(str)) {
                bundle.putString(com.facebook.gamingservices.q.a, str);
            }
            return new S(c0376a, "search", bundle, Z.GET, new b() { // from class: com.facebook.T
                @Override // com.facebook.S.b
                public final void a(Y y) {
                    S.c.M(S.d.this, y);
                }
            }, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S N(@Nullable C0376a c0376a, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable b bVar) {
            S s = new S(c0376a, str, null, Z.POST, bVar, null, 32, null);
            s.o0(jSONObject);
            return s;
        }

        @InterfaceC9511sW0
        @NotNull
        public final S O(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle, @Nullable b bVar) {
            return new S(c0376a, str, bundle, Z.POST, bVar, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S P(@Nullable C0376a c0376a, @Nullable String str, @NotNull Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) {
            C6562gT0.p(bitmap, "image");
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", bitmap);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new S(c0376a, v(str), bundle2, Z.POST, bVar, null, 32, null);
        }

        @InterfaceC9511sW0
        @NotNull
        public final S Q(@Nullable C0376a c0376a, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException, C2416z {
            C6562gT0.p(uri, "photoUri");
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            if (com.facebook.internal.l0.d0(uri)) {
                return R(c0376a, str, new File(uri.getPath()), str2, bundle, bVar);
            }
            if (com.facebook.internal.l0.a0(uri)) {
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                bundle2.putParcelable("picture", uri);
                if (str2 != null && str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
                return new S(c0376a, v(str), bundle2, Z.POST, bVar, null, 32, null);
            }
            throw new C2416z("The photo Uri must be either a file:// or content:// Uri");
        }

        @InterfaceC9511sW0
        @NotNull
        public final S R(@Nullable C0376a c0376a, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException {
            C6562gT0.p(file, "file");
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", open);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new S(c0376a, v(str), bundle2, Z.POST, bVar, null, 32, null);
        }

        public final String S(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat(S.P, Locale.US).format((Date) obj);
                    C6562gT0.o(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void T(JSONObject jSONObject, String str, f fVar) {
            boolean z;
            Iterator<String> keys;
            boolean z2;
            if (B(str)) {
                int J3 = C10763xf2.J3(str, ":", 0, false, 6, null);
                int J32 = C10763xf2.J3(str, "?", 0, false, 6, null);
                if (J3 > 3 && (J32 == -1 || J3 < J32)) {
                    z = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (z && C9545sf2.c2(next, "image", true)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C6562gT0.o(next, "key");
                        C6562gT0.o(opt, "value");
                        U(next, opt, fVar, z2);
                    }
                }
            }
            z = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        public final void U(String str, Object obj, f fVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C8319ne2 c8319ne2 = C8319ne2.a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C6562gT0.o(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C6562gT0.o(opt, "jsonObject.opt(propertyName)");
                        U(format, opt, fVar, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    C6562gT0.o(optString, "jsonObject.optString(\"id\")");
                    U(str, optString, fVar, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C6562gT0.o(optString2, "jsonObject.optString(\"url\")");
                    U(str, optString2, fVar, z);
                } else if (jSONObject.has(com.facebook.internal.Z.H0)) {
                    String jSONObject2 = jSONObject.toString();
                    C6562gT0.o(jSONObject2, "jsonObject.toString()");
                    U(str, jSONObject2, fVar, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        C8319ne2 c8319ne22 = C8319ne2.a;
                        String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                        C6562gT0.o(format2, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i);
                        C6562gT0.o(opt2, "jsonArray.opt(i)");
                        U(format2, opt2, fVar, z);
                        if (i2 < length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat(S.P, Locale.US).format((Date) obj);
                    C6562gT0.o(format3, "iso8601DateFormat.format(date)");
                    fVar.a(str, format3);
                    return;
                }
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                String str2 = S.p;
                com.facebook.internal.l0.m0(str2, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
            } else {
                fVar.a(str, obj.toString());
            }
        }

        public final void V(X x, com.facebook.internal.V v, int i, URL url, OutputStream outputStream, boolean z) {
            i iVar = new i(outputStream, v, z);
            if (i == 1) {
                S s = x.get(0);
                Map<String, a> hashMap = new HashMap<>();
                for (String str : s.K().keySet()) {
                    Object obj = s.K().get(str);
                    if (C(obj)) {
                        C6562gT0.o(str, "key");
                        hashMap.put(str, new a(s, obj));
                    }
                }
                if (v != null) {
                    v.b("  Parameters:\n");
                }
                Z(s.K(), iVar, s);
                if (v != null) {
                    v.b("  Attachments:\n");
                }
                Y(hashMap, iVar);
                JSONObject G = s.G();
                if (G != null) {
                    String path = url.getPath();
                    C6562gT0.o(path, "url.path");
                    T(G, path, iVar);
                    return;
                }
                return;
            }
            String t = t(x);
            if (t.length() != 0) {
                iVar.a(S.I, t);
                Map<String, a> hashMap2 = new HashMap<>();
                a0(iVar, x, hashMap2);
                if (v != null) {
                    v.b("  Attachments:\n");
                }
                Y(hashMap2, iVar);
                return;
            }
            throw new C2416z("App ID was not specified at the request or Settings.");
        }

        @InterfaceC9511sW0
        public final void W(@NotNull final X x, @NotNull List<Y> list) {
            Boolean valueOf;
            C6562gT0.p(x, "requests");
            C6562gT0.p(list, "responses");
            int size = x.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    S s = x.get(i);
                    if (s.D() != null) {
                        arrayList.add(new Pair(s.D(), list.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.c.X(arrayList, x);
                    }
                };
                Handler w = x.w();
                if (w == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(w.post(runnable));
                }
                if (valueOf == null) {
                    runnable.run();
                }
            }
        }

        public final void Y(Map<String, a> map, i iVar) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (S.n.C(entry.getValue().b())) {
                    iVar.j(entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }

        public final void Z(Bundle bundle, i iVar, S s) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (D(obj)) {
                    C6562gT0.o(str, "key");
                    iVar.j(str, obj, s);
                }
            }
        }

        public final void a0(i iVar, Collection<S> collection, Map<String, a> map) {
            JSONArray jSONArray = new JSONArray();
            for (S s : collection) {
                s.f0(jSONArray, map);
            }
            iVar.l(S.M, jSONArray, collection);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
        @InterfaceC9511sW0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b0(@NotNull X x, @NotNull HttpURLConnection httpURLConnection) throws IOException, JSONException {
            Z z;
            Throwable th;
            URL url;
            j0 j0Var;
            X x2;
            c cVar;
            C6562gT0.p(x, "requests");
            C6562gT0.p(httpURLConnection, "connection");
            com.facebook.internal.V v = new com.facebook.internal.V(b0.REQUESTS, "Request");
            int size = x.size();
            boolean A = A(x);
            OutputStream outputStream = null;
            if (size == 1) {
                z = x.get(0).J();
            } else {
                z = null;
            }
            if (z == null) {
                z = Z.POST;
            }
            httpURLConnection.setRequestMethod(z.name());
            c0(httpURLConnection, A);
            URL url2 = httpURLConnection.getURL();
            v.b("Request:\n");
            v.e("Id", x.D());
            C6562gT0.o(url2, "url");
            v.e("URL", url2);
            String requestMethod = httpURLConnection.getRequestMethod();
            C6562gT0.o(requestMethod, "connection.requestMethod");
            v.e("Method", requestMethod);
            String requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            C6562gT0.o(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            v.e("User-Agent", requestProperty);
            String requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            C6562gT0.o(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            v.e("Content-Type", requestProperty2);
            httpURLConnection.setConnectTimeout(x.H());
            httpURLConnection.setReadTimeout(x.H());
            if (z == Z.POST) {
                httpURLConnection.setDoOutput(true);
                try {
                    OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    if (A) {
                        try {
                            bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = bufferedOutputStream;
                            if (outputStream != null) {
                            }
                            throw th;
                        }
                    }
                    try {
                        if (z(x)) {
                            h0 h0Var = new h0(x.w());
                            V(x, null, size, url2, h0Var, A);
                            url = url2;
                            OutputStream outputStream2 = bufferedOutputStream;
                            try {
                                j0Var = new j0(outputStream2, x, h0Var.h(), h0Var.f());
                                A = A;
                                size = size;
                                cVar = this;
                                x2 = x;
                            } catch (Throwable th3) {
                                th = th3;
                                outputStream = outputStream2;
                                th = th;
                                if (outputStream != null) {
                                }
                                throw th;
                            }
                        } else {
                            url = url2;
                            j0Var = bufferedOutputStream;
                            x2 = x;
                            cVar = this;
                        }
                        try {
                            cVar.V(x2, v, size, url, j0Var, A);
                            j0Var.close();
                            v.h();
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream = j0Var;
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        outputStream = bufferedOutputStream;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                v.h();
            }
        }

        public final void c0(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", w());
        }

        @InterfaceC9511sW0
        public final void d0(@Nullable String str) {
            S.c0 = str;
        }

        @InterfaceC9511sW0
        @NotNull
        public final HttpURLConnection e0(@NotNull X x) {
            URL url;
            C6562gT0.p(x, "requests");
            h0(x);
            try {
                if (x.size() == 1) {
                    url = new URL(x.get(0).N());
                } else {
                    com.facebook.internal.c0 c0Var = com.facebook.internal.c0.a;
                    url = new URL(com.facebook.internal.c0.h());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = h(url);
                    b0(x, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.r(httpURLConnection);
                    throw new C2416z("could not construct request body", e);
                } catch (JSONException e2) {
                    com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.r(httpURLConnection);
                    throw new C2416z("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new C2416z("could not construct URL for request", e3);
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final HttpURLConnection f0(@NotNull Collection<S> collection) {
            C6562gT0.p(collection, "requests");
            com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
            com.facebook.internal.m0.q(collection, "requests");
            return e0(new X(collection));
        }

        @InterfaceC9511sW0
        @NotNull
        public final HttpURLConnection g0(@NotNull S... sArr) {
            C6562gT0.p(sArr, "requests");
            return f0(C7330jf.Uy(sArr));
        }

        public final HttpURLConnection h(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", y());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        @InterfaceC9511sW0
        public final void h0(@NotNull X x) {
            C6562gT0.p(x, "requests");
            Iterator<S> it = x.iterator();
            while (it.hasNext()) {
                S next = it.next();
                if (Z.GET == next.J()) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    if (com.facebook.internal.l0.f0(next.K().getString("fields"))) {
                        V.a aVar = com.facebook.internal.V.e;
                        b0 b0Var = b0.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String H = next.H();
                        if (H == null) {
                            H = "";
                        }
                        sb.append(H);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.b(b0Var, 5, "Request", sb.toString());
                    }
                }
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final Y i(@NotNull S s) {
            C6562gT0.p(s, "request");
            List<Y> l = l(s);
            if (l.size() == 1) {
                return l.get(0);
            }
            throw new C2416z("invalid state: expected a single response");
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> j(@NotNull X x) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<Y> list;
            C6562gT0.p(x, "requests");
            com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
            com.facebook.internal.m0.r(x, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = e0(x);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                com.facebook.internal.l0.r(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = p(httpURLConnection, x);
                } else {
                    List<Y> a2 = Y.i.a(x.F(), null, new C2416z(exc));
                    W(x, a2);
                    list = a2;
                }
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                com.facebook.internal.l0.r(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                com.facebook.internal.l0.r(httpURLConnection2);
                throw th;
            }
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> k(@NotNull Collection<S> collection) {
            C6562gT0.p(collection, "requests");
            return j(new X(collection));
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> l(@NotNull S... sArr) {
            C6562gT0.p(sArr, "requests");
            return k(C7330jf.Uy(sArr));
        }

        @InterfaceC9511sW0
        @NotNull
        public final W m(@NotNull X x) {
            C6562gT0.p(x, "requests");
            com.facebook.internal.m0 m0Var = com.facebook.internal.m0.a;
            com.facebook.internal.m0.r(x, "requests");
            W w = new W(x);
            M m = M.a;
            w.executeOnExecutor(M.y(), new Void[0]);
            return w;
        }

        @InterfaceC9511sW0
        @NotNull
        public final W n(@NotNull Collection<S> collection) {
            C6562gT0.p(collection, "requests");
            return m(new X(collection));
        }

        @InterfaceC9511sW0
        @NotNull
        public final W o(@NotNull S... sArr) {
            C6562gT0.p(sArr, "requests");
            return n(C7330jf.Uy(sArr));
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> p(@NotNull HttpURLConnection httpURLConnection, @NotNull X x) {
            C6562gT0.p(httpURLConnection, "connection");
            C6562gT0.p(x, "requests");
            List<Y> f = Y.i.f(httpURLConnection, x);
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            com.facebook.internal.l0.r(httpURLConnection);
            int size = x.size();
            if (size == f.size()) {
                W(x, f);
                C2338g.f.e().h();
                return f;
            }
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f.size()), Integer.valueOf(size)}, 2));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            throw new C2416z(format);
        }

        @InterfaceC9511sW0
        @NotNull
        public final List<Y> q(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<S> collection) {
            C6562gT0.p(httpURLConnection, "connection");
            C6562gT0.p(collection, "requests");
            return p(httpURLConnection, new X(collection));
        }

        @InterfaceC9511sW0
        @NotNull
        public final W r(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull X x) {
            C6562gT0.p(httpURLConnection, "connection");
            C6562gT0.p(x, "requests");
            W w = new W(httpURLConnection, x);
            x.Y(handler);
            M m = M.a;
            w.executeOnExecutor(M.y(), new Void[0]);
            return w;
        }

        @InterfaceC9511sW0
        @NotNull
        public final W s(@NotNull HttpURLConnection httpURLConnection, @NotNull X x) {
            C6562gT0.p(httpURLConnection, "connection");
            C6562gT0.p(x, "requests");
            return r(null, httpURLConnection, x);
        }

        public final String t(X x) {
            String r = x.r();
            if (r != null && !x.isEmpty()) {
                return r;
            }
            Iterator<S> it = x.iterator();
            while (it.hasNext()) {
                C0376a y = it.next().y();
                if (y != null) {
                    return y.h();
                }
            }
            String str = S.c0;
            if (str != null && str.length() > 0) {
                return str;
            }
            M m = M.a;
            return M.o();
        }

        @InterfaceC9511sW0
        @Nullable
        public final String u() {
            return S.c0;
        }

        public final String v(String str) {
            if (str == null) {
                return "me/photos";
            }
            return str;
        }

        public final String w() {
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{S.b0}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public final String y() {
            if (S.e0 == null) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{S.v, O.b}, 2));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                S.e0 = format;
                com.facebook.internal.S s = com.facebook.internal.S.a;
                String a2 = com.facebook.internal.S.a();
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                if (!com.facebook.internal.l0.f0(a2)) {
                    String format2 = String.format(Locale.ROOT, com.facebook.share.c.g, Arrays.copyOf(new Object[]{S.e0, a2}, 2));
                    C6562gT0.o(format2, "java.lang.String.format(locale, format, *args)");
                    S.e0 = format2;
                }
            }
            return S.e0;
        }

        public final boolean z(X x) {
            for (X.a aVar : x.B()) {
                if (aVar instanceof X.c) {
                    return true;
                }
            }
            Iterator<S> it = x.iterator();
            while (it.hasNext()) {
                if (it.next().D() instanceof g) {
                    return true;
                }
            }
            return false;
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(@Nullable JSONArray jSONArray, @Nullable Y y);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(@Nullable JSONObject jSONObject, @Nullable Y y);
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(@NotNull String str, @NotNull String str2);
    }

    /* loaded from: classes2.dex */
    public interface g extends b {
        void b(long j, long j2);
    }

    /* loaded from: classes2.dex */
    public static final class h<RESOURCE extends Parcelable> implements Parcelable {
        @Nullable
        public final String X;
        @Nullable
        public final RESOURCE Y;
        @NotNull
        public static final b Z = new b(null);
        @InterfaceC7058iW0
        @NotNull
        public static final Parcelable.Creator<h<?>> CREATOR = new a();

        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<h<?>> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public h<?> createFromParcel(@NotNull Parcel parcel) {
                C6562gT0.p(parcel, "source");
                return new h<>(parcel, (C9516sY) null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public h<?>[] newArray(int i) {
                return new h[i];
            }
        }

        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            public b() {
            }
        }

        public /* synthetic */ h(Parcel parcel, C9516sY c9516sY) {
            this(parcel);
        }

        @Nullable
        public final String a() {
            return this.X;
        }

        @Nullable
        public final RESOURCE b() {
            return this.Y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            C6562gT0.p(parcel, "out");
            parcel.writeString(this.X);
            parcel.writeParcelable(this.Y, i);
        }

        public h(RESOURCE resource, @Nullable String str) {
            this.X = str;
            this.Y = resource;
        }

        public h(Parcel parcel) {
            this.X = parcel.readString();
            M m = M.a;
            this.Y = (RESOURCE) parcel.readParcelable(M.n().getClassLoader());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements f {
        @NotNull
        public final OutputStream a;
        @Nullable
        public final com.facebook.internal.V b;
        public boolean c;
        public final boolean d;

        public i(@NotNull OutputStream outputStream, @Nullable com.facebook.internal.V v, boolean z) {
            C6562gT0.p(outputStream, "outputStream");
            this.a = outputStream;
            this.b = v;
            this.c = true;
            this.d = z;
        }

        @Override // com.facebook.S.f
        public void a(@NotNull String str, @NotNull String str2) {
            C6562gT0.p(str, "key");
            C6562gT0.p(str2, "value");
            f(str, null, null);
            i("%s", str2);
            k();
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            v.e(C6562gT0.C("    ", str), str2);
        }

        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void c(@NotNull String str, @NotNull Object... objArr) {
            C6562gT0.p(str, S.A);
            C6562gT0.p(objArr, "args");
            if (!this.d) {
                if (this.c) {
                    OutputStream outputStream = this.a;
                    Charset charset = HB.b;
                    byte[] bytes = "--".getBytes(charset);
                    C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.a;
                    String str2 = S.b0;
                    if (str2 != null) {
                        byte[] bytes2 = str2.getBytes(charset);
                        C6562gT0.o(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.a;
                        byte[] bytes3 = VI0.D.getBytes(charset);
                        C6562gT0.o(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.a;
                C8319ne2 c8319ne2 = C8319ne2.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                byte[] bytes4 = format.getBytes(HB.b);
                C6562gT0.o(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.a;
            C8319ne2 c8319ne22 = C8319ne2.a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            C6562gT0.o(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            C6562gT0.o(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(HB.b);
            C6562gT0.o(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(@NotNull String str, @NotNull Bitmap bitmap) {
            C6562gT0.p(str, "key");
            C6562gT0.p(bitmap, "bitmap");
            f(str, str, C4128Rj1.P0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            i("", new Object[0]);
            k();
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            v.e(C6562gT0.C("    ", str), "<Image>");
        }

        public final void e(@NotNull String str, @NotNull byte[] bArr) {
            C6562gT0.p(str, "key");
            C6562gT0.p(bArr, "bytes");
            f(str, str, "content/unknown");
            this.a.write(bArr);
            i("", new Object[0]);
            k();
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            String C = C6562gT0.C("    ", str);
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            v.e(C, format);
        }

        public final void f(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            if (!this.d) {
                c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    c("; filename=\"%s\"", str2);
                }
                i("", new Object[0]);
                if (str3 != null) {
                    i("%s: %s", "Content-Type", str3);
                }
                i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.a;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            byte[] bytes = format.getBytes(HB.b);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void g(@NotNull String str, @NotNull Uri uri, @Nullable String str2) {
            int q;
            C6562gT0.p(str, "key");
            C6562gT0.p(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            if (this.a instanceof h0) {
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                ((h0) this.a).d(com.facebook.internal.l0.A(uri));
                q = 0;
            } else {
                M m = M.a;
                InputStream openInputStream = M.n().getContentResolver().openInputStream(uri);
                com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                q = com.facebook.internal.l0.q(openInputStream, this.a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            String C = C6562gT0.C("    ", str);
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(q)}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            v.e(C, format);
        }

        public final void h(@NotNull String str, @NotNull ParcelFileDescriptor parcelFileDescriptor, @Nullable String str2) {
            int q;
            C6562gT0.p(str, "key");
            C6562gT0.p(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            f(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof h0) {
                ((h0) outputStream).d(parcelFileDescriptor.getStatSize());
                q = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                q = com.facebook.internal.l0.q(autoCloseInputStream, this.a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            String C = C6562gT0.C("    ", str);
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(q)}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            v.e(C, format);
        }

        public final void i(@NotNull String str, @NotNull Object... objArr) {
            C6562gT0.p(str, S.A);
            C6562gT0.p(objArr, "args");
            c(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.d) {
                c(VI0.D, new Object[0]);
            }
        }

        public final void j(@NotNull String str, @Nullable Object obj, @Nullable S s) {
            C6562gT0.p(str, "key");
            OutputStream outputStream = this.a;
            if (outputStream instanceof l0) {
                ((l0) outputStream).a(s);
            }
            c cVar = S.n;
            if (cVar.D(obj)) {
                a(str, cVar.S(obj));
            } else if (obj instanceof Bitmap) {
                d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                g(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                h(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof h) {
                h hVar = (h) obj;
                Parcelable b = hVar.b();
                String a = hVar.a();
                if (b instanceof ParcelFileDescriptor) {
                    h(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    g(str, (Uri) b, a);
                } else {
                    throw b();
                }
            } else {
                throw b();
            }
        }

        public final void k() {
            if (!this.d) {
                i("--%s", S.b0);
                return;
            }
            OutputStream outputStream = this.a;
            byte[] bytes = "&".getBytes(HB.b);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(@NotNull String str, @NotNull JSONArray jSONArray, @NotNull Collection<S> collection) {
            C6562gT0.p(str, "key");
            C6562gT0.p(jSONArray, "requestJsonArray");
            C6562gT0.p(collection, "requests");
            OutputStream outputStream = this.a;
            if (!(outputStream instanceof l0)) {
                String jSONArray2 = jSONArray.toString();
                C6562gT0.o(jSONArray2, "requestJsonArray.toString()");
                a(str, jSONArray2);
                return;
            }
            l0 l0Var = (l0) outputStream;
            f(str, null, null);
            c(C6566gU0.f, new Object[0]);
            int i = 0;
            for (S s : collection) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                l0Var.a(s);
                if (i > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i = i2;
            }
            c(C6566gU0.g, new Object[0]);
            com.facebook.internal.V v = this.b;
            if (v == null) {
                return;
            }
            String C = C6562gT0.C("    ", str);
            String jSONArray3 = jSONArray.toString();
            C6562gT0.o(jSONArray3, "requestJsonArray.toString()");
            v.e(C, jSONArray3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements f {
        public final /* synthetic */ ArrayList<String> a;

        public j(ArrayList<String> arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.S.f
        public void a(@NotNull String str, @NotNull String str2) throws IOException {
            C6562gT0.p(str, "key");
            C6562gT0.p(str2, "value");
            ArrayList<String> arrayList = this.a;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C6562gT0.o(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i2 = 0;
            do {
                i2++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i2 < nextInt);
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "buffer.toString()");
            b0 = sb2;
            d0 = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        String sb22 = sb.toString();
        C6562gT0.o(sb22, "buffer.toString()");
        b0 = sb22;
        d0 = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @InterfaceC8289nW0
    public S() {
        this(null, null, null, null, null, null, 63, null);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String F() {
        return n.u();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S S(@Nullable C0376a c0376a, @NotNull Context context, @Nullable b bVar) {
        return n.E(c0376a, context, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S T(@Nullable C0376a c0376a, @NotNull Context context, @Nullable String str, @Nullable b bVar) {
        return n.F(c0376a, context, str, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S U(@Nullable C0376a c0376a, @Nullable String str, @Nullable b bVar) {
        return n.G(c0376a, str, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S V(@Nullable C0376a c0376a, @Nullable String str, @Nullable b bVar) {
        return n.H(c0376a, str, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S W(@Nullable C0376a c0376a, @Nullable e eVar) {
        return n.I(c0376a, eVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S X(@Nullable C0376a c0376a, @Nullable d dVar) {
        return n.K(c0376a, dVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S Y(@Nullable C0376a c0376a, @Nullable Location location, int i2, int i3, @Nullable String str, @Nullable d dVar) {
        return n.L(c0376a, location, i2, i3, str, dVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S Z(@Nullable C0376a c0376a, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable b bVar) {
        return n.N(c0376a, str, jSONObject, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S a0(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle, @Nullable b bVar) {
        return n.O(c0376a, str, bundle, bVar);
    }

    public static final void b(b bVar, Y y2) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        int length;
        String optString;
        String optString2;
        String optString3;
        C6562gT0.p(y2, "response");
        JSONObject i2 = y2.i();
        if (i2 == null) {
            optJSONObject = null;
        } else {
            optJSONObject = i2.optJSONObject(T);
        }
        if (optJSONObject == null) {
            optJSONArray = null;
        } else {
            optJSONArray = optJSONObject.optJSONArray("messages");
        }
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                if (optJSONObject2 == null) {
                    optString = null;
                } else {
                    optString = optJSONObject2.optString("message");
                }
                if (optJSONObject2 == null) {
                    optString2 = null;
                } else {
                    optString2 = optJSONObject2.optString("type");
                }
                if (optJSONObject2 == null) {
                    optString3 = null;
                } else {
                    optString3 = optJSONObject2.optString("link");
                }
                if (optString != null && optString2 != null) {
                    b0 b0Var = b0.GRAPH_API_DEBUG_INFO;
                    if (C6562gT0.g(optString2, S)) {
                        b0Var = b0.GRAPH_API_DEBUG_WARNING;
                    }
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    if (!com.facebook.internal.l0.f0(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    V.a aVar = com.facebook.internal.V.e;
                    String str = p;
                    C6562gT0.o(str, "TAG");
                    aVar.d(b0Var, str, optString);
                }
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.a(y2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S b0(@Nullable C0376a c0376a, @Nullable String str, @NotNull Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) {
        return n.P(c0376a, str, bitmap, str2, bundle, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S c0(@Nullable C0376a c0376a, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException, C2416z {
        return n.Q(c0376a, str, uri, str2, bundle, bVar);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final S d0(@Nullable C0376a c0376a, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable b bVar) throws FileNotFoundException {
        return n.R(c0376a, str, file, str2, bundle, bVar);
    }

    @InterfaceC9511sW0
    public static final void e0(@NotNull X x2, @NotNull List<Y> list) {
        n.W(x2, list);
    }

    @InterfaceC9511sW0
    public static final void g0(@NotNull X x2, @NotNull HttpURLConnection httpURLConnection) throws IOException, JSONException {
        n.b0(x2, httpURLConnection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final Y m(@NotNull S s2) {
        return n.i(s2);
    }

    @InterfaceC9511sW0
    public static final void m0(@Nullable String str) {
        n.d0(str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> o(@NotNull X x2) {
        return n.j(x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> p(@NotNull Collection<S> collection) {
        return n.k(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> q(@NotNull S... sArr) {
        return n.l(sArr);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final W r(@NotNull X x2) {
        return n.m(x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final W s(@NotNull Collection<S> collection) {
        return n.n(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final W t(@NotNull S... sArr) {
        return n.o(sArr);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> u(@NotNull HttpURLConnection httpURLConnection, @NotNull X x2) {
        return n.p(httpURLConnection, x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<Y> v(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<S> collection) {
        return n.q(httpURLConnection, collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HttpURLConnection v0(@NotNull X x2) {
        return n.e0(x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final W w(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull X x2) {
        return n.r(handler, httpURLConnection, x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HttpURLConnection w0(@NotNull Collection<S> collection) {
        return n.f0(collection);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final W x(@NotNull HttpURLConnection httpURLConnection, @NotNull X x2) {
        return n.s(httpURLConnection, x2);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final HttpURLConnection x0(@NotNull S... sArr) {
        return n.g0(sArr);
    }

    @InterfaceC9511sW0
    public static final void y0(@NotNull X x2) {
        n.h0(x2);
    }

    @Nullable
    public final String A() {
        return this.e;
    }

    @Nullable
    public final String B() {
        return this.d;
    }

    public final boolean C() {
        return this.f;
    }

    @Nullable
    public final b D() {
        return this.j;
    }

    public final String E() {
        M m = M.a;
        String o2 = M.o();
        String v2 = M.v();
        if (o2.length() > 0 && v2.length() > 0) {
            return o2 + '|' + v2;
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.m0(p, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    @Nullable
    public final JSONObject G() {
        return this.c;
    }

    @Nullable
    public final String H() {
        return this.b;
    }

    public final String I() {
        if (d0.matcher(this.b).matches()) {
            return this.b;
        }
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(com.facebook.share.c.g, Arrays.copyOf(new Object[]{this.i, this.b}, 2));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Nullable
    public final Z J() {
        return this.k;
    }

    @NotNull
    public final Bundle K() {
        return this.g;
    }

    @NotNull
    public final String L() {
        if (this.m == null) {
            com.facebook.internal.c0 c0Var = com.facebook.internal.c0.a;
            String O2 = O(com.facebook.internal.c0.h());
            j();
            Uri parse = Uri.parse(k(O2, true));
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new C2416z("Can't override URL for a batch request");
    }

    @Nullable
    public final Object M() {
        return this.h;
    }

    @NotNull
    public final String N() {
        String i2;
        String str = this.m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.b;
        if (this.k == Z.POST && str2 != null && C9545sf2.b2(str2, q, false, 2, null)) {
            com.facebook.internal.c0 c0Var = com.facebook.internal.c0.a;
            i2 = com.facebook.internal.c0.j();
        } else {
            com.facebook.internal.c0 c0Var2 = com.facebook.internal.c0.a;
            M m = M.a;
            i2 = com.facebook.internal.c0.i(M.C());
        }
        String O2 = O(i2);
        j();
        return k(O2, false);
    }

    public final String O(String str) {
        if (!R()) {
            com.facebook.internal.c0 c0Var = com.facebook.internal.c0.a;
            str = com.facebook.internal.c0.f();
        }
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(com.facebook.share.c.g, Arrays.copyOf(new Object[]{str, I()}, 2));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Nullable
    public final String P() {
        return this.i;
    }

    public final boolean Q() {
        if (this.b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        M m = M.a;
        sb.append(M.o());
        sb.append("/?.*");
        String sb2 = sb.toString();
        if (!this.l && !Pattern.matches(sb2, this.b) && !Pattern.matches("^/?app/?.*", this.b)) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        M m = M.a;
        if (!C6562gT0.g(M.C(), M.S)) {
            return true;
        }
        return !Q();
    }

    public final void f0(JSONArray jSONArray, Map<String, a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(G, this.f);
        }
        String str2 = this.e;
        if (str2 != null) {
            jSONObject.put(H, str2);
        }
        String L2 = L();
        jSONObject.put(J, L2);
        jSONObject.put("method", this.k);
        C0376a c0376a = this.a;
        if (c0376a != null) {
            com.facebook.internal.V.e.f(c0376a.x());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.g.keySet()) {
            Object obj = this.g.get(str3);
            if (n.C(obj)) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(O, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            n.T(jSONObject2, L2, new j(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public final void h0(@Nullable C0376a c0376a) {
        this.a = c0376a;
    }

    public final void i0(@Nullable String str) {
        this.e = str;
    }

    public final void j() {
        Bundle bundle = this.g;
        if (u0()) {
            bundle.putString("access_token", E());
        } else {
            String z2 = z();
            if (z2 != null) {
                bundle.putString("access_token", z2);
            }
        }
        if (!bundle.containsKey("access_token")) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            M m = M.a;
            if (com.facebook.internal.l0.f0(M.v())) {
                Log.w(p, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString(A, B);
        M m2 = M.a;
        if (M.P(b0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(Q, R);
        } else if (M.P(b0.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(Q, S);
        }
    }

    public final void j0(@Nullable String str) {
        this.d = str;
    }

    public final String k(String str, boolean z2) {
        if (!z2 && this.k == Z.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.g.keySet()) {
            Object obj = this.g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = n;
            if (cVar.D(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.S(obj).toString());
            } else if (this.k != Z.GET) {
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C6562gT0.o(builder, "uriBuilder.toString()");
        return builder;
    }

    public final void k0(boolean z2) {
        this.f = z2;
    }

    @NotNull
    public final Y l() {
        return n.i(this);
    }

    public final void l0(@Nullable final b bVar) {
        M m = M.a;
        if (!M.P(b0.GRAPH_API_DEBUG_INFO) && !M.P(b0.GRAPH_API_DEBUG_WARNING)) {
            this.j = bVar;
        } else {
            this.j = new b() { // from class: com.facebook.Q
                @Override // com.facebook.S.b
                public final void a(Y y2) {
                    S.b(S.b.this, y2);
                }
            };
        }
    }

    @NotNull
    public final W n() {
        return n.o(this);
    }

    public final void n0(boolean z2) {
        this.l = z2;
    }

    public final void o0(@Nullable JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void p0(@Nullable String str) {
        this.b = str;
    }

    public final void q0(@Nullable Z z2) {
        if (this.m != null && z2 != Z.GET) {
            throw new C2416z("Can't change HTTP method on request with overridden URL.");
        }
        if (z2 == null) {
            z2 = Z.GET;
        }
        this.k = z2;
    }

    public final void r0(@NotNull Bundle bundle) {
        C6562gT0.p(bundle, "<set-?>");
        this.g = bundle;
    }

    public final void s0(@Nullable Object obj) {
        this.h = obj;
    }

    public final void t0(@Nullable String str) {
        this.i = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.k);
        sb.append(", parameters: ");
        sb.append(this.g);
        sb.append("}");
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public final boolean u0() {
        boolean n3;
        String z2 = z();
        if (z2 == null) {
            n3 = false;
        } else {
            n3 = C10763xf2.n3(z2, "|", false, 2, null);
        }
        if (z2 != null && C9545sf2.J2(z2, "IG", false, 2, null) && !n3 && Q()) {
            return true;
        }
        if (R() || n3) {
            return false;
        }
        return true;
    }

    @Nullable
    public final C0376a y() {
        return this.a;
    }

    public final String z() {
        C0376a c0376a = this.a;
        if (c0376a != null) {
            if (!this.g.containsKey("access_token")) {
                String x2 = c0376a.x();
                com.facebook.internal.V.e.f(x2);
                return x2;
            }
        } else if (!this.g.containsKey("access_token")) {
            return E();
        }
        return this.g.getString("access_token");
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a) {
        this(c0376a, null, null, null, null, null, 62, null);
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a, @Nullable String str) {
        this(c0376a, str, null, null, null, null, 60, null);
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle) {
        this(c0376a, str, bundle, null, null, null, 56, null);
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle, @Nullable Z z2) {
        this(c0376a, str, bundle, z2, null, null, 48, null);
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle, @Nullable Z z2, @Nullable b bVar) {
        this(c0376a, str, bundle, z2, bVar, null, 32, null);
    }

    public /* synthetic */ S(C0376a c0376a, String str, Bundle bundle, Z z2, b bVar, String str2, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? null : c0376a, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : z2, (i2 & 16) != 0 ? null : bVar, (i2 & 32) != 0 ? null : str2);
    }

    @InterfaceC8289nW0
    public S(@Nullable C0376a c0376a, @Nullable String str, @Nullable Bundle bundle, @Nullable Z z2, @Nullable b bVar, @Nullable String str2) {
        this.f = true;
        this.a = c0376a;
        this.b = str;
        this.i = str2;
        l0(bVar);
        q0(z2);
        if (bundle != null) {
            this.g = new Bundle(bundle);
        } else {
            this.g = new Bundle();
        }
        if (this.i == null) {
            M m = M.a;
            this.i = M.B();
        }
    }

    public S(@Nullable C0376a c0376a, @NotNull URL url) {
        C6562gT0.p(url, "overriddenURL");
        this.f = true;
        this.a = c0376a;
        this.m = url.toString();
        q0(Z.GET);
        this.g = new Bundle();
    }
}
