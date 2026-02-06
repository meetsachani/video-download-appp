package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C2416z;
import com.facebook.M;
import com.facebook.S;
import com.facebook.appevents.C2327q;
import com.facebook.internal.C2358c;
import com.facebook.internal.l0;
import com.facebook.internal.m0;
import java.util.Iterator;
import o.C2638Cg0;
import o.InterfaceC11300zs1;
import o.SQ;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String A = "fb_ref";
    public static final String B = "deeplink_context";
    public static final String C = "promo_code";
    public static final String D = "com.facebook.applinks.a";
    public static final String g = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    public static final String h = "referer_data";
    public static final String i = "extras";
    public static final String j = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final String k = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final String l = "com.facebook.platform.APPLINK_ARGS";
    public static final String m = "al_applink_data";
    public static final String n = "bridge_args";

    /* renamed from: o  reason: collision with root package name */
    public static final String f77o = "method_args";
    public static final String p = "version";
    public static final String q = "method";
    public static final String r = "DEFERRED_APP_LINK";
    public static final String s = "%s/activities";
    public static final String t = "applink_args";
    public static final String u = "applink_class";
    public static final String v = "click_time";
    public static final String w = "applink_url";
    public static final String x = "is_auto_applink";
    public static final String y = "target_url";
    public static final String z = "ref";
    @InterfaceC11300zs1
    public String a;
    @InterfaceC11300zs1
    public Uri b;
    @InterfaceC11300zs1
    public JSONObject c;
    @InterfaceC11300zs1
    public Bundle d;
    @InterfaceC11300zs1
    public String e;
    @InterfaceC11300zs1
    public JSONObject f;

    /* renamed from: com.facebook.applinks.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0073a implements Runnable {
        public final /* synthetic */ Context X;
        public final /* synthetic */ String Y;
        public final /* synthetic */ b Z;

        public RunnableC0073a(final Context val$applicationContext, final String val$applicationIdCopy, final b val$completionHandler) {
            this.X = val$applicationContext;
            this.Y = val$applicationIdCopy;
            this.Z = val$completionHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!SQ.e(this)) {
                try {
                    a.h(this.X, this.Y, this.Z);
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@InterfaceC11300zs1 a appLinkData);
    }

    @InterfaceC11300zs1
    public static a b(Activity activity) {
        if (SQ.e(a.class)) {
            return null;
        }
        try {
            m0.s(activity, androidx.appcompat.widget.b.r);
            Intent intent = activity.getIntent();
            if (intent == null) {
                return null;
            }
            a c = c(intent);
            if (c == null) {
                c = d(intent.getStringExtra(l));
            }
            if (c == null) {
                return e(intent.getData());
            }
            return c;
        } catch (Throwable th) {
            SQ.c(th, a.class);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static a c(Intent intent) {
        String string;
        String string2;
        if (SQ.e(a.class) || intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            a aVar = new a();
            Uri data = intent.getData();
            aVar.b = data;
            aVar.f = j(data);
            if (aVar.b == null && (string2 = bundleExtra.getString(y)) != null) {
                aVar.b = Uri.parse(string2);
            }
            aVar.d = bundleExtra;
            aVar.c = null;
            Bundle bundle = bundleExtra.getBundle(h);
            if (bundle != null) {
                aVar.a = bundle.getString(A);
            }
            Bundle bundle2 = bundleExtra.getBundle("extras");
            if (bundle2 != null && (string = bundle2.getString("deeplink_context")) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has("promo_code")) {
                        aVar.e = jSONObject.getString("promo_code");
                        return aVar;
                    }
                } catch (JSONException e) {
                    l0.n0(D, "Unable to parse deeplink_context JSON", e);
                }
            }
            return aVar;
        } catch (Throwable th) {
            SQ.c(th, a.class);
            return null;
        }
    }

    @InterfaceC11300zs1
    public static a d(String jsonString) {
        if (jsonString == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals(C2638Cg0.Y4)) {
                a aVar = new a();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                aVar.c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    aVar.a = aVar.c.getString("ref");
                } else if (aVar.c.has(h)) {
                    JSONObject jSONObject3 = aVar.c.getJSONObject(h);
                    if (jSONObject3.has(A)) {
                        aVar.a = jSONObject3.getString(A);
                    }
                }
                if (aVar.c.has(y)) {
                    Uri parse = Uri.parse(aVar.c.getString(y));
                    aVar.b = parse;
                    aVar.f = j(parse);
                }
                if (aVar.c.has("extras")) {
                    JSONObject jSONObject4 = aVar.c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            aVar.e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                aVar.d = q(aVar.c);
                return aVar;
            }
        } catch (C2416z e) {
            l0.n0(D, "Unable to parse AppLink JSON", e);
        } catch (JSONException e2) {
            l0.n0(D, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    @InterfaceC11300zs1
    public static a e(Uri appLinkDataUri) {
        if (appLinkDataUri == null) {
            return null;
        }
        a aVar = new a();
        aVar.b = appLinkDataUri;
        aVar.f = j(appLinkDataUri);
        return aVar;
    }

    public static void f(Context context, b completionHandler) {
        g(context, null, completionHandler);
    }

    public static void g(Context context, String applicationId, final b completionHandler) {
        m0.s(context, "context");
        m0.s(completionHandler, "completionHandler");
        if (applicationId == null) {
            applicationId = l0.K(context);
        }
        m0.s(applicationId, "applicationId");
        M.y().execute(new RunnableC0073a(context.getApplicationContext(), applicationId, completionHandler));
    }

    public static void h(Context context, String applicationId, final b completionHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", r);
            l0.I0(jSONObject, C2358c.k(context), C2327q.g(context), M.E(context), context);
            l0.J0(jSONObject, M.n());
            jSONObject.put("application_package_name", context.getPackageName());
            String format = String.format("%s/activities", applicationId);
            a aVar = null;
            try {
                JSONObject i2 = S.Z(null, format, jSONObject, null).l().i();
                if (i2 != null) {
                    String optString = i2.optString(t);
                    long optLong = i2.optLong(v, -1L);
                    String optString2 = i2.optString(u);
                    String optString3 = i2.optString(w);
                    if (!TextUtils.isEmpty(optString) && (aVar = d(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject2 = aVar.c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put(g, optLong);
                                }
                                Bundle bundle = aVar.d;
                                if (bundle != null) {
                                    bundle.putString(g, Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                l0.m0(D, "Unable to put tap time in AppLinkData.arguments");
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject3 = aVar.c;
                                if (jSONObject3 != null) {
                                    jSONObject3.put(j, optString2);
                                }
                                Bundle bundle2 = aVar.d;
                                if (bundle2 != null) {
                                    bundle2.putString(j, optString2);
                                }
                            } catch (JSONException unused2) {
                                l0.m0(D, "Unable to put app link class name in AppLinkData.arguments");
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject4 = aVar.c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put(k, optString3);
                                }
                                Bundle bundle3 = aVar.d;
                                if (bundle3 != null) {
                                    bundle3.putString(k, optString3);
                                }
                            } catch (JSONException unused3) {
                                l0.m0(D, "Unable to put app link URL in AppLinkData.arguments");
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                l0.m0(D, "Unable to fetch deferred applink from server");
            }
            completionHandler.a(aVar);
        } catch (JSONException e) {
            throw new C2416z("An error occurred while preparing deferred app link", e);
        }
    }

    @InterfaceC11300zs1
    public static JSONObject j(@InterfaceC11300zs1 Uri uri) {
        if (SQ.e(a.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, a.class);
            return null;
        }
    }

    public static Bundle q(JSONObject node) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = node.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = node.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, q((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i2 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            bundleArr[i2] = q(jSONArray.getJSONObject(i2));
                            i2++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            strArr[i2] = jSONArray.get(i2).toString();
                            i2++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new C2416z("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            return jSONObject;
        }
        return new JSONObject();
    }

    @InterfaceC11300zs1
    public Bundle k() {
        return this.d;
    }

    @InterfaceC11300zs1
    public String l() {
        return this.e;
    }

    @InterfaceC11300zs1
    public String m() {
        return this.a;
    }

    @InterfaceC11300zs1
    public Bundle n() {
        Bundle bundle = this.d;
        if (bundle != null) {
            return bundle.getBundle(h);
        }
        return null;
    }

    @InterfaceC11300zs1
    public Uri o() {
        return this.b;
    }

    public boolean p() {
        Uri uri = this.b;
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String scheme = this.b.getScheme();
        String format = String.format("fb%s", M.o());
        JSONObject jSONObject = this.f;
        if (jSONObject == null || !jSONObject.optBoolean(x) || !"applinks".equals(host) || !format.equals(scheme)) {
            return false;
        }
        return true;
    }
}
