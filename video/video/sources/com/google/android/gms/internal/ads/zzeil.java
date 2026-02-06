package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzeil implements zzcxc {
    public boolean a = false;
    public final /* synthetic */ zzedi b;
    public final /* synthetic */ zzcaf c;

    public zzeil(zzeim zzeimVar, zzedi zzediVar, zzcaf zzcafVar) {
        this.b = zzediVar;
        this.c = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void a(int i, @InterfaceC11300zs1 String str) {
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (str == null) {
                str = zzeim.e(this.b.a, i);
            }
            b(new com.google.android.gms.ads.internal.client.zze(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L5)).booleanValue()) {
            i = 3;
        }
        this.c.d(new zzedj(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void d1(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void f() {
        this.c.c(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void u(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        b(new com.google.android.gms.ads.internal.client.zze(i, zzeim.e(this.b.a, i), "undefined", null, null));
    }
}
