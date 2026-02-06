package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import o.C2531Be;
import o.InterfaceC5670cr1;
import org.jsoup.helper.CookieUtil;

/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    public final C2531Be<ApiKey<?>, ConnectionResult> X;

    public AvailabilityException(@InterfaceC5670cr1 C2531Be<ApiKey<?>, ConnectionResult> c2531Be) {
        this.X = c2531Be;
    }

    @InterfaceC5670cr1
    public ConnectionResult a(@InterfaceC5670cr1 GoogleApi<? extends Api.ApiOptions> googleApi) {
        boolean z;
        ApiKey<? extends Api.ApiOptions> c = googleApi.c();
        if (this.X.get(c) != null) {
            z = true;
        } else {
            z = false;
        }
        String b = c.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append("The given API (");
        sb.append(b);
        sb.append(") was not part of the availability request.");
        Preconditions.b(z, sb.toString());
        return (ConnectionResult) Preconditions.r(this.X.get(c));
    }

    @InterfaceC5670cr1
    public ConnectionResult b(@InterfaceC5670cr1 HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        boolean z;
        ApiKey<? extends Api.ApiOptions> c = hasApiKey.c();
        if (this.X.get(c) != null) {
            z = true;
        } else {
            z = false;
        }
        String b = c.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append("The given API (");
        sb.append(b);
        sb.append(") was not part of the availability request.");
        Preconditions.b(z, sb.toString());
        return (ConnectionResult) Preconditions.r(this.X.get(c));
    }

    @Override // java.lang.Throwable
    @InterfaceC5670cr1
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey<?> apiKey : this.X.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.r(this.X.get(apiKey));
            z &= !connectionResult.H0();
            String b = apiKey.b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join(CookieUtil.b, arrayList));
        return sb2.toString();
    }
}
