package com.google.android.gms.internal.ads;

import o.C10323vs;

/* loaded from: classes2.dex */
final class zzamz {
    public final zzaet a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public zzamz(zzaet zzaetVar) {
        this.a = zzaetVar;
    }

    public final void a(long j, int i, boolean z) {
        if (this.j && this.g) {
            this.m = this.c;
            this.j = false;
        } else if (!this.h && !this.g) {
        } else {
            if (z && this.i) {
                e(i + ((int) (j - this.b)));
            }
            this.k = this.b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f) {
            int i3 = this.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = z;
                this.f = false;
                return;
            }
            this.d = i3 + (i2 - i);
        }
    }

    public final void c() {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void d(long j, int i, int i2, long j2, boolean z) {
        boolean z2;
        boolean z3 = false;
        this.g = false;
        this.h = false;
        this.e = j2;
        this.d = 0;
        this.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.i && !this.j) {
                if (z) {
                    e(i);
                }
                this.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.h = !this.j;
                this.j = true;
            }
        }
        if (i2 >= 16 && i2 <= 21) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        if (z2 || i2 <= 9) {
            z3 = true;
        }
        this.f = z3;
    }

    public final void e(int i) {
        long j = this.l;
        if (j != C10323vs.b) {
            long j2 = this.b;
            long j3 = this.k;
            if (j2 != j3) {
                this.a.c(j, this.m ? 1 : 0, (int) (j2 - j3), i, null);
            }
        }
    }
}
