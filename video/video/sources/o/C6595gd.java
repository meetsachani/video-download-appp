package o;

import com.facebook.internal.V;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C6595gd;
import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.gd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6595gd {
    @NotNull
    public static final String b = "CAPITransformerWebRequests";
    public static final int c = 1000;
    public static final int d = 10;
    public static final int e = 60000;
    public static a h = null;
    public static List<Map<String, Object>> i = null;
    public static final int j = 5;
    public static int k;
    @NotNull
    public static final C6595gd a = new C6595gd();
    @NotNull
    public static final HashSet<Integer> f = B22.m(200, 202);
    @NotNull
    public static final HashSet<Integer> g = B22.m(Integer.valueOf((int) InterfaceC8148mw2.g.k), Integer.valueOf((int) InterfaceC8148mw2.g.l), Integer.valueOf((int) ConfigFetchHandler.l));

    /* renamed from: o.gd$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public final String a;
        @NotNull
        public final String b;
        @NotNull
        public final String c;

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            C6562gT0.p(str, "datasetID");
            C6562gT0.p(str2, "cloudBridgeURL");
            C6562gT0.p(str3, "accessKey");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public static /* synthetic */ a e(a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.c;
            }
            return aVar.d(str, str2, str3);
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.c;
        }

        @NotNull
        public final a d(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            C6562gT0.p(str, "datasetID");
            C6562gT0.p(str2, "cloudBridgeURL");
            C6562gT0.p(str3, "accessKey");
            return new a(str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6562gT0.g(this.a, aVar.a) && C6562gT0.g(this.b, aVar.b) && C6562gT0.g(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String f() {
            return this.c;
        }

        @NotNull
        public final String g() {
            return this.b;
        }

        @NotNull
        public final String h() {
            return this.a;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.a + ", cloudBridgeURL=" + this.b + ", accessKey=" + this.c + ')';
        }
    }

    /* renamed from: o.gd$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC8052mY0 implements VA0<String, Integer, C7458kA2> {
        public final /* synthetic */ List<Map<String, Object>> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Map<String, ? extends Object>> list) {
            super(2);
            this.X = list;
        }

        public static final void f(Integer num, List list) {
            C6562gT0.p(list, "$processedEvents");
            if (!C10662xF.Y1(C6595gd.f, num)) {
                C6595gd.a.i(num, list, 5);
            }
        }

        public final void d(@Nullable String str, @Nullable final Integer num) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            final List<Map<String, Object>> list = this.X;
            com.facebook.internal.l0.G0(new Runnable() { // from class: o.hd
                @Override // java.lang.Runnable
                public final void run() {
                    C6595gd.b.f(num, list);
                }
            });
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C7458kA2 i(String str, Integer num) {
            d(str, num);
            return C7458kA2.a;
        }
    }

    @InterfaceC9511sW0
    public static final void d(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C6562gT0.p(str, "datasetID");
        C6562gT0.p(str2, "url");
        C6562gT0.p(str3, "accessKey");
        com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        C6595gd c6595gd = a;
        c6595gd.m(new a(str, str2, str3));
        c6595gd.o(new ArrayList());
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String e() {
        try {
            a f2 = a.f();
            if (f2 == null) {
                return null;
            }
            return f2.toString();
        } catch (C5505cA2 unused) {
            return null;
        }
    }

    public static /* synthetic */ void j(C6595gd c6595gd, Integer num, List list, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 5;
        }
        c6595gd.i(num, list, i2);
    }

    public static /* synthetic */ void l(C6595gd c6595gd, String str, String str2, String str3, Map map, int i2, VA0 va0, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 60000;
        }
        c6595gd.k(str, str2, str3, map, i2, va0);
    }

    @InterfaceC9511sW0
    public static final void q(@NotNull final com.facebook.S s) {
        C6562gT0.p(s, "request");
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.G0(new Runnable() { // from class: o.fd
            @Override // java.lang.Runnable
            public final void run() {
                C6595gd.r(com.facebook.S.this);
            }
        });
    }

    public static final void r(com.facebook.S s) {
        List o5;
        C6562gT0.p(s, "$request");
        String H = s.H();
        if (H == null) {
            o5 = null;
        } else {
            o5 = C10763xf2.o5(H, new String[]{RemoteSettings.i}, false, 0, 6, null);
        }
        if (o5 != null && o5.size() == 2) {
            try {
                C6595gd c6595gd = a;
                String str = c6595gd.f().g() + "/capi/" + c6595gd.f().h() + "/events";
                List<Map<String, Object>> p = c6595gd.p(s);
                if (p == null) {
                    return;
                }
                c6595gd.c(p);
                int min = Math.min(c6595gd.h().size(), 10);
                List p5 = C10662xF.p5(c6595gd.h(), new C11197zR0(0, min - 1));
                c6595gd.h().subList(0, min).clear();
                JSONArray jSONArray = new JSONArray((Collection) p5);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("data", jSONArray);
                linkedHashMap.put("accessKey", c6595gd.f().f());
                JSONObject jSONObject = new JSONObject(linkedHashMap);
                V.a aVar = com.facebook.internal.V.e;
                com.facebook.b0 b0Var = com.facebook.b0.APP_EVENTS;
                String jSONObject2 = jSONObject.toString(2);
                C6562gT0.o(jSONObject2, "jsonBodyStr.toString(2)");
                aVar.e(b0Var, b, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, s, jSONObject2);
                c6595gd.k(str, Q32.j, jSONObject.toString(), C8683p81.k(C6670gv2.a("Content-Type", "application/json")), 60000, new b(p5));
                return;
            } catch (C5505cA2 e2) {
                com.facebook.internal.V.e.e(com.facebook.b0.DEVELOPER_ERRORS, b, "\n Credentials not initialized Error when logging: \n%s", e2);
                return;
            }
        }
        com.facebook.internal.V.e.e(com.facebook.b0.DEVELOPER_ERRORS, b, "\n GraphPathComponents Error when logging: \n%s", s);
    }

    public final void c(@Nullable List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            h().addAll(list);
        }
        int max = Math.max(0, h().size() - 1000);
        if (max > 0) {
            o(C11313zv2.g(C10662xF.e2(h(), max)));
        }
    }

    @NotNull
    public final a f() {
        a aVar = h;
        if (aVar != null) {
            return aVar;
        }
        C6562gT0.S("credentials");
        throw null;
    }

    public final int g() {
        return k;
    }

    @NotNull
    public final List<Map<String, Object>> h() {
        List<Map<String, Object>> list = i;
        if (list != null) {
            return list;
        }
        C6562gT0.S("transformedEvents");
        throw null;
    }

    public final void i(@Nullable Integer num, @NotNull List<? extends Map<String, ? extends Object>> list, int i2) {
        C6562gT0.p(list, "processedEvents");
        if (C10662xF.Y1(g, num)) {
            if (k >= i2) {
                h().clear();
                k = 0;
                return;
            }
            h().addAll(0, list);
            k++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: IOException -> 0x0043, UnknownHostException -> 0x0046, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0046, IOException -> 0x0043, blocks: (B:3:0x000f, B:5:0x001a, B:19:0x0049, B:21:0x0055, B:26:0x0065, B:28:0x009f, B:35:0x00bb, B:41:0x00c5, B:43:0x00e5, B:8:0x0022, B:11:0x0029, B:12:0x002d, B:14:0x0033, B:45:0x00f1, B:46:0x00f8, B:29:0x00ad, B:31:0x00b3, B:34:0x00b9), top: B:52:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[Catch: IOException -> 0x0043, UnknownHostException -> 0x0046, TryCatch #4 {UnknownHostException -> 0x0046, IOException -> 0x0043, blocks: (B:3:0x000f, B:5:0x001a, B:19:0x0049, B:21:0x0055, B:26:0x0065, B:28:0x009f, B:35:0x00bb, B:41:0x00c5, B:43:0x00e5, B:8:0x0022, B:11:0x0029, B:12:0x002d, B:14:0x0033, B:45:0x00f1, B:46:0x00f8, B:29:0x00ad, B:31:0x00b3, B:34:0x00b9), top: B:52:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Map<String, String> map, int i2, @Nullable VA0<? super String, ? super Integer, C7458kA2> va0) {
        Set<String> keySet;
        boolean z;
        C6562gT0.p(str, "urlStr");
        C6562gT0.p(str2, "requestMethod");
        try {
            URLConnection openConnection = new URL(str).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod(str2);
                if (map != null && (keySet = map.keySet()) != null) {
                    for (String str4 : keySet) {
                        httpURLConnection.setRequestProperty(str4, map.get(str4));
                    }
                }
                if (!httpURLConnection.getRequestMethod().equals(Q32.j) && !httpURLConnection.getRequestMethod().equals("PUT")) {
                    z = false;
                    httpURLConnection.setDoOutput(z);
                    httpURLConnection.setConnectTimeout(i2);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                    bufferedWriter.write(str3);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    bufferedOutputStream.close();
                    StringBuilder sb = new StringBuilder();
                    if (f.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        C7458kA2 c7458kA2 = C7458kA2.a;
                        C5033aE.a(bufferedReader, null);
                    }
                    String sb2 = sb.toString();
                    C6562gT0.o(sb2, "connResponseSB.toString()");
                    com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\nResponse Received: \n%s\n%s", sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                    if (va0 == null) {
                        va0.i(sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                        return;
                    }
                    return;
                }
                z = true;
                httpURLConnection.setDoOutput(z);
                httpURLConnection.setConnectTimeout(i2);
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                bufferedWriter2.write(str3);
                bufferedWriter2.flush();
                bufferedWriter2.close();
                bufferedOutputStream2.close();
                StringBuilder sb3 = new StringBuilder();
                if (f.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                }
                String sb22 = sb3.toString();
                C6562gT0.o(sb22, "connResponseSB.toString()");
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\nResponse Received: \n%s\n%s", sb22, Integer.valueOf(httpURLConnection.getResponseCode()));
                if (va0 == null) {
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
        } catch (UnknownHostException e2) {
            com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "Connection failed, retrying: \n%s", e2.toString());
            if (va0 != null) {
                va0.i(null, Integer.valueOf((int) InterfaceC8148mw2.g.k));
            }
        } catch (IOException e3) {
            com.facebook.internal.V.e.e(com.facebook.b0.DEVELOPER_ERRORS, b, "Send to server failed: \n%s", e3.toString());
        }
    }

    public final void m(@NotNull a aVar) {
        C6562gT0.p(aVar, "<set-?>");
        h = aVar;
    }

    public final void n(int i2) {
        k = i2;
    }

    public final void o(@NotNull List<Map<String, Object>> list) {
        C6562gT0.p(list, "<set-?>");
        i = list;
    }

    public final List<Map<String, Object>> p(com.facebook.S s) {
        JSONObject G = s.G();
        if (G != null) {
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Map<String, ? extends Object> J0 = C8926q81.J0(com.facebook.internal.l0.o(G));
            Object M = s.M();
            if (M != null) {
                J0.put("custom_events", M);
                StringBuilder sb = new StringBuilder();
                for (String str : J0.keySet()) {
                    sb.append(str);
                    sb.append(" : ");
                    sb.append(J0.get(str));
                    sb.append(System.getProperty("line.separator"));
                }
                com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, b, "\nGraph Request data: \n\n%s \n\n", sb);
                return C6097ed.a.e(J0);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        return null;
    }
}
