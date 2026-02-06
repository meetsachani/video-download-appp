package com.google.android.gms.internal.ads;

import java.util.Collections;
import o.C10323vs;
import o.C4128Rj1;
import o.HS1;

/* loaded from: classes2.dex */
public final class zzana implements zzamr {
    public final zzanv a;
    public String b;
    public zzaet c;
    public zzamz d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final zzanj g = new zzanj(32, 128);
    public final zzanj h = new zzanj(33, 128);
    public final zzanj i = new zzanj(34, 128);
    public final zzanj j = new zzanj(39, 128);
    public final zzanj k = new zzanj(40, 128);
    public long m = C10323vs.b;
    public final zzek n = new zzek();

    public zzana(zzanv zzanvVar, String str) {
        this.a = zzanvVar;
    }

    @HS1({"output", "sampleReader"})
    private final void f(long j, int i, int i2, long j2) {
        this.d.a(j, i, this.e);
        if (!this.e) {
            zzanj zzanjVar = this.g;
            zzanjVar.d(i2);
            zzanj zzanjVar2 = this.h;
            zzanjVar2.d(i2);
            zzanj zzanjVar3 = this.i;
            zzanjVar3.d(i2);
            if (zzanjVar.e() && zzanjVar2.e() && zzanjVar3.e()) {
                String str = this.b;
                int i3 = zzanjVar.e;
                byte[] bArr = new byte[zzanjVar2.e + i3 + zzanjVar3.e];
                boolean z = false;
                System.arraycopy(zzanjVar.d, 0, bArr, 0, i3);
                System.arraycopy(zzanjVar2.d, 0, bArr, zzanjVar.e, zzanjVar2.e);
                System.arraycopy(zzanjVar3.d, 0, bArr, zzanjVar.e + zzanjVar2.e, zzanjVar3.e);
                String str2 = null;
                zzfm d = zzfs.d(zzanjVar2.d, 3, zzanjVar2.e, null);
                zzfh zzfhVar = d.b;
                if (zzfhVar != null) {
                    int i4 = zzfhVar.f;
                    int[] iArr = zzfhVar.e;
                    int i5 = zzfhVar.d;
                    str2 = zzdh.d(zzfhVar.a, zzfhVar.b, zzfhVar.c, i5, iArr, i4);
                }
                zzx zzxVar = new zzx();
                zzxVar.o(str);
                zzxVar.e(C4128Rj1.f601o);
                zzxVar.E(C4128Rj1.k);
                zzxVar.c(str2);
                zzxVar.J(d.e);
                zzxVar.m(d.f);
                zzi zziVar = new zzi();
                zziVar.c(d.i);
                zziVar.b(d.j);
                zziVar.d(d.k);
                zziVar.f(d.c + 8);
                zziVar.a(d.d + 8);
                zzxVar.d(zziVar.g());
                zzxVar.z(d.g);
                zzxVar.u(d.h);
                zzxVar.v(d.a + 1);
                zzxVar.p(Collections.singletonList(bArr));
                zzz K = zzxVar.K();
                this.c.e(K);
                int i6 = K.q;
                if (i6 != -1) {
                    z = true;
                }
                zzfvc.l(z);
                this.a.f(i6);
                this.e = true;
            }
        }
        zzanj zzanjVar4 = this.j;
        if (zzanjVar4.d(i2)) {
            int c = zzfs.c(zzanjVar4.d, zzanjVar4.e);
            zzek zzekVar = this.n;
            zzekVar.j(zzanjVar4.d, c);
            zzekVar.m(5);
            this.a.c(j2, zzekVar);
        }
        zzanj zzanjVar5 = this.k;
        if (zzanjVar5.d(i2)) {
            int c2 = zzfs.c(zzanjVar5.d, zzanjVar5.e);
            zzek zzekVar2 = this.n;
            zzekVar2.j(zzanjVar5.d, c2);
            zzekVar2.m(5);
            this.a.c(j2, zzekVar2);
        }
    }

    @HS1({"sampleReader"})
    private final void g(byte[] bArr, int i, int i2) {
        this.d.b(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        zzdc.b(this.c);
        String str = zzeu.a;
        if (z) {
            this.a.e();
            f(this.l, 0, 0, this.m);
            h(this.l, 0, 48, this.m);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) {
        int i;
        zzdc.b(this.c);
        String str = zzeu.a;
        while (zzekVar.u() > 0) {
            int w = zzekVar.w();
            int x = zzekVar.x();
            byte[] n = zzekVar.n();
            this.l += zzekVar.u();
            this.c.d(zzekVar, zzekVar.u());
            while (w < x) {
                int a = zzfs.a(n, w, x, this.f);
                if (a != x) {
                    int i2 = n[a + 3] & 126;
                    int i3 = 3;
                    if (a > 0) {
                        int i4 = a - 1;
                        if (n[i4] == 0) {
                            i3 = 4;
                            a = i4;
                        }
                    }
                    int i5 = a - w;
                    if (i5 > 0) {
                        g(n, w, a);
                    }
                    int i6 = x - a;
                    long j = this.l - i6;
                    if (i5 < 0) {
                        i = -i5;
                    } else {
                        i = 0;
                    }
                    f(j, i6, i, this.m);
                    h(j, i6, i2 >> 1, this.m);
                    w = a + i3;
                } else {
                    g(n, w, x);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.m = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.l = 0L;
        this.m = C10323vs.b;
        zzfs.i(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        this.a.b();
        zzamz zzamzVar = this.d;
        if (zzamzVar != null) {
            zzamzVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.b = zzaofVar.b();
        zzaet O = zzadqVar.O(zzaofVar.a(), 2);
        this.c = O;
        this.d = new zzamz(O);
        this.a.d(zzadqVar, zzaofVar);
    }

    @HS1({"sampleReader"})
    public final void h(long j, int i, int i2, long j2) {
        this.d.d(j, i, i2, j2, this.e);
        if (!this.e) {
            this.g.c(i2);
            this.h.c(i2);
            this.i.c(i2);
        }
        this.j.c(i2);
        this.k.c(i2);
    }
}
