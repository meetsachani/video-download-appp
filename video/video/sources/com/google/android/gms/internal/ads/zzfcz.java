package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfcz implements zzgcu {
    public final /* synthetic */ zzcfb a;
    public final /* synthetic */ zzcmn b;
    public final /* synthetic */ zzfjr c;
    public final /* synthetic */ zzebt d;

    public zzfcz(zzcfb zzcfbVar, zzcmn zzcmnVar, zzfjr zzfjrVar, zzebt zzebtVar) {
        this.a = zzcfbVar;
        this.b = zzcmnVar;
        this.c = zzfjrVar;
        this.d = zzebtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        boolean z;
        zzcmn zzcmnVar;
        String str = (String) obj;
        zzcfb zzcfbVar = this.a;
        zzfbu F = zzcfbVar.F();
        if (F != null && !F.i0) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = F.x0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qa)).booleanValue() && (zzcmnVar = this.b) != null && zzcmn.j(str)) {
                zzcmnVar.i(str, this.c, com.google.android.gms.ads.internal.client.zzbb.e(), zzvVar);
                return;
            } else {
                this.c.d(str, zzvVar, null, null);
                return;
            }
        }
        zzfbx I = zzcfbVar.I();
        if (I == null) {
            com.google.android.gms.ads.internal.zzv.t().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long a = com.google.android.gms.ads.internal.zzv.d().a();
        boolean a2 = com.google.android.gms.ads.internal.zzv.t().a(zzcfbVar.getContext());
        int i = 1;
        boolean z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u6)).booleanValue() && F != null && F.S) {
            z = true;
        } else {
            z = false;
        }
        if (F != null && F.d0 != null) {
            z2 = true;
        }
        if (a2 || z || z2) {
            i = 2;
        }
        this.d.h(new zzebv(a, I.b, str, i));
    }
}
