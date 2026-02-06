package com.google.android.gms.internal.ads;

import o.C10980yZ;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzcdu implements zzks {
    public final zzzg a = new zzzg(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.google.android.gms.internal.ads.zzks
    public final /* synthetic */ boolean a(zzbl zzblVar, zzvb zzvbVar, long j) {
        zzdx.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void b(zzkr zzkrVar, zzxe zzxeVar, zzyq[] zzyqVarArr) {
        int i;
        this.f = 0;
        for (zzyq zzyqVar : zzyqVarArr) {
            if (zzyqVar != null) {
                int i2 = this.f;
                int i3 = zzyqVar.c().c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i = 131072;
                            if (i3 != 3 && i3 != 5 && i3 != 6) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            i = C10980yZ.u;
                        }
                    } else {
                        i = 13107200;
                    }
                } else {
                    i = C10980yZ.A;
                }
                this.f = i2 + i;
            }
        }
        this.a.f(this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean c(zzkr zzkrVar) {
        long j = zzkrVar.b;
        boolean z = true;
        boolean z2 = j > this.c ? false : j < this.b ? true : true;
        int a = this.a.a();
        int i = this.f;
        if (!z2 && (!z2 || !this.g || a >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void d(zzpc zzpcVar) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean e(zzkr zzkrVar) {
        long j = zzkrVar.d ? this.e : this.d;
        return j <= 0 || zzkrVar.b >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean f(zzpc zzpcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void g(zzpc zzpcVar) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final long h(zzpc zzpcVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void i(zzpc zzpcVar) {
        j(false);
    }

    @InterfaceC5056aJ2
    public final void j(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzzg k() {
        return this.a;
    }

    public final synchronized void l(int i) {
        this.d = i * 1000;
    }

    public final synchronized void m(int i) {
        this.e = i * 1000;
    }

    public final synchronized void n(int i) {
        this.c = i * 1000;
    }

    public final synchronized void o(int i) {
        this.b = i * 1000;
    }
}
