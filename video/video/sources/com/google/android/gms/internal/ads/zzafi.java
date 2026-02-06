package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import o.C7220jC;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzafi {
    public final zzafh a;
    public final zzaet b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public zzafi(int i, zzafh zzafhVar, zzaet zzaetVar) {
        int i2;
        int i3;
        this.a = zzafhVar;
        int b = zzafhVar.b();
        boolean z = true;
        if (b != 1) {
            if (b == 2) {
                b = 2;
            } else {
                z = false;
            }
        }
        zzdc.d(z);
        if (b == 2) {
            i2 = C7220jC.n;
        } else {
            i2 = C7220jC.p;
        }
        this.c = h(i, i2);
        this.e = zzafhVar.c();
        this.b = zzaetVar;
        if (b == 2) {
            i3 = h(i, C7220jC.f773o);
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = zzafhVar.d;
    }

    public static int h(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final zzaek a(long j) {
        if (this.k != 0) {
            int i = (int) (j / i(1));
            int x = zzeu.x(this.n, i, true, true);
            if (this.n[x] == i) {
                zzaen j2 = j(x);
                return new zzaek(j2, j2);
            }
            zzaen j3 = j(x);
            int i2 = x + 1;
            if (i2 < this.m.length) {
                return new zzaek(j3, j(i2));
            }
            return new zzaek(j3, j3);
        }
        zzaen zzaenVar = new zzaen(0L, this.l);
        return new zzaek(zzaenVar, zzaenVar);
    }

    public final void b(long j, boolean z) {
        if (this.l == -1) {
            this.l = j;
        }
        if (z) {
            if (this.k == this.n.length) {
                long[] jArr = this.m;
                this.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.n;
                this.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.m;
            int i = this.k;
            jArr2[i] = j;
            this.n[i] = this.j;
            this.k = i + 1;
        }
        this.j++;
    }

    public final void c() {
        int i;
        this.m = Arrays.copyOf(this.m, this.k);
        this.n = Arrays.copyOf(this.n, this.k);
        if ((this.c & C7220jC.p) == 1651965952 && this.a.f != 0 && (i = this.k) > 0) {
            this.f = i;
        }
    }

    public final void d(int i) {
        this.g = i;
        this.h = i;
    }

    public final void e(long j) {
        if (this.k == 0) {
            this.i = 0;
            return;
        }
        this.i = this.n[zzeu.y(this.m, j, true, true)];
    }

    public final boolean f(int i) {
        return this.c == i || this.d == i;
    }

    public final boolean g(zzado zzadoVar) throws IOException {
        boolean z;
        int i = this.h;
        zzaet zzaetVar = this.b;
        int i2 = 0;
        int b = i - zzaetVar.b(zzadoVar, i, false);
        this.h = b;
        if (b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.g > 0) {
                long i3 = i(this.i);
                if (Arrays.binarySearch(this.n, this.i) >= 0) {
                    i2 = 1;
                }
                zzaetVar.c(i3, i2, this.g, 0, null);
            }
            this.i++;
        }
        return z;
    }

    public final long i(int i) {
        return (this.e * i) / this.f;
    }

    public final zzaen j(int i) {
        return new zzaen(this.n[i] * i(1), this.m[i]);
    }
}
