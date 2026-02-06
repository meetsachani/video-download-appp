package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    public static Settings.FeatureFlagData b(JSONObject jSONObject) {
        return new Settings.FeatureFlagData(jSONObject.optBoolean(SettingsJsonConstants.j, true), jSONObject.optBoolean(SettingsJsonConstants.k, false), jSONObject.optBoolean(SettingsJsonConstants.l, false));
    }

    public static Settings.SessionData c(JSONObject jSONObject) {
        return new Settings.SessionData(jSONObject.optInt(SettingsJsonConstants.q, 8), 4);
    }

    public static long d(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return currentTimeProvider.a() + (j * 1000);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        Settings.SessionData c;
        int optInt = jSONObject.optInt(SettingsJsonConstants.c, 0);
        int optInt2 = jSONObject.optInt(SettingsJsonConstants.e, 3600);
        double optDouble = jSONObject.optDouble(SettingsJsonConstants.f, 10.0d);
        double optDouble2 = jSONObject.optDouble(SettingsJsonConstants.g, 1.2d);
        int optInt3 = jSONObject.optInt(SettingsJsonConstants.h, 60);
        if (jSONObject.has(SettingsJsonConstants.b)) {
            c = c(jSONObject.getJSONObject(SettingsJsonConstants.b));
        } else {
            c = c(new JSONObject());
        }
        return new Settings(d(currentTimeProvider, optInt2, jSONObject), c, b(jSONObject.getJSONObject(SettingsJsonConstants.d)), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
