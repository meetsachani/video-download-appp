package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbca;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdrc implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzdrc(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set set;
        final String a = ((zzewh) this.a).a();
        Context a2 = ((zzchi) this.b).a();
        zzgdj c = zzffn.c();
        Map b = ((zzhfz) this.c).b();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q5)).booleanValue()) {
            zzbbt zzbbtVar = new zzbbt(new zzbbz(a2));
            zzbbtVar.b(new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdrd
                @Override // com.google.android.gms.internal.ads.zzbbs
                public final void a(zzbca.zzt.zza zzaVar) {
                    zzaVar.o2(a);
                }
            });
            set = Collections.singleton(new zzddq(new zzdrf(zzbbtVar, b), c));
        } else {
            set = Collections.EMPTY_SET;
        }
        zzhgd.b(set);
        return set;
    }
}
