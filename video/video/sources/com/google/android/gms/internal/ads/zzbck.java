package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbck extends zzbcm {
    public zzbck(int i, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(l()));
        }
        return (String) k();
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (String) k());
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(l(), (String) obj);
    }
}
