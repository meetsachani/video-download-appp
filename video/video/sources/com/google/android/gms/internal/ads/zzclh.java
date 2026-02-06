package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzclh implements zzcld {
    public final com.google.android.gms.ads.internal.util.zzg a;

    public zzclh(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        this.a.N(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
