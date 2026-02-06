package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import o.C10323vs;
import o.C5865df1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* loaded from: classes2.dex */
public final class zzabl {
    public final zzabk a;
    public final zzabp b;
    public boolean c;
    public long f;
    public boolean i;
    public boolean l;
    public boolean m;
    public int d = 0;
    public long e = C10323vs.b;
    public long g = C10323vs.b;
    public long h = C10323vs.b;
    public float j = 1.0f;
    public zzdg k = zzdg.a;

    public zzabl(Context context, zzabk zzabkVar, long j) {
        this.a = zzabkVar;
        this.b = new zzabp(context);
    }

    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, zzabj zzabjVar) throws zzik {
        long j5;
        boolean z3;
        long j6;
        long j7;
        boolean z4;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        zzabj.g(zzabjVar);
        if (this.e == C10323vs.b) {
            this.e = j2;
        }
        if (this.g != j) {
            this.b.d(j);
            this.g = j;
        }
        long j13 = (long) ((j - j2) / this.j);
        if (this.c) {
            j13 -= zzeu.N(this.k.b()) - j3;
        }
        zzabjVar.a = j13;
        if (z && !z2) {
            return 3;
        }
        if (this.l) {
            j5 = zzabjVar.a;
            if (this.h != C10323vs.b && !this.i) {
                z3 = false;
            } else {
                int i = this.d;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                z3 = false;
                                long N = zzeu.N(this.k.b()) - this.f;
                                if (this.c && j5 < -30000 && N > 100000) {
                                    return 0;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            z3 = false;
                            if (j2 >= j4) {
                                return 0;
                            }
                        }
                    } else {
                        return 0;
                    }
                } else {
                    z3 = false;
                    if (this.c) {
                        return 0;
                    }
                }
            }
            if (!this.c || j2 == this.e) {
                return 5;
            }
            long c = this.k.c();
            zzabp zzabpVar = this.b;
            j6 = zzabjVar.a;
            zzabjVar.b = zzabpVar.a((j6 * 1000) + c);
            j7 = zzabjVar.b;
            zzabjVar.a = (j7 - c) / 1000;
            if (this.h != C10323vs.b && !this.i) {
                z4 = true;
            } else {
                z4 = z3;
            }
            zzabk zzabkVar = this.a;
            j8 = zzabjVar.a;
            if (!zzabkVar.i(j8, j2, j3, z2, z4)) {
                j9 = zzabjVar.a;
                if (j9 >= -30000 || z2) {
                    j10 = zzabjVar.a;
                    if (j10 > C5865df1.d.u) {
                        return 5;
                    }
                    return 1;
                } else if (z4) {
                    return 3;
                } else {
                    return 2;
                }
            }
            return 4;
        }
        this.m = true;
        zzabk zzabkVar2 = this.a;
        j11 = zzabjVar.a;
        if (zzabkVar2.i(j11, j2, j3, z2, true)) {
            return 4;
        }
        if (this.c) {
            j12 = zzabjVar.a;
            if (j12 < 30000) {
                return 3;
            }
        }
        return 5;
    }

    public final void b() {
        if (this.d == 0) {
            this.d = 1;
        }
    }

    public final void c(boolean z) {
        this.i = z;
        this.h = C10323vs.b;
    }

    public final void d() {
        this.c = true;
        this.f = zzeu.N(this.k.b());
        this.b.g();
    }

    public final void e() {
        this.c = false;
        this.h = C10323vs.b;
        this.b.h();
    }

    public final void f(int i) {
        if (i != 0) {
            if (i != 1) {
                o(2);
                return;
            } else {
                this.d = 0;
                return;
            }
        }
        this.d = 1;
    }

    public final void g() {
        this.b.f();
        this.g = C10323vs.b;
        this.e = C10323vs.b;
        o(1);
        this.h = C10323vs.b;
    }

    public final void h(int i) {
        this.b.j(i);
    }

    public final void i(zzdg zzdgVar) {
        this.k = zzdgVar;
    }

    public final void j(float f) {
        this.b.c(f);
    }

    public final void k(@InterfaceC11300zs1 Surface surface) {
        boolean z;
        if (surface != null) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = false;
        this.b.i(surface);
        o(1);
    }

    public final void l(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (f == this.j) {
            return;
        }
        this.j = f;
        this.b.e(f);
    }

    public final boolean m(boolean z) {
        if (z && (this.d == 3 || (!this.l && this.m))) {
            this.h = C10323vs.b;
            return true;
        } else if (this.h == C10323vs.b) {
            return false;
        } else {
            if (this.k.b() < this.h) {
                return true;
            }
            this.h = C10323vs.b;
            return false;
        }
    }

    public final boolean n() {
        int i = this.d;
        this.d = 3;
        this.f = zzeu.N(this.k.b());
        if (i != 3) {
            return true;
        }
        return false;
    }

    public final void o(int i) {
        this.d = Math.min(this.d, i);
    }
}
