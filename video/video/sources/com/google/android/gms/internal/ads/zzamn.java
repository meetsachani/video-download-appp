package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import o.C10323vs;
import o.C4128Rj1;
import o.InterfaceC11300zs1;
import o.M7;

/* loaded from: classes2.dex */
public final class zzamn implements zzamr {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    @InterfaceC11300zs1
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public zzaet h;
    public zzaet i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public zzaet v;
    public long w;
    public final zzej b = new zzej(new byte[7], 7);
    public final zzek c = new zzek(Arrays.copyOf(x, 10));

    /* renamed from: o  reason: collision with root package name */
    public int f212o = -1;
    public int p = -1;
    public long s = C10323vs.b;
    public long u = C10323vs.b;

    public zzamn(boolean z, @InterfaceC11300zs1 String str, int i, String str2) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
        h();
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    public static final boolean l(byte b, byte b2) {
        return f((b2 & 255) | 65280);
    }

    public static final boolean m(zzek zzekVar, byte[] bArr, int i) {
        if (zzekVar.u() < i) {
            return false;
        }
        zzekVar.h(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) throws zzaz {
        int i;
        int i2;
        byte b;
        char c;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        this.h.getClass();
        String str = zzeu.a;
        while (zzekVar.u() > 0) {
            int i6 = this.j;
            char c2 = 7;
            int i7 = 3;
            boolean z3 = false;
            int i8 = 2;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            int min = Math.min(zzekVar.u(), this.t - this.k);
                            this.v.d(zzekVar, min);
                            int i9 = this.k + min;
                            this.k = i9;
                            if (i9 == this.t) {
                                if (this.u != C10323vs.b) {
                                    z3 = true;
                                }
                                zzdc.f(z3);
                                this.v.c(this.u, 1, this.t, 0, null);
                                this.u += this.w;
                                h();
                            }
                        } else {
                            if (true != this.m) {
                                i = 5;
                            } else {
                                i = 7;
                            }
                            zzej zzejVar = this.b;
                            if (k(zzekVar, zzejVar.a, i)) {
                                zzejVar.l(0);
                                if (!this.r) {
                                    int d = zzejVar.d(2) + 1;
                                    if (d != 2) {
                                        zzdx.f(M7.v, "Detected audio object type: " + d + ", but assuming AAC LC.");
                                    }
                                    zzejVar.n(5);
                                    int d2 = zzejVar.d(3);
                                    int i10 = this.p;
                                    int i11 = zzack.c;
                                    byte[] bArr = {(byte) (((i10 >> 1) & 7) | 16), (byte) (((d2 << 3) & 120) | ((i10 << 7) & 128))};
                                    zzaci a = zzack.a(bArr);
                                    zzx zzxVar = new zzx();
                                    zzxVar.o(this.g);
                                    zzxVar.e(this.f);
                                    zzxVar.E("audio/mp4a-latm");
                                    zzxVar.c(a.c);
                                    zzxVar.b(a.b);
                                    zzxVar.F(a.a);
                                    zzxVar.p(Collections.singletonList(bArr));
                                    zzxVar.s(this.d);
                                    zzxVar.C(this.e);
                                    zzz K = zzxVar.K();
                                    this.s = 1024000000 / K.F;
                                    this.h.e(K);
                                    this.r = true;
                                } else {
                                    zzejVar.n(10);
                                }
                                zzejVar.n(4);
                                int d3 = zzejVar.d(13);
                                int i12 = d3 - 7;
                                if (this.m) {
                                    i12 = d3 - 9;
                                }
                                j(this.h, this.s, 0, i12);
                            }
                        }
                    } else {
                        zzek zzekVar2 = this.c;
                        if (k(zzekVar, zzekVar2.n(), 10)) {
                            this.i.d(zzekVar2, 10);
                            zzekVar2.l(6);
                            j(this.i, 0L, 10, zzekVar2.F() + 10);
                        }
                    }
                } else if (zzekVar.u() != 0) {
                    zzej zzejVar2 = this.b;
                    zzejVar2.a[0] = zzekVar.n()[zzekVar.w()];
                    zzejVar2.l(2);
                    int d4 = zzejVar2.d(4);
                    int i13 = this.p;
                    if (i13 != -1 && d4 != i13) {
                        g();
                    } else {
                        if (!this.n) {
                            this.n = true;
                            this.f212o = this.q;
                            this.p = d4;
                        }
                        i();
                    }
                }
            } else {
                byte[] n = zzekVar.n();
                int w = zzekVar.w();
                int x2 = zzekVar.x();
                while (true) {
                    if (w < x2) {
                        i2 = w + 1;
                        b = n[w];
                        int i14 = b & 255;
                        int i15 = i7;
                        if (this.l == 512 && l((byte) -1, (byte) i14)) {
                            if (this.n) {
                                break;
                            }
                            int i16 = w - 1;
                            zzekVar.l(w);
                            zzej zzejVar3 = this.b;
                            if (m(zzekVar, zzejVar3.a, 1)) {
                                zzejVar3.l(4);
                                int d5 = zzejVar3.d(1);
                                int i17 = this.f212o;
                                if (i17 == -1 || d5 == i17) {
                                    if (this.p != -1) {
                                        if (!m(zzekVar, zzejVar3.a, 1)) {
                                            break;
                                        }
                                        zzejVar3.l(i8);
                                        if (zzejVar3.d(4) == this.p) {
                                            zzekVar.l(w + 1);
                                        }
                                    }
                                    if (!m(zzekVar, zzejVar3.a, 4)) {
                                        break;
                                    }
                                    zzejVar3.l(14);
                                    int d6 = zzejVar3.d(13);
                                    c = 7;
                                    if (d6 >= 7) {
                                        byte[] n2 = zzekVar.n();
                                        int x3 = zzekVar.x();
                                        int i18 = i16 + d6;
                                        if (i18 < x3) {
                                            byte b2 = n2[i18];
                                            if (b2 == -1) {
                                                int i19 = i18 + 1;
                                                if (i19 == x3) {
                                                    break;
                                                }
                                                byte b3 = n2[i19];
                                                if (l((byte) -1, b3) && ((b3 & 8) >> 3) == d5) {
                                                    break;
                                                }
                                            } else if (b2 == 73) {
                                                int i20 = i18 + 1;
                                                if (i20 == x3) {
                                                    break;
                                                } else if (n2[i20] == 68) {
                                                    int i21 = i18 + 2;
                                                    if (i21 == x3) {
                                                        break;
                                                    } else if (n2[i21] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            c = 7;
                        } else {
                            c = c2;
                        }
                        int i22 = this.l;
                        int i23 = i22 | i14;
                        if (i23 != 329) {
                            if (i23 != 511) {
                                if (i23 != 836) {
                                    if (i23 != 1075) {
                                        if (i22 != 256) {
                                            this.l = 256;
                                            c2 = c;
                                            i7 = i15;
                                            i8 = 2;
                                        } else {
                                            i3 = i15;
                                            i4 = 2;
                                            z = false;
                                            w = i2;
                                            i7 = i3;
                                            c2 = c;
                                            i8 = i4;
                                        }
                                    } else {
                                        this.j = 2;
                                        this.k = i15;
                                        this.t = 0;
                                        this.c.l(0);
                                        zzekVar.l(i2);
                                        break;
                                    }
                                } else {
                                    i3 = i15;
                                    i4 = 2;
                                    z = false;
                                    i5 = 1024;
                                }
                            } else {
                                i3 = i15;
                                i4 = 2;
                                z = false;
                                i5 = 512;
                            }
                        } else {
                            i3 = i15;
                            i4 = 2;
                            z = false;
                            i5 = 768;
                        }
                        this.l = i5;
                        w = i2;
                        i7 = i3;
                        c2 = c;
                        i8 = i4;
                    } else {
                        zzekVar.l(w);
                        break;
                    }
                }
                this.q = (b & 8) >> 3;
                if (1 != ((b & 1) ^ 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.m = z2;
                if (!this.n) {
                    this.j = 1;
                    this.k = 0;
                } else {
                    i();
                }
                zzekVar.l(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.u = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.u = C10323vs.b;
        g();
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.g = zzaofVar.b();
        zzaet O = zzadqVar.O(zzaofVar.a(), 1);
        this.h = O;
        this.v = O;
        if (this.a) {
            zzaofVar.c();
            zzaet O2 = zzadqVar.O(zzaofVar.a(), 5);
            this.i = O2;
            zzx zzxVar = new zzx();
            zzxVar.o(zzaofVar.b());
            zzxVar.e(this.f);
            zzxVar.E(C4128Rj1.w0);
            O2.e(zzxVar.K());
            return;
        }
        this.i = new zzadj();
    }

    public final void g() {
        this.n = false;
        h();
    }

    public final void h() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    public final void i() {
        this.j = 3;
        this.k = 0;
    }

    public final void j(zzaet zzaetVar, long j, int i, int i2) {
        this.j = 4;
        this.k = i;
        this.v = zzaetVar;
        this.w = j;
        this.t = i2;
    }

    public final boolean k(zzek zzekVar, byte[] bArr, int i) {
        int min = Math.min(zzekVar.u(), i - this.k);
        zzekVar.h(bArr, this.k, min);
        int i2 = this.k + min;
        this.k = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
