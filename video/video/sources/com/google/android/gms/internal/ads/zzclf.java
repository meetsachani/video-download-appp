package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzclf implements zzcld {
    public final com.google.android.gms.ads.internal.util.zzg a;

    public zzclf(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        this.a.W(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
