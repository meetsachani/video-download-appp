package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzchi;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhge;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzc implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;

    public zzc(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzb(((zzchi) this.a).a(), ((Long) this.b.b()).longValue(), (PackageInfo) this.c.b(), (zzd) this.d.b(), (ScheduledExecutorService) this.e.b());
    }
}
