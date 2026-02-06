package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import o.C6273fK2;
import o.CU0;
import o.PJ2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfll implements C6273fK2.b {
    public final /* synthetic */ zzflm a;

    public zzfll(zzflm zzflmVar) {
        this.a = zzflmVar;
    }

    @Override // o.C6273fK2.b
    public final void a(WebView webView, PJ2 pj2, Uri uri, boolean z, CU0 cu0) {
        try {
            JSONObject jSONObject = new JSONObject(pj2.c());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfky.a.getClass();
                    return;
                } else {
                    zzflm.c(this.a, string2);
                    return;
                }
            }
            zzflm.e(this.a, string2);
        } catch (JSONException e) {
            zzfmu.a("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
