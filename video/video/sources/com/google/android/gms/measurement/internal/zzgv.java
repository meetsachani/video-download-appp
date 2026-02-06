package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import o.Y61;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgv extends Y61<String, com.google.android.gms.internal.measurement.zzb> {
    public final /* synthetic */ zzgp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgv(zzgp zzgpVar, int i) {
        super(20);
        this.j = zzgpVar;
    }

    @Override // o.Y61
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzb a(String str) {
        String str2 = str;
        Preconditions.l(str2);
        return zzgp.z(this.j, str2);
    }
}
