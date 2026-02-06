package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import o.C10323vs;

/* loaded from: classes2.dex */
final class zzamx {
    public final zzaet a;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final byte[] d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;

    public zzamx(zzaet zzaetVar, boolean z, boolean z2) {
        this.a = zzaetVar;
        byte[] bArr = new byte[128];
        this.d = bArr;
        new zzft(bArr, 0, 0);
        this.h = false;
    }

    public final void a(zzfq zzfqVar) {
        this.c.append(zzfqVar.a, zzfqVar);
    }

    public final void b(zzfr zzfrVar) {
        this.b.append(zzfrVar.d, zzfrVar);
    }

    public final void c() {
        this.h = false;
    }

    public final void d(long j, int i, long j2, boolean z) {
        this.e = i;
        this.g = j2;
        this.f = j;
        this.l = z;
    }

    public final boolean e(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.e == 9) {
            if (z && this.h) {
                long j2 = this.f;
                int i2 = i + ((int) (j - j2));
                long j3 = this.j;
                if (j3 != C10323vs.b) {
                    long j4 = this.i;
                    if (j2 != j4) {
                        this.a.c(j3, this.k ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.i = this.f;
            this.j = this.g;
            this.k = false;
            this.h = true;
        }
        boolean z3 = this.l;
        boolean z4 = this.k;
        int i3 = this.e;
        if (i3 == 5 || (z3 && i3 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.k = z5;
        this.e = 24;
        return z5;
    }
}
