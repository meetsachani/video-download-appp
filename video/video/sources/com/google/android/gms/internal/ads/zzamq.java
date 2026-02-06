package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzamq implements zzamr {
    public final List a;
    public final zzaet[] c;
    public boolean d;
    public int e;
    public int f;
    public final String b = C4128Rj1.f601o;
    public long g = C10323vs.b;

    public zzamq(List list, String str) {
        this.a = list;
        this.c = new zzaet[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        boolean z2;
        if (this.d) {
            if (this.g != C10323vs.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzdc.f(z2);
            for (zzaet zzaetVar : this.c) {
                zzaetVar.c(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) {
        zzaet[] zzaetVarArr;
        if (this.d) {
            if (this.e != 2 || f(zzekVar, 32)) {
                if (this.e != 1 || f(zzekVar, 0)) {
                    int w = zzekVar.w();
                    int u = zzekVar.u();
                    for (zzaet zzaetVar : this.c) {
                        zzekVar.l(w);
                        zzaetVar.d(zzekVar, u);
                    }
                    this.f += u;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = j;
        this.f = 0;
        this.e = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.d = false;
        this.g = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        int i = 0;
        while (true) {
            zzaet[] zzaetVarArr = this.c;
            if (i < zzaetVarArr.length) {
                zzaoc zzaocVar = (zzaoc) this.a.get(i);
                zzaofVar.c();
                zzaet O = zzadqVar.O(zzaofVar.a(), 3);
                zzx zzxVar = new zzx();
                zzxVar.o(zzaofVar.b());
                zzxVar.e(this.b);
                zzxVar.E(C4128Rj1.K0);
                zzxVar.p(Collections.singletonList(zzaocVar.b));
                zzxVar.s(zzaocVar.a);
                O.e(zzxVar.K());
                zzaetVarArr[i] = O;
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean f(zzek zzekVar, int i) {
        if (zzekVar.u() == 0) {
            return false;
        }
        if (zzekVar.G() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }
}
