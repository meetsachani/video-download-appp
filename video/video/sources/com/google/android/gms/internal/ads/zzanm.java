package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzanm implements zzacy {
    public final zzer a;
    public final zzek b = new zzek();

    public /* synthetic */ zzanm(zzer zzerVar, zzann zzannVar) {
        this.a = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzacx a(zzado zzadoVar, long j) throws IOException {
        int h;
        long e = zzadoVar.e();
        int min = (int) Math.min(20000L, zzadoVar.f() - e);
        zzek zzekVar = this.b;
        zzekVar.i(min);
        zzadoVar.J(zzekVar.n(), 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zzekVar.u() >= 4) {
            if (zzano.h(zzekVar.n(), zzekVar.w()) != 442) {
                zzekVar.m(1);
            } else {
                zzekVar.m(4);
                long c = zzanp.c(zzekVar);
                if (c != C10323vs.b) {
                    long b = this.a.b(c);
                    if (b > j) {
                        if (j2 == C10323vs.b) {
                            return zzacx.d(b, e);
                        }
                        return zzacx.e(e + i2);
                    } else if (100000 + b > j) {
                        return zzacx.e(e + zzekVar.w());
                    } else {
                        i2 = zzekVar.w();
                        j2 = b;
                    }
                }
                int x = zzekVar.x();
                if (zzekVar.u() < 10) {
                    zzekVar.l(x);
                } else {
                    zzekVar.m(9);
                    int G = zzekVar.G() & 7;
                    if (zzekVar.u() < G) {
                        zzekVar.l(x);
                    } else {
                        zzekVar.m(G);
                        if (zzekVar.u() < 4) {
                            zzekVar.l(x);
                        } else {
                            if (zzano.h(zzekVar.n(), zzekVar.w()) == 443) {
                                zzekVar.m(4);
                                int K = zzekVar.K();
                                if (zzekVar.u() < K) {
                                    zzekVar.l(x);
                                } else {
                                    zzekVar.m(K);
                                }
                            }
                            while (true) {
                                if (zzekVar.u() < 4 || (h = zzano.h(zzekVar.n(), zzekVar.w())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                zzekVar.m(4);
                                if (zzekVar.u() < 2) {
                                    zzekVar.l(x);
                                    break;
                                }
                                zzekVar.l(Math.min(zzekVar.x(), zzekVar.w() + zzekVar.K()));
                            }
                        }
                    }
                }
                i = zzekVar.w();
            }
        }
        if (j2 != C10323vs.b) {
            return zzacx.f(j2, e + i);
        }
        return zzacx.d;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void b() {
        byte[] bArr = zzeu.b;
        int length = bArr.length;
        this.b.j(bArr, 0);
    }
}
