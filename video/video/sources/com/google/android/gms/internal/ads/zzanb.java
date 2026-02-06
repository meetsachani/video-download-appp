package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C4128Rj1;
import o.NL0;

/* loaded from: classes2.dex */
public final class zzanb implements zzamr {
    public zzaet c;
    public boolean d;
    public int f;
    public int g;
    public final String a = C4128Rj1.f601o;
    public final zzek b = new zzek(10);
    public long e = C10323vs.b;

    public zzanb(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        int i;
        boolean z2;
        zzdc.b(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            if (this.e != C10323vs.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzdc.f(z2);
            this.c.c(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) {
        zzdc.b(this.c);
        if (!this.d) {
            return;
        }
        int u = zzekVar.u();
        int i = this.g;
        if (i < 10) {
            int min = Math.min(u, 10 - i);
            byte[] n = zzekVar.n();
            int w = zzekVar.w();
            zzek zzekVar2 = this.b;
            System.arraycopy(n, w, zzekVar2.n(), this.g, min);
            if (this.g + min == 10) {
                zzekVar2.l(0);
                if (zzekVar2.G() == 73 && zzekVar2.G() == 68 && zzekVar2.G() == 51) {
                    zzekVar2.m(3);
                    this.f = zzekVar2.F() + 10;
                } else {
                    zzdx.f(NL0.g, "Discarding invalid ID3 tag");
                    this.d = false;
                    return;
                }
            }
        }
        int min2 = Math.min(u, this.f - this.g);
        this.c.d(zzekVar, min2);
        this.g += min2;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = j;
        this.f = 0;
        this.g = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.d = false;
        this.e = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        zzaet O = zzadqVar.O(zzaofVar.a(), 5);
        this.c = O;
        zzx zzxVar = new zzx();
        zzxVar.o(zzaofVar.b());
        zzxVar.e(this.a);
        zzxVar.E(C4128Rj1.w0);
        O.e(zzxVar.K());
    }
}
