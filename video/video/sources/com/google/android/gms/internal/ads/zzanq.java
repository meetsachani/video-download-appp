package com.google.android.gms.internal.ads;

import o.C5588cW;

/* loaded from: classes2.dex */
final class zzanq {
    public final zzamr a;
    public final zzer b;
    public final zzej c = new zzej(new byte[64], 64);
    public boolean d;
    public boolean e;
    public boolean f;

    public zzanq(zzamr zzamrVar, zzer zzerVar) {
        this.a = zzamrVar;
        this.b = zzerVar;
    }

    public final void a(zzek zzekVar) throws zzaz {
        long j;
        char c;
        zzej zzejVar = this.c;
        zzekVar.h(zzejVar.a, 0, 3);
        zzejVar.l(0);
        zzejVar.n(8);
        this.d = zzejVar.p();
        this.e = zzejVar.p();
        zzejVar.n(6);
        zzekVar.h(zzejVar.a, 0, zzejVar.d(8));
        zzejVar.l(0);
        if (this.d) {
            zzejVar.n(4);
            long d = zzejVar.d(3);
            zzejVar.n(1);
            int d2 = zzejVar.d(15) << 15;
            zzejVar.n(1);
            long d3 = zzejVar.d(15);
            zzejVar.n(1);
            if (!this.f && this.e) {
                zzejVar.n(4);
                zzejVar.n(1);
                zzejVar.n(1);
                c = 30;
                zzejVar.n(1);
                this.b.b((zzejVar.d(3) << 30) | (zzejVar.d(15) << 15) | zzejVar.d(15));
                this.f = true;
            } else {
                c = C5588cW.p;
            }
            j = this.b.b((d << c) | d2 | d3);
        } else {
            j = 0;
        }
        zzamr zzamrVar = this.a;
        zzamrVar.c(j, 4);
        zzamrVar.b(zzekVar);
        zzamrVar.a(false);
    }

    public final void b() {
        this.f = false;
        this.a.d();
    }
}
