package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbci extends zzbcm {
    public zzbci(int i, String str, Long l, Long l2) {
        super(1, str, l, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(l()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(l())));
        }
        return (Long) k();
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(l(), ((Long) k()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(l(), ((Long) obj).longValue());
    }
}
