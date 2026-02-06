package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzii implements zzkw {
    public final zzmg X;
    public final zzih Y;
    @InterfaceC11300zs1
    public zzkw Y0;
    @InterfaceC11300zs1
    public zzlv Z;
    public boolean Z0 = true;
    public boolean a1;

    public zzii(zzih zzihVar, zzdg zzdgVar) {
        this.Y = zzihVar;
        this.X = new zzmg(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final long a() {
        if (this.Z0) {
            return this.X.a();
        }
        zzkw zzkwVar = this.Y0;
        zzkwVar.getClass();
        return zzkwVar.a();
    }

    public final long b(boolean z) {
        zzlv zzlvVar = this.Z;
        if (zzlvVar != null && !zzlvVar.x0() && ((!z || this.Z.n() == 2) && (this.Z.V() || (!z && !this.Z.d0())))) {
            zzkw zzkwVar = this.Y0;
            zzkwVar.getClass();
            long a = zzkwVar.a();
            if (this.Z0) {
                zzmg zzmgVar = this.X;
                if (a < zzmgVar.a()) {
                    zzmgVar.e();
                } else {
                    this.Z0 = false;
                    if (this.a1) {
                        zzmgVar.d();
                    }
                }
            }
            zzmg zzmgVar2 = this.X;
            zzmgVar2.b(a);
            zzbb c = zzkwVar.c();
            if (!c.equals(zzmgVar2.c())) {
                zzmgVar2.g(c);
                this.Y.b(c);
            }
        } else {
            this.Z0 = true;
            if (this.a1) {
                this.X.d();
            }
        }
        return a();
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final zzbb c() {
        zzkw zzkwVar = this.Y0;
        return zzkwVar != null ? zzkwVar.c() : this.X.c();
    }

    public final void d(zzlv zzlvVar) {
        if (zzlvVar == this.Z) {
            this.Y0 = null;
            this.Z = null;
            this.Z0 = true;
        }
    }

    public final void e(zzlv zzlvVar) throws zzik {
        zzkw zzkwVar;
        zzkw l = zzlvVar.l();
        if (l != null && l != (zzkwVar = this.Y0)) {
            if (zzkwVar == null) {
                this.Y0 = l;
                this.Z = zzlvVar;
                l.g(this.X.c());
                return;
            }
            throw zzik.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void f(long j) {
        this.X.b(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void g(zzbb zzbbVar) {
        zzkw zzkwVar = this.Y0;
        if (zzkwVar != null) {
            zzkwVar.g(zzbbVar);
            zzbbVar = this.Y0.c();
        }
        this.X.g(zzbbVar);
    }

    public final void h() {
        this.a1 = true;
        this.X.d();
    }

    public final void i() {
        this.a1 = false;
        this.X.e();
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean j() {
        if (this.Z0) {
            return false;
        }
        zzkw zzkwVar = this.Y0;
        zzkwVar.getClass();
        return zzkwVar.j();
    }
}
