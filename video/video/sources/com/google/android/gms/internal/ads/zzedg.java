package com.google.android.gms.internal.ads;

import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzedg implements zzedf {
    @InterfaceC5056aJ2
    public final zzedf a;
    public final zzfur b;

    public zzedg(zzedf zzedfVar, zzfur zzfurVar) {
        this.a = zzedfVar;
        this.b = zzfurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        return this.a.a(zzfcgVar, zzfbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        return zzgcy.m(this.a.b(zzfcgVar, zzfbuVar), this.b, zzcaa.a);
    }
}
