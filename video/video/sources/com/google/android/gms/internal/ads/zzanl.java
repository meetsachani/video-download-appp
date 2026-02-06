package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.InterfaceC11300zs1;
import o.PC1;

/* loaded from: classes2.dex */
public final class zzanl implements zzaog {
    public final zzamr a;
    public final zzej b = new zzej(new byte[10], 10);
    public int c = 0;
    public int d;
    public zzer e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public zzanl(zzamr zzamrVar) {
        this.a = zzamrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void a(zzer zzerVar, zzadq zzadqVar, zzaof zzaofVar) {
        this.e = zzerVar;
        this.a.e(zzadqVar, zzaofVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void b(zzek zzekVar, int i) throws zzaz {
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        long j2;
        boolean z;
        zzdc.b(this.e);
        int i6 = -1;
        int i7 = 2;
        if ((i & 1) != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    int i9 = this.j;
                    if (i9 != -1) {
                        zzdx.f(PC1.p, "Unexpected start indicator: expected " + i9 + " more bytes");
                    }
                    if (zzekVar.x() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.a.a(z);
                } else {
                    zzdx.f(PC1.p, "Unexpected start indicator reading extended header");
                }
            }
            e(1);
        }
        int i10 = i;
        while (zzekVar.u() > 0) {
            int i11 = this.c;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != i7) {
                        int u = zzekVar.u();
                        int i12 = this.j;
                        if (i12 == i6) {
                            i4 = 0;
                        } else {
                            i4 = u - i12;
                        }
                        if (i4 > 0) {
                            u -= i4;
                            zzekVar.k(zzekVar.w() + u);
                        }
                        zzamr zzamrVar = this.a;
                        zzamrVar.b(zzekVar);
                        int i13 = this.j;
                        if (i13 != i6) {
                            int i14 = i13 - u;
                            this.j = i14;
                            if (i14 == 0) {
                                zzamrVar.a(false);
                                e(1);
                            }
                        }
                    } else {
                        int min = Math.min(10, this.i);
                        zzej zzejVar = this.b;
                        if (f(zzekVar, zzejVar.a, min) && f(zzekVar, null, this.i)) {
                            zzejVar.l(0);
                            if (this.f) {
                                zzejVar.n(4);
                                long d = zzejVar.d(3);
                                zzejVar.n(1);
                                int d2 = zzejVar.d(15) << 15;
                                zzejVar.n(1);
                                long d3 = zzejVar.d(15);
                                zzejVar.n(1);
                                if (!this.h && this.g) {
                                    zzejVar.n(4);
                                    j2 = d;
                                    zzejVar.n(1);
                                    zzejVar.n(1);
                                    long d4 = zzejVar.d(15);
                                    zzejVar.n(1);
                                    this.e.b((zzejVar.d(3) << 30) | (zzejVar.d(15) << 15) | d4);
                                    this.h = true;
                                } else {
                                    j2 = d;
                                }
                                j = this.e.b(d3 | (j2 << 30) | d2);
                            } else {
                                j = C10323vs.b;
                            }
                            if (true != this.k) {
                                i5 = 0;
                            } else {
                                i5 = 4;
                            }
                            i10 |= i5;
                            this.a.c(j, i10);
                            e(3);
                            i6 = -1;
                            i7 = 2;
                        }
                    }
                    i2 = i7;
                } else {
                    zzej zzejVar2 = this.b;
                    if (f(zzekVar, zzejVar2.a, 9)) {
                        zzejVar2.l(0);
                        int d5 = zzejVar2.d(24);
                        if (d5 != 1) {
                            zzdx.f(PC1.p, "Unexpected start code prefix: " + d5);
                            i6 = -1;
                            this.j = -1;
                            i3 = 0;
                            i2 = 2;
                        } else {
                            zzejVar2.n(8);
                            int d6 = zzejVar2.d(16);
                            zzejVar2.n(5);
                            this.k = zzejVar2.p();
                            i2 = 2;
                            zzejVar2.n(2);
                            this.f = zzejVar2.p();
                            this.g = zzejVar2.p();
                            zzejVar2.n(6);
                            int d7 = zzejVar2.d(8);
                            this.i = d7;
                            if (d6 == 0) {
                                this.j = -1;
                                i6 = -1;
                            } else {
                                int i15 = (d6 - 3) - d7;
                                this.j = i15;
                                if (i15 < 0) {
                                    zzdx.f(PC1.p, "Found negative packet payload size: " + i15);
                                    i6 = -1;
                                    this.j = -1;
                                } else {
                                    i6 = -1;
                                }
                            }
                            i3 = 2;
                        }
                        e(i3);
                    } else {
                        i6 = -1;
                        i2 = 2;
                    }
                }
            } else {
                i2 = i7;
                zzekVar.m(zzekVar.u());
            }
            i7 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean d(boolean z) {
        return this.c == 3 && this.j == -1;
    }

    public final void e(int i) {
        this.c = i;
        this.d = 0;
    }

    public final boolean f(zzek zzekVar, @InterfaceC11300zs1 byte[] bArr, int i) {
        int min = Math.min(zzekVar.u(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzekVar.m(min);
        } else {
            zzekVar.h(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
