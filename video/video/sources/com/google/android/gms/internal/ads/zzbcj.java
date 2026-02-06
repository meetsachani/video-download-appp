package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbcj extends zzbcm {
    public zzbcj(int i, String str, Float f, Float f2) {
        super(1, str, f, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Float) k();
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(l(), ((Float) k()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(l(), ((Float) obj).floatValue());
    }
}
