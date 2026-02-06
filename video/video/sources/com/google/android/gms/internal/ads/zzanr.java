package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzanr implements zzadn {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    @InterfaceC11300zs1
    public zzano i;
    public zzadq j;
    public boolean k;
    public final zzer a = new zzer(0);
    public final zzek c = new zzek(4096);
    public final SparseArray b = new SparseArray();
    public final zzanp d = new zzanp();

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[LOOP:0: B:14:0x002c->B:16:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j, long j2) {
        zzano zzanoVar;
        int i;
        SparseArray sparseArray;
        zzer zzerVar = this.a;
        if (zzerVar.f() != C10323vs.b) {
            long d = zzerVar.d();
            if (d != C10323vs.b) {
                if (d != 0) {
                }
            }
            zzanoVar = this.i;
            i = 0;
            if (zzanoVar != null) {
                zzanoVar.d(j2);
            }
            while (true) {
                sparseArray = this.b;
                if (i >= sparseArray.size()) {
                    ((zzanq) sparseArray.valueAt(i)).b();
                    i++;
                } else {
                    return;
                }
            }
        }
        zzerVar.i(j2);
        zzanoVar = this.i;
        i = 0;
        if (zzanoVar != null) {
        }
        while (true) {
            sparseArray = this.b;
            if (i >= sparseArray.size()) {
            }
            ((zzanq) sparseArray.valueAt(i)).b();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        byte[] bArr = new byte[14];
        zzadd zzaddVar = (zzadd) zzadoVar;
        zzaddVar.F(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaddVar.g(bArr[13] & 7, false);
        zzaddVar.F(bArr, 0, 3, false);
        if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.j = zzadqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        long j;
        zzamr zzamtVar;
        zzdc.b(this.j);
        long f = zzadoVar.f();
        int i = (f > (-1L) ? 1 : (f == (-1L) ? 0 : -1));
        if (i != 0) {
            zzanp zzanpVar = this.d;
            if (!zzanpVar.e()) {
                return zzanpVar.a(zzadoVar, zzaejVar);
            }
        }
        if (!this.k) {
            this.k = true;
            zzanp zzanpVar2 = this.d;
            if (zzanpVar2.b() != C10323vs.b) {
                zzano zzanoVar = new zzano(zzanpVar2.d(), zzanpVar2.b(), f);
                this.i = zzanoVar;
                this.j.P(zzanoVar.b());
            } else {
                this.j.P(new zzael(zzanpVar2.b(), 0L));
            }
        }
        zzano zzanoVar2 = this.i;
        if (zzanoVar2 != null && zzanoVar2.e()) {
            return zzanoVar2.a(zzadoVar, zzaejVar);
        }
        zzadoVar.j();
        if (i != 0) {
            j = f - zzadoVar.d();
        } else {
            j = -1;
        }
        if (j != -1 && j < 4) {
            return -1;
        }
        zzek zzekVar = this.c;
        if (!zzadoVar.F(zzekVar.n(), 0, 4, true)) {
            return -1;
        }
        zzekVar.l(0);
        int A = zzekVar.A();
        if (A == 441) {
            return -1;
        }
        if (A == 442) {
            zzadoVar.J(zzekVar.n(), 0, 10);
            zzekVar.l(9);
            zzadoVar.G((zzekVar.G() & 7) + 14);
            return 0;
        } else if (A == 443) {
            zzadoVar.J(zzekVar.n(), 0, 2);
            zzekVar.l(0);
            zzadoVar.G(zzekVar.K() + 6);
            return 0;
        } else if ((A >> 8) != 1) {
            zzadoVar.G(1);
            return 0;
        } else {
            int i2 = A & 255;
            SparseArray sparseArray = this.b;
            zzanq zzanqVar = (zzanq) sparseArray.get(i2);
            if (!this.e) {
                if (zzanqVar == null) {
                    zzamr zzamrVar = null;
                    if (i2 == 189) {
                        zzamtVar = new zzamj(null, 0, C4128Rj1.r);
                        this.f = true;
                        this.h = zzadoVar.e();
                    } else if ((A & 224) == 192) {
                        zzamtVar = new zzand(null, 0, C4128Rj1.r);
                        this.f = true;
                        this.h = zzadoVar.e();
                    } else {
                        if ((A & 240) == 224) {
                            zzamtVar = new zzamt(null, C4128Rj1.r);
                            this.g = true;
                            this.h = zzadoVar.e();
                        }
                        if (zzamrVar != null) {
                            zzamrVar.e(this.j, new zzaof(Integer.MIN_VALUE, i2, 256));
                            zzanqVar = new zzanq(zzamrVar, this.a);
                            sparseArray.put(i2, zzanqVar);
                        }
                    }
                    zzamrVar = zzamtVar;
                    if (zzamrVar != null) {
                    }
                }
                long j2 = 1048576;
                if (this.f && this.g) {
                    j2 = 8192 + this.h;
                }
                if (zzadoVar.e() > j2) {
                    this.e = true;
                    this.j.N();
                }
            }
            zzadoVar.J(zzekVar.n(), 0, 2);
            zzekVar.l(0);
            int K = zzekVar.K() + 6;
            if (zzanqVar == null) {
                zzadoVar.G(K);
            } else {
                zzekVar.i(K);
                zzadoVar.I(zzekVar.n(), 0, K);
                zzekVar.l(6);
                zzanqVar.a(zzekVar);
                zzekVar.k(zzekVar.v());
            }
            return 0;
        }
    }
}
