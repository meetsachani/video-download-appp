package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkc implements zzbjw {
    public final Context a;
    public final Map b;

    public zzbkc(Context context, Map map) {
        this.a = context;
        this.b = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        char c;
        zzbyj s = com.google.android.gms.ads.internal.zzv.s();
        Context context = this.a;
        if (!s.p(context)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                com.google.android.gms.ads.internal.zzv.s().h(context, str2);
                return;
            }
            com.google.android.gms.ads.internal.zzv.s().k(context, str2, (Map) this.b.get("_ai"));
            return;
        }
        com.google.android.gms.ads.internal.zzv.s().j(context, str2, (Map) this.b.get("_ac"));
    }
}
