package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbca;

/* loaded from: classes2.dex */
public final class zzdqc implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;

    public zzdqc(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        int i;
        Context a = ((zzchi) this.a).a();
        final String b = ((zzdxa) this.b).b();
        VersionInfoParcel a2 = ((zzchw) this.c).a();
        final zzbca.zza.EnumC0104zza enumC0104zza = (zzbca.zza.EnumC0104zza) this.d.b();
        final String str = (String) this.e.b();
        zzbbt zzbbtVar = new zzbbt(new zzbbz(a));
        zzbca.zzar.zza C2 = zzbca.zzar.C2();
        C2.b2(a2.Y);
        C2.d2(a2.Z);
        if (true != a2.Y0) {
            i = 2;
        } else {
            i = 0;
        }
        C2.c2(i);
        final zzbca.zzar V1 = C2.V1();
        zzbbtVar.b(new zzbbs() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // com.google.android.gms.internal.ads.zzbbs
            public final void a(zzbca.zzt.zza zzaVar) {
                zzbca.zza.zzb s1 = zzaVar.d().s1();
                s1.f2(zzbca.zza.EnumC0104zza.this);
                zzaVar.e2(s1);
                zzbca.zzm.zza s12 = zzaVar.g().s1();
                s12.j2(b);
                s12.u2(V1);
                zzaVar.j2(s12);
                zzaVar.o2(str);
            }
        });
        return zzbbtVar;
    }
}
