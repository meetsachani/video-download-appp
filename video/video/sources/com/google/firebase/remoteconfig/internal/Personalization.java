package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5670cr1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Personalization {
    public static final String c = "fp";
    public static final String d = "personalization_assignment";
    public static final String e = "arm_key";
    public static final String f = "arm_value";
    public static final String g = "personalizationId";
    public static final String h = "personalization_id";
    public static final String i = "armIndex";
    public static final String j = "arm_index";
    public static final String k = "group";
    public static final String l = "group";
    public static final String m = "_fpc";
    public static final String n = "choiceId";

    /* renamed from: o  reason: collision with root package name */
    public static final String f393o = "_fpid";
    public final Provider<AnalyticsConnector> a;
    public final Map<String, String> b = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider<AnalyticsConnector> provider) {
        this.a = provider;
    }

    public void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 ConfigContainer configContainer) {
        JSONObject optJSONObject;
        AnalyticsConnector analyticsConnector = this.a.get();
        if (analyticsConnector != null) {
            JSONObject i2 = configContainer.i();
            if (i2.length() >= 1) {
                JSONObject g2 = configContainer.g();
                if (g2.length() >= 1 && (optJSONObject = i2.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString(n);
                    if (optString.isEmpty()) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (optString.equals(this.b.get(str))) {
                                return;
                            }
                            this.b.put(str, optString);
                            Bundle bundle = new Bundle();
                            bundle.putString(e, str);
                            bundle.putString(f, g2.optString(str));
                            bundle.putString(h, optJSONObject.optString(g));
                            bundle.putInt(j, optJSONObject.optInt(i, -1));
                            bundle.putString("group", optJSONObject.optString("group"));
                            analyticsConnector.b(c, d, bundle);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(f393o, optString);
                            analyticsConnector.b(c, m, bundle2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
