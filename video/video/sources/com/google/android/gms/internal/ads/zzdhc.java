package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdhc implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;

    public zzdhc(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
        this.f = zzhgeVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzcva a = ((zzcvl) this.b).a();
        zzdbr a2 = ((zzdcm) this.c).a();
        zzdgr a3 = ((zzdgt) this.d).a();
        zzcyq b = ((zzcoo) this.e).b();
        zzegu zzeguVar = (zzegu) this.f.b();
        zzcpt i = ((zzchb) this.a.b()).i();
        i.i(a.l());
        i.m(a2);
        i.b(a3);
        i.q(new zzeja(null));
        i.r(new zzcqp(b, null));
        i.c(new zzcom(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U3)).booleanValue()) {
            i.t(zzehd.b(zzeguVar));
        }
        zzcra b2 = i.k().b();
        zzhgd.b(b2);
        return b2;
    }
}
