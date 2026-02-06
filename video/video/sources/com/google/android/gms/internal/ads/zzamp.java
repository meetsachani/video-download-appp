package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import o.C10323vs;
import o.C3307Iz;
import o.C4128Rj1;
import o.HS1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamp implements zzamr {
    public final zzek a;
    @InterfaceC11300zs1
    public final String c;
    public final int d;
    public String f;
    public zzaet g;
    public int i;
    public int j;
    public long k;
    public zzz l;
    public int m;
    public int n;
    public int h = 0;
    public long q = C10323vs.b;
    public final AtomicInteger b = new AtomicInteger();

    /* renamed from: o  reason: collision with root package name */
    public int f213o = -1;
    public int p = -1;
    public final String e = C4128Rj1.f601o;

    public zzamp(@InterfaceC11300zs1 String str, int i, int i2, String str2) {
        this.a = new zzek(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */
    @Override // com.google.android.gms.internal.ads.zzamr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzek zzekVar) throws zzaz {
        boolean z;
        int i;
        char c;
        char c2;
        char c3;
        int i2;
        boolean z2;
        int i3;
        int i4;
        byte b;
        int i5;
        byte b2;
        int i6;
        int i7;
        byte b3;
        int i8;
        zzdc.b(this.g);
        while (zzekVar.u() > 0) {
            int i9 = this.h;
            if (i9 == 0) {
                while (true) {
                    if (zzekVar.u() > 0) {
                        int i10 = this.j << 8;
                        this.j = i10;
                        int G = i10 | zzekVar.G();
                        this.j = G;
                        int i11 = zzadm.j;
                        if (G == 2147385345 || G == -25230976 || G == 536864768 || G == -14745368) {
                            i8 = 1;
                        } else if (G == 1683496997 || G == 622876772) {
                            i8 = 2;
                        } else if (G == 1078008818 || G == -233094848) {
                            i8 = 3;
                        } else if (G == 1908687592 || G == -398277519) {
                            i8 = 4;
                        } else {
                            i8 = 0;
                        }
                        this.n = i8;
                        if (i8 != 0) {
                            byte[] n = this.a.n();
                            int i12 = this.j;
                            n[0] = (byte) ((i12 >> 24) & 255);
                            n[1] = (byte) ((i12 >> 16) & 255);
                            n[2] = (byte) ((i12 >> 8) & 255);
                            n[3] = (byte) (i12 & 255);
                            this.i = 4;
                            this.j = 0;
                            if (i8 != 3 && i8 != 4) {
                                if (i8 == 1) {
                                    this.h = 1;
                                } else {
                                    this.h = 2;
                                }
                            } else {
                                this.h = 4;
                            }
                        }
                    }
                }
            } else if (i9 != 1) {
                if (i9 != 2) {
                    long j = 0;
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                int min = Math.min(zzekVar.u(), this.m - this.i);
                                this.g.d(zzekVar, min);
                                int i13 = this.i + min;
                                this.i = i13;
                                if (i13 == this.m) {
                                    if (this.q != C10323vs.b) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zzdc.f(z);
                                    zzaet zzaetVar = this.g;
                                    long j2 = this.q;
                                    if (this.n == 4) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    zzaetVar.c(j2, i, this.m, 0, null);
                                    this.q += this.k;
                                    this.h = 0;
                                }
                            } else {
                                zzek zzekVar2 = this.a;
                                if (g(zzekVar, zzekVar2.n(), this.p)) {
                                    zzadk e = zzadm.e(zzekVar2.n(), this.b);
                                    if (this.n == 3) {
                                        f(e);
                                    }
                                    this.m = e.d;
                                    long j3 = e.e;
                                    if (j3 != C10323vs.b) {
                                        j = j3;
                                    }
                                    this.k = j;
                                    zzekVar2.l(0);
                                    this.g.d(zzekVar2, this.p);
                                    this.h = 6;
                                }
                            }
                        } else {
                            zzek zzekVar3 = this.a;
                            if (g(zzekVar, zzekVar3.n(), 6)) {
                                int b4 = zzadm.b(zzekVar3.n());
                                this.p = b4;
                                int i14 = this.i;
                                if (i14 > b4) {
                                    int i15 = i14 - b4;
                                    this.i = i14 - i15;
                                    zzekVar.l(zzekVar.w() - i15);
                                }
                                this.h = 5;
                            }
                        }
                    } else {
                        zzek zzekVar4 = this.a;
                        if (g(zzekVar, zzekVar4.n(), this.f213o)) {
                            zzadk d = zzadm.d(zzekVar4.n());
                            f(d);
                            this.m = d.d;
                            long j4 = d.e;
                            if (j4 != C10323vs.b) {
                                j = j4;
                            }
                            this.k = j;
                            zzekVar4.l(0);
                            this.g.d(zzekVar4, this.f213o);
                            this.h = 6;
                        }
                    }
                } else {
                    zzek zzekVar5 = this.a;
                    if (g(zzekVar, zzekVar5.n(), 7)) {
                        this.f213o = zzadm.a(zzekVar5.n());
                        this.h = 3;
                    }
                }
            } else {
                zzek zzekVar6 = this.a;
                if (g(zzekVar, zzekVar6.n(), 18)) {
                    byte[] n2 = zzekVar6.n();
                    if (this.l == null) {
                        c2 = '\b';
                        c = 5;
                        zzz c4 = zzadm.c(n2, this.f, this.c, this.d, this.e, null);
                        this.l = c4;
                        this.g.e(c4);
                    } else {
                        c = 5;
                        c2 = '\b';
                    }
                    int i16 = zzadm.j;
                    byte b5 = n2[0];
                    if (b5 != -2) {
                        if (b5 != -1) {
                            if (b5 != 31) {
                                c3 = 7;
                                i2 = ((n2[c] & 3) << 12) | ((n2[6] & 255) << 4) | ((n2[7] & 240) >> 4);
                            } else {
                                c3 = 7;
                                i6 = (3 & n2[6]) << 12;
                                i7 = (n2[7] & 255) << 4;
                                b3 = n2[c2];
                            }
                        } else {
                            c3 = 7;
                            i6 = (3 & n2[7]) << 12;
                            i7 = (n2[6] & 255) << 4;
                            b3 = n2[9];
                        }
                        i3 = (i6 | i7 | ((b3 & 60) >> 2)) + 1;
                        z2 = true;
                        if (z2) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.m = i3;
                        if (b5 == -2) {
                            if (b5 != -1) {
                                if (b5 != 31) {
                                    i4 = (n2[4] & 1) << 6;
                                    b = n2[c];
                                } else {
                                    i4 = (n2[c] & 7) << 4;
                                    b2 = n2[6];
                                }
                            } else {
                                i4 = (n2[4] & 7) << 4;
                                b2 = n2[c3];
                            }
                            i5 = b2 & 60;
                            this.k = zzgbf.b(zzeu.O(((i4 | (i5 >> 2)) + 1) * 32, this.l.F));
                            zzekVar6.l(0);
                            this.g.d(zzekVar6, 18);
                            this.h = 6;
                        } else {
                            i4 = (n2[c] & 1) << 6;
                            b = n2[4];
                        }
                        i5 = b & C3307Iz.T;
                        this.k = zzgbf.b(zzeu.O(((i4 | (i5 >> 2)) + 1) * 32, this.l.F));
                        zzekVar6.l(0);
                        this.g.d(zzekVar6, 18);
                        this.h = 6;
                    } else {
                        c3 = 7;
                        i2 = ((3 & n2[4]) << 12) | ((n2[7] & 255) << 4) | ((n2[6] & 240) >> 4);
                    }
                    i3 = i2 + 1;
                    z2 = false;
                    if (z2) {
                    }
                    this.m = i3;
                    if (b5 == -2) {
                    }
                    i5 = b & C3307Iz.T;
                    this.k = zzgbf.b(zzeu.O(((i4 | (i5 >> 2)) + 1) * 32, this.l.F));
                    zzekVar6.l(0);
                    this.g.d(zzekVar6, 18);
                    this.h = 6;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.q = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = C10323vs.b;
        this.b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.f = zzaofVar.b();
        this.g = zzadqVar.O(zzaofVar.a(), 1);
    }

    @HS1({"output"})
    public final void f(zzadk zzadkVar) {
        int i;
        zzx b;
        int i2 = zzadkVar.b;
        if (i2 != -2147483647 && (i = zzadkVar.c) != -1) {
            zzz zzzVar = this.l;
            if (zzzVar == null || i != zzzVar.E || i2 != zzzVar.F || !Objects.equals(zzadkVar.a, zzzVar.f301o)) {
                zzz zzzVar2 = this.l;
                if (zzzVar2 == null) {
                    b = new zzx();
                } else {
                    b = zzzVar2.b();
                }
                b.o(this.f);
                b.e(this.e);
                b.E(zzadkVar.a);
                b.b(i);
                b.F(i2);
                b.s(this.c);
                b.C(this.d);
                zzz K = b.K();
                this.l = K;
                this.g.e(K);
            }
        }
    }

    public final boolean g(zzek zzekVar, byte[] bArr, int i) {
        int min = Math.min(zzekVar.u(), i - this.i);
        zzekVar.h(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
