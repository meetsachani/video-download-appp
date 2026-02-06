package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzuf implements zzuz, zzuy {
    public final zzuz X;
    @InterfaceC11300zs1
    public zzuy Y;
    public long Z0;
    public zzue[] Z = new zzue[0];
    public long Y0 = 0;

    public zzuf(zzuz zzuzVar, boolean z, long j, long j2) {
        this.X = zzuzVar;
        this.Z0 = j2;
    }

    public static long n(long j, long j2, long j3) {
        int i = (j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1));
        long max = Math.max(j, j2);
        if (i != 0) {
            return Math.min(max, j3);
        }
        return max;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        return this.X.a(zzkvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long b() {
        long b = this.X.b();
        if (b != Long.MIN_VALUE) {
            long j = this.Z0;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long c() {
        long c = this.X.c();
        if (c != Long.MIN_VALUE) {
            long j = this.Z0;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        this.X.d(j);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long e(long j, zzmd zzmdVar) {
        long j2;
        if (j == 0) {
            return 0L;
        }
        long j3 = zzmdVar.a;
        String str = zzeu.a;
        long max = Math.max(0L, Math.min(j3, j));
        long j4 = zzmdVar.b;
        long j5 = this.Z0;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long max2 = Math.max(0L, Math.min(j4, j2));
        if (max != j3 || max2 != j4) {
            zzmdVar = new zzmd(max, max2);
        }
        return this.X.e(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long f() {
        if (l()) {
            long j = this.Y0;
            this.Y0 = C10323vs.b;
            long f = f();
            if (f != C10323vs.b) {
                return f;
            }
            return j;
        }
        long f2 = this.X.f();
        if (f2 == C10323vs.b) {
            return C10323vs.b;
        }
        return n(f2, 0L, this.Z0);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzxe g() {
        return this.X.g();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ void h(zzwv zzwvVar) {
        zzuz zzuzVar = (zzuz) zzwvVar;
        zzuy zzuyVar = this.Y;
        zzuyVar.getClass();
        zzuyVar.h(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void i(zzuz zzuzVar) {
        zzuy zzuyVar = this.Y;
        zzuyVar.getClass();
        zzuyVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void j() throws IOException {
        this.X.j();
    }

    public final void k(long j, long j2) {
        this.Z0 = j2;
    }

    public final boolean l() {
        return this.Y0 != C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void m(zzuy zzuyVar, long j) {
        this.Y = zzuyVar;
        this.X.m(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        return this.X.o();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void p(long j, boolean z) {
        this.X.p(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long q(zzyq[] zzyqVarArr, boolean[] zArr, zzwt[] zzwtVarArr, boolean[] zArr2, long j) {
        int length = zzwtVarArr.length;
        this.Z = new zzue[length];
        zzwt[] zzwtVarArr2 = new zzwt[length];
        int i = 0;
        while (true) {
            zzwt zzwtVar = null;
            if (i >= zzwtVarArr.length) {
                break;
            }
            zzue[] zzueVarArr = this.Z;
            zzue zzueVar = (zzue) zzwtVarArr[i];
            zzueVarArr[i] = zzueVar;
            if (zzueVar != null) {
                zzwtVar = zzueVar.a;
            }
            zzwtVarArr2[i] = zzwtVar;
            i++;
        }
        long q = this.X.q(zzyqVarArr, zArr, zzwtVarArr2, zArr2, j);
        long n = n(q, j, this.Z0);
        boolean l = l();
        long j2 = C10323vs.b;
        if (l) {
            if (q >= j) {
                if (q != 0) {
                    for (zzyq zzyqVar : zzyqVarArr) {
                        if (zzyqVar != null) {
                            zzz b = zzyqVar.b();
                            if (!zzay.f(b.f301o, b.k)) {
                            }
                        }
                    }
                }
            }
            j2 = n;
            break;
        }
        this.Y0 = j2;
        for (int i2 = 0; i2 < zzwtVarArr.length; i2++) {
            zzwt zzwtVar2 = zzwtVarArr2[i2];
            if (zzwtVar2 == null) {
                this.Z[i2] = null;
            } else {
                zzue[] zzueVarArr2 = this.Z;
                zzue zzueVar2 = zzueVarArr2[i2];
                if (zzueVar2 == null || zzueVar2.a != zzwtVar2) {
                    zzueVarArr2[i2] = new zzue(this, zzwtVar2);
                }
            }
            zzwtVarArr[i2] = this.Z[i2];
        }
        return n;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long w(long j) {
        zzue[] zzueVarArr;
        this.Y0 = C10323vs.b;
        for (zzue zzueVar : this.Z) {
            if (zzueVar != null) {
                zzueVar.c();
            }
        }
        return n(this.X.w(j), 0L, this.Z0);
    }
}
