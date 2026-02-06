package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SettingsJsonParser {
    public final CurrentTimeProvider a;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.a = currentTimeProvider;
    }

    public static SettingsJsonTransform a(int i) {
        if (i != 3) {
            Logger f = Logger.f();
            f.d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new DefaultSettingsJsonTransform();
        }
        return new SettingsV3JsonTransform();
    }

    public Settings b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt(SettingsJsonConstants.c)).a(this.a, jSONObject);
    }
}
