package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;
import o.C8773pV0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzagb implements zzadn {
    public zzadq b;
    public int c;
    public int d;
    public int e;
    @InterfaceC11300zs1
    public zzahe g;
    public zzado h;
    public zzage i;
    @InterfaceC11300zs1
    public zzajb j;
    public final zzek a = new zzek(6);
    public long f = -1;

    private final int a(zzado zzadoVar) throws IOException {
        zzek zzekVar = this.a;
        zzekVar.i(2);
        ((zzadd) zzadoVar).F(zzekVar.n(), 0, 2, false);
        return zzekVar.K();
    }

    private final void b() {
        zzadq zzadqVar = this.b;
        zzadqVar.getClass();
        zzadqVar.N();
        this.b.P(new zzael(C10323vs.b, 0L));
        this.c = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            zzajb zzajbVar = this.j;
            zzajbVar.getClass();
            zzajbVar.e(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        if (a(zzadoVar) != 65496) {
            return false;
        }
        int a = a(zzadoVar);
        this.d = a;
        if (a == 65504) {
            zzek zzekVar = this.a;
            zzekVar.i(2);
            zzadd zzaddVar = (zzadd) zzadoVar;
            zzaddVar.F(zzekVar.n(), 0, 2, false);
            zzaddVar.g(zzekVar.K() - 2, false);
            a = a(zzadoVar);
            this.d = a;
        }
        if (a == 65505) {
            zzadd zzaddVar2 = (zzadd) zzadoVar;
            zzaddVar2.g(2, false);
            zzek zzekVar2 = this.a;
            zzekVar2.i(6);
            zzaddVar2.F(zzekVar2.n(), 0, 6, false);
            if (zzekVar2.O() == C8773pV0.u && zzekVar2.K() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.b = zzadqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        String S;
        zzagd a;
        zzahe zzaheVar;
        long j;
        int i = this.c;
        long j2 = -1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.i == null || zzadoVar != this.h) {
                            this.h = zzadoVar;
                            this.i = new zzage(zzadoVar, this.f);
                        }
                        zzajb zzajbVar = this.j;
                        zzajbVar.getClass();
                        int j3 = zzajbVar.j(this.i, zzaejVar);
                        if (j3 == 1) {
                            zzaejVar.a += this.f;
                        }
                        return j3;
                    }
                    long e = zzadoVar.e();
                    long j4 = this.f;
                    if (e == j4) {
                        if (!zzadoVar.F(this.a.n(), 0, 1, true)) {
                            b();
                        } else {
                            zzadoVar.j();
                            if (this.j == null) {
                                this.j = new zzajb(zzakj.a, 8);
                            }
                            zzage zzageVar = new zzage(zzadoVar, this.f);
                            this.i = zzageVar;
                            if (this.j.g(zzageVar)) {
                                zzajb zzajbVar2 = this.j;
                                long j5 = this.f;
                                zzadq zzadqVar = this.b;
                                zzadqVar.getClass();
                                zzajbVar2.i(new zzagg(j5, zzadqVar));
                                zzahe zzaheVar2 = this.g;
                                zzaheVar2.getClass();
                                zzadq zzadqVar2 = this.b;
                                zzadqVar2.getClass();
                                zzaet O = zzadqVar2.O(1024, 4);
                                zzx zzxVar = new zzx();
                                zzxVar.e(C4128Rj1.R0);
                                zzxVar.w(new zzav(C10323vs.b, zzaheVar2));
                                O.e(zzxVar.K());
                                this.c = 5;
                            } else {
                                b();
                            }
                        }
                        return 0;
                    }
                    zzaejVar.a = j4;
                    return 1;
                }
                if (this.d == 65505) {
                    zzek zzekVar = new zzek(this.e);
                    zzadoVar.I(zzekVar.n(), 0, this.e);
                    if (this.g == null && C8773pV0.z.equals(zzekVar.S((char) 0)) && (S = zzekVar.S((char) 0)) != null) {
                        long f = zzadoVar.f();
                        if (f != -1 && (a = zzagh.a(S)) != null) {
                            List list = a.b;
                            if (list.size() >= 2) {
                                int size = list.size() - 1;
                                long j6 = -1;
                                long j7 = -1;
                                long j8 = -1;
                                long j9 = -1;
                                boolean z = false;
                                while (size >= 0) {
                                    zzagc zzagcVar = (zzagc) list.get(size);
                                    long j10 = j2;
                                    boolean equals = C4128Rj1.f.equals(zzagcVar.a) | z;
                                    if (size == 0) {
                                        f -= zzagcVar.c;
                                        j = 0;
                                    } else {
                                        j = f - zzagcVar.b;
                                    }
                                    long j11 = j;
                                    long j12 = f;
                                    f = j11;
                                    if (equals && f != j12) {
                                        j9 = j12 - f;
                                        j8 = f;
                                        z = false;
                                    } else {
                                        z = equals;
                                    }
                                    if (size == 0) {
                                        j7 = j12;
                                    }
                                    if (size == 0) {
                                        j6 = f;
                                    }
                                    size--;
                                    j2 = j10;
                                }
                                long j13 = j2;
                                if (j8 != j13 && j9 != j13 && j6 != j13 && j7 != j13) {
                                    zzaheVar = new zzahe(j6, j7, a.a, j8, j9);
                                    this.g = zzaheVar;
                                    if (zzaheVar != null) {
                                        this.f = zzaheVar.d;
                                    }
                                }
                            }
                        }
                        zzaheVar = null;
                        this.g = zzaheVar;
                        if (zzaheVar != null) {
                        }
                    }
                } else {
                    zzadoVar.G(this.e);
                }
                this.c = 0;
                return 0;
            }
            zzek zzekVar2 = this.a;
            zzekVar2.i(2);
            zzadoVar.I(zzekVar2.n(), 0, 2);
            this.e = zzekVar2.K() - 2;
            this.c = 2;
            return 0;
        }
        zzek zzekVar3 = this.a;
        zzekVar3.i(2);
        zzadoVar.I(zzekVar3.n(), 0, 2);
        int K = zzekVar3.K();
        this.d = K;
        if (K == 65498) {
            if (this.f != -1) {
                this.c = 4;
            } else {
                b();
            }
        } else if ((K < 65488 || K > 65497) && K != 65281) {
            this.c = 1;
        }
        return 0;
    }
}
