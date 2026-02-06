package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;
import o.HS1;

/* loaded from: classes2.dex */
public final class zzafu implements zzadn {
    public zzadq f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public zzaft f200o;
    public zzafy p;
    public final zzek a = new zzek(4);
    public final zzek b = new zzek(9);
    public final zzek c = new zzek(11);
    public final zzek d = new zzek();
    public final zzafv e = new zzafv();
    public int g = 1;

    @HS1({"extractorOutput"})
    private final void b() {
        if (!this.n) {
            this.f.P(new zzael(C10323vs.b, 0L));
            this.n = true;
        }
    }

    public final zzek a(zzado zzadoVar) throws IOException {
        zzek zzekVar = this.d;
        if (this.l > zzekVar.v()) {
            int v = zzekVar.v();
            zzekVar.j(new byte[Math.max(v + v, this.l)], 0);
        } else {
            zzekVar.l(0);
        }
        zzekVar.k(this.l);
        zzadoVar.I(zzekVar.n(), 0, this.l);
        return zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzek zzekVar = this.a;
        zzadd zzaddVar = (zzadd) zzadoVar;
        zzaddVar.F(zzekVar.n(), 0, 3, false);
        zzekVar.l(0);
        if (zzekVar.I() != 4607062) {
            return false;
        }
        zzaddVar.F(zzekVar.n(), 0, 2, false);
        zzekVar.l(0);
        if ((zzekVar.K() & 250) != 0) {
            return false;
        }
        zzaddVar.F(zzekVar.n(), 0, 4, false);
        zzekVar.l(0);
        int A = zzekVar.A();
        zzadoVar.j();
        zzadd zzaddVar2 = (zzadd) zzadoVar;
        zzaddVar2.g(A, false);
        zzaddVar2.F(zzekVar.n(), 0, 4, false);
        zzekVar.l(0);
        if (zzekVar.A() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.f = zzadqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        long j;
        boolean c;
        boolean z;
        long j2;
        zzdc.b(this.f);
        while (true) {
            int i = this.g;
            int i2 = 8;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (this.h) {
                                j = this.i + this.m;
                            } else if (this.e.d() == C10323vs.b) {
                                j = 0;
                            } else {
                                j = this.m;
                            }
                            int i3 = this.k;
                            if (i3 == 8) {
                                if (this.f200o != null) {
                                    b();
                                    c = this.f200o.c(a(zzadoVar), j);
                                    z = true;
                                    if (!this.h && c) {
                                        this.h = true;
                                        if (this.e.d() != C10323vs.b) {
                                            j2 = -this.m;
                                        } else {
                                            j2 = 0;
                                        }
                                        this.i = j2;
                                    }
                                    this.j = 4;
                                    this.g = 2;
                                    if (!z) {
                                        return 0;
                                    }
                                }
                            } else {
                                i2 = i3;
                            }
                            if (i2 == 9) {
                                if (this.p != null) {
                                    b();
                                    c = this.p.c(a(zzadoVar), j);
                                    z = true;
                                }
                                zzadoVar.G(this.l);
                                c = false;
                                z = false;
                            } else {
                                if (i2 == 18 && !this.n) {
                                    zzafv zzafvVar = this.e;
                                    c = zzafvVar.c(a(zzadoVar), j);
                                    long d = zzafvVar.d();
                                    if (d != C10323vs.b) {
                                        this.f.P(new zzaee(zzafvVar.e(), zzafvVar.f(), d));
                                        this.n = true;
                                    }
                                    z = true;
                                }
                                zzadoVar.G(this.l);
                                c = false;
                                z = false;
                            }
                            if (!this.h) {
                                this.h = true;
                                if (this.e.d() != C10323vs.b) {
                                }
                                this.i = j2;
                            }
                            this.j = 4;
                            this.g = 2;
                            if (!z) {
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        zzek zzekVar = this.c;
                        if (!zzadoVar.E(zzekVar.n(), 0, 11, true)) {
                            return -1;
                        }
                        zzekVar.l(0);
                        this.k = zzekVar.G();
                        this.l = zzekVar.I();
                        this.m = zzekVar.I();
                        this.m = ((zzekVar.G() << 24) | this.m) * 1000;
                        zzekVar.m(3);
                        this.g = 4;
                    }
                } else {
                    zzadoVar.G(this.j);
                    this.j = 0;
                    this.g = 3;
                }
            } else {
                zzek zzekVar2 = this.b;
                if (!zzadoVar.E(zzekVar2.n(), 0, 9, true)) {
                    return -1;
                }
                zzekVar2.l(0);
                zzekVar2.m(4);
                int G = zzekVar2.G();
                int i4 = G & 4;
                int i5 = G & 1;
                if (i4 != 0 && this.f200o == null) {
                    this.f200o = new zzaft(this.f.O(8, 1));
                }
                if (i5 != 0 && this.p == null) {
                    this.p = new zzafy(this.f.O(9, 2));
                }
                this.f.N();
                this.j = zzekVar2.A() - 5;
                this.g = 2;
            }
        }
    }
}
