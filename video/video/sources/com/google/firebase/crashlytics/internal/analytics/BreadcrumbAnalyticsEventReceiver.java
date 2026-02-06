package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    public static final String b = "name";
    public static final String c = "parameters";
    public static final String d = "$A$:";
    @InterfaceC11300zs1
    public BreadcrumbHandler a;

    @InterfaceC5670cr1
    public static String b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(c, jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(@InterfaceC11300zs1 BreadcrumbHandler breadcrumbHandler) {
        this.a = breadcrumbHandler;
        Logger.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.a;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.a(d + b(str, bundle));
            } catch (JSONException unused) {
                Logger.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
