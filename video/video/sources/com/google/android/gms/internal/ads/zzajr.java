package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.InterfaceC8800pd0;

/* loaded from: classes2.dex */
public final class zzajr implements zzadn {
    public zzadq a;
    public zzajz b;
    public boolean c;

    @InterfaceC8800pd0(expression = {"streamReader"}, result = true)
    public final boolean a(zzado zzadoVar) throws IOException {
        zzajt zzajtVar = new zzajt();
        if (zzajtVar.b(zzadoVar, true) && (zzajtVar.a & 2) == 2) {
            int min = Math.min(zzajtVar.e, 8);
            zzek zzekVar = new zzek(min);
            zzadoVar.J(zzekVar.n(), 0, min);
            zzekVar.l(0);
            if (zzekVar.u() >= 5 && zzekVar.G() == 127 && zzekVar.O() == 1179402563) {
                this.b = new zzajq();
            } else {
                zzekVar.l(0);
                try {
                    if (zzaez.d(1, zzekVar, true)) {
                        this.b = new zzakb();
                    }
                } catch (zzaz unused) {
                }
                zzekVar.l(0);
                if (zzajv.j(zzekVar)) {
                    this.b = new zzajv();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        zzajz zzajzVar = this.b;
        if (zzajzVar != null) {
            zzajzVar.i(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        try {
            return a(zzadoVar);
        } catch (zzaz unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.a = zzadqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        zzdc.b(this.a);
        if (this.b == null) {
            if (a(zzadoVar)) {
                zzadoVar.j();
            } else {
                throw zzaz.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            zzaet O = this.a.O(0, 1);
            this.a.N();
            this.b.g(this.a, O);
            this.c = true;
        }
        return this.b.d(zzadoVar, zzaejVar);
    }
}
