package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzank implements zzans {
    public zzz a;
    public zzer b;
    public zzaet c;

    public zzank(String str, String str2) {
        zzx zzxVar = new zzx();
        zzxVar.e(C4128Rj1.f601o);
        zzxVar.E(str);
        this.a = zzxVar.K();
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void a(zzer zzerVar, zzadq zzadqVar, zzaof zzaofVar) {
        this.b = zzerVar;
        zzaofVar.c();
        zzaet O = zzadqVar.O(zzaofVar.a(), 5);
        this.c = O;
        O.e(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void b(zzek zzekVar) {
        zzdc.b(this.b);
        String str = zzeu.a;
        long e = this.b.e();
        long f = this.b.f();
        if (e != C10323vs.b && f != C10323vs.b) {
            zzz zzzVar = this.a;
            if (f != zzzVar.t) {
                zzx b = zzzVar.b();
                b.I(f);
                zzz K = b.K();
                this.a = K;
                this.c.e(K);
            }
            int u = zzekVar.u();
            this.c.d(zzekVar, u);
            this.c.c(e, 1, u, 0, null);
        }
    }
}
