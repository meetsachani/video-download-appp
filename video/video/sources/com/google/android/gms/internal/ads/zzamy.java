package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import o.C10323vs;
import o.C4128Rj1;
import o.HS1;

/* loaded from: classes2.dex */
public final class zzamy implements zzamr {
    public final zzanv a;
    public long f;
    public String h;
    public zzaet i;
    public zzamx j;
    public boolean k;
    public boolean m;
    public final String b = C4128Rj1.f601o;
    public final boolean[] g = new boolean[3];
    public final zzanj c = new zzanj(7, 128);
    public final zzanj d = new zzanj(8, 128);
    public final zzanj e = new zzanj(6, 128);
    public long l = C10323vs.b;
    public final zzek n = new zzek();

    public zzamy(zzanv zzanvVar, boolean z, boolean z2, String str) {
        this.a = zzanvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        zzdc.b(this.i);
        String str = zzeu.a;
        if (z) {
            this.a.e();
            f(this.f, 0, 0, this.l);
            h(this.f, 9, this.l);
            f(this.f, 0, 0, this.l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzamr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzek zzekVar) {
        int i;
        int i2;
        int i3;
        int i4;
        zzdc.b(this.i);
        String str = zzeu.a;
        int w = zzekVar.w();
        int x = zzekVar.x();
        byte[] n = zzekVar.n();
        this.f += zzekVar.u();
        this.i.d(zzekVar, zzekVar.u());
        while (true) {
            int a = zzfs.a(n, w, x, this.g);
            if (a != x) {
                int i5 = n[a + 3] & 31;
                if (a > 0) {
                    int i6 = a - 1;
                    if (n[i6] == 0) {
                        i2 = 4;
                        i = i6;
                        i3 = i - w;
                        if (i3 > 0) {
                            g(n, w, i);
                        }
                        int i7 = x - i;
                        long j = this.f - i7;
                        if (i3 >= 0) {
                            i4 = -i3;
                        } else {
                            i4 = 0;
                        }
                        f(j, i7, i4, this.l);
                        h(j, i5, this.l);
                        w = i + i2;
                    }
                }
                i = a;
                i2 = 3;
                i3 = i - w;
                if (i3 > 0) {
                }
                int i72 = x - i;
                long j2 = this.f - i72;
                if (i3 >= 0) {
                }
                f(j2, i72, i4, this.l);
                h(j2, i5, this.l);
                w = i + i2;
            } else {
                g(n, w, x);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.l = j;
        int i2 = i & 2;
        this.m = (i2 != 0) | this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.f = 0L;
        this.m = false;
        this.l = C10323vs.b;
        zzfs.i(this.g);
        this.c.b();
        this.d.b();
        this.e.b();
        this.a.b();
        zzamx zzamxVar = this.j;
        if (zzamxVar != null) {
            zzamxVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.h = zzaofVar.b();
        zzaet O = zzadqVar.O(zzaofVar.a(), 2);
        this.i = O;
        this.j = new zzamx(O, false, false);
        this.a.d(zzadqVar, zzaofVar);
    }

    @HS1({"output", "sampleReader"})
    public final void f(long j, int i, int i2, long j2) {
        if (!this.k) {
            zzanj zzanjVar = this.c;
            zzanjVar.d(i2);
            zzanj zzanjVar2 = this.d;
            zzanjVar2.d(i2);
            if (!this.k) {
                if (zzanjVar.e() && zzanjVar2.e()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(zzanjVar.d, zzanjVar.e));
                    arrayList.add(Arrays.copyOf(zzanjVar2.d, zzanjVar2.e));
                    zzfr g = zzfs.g(zzanjVar.d, 4, zzanjVar.e);
                    zzfq f = zzfs.f(zzanjVar2.d, 4, zzanjVar2.e);
                    String c = zzdh.c(g.a, g.b, g.c);
                    zzaet zzaetVar = this.i;
                    zzx zzxVar = new zzx();
                    zzxVar.o(this.h);
                    zzxVar.e(this.b);
                    zzxVar.E("video/avc");
                    zzxVar.c(c);
                    zzxVar.J(g.e);
                    zzxVar.m(g.f);
                    zzi zziVar = new zzi();
                    zziVar.c(g.j);
                    zziVar.b(g.k);
                    zziVar.d(g.l);
                    zziVar.f(g.h + 8);
                    zziVar.a(g.i + 8);
                    zzxVar.d(zziVar.g());
                    zzxVar.z(g.g);
                    zzxVar.p(arrayList);
                    int i3 = g.m;
                    zzxVar.u(i3);
                    zzaetVar.e(zzxVar.K());
                    this.k = true;
                    this.a.f(i3);
                    this.j.b(g);
                    this.j.a(f);
                    zzanjVar.b();
                    zzanjVar2.b();
                }
            } else if (zzanjVar.e()) {
                zzfr g2 = zzfs.g(zzanjVar.d, 4, zzanjVar.e);
                this.a.f(g2.m);
                this.j.b(g2);
                zzanjVar.b();
            } else if (zzanjVar2.e()) {
                this.j.a(zzfs.f(zzanjVar2.d, 4, zzanjVar2.e));
                zzanjVar2.b();
            }
        }
        zzanj zzanjVar3 = this.e;
        if (zzanjVar3.d(i2)) {
            int c2 = zzfs.c(zzanjVar3.d, zzanjVar3.e);
            zzek zzekVar = this.n;
            zzekVar.j(zzanjVar3.d, c2);
            zzekVar.l(4);
            this.a.c(j2, zzekVar);
        }
        if (this.j.e(j, i, this.k)) {
            this.m = false;
        }
    }

    @HS1({"sampleReader"})
    public final void g(byte[] bArr, int i, int i2) {
        if (!this.k) {
            this.c.a(bArr, i, i2);
            this.d.a(bArr, i, i2);
        }
        this.e.a(bArr, i, i2);
    }

    @HS1({"sampleReader"})
    public final void h(long j, int i, long j2) {
        if (!this.k) {
            this.c.c(i);
            this.d.c(i);
        }
        this.e.c(i);
        this.j.d(j, i, j2, this.m);
    }
}
