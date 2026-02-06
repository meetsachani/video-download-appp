package com.google.android.gms.internal.ads;

import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzbow {
    public final zzbnz a;
    public InterfaceFutureC8411o11 b;

    public zzbow(zzbnz zzbnzVar) {
        this.a = zzbnzVar;
    }

    public final zzboz a(String str, zzbog zzbogVar, zzbof zzbofVar) {
        d();
        return new zzboz(this.b, "google.afma.activeView.handleUpdate", zzbogVar, zzbofVar);
    }

    public final void b(final String str, final zzbjw zzbjwVar) {
        d();
        this.b = zzgcy.n(this.b, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzbov
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                zzboa zzboaVar = (zzboa) obj;
                zzboaVar.x0(str, zzbjwVar);
                return zzgcy.h(zzboaVar);
            }
        }, zzcaa.g);
    }

    public final void c(final String str, final zzbjw zzbjwVar) {
        this.b = zzgcy.m(this.b, new zzfur() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                zzboa zzboaVar = (zzboa) obj;
                zzboaVar.v(str, zzbjwVar);
                return zzboaVar;
            }
        }, zzcaa.g);
    }

    public final void d() {
        if (this.b == null) {
            final zzcaf zzcafVar = new zzcaf();
            this.b = zzcafVar;
            this.a.b(null).f(new zzcaj() { // from class: com.google.android.gms.internal.ads.zzbot
                @Override // com.google.android.gms.internal.ads.zzcaj
                public final void b(Object obj) {
                    zzcaf.this.c((zzboa) obj);
                }
            }, new zzcah() { // from class: com.google.android.gms.internal.ads.zzbou
                @Override // com.google.android.gms.internal.ads.zzcah
                public final void a() {
                    zzcaf.this.d(new zzboc("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
