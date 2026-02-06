package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzclt implements zzcld {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzg b = com.google.android.gms.ads.internal.zzv.t().j();

    public zzclt(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.b;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzgVar.U(parseBoolean);
            if (parseBoolean) {
                com.google.android.gms.ads.internal.util.zzad.c(this.a);
            }
        }
    }
}
