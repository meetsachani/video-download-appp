package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.S;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbil implements zzbjw {
    public final zzbim a;

    public zzbil(zzbim zzbimVar) {
        this.a = zzbimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        if (this.a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey(S.R)) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbs.a(new JSONObject((String) map.get(S.R)));
            } catch (JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Failed to convert ad metadata to Bundle.");
            return;
        }
        this.a.x0(str, bundle);
    }
}
