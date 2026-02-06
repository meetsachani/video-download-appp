package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzbcg extends zzbcm {
    public zzbcg(int i, String str, Boolean bool, Boolean bool2) {
        super(i, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Boolean) k();
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(l(), ((Boolean) obj).booleanValue());
    }
}
