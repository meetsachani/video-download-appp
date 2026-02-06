package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzao implements zzd {
    public final Application a;
    public final zzaq b;
    public final zzl c;
    public final Executor d;

    public zzao(Application application, zzaq zzaqVar, zzl zzlVar, Executor executor) {
        this.a = application;
        this.b = zzaqVar;
        this.d = executor;
        this.c = zzlVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean b(String str, JSONObject jSONObject) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                    } else {
                        hashSet.add(optString);
                    }
                }
                zzcp.b(this.a, hashSet);
            } else {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            }
            return true;
        }
        zzco zzcoVar = new zzco(this.a);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
            if (zzcoVar.e(next, opt)) {
                this.b.d().add(next);
            } else {
                Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
            }
        }
        this.b.f();
        zzcoVar.c();
        Map b = zzcoVar.b();
        if (b.size() > 1) {
            this.c.a(b);
            zzcoVar.d();
        }
        return true;
    }
}
