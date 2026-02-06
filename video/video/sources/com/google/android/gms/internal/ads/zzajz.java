package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.InterfaceC8800pd0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzajz {
    public zzaet b;
    public zzadq c;
    public zzaju d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final zzajs a = new zzajs();
    public zzajw j = new zzajw();

    public abstract long a(zzek zzekVar);

    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new zzajw();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public abstract boolean c(zzek zzekVar, long j, zzajw zzajwVar) throws IOException;

    public final int d(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        boolean z;
        zzdc.b(this.b);
        String str = zzeu.a;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -1;
                }
                long a = this.d.a(zzadoVar);
                if (a >= 0) {
                    zzaejVar.a = a;
                    return 1;
                }
                if (a < -1) {
                    h(-(a + 2));
                }
                if (!this.l) {
                    zzaem d = this.d.d();
                    zzdc.b(d);
                    this.c.P(d);
                    this.b.f(d.a());
                    this.l = true;
                }
                if (this.k <= 0 && !this.a.e(zzadoVar)) {
                    this.h = 3;
                    return -1;
                }
                this.k = 0L;
                zzek a2 = this.a.a();
                long a3 = a(a2);
                if (a3 >= 0) {
                    long j = this.g;
                    if (j + a3 >= this.e) {
                        long e = e(j);
                        this.b.d(a2, a2.x());
                        this.b.c(e, 1, a2.x(), 0, null);
                        this.e = -1L;
                    }
                }
                this.g += a3;
                return 0;
            }
            zzadoVar.G((int) this.f);
            this.h = 2;
            return 0;
        }
        while (true) {
            zzajs zzajsVar = this.a;
            if (!zzajsVar.e(zzadoVar)) {
                this.h = 3;
                return -1;
            }
            long e2 = zzadoVar.e();
            long j2 = this.f;
            this.k = e2 - j2;
            if (c(zzajsVar.a(), j2, this.j)) {
                this.f = zzadoVar.e();
            } else {
                zzz zzzVar = this.j.a;
                this.i = zzzVar.F;
                if (!this.m) {
                    this.b.e(zzzVar);
                    this.m = true;
                }
                zzaju zzajuVar = this.j.b;
                if (zzajuVar != null) {
                    this.d = zzajuVar;
                } else if (zzadoVar.f() == -1) {
                    this.d = new zzajx(null);
                } else {
                    zzajt b = zzajsVar.b();
                    if ((b.a & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.d = new zzajo(this, this.f, zzadoVar.f(), b.d + b.e, b.b, z);
                }
                this.h = 2;
                zzajsVar.d();
                return 0;
            }
        }
    }

    public final long e(long j) {
        return (j * 1000000) / this.i;
    }

    public final long f(long j) {
        return (this.i * j) / 1000000;
    }

    public final void g(zzadq zzadqVar, zzaet zzaetVar) {
        this.c = zzadqVar;
        this.b = zzaetVar;
        b(true);
    }

    public void h(long j) {
        this.g = j;
    }

    public final void i(long j, long j2) {
        this.a.c();
        if (j == 0) {
            b(!this.l);
        } else if (this.h != 0) {
            long f = f(j2);
            this.e = f;
            zzaju zzajuVar = this.d;
            String str = zzeu.a;
            zzajuVar.t(f);
            this.h = 2;
        }
    }
}
