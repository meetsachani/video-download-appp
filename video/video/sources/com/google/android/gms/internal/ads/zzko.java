package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.AD1;
import o.C10323vs;
import o.C6118ei0;
import o.InterfaceC11300zs1;
import o.OB;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzko implements Handler.Callback, zzuy, zzyw, zzll, zzih, zzlp, zzhx, zzabi {
    public static final long W1 = zzeu.Q(10000);
    public boolean B1;
    public boolean C1;
    public boolean E1;
    public boolean H1;
    public int I1;
    @InterfaceC11300zs1
    public zzkm J1;
    public long K1;
    public long L1;
    public int M1;
    public boolean N1;
    @InterfaceC11300zs1
    public zzik O1;
    public zziu Q1;
    public boolean S1;
    public final zzjg U1;
    public final zzid V1;
    public final zzma[] X;
    public final zzly[] Y;
    public final zzyx Y0;
    public final boolean[] Z;
    public final zzyy Z0;
    public final zzks a1;
    public final zzzf b1;
    public final zzdq c1;
    public final zzlo d1;
    public final Looper e1;
    public final zzbk f1;
    public final zzbj g1;
    public final long h1;
    public final zzii i1;
    public final ArrayList j1;
    public final zzdg k1;
    public final zzla l1;
    public final zzlm m1;
    public final long n1;
    public final zzpc o1;
    public final zzmj p1;
    public final zzdq q1;
    public final boolean r1;
    public final zzhy s1;
    public zzmd t1;
    public boolean u1;
    public boolean v1;
    @InterfaceC11300zs1
    public zzkm w1;
    public zzln x1;
    public zzkl y1;
    public boolean z1;
    public long R1 = C10323vs.b;
    public int F1 = 0;
    public boolean G1 = false;
    public boolean A1 = false;
    public float T1 = 1.0f;
    public long P1 = C10323vs.b;
    public long D1 = C10323vs.b;

    public zzko(Context context, zzlv[] zzlvVarArr, zzlv[] zzlvVarArr2, zzyx zzyxVar, zzyy zzyyVar, zzks zzksVar, zzzf zzzfVar, int i, boolean z, zzmj zzmjVar, zzmd zzmdVar, zzid zzidVar, long j, boolean z2, boolean z3, Looper looper, zzdg zzdgVar, zzjg zzjgVar, zzpc zzpcVar, @InterfaceC11300zs1 zzlo zzloVar, zziu zziuVar, final zzabi zzabiVar) {
        this.U1 = zzjgVar;
        this.Y0 = zzyxVar;
        this.Z0 = zzyyVar;
        this.a1 = zzksVar;
        this.b1 = zzzfVar;
        this.t1 = zzmdVar;
        this.V1 = zzidVar;
        this.n1 = j;
        this.k1 = zzdgVar;
        this.o1 = zzpcVar;
        this.Q1 = zziuVar;
        this.p1 = zzmjVar;
        this.h1 = zzksVar.h(zzpcVar);
        zzksVar.f(zzpcVar);
        zzbl zzblVar = zzbl.a;
        zzln h = zzln.h(zzyyVar);
        this.x1 = h;
        this.y1 = new zzkl(h);
        int length = zzlvVarArr.length;
        this.Y = new zzly[2];
        this.Z = new boolean[2];
        zzlx b = zzyxVar.b();
        this.X = new zzma[2];
        boolean z4 = false;
        for (int i2 = 0; i2 < 2; i2++) {
            zzlvVarArr[i2].h(i2, zzpcVar, zzdgVar);
            this.Y[i2] = zzlvVarArr[i2].m();
            this.Y[i2].e(b);
            zzlv zzlvVar = zzlvVarArr2[i2];
            if (zzlvVar != null) {
                zzlvVar.h(i2, zzpcVar, zzdgVar);
                z4 = true;
            }
            this.X[i2] = new zzma(zzlvVarArr[i2], zzlvVarArr2[i2], i2);
        }
        this.r1 = z4;
        this.i1 = new zzii(this, zzdgVar);
        this.j1 = new ArrayList();
        this.f1 = new zzbk();
        this.g1 = new zzbj();
        zzyxVar.i(this, zzzfVar);
        this.N1 = true;
        zzdq d = zzdgVar.d(looper, null);
        this.q1 = d;
        this.l1 = new zzla(zzmjVar, d, new zzkf(this), zziuVar);
        this.m1 = new zzlm(this, zzmjVar, d, zzpcVar);
        zzlo zzloVar2 = new zzlo(null);
        this.d1 = zzloVar2;
        Looper a = zzloVar2.a();
        this.e1 = a;
        zzdq d2 = zzdgVar.d(a, this);
        this.c1 = d2;
        this.s1 = new zzhy(context, a, this);
        d2.f(35, new zzabi() { // from class: com.google.android.gms.internal.ads.zzkg
            @Override // com.google.android.gms.internal.ads.zzabi
            public final void c(long j2, long j3, zzz zzzVar, MediaFormat mediaFormat) {
                zzko.this.c(j2, j3, zzzVar, mediaFormat);
            }
        }).a();
    }

    private final void D() throws zzik {
        zzyy zzyyVar;
        zzko zzkoVar;
        int i;
        boolean z;
        boolean z2;
        zzii zziiVar = this.i1;
        float f = zziiVar.c().a;
        zzla zzlaVar = this.l1;
        zzkx v = zzlaVar.v();
        zzkx z3 = zzlaVar.z();
        zzyy zzyyVar2 = null;
        boolean z4 = true;
        while (v != null && v.e) {
            zzln zzlnVar = this.x1;
            zzyy j = v.j(f, zzlnVar.a, zzlnVar.l);
            if (v == zzlaVar.v()) {
                zzyyVar = j;
            } else {
                zzyyVar = zzyyVar2;
            }
            zzyy i2 = v.i();
            boolean z5 = false;
            if (i2 != null) {
                zzyq[] zzyqVarArr = j.c;
                if (i2.c.length == zzyqVarArr.length) {
                    for (int i3 = 0; i3 < zzyqVarArr.length; i3++) {
                        if (j.a(i2, i3)) {
                        }
                    }
                    if (v != z3) {
                        z5 = true;
                    }
                    z4 &= z5;
                    v = v.g();
                    zzyyVar2 = zzyyVar;
                }
            }
            if (z4) {
                zzkx v2 = zzlaVar.v();
                int m = zzlaVar.m(v2) & 1;
                zzma[] zzmaVarArr = this.X;
                boolean[] zArr = new boolean[2];
                zzyyVar.getClass();
                if (1 != m) {
                    z = false;
                } else {
                    z = true;
                }
                long b = v2.b(zzyyVar, this.x1.s, z, zArr);
                zzln zzlnVar2 = this.x1;
                if (zzlnVar2.e != 4 && b != zzlnVar2.s) {
                    z2 = false;
                    z5 = true;
                } else {
                    z2 = false;
                }
                zzln zzlnVar3 = this.x1;
                boolean z6 = z2;
                i = 2;
                zzkoVar = this;
                zzkoVar.x1 = m(zzlnVar3.b, b, zzlnVar3.c, zzlnVar3.d, z5, 5);
                if (z5) {
                    zzkoVar.H(b);
                }
                zzkoVar.n();
                boolean[] zArr2 = new boolean[2];
                for (int i4 = z6; i4 < 2; i4++) {
                    int x = zzmaVarArr[i4].x();
                    zArr2[i4] = zzmaVarArr[i4].j();
                    zzmaVarArr[i4].G(v2.c[i4], zziiVar, zzkoVar.K1, zArr[i4]);
                    if (x - zzmaVarArr[i4].x() > 0) {
                        zzkoVar.C(i4, z6);
                    }
                    zzkoVar.I1 -= x - zzmaVarArr[i4].x();
                }
                zzkoVar.r(zArr2, zzkoVar.K1);
                v2.h = true;
            } else {
                zzkoVar = this;
                i = 2;
                zzlaVar.m(v);
                if (v.e) {
                    long max = Math.max(v.g.b, zzkoVar.K1 - v.e());
                    if (zzkoVar.r1 && zzkoVar.b0() && zzlaVar.y() == v) {
                        zzkoVar.n();
                    }
                    v.a(j, max, false);
                }
            }
            zzkoVar.t(true);
            if (zzkoVar.x1.e != 4) {
                zzkoVar.y();
                zzkoVar.Y();
                zzkoVar.c1.j0(i);
                return;
            }
            return;
        }
    }

    private final void E() throws zzik {
        D();
        K(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[LOOP:0: B:32:0x00a9->B:39:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c6 -> B:32:0x00a9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Y() throws zzik {
        long j;
        boolean z;
        zzkk zzkkVar;
        int i;
        zzla zzlaVar = this.l1;
        zzkx v = zzlaVar.v();
        if (v != null) {
            if (v.e) {
                j = v.a.f();
            } else {
                j = -9223372036854775807L;
            }
            if (j != C10323vs.b) {
                if (!v.s()) {
                    zzlaVar.m(v);
                    t(false);
                    y();
                }
                H(j);
                if (j != this.x1.s) {
                    zzln zzlnVar = this.x1;
                    long j2 = j;
                    this.x1 = m(zzlnVar.b, j2, zzlnVar.c, j2, true, 5);
                }
            } else {
                zzii zziiVar = this.i1;
                if (v != zzlaVar.z()) {
                    z = true;
                } else {
                    z = false;
                }
                long b = zziiVar.b(z);
                this.K1 = b;
                long e = b - v.e();
                long j3 = this.x1.s;
                ArrayList arrayList = this.j1;
                if (!arrayList.isEmpty() && !this.x1.b.b()) {
                    if (this.N1) {
                        j3--;
                        this.N1 = false;
                    }
                    zzln zzlnVar2 = this.x1;
                    int a = zzlnVar2.a.a(zzlnVar2.b.a);
                    int min = Math.min(this.M1, arrayList.size());
                    if (min > 0) {
                        zzkkVar = (zzkk) arrayList.get(min - 1);
                        while (zzkkVar != null && (a < 0 || (a == 0 && j3 < 0))) {
                            i = min - 1;
                            if (i <= 0) {
                                zzkkVar = (zzkk) arrayList.get(min - 2);
                                min = i;
                            } else {
                                min = i;
                            }
                        }
                        if (min < arrayList.size()) {
                            zzkk zzkkVar2 = (zzkk) arrayList.get(min);
                        }
                        this.M1 = min;
                    }
                    zzkkVar = null;
                    while (zzkkVar != null) {
                        i = min - 1;
                        if (i <= 0) {
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.M1 = min;
                }
                if (zziiVar.j()) {
                    boolean z2 = !this.y1.d;
                    zzln zzlnVar3 = this.x1;
                    this.x1 = m(zzlnVar3.b, e, zzlnVar3.c, e, z2, 6);
                } else {
                    zzln zzlnVar4 = this.x1;
                    zzlnVar4.s = e;
                    zzlnVar4.t = SystemClock.elapsedRealtime();
                }
            }
            this.x1.q = zzlaVar.u().c();
            this.x1.r = y0();
            zzln zzlnVar5 = this.x1;
            if (zzlnVar5.l && zzlnVar5.e == 3 && f0(zzlnVar5.a, zzlnVar5.b)) {
                zzln zzlnVar6 = this.x1;
                if (zzlnVar6.f290o.a == 1.0f) {
                    float a2 = this.V1.a(w0(zzlnVar6.a, zzlnVar6.b.a, zzlnVar6.s), this.x1.r);
                    zzii zziiVar2 = this.i1;
                    if (zziiVar2.c().a != a2) {
                        M(new zzbb(a2, this.x1.f290o.b));
                        x(this.x1.f290o, zziiVar2.c().a, false, false);
                    }
                }
            }
        }
    }

    public static boolean d0(zzln zzlnVar, zzbj zzbjVar) {
        zzvb zzvbVar = zzlnVar.b;
        zzbl zzblVar = zzlnVar.a;
        if (!zzblVar.o() && !zzblVar.n(zzvbVar.a, zzbjVar).f) {
            return false;
        }
        return true;
    }

    public static final boolean g0(@InterfaceC11300zs1 zzkx zzkxVar) {
        if (zzkxVar != null) {
            try {
                if (!zzkxVar.e) {
                    zzkxVar.a.j();
                } else {
                    zzwt[] zzwtVarArr = zzkxVar.c;
                    for (int i = 0; i < 2; i++) {
                        zzwt zzwtVar = zzwtVarArr[i];
                        if (zzwtVar != null) {
                            zzwtVar.f();
                        }
                    }
                }
                if (zzkxVar.d() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static final void h0(zzlr zzlrVar) throws zzik {
        zzlrVar.i();
        try {
            zzlrVar.c().w(zzlrVar.a(), zzlrVar.g());
        } finally {
            zzlrVar.h(true);
        }
    }

    public static int i0(zzbk zzbkVar, zzbj zzbjVar, int i, boolean z, Object obj, zzbl zzblVar, zzbl zzblVar2) {
        zzbk zzbkVar2 = zzbkVar;
        zzbl zzblVar3 = zzblVar;
        Object obj2 = zzblVar3.e(zzblVar3.n(obj, zzbjVar).c, zzbkVar, 0L).a;
        for (int i2 = 0; i2 < zzblVar2.c(); i2++) {
            if (zzblVar2.e(i2, zzbkVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int a = zzblVar3.a(obj);
        int b = zzblVar3.b();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= b || i3 != -1) {
                break;
            }
            zzbl zzblVar4 = zzblVar3;
            int i5 = zzblVar4.i(a, zzbjVar, zzbkVar2, i, z);
            if (i5 == -1) {
                i3 = -1;
                break;
            }
            i3 = zzblVar2.a(zzblVar4.f(i5));
            i4++;
            zzblVar3 = zzblVar4;
            a = i5;
            zzbkVar2 = zzbkVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzblVar2.d(i3, zzbjVar, false).c;
    }

    @InterfaceC11300zs1
    public static Pair k(zzbl zzblVar, zzkm zzkmVar, boolean z, int i, boolean z2, zzbk zzbkVar, zzbj zzbjVar) {
        Pair l;
        zzbl zzblVar2;
        zzbl zzblVar3 = zzkmVar.a;
        if (zzblVar.o()) {
            return null;
        }
        if (true == zzblVar3.o()) {
            zzblVar3 = zzblVar;
        }
        try {
            l = zzblVar3.l(zzbkVar, zzbjVar, zzkmVar.b, zzkmVar.c);
            zzblVar2 = zzblVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzblVar.equals(zzblVar2)) {
            return l;
        }
        if (zzblVar.a(l.first) != -1) {
            if (zzblVar2.n(l.first, zzbjVar).f && zzblVar2.e(zzbjVar.c, zzbkVar, 0L).m == zzblVar2.a(l.first)) {
                return zzblVar.l(zzbkVar, zzbjVar, zzblVar.n(l.first, zzbjVar).c, zzkmVar.c);
            }
            return l;
        }
        int i0 = i0(zzbkVar, zzbjVar, i, z2, l.first, zzblVar2, zzblVar);
        if (i0 != -1) {
            return zzblVar.l(zzbkVar, zzbjVar, i0, C10323vs.b);
        }
        return null;
    }

    public static /* synthetic */ zzkx k0(zzko zzkoVar, zzky zzkyVar, long j) {
        zzzg k = zzkoVar.a1.k();
        long j2 = zzkoVar.Q1.a;
        zzyy zzyyVar = zzkoVar.Z0;
        zzlm zzlmVar = zzkoVar.m1;
        return new zzkx(zzkoVar.Y, j, zzkoVar.Y0, k, zzlmVar, zzkyVar, zzyyVar, C10323vs.b);
    }

    public static /* synthetic */ void l0(zzko zzkoVar, zzlr zzlrVar) {
        try {
            h0(zzlrVar);
        } catch (zzik e) {
            zzdx.d(C6118ei0.M1, "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final void o() throws zzik {
        int i = 0;
        while (true) {
            zzma[] zzmaVarArr = this.X;
            if (i < 2) {
                int x = zzmaVarArr[i].x();
                zzmaVarArr[i].B(this.i1);
                C(i, false);
                this.I1 -= x;
                i++;
            } else {
                this.R1 = C10323vs.b;
                return;
            }
        }
    }

    private final void q() throws zzik {
        r(new boolean[2], this.l1.z().f());
    }

    private final void y() {
        long e;
        long j;
        long j2;
        zzla zzlaVar = this.l1;
        boolean z = false;
        if (g0(zzlaVar.u())) {
            zzkx u = zzlaVar.u();
            long z0 = z0(u.d());
            if (u == zzlaVar.v()) {
                e = this.K1;
                j = u.e();
            } else {
                e = this.K1 - u.e();
                j = u.g.b;
            }
            long j3 = e - j;
            if (f0(this.x1.a, u.g.a)) {
                j2 = this.V1.b();
            } else {
                j2 = C10323vs.b;
            }
            zzkr zzkrVar = new zzkr(this.o1, this.x1.a, u.g.a, j3, z0, this.i1.c().a, this.x1.l, this.C1, j2, this.D1);
            zzks zzksVar = this.a1;
            boolean c = zzksVar.c(zzkrVar);
            zzkx v = zzlaVar.v();
            if (!c && v.e && z0 < C6118ei0.r2 && this.h1 > 0) {
                v.a.p(this.x1.s, false);
                z = zzksVar.c(zzkrVar);
            } else {
                z = c;
            }
        }
        this.E1 = z;
        if (z) {
            zzkx u2 = zzlaVar.u();
            u2.getClass();
            zzkt zzktVar = new zzkt();
            zzktVar.e(this.K1 - u2.e());
            zzktVar.f(this.i1.c().a);
            zzktVar.d(this.D1);
            u2.k(new zzkv(zzktVar, null));
        }
        T();
    }

    public final void A() {
        boolean z;
        this.y1.b(this.x1);
        z = this.y1.a;
        if (z) {
            zzjg zzjgVar = this.U1;
            zzjgVar.a.a0(this.y1);
            this.y1 = new zzkl(this.x1);
        }
    }

    public final void B(int i) throws IOException, zzik {
        zzma zzmaVar = this.X[i];
        try {
            zzkx v = this.l1.v();
            if (v != null) {
                zzmaVar.J(v);
                return;
            }
            throw null;
        } catch (IOException e) {
            e = e;
            zzmaVar.y();
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            zzmaVar.y();
            throw e;
        }
    }

    public final void C(final int i, final boolean z) {
        boolean[] zArr = this.Z;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.q1.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
                @Override // java.lang.Runnable
                public final void run() {
                    r0.p1.f(r1, zzko.this.X[i].y(), z);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        zzvb zzvbVar;
        zzbl zzblVar;
        zzxe zzxeVar;
        zzyy zzyyVar;
        List list;
        this.c1.A(2);
        this.v1 = false;
        zzik zzikVar = null;
        this.w1 = null;
        this.O1 = null;
        boolean z5 = true;
        a0(false, true);
        this.i1.i();
        this.K1 = 1000000000000L;
        try {
            o();
        } catch (zzik | RuntimeException e) {
            zzdx.d(C6118ei0.M1, "Disable failed.", e);
        }
        if (z) {
            zzma[] zzmaVarArr = this.X;
            for (int i = 0; i < 2; i++) {
                try {
                    zzmaVarArr[i].M();
                } catch (RuntimeException e2) {
                    zzdx.d(C6118ei0.M1, "Reset failed.", e2);
                }
            }
        }
        this.I1 = 0;
        zzln zzlnVar = this.x1;
        zzvb zzvbVar2 = zzlnVar.b;
        long j2 = zzlnVar.s;
        if (!this.x1.b.b() && !d0(this.x1, this.g1)) {
            j = this.x1.s;
        } else {
            j = this.x1.c;
        }
        if (z2) {
            this.J1 = null;
            Pair g = g(this.x1.a);
            zzvbVar2 = (zzvb) g.first;
            j2 = ((Long) g.second).longValue();
            boolean equals = zzvbVar2.equals(this.x1.b);
            j = C10323vs.b;
        }
        z5 = false;
        long j3 = j2;
        long j4 = j;
        zzla zzlaVar = this.l1;
        zzlaVar.E();
        this.E1 = false;
        zzbl zzblVar2 = this.x1.a;
        if (z3 && (zzblVar2 instanceof zzlt)) {
            zzblVar2 = ((zzlt) zzblVar2).z(this.m1.q());
            if (zzvbVar2.b != -1) {
                Object obj = zzvbVar2.a;
                zzbj zzbjVar = this.g1;
                zzblVar2.n(obj, zzbjVar);
                zzbk zzbkVar = this.f1;
                zzblVar2.e(zzbjVar.c, zzbkVar, 0L);
                if (zzbkVar.b()) {
                    zzblVar = zzblVar2;
                    zzvbVar = new zzvb(obj, zzvbVar2.d);
                    zzln zzlnVar2 = this.x1;
                    int i2 = zzlnVar2.e;
                    if (!z4) {
                        zzikVar = zzlnVar2.f;
                    }
                    zzik zzikVar2 = zzikVar;
                    if (!z5) {
                        zzxeVar = zzxe.d;
                    } else {
                        zzxeVar = zzlnVar2.h;
                    }
                    zzxe zzxeVar2 = zzxeVar;
                    if (!z5) {
                        zzyyVar = this.Z0;
                    } else {
                        zzyyVar = zzlnVar2.i;
                    }
                    zzyy zzyyVar2 = zzyyVar;
                    if (!z5) {
                        list = zzfyc.F();
                    } else {
                        list = zzlnVar2.j;
                    }
                    List list2 = list;
                    zzln zzlnVar3 = this.x1;
                    this.x1 = new zzln(zzblVar, zzvbVar, j4, j3, i2, zzikVar2, false, zzxeVar2, zzyyVar2, list2, zzvbVar, zzlnVar3.l, zzlnVar3.m, zzlnVar3.n, zzlnVar3.f290o, j3, 0L, j3, 0L, false);
                    if (!z3) {
                        zzlaVar.H();
                        this.m1.h();
                        return;
                    }
                    return;
                }
            }
        }
        zzvbVar = zzvbVar2;
        zzblVar = zzblVar2;
        zzln zzlnVar22 = this.x1;
        int i22 = zzlnVar22.e;
        if (!z4) {
        }
        zzik zzikVar22 = zzikVar;
        if (!z5) {
        }
        zzxe zzxeVar22 = zzxeVar;
        if (!z5) {
        }
        zzyy zzyyVar22 = zzyyVar;
        if (!z5) {
        }
        List list22 = list;
        zzln zzlnVar32 = this.x1;
        this.x1 = new zzln(zzblVar, zzvbVar, j4, j3, i22, zzikVar22, false, zzxeVar22, zzyyVar22, list22, zzvbVar, zzlnVar32.l, zzlnVar32.m, zzlnVar32.n, zzlnVar32.f290o, j3, 0L, j3, 0L, false);
        if (!z3) {
        }
    }

    public final void G() {
        zzkx v = this.l1.v();
        boolean z = false;
        if (v != null && v.g.i && this.A1) {
            z = true;
        }
        this.B1 = z;
    }

    public final void H(long j) throws zzik {
        zzla zzlaVar;
        long e;
        zzyq[] zzyqVarArr;
        zzkx v = this.l1.v();
        if (v == null) {
            e = 1000000000000L;
        } else {
            e = v.e();
        }
        long j2 = j + e;
        this.K1 = j2;
        this.i1.f(j2);
        zzma[] zzmaVarArr = this.X;
        for (int i = 0; i < 2; i++) {
            zzmaVarArr[i].N(v, this.K1);
        }
        for (zzkx v2 = zzlaVar.v(); v2 != null; v2 = v2.g()) {
            for (zzyq zzyqVar : v2.i().c) {
            }
        }
    }

    public final void I(zzbl zzblVar, zzbl zzblVar2) {
        if (zzblVar.o() && zzblVar2.o()) {
            return;
        }
        ArrayList arrayList = this.j1;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        Object obj = ((zzkk) arrayList.get(size)).Y;
        String str = zzeu.a;
        throw null;
    }

    public final void J(long j) {
        long j2;
        if (this.x1.e == 3 && !e0()) {
            j2 = 1000;
        } else {
            j2 = W1;
        }
        this.c1.i(2, j + j2);
    }

    public final void K(boolean z) throws zzik {
        zzvb zzvbVar = this.l1.v().g.a;
        long f = f(zzvbVar, this.x1.s, true, false);
        if (f != this.x1.s) {
            zzln zzlnVar = this.x1;
            this.x1 = m(zzvbVar, f, zzlnVar.c, zzlnVar.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:23|(6:(8:50|51|(1:72)(1:57)|58|59|60|61|(4:67|14|15|16))(1:25)|37|38|39|15|16)|26|(1:28)(1:49)|29|30|(1:32)|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(zzkm zzkmVar, boolean z) throws zzik {
        long longValue;
        zzvb C;
        boolean z2;
        long j;
        zzvb zzvbVar;
        boolean z3;
        long j2;
        long j3;
        zzln zzlnVar;
        int i;
        long j4;
        boolean z4;
        boolean z5;
        long e;
        boolean z6;
        zzln zzlnVar2;
        zzbl zzblVar;
        zzvb zzvbVar2;
        long j5;
        this.y1.a(z ? 1 : 0);
        if (this.v1) {
            this.w1 = zzkmVar;
            return;
        }
        zzbl zzblVar2 = this.x1.a;
        int i2 = this.F1;
        boolean z7 = this.G1;
        zzbk zzbkVar = this.f1;
        zzbj zzbjVar = this.g1;
        Pair k = k(zzblVar2, zzkmVar, true, i2, z7, zzbkVar, zzbjVar);
        long j6 = C10323vs.b;
        boolean z8 = false;
        if (k == null) {
            Pair g = g(this.x1.a);
            C = (zzvb) g.first;
            longValue = ((Long) g.second).longValue();
            z2 = !this.x1.a.o();
        } else {
            Object obj = k.first;
            longValue = ((Long) k.second).longValue();
            int i3 = (zzkmVar.c > C10323vs.b ? 1 : (zzkmVar.c == C10323vs.b ? 0 : -1));
            if (i3 != 0) {
                j6 = longValue;
            }
            C = this.l1.C(this.x1.a, obj, longValue);
            if (C.b()) {
                this.x1.a.n(C.a, zzbjVar);
                if (zzbjVar.e(C.b) == C.c) {
                    zzbjVar.h();
                }
                longValue = 0;
            } else if (i3 != 0) {
                z2 = false;
            }
            z2 = true;
        }
        try {
            if (this.x1.a.o()) {
                this.J1 = zzkmVar;
            } else if (k == null) {
                if (this.x1.e != 1) {
                    O(4);
                }
                F(false, true, false, true);
            } else {
                try {
                    if (C.equals(this.x1.b)) {
                        try {
                            zzkx v = this.l1.v();
                            if (v != null && v.e && longValue != 0) {
                                j3 = v.a.e(longValue, this.t1);
                            } else {
                                j3 = longValue;
                            }
                            zzvbVar = C;
                        } catch (Throwable th) {
                            th = th;
                            zzvbVar = C;
                        }
                        try {
                            if (zzeu.Q(j3) == zzeu.Q(this.x1.s) && ((i = (zzlnVar = this.x1).e) == 2 || i == 3)) {
                                longValue = zzlnVar.s;
                                j4 = j6;
                                z4 = z2;
                                j5 = longValue;
                                this.x1 = m(zzvbVar, j5, j4, j5, z4, 2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = j6;
                            z3 = z2;
                            j2 = longValue;
                            this.x1 = m(zzvbVar, j2, j, j2, z3, 2);
                            throw th;
                        }
                    } else {
                        zzvbVar = C;
                        j3 = longValue;
                    }
                    Z(zzblVar, zzvbVar2, zzblVar, zzlnVar2.b, j6, true);
                    j4 = j6;
                    j5 = e;
                    z4 = z6;
                    this.x1 = m(zzvbVar, j5, j4, j5, z4, 2);
                } catch (Throwable th3) {
                    th = th3;
                    zzvbVar = zzvbVar2;
                    j = j6;
                    j2 = e;
                    z3 = z6;
                    this.x1 = m(zzvbVar, j2, j, j2, z3, 2);
                    throw th;
                }
                this.v1 = this.u1;
                if (this.x1.e == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                e = e(zzvbVar, j3, z5);
                if (longValue != e) {
                    z8 = true;
                }
                z6 = z2 | z8;
                zzlnVar2 = this.x1;
                zzblVar = zzlnVar2.a;
                zzvbVar2 = zzvbVar;
            }
            j4 = j6;
            z4 = z2;
            zzvbVar = C;
            j5 = longValue;
            this.x1 = m(zzvbVar, j5, j4, j5, z4, 2);
        } catch (Throwable th4) {
            th = th4;
            j = j6;
            zzvbVar = C;
        }
    }

    public final void M(zzbb zzbbVar) {
        this.c1.A(16);
        this.i1.g(zzbbVar);
    }

    public final void N(boolean z, int i, boolean z2, int i2) throws zzik {
        this.y1.a(z2 ? 1 : 0);
        W(z, i, i2);
    }

    public final void O(int i) {
        zzln zzlnVar = this.x1;
        if (zzlnVar.e != i) {
            if (i != 2) {
                this.P1 = C10323vs.b;
            }
            this.x1 = zzlnVar.f(i);
        }
    }

    public final void P(float f) throws zzik {
        this.T1 = f;
        float a = f * this.s1.a();
        int i = 0;
        while (true) {
            zzma[] zzmaVarArr = this.X;
            if (i < 2) {
                zzmaVarArr[i].U(a);
                i++;
            } else {
                return;
            }
        }
    }

    public final void Q() throws zzik {
        zzkx v = this.l1.v();
        if (v != null) {
            zzyy i = v.i();
            int i2 = 0;
            while (true) {
                zzma[] zzmaVarArr = this.X;
                if (i2 < 2) {
                    if (i.b(i2)) {
                        zzmaVarArr[i2].V();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void R(boolean z, boolean z2) {
        boolean z3;
        if (z || !this.H1) {
            z3 = true;
        } else {
            z3 = false;
        }
        F(z3, false, true, false);
        this.y1.a(z2 ? 1 : 0);
        this.a1.d(this.o1);
        this.s1.b(this.x1.l, 1);
        O(1);
    }

    public final void S() throws zzik {
        this.i1.i();
        int i = 0;
        while (true) {
            zzma[] zzmaVarArr = this.X;
            if (i < 2) {
                zzmaVarArr[i].a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void T() {
        zzkx u = this.l1.u();
        boolean z = true;
        if (!this.E1 && (u == null || !u.a.o())) {
            z = false;
        }
        zzln zzlnVar = this.x1;
        if (z != zzlnVar.g) {
            this.x1 = zzlnVar.a(z);
        }
    }

    public final void U(zzvb zzvbVar, zzxe zzxeVar, zzyy zzyyVar) {
        long e;
        long j;
        long j2;
        zzla zzlaVar = this.l1;
        zzkx u = zzlaVar.u();
        u.getClass();
        if (u == zzlaVar.v()) {
            e = this.K1;
            j = u.e();
        } else {
            e = this.K1 - u.e();
            j = u.g.b;
        }
        long j3 = e - j;
        long z0 = z0(u.c());
        if (f0(this.x1.a, u.g.a)) {
            j2 = this.V1.b();
        } else {
            j2 = C10323vs.b;
        }
        this.a1.b(new zzkr(this.o1, this.x1.a, zzvbVar, j3, z0, this.i1.c().a, this.x1.l, this.C1, j2, this.D1), zzxeVar, zzyyVar.c);
    }

    public final void V() throws zzik {
        zzln zzlnVar = this.x1;
        W(zzlnVar.l, zzlnVar.n, zzlnVar.m);
    }

    public final void W(boolean z, int i, int i2) throws zzik {
        X(z, this.s1.b(z, this.x1.e), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(boolean z, int i, int i2, int i3) throws zzik {
        boolean z2;
        zzln zzlnVar;
        zzkx v;
        zzyq[] zzyqVarArr;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = 0;
                }
                zzlnVar = this.x1;
                if (zzlnVar.l == z2 || zzlnVar.n != i2 || zzlnVar.m != i3) {
                    this.x1 = zzlnVar.d(z2, i3, i2);
                    a0(false, false);
                    zzla zzlaVar = this.l1;
                    for (v = zzlaVar.v(); v != null; v = v.g()) {
                        for (zzyq zzyqVar : v.i().c) {
                        }
                    }
                    if (e0()) {
                        S();
                        Y();
                        zzlaVar.G(this.K1);
                        return;
                    }
                    int i4 = this.x1.e;
                    if (i4 == 3) {
                        this.i1.h();
                        Q();
                        this.c1.j0(2);
                        return;
                    } else if (i4 == 2) {
                        this.c1.j0(2);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        if (i != 0) {
        }
        zzlnVar = this.x1;
        if (zzlnVar.l == z2) {
        }
        this.x1 = zzlnVar.d(z2, i3, i2);
        a0(false, false);
        zzla zzlaVar2 = this.l1;
        while (v != null) {
        }
        if (e0()) {
        }
    }

    public final void Z(zzbl zzblVar, zzvb zzvbVar, zzbl zzblVar2, zzvb zzvbVar2, long j, boolean z) throws zzik {
        Object obj;
        zzbb zzbbVar;
        if (!f0(zzblVar, zzvbVar)) {
            if (zzvbVar.b()) {
                zzbbVar = zzbb.d;
            } else {
                zzbbVar = this.x1.f290o;
            }
            if (!this.i1.c().equals(zzbbVar)) {
                M(zzbbVar);
                x(this.x1.f290o, zzbbVar.a, false, false);
                return;
            }
            return;
        }
        Object obj2 = zzvbVar.a;
        zzbj zzbjVar = this.g1;
        int i = zzblVar.n(obj2, zzbjVar).c;
        zzbk zzbkVar = this.f1;
        zzblVar.e(i, zzbkVar, 0L);
        zzid zzidVar = this.V1;
        zzaj zzajVar = zzbkVar.i;
        String str = zzeu.a;
        zzidVar.d(zzajVar);
        if (j != C10323vs.b) {
            zzidVar.e(w0(zzblVar, obj2, j));
            return;
        }
        Object obj3 = zzbkVar.a;
        if (!zzblVar2.o()) {
            obj = zzblVar2.e(zzblVar2.n(zzvbVar2.a, zzbjVar).c, zzbkVar, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        zzidVar.e(C10323vs.b);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void a(float f) {
        this.c1.j0(34);
    }

    public final void a0(boolean z, boolean z2) {
        this.C1 = z;
        long j = C10323vs.b;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.D1 = j;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void b(zzbb zzbbVar) {
        this.c1.f(16, zzbbVar).a();
    }

    public final boolean b0() {
        if (!this.r1) {
            return false;
        }
        zzma[] zzmaVarArr = this.X;
        for (int i = 0; i < 2; i++) {
            if (zzmaVarArr[i].g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void c(long j, long j2, zzz zzzVar, @InterfaceC11300zs1 MediaFormat mediaFormat) {
        if (this.v1) {
            this.c1.z(37).a();
        }
    }

    public final boolean c0() {
        zzkx v = this.l1.v();
        long j = v.g.e;
        if (!v.e) {
            return false;
        }
        if (j != C10323vs.b && this.x1.s >= j && e0()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void d(zzlr zzlrVar) {
        if (!this.z1 && this.e1.getThread().isAlive()) {
            this.c1.f(14, zzlrVar).a();
            return;
        }
        zzdx.f(C6118ei0.M1, "Ignoring messages sent after release.");
        zzlrVar.h(false);
    }

    public final long e(zzvb zzvbVar, long j, boolean z) throws zzik {
        boolean z2;
        zzla zzlaVar = this.l1;
        if (zzlaVar.v() != zzlaVar.z()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return f(zzvbVar, j, z2, z);
    }

    public final boolean e0() {
        zzln zzlnVar = this.x1;
        if (zzlnVar.l && zzlnVar.n == 0) {
            return true;
        }
        return false;
    }

    public final long f(zzvb zzvbVar, long j, boolean z, boolean z2) throws zzik {
        S();
        a0(false, true);
        if (z2 || this.x1.e == 3) {
            O(2);
        }
        zzla zzlaVar = this.l1;
        zzkx v = zzlaVar.v();
        zzkx zzkxVar = v;
        while (zzkxVar != null && !zzvbVar.equals(zzkxVar.g.a)) {
            zzkxVar = zzkxVar.g();
        }
        if (z || v != zzkxVar || (zzkxVar != null && zzkxVar.e() + j < 0)) {
            o();
            if (zzkxVar != null) {
                while (zzlaVar.v() != zzkxVar) {
                    zzlaVar.q();
                }
                zzlaVar.m(zzkxVar);
                zzkxVar.q(1000000000000L);
                q();
                zzkxVar.h = true;
            }
        }
        n();
        if (zzkxVar != null) {
            zzlaVar.m(zzkxVar);
            if (!zzkxVar.e) {
                zzkxVar.g = zzkxVar.g.b(j);
            } else if (zzkxVar.f) {
                zzuz zzuzVar = zzkxVar.a;
                j = zzuzVar.w(j);
                zzuzVar.p(j - this.h1, false);
            }
            H(j);
            y();
        } else {
            zzlaVar.E();
            H(j);
        }
        t(false);
        this.c1.j0(2);
        return j;
    }

    public final boolean f0(zzbl zzblVar, zzvb zzvbVar) {
        if (!zzvbVar.b() && !zzblVar.o()) {
            int i = zzblVar.n(zzvbVar.a, this.g1).c;
            zzbk zzbkVar = this.f1;
            zzblVar.e(i, zzbkVar, 0L);
            if (zzbkVar.b() && zzbkVar.h && zzbkVar.e != C10323vs.b) {
                return true;
            }
        }
        return false;
    }

    public final Pair g(zzbl zzblVar) {
        long j = 0;
        if (zzblVar.o()) {
            return Pair.create(zzln.i(), 0L);
        }
        int g = zzblVar.g(this.G1);
        zzbk zzbkVar = this.f1;
        zzbj zzbjVar = this.g1;
        Pair l = zzblVar.l(zzbkVar, zzbjVar, g, C10323vs.b);
        zzvb C = this.l1.C(zzblVar, l.first, 0L);
        long longValue = ((Long) l.second).longValue();
        if (C.b()) {
            zzblVar.n(C.a, zzbjVar);
            if (C.c == zzbjVar.e(C.b)) {
                zzbjVar.h();
            }
        } else {
            j = longValue;
        }
        return Pair.create(C, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final /* bridge */ /* synthetic */ void h(zzwv zzwvVar) {
        this.c1.f(9, (zzuz) zzwvVar).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:142|143|144|(1:145)|(3:360|361|(20:363|(1:639)(5:367|(2:369|370)(2:635|(1:637))|371|(1:373)|374)|375|(1:377)(1:634)|378|(1:633)(2:394|(2:396|(2:397|(3:399|(2:408|409)(2:405|406)|407)(16:410|411|(2:413|(1:415))|416|(15:506|(3:532|533|(11:535|(2:537|(2:538|(2:540|(1:542)(1:543))(3:544|545|(8:554|555|556|(8:562|(3:566|(3:568|(2:570|(2:574|575))(1:579)|577)|580)|581|(1:583)|584|585|(1:587)|588)|591|(1:593)|594|588))))(1:596)|419|(2:426|(2:427|(1:429)(2:430|(4:432|(3:434|(2:438|439)|440)|443|444))))|445|(4:(1:459)|460|(10:462|(2:464|(2:466|(8:470|471|(3:475|(1:477)|478)|479|(1:481)|482|(2:483|(3:485|(2:487|488)(1:490)|489))|492)))(1:494)|493|471|(4:473|475|(0)|478)|479|(0)|482|(3:483|(1:1)(0)|489)|492)(3:495|496|497)|446)|499|500|148|149|(3:151|(2:154|(2:156|157)(18:158|159|(2:161|(2:162|(3:164|(3:166|167|168)(8:170|171|172|173|(1:187)(1:177)|178|(1:186)(1:181)|(2:183|184)(1:185))|169)(2:188|189)))(1:303)|190|(4:198|(1:200)|201|(10:203|204|(2:206|(2:207|(3:209|(2:211|212)(1:214)|213)(3:215|216|(7:224|(1:226)(2:244|(1:246)(2:247|248))|227|(1:243)(1:231)|232|(1:242)|235))))|249|227|(1:229)|243|232|(1:234)(1:242)|235))|250|(2:252|(1:254)(1:(13:261|(7:263|(1:265)(1:281)|266|(1:280)(1:270)|271|(1:279)(1:275)|(1:278))|256|(1:258)|204|(0)|249|227|(0)|243|232|(0)(0)|235)(1:260)))|282|(2:284|(2:286|(4:288|289|(4:291|(4:293|(1:295)|296|297)|298|299)|300))(0))|204|(0)|249|227|(0)|243|232|(0)(0)|235))|153)))|508|509|(3:513|(3:515|(4:522|(1:529)(1:526)|527|528)|519)|531)|419|(4:421|423|426|(3:427|(0)(0)|429))|445|(9:448|450|452|454|456|(0)|460|(0)(0)|446)|505|499|500|148|149|(0))|418|419|(0)|445|(1:446)|505|499|500|148|149|(0))))(1:631))|632|416|(0)|418|419|(0)|445|(1:446)|505|499|500|148|149|(0)))|147|148|149|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x08d0, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x09bb, code lost:
        if (r6 != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x09e8, code lost:
        if (r7 == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0b7c, code lost:
        if (r2 != null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b84, code lost:
        r2 = r2.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0b93, code lost:
        y();
        r41.c1.j0(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0ba1, code lost:
        r2.addSuppressed(r0);
        r0 = r41.O1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0bab, code lost:
        r2 = r41.l1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0bb5, code lost:
        if (r2.v() != r2.z()) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0bbf, code lost:
        if (r2.v() != r2.z()) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0bc1, code lost:
        r2.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0bc5, code lost:
        r2 = r2.v();
        r2.getClass();
        A();
        r2 = r2.g;
        r3 = r2.a;
        r3 = r2.b;
        r41.x1 = m(r3, r3, r2.c, r3, true, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0bf5, code lost:
        com.google.android.gms.internal.ads.zzdx.g(r12, "Recoverable renderer error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0bfc, code lost:
        if (r41.O1 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0bfe, code lost:
        r41.O1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0c00, code lost:
        r2 = r41.c1;
        r2.g(r2.f(25, r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x08ae: MOVE  (r11 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:466:0x08ae */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x08b0: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:466:0x08ae */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0599 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TRY_LEAVE, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0709 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0723 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, LOOP:11: B:371:0x071f->B:373:0x0723, LOOP_END, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0775 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0795 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07a1 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0806 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, LOOP:14: B:418:0x0804->B:419:0x0806, LOOP_END, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0814 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0824 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x04a1, zzik -> 0x04a4, TryCatch #2 {zzik -> 0x04a4, blocks: (B:213:0x049b, B:221:0x04ba, B:223:0x04c0, B:224:0x04c5, B:228:0x04d0, B:230:0x04d4, B:232:0x04e5, B:234:0x04e9, B:236:0x04ed, B:238:0x04f1, B:240:0x04f7, B:242:0x04fd, B:244:0x0503, B:246:0x0509, B:248:0x0511, B:250:0x051b, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0558, B:262:0x055d, B:264:0x056a, B:266:0x0578, B:270:0x058d, B:363:0x0703, B:365:0x0709, B:367:0x070f, B:370:0x0714, B:371:0x071f, B:373:0x0723, B:377:0x0748, B:379:0x074e, B:381:0x0756, B:382:0x075e, B:383:0x0761, B:385:0x076a, B:433:0x0838, B:442:0x0853, B:452:0x088b, B:388:0x0775, B:390:0x0779, B:392:0x077f, B:394:0x0785, B:396:0x078f, B:399:0x0795, B:400:0x0798, B:402:0x07a1, B:404:0x07b3, B:406:0x07bc, B:408:0x07c4, B:413:0x07d0, B:415:0x07fb, B:417:0x0801, B:419:0x0806, B:420:0x080e, B:422:0x0814, B:423:0x0817, B:424:0x0820, B:426:0x0824, B:428:0x082a, B:429:0x082f, B:432:0x0837, B:273:0x0599, B:283:0x05b6, B:288:0x05c7, B:292:0x05d9, B:297:0x061a, B:299:0x0621, B:301:0x0625, B:305:0x0635, B:307:0x0639, B:311:0x0640, B:313:0x0646, B:315:0x0663, B:318:0x066c, B:320:0x0671, B:322:0x0678, B:323:0x0680, B:325:0x0686, B:303:0x062b, B:328:0x0696, B:344:0x06ca, B:346:0x06d0, B:348:0x06d4, B:350:0x06d9, B:362:0x0700, B:353:0x06e2, B:355:0x06e8, B:359:0x06f6, B:361:0x06fd, B:231:0x04e2, B:218:0x04a9, B:220:0x04af), top: B:667:0x0463 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a80 A[Catch: IOException -> 0x002b, zzub -> 0x002e, zzgh -> 0x0031, zzaz -> 0x0034, zzru -> 0x0037, RuntimeException -> 0x08aa, zzik -> 0x08ad, TryCatch #25 {zzik -> 0x08ad, RuntimeException -> 0x08aa, blocks: (B:474:0x08c7, B:457:0x0899, B:459:0x08a0, B:467:0x08b4, B:473:0x08c4, B:479:0x08e5, B:481:0x08eb, B:485:0x08f3, B:487:0x08fb, B:489:0x08ff, B:490:0x090a, B:492:0x0910, B:543:0x0a1b, B:546:0x0a22, B:548:0x0a26, B:550:0x0a2e, B:551:0x0a31, B:552:0x0a34, B:554:0x0a3a, B:556:0x0a43, B:558:0x0a4d, B:560:0x0a53, B:562:0x0a59, B:569:0x0a7a, B:571:0x0a80, B:575:0x0a8a, B:585:0x0aa2, B:582:0x0a9b, B:584:0x0a9f, B:563:0x0a60, B:566:0x0a6e, B:567:0x0a75, B:568:0x0a76, B:493:0x0919, B:495:0x091f, B:497:0x0923, B:522:0x09bd, B:524:0x09c9, B:500:0x092d, B:502:0x0931, B:504:0x0943, B:506:0x094e, B:508:0x0958, B:512:0x0961, B:514:0x096b, B:520:0x0976, B:525:0x09d6, B:527:0x09dd, B:529:0x09e1, B:533:0x09ea, B:535:0x09f9, B:537:0x09ff, B:539:0x0a09, B:540:0x0a0e, B:541:0x0a13, B:542:0x0a18, B:478:0x08da, B:588:0x0aae, B:592:0x0ab9), top: B:677:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0a93 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0a94 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0b7c A[LOOP:8: B:634:0x0b7c->B:637:0x0b84, LOOP_START, PHI: r2 
      PHI: (r2v33 com.google.android.gms.internal.ads.zzkx) = (r2v31 com.google.android.gms.internal.ads.zzkx), (r2v34 com.google.android.gms.internal.ads.zzkx) binds: [B:632:0x0b79, B:637:0x0b84] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0836 A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        String str;
        zzik zzikVar;
        boolean z;
        zzkx z2;
        zze zzeVar;
        String str2;
        String str3;
        boolean z3;
        long uptimeMillis;
        zzdq zzdqVar;
        long j;
        long j2;
        zzkx z4;
        int i;
        zzla zzlaVar;
        boolean z5;
        zzkx z6;
        boolean z7;
        long j3;
        zzik zzikVar2;
        zzkx v;
        zzkx g;
        zzkx q;
        char c;
        boolean z8;
        int i2;
        int i3;
        zzkx z9;
        zzyy i4;
        int i5;
        int i6;
        zzma[] zzmaVarArr;
        zzkx y;
        long j4;
        zzky A;
        int i7;
        long j5;
        boolean z10;
        boolean z11;
        zzyq[] zzyqVarArr;
        boolean e;
        int i8;
        long j6;
        String str4;
        int i9;
        List list;
        zzww zzwwVar;
        List list2;
        zzww zzwwVar2;
        int i10;
        long j7;
        List list3;
        zzww zzwwVar3;
        String str5 = "Playback error";
        String str6 = C6118ei0.M1;
        try {
            try {
                try {
                    zzeVar = null;
                } catch (zzaz e2) {
                    e = e2;
                } catch (zzgh e3) {
                    e = e3;
                } catch (zzru e4) {
                    e = e4;
                } catch (zzub e5) {
                    e = e5;
                } catch (IOException e6) {
                    e = e6;
                }
                try {
                } catch (zzik e7) {
                    e = e7;
                    str5 = str2;
                    str6 = str3;
                } catch (RuntimeException e8) {
                    e = e8;
                    zzik d = zzik.d(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                    zzdx.d(C6118ei0.M1, str, d);
                    R(true, false);
                    this.x1 = this.x1.e(d);
                    z = true;
                    A();
                    return z;
                }
            } catch (zzik e9) {
                e = e9;
            }
        } catch (RuntimeException e10) {
            e = e10;
        }
        switch (message.what) {
            case 1:
                boolean z12 = message.arg1 != 0;
                int i11 = message.arg2;
                N(z12, i11 >> 4, true, i11 & 15);
                z = true;
                break;
            case 2:
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    zzdqVar = this.c1;
                    zzdqVar.A(2);
                    try {
                        try {
                        } catch (RuntimeException e11) {
                            e = e11;
                        }
                    } catch (zzik e12) {
                        e = e12;
                    }
                } catch (zzik e13) {
                    e = e13;
                }
                if (!this.x1.a.o()) {
                    try {
                    } catch (zzik e14) {
                        e = e14;
                        if (e.Z == 1) {
                            e = e.a(z2.g.a);
                            break;
                        }
                        if (e.Z == 1) {
                            int i12 = e.Z0;
                            zzla zzlaVar2 = this.l1;
                            if (zzlaVar2.y() != null) {
                                this.S1 = true;
                                n();
                                zzkx y2 = zzlaVar2.y();
                                zzkx v2 = zzlaVar2.v();
                                if (zzlaVar2.v() != y2) {
                                }
                                zzlaVar2.m(v2);
                                if (this.x1.e != 4) {
                                }
                                z = true;
                                A();
                                return z;
                            }
                            break;
                        }
                        zzikVar = this.O1;
                        if (zzikVar != null) {
                        }
                        if (e.Z == 1) {
                        }
                        if (e.d1) {
                            break;
                        }
                        zzdx.d(str6, str5, e);
                        z = true;
                        R(true, false);
                        this.x1 = this.x1.e(e);
                        A();
                        return z;
                    }
                    if (this.m1.j()) {
                        zzla zzlaVar3 = this.l1;
                        zzlaVar3.G(this.K1);
                        if (!zzlaVar3.L() || (A = zzlaVar3.A(this.K1, this.x1)) == null) {
                            str = "Playback error";
                        } else {
                            zzkx t = zzlaVar3.t(A);
                            if (!t.d) {
                                str = "Playback error";
                                t.m(this, A.b);
                            } else {
                                str = "Playback error";
                                if (t.e) {
                                    zzdqVar.f(8, t.a).a();
                                }
                            }
                            if (zzlaVar3.v() == t) {
                                H(A.b);
                            }
                            t(false);
                        }
                        if (this.E1) {
                            this.E1 = g0(zzlaVar3.u());
                            T();
                        } else {
                            y();
                        }
                        if (this.B1 || !this.r1 || this.S1 || b0() || (y = zzlaVar3.y()) == null || y != zzlaVar3.z() || y.g() == null || !y.g().e) {
                            j = uptimeMillis;
                        } else {
                            zzlaVar3.r();
                            zzkx y3 = zzlaVar3.y();
                            if (y3 != null) {
                                zzyy i13 = y3.i();
                                long j8 = uptimeMillis;
                                int i14 = 0;
                                while (true) {
                                    zzma[] zzmaVarArr2 = this.X;
                                    if (i14 < 2) {
                                        if (i13.b(i14) && zzmaVarArr2[i14].e() && !zzmaVarArr2[i14].g()) {
                                            zzmaVarArr2[i14].W();
                                            j4 = j8;
                                            p(y3, i14, false, y3.f());
                                        } else {
                                            j4 = j8;
                                        }
                                        i14++;
                                        j8 = j4;
                                    } else {
                                        j = j8;
                                        j2 = C10323vs.b;
                                        if (b0()) {
                                            this.R1 = y3.a.f();
                                            if (!y3.s()) {
                                                zzlaVar3.m(y3);
                                                t(false);
                                                y();
                                            }
                                        }
                                        z4 = zzlaVar3.z();
                                        if (z4 != null) {
                                            if (z4.g() != null) {
                                                try {
                                                } catch (zzaz e15) {
                                                    e = e15;
                                                    s(e, e.Y != 1 ? true != e.X ? AD1.n1 : 3001 : 1000);
                                                    z = true;
                                                    A();
                                                    return z;
                                                } catch (zzgh e16) {
                                                    e = e16;
                                                    s(e, e.X);
                                                    z = true;
                                                    A();
                                                    return z;
                                                } catch (zzik e17) {
                                                    e = e17;
                                                    str5 = str;
                                                    if (e.Z == 1) {
                                                    }
                                                    if (e.Z == 1) {
                                                    }
                                                    zzikVar = this.O1;
                                                    if (zzikVar != null) {
                                                    }
                                                    if (e.Z == 1) {
                                                    }
                                                    if (e.d1) {
                                                    }
                                                    zzdx.d(str6, str5, e);
                                                    z = true;
                                                    R(true, false);
                                                    this.x1 = this.x1.e(e);
                                                    A();
                                                    return z;
                                                } catch (zzru e18) {
                                                    e = e18;
                                                    s(e, e.X);
                                                    z = true;
                                                    A();
                                                    return z;
                                                } catch (zzub e19) {
                                                    e = e19;
                                                    s(e, 1002);
                                                    z = true;
                                                    A();
                                                    return z;
                                                } catch (IOException e20) {
                                                    e = e20;
                                                    s(e, 2000);
                                                    z = true;
                                                    A();
                                                    return z;
                                                } catch (RuntimeException e21) {
                                                    e = e21;
                                                    if (e instanceof IllegalStateException) {
                                                        break;
                                                    }
                                                    zzik d2 = zzik.d(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                                    zzdx.d(C6118ei0.M1, str, d2);
                                                    R(true, false);
                                                    this.x1 = this.x1.e(d2);
                                                    z = true;
                                                    A();
                                                    return z;
                                                }
                                                if (!this.B1) {
                                                    zzkx z13 = zzlaVar3.z();
                                                    if (z13.e) {
                                                        int i15 = 0;
                                                        while (true) {
                                                            zzma[] zzmaVarArr3 = this.X;
                                                            if (i15 < 2) {
                                                                if (zzmaVarArr3[i15].c(z13)) {
                                                                    i15++;
                                                                }
                                                            } else if ((!b0() || zzlaVar3.y() != zzlaVar3.z()) && (z4.g().e || this.K1 >= z4.g().f())) {
                                                                zzyy i16 = z4.i();
                                                                zzkx s = zzlaVar3.s();
                                                                zzyy i17 = s.i();
                                                                zzbl zzblVar = this.x1.a;
                                                                i = 1;
                                                                Z(zzblVar, s.g.a, zzblVar, z4.g.a, C10323vs.b, false);
                                                                if (s.e && (((z5 = this.r1) && this.R1 != j2) || s.a.f() != j2)) {
                                                                    this.R1 = j2;
                                                                    if (z5 && !this.S1) {
                                                                        for (int i18 = 0; i18 < 2; i18++) {
                                                                            if (i17.b(i18)) {
                                                                                zzmaVarArr3[i18].y();
                                                                                zzyq[] zzyqVarArr2 = i17.c;
                                                                                if (!zzay.f(zzyqVarArr2[i18].b().f301o, zzyqVarArr2[i18].b().k) && !zzmaVarArr3[i18].g()) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    long f = s.f();
                                                                    for (int i19 = 0; i19 < 2; i19++) {
                                                                        zzmaVarArr3[i19].O(f);
                                                                    }
                                                                    if (!s.s()) {
                                                                        zzlaVar3.m(s);
                                                                        t(false);
                                                                        y();
                                                                    }
                                                                    zzlaVar = zzlaVar3;
                                                                }
                                                                for (int i20 = 0; i20 < 2; i20++) {
                                                                    zzmaVarArr3[i20].I(i16, i17, s.f());
                                                                }
                                                                zzlaVar = zzlaVar3;
                                                            }
                                                        }
                                                    } else {
                                                        i = 1;
                                                        zzlaVar = zzlaVar3;
                                                    }
                                                    z6 = zzlaVar.z();
                                                    if (z6 != null && zzlaVar.v() != z6 && !z6.h) {
                                                        z9 = zzlaVar.z();
                                                        i4 = z9.i();
                                                        i5 = i;
                                                        i6 = 0;
                                                        while (true) {
                                                            zzmaVarArr = this.X;
                                                            if (i6 >= 2) {
                                                                int x = zzmaVarArr[i6].x();
                                                                int z14 = zzmaVarArr[i6].z(z9, i4, this.i1);
                                                                this.I1 -= x - zzmaVarArr[i6].x();
                                                                i5 &= z14 & 1;
                                                                i6++;
                                                            } else if (i5 != 0) {
                                                                for (int i21 = 0; i21 < 2; i21++) {
                                                                    if (i4.b(i21) && !zzmaVarArr[i21].i(z9)) {
                                                                        p(z9, i21, false, z9.f());
                                                                    }
                                                                }
                                                                zzlaVar.z().h = i;
                                                            }
                                                        }
                                                    }
                                                    z7 = false;
                                                    while (e0() && !this.B1 && (v = zzlaVar.v()) != null && (g = v.g()) != null && this.K1 >= g.f() && g.h) {
                                                        if (z7) {
                                                            A();
                                                        }
                                                        this.S1 = false;
                                                        q = zzlaVar.q();
                                                        if (q == null) {
                                                            if (this.x1.b.a.equals(q.g.a.a)) {
                                                                zzvb zzvbVar = this.x1.b;
                                                                c = 65535;
                                                                if (zzvbVar.b == -1) {
                                                                    zzvb zzvbVar2 = q.g.a;
                                                                    if (zzvbVar2.b == -1 && zzvbVar.e != zzvbVar2.e) {
                                                                        z8 = true;
                                                                        zzky zzkyVar = q.g;
                                                                        boolean z15 = z8;
                                                                        zzvb zzvbVar3 = zzkyVar.a;
                                                                        long j9 = zzkyVar.b;
                                                                        long j10 = j2;
                                                                        this.x1 = m(zzvbVar3, j9, zzkyVar.c, j9, !z15, 0);
                                                                        G();
                                                                        Y();
                                                                        if (b0() && q == zzlaVar.y()) {
                                                                            zzma[] zzmaVarArr4 = this.X;
                                                                            for (i3 = 0; i3 < 2; i3++) {
                                                                                zzmaVarArr4[i3].H();
                                                                            }
                                                                        }
                                                                        if (this.x1.e == 3) {
                                                                            Q();
                                                                        }
                                                                        zzyy i22 = zzlaVar.v().i();
                                                                        i2 = 0;
                                                                        while (true) {
                                                                            zzma[] zzmaVarArr5 = this.X;
                                                                            if (i2 >= 2) {
                                                                                if (i22.b(i2)) {
                                                                                    zzmaVarArr5[i2].E();
                                                                                }
                                                                                i2++;
                                                                            }
                                                                        }
                                                                        j2 = j10;
                                                                        z7 = true;
                                                                    }
                                                                }
                                                            } else {
                                                                c = 65535;
                                                            }
                                                            z8 = false;
                                                            zzky zzkyVar2 = q.g;
                                                            boolean z152 = z8;
                                                            zzvb zzvbVar32 = zzkyVar2.a;
                                                            long j92 = zzkyVar2.b;
                                                            long j102 = j2;
                                                            this.x1 = m(zzvbVar32, j92, zzkyVar2.c, j92, !z152, 0);
                                                            G();
                                                            Y();
                                                            if (b0()) {
                                                                zzma[] zzmaVarArr42 = this.X;
                                                                while (i3 < 2) {
                                                                }
                                                            }
                                                            if (this.x1.e == 3) {
                                                            }
                                                            zzyy i222 = zzlaVar.v().i();
                                                            i2 = 0;
                                                            while (true) {
                                                                zzma[] zzmaVarArr52 = this.X;
                                                                if (i2 >= 2) {
                                                                    break;
                                                                }
                                                                i2++;
                                                            }
                                                            j2 = j102;
                                                            z7 = true;
                                                        } else {
                                                            throw null;
                                                        }
                                                    }
                                                    j3 = j2;
                                                    zzikVar2 = null;
                                                    long j11 = this.Q1.a;
                                                    i7 = this.x1.e;
                                                    z = true;
                                                    if (i7 != 1) {
                                                        if (i7 != 4) {
                                                            zzla zzlaVar4 = this.l1;
                                                            zzkx v3 = zzlaVar4.v();
                                                            if (v3 == null) {
                                                                J(j);
                                                            } else {
                                                                long j12 = j;
                                                                Trace.beginSection("doSomeWork");
                                                                Y();
                                                                if (v3.e) {
                                                                    this.L1 = zzeu.N(SystemClock.elapsedRealtime());
                                                                    boolean z16 = false;
                                                                    v3.a.p(this.x1.s - this.h1, false);
                                                                    int i23 = 0;
                                                                    z10 = true;
                                                                    z11 = true;
                                                                    while (true) {
                                                                        zzma[] zzmaVarArr6 = this.X;
                                                                        if (i23 < 2) {
                                                                            zzma zzmaVar = zzmaVarArr6[i23];
                                                                            if (zzmaVar.x() == 0) {
                                                                                C(i23, z16);
                                                                                str4 = str6;
                                                                                j6 = j3;
                                                                            } else {
                                                                                j6 = j3;
                                                                                str4 = str6;
                                                                                zzmaVar.L(this.K1, this.L1);
                                                                                z10 = z10 && zzmaVar.f();
                                                                                boolean b = zzmaVar.b(v3);
                                                                                C(i23, b);
                                                                                z11 = z11 && b;
                                                                                if (!b) {
                                                                                    B(i23);
                                                                                }
                                                                            }
                                                                            i23++;
                                                                            str6 = str4;
                                                                            j3 = j6;
                                                                            z16 = false;
                                                                        } else {
                                                                            j5 = j3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j5 = j3;
                                                                    v3.a.j();
                                                                    z10 = true;
                                                                    z11 = true;
                                                                }
                                                                long j13 = v3.g.e;
                                                                if (z10 && v3.e && (j13 == j5 || j13 <= this.x1.s)) {
                                                                    if (this.B1) {
                                                                        this.B1 = false;
                                                                        N(false, this.x1.n, false, 5);
                                                                    }
                                                                    if (v3.g.j) {
                                                                        O(4);
                                                                        S();
                                                                        if (this.x1.e == 2) {
                                                                            int i24 = 0;
                                                                            while (true) {
                                                                                zzma[] zzmaVarArr7 = this.X;
                                                                                if (i24 < 2) {
                                                                                    if (zzmaVarArr7[i24].i(v3)) {
                                                                                        B(i24);
                                                                                    }
                                                                                    i24++;
                                                                                } else {
                                                                                    zzln zzlnVar = this.x1;
                                                                                    if (!zzlnVar.g && zzlnVar.r < C6118ei0.r2 && g0(zzlaVar4.u()) && e0()) {
                                                                                        if (this.P1 == j5) {
                                                                                            this.P1 = SystemClock.elapsedRealtime();
                                                                                        } else if (SystemClock.elapsedRealtime() - this.P1 >= C6118ei0.q2) {
                                                                                            throw new IllegalStateException("Playback stuck buffering and not loading");
                                                                                        }
                                                                                        boolean z17 = !e0() && this.x1.e == 3;
                                                                                        zzln zzlnVar2 = this.x1;
                                                                                        boolean z18 = zzlnVar2.p;
                                                                                        i8 = zzlnVar2.e;
                                                                                        if (i8 != 4 && (z17 || i8 == 2 || (i8 == 3 && this.I1 != 0))) {
                                                                                            J(j12);
                                                                                        }
                                                                                        Trace.endSection();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        this.P1 = j5;
                                                                        if (e0()) {
                                                                        }
                                                                        zzln zzlnVar22 = this.x1;
                                                                        boolean z182 = zzlnVar22.p;
                                                                        i8 = zzlnVar22.e;
                                                                        if (i8 != 4) {
                                                                            J(j12);
                                                                        }
                                                                        Trace.endSection();
                                                                    }
                                                                }
                                                                zzln zzlnVar3 = this.x1;
                                                                if (zzlnVar3.e == 2) {
                                                                    if (this.I1 == 0) {
                                                                        e = c0();
                                                                        break;
                                                                    } else if (z11) {
                                                                        if (zzlnVar3.g) {
                                                                            zzkx v4 = zzlaVar4.v();
                                                                            long b2 = f0(this.x1.a, v4.g.a) ? this.V1.b() : j5;
                                                                            zzkx u = zzlaVar4.u();
                                                                            boolean z19 = u.s() && u.g.j;
                                                                            boolean z20 = u.g.a.b() && !u.e;
                                                                            if (!z19 && !z20) {
                                                                                e = this.a1.e(new zzkr(this.o1, this.x1.a, v4.g.a, this.K1 - v4.e(), z0(u.c()), this.i1.c().a, this.x1.l, this.C1, b2, this.D1));
                                                                                break;
                                                                            }
                                                                        }
                                                                        O(3);
                                                                        this.O1 = zzikVar2;
                                                                        if (e0()) {
                                                                            a0(false, false);
                                                                            this.i1.h();
                                                                            Q();
                                                                        }
                                                                        if (this.x1.e == 2) {
                                                                        }
                                                                        this.P1 = j5;
                                                                        if (e0()) {
                                                                        }
                                                                        zzln zzlnVar222 = this.x1;
                                                                        boolean z1822 = zzlnVar222.p;
                                                                        i8 = zzlnVar222.e;
                                                                        if (i8 != 4) {
                                                                        }
                                                                        Trace.endSection();
                                                                    }
                                                                }
                                                                if (this.x1.e == 3) {
                                                                    if (this.I1 == 0) {
                                                                        if (!c0()) {
                                                                            a0(e0(), false);
                                                                            O(2);
                                                                            if (this.C1) {
                                                                                for (zzkx v5 = zzlaVar4.v(); v5 != null; v5 = v5.g()) {
                                                                                    for (zzyq zzyqVar : v5.i().c) {
                                                                                    }
                                                                                }
                                                                                this.V1.c();
                                                                            }
                                                                            S();
                                                                        }
                                                                    }
                                                                }
                                                                if (this.x1.e == 2) {
                                                                }
                                                                this.P1 = j5;
                                                                if (e0()) {
                                                                }
                                                                zzln zzlnVar2222 = this.x1;
                                                                boolean z18222 = zzlnVar2222.p;
                                                                i8 = zzlnVar2222.e;
                                                                if (i8 != 4) {
                                                                }
                                                                Trace.endSection();
                                                            }
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            zzlaVar = zzlaVar3;
                                            i = 1;
                                            if (z4.g.j || this.B1) {
                                                zzma[] zzmaVarArr8 = this.X;
                                                for (int i25 = 0; i25 < 2; i25++) {
                                                    zzma zzmaVar2 = zzmaVarArr8[i25];
                                                    if (zzmaVar2.i(z4) && zzmaVar2.d(z4)) {
                                                        long j14 = z4.g.e;
                                                        zzmaVar2.P(z4, (j14 == j2 || j14 == Long.MIN_VALUE) ? j2 : j14 + z4.e());
                                                    }
                                                }
                                            }
                                            z6 = zzlaVar.z();
                                            if (z6 != null) {
                                                z9 = zzlaVar.z();
                                                i4 = z9.i();
                                                i5 = i;
                                                i6 = 0;
                                                while (true) {
                                                    zzmaVarArr = this.X;
                                                    if (i6 >= 2) {
                                                    }
                                                    int x2 = zzmaVarArr[i6].x();
                                                    int z142 = zzmaVarArr[i6].z(z9, i4, this.i1);
                                                    this.I1 -= x2 - zzmaVarArr[i6].x();
                                                    i5 &= z142 & 1;
                                                    i6++;
                                                }
                                            }
                                            z7 = false;
                                            while (e0()) {
                                                if (z7) {
                                                }
                                                this.S1 = false;
                                                q = zzlaVar.q();
                                                if (q == null) {
                                                }
                                            }
                                            j3 = j2;
                                            zzikVar2 = null;
                                            long j112 = this.Q1.a;
                                            i7 = this.x1.e;
                                            z = true;
                                            if (i7 != 1) {
                                            }
                                        }
                                        zzlaVar = zzlaVar3;
                                        i = 1;
                                        z6 = zzlaVar.z();
                                        if (z6 != null) {
                                        }
                                        z7 = false;
                                        while (e0()) {
                                        }
                                        j3 = j2;
                                        zzikVar2 = null;
                                        long j1122 = this.Q1.a;
                                        i7 = this.x1.e;
                                        z = true;
                                        if (i7 != 1) {
                                        }
                                    }
                                }
                            } else {
                                j = uptimeMillis;
                            }
                        }
                        j2 = C10323vs.b;
                        z4 = zzlaVar3.z();
                        if (z4 != null) {
                        }
                        zzlaVar = zzlaVar3;
                        i = 1;
                        z6 = zzlaVar.z();
                        if (z6 != null) {
                        }
                        z7 = false;
                        while (e0()) {
                        }
                        j3 = j2;
                        zzikVar2 = null;
                        long j11222 = this.Q1.a;
                        i7 = this.x1.e;
                        z = true;
                        if (i7 != 1) {
                        }
                    }
                }
                j = uptimeMillis;
                zzikVar2 = null;
                str = "Playback error";
                j3 = C10323vs.b;
                i7 = this.x1.e;
                z = true;
                if (i7 != 1) {
                }
                break;
            case 3:
                z3 = true;
                L((zzkm) message.obj, true);
                z = z3;
                break;
            case 4:
                z3 = true;
                M((zzbb) message.obj);
                w(this.i1.c(), true);
                z = z3;
                break;
            case 5:
                z3 = true;
                this.t1 = (zzmd) message.obj;
                z = z3;
                break;
            case 6:
                z3 = true;
                R(false, true);
                z = z3;
                break;
            case 7:
                zzdj zzdjVar = (zzdj) message.obj;
                try {
                    F(true, false, true, false);
                    int i26 = 0;
                    while (true) {
                        zzma[] zzmaVarArr9 = this.X;
                        if (i26 < 2) {
                            this.Y[i26].r();
                            zzmaVarArr9[i26].K();
                            i26++;
                        } else {
                            this.a1.g(this.o1);
                            this.s1.d();
                            this.Y0.c();
                            O(1);
                            this.d1.b();
                            zzdjVar.f();
                            return true;
                        }
                    }
                } finally {
                    this.d1.b();
                    zzdjVar.f();
                }
            case 8:
                try {
                    zzuz zzuzVar = (zzuz) message.obj;
                    zzla zzlaVar5 = this.l1;
                    if (zzlaVar5.J(zzuzVar)) {
                        zzkx u2 = zzlaVar5.u();
                        if (u2 != null) {
                            if (!u2.e) {
                                float f2 = this.i1.c().a;
                                zzln zzlnVar4 = this.x1;
                                u2.l(f2, zzlnVar4.a, zzlnVar4.l);
                            }
                            U(u2.g.a, u2.h(), u2.i());
                            if (u2 == zzlaVar5.v()) {
                                H(u2.g.b);
                                q();
                                u2.h = true;
                                zzln zzlnVar5 = this.x1;
                                try {
                                    zzvb zzvbVar4 = zzlnVar5.b;
                                    long j15 = u2.g.b;
                                    z3 = true;
                                    this.x1 = m(zzvbVar4, j15, zzlnVar5.c, j15, false, 5);
                                } catch (zzaz e22) {
                                    e = e22;
                                    s(e, e.Y != 1 ? true != e.X ? AD1.n1 : 3001 : 1000);
                                    z = true;
                                    A();
                                    return z;
                                } catch (zzgh e23) {
                                    e = e23;
                                    s(e, e.X);
                                    z = true;
                                    A();
                                    return z;
                                } catch (zzik e24) {
                                    e = e24;
                                    if (e.Z == 1) {
                                    }
                                    if (e.Z == 1) {
                                    }
                                    zzikVar = this.O1;
                                    if (zzikVar != null) {
                                    }
                                    if (e.Z == 1) {
                                    }
                                    if (e.d1) {
                                    }
                                    zzdx.d(str6, str5, e);
                                    z = true;
                                    R(true, false);
                                    this.x1 = this.x1.e(e);
                                    A();
                                    return z;
                                } catch (zzru e25) {
                                    e = e25;
                                    s(e, e.X);
                                    z = true;
                                    A();
                                    return z;
                                } catch (zzub e26) {
                                    e = e26;
                                    s(e, 1002);
                                    z = true;
                                    A();
                                    return z;
                                } catch (IOException e27) {
                                    e = e27;
                                    s(e, 2000);
                                    z = true;
                                    A();
                                    return z;
                                } catch (RuntimeException e28) {
                                    e = e28;
                                    str = "Playback error";
                                    zzik d22 = zzik.d(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                    zzdx.d(C6118ei0.M1, str, d22);
                                    R(true, false);
                                    this.x1 = this.x1.e(d22);
                                    z = true;
                                    A();
                                    return z;
                                }
                            } else {
                                z3 = true;
                            }
                            y();
                        } else {
                            throw null;
                        }
                    } else {
                        z3 = true;
                        zzkx w = zzlaVar5.w(zzuzVar);
                        if (w != null) {
                            zzdc.f(!w.e);
                            float f3 = this.i1.c().a;
                            zzln zzlnVar6 = this.x1;
                            w.l(f3, zzlnVar6.a, zzlnVar6.l);
                            if (zzlaVar5.K(zzuzVar)) {
                                z();
                            }
                        }
                    }
                    z = z3;
                } catch (zzaz e29) {
                    e = e29;
                } catch (zzgh e30) {
                    e = e30;
                } catch (zzik e31) {
                    e = e31;
                } catch (zzru e32) {
                    e = e32;
                } catch (zzub e33) {
                    e = e33;
                } catch (IOException e34) {
                    e = e34;
                } catch (RuntimeException e35) {
                    e = e35;
                }
                break;
            case 9:
                zzuz zzuzVar2 = (zzuz) message.obj;
                zzla zzlaVar6 = this.l1;
                if (zzlaVar6.J(zzuzVar2)) {
                    zzlaVar6.G(this.K1);
                    y();
                } else if (zzlaVar6.K(zzuzVar2)) {
                    z();
                }
                z = true;
                break;
            case 10:
                D();
                z = true;
                break;
            case 11:
                int i27 = message.arg1;
                this.F1 = i27;
                int o2 = this.l1.o(this.x1.a, i27);
                if ((o2 & 1) != 0) {
                    K(true);
                } else if ((o2 & 2) != 0) {
                    n();
                }
                t(false);
                z = true;
                break;
            case 12:
                boolean z21 = message.arg1 != 0;
                this.G1 = z21;
                int p = this.l1.p(this.x1.a, z21);
                if ((p & 1) != 0) {
                    K(true);
                } else if ((p & 2) != 0) {
                    n();
                }
                t(false);
                z = true;
                break;
            case 13:
                boolean z22 = message.arg1 != 0;
                zzdj zzdjVar2 = (zzdj) message.obj;
                if (this.H1 != z22) {
                    this.H1 = z22;
                    if (!z22) {
                        zzma[] zzmaVarArr10 = this.X;
                        for (int i28 = 0; i28 < 2; i28++) {
                            zzmaVarArr10[i28].M();
                        }
                    }
                }
                if (zzdjVar2 != null) {
                    zzdjVar2.f();
                }
                z = true;
                break;
            case 14:
                zzlr zzlrVar = (zzlr) message.obj;
                if (zzlrVar.b() == this.e1) {
                    h0(zzlrVar);
                    int i29 = this.x1.e;
                    if (i29 == 3 || i29 == 2) {
                        this.c1.j0(2);
                    }
                } else {
                    this.c1.f(15, zzlrVar).a();
                }
                z = true;
                break;
            case 15:
                final zzlr zzlrVar2 = (zzlr) message.obj;
                Looper b3 = zzlrVar2.b();
                if (!b3.getThread().isAlive()) {
                    zzdx.f("TAG", "Trying to send message on a dead thread.");
                    zzlrVar2.h(false);
                } else {
                    this.k1.d(b3, null).h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzko.l0(zzko.this, zzlrVar2);
                        }
                    });
                }
                z = true;
                break;
            case 16:
                w((zzbb) message.obj, false);
                z = true;
                break;
            case 17:
                zzki zzkiVar = (zzki) message.obj;
                this.y1.a(1);
                i9 = zzkiVar.b;
                if (i9 != -1) {
                    list2 = zzkiVar.a;
                    zzwwVar2 = zzkiVar.d;
                    zzlt zzltVar = new zzlt(list2, zzwwVar2);
                    i10 = zzkiVar.b;
                    j7 = zzkiVar.c;
                    this.J1 = new zzkm(zzltVar, i10, j7);
                }
                zzlm zzlmVar = this.m1;
                list = zzkiVar.a;
                zzwwVar = zzkiVar.d;
                v(zzlmVar.n(list, zzwwVar), false);
                z = true;
                break;
            case 18:
                zzki zzkiVar2 = (zzki) message.obj;
                int i30 = message.arg1;
                this.y1.a(1);
                zzlm zzlmVar2 = this.m1;
                if (i30 == -1) {
                    i30 = zzlmVar2.a();
                }
                list3 = zzkiVar2.a;
                zzwwVar3 = zzkiVar2.d;
                v(zzlmVar2.k(i30, list3, zzwwVar3), false);
                z = true;
                break;
            case 19:
                this.y1.a(1);
                zzlm zzlmVar3 = this.m1;
                int i31 = ((zzkj) message.obj).a;
                v(zzlmVar3.l(0, 0, 0, null), false);
                z = true;
                break;
            case 20:
                this.y1.a(1);
                v(this.m1.m(message.arg1, message.arg2, (zzww) message.obj), false);
                z = true;
                break;
            case 21:
                this.y1.a(1);
                v(this.m1.o((zzww) message.obj), false);
                z = true;
                break;
            case 22:
                v(this.m1.b(), true);
                z = true;
                break;
            case 23:
                this.A1 = message.arg1 != 0;
                G();
                if (this.B1) {
                    zzla zzlaVar7 = this.l1;
                    if (zzlaVar7.z() != zzlaVar7.v()) {
                        K(true);
                        t(false);
                    }
                }
                z = true;
                break;
            case 24:
            default:
                return false;
            case 25:
                E();
                z = true;
                break;
            case 26:
                E();
                z = true;
                break;
            case 27:
                this.y1.a(1);
                v(this.m1.c(message.arg1, message.arg2, (List) message.obj), false);
                z = true;
                break;
            case 28:
                zziu zziuVar = (zziu) message.obj;
                this.Q1 = zziuVar;
                this.l1.I(this.x1.a, zziuVar);
                z = true;
                break;
            case 29:
                this.y1.a(1);
                F(false, false, false, true);
                this.a1.i(this.o1);
                O(true != this.x1.a.o() ? 2 : 4);
                V();
                this.m1.g(this.b1.d());
                this.c1.j0(2);
                z = true;
                break;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdj zzdjVar3 = (zzdj) pair.second;
                zzma[] zzmaVarArr11 = this.X;
                for (int i32 = 0; i32 < 2; i32++) {
                    zzmaVarArr11[i32].T(obj);
                }
                int i33 = this.x1.e;
                if (i33 == 3 || i33 == 2) {
                    this.c1.j0(2);
                }
                if (zzdjVar3 != null) {
                    zzdjVar3.f();
                }
                z = true;
                break;
            case 31:
                zze zzeVar2 = (zze) message.obj;
                int i34 = message.arg1;
                this.Y0.d(zzeVar2);
                zzhy zzhyVar = this.s1;
                if (i34 != 0) {
                    zzeVar = zzeVar2;
                }
                zzhyVar.e(zzeVar);
                V();
                z = true;
                break;
            case 32:
                P(((Float) message.obj).floatValue());
                z = true;
                break;
            case 33:
                int i35 = message.arg1;
                zzln zzlnVar7 = this.x1;
                X(zzlnVar7.l, i35, zzlnVar7.n, zzlnVar7.m);
                z = true;
                break;
            case 34:
                P(this.T1);
                z = true;
                break;
            case 35:
                zzabi zzabiVar = (zzabi) message.obj;
                zzma[] zzmaVarArr12 = this.X;
                for (int i36 = 0; i36 < 2; i36++) {
                    zzmaVarArr12[i36].S(zzabiVar);
                }
                z = true;
                break;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                this.u1 = booleanValue;
                if (!booleanValue) {
                    this.v1 = false;
                    this.c1.A(37);
                    zzkm zzkmVar = this.w1;
                    if (zzkmVar != null) {
                        L(zzkmVar, false);
                        this.w1 = null;
                    }
                }
                z = true;
                break;
            case 37:
                this.v1 = false;
                zzkm zzkmVar2 = this.w1;
                if (zzkmVar2 != null) {
                    L(zzkmVar2, false);
                    this.w1 = null;
                }
                z = true;
                break;
        }
        A();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzuy
    public final void i(zzuz zzuzVar) {
        this.c1.f(8, zzuzVar).a();
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void j() {
        zzdq zzdqVar = this.c1;
        zzdqVar.A(2);
        zzdqVar.j0(22);
    }

    public final Looper j0() {
        return this.e1;
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void l() {
        this.c1.j0(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd A[EDGE_INSN: B:64:0x00cd->B:50:0x00cd ?: BREAK  , SYNTHETIC] */
    @OB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzln m(zzvb zzvbVar, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        zzfyc zzfycVar;
        zzyy zzyyVar;
        zzxe h;
        zzyy i2;
        zzfyc F;
        zzkx v;
        int i3 = 0;
        if (this.N1 || j != this.x1.s || !zzvbVar.equals(this.x1.b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.N1 = z2;
        G();
        zzln zzlnVar = this.x1;
        zzxe zzxeVar = zzlnVar.h;
        zzyy zzyyVar2 = zzlnVar.i;
        List list = zzlnVar.j;
        if (this.m1.j()) {
            zzla zzlaVar = this.l1;
            zzkx v2 = zzlaVar.v();
            if (v2 == null) {
                h = zzxe.d;
            } else {
                h = v2.h();
            }
            if (v2 == null) {
                i2 = this.Z0;
            } else {
                i2 = v2.i();
            }
            zzyq[] zzyqVarArr = i2.c;
            zzfxz zzfxzVar = new zzfxz();
            boolean z3 = false;
            for (zzyq zzyqVar : zzyqVarArr) {
                if (zzyqVar != null) {
                    zzav zzavVar = zzyqVar.u(0).l;
                    if (zzavVar == null) {
                        zzfxzVar.g(new zzav(C10323vs.b, new zzau[0]));
                    } else {
                        zzfxzVar.g(zzavVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                F = zzfxzVar.j();
            } else {
                F = zzfyc.F();
            }
            if (v2 != null) {
                zzky zzkyVar = v2.g;
                if (zzkyVar.c != j2) {
                    v2.g = zzkyVar.a(j2);
                    if (zzlaVar.v() == zzlaVar.z() && (v = zzlaVar.v()) != null) {
                        zzyy i4 = v.i();
                        while (true) {
                            zzma[] zzmaVarArr = this.X;
                            if (i3 >= 2) {
                                break;
                            }
                            if (i4.b(i3)) {
                                if (zzmaVarArr[i3].y() != 1) {
                                    break;
                                }
                                int i5 = i4.b[i3].a;
                            }
                            i3++;
                        }
                    }
                    zzfycVar = F;
                    zzxeVar = h;
                    zzyyVar = i2;
                }
            }
            if (zzlaVar.v() == zzlaVar.z()) {
                zzyy i42 = v.i();
                while (true) {
                    zzma[] zzmaVarArr2 = this.X;
                    if (i3 >= 2) {
                    }
                    i3++;
                }
            }
            zzfycVar = F;
            zzxeVar = h;
            zzyyVar = i2;
        } else {
            if (!zzvbVar.equals(this.x1.b)) {
                zzyyVar2 = this.Z0;
                zzxeVar = zzxe.d;
                list = zzfyc.F();
            }
            zzfycVar = list;
            zzyyVar = zzyyVar2;
        }
        if (z) {
            this.y1.c(i);
        }
        return this.x1.c(zzvbVar, j, j2, j3, y0(), zzxeVar, zzyyVar, zzfycVar);
    }

    public final void n() {
        if (this.r1 && b0()) {
            zzma[] zzmaVarArr = this.X;
            for (int i = 0; i < 2; i++) {
                zzma zzmaVar = zzmaVarArr[i];
                int x = zzmaVar.x();
                zzmaVar.C(this.i1);
                this.I1 -= x - zzmaVar.x();
            }
            this.R1 = C10323vs.b;
        }
    }

    public final void n0() {
        this.c1.z(29).a();
    }

    public final void o0(zzbl zzblVar, int i, long j) {
        this.c1.f(3, new zzkm(zzblVar, i, j)).a();
    }

    public final void p(zzkx zzkxVar, int i, boolean z, long j) throws zzik {
        boolean z2;
        boolean z3;
        boolean z4;
        zzma zzmaVar = this.X[i];
        if (!zzmaVar.j()) {
            if (zzkxVar == this.l1.v()) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzyy i2 = zzkxVar.i();
            zzlz zzlzVar = i2.b[i];
            zzyq zzyqVar = i2.c[i];
            if (e0() && this.x1.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.I1++;
            zzmaVar.D(zzlzVar, zzyqVar, zzkxVar.c[i], this.K1, z4, z2, j, zzkxVar.e(), zzkxVar.g.a, this.i1);
            zzmaVar.F(11, new zzkh(this), zzkxVar);
            if (z3 && z2) {
                zzmaVar.V();
            }
        }
    }

    public final void p0(zze zzeVar, boolean z) {
        this.c1.k(31, 0, 0, zzeVar).a();
    }

    public final void q0(boolean z, int i, int i2) {
        this.c1.j(1, z ? 1 : 0, (i2 << 4) | 1).a();
    }

    public final void r(boolean[] zArr, long j) throws zzik {
        zzma[] zzmaVarArr;
        long j2;
        zzkx z = this.l1.z();
        zzyy i = z.i();
        int i2 = 0;
        while (true) {
            zzmaVarArr = this.X;
            if (i2 >= 2) {
                break;
            }
            if (!i.b(i2)) {
                zzmaVarArr[i2].M();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < 2) {
            if (i.b(i3) && !zzmaVarArr[i3].i(z)) {
                j2 = j;
                p(z, i3, zArr[i3], j2);
            } else {
                j2 = j;
            }
            i3++;
            j = j2;
        }
    }

    public final void r0(float f) {
        this.c1.f(32, Float.valueOf(f)).a();
    }

    public final void s(IOException iOException, int i) {
        zzla zzlaVar = this.l1;
        zzik c = zzik.c(iOException, i);
        zzkx v = zzlaVar.v();
        if (v != null) {
            c = c.a(v.g.a);
        }
        zzdx.d(C6118ei0.M1, "Playback error", c);
        R(false, false);
        this.x1 = this.x1.e(c);
    }

    public final void s0() {
        this.c1.z(6).a();
    }

    public final void t(boolean z) {
        zzvb zzvbVar;
        long c;
        zzkx u = this.l1.u();
        if (u == null) {
            zzvbVar = this.x1.b;
        } else {
            zzvbVar = u.g.a;
        }
        boolean equals = this.x1.k.equals(zzvbVar);
        if (!equals) {
            this.x1 = this.x1.b(zzvbVar);
        }
        zzln zzlnVar = this.x1;
        if (u == null) {
            c = zzlnVar.s;
        } else {
            c = u.c();
        }
        zzlnVar.q = c;
        this.x1.r = y0();
        if ((!equals || z) && u != null && u.e) {
            U(u.g.a, u.h(), u.i());
        }
    }

    public final boolean t0() {
        if (this.z1 || !this.e1.getThread().isAlive()) {
            return true;
        }
        this.z1 = true;
        zzdj zzdjVar = new zzdj(this.k1);
        this.c1.f(7, zzdjVar).a();
        return zzdjVar.c(this.n1);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void u(int i) {
        this.c1.j(33, i, 0).a();
    }

    public final boolean u0(@InterfaceC11300zs1 Object obj, long j) {
        if (!this.z1 && this.e1.getThread().isAlive()) {
            zzdj zzdjVar = new zzdj(this.k1);
            this.c1.f(30, new Pair(obj, zzdjVar)).a();
            if (j != C10323vs.b) {
                return zzdjVar.c(j);
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:91|92|(1:94)(1:127)|95|(5:(3:118|119|(10:121|122|98|99|100|101|102|103|104|(2:106|107)(2:108|(1:110))))|102|103|104|(0)(0))|97|98|99|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x028a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x028b, code lost:
        r2 = r29;
        r15 = r18;
        r10 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0280 A[Catch: all -> 0x0279, TryCatch #4 {all -> 0x0279, blocks: (B:139:0x0275, B:142:0x0280, B:144:0x0283, B:151:0x0298, B:153:0x02a0, B:155:0x02a8, B:157:0x02b2, B:158:0x02bd, B:159:0x02c2), top: B:226:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03b6  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(zzbl zzblVar, boolean z) throws zzik {
        Object obj;
        long j;
        zzvb zzvbVar;
        zzbk zzbkVar;
        Object obj2;
        long j2;
        Object obj3;
        int i;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        zzbl zzblVar2;
        long j5;
        boolean z6;
        boolean z7;
        zzvb zzvbVar2;
        boolean z8;
        boolean z9;
        int i3;
        long longValue;
        Object obj4;
        int i4;
        boolean z10;
        boolean z11;
        Object obj5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        zzbl zzblVar3;
        boolean z17;
        zzkm zzkmVar;
        zzvb zzvbVar3;
        long j6;
        Object obj6;
        zzkm zzkmVar2;
        boolean z18;
        int i5;
        zzkm zzkmVar3;
        long x0;
        long x02;
        int i6;
        boolean z19;
        int n;
        boolean z20;
        long j7;
        boolean z21;
        int i7;
        zzln zzlnVar = this.x1;
        zzkm zzkmVar4 = this.J1;
        int i8 = this.F1;
        boolean z22 = this.G1;
        ?? r10 = 4;
        long j8 = 0;
        int i9 = -1;
        if (zzblVar.o()) {
            zzblVar2 = zzblVar;
            zzvbVar2 = zzln.i();
            z8 = false;
            z9 = false;
            z3 = true;
            j2 = C10323vs.b;
            j4 = C10323vs.b;
        } else {
            zzbj zzbjVar = this.g1;
            zzvb zzvbVar4 = zzlnVar.b;
            Object obj7 = zzvbVar4.a;
            boolean d0 = d0(zzlnVar, zzbjVar);
            if (zzvbVar4.b() || d0) {
                obj = obj7;
                j = zzlnVar.c;
            } else {
                obj = obj7;
                j = zzlnVar.s;
            }
            long j9 = j;
            zzbk zzbkVar2 = this.f1;
            if (zzkmVar4 != null) {
                zzvbVar = zzvbVar4;
                obj2 = obj;
                j2 = C10323vs.b;
                Pair k = k(zzblVar, zzkmVar4, true, i8, z22, zzbkVar2, zzbjVar);
                if (k == null) {
                    i4 = zzblVar.g(z22);
                    obj5 = obj2;
                    longValue = j9;
                    z13 = false;
                    z14 = true;
                    z12 = false;
                } else {
                    if (zzkmVar4.c == C10323vs.b) {
                        i4 = zzblVar.n(k.first, zzbjVar).c;
                        obj4 = obj2;
                        longValue = j9;
                        z10 = false;
                    } else {
                        Object obj8 = k.first;
                        longValue = ((Long) k.second).longValue();
                        obj4 = obj8;
                        i4 = -1;
                        z10 = true;
                    }
                    if (zzlnVar.e == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    obj5 = obj4;
                    z12 = z10;
                    z13 = z11;
                    z14 = false;
                }
                j4 = longValue;
                i = i4;
                zzbkVar = zzbkVar2;
                obj3 = obj5;
                z4 = z12;
                z3 = z14;
                z2 = z13;
            } else {
                zzvbVar = zzvbVar4;
                zzbkVar = zzbkVar2;
                obj2 = obj;
                j2 = C10323vs.b;
                zzbl zzblVar4 = zzlnVar.a;
                if (zzblVar4.o()) {
                    i2 = zzblVar.g(z22);
                } else if (zzblVar.a(obj2) == -1) {
                    int i0 = i0(zzbkVar, zzbjVar, i8, z22, obj2, zzblVar4, zzblVar);
                    zzbkVar = zzbkVar;
                    zzbjVar = zzbjVar;
                    obj2 = obj2;
                    if (i0 == -1) {
                        i0 = zzblVar.g(z22);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = i0;
                    z3 = z5;
                    obj3 = obj2;
                    j4 = j9;
                    z2 = false;
                    z4 = false;
                } else if (j9 == C10323vs.b) {
                    i2 = zzblVar.n(obj2, zzbjVar).c;
                } else if (d0) {
                    zzblVar4.n(obj2, zzbjVar);
                    if (zzblVar4.e(zzbjVar.c, zzbkVar, 0L).m == zzblVar4.a(obj2)) {
                        Pair l = zzblVar.l(zzbkVar, zzbjVar, zzblVar.n(obj2, zzbjVar).c, j9);
                        obj3 = l.first;
                        j3 = ((Long) l.second).longValue();
                    } else {
                        obj3 = obj2;
                        j3 = j9;
                    }
                    j4 = j3;
                    i = -1;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                } else {
                    obj3 = obj2;
                    i = -1;
                    j4 = j9;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                }
                i = i2;
                obj3 = obj2;
                j4 = j9;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i != -1) {
                zzblVar2 = zzblVar;
                Pair l2 = zzblVar2.l(zzbkVar, zzbjVar, i, C10323vs.b);
                obj3 = l2.first;
                j5 = ((Long) l2.second).longValue();
                j4 = j2;
            } else {
                zzblVar2 = zzblVar;
                j5 = j4;
            }
            zzvb C = this.l1.C(zzblVar2, obj3, j5);
            int i10 = C.e;
            if (i10 == -1 || ((i3 = zzvbVar.e) != -1 && i10 >= i3)) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (obj2.equals(obj3) && !zzvbVar.b() && !C.b() && z6) {
                z7 = true;
            } else {
                z7 = false;
            }
            zzbj n2 = zzblVar2.n(obj3, zzbjVar);
            if (!d0 && j9 == j4 && obj2.equals(C.a)) {
                if (zzvbVar.b()) {
                    n2.k(zzvbVar.b);
                }
                if (C.b()) {
                    n2.k(C.b);
                }
            }
            if (true == z7) {
                C = zzvbVar;
            }
            if (C.b()) {
                if (C.equals(zzvbVar)) {
                    j5 = zzlnVar.s;
                } else {
                    zzblVar2.n(C.a, zzbjVar);
                    if (C.c == zzbjVar.e(C.b)) {
                        zzbjVar.h();
                    }
                    j5 = 0;
                }
            }
            j8 = j5;
            zzvbVar2 = C;
            z8 = z2;
            z9 = z4;
        }
        if (!this.x1.b.equals(zzvbVar2) || j8 != this.x1.s) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z3) {
            try {
                z16 = true;
                if (this.x1.e != 1) {
                    try {
                        O(4);
                    } catch (Throwable th) {
                        th = th;
                        zzvb zzvbVar5 = zzvbVar2;
                        zzblVar3 = zzblVar2;
                        zzvbVar3 = zzvbVar5;
                        zzkmVar = null;
                        i9 = 2;
                        z17 = z16;
                        zzln zzlnVar2 = this.x1;
                        zzbl zzblVar5 = zzlnVar2.a;
                        zzvb zzvbVar6 = zzlnVar2.b;
                        if (z17 == z9) {
                        }
                        zzvb zzvbVar7 = zzvbVar3;
                        Z(zzblVar3, zzvbVar7, zzblVar5, zzvbVar6, j6, false);
                        if (z15) {
                        }
                        zzln zzlnVar3 = this.x1;
                        obj6 = zzlnVar3.b.a;
                        zzbl zzblVar6 = zzlnVar3.a;
                        if (!z15) {
                        }
                        zzkmVar2 = zzkmVar;
                        z18 = false;
                        long j10 = this.x1.d;
                        if (zzblVar3.a(obj6) != -1) {
                        }
                        zzkmVar3 = zzkmVar2;
                        this.x1 = m(zzvbVar7, j8, j4, j10, z18, i5);
                        G();
                        I(zzblVar3, this.x1.a);
                        this.x1 = this.x1.g(zzblVar3);
                        if (!zzblVar3.o()) {
                        }
                        t(false);
                        this.c1.j0(i9);
                        throw th;
                    }
                }
                F(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                z16 = true;
                zzvb zzvbVar52 = zzvbVar2;
                zzblVar3 = zzblVar2;
                zzvbVar3 = zzvbVar52;
                zzkmVar = null;
                i9 = 2;
                z17 = z16;
                zzln zzlnVar22 = this.x1;
                zzbl zzblVar52 = zzlnVar22.a;
                zzvb zzvbVar62 = zzlnVar22.b;
                if (z17 == z9) {
                    j6 = j2;
                } else {
                    j6 = j8;
                }
                zzvb zzvbVar72 = zzvbVar3;
                Z(zzblVar3, zzvbVar72, zzblVar52, zzvbVar62, j6, false);
                if (z15 && j4 == this.x1.c) {
                    zzkmVar3 = zzkmVar;
                } else {
                    zzln zzlnVar32 = this.x1;
                    obj6 = zzlnVar32.b.a;
                    zzbl zzblVar62 = zzlnVar32.a;
                    if (!z15 && z && !zzblVar62.o() && !zzblVar62.n(obj6, this.g1).f) {
                        zzkmVar2 = zzkmVar;
                        z18 = z17;
                    } else {
                        zzkmVar2 = zzkmVar;
                        z18 = false;
                    }
                    long j102 = this.x1.d;
                    if (zzblVar3.a(obj6) != -1) {
                        i5 = 4;
                    } else {
                        i5 = 3;
                    }
                    zzkmVar3 = zzkmVar2;
                    this.x1 = m(zzvbVar72, j8, j4, j102, z18, i5);
                }
                G();
                I(zzblVar3, this.x1.a);
                this.x1 = this.x1.g(zzblVar3);
                if (!zzblVar3.o()) {
                    this.J1 = zzkmVar3;
                }
                t(false);
                this.c1.j0(i9);
                throw th;
            }
        } else {
            z16 = true;
        }
        zzma[] zzmaVarArr = this.X;
        for (int i11 = 0; i11 < 2; i11++) {
            zzmaVarArr[i11].R(zzblVar2);
        }
        try {
            if (!z15) {
                try {
                    zzla zzlaVar = this.l1;
                    if (zzlaVar.z() == null) {
                        x0 = 0;
                    } else {
                        x0 = x0(zzlaVar.z());
                    }
                    try {
                        if (b0()) {
                            try {
                                if (zzlaVar.y() != null) {
                                    x02 = x0(zzlaVar.y());
                                    i6 = 2;
                                    z19 = z16;
                                    i9 = i6;
                                    r10 = z19;
                                    n = zzlaVar.n(zzblVar, this.K1, x0, x02);
                                    zzblVar2 = zzblVar;
                                    if ((n & 1) == 0) {
                                        K(false);
                                        z20 = r10;
                                    } else {
                                        z20 = r10;
                                        if ((n & i9) != 0) {
                                            n();
                                            z20 = r10;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzkmVar = null;
                                i9 = 2;
                                z17 = z16;
                                zzvbVar3 = zzvbVar2;
                                zzblVar3 = zzblVar;
                                zzln zzlnVar222 = this.x1;
                                zzbl zzblVar522 = zzlnVar222.a;
                                zzvb zzvbVar622 = zzlnVar222.b;
                                if (z17 == z9) {
                                }
                                zzvb zzvbVar722 = zzvbVar3;
                                Z(zzblVar3, zzvbVar722, zzblVar522, zzvbVar622, j6, false);
                                if (z15) {
                                }
                                zzln zzlnVar322 = this.x1;
                                obj6 = zzlnVar322.b.a;
                                zzbl zzblVar622 = zzlnVar322.a;
                                if (!z15) {
                                }
                                zzkmVar2 = zzkmVar;
                                z18 = false;
                                long j1022 = this.x1.d;
                                if (zzblVar3.a(obj6) != -1) {
                                }
                                zzkmVar3 = zzkmVar2;
                                this.x1 = m(zzvbVar722, j8, j4, j1022, z18, i5);
                                G();
                                I(zzblVar3, this.x1.a);
                                this.x1 = this.x1.g(zzblVar3);
                                if (!zzblVar3.o()) {
                                }
                                t(false);
                                this.c1.j0(i9);
                                throw th;
                            }
                        }
                        n = zzlaVar.n(zzblVar, this.K1, x0, x02);
                        zzblVar2 = zzblVar;
                        if ((n & 1) == 0) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        zzblVar2 = zzblVar;
                        zzvb zzvbVar8 = zzvbVar2;
                        zzblVar3 = zzblVar2;
                        zzvbVar3 = zzvbVar8;
                        zzkmVar = null;
                        z17 = r10;
                        zzln zzlnVar2222 = this.x1;
                        zzbl zzblVar5222 = zzlnVar2222.a;
                        zzvb zzvbVar6222 = zzlnVar2222.b;
                        if (z17 == z9) {
                        }
                        zzvb zzvbVar7222 = zzvbVar3;
                        Z(zzblVar3, zzvbVar7222, zzblVar5222, zzvbVar6222, j6, false);
                        if (z15) {
                        }
                        zzln zzlnVar3222 = this.x1;
                        obj6 = zzlnVar3222.b.a;
                        zzbl zzblVar6222 = zzlnVar3222.a;
                        if (!z15) {
                        }
                        zzkmVar2 = zzkmVar;
                        z18 = false;
                        long j10222 = this.x1.d;
                        if (zzblVar3.a(obj6) != -1) {
                        }
                        zzkmVar3 = zzkmVar2;
                        this.x1 = m(zzvbVar7222, j8, j4, j10222, z18, i5);
                        G();
                        I(zzblVar3, this.x1.a);
                        this.x1 = this.x1.g(zzblVar3);
                        if (!zzblVar3.o()) {
                        }
                        t(false);
                        this.c1.j0(i9);
                        throw th;
                    }
                    i6 = 2;
                    z19 = z16;
                    x02 = 0;
                    i9 = i6;
                    r10 = z19;
                } catch (Throwable th5) {
                    th = th5;
                    zzblVar2 = zzblVar;
                    i9 = 2;
                    r10 = z16;
                }
            } else {
                i9 = 2;
                boolean z23 = z16;
                z20 = z23;
                if (!zzblVar2.o()) {
                    zzla zzlaVar2 = this.l1;
                    for (zzkx v = zzlaVar2.v(); v != null; v = v.g()) {
                        if (v.g.a.equals(zzvbVar2)) {
                            v.g = zzlaVar2.B(zzblVar2, v.g);
                            v.r();
                        }
                    }
                    j8 = e(zzvbVar2, j8, z8);
                    z20 = z23;
                }
            }
            zzln zzlnVar4 = this.x1;
            zzbl zzblVar7 = zzlnVar4.a;
            zzvb zzvbVar9 = zzlnVar4.b;
            if (z20 != z9) {
                j7 = j2;
            } else {
                j7 = j8;
            }
            zzvb zzvbVar10 = zzvbVar2;
            Z(zzblVar2, zzvbVar10, zzblVar7, zzvbVar9, j7, false);
            zzbl zzblVar8 = zzblVar2;
            if (z15 || j4 != this.x1.c) {
                zzln zzlnVar5 = this.x1;
                Object obj9 = zzlnVar5.b.a;
                zzbl zzblVar9 = zzlnVar5.a;
                if (z15 && z && !zzblVar9.o() && !zzblVar9.n(obj9, this.g1).f) {
                    z21 = z20;
                } else {
                    z21 = false;
                }
                long j11 = this.x1.d;
                if (zzblVar8.a(obj9) == -1) {
                    i7 = 4;
                } else {
                    i7 = 3;
                }
                this.x1 = m(zzvbVar10, j8, j4, j11, z21, i7);
            }
            G();
            I(zzblVar8, this.x1.a);
            this.x1 = this.x1.g(zzblVar8);
            if (!zzblVar8.o()) {
                this.J1 = null;
            }
            t(false);
            this.c1.j0(i9);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void v0(List list, int i, long j, zzww zzwwVar) {
        this.c1.f(17, new zzki(list, zzwwVar, i, j, null)).a();
    }

    public final void w(zzbb zzbbVar, boolean z) throws zzik {
        x(zzbbVar, zzbbVar.a, true, z);
    }

    public final long w0(zzbl zzblVar, Object obj, long j) {
        long elapsedRealtime;
        int i = zzblVar.n(obj, this.g1).c;
        zzbk zzbkVar = this.f1;
        zzblVar.e(i, zzbkVar, 0L);
        if (zzbkVar.e == C10323vs.b || !zzbkVar.b() || !zzbkVar.h) {
            return C10323vs.b;
        }
        long j2 = zzbkVar.f;
        String str = zzeu.a;
        if (j2 == C10323vs.b) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return zzeu.N(elapsedRealtime - zzbkVar.e) - j;
    }

    public final void x(zzbb zzbbVar, float f, boolean z, boolean z2) throws zzik {
        int i;
        if (z) {
            if (z2) {
                this.y1.a(1);
            }
            zzln zzlnVar = this.x1;
            this.x1 = new zzln(zzlnVar.a, zzlnVar.b, zzlnVar.c, zzlnVar.d, zzlnVar.e, zzlnVar.f, zzlnVar.g, zzlnVar.h, zzlnVar.i, zzlnVar.j, zzlnVar.k, zzlnVar.l, zzlnVar.m, zzlnVar.n, zzbbVar, zzlnVar.q, zzlnVar.r, zzlnVar.s, zzlnVar.t, false);
        }
        float f2 = zzbbVar.a;
        zzkx v = this.l1.v();
        while (true) {
            i = 0;
            if (v == null) {
                break;
            }
            zzyq[] zzyqVarArr = v.i().c;
            int length = zzyqVarArr.length;
            while (i < length) {
                zzyq zzyqVar = zzyqVarArr[i];
                i++;
            }
            v = v.g();
        }
        zzma[] zzmaVarArr = this.X;
        while (i < 2) {
            zzmaVarArr[i].Q(f, f2);
            i++;
        }
    }

    public final long x0(zzkx zzkxVar) {
        if (zzkxVar == null) {
            return 0L;
        }
        long e = zzkxVar.e();
        if (zzkxVar.e) {
            int i = 0;
            while (true) {
                zzma[] zzmaVarArr = this.X;
                if (i >= 2) {
                    break;
                }
                if (zzmaVarArr[i].i(zzkxVar)) {
                    long A = zzmaVarArr[i].A(zzkxVar);
                    if (A == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    e = Math.max(A, e);
                }
                i++;
            }
        }
        return e;
    }

    public final long y0() {
        return z0(this.x1.q);
    }

    public final void z() {
        long j;
        zzla zzlaVar = this.l1;
        zzlaVar.F();
        zzkx x = zzlaVar.x();
        if (x != null) {
            if (!x.d || x.e) {
                zzuz zzuzVar = x.a;
                if (!zzuzVar.o()) {
                    zzks zzksVar = this.a1;
                    zzbl zzblVar = this.x1.a;
                    zzvb zzvbVar = x.g.a;
                    if (x.e) {
                        j = zzuzVar.b();
                    } else {
                        j = 0;
                    }
                    if (zzksVar.a(zzblVar, zzvbVar, j)) {
                        if (!x.d) {
                            x.m(this, x.g.b);
                            return;
                        }
                        zzkt zzktVar = new zzkt();
                        zzktVar.e(this.K1 - x.e());
                        zzktVar.f(this.i1.c().a);
                        zzktVar.d(this.D1);
                        x.k(new zzkv(zzktVar, null));
                    }
                }
            }
        }
    }

    public final long z0(long j) {
        zzkx u = this.l1.u();
        if (u == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.K1 - u.e()));
    }
}
