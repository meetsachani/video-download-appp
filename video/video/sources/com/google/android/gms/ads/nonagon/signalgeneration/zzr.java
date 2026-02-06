package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzchi;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhge;

/* loaded from: classes2.dex */
public final class zzr implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzr(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzo(((zzchi) this.a).a(), (zzdsi) this.b.b(), zzffn.c());
    }
}
