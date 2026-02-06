package com.google.android.gms.internal.ads;

import com.facebook.S;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbin implements zzbjw {
    public final zzbio a;

    public zzbin(zzbio zzbioVar) {
        this.a = zzbioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("App event with no name parameter.");
            return;
        }
        this.a.u(str, (String) map.get(S.R));
    }
}
