package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzdhq implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzdhq(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdds((Context) this.a.b(), new HashSet(), ((zzcro) this.b).a());
    }
}
