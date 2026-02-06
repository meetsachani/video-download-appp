package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import o.C9755tW1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzew {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzew(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    public final Bundle a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString(C9755tW1.f875o, "");
            } catch (JSONException unused) {
                return "";
            }
        }
        return "";
    }
}
