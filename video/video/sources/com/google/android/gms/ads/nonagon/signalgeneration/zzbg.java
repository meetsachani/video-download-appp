package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzden;
import com.google.android.gms.internal.ads.zzdrl;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhgd;
import com.google.android.gms.internal.ads.zzhge;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzbg implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;

    public zzbg(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
        this.f = zzhgeVar6;
        this.g = zzhgeVar7;
        this.h = zzhgeVar8;
        this.i = zzhgeVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        InterfaceFutureC8411o11 a;
        zzau zzauVar = (zzau) this.a.b();
        zzfgt zzfgtVar = (zzfgt) this.b.b();
        zzbi b = ((zzbj) this.c).b();
        zzcuw b2 = ((zzcux) this.d).b();
        zzden zzdenVar = (zzden) this.e.b();
        zzb zzbVar = (zzb) this.f.b();
        zzbyz zzbyzVar = (zzbyz) this.g.b();
        int intValue = ((Integer) this.h.b()).intValue();
        Bundle bundle = ((zzcvk) this.i).a().s;
        zzbk zzbkVar = null;
        if (intValue == 1 && zzbyzVar != null) {
            bundle.putLong(zzdrl.READ_FROM_DISK_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
            zzbkVar = zzbVar.a(zzbyzVar, zzauVar, bundle);
            bundle.putLong(zzdrl.READ_FROM_DISK_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        if (zzbkVar != null) {
            zzdenVar.n1(zzbkVar);
            a = zzgcy.h(zzbkVar);
        } else {
            a = zzfgtVar.b(zzfgn.GENERATE_SIGNALS, b2.c()).f(b).i(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P5)).intValue(), TimeUnit.SECONDS).a();
            zzgcy.r(a, new zzaw(zzdenVar), zzcaa.a);
        }
        zzhgd.b(a);
        return a;
    }
}
