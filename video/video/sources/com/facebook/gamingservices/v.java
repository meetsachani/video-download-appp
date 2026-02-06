package com.facebook.gamingservices;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.S;
import com.facebook.Y;
import o.C10169vE;
import o.C9998uW1;
import o.EnumC10487wW1;
import o.TG2;
import o.XT;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class v implements S.g {
    public Context a;
    public S.b b;

    public v(Context context) {
        this(context, null);
    }

    @Override // com.facebook.S.b
    public void a(Y response) {
        S.b bVar = this.b;
        if (bVar != null) {
            bVar.a(response);
        }
        if (response != null && response.g() == null) {
            String optString = response.i().optString("id", null);
            String optString2 = response.i().optString(TG2.k, null);
            if (optString != null || optString2 != null) {
                if (optString == null) {
                    optString = optString2;
                }
                if (C10169vE.f()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", optString);
                        jSONObject.put(C9998uW1.e0, "MEDIA_ASSET");
                        XT.m(this.a, jSONObject, null, EnumC10487wW1.OPEN_GAMING_SERVICES_DEEP_LINK);
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/media_asset/" + optString)));
            }
        }
    }

    @Override // com.facebook.S.g
    public void b(long current, long max) {
        S.b bVar = this.b;
        if (bVar != null && (bVar instanceof S.g)) {
            ((S.g) bVar).b(current, max);
        }
    }

    public v(Context context, S.b callback) {
        this.a = context;
        this.b = callback;
    }
}
