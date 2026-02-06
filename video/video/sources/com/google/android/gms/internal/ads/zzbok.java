package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbok {
    public static final Charset a = Charset.forName("UTF-8");
    public static final zzboh b = new zzboj();
    public static final zzbof c = new zzbof() { // from class: com.google.android.gms.internal.ads.zzboi
        @Override // com.google.android.gms.internal.ads.zzbof
        public final Object a(JSONObject jSONObject) {
            return zzbok.a(jSONObject);
        }
    };

    public static /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}
