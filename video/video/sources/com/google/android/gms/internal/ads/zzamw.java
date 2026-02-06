package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import o.C10323vs;
import o.C4128Rj1;
import o.FF0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamw implements zzamr {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @InterfaceC11300zs1
    public final zzaoi a;
    public zzamv f;
    public long g;
    public String h;
    public zzaet i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final zzamu d = new zzamu(128);
    public long k = C10323vs.b;
    @InterfaceC11300zs1
    public final zzanj e = new zzanj(178, 128);
    @InterfaceC11300zs1
    public final zzek b = new zzek();

    public zzamw(@InterfaceC11300zs1 zzaoi zzaoiVar, String str) {
        this.a = zzaoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
        zzdc.b(this.f);
        if (z) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzek zzekVar) {
        int i;
        zzanj zzanjVar;
        int i2;
        int i3;
        int i4;
        zzdc.b(this.f);
        zzdc.b(this.i);
        int w = zzekVar.w();
        int x = zzekVar.x();
        byte[] n = zzekVar.n();
        this.g += zzekVar.u();
        this.i.d(zzekVar, zzekVar.u());
        while (true) {
            int a = zzfs.a(n, w, x, this.c);
            if (a == x) {
                break;
            }
            int i5 = a + 3;
            int i6 = zzekVar.n()[i5] & 255;
            int i7 = a - w;
            if (!this.j) {
                if (i7 > 0) {
                    this.d.a(n, w, a);
                }
                if (i7 < 0) {
                    i3 = -i7;
                } else {
                    i3 = 0;
                }
                zzamu zzamuVar = this.d;
                if (zzamuVar.c(i6, i3)) {
                    zzaet zzaetVar = this.i;
                    int i8 = zzamuVar.d;
                    String str = this.h;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzamuVar.e, zzamuVar.c);
                    zzej zzejVar = new zzej(copyOf, copyOf.length);
                    zzejVar.o(i8);
                    zzejVar.o(4);
                    zzejVar.m();
                    zzejVar.n(8);
                    if (zzejVar.p()) {
                        zzejVar.n(4);
                        zzejVar.n(3);
                    }
                    int d = zzejVar.d(4);
                    float f = 1.0f;
                    i = x;
                    if (d == 15) {
                        int d2 = zzejVar.d(8);
                        int d3 = zzejVar.d(8);
                        if (d3 == 0) {
                            zzdx.f(FF0.l, "Invalid aspect ratio");
                        } else {
                            f = d2 / d3;
                        }
                    } else if (d < 7) {
                        f = l[d];
                    } else {
                        zzdx.f(FF0.l, "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzejVar.p()) {
                        zzejVar.n(2);
                        zzejVar.n(1);
                        if (zzejVar.p()) {
                            zzejVar.n(15);
                            zzejVar.m();
                            zzejVar.n(15);
                            zzejVar.m();
                            zzejVar.n(15);
                            zzejVar.m();
                            zzejVar.n(3);
                            zzejVar.n(11);
                            zzejVar.m();
                            zzejVar.n(15);
                            zzejVar.m();
                            i4 = 2;
                            if (zzejVar.d(i4) != 0) {
                                zzdx.f(FF0.l, "Unhandled video object layer shape");
                            }
                            zzejVar.m();
                            int d4 = zzejVar.d(16);
                            zzejVar.m();
                            if (zzejVar.p()) {
                                if (d4 == 0) {
                                    zzdx.f(FF0.l, "Invalid vop_increment_time_resolution");
                                } else {
                                    int i9 = d4 - 1;
                                    int i10 = 0;
                                    while (i9 > 0) {
                                        i9 >>= 1;
                                        i10++;
                                    }
                                    zzejVar.n(i10);
                                }
                            }
                            zzejVar.m();
                            int d5 = zzejVar.d(13);
                            zzejVar.m();
                            int d6 = zzejVar.d(13);
                            zzejVar.m();
                            zzejVar.m();
                            zzx zzxVar = new zzx();
                            zzxVar.o(str);
                            zzxVar.e(C4128Rj1.f601o);
                            zzxVar.E(C4128Rj1.p);
                            zzxVar.J(d5);
                            zzxVar.m(d6);
                            zzxVar.z(f2);
                            zzxVar.p(Collections.singletonList(copyOf));
                            zzaetVar.e(zzxVar.K());
                            this.j = true;
                            this.f.a(n, w, a);
                            zzanjVar = this.e;
                            if (i7 > 0) {
                                zzanjVar.a(n, w, a);
                                i2 = 0;
                            } else {
                                i2 = -i7;
                            }
                            if (zzanjVar.d(i2)) {
                                int c = zzfs.c(zzanjVar.d, zzanjVar.e);
                                zzek zzekVar2 = this.b;
                                String str2 = zzeu.a;
                                zzekVar2.j(zzanjVar.d, c);
                                this.a.a(this.k, zzekVar2);
                            }
                            if (i6 == 178) {
                                if (zzekVar.n()[a + 2] == 1) {
                                    zzanjVar.c(178);
                                }
                                i6 = 178;
                            }
                            int i11 = i - a;
                            this.f.b(this.g - i11, i11, this.j);
                            this.f.c(i6, this.k);
                            w = i5;
                            x = i;
                        }
                    }
                    i4 = 2;
                    if (zzejVar.d(i4) != 0) {
                    }
                    zzejVar.m();
                    int d42 = zzejVar.d(16);
                    zzejVar.m();
                    if (zzejVar.p()) {
                    }
                    zzejVar.m();
                    int d52 = zzejVar.d(13);
                    zzejVar.m();
                    int d62 = zzejVar.d(13);
                    zzejVar.m();
                    zzejVar.m();
                    zzx zzxVar2 = new zzx();
                    zzxVar2.o(str);
                    zzxVar2.e(C4128Rj1.f601o);
                    zzxVar2.E(C4128Rj1.p);
                    zzxVar2.J(d52);
                    zzxVar2.m(d62);
                    zzxVar2.z(f2);
                    zzxVar2.p(Collections.singletonList(copyOf));
                    zzaetVar.e(zzxVar2.K());
                    this.j = true;
                    this.f.a(n, w, a);
                    zzanjVar = this.e;
                    if (i7 > 0) {
                    }
                    if (zzanjVar.d(i2)) {
                    }
                    if (i6 == 178) {
                    }
                    int i112 = i - a;
                    this.f.b(this.g - i112, i112, this.j);
                    this.f.c(i6, this.k);
                    w = i5;
                    x = i;
                }
            }
            i = x;
            this.f.a(n, w, a);
            zzanjVar = this.e;
            if (i7 > 0) {
            }
            if (zzanjVar.d(i2)) {
            }
            if (i6 == 178) {
            }
            int i1122 = i - a;
            this.f.b(this.g - i1122, i1122, this.j);
            this.f.c(i6, this.k);
            w = i5;
            x = i;
        }
        if (!this.j) {
            this.d.a(n, w, x);
        }
        this.f.a(n, w, x);
        this.e.a(n, w, x);
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.k = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        zzfs.i(this.c);
        this.d.b();
        zzamv zzamvVar = this.f;
        if (zzamvVar != null) {
            zzamvVar.d();
        }
        this.e.b();
        this.g = 0L;
        this.k = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.h = zzaofVar.b();
        zzaet O = zzadqVar.O(zzaofVar.a(), 2);
        this.i = O;
        this.f = new zzamv(O);
        this.a.b(zzadqVar, zzaofVar);
    }
}
