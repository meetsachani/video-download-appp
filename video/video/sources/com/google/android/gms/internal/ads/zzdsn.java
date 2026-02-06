package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;

/* loaded from: classes2.dex */
public final class zzdsn implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzdsn(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
        this.d = zzhgeVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdsi(zzffn.c(), (com.google.android.gms.ads.internal.util.client.zzu) this.a.b(), ((CsiParamDefaults_Factory) this.b).b(), ((CsiUrlBuilder_Factory) this.c).b(), ((zzchi) this.d).a());
    }
}
