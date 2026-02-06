package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.facebook.internal.Z;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;
import o.S92;

/* loaded from: classes2.dex */
public final class zzl {
    @InterfaceC8710pF0("lock")
    public static boolean c = false;
    @InterfaceC8710pF0("lock")
    public static boolean d = false;
    public static final /* synthetic */ int g = 0;
    public final List a;
    public static final Object b = new Object();
    public static final Clock e = DefaultClock.d();
    public static final Set f = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.d(bArr));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (b) {
            c = false;
            d = false;
            zzo.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z) {
        synchronized (b) {
            c = true;
            d = z;
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (b) {
            try {
                z = false;
                if (c && d) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public static boolean l() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    public static synchronized void m(String str) {
        synchronized (zzl.class) {
            try {
                zzo.f("GMA Debug BEGIN");
                int i = 0;
                while (i < str.length()) {
                    int i2 = i + S92.y;
                    zzo.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i, Math.min(i2, str.length())))));
                    i = i2;
                }
                zzo.f("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void r(JsonWriter jsonWriter, @InterfaceC11300zs1 Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f.contains(str)) {
                if (entry.getValue() instanceof List) {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                } else if (entry.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    zzo.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, @InterfaceC11300zs1 byte[] bArr) {
        HashMap hashMap;
        if (!k()) {
            return;
        }
        if (httpURLConnection.getRequestProperties() == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(httpURLConnection.getRequestProperties());
        }
        p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
    }

    public final void d(String str, String str2, @InterfaceC11300zs1 Map map, @InterfaceC11300zs1 byte[] bArr) {
        if (!k()) {
            return;
        }
        p(str, "GET", map, bArr);
    }

    public final void e(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (k()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            q(hashMap, i);
            if (i >= 200 && i < 300) {
                return;
            }
            try {
                str = httpURLConnection.getResponseMessage();
            } catch (IOException e2) {
                zzo.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e2.getMessage())));
            }
            o(str);
        }
    }

    public final void f(@InterfaceC11300zs1 Map map, int i) {
        if (k()) {
            q(map, i);
            if (i >= 200 && i < 300) {
                return;
            }
            o(null);
        }
    }

    public final void g(@InterfaceC11300zs1 String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void a(JsonWriter jsonWriter) {
                int i = zzl.g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String d2 = Base64Utils.d(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(d2);
                } else {
                    String l = zzf.l(d2);
                    if (l != null) {
                        jsonWriter.name("bodydigest").value(l);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public final void n(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzkVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzo.e("unable to log", e2);
        }
        m(stringWriter.toString());
    }

    public final void o(@InterfaceC11300zs1 final String str) {
        n("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void a(JsonWriter jsonWriter) {
                int i = zzl.g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name(Z.Q0).value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    public final void p(final String str, final String str2, @InterfaceC11300zs1 final Map map, @InterfaceC11300zs1 final byte[] bArr) {
        n("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void a(JsonWriter jsonWriter) {
                zzl.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    public final void q(@InterfaceC11300zs1 final Map map, final int i) {
        n("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void a(JsonWriter jsonWriter) {
                zzl.b(i, map, jsonWriter);
            }
        });
    }

    public zzl(@InterfaceC11300zs1 String str) {
        List asList;
        if (!k()) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
        }
        this.a = asList;
    }
}
