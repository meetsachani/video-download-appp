package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzaeo implements zzadn {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public zzadq f;
    public zzaet g;

    public zzaeo(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        boolean z;
        int i = this.a;
        if (i != -1 && this.b != -1) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        int i2 = this.b;
        zzek zzekVar = new zzek(i2);
        ((zzadd) zzadoVar).F(zzekVar.n(), 0, i2, false);
        if (zzekVar.K() == i) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.f = zzadqVar;
        zzaet O = zzadqVar.O(1024, 4);
        this.g = O;
        zzx zzxVar = new zzx();
        String str = this.c;
        zzxVar.e(str);
        zzxVar.E(str);
        O.e(zzxVar.K());
        this.f.N();
        this.f.P(new zzaep(C10323vs.b));
        this.e = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaet zzaetVar = this.g;
        zzaetVar.getClass();
        int b = zzaetVar.b(zzadoVar, 1024, true);
        if (b == -1) {
            this.e = 2;
            this.g.c(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += b;
        }
        return 0;
    }
}
