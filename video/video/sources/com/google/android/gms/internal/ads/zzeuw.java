package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeuw implements zzetu {
    @InterfaceC11300zs1
    public final AdvertisingIdClient.Info a;
    @InterfaceC11300zs1
    public final String b;
    public final zzfrp c;

    public zzeuw(@InterfaceC11300zs1 AdvertisingIdClient.Info info, @InterfaceC11300zs1 String str, zzfrp zzfrpVar) {
        this.a = info;
        this.b = str;
        this.c = zzfrpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            JSONObject g = com.google.android.gms.ads.internal.util.zzbs.g((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info != null && !TextUtils.isEmpty(info.a())) {
                g.put("rdid", info.a());
                g.put("is_lat", info.b());
                g.put("idtype", "adid");
                zzfrp zzfrpVar = this.c;
                if (zzfrpVar.c()) {
                    g.put("paidv1_id_android_3p", zzfrpVar.b());
                    g.put("paidv1_creation_time_android_3p", zzfrpVar.a());
                    return;
                }
                return;
            }
            String str = this.b;
            if (str != null) {
                g.put("pdid", str);
                g.put("pdidtype", "ssaid");
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.l("Failed putting Ad ID.", e);
        }
    }
}
