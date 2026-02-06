package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class DefaultSettingsSpiCall implements SettingsSpiCall {
    public static final String d = "X-CRASHLYTICS-GOOGLE-APP-ID";
    public static final String e = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String f = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String g = "User-Agent";
    public static final String h = "Accept";
    public static final String i = "Crashlytics Android SDK/";
    public static final String j = "application/json";
    public static final String k = "android";
    public static final String l = "build_version";
    public static final String m = "display_version";
    public static final String n = "instance";

    /* renamed from: o  reason: collision with root package name */
    public static final String f347o = "source";
    public static final String p = "X-CRASHLYTICS-DEVICE-MODEL";
    public static final String q = "X-CRASHLYTICS-OS-BUILD-VERSION";
    public static final String r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    public static final String s = "X-CRASHLYTICS-INSTALLATION-ID";
    public final String a;
    public final HttpRequestFactory b;
    public final Logger c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.f());
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public JSONObject a(SettingsRequest settingsRequest, boolean z) {
        if (z) {
            try {
                Map<String, String> f2 = f(settingsRequest);
                HttpGetRequest b = b(d(f2), settingsRequest);
                Logger logger = this.c;
                logger.b("Requesting settings from " + this.a);
                Logger logger2 = this.c;
                logger2.k("Settings query params were: " + f2);
                return g(b.c());
            } catch (IOException e2) {
                this.c.e("Settings request failed.", e2);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    public final HttpGetRequest b(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        c(httpGetRequest, d, settingsRequest.a);
        c(httpGetRequest, e, "android");
        c(httpGetRequest, f, CrashlyticsCore.m());
        c(httpGetRequest, "Accept", "application/json");
        c(httpGetRequest, p, settingsRequest.b);
        c(httpGetRequest, q, settingsRequest.c);
        c(httpGetRequest, r, settingsRequest.d);
        c(httpGetRequest, s, settingsRequest.e.a().c());
        return httpGetRequest;
    }

    public final void c(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.d(str, str2);
        }
    }

    public HttpGetRequest d(Map<String, String> map) {
        HttpGetRequest b = this.b.b(this.a, map);
        return b.d("User-Agent", i + CrashlyticsCore.m()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            Logger logger = this.c;
            logger.n("Failed to parse settings JSON from " + this.a, e2);
            Logger logger2 = this.c;
            logger2.m("Settings response " + str);
            return null;
        }
    }

    public final Map<String, String> f(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put(l, settingsRequest.h);
        hashMap.put(m, settingsRequest.g);
        hashMap.put("source", Integer.toString(settingsRequest.i));
        String str = settingsRequest.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject g(HttpResponse httpResponse) {
        int b = httpResponse.b();
        Logger logger = this.c;
        logger.k("Settings response code was: " + b);
        if (h(b)) {
            return e(httpResponse.a());
        }
        Logger logger2 = this.c;
        logger2.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    public boolean h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.c = logger;
            this.b = httpRequestFactory;
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
