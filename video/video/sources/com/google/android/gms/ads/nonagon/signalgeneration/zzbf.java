package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzgdj;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhge;

/* loaded from: classes2.dex */
public final class zzbf implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzbf(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzdek zzdekVar = (zzw) this.a.b();
        zzdek zzdekVar2 = (zzbm) this.b.b();
        zzgdj c = zzffn.c();
        if (((Integer) this.c.b()).intValue() == 2) {
            zzdekVar = zzdekVar2;
        }
        return new zzddq(zzdekVar, c);
    }
}
