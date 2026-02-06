package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C0376a;
import com.facebook.S;
import com.facebook.Y;
import com.facebook.bolts.B;
import com.facebook.bolts.C;
import com.facebook.bolts.C2331c;
import com.facebook.bolts.InterfaceC2332d;
import com.facebook.bolts.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.SQ;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c implements InterfaceC2332d {
    public static final String b = "app_links";
    public static final String c = "android";
    public static final String d = "web";
    public static final String e = "package";
    public static final String f = "class";
    public static final String g = "app_name";
    public static final String h = "url";
    public static final String i = "should_fallback";
    public final HashMap<Uri, C2331c> a = new HashMap<>();

    /* loaded from: classes2.dex */
    public class a implements l<Map<Uri, C2331c>, C2331c> {
        public final /* synthetic */ Uri a;

        public a(final Uri val$uri) {
            this.a = val$uri;
        }

        @Override // com.facebook.bolts.l
        /* renamed from: b */
        public C2331c a(B<Map<Uri, C2331c>> resolveUrisTask) throws Exception {
            return resolveUrisTask.O().get(this.a);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements S.b {
        public final /* synthetic */ C a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ HashSet c;

        public b(final C val$taskCompletionSource, final Map val$appLinkResults, final HashSet val$urisToRequest) {
            this.a = val$taskCompletionSource;
            this.b = val$appLinkResults;
            this.c = val$urisToRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:5:0x0008, B:7:0x000e, B:11:0x001b, B:13:0x0021, B:15:0x0029, B:16:0x002f, B:18:0x0035, B:21:0x0046, B:23:0x0066, B:25:0x0070, B:26:0x0073, B:27:0x0076, B:28:0x008a, B:34:0x0098, B:35:0x0099), top: B:42:0x0008 }] */
        @Override // com.facebook.S.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(Y response) {
            if (!SQ.e(this)) {
                try {
                    com.facebook.C g = response.g();
                    if (g != null) {
                        this.a.c(g.q());
                        return;
                    }
                    JSONObject i = response.i();
                    if (i == null) {
                        this.a.d(this.b);
                        return;
                    }
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        Uri uri = (Uri) it.next();
                        if (i.has(uri.toString())) {
                            try {
                                JSONObject jSONObject = i.getJSONObject(uri.toString()).getJSONObject(c.b);
                                JSONArray jSONArray = jSONObject.getJSONArray("android");
                                int length = jSONArray.length();
                                ArrayList arrayList = new ArrayList(length);
                                for (int i2 = 0; i2 < length; i2++) {
                                    C2331c.a b = c.b(jSONArray.getJSONObject(i2));
                                    if (b != null) {
                                        arrayList.add(b);
                                    }
                                }
                                C2331c c2331c = new C2331c(uri, arrayList, c.c(uri, jSONObject));
                                this.b.put(uri, c2331c);
                                synchronized (c.d(c.this)) {
                                    c.d(c.this).put(uri, c2331c);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        while (it.hasNext()) {
                        }
                    }
                    this.a.d(this.b);
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    public static /* synthetic */ C2331c.a b(JSONObject jSONObject) {
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            return e(jSONObject);
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
    }

    public static /* synthetic */ Uri c(Uri uri, JSONObject jSONObject) {
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            return g(uri, jSONObject);
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
    }

    public static /* synthetic */ HashMap d(c cVar) {
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            return cVar.a;
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
    }

    public static C2331c.a e(JSONObject targetJson) {
        Uri uri;
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            String i2 = i(targetJson, "package", null);
            if (i2 == null) {
                return null;
            }
            String i3 = i(targetJson, f, null);
            String i4 = i(targetJson, "app_name", null);
            String i5 = i(targetJson, "url", null);
            if (i5 != null) {
                uri = Uri.parse(i5);
            } else {
                uri = null;
            }
            return new C2331c.a(i2, i3, uri, i4);
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
    }

    public static Uri g(Uri sourceUrl, JSONObject urlData) {
        JSONObject jSONObject;
        Uri uri = null;
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            jSONObject = urlData.getJSONObject("web");
        } catch (JSONException unused) {
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
        if (!h(jSONObject, i, true)) {
            return null;
        }
        String i2 = i(jSONObject, "url", null);
        if (i2 != null) {
            uri = Uri.parse(i2);
        }
        if (uri != null) {
            return uri;
        }
        return sourceUrl;
    }

    public static boolean h(JSONObject json, String propertyName, boolean defaultValue) {
        if (SQ.e(c.class)) {
            return false;
        }
        try {
            return json.getBoolean(propertyName);
        } catch (JSONException unused) {
            return defaultValue;
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return false;
        }
    }

    public static String i(JSONObject json, String propertyName, String defaultValue) {
        if (SQ.e(c.class)) {
            return null;
        }
        try {
            return json.getString(propertyName);
        } catch (JSONException unused) {
            return defaultValue;
        } catch (Throwable th) {
            SQ.c(th, c.class);
            return null;
        }
    }

    @Override // com.facebook.bolts.InterfaceC2332d
    public B<C2331c> a(final Uri uri) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            return f(arrayList).V(new a(uri));
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public B<Map<Uri, C2331c>> f(List<Uri> uris) {
        C2331c c2331c;
        if (SQ.e(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (Uri uri : uris) {
                synchronized (this.a) {
                    c2331c = this.a.get(uri);
                }
                if (c2331c != null) {
                    hashMap.put(uri, c2331c);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb.append(',');
                    }
                    sb.append(uri.toString());
                    hashSet.add(uri);
                }
            }
            if (hashSet.isEmpty()) {
                return B.M(hashMap);
            }
            C c2 = new C();
            Bundle bundle = new Bundle();
            bundle.putString("ids", sb.toString());
            bundle.putString("fields", String.format("%s.fields(%s,%s)", b, "android", "web"));
            new S(C0376a.k(), "", bundle, null, new b(c2, hashMap, hashSet)).n();
            return c2.a();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }
}
