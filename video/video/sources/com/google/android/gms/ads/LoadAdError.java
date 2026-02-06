package com.google.android.gms.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LoadAdError extends AdError {
    @InterfaceC11300zs1
    public final ResponseInfo f;

    public LoadAdError(int i, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 AdError adError, @InterfaceC11300zs1 ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.f = responseInfo;
    }

    @Override // com.google.android.gms.ads.AdError
    @InterfaceC5670cr1
    public final JSONObject f() throws JSONException {
        JSONObject f = super.f();
        ResponseInfo g = g();
        if (g == null) {
            f.put("Response Info", "null");
            return f;
        }
        f.put("Response Info", g.i());
        return f;
    }

    @InterfaceC11300zs1
    public ResponseInfo g() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.AdError
    @InterfaceC5670cr1
    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
