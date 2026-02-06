package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import o.C10323vs;
import o.C4128Rj1;
import o.C8077mf;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamt implements zzamr {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public zzaet b;
    @InterfaceC11300zs1
    public final zzaoi c;
    public final String d;
    @InterfaceC11300zs1
    public final zzek e;
    @InterfaceC11300zs1
    public final zzanj f;
    public final boolean[] g = new boolean[4];
    public final zzams h = new zzams(128);
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f214o;
    public boolean p;
    public boolean q;

    public zzamt(@InterfaceC11300zs1 zzaoi zzaoiVar, String str) {
        zzek zzekVar;
        this.c = zzaoiVar;
        this.d = str;
        if (zzaoiVar != null) {
            this.f = new zzanj(178, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.f = null;
        }
        this.e = zzekVar;
        this.m = C10323vs.b;
        this.f214o = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        zzdc.b(this.b);
        if (z) {
            boolean z2 = this.p;
            long j = this.i - this.n;
            this.b.c(this.f214o, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    @Override // com.google.android.gms.internal.ads.zzamr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzek zzekVar) {
        int i;
        zzanj zzanjVar;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        long j3;
        byte b;
        int i8;
        int i9;
        zzdc.b(this.b);
        int w = zzekVar.w();
        int x = zzekVar.x();
        byte[] n = zzekVar.n();
        this.i += zzekVar.u();
        this.b.d(zzekVar, zzekVar.u());
        while (true) {
            int a = zzfs.a(n, w, x, this.g);
            if (a == x) {
                break;
            }
            int i10 = a + 3;
            int i11 = zzekVar.n()[i10] & 255;
            int i12 = a - w;
            if (!this.k) {
                if (i12 > 0) {
                    this.h.a(n, w, a);
                }
                if (i12 < 0) {
                    i4 = -i12;
                } else {
                    i4 = 0;
                }
                zzams zzamsVar = this.h;
                if (zzamsVar.c(i11, i4)) {
                    String str = this.a;
                    str.getClass();
                    String str2 = this.d;
                    byte[] copyOf = Arrays.copyOf(zzamsVar.d, zzamsVar.b);
                    byte b2 = copyOf[5];
                    i = x;
                    int i13 = copyOf[6] & 255;
                    int i14 = ((copyOf[4] & 255) << 4) | ((b2 & 255) >> 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = ((b2 & C8077mf.q) << 8) | i13;
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                f = 1.0f;
                                zzx zzxVar = new zzx();
                                zzxVar.o(str);
                                zzxVar.e(str2);
                                zzxVar.E(C4128Rj1.s);
                                zzxVar.J(i14);
                                zzxVar.m(i16);
                                zzxVar.z(f);
                                zzxVar.p(Collections.singletonList(copyOf));
                                zzz K = zzxVar.K();
                                i7 = (copyOf[7] & C8077mf.q) - 1;
                                j3 = 0;
                                if (i7 >= 0 && i7 < 8) {
                                    double d = r[i7];
                                    b = copyOf[zzamsVar.c + 9];
                                    i8 = (b & 96) >> 5;
                                    if (i8 != (b & 31)) {
                                        d *= (i8 + 1.0d) / (i9 + 1);
                                    }
                                    j3 = (long) (1000000.0d / d);
                                }
                                Pair create = Pair.create(K, Long.valueOf(j3));
                                this.b.e((zzz) create.first);
                                this.l = ((Long) create.second).longValue();
                                this.k = true;
                                zzanjVar = this.f;
                                if (zzanjVar != null) {
                                    if (i12 > 0) {
                                        zzanjVar.a(n, w, a);
                                        i3 = 0;
                                    } else {
                                        i3 = -i12;
                                    }
                                    if (zzanjVar.d(i3)) {
                                        int c = zzfs.c(zzanjVar.d, zzanjVar.e);
                                        zzek zzekVar2 = this.e;
                                        String str3 = zzeu.a;
                                        zzekVar2.j(zzanjVar.d, c);
                                        this.c.a(this.f214o, zzekVar2);
                                    }
                                    if (i11 == 178) {
                                        if (zzekVar.n()[a + 2] == 1) {
                                            zzanjVar.c(178);
                                        }
                                        i11 = 178;
                                    }
                                }
                                if (i11 == 0 && i11 != 179) {
                                    if (i11 == 184) {
                                        this.p = true;
                                    }
                                } else {
                                    i2 = i - a;
                                    if (!this.q && this.k) {
                                        j = -9223372036854775807L;
                                        long j4 = this.f214o;
                                        if (j4 != C10323vs.b) {
                                            boolean z4 = this.p;
                                            int i17 = ((int) (this.i - this.n)) - i2;
                                            zzaet zzaetVar = this.b;
                                            j = C10323vs.b;
                                            zzaetVar.c(j4, z4 ? 1 : 0, i17, i2, null);
                                        }
                                    } else {
                                        j = -9223372036854775807L;
                                    }
                                    if (!this.j && !this.q) {
                                        z2 = true;
                                        z = false;
                                    } else {
                                        this.n = this.i - i2;
                                        j2 = this.m;
                                        if (j2 == j) {
                                            long j5 = this.f214o;
                                            if (j5 != j) {
                                                j2 = j5 + this.l;
                                            } else {
                                                j2 = j;
                                            }
                                        }
                                        this.f214o = j2;
                                        z = false;
                                        this.p = false;
                                        this.m = j;
                                        z2 = true;
                                        this.j = true;
                                    }
                                    if (i11 == 0) {
                                        z3 = z2;
                                    } else {
                                        z3 = z;
                                    }
                                    this.q = z3;
                                }
                                w = i10;
                                x = i;
                            } else {
                                i5 = i16 * 121;
                                i6 = i14 * 100;
                            }
                        } else {
                            i5 = i16 * 16;
                            i6 = i14 * 9;
                        }
                    } else {
                        i5 = i16 * 4;
                        i6 = i14 * 3;
                    }
                    f = i5 / i6;
                    zzx zzxVar2 = new zzx();
                    zzxVar2.o(str);
                    zzxVar2.e(str2);
                    zzxVar2.E(C4128Rj1.s);
                    zzxVar2.J(i14);
                    zzxVar2.m(i16);
                    zzxVar2.z(f);
                    zzxVar2.p(Collections.singletonList(copyOf));
                    zzz K2 = zzxVar2.K();
                    i7 = (copyOf[7] & C8077mf.q) - 1;
                    j3 = 0;
                    if (i7 >= 0) {
                        double d2 = r[i7];
                        b = copyOf[zzamsVar.c + 9];
                        i8 = (b & 96) >> 5;
                        if (i8 != (b & 31)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(K2, Long.valueOf(j3));
                    this.b.e((zzz) create2.first);
                    this.l = ((Long) create2.second).longValue();
                    this.k = true;
                    zzanjVar = this.f;
                    if (zzanjVar != null) {
                    }
                    if (i11 == 0) {
                    }
                    i2 = i - a;
                    if (!this.q) {
                    }
                    j = -9223372036854775807L;
                    if (!this.j) {
                    }
                    this.n = this.i - i2;
                    j2 = this.m;
                    if (j2 == j) {
                    }
                    this.f214o = j2;
                    z = false;
                    this.p = false;
                    this.m = j;
                    z2 = true;
                    this.j = true;
                    if (i11 == 0) {
                    }
                    this.q = z3;
                    w = i10;
                    x = i;
                }
            }
            i = x;
            zzanjVar = this.f;
            if (zzanjVar != null) {
            }
            if (i11 == 0) {
            }
            i2 = i - a;
            if (!this.q) {
            }
            j = -9223372036854775807L;
            if (!this.j) {
            }
            this.n = this.i - i2;
            j2 = this.m;
            if (j2 == j) {
            }
            this.f214o = j2;
            z = false;
            this.p = false;
            this.m = j;
            z2 = true;
            this.j = true;
            if (i11 == 0) {
            }
            this.q = z3;
            w = i10;
            x = i;
        }
        if (!this.k) {
            this.h.a(n, w, x);
        }
        zzanj zzanjVar2 = this.f;
        if (zzanjVar2 != null) {
            zzanjVar2.a(n, w, x);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.m = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        zzfs.i(this.g);
        this.h.b();
        zzanj zzanjVar = this.f;
        if (zzanjVar != null) {
            zzanjVar.b();
        }
        this.i = 0L;
        this.j = false;
        this.m = C10323vs.b;
        this.f214o = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.a = zzaofVar.b();
        this.b = zzadqVar.O(zzaofVar.a(), 2);
        zzaoi zzaoiVar = this.c;
        if (zzaoiVar != null) {
            zzaoiVar.b(zzadqVar, zzaofVar);
        }
    }
}
