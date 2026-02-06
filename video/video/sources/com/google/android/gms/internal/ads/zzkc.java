package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import o.C10323vs;
import o.C4022Qh0;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzkc extends zzg implements zziv {
    public static final /* synthetic */ int X = 0;
    public int A;
    public int B;
    public boolean C;
    public zzmd D;
    public zziu E;
    public zzbd F;
    public zzat G;
    @InterfaceC11300zs1
    public Object H;
    @InterfaceC11300zs1
    public Surface I;
    public int J;
    public zzel K;
    public zze L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public zzat R;
    public zzln S;
    public int T;
    public long U;
    public final zzjg V;
    public zzww W;
    public final zzyy b;
    public final zzbd c;
    public final zzdj d = new zzdj(zzdg.a);
    public final Context e;
    public final zzbh f;
    public final zzlv[] g;
    public final zzlv[] h;
    public final zzyx i;
    public final zzdq j;
    public final zzko k;
    public final zzdw l;
    public final CopyOnWriteArraySet m;
    public final zzbj n;

    /* renamed from: o */
    public final List f287o;
    public final boolean p;
    public final zzmj q;
    public final Looper r;
    public final zzzf s;
    public final zzdg t;
    public final zzjy u;
    public final zzjz v;
    public final zzmh w;
    public final zzmi x;
    public final long y;
    public final zzdf z;

    static {
        zzaq.b("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzkc(zzit zzitVar, @InterfaceC11300zs1 zzbh zzbhVar) {
        try {
            zzdx.e(C4022Qh0.x2, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + zzeu.a + C6566gU0.g);
            this.e = zzitVar.a.getApplicationContext();
            this.q = (zzmj) zzitVar.h.apply(zzitVar.b);
            this.Q = zzitVar.j;
            this.L = zzitVar.k;
            this.J = zzitVar.l;
            this.N = false;
            this.y = zzitVar.p;
            zzjy zzjyVar = new zzjy(this, null);
            this.u = zzjyVar;
            this.v = new zzjz(null);
            zzlv[] c0 = zzcej.c0(((zzim) zzitVar.c).X.a, new Handler(zzitVar.i), zzjyVar, zzjyVar, zzjyVar, zzjyVar);
            this.g = c0;
            int length = c0.length;
            this.h = new zzlv[2];
            int i = 0;
            while (true) {
                zzlv[] zzlvVarArr = this.h;
                int length2 = zzlvVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzlv zzlvVar = this.g[i];
                zzlvVarArr[i] = null;
                i++;
            }
            zzyx zzyxVar = (zzyx) zzitVar.e.a();
            this.i = zzyxVar;
            zzit.a(((zzin) zzitVar.d).X);
            zzzj c = zzzj.c(((zziq) zzitVar.g).X);
            this.s = c;
            this.p = zzitVar.m;
            this.D = zzitVar.n;
            Looper looper = zzitVar.i;
            this.r = looper;
            zzdg zzdgVar = zzitVar.b;
            this.t = zzdgVar;
            this.f = zzbhVar;
            zzdw zzdwVar = new zzdw(looper, zzdgVar, new zzdu(this) { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdu
                public final void a(Object obj, zzv zzvVar) {
                    zzbe zzbeVar = (zzbe) obj;
                }
            });
            this.l = zzdwVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.m = copyOnWriteArraySet;
            this.f287o = new ArrayList();
            this.W = new zzww(0);
            this.E = zziu.b;
            int length3 = this.g.length;
            zzyy zzyyVar = new zzyy(new zzlz[2], new zzyq[2], zzbt.b, null);
            this.b = zzyyVar;
            this.n = new zzbj();
            zzbc zzbcVar = new zzbc();
            zzbcVar.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyxVar.e();
            zzbcVar.d(29, true);
            zzbcVar.d(23, false);
            zzbcVar.d(25, false);
            zzbcVar.d(33, false);
            zzbcVar.d(26, false);
            zzbcVar.d(34, false);
            zzbd e = zzbcVar.e();
            this.c = e;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.b(e);
            zzbcVar2.a(4);
            zzbcVar2.a(10);
            this.F = zzbcVar2.e();
            this.j = zzdgVar.d(looper, null);
            zzjg zzjgVar = new zzjg(this);
            this.V = zzjgVar;
            this.S = zzln.h(zzyyVar);
            this.q.k(zzbhVar, looper);
            final zzpc zzpcVar = new zzpc(zzitVar.s);
            zzko zzkoVar = new zzko(this.e, this.g, this.h, zzyxVar, zzyyVar, (zzks) zzitVar.f.a(), c, 0, false, this.q, this.D, zzitVar.t, zzitVar.f286o, false, false, looper, zzdgVar, zzjgVar, zzpcVar, null, this.E, this.v);
            this.k = zzkoVar;
            Looper j0 = zzkoVar.j0();
            this.M = 1.0f;
            zzat zzatVar = zzat.B;
            this.G = zzatVar;
            this.R = zzatVar;
            this.T = -1;
            int i2 = zzcv.a;
            this.O = true;
            zzmj zzmjVar = this.q;
            if (zzmjVar != null) {
                zzdwVar.b(zzmjVar);
                c.a(new Handler(looper), this.q);
                copyOnWriteArraySet.add(this.u);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context = this.e;
                    final boolean z = zzitVar.q;
                    zzdgVar.d(zzkoVar.j0(), null).h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzoy u = zzoy.u(context);
                            if (u == null) {
                                zzdx.f(C4022Qh0.x2, "MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                this.b(u);
                            }
                            zzpcVar.b(u.t());
                        }
                    });
                }
                zzdf zzdfVar = new zzdf(0, j0, looper, zzdgVar, new zzjh(this));
                this.z = zzdfVar;
                zzdfVar.b(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzkc.G(zzkc.this);
                    }
                });
                new zzhu(zzitVar.a, j0, zzitVar.i, this.u, zzdgVar);
                this.w = new zzmh(zzitVar.a, j0, zzdgVar);
                this.x = new zzmi(zzitVar.a, j0, zzdgVar);
                int i3 = zzo.a;
                zzcd zzcdVar = zzcd.d;
                this.K = zzel.c;
                zzkoVar.p0(this.L, false);
                c0(1, 3, this.L);
                c0(2, 4, Integer.valueOf(this.J));
                c0(2, 5, 0);
                c0(1, 9, Boolean.valueOf(this.N));
                c0(6, 8, this.v);
                c0(-1, 16, Integer.valueOf(this.Q));
                this.d.f();
                return;
            }
            throw null;
        } catch (Throwable th) {
            this.d.f();
            throw th;
        }
    }

    public static /* synthetic */ void G(zzkc zzkcVar) {
        String str = zzeu.a;
        zzkcVar.z.c(Integer.valueOf(zzcj.c(zzkcVar.e).generateAudioSessionId()));
    }

    public static /* synthetic */ void H(zzkc zzkcVar, zzkl zzklVar) {
        boolean z;
        boolean z2;
        int i = zzkcVar.A - zzklVar.c;
        zzkcVar.A = i;
        boolean z3 = true;
        if (zzklVar.d) {
            zzkcVar.B = zzklVar.e;
            zzkcVar.C = true;
        }
        if (i == 0) {
            zzbl zzblVar = zzklVar.b.a;
            if (!zzkcVar.S.a.o() && zzblVar.o()) {
                zzkcVar.T = -1;
                zzkcVar.U = 0L;
            }
            if (!zzblVar.o()) {
                List y = ((zzlt) zzblVar).y();
                int size = y.size();
                List list = zzkcVar.f287o;
                if (size == list.size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdc.f(z2);
                for (int i2 = 0; i2 < y.size(); i2++) {
                    ((zzka) list.get(i2)).c((zzbl) y.get(i2));
                }
            }
            boolean z4 = zzkcVar.C;
            long j = C10323vs.b;
            if (z4) {
                if (zzklVar.b.b.equals(zzkcVar.S.b) && zzklVar.b.d == zzkcVar.S.s) {
                    z3 = false;
                }
                if (z3) {
                    if (!zzblVar.o() && !zzklVar.b.b.b()) {
                        zzln zzlnVar = zzklVar.b;
                        zzvb zzvbVar = zzlnVar.b;
                        long j2 = zzlnVar.d;
                        zzkcVar.V(zzblVar, zzvbVar, j2);
                        j = j2;
                    } else {
                        j = zzklVar.b.d;
                    }
                }
                z = z3;
            } else {
                z = false;
            }
            zzkcVar.C = false;
            zzkcVar.f0(zzklVar.b, 1, z, zzkcVar.B, j, -1, false);
        }
    }

    public static /* synthetic */ void I(zzkc zzkcVar, int i, final int i2) {
        zzkcVar.h0();
        Integer valueOf = Integer.valueOf(i2);
        zzkcVar.c0(1, 10, valueOf);
        zzkcVar.c0(2, 10, valueOf);
        zzdt zzdtVar = new zzdt() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj) {
                int i3 = zzkc.X;
                ((zzbe) obj).u(i2);
            }
        };
        zzdw zzdwVar = zzkcVar.l;
        zzdwVar.d(21, zzdtVar);
        zzdwVar.c();
    }

    public static /* bridge */ /* synthetic */ void N(zzkc zzkcVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkcVar.d0(surface);
        zzkcVar.I = surface;
    }

    public static long U(zzln zzlnVar) {
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        zzbl zzblVar = zzlnVar.a;
        zzblVar.n(zzlnVar.b.a, zzbjVar);
        long j = zzlnVar.c;
        if (j == C10323vs.b) {
            long j2 = zzblVar.e(zzbjVar.c, zzbkVar, 0L).k;
            return 0L;
        }
        return j;
    }

    public static zzln X(zzln zzlnVar, int i) {
        zzln f = zzlnVar.f(i);
        if (i != 1 && i != 4) {
            return f;
        }
        return f.a(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean B() {
        h0();
        return false;
    }

    @InterfaceC11300zs1
    public final zzik C() {
        h0();
        return this.S.f;
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final void L() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeu.a;
        String a = zzaq.a();
        zzdx.e(C4022Qh0.x2, "Release " + hexString + " [AndroidXMedia3/1.6.1] [" + str + "] [" + a + C6566gU0.g);
        h0();
        this.w.a(false);
        this.x.a(false);
        if (!this.k.t0()) {
            zzdw zzdwVar = this.l;
            zzdwVar.d(10, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzdt
                public final void b(Object obj) {
                    int i = zzkc.X;
                    ((zzbe) obj).s0(zzik.d(new zzkp(1), 1003));
                }
            });
            zzdwVar.c();
        }
        this.l.e();
        this.j.e(null);
        zzzf zzzfVar = this.s;
        zzmj zzmjVar = this.q;
        zzzfVar.b(zzmjVar);
        zzln zzlnVar = this.S;
        boolean z = zzlnVar.p;
        zzln X2 = X(zzlnVar, 1);
        this.S = X2;
        zzln b = X2.b(X2.b);
        this.S = b;
        b.q = b.s;
        this.S.r = 0L;
        zzmjVar.I();
        Surface surface = this.I;
        if (surface != null) {
            surface.release();
            this.I = null;
        }
        int i = zzcv.a;
    }

    public final int Q(zzln zzlnVar) {
        zzbl zzblVar = zzlnVar.a;
        if (zzblVar.o()) {
            return this.T;
        }
        return zzblVar.n(zzlnVar.b.a, this.n).c;
    }

    public final long R(zzln zzlnVar) {
        zzvb zzvbVar = zzlnVar.b;
        if (zzvbVar.b()) {
            zzbl zzblVar = zzlnVar.a;
            zzblVar.n(zzvbVar.a, this.n);
            long j = zzlnVar.c;
            if (j == C10323vs.b) {
                long j2 = zzblVar.e(Q(zzlnVar), this.a, 0L).k;
                return zzeu.Q(0L);
            }
            return zzeu.Q(0L) + zzeu.Q(j);
        }
        return zzeu.Q(T(zzlnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void S(float f) {
        h0();
        String str = zzeu.a;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.M == max) {
            return;
        }
        this.M = max;
        this.k.r0(max);
        zzdw zzdwVar = this.l;
        zzdwVar.d(22, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj) {
                int i = zzkc.X;
                ((zzbe) obj).S(max);
            }
        });
        zzdwVar.c();
    }

    public final long T(zzln zzlnVar) {
        zzbl zzblVar = zzlnVar.a;
        if (zzblVar.o()) {
            return zzeu.N(this.U);
        }
        long j = zzlnVar.s;
        zzvb zzvbVar = zzlnVar.b;
        if (zzvbVar.b()) {
            return j;
        }
        V(zzblVar, zzvbVar, j);
        return j;
    }

    public final long V(zzbl zzblVar, zzvb zzvbVar, long j) {
        zzblVar.n(zzvbVar.a, this.n);
        return j;
    }

    @InterfaceC11300zs1
    public final Pair W(zzbl zzblVar, int i, long j) {
        if (zzblVar.o()) {
            this.T = i;
            if (j == C10323vs.b) {
                j = 0;
            }
            this.U = j;
            return null;
        }
        if (i == -1 || i >= zzblVar.c()) {
            i = zzblVar.g(false);
            long j2 = zzblVar.e(i, this.a, 0L).k;
            j = zzeu.Q(0L);
        }
        return zzblVar.l(this.a, this.n, i, zzeu.N(j));
    }

    public final zzln Y(zzln zzlnVar, zzbl zzblVar, @InterfaceC11300zs1 Pair pair) {
        boolean z;
        zzvb zzvbVar;
        zzxe zzxeVar;
        zzyy zzyyVar;
        List list;
        int i;
        long j;
        if (zzblVar.o() || pair != null) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        zzbl zzblVar2 = zzlnVar.a;
        long R = R(zzlnVar);
        zzln g = zzlnVar.g(zzblVar);
        if (zzblVar.o()) {
            zzvb i2 = zzln.i();
            long N = zzeu.N(this.U);
            zzln b = g.c(i2, N, N, N, 0L, zzxe.d, this.b, zzfyc.F()).b(i2);
            b.q = b.s;
            return b;
        }
        zzvb zzvbVar2 = g.b;
        Object obj = zzvbVar2.a;
        String str = zzeu.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            zzvbVar = new zzvb(pair.first, -1L);
        } else {
            zzvbVar = zzvbVar2;
        }
        long longValue = ((Long) pair.second).longValue();
        long N2 = zzeu.N(R);
        if (!zzblVar2.o()) {
            zzblVar2.n(obj, this.n);
        }
        if (!equals || longValue < N2) {
            zzvb zzvbVar3 = zzvbVar;
            zzdc.f(!zzvbVar3.b());
            if (!equals) {
                zzxeVar = zzxe.d;
            } else {
                zzxeVar = g.h;
            }
            zzxe zzxeVar2 = zzxeVar;
            if (!equals) {
                zzyyVar = this.b;
            } else {
                zzyyVar = g.i;
            }
            zzyy zzyyVar2 = zzyyVar;
            if (!equals) {
                list = zzfyc.F();
            } else {
                list = g.j;
            }
            zzln b2 = g.c(zzvbVar3, longValue, longValue, longValue, 0L, zzxeVar2, zzyyVar2, list).b(zzvbVar3);
            b2.q = longValue;
            return b2;
        } else if (i == 0) {
            int a = zzblVar.a(g.k.a);
            if (a != -1) {
                zzbj zzbjVar = this.n;
                if (zzblVar.d(a, zzbjVar, false).c == zzblVar.n(zzvbVar.a, zzbjVar).c) {
                    return g;
                }
            }
            Object obj2 = zzvbVar.a;
            zzbj zzbjVar2 = this.n;
            zzblVar.n(obj2, zzbjVar2);
            if (zzvbVar.b()) {
                j = zzbjVar2.f(zzvbVar.b, zzvbVar.c);
            } else {
                j = zzbjVar2.d;
            }
            zzvb zzvbVar4 = zzvbVar;
            zzln b3 = g.c(zzvbVar4, g.s, g.s, g.d, j - g.s, g.h, g.i, g.j).b(zzvbVar4);
            b3.q = j;
            return b3;
        } else {
            zzvb zzvbVar5 = zzvbVar;
            zzdc.f(!zzvbVar5.b());
            long max = Math.max(0L, g.r - (longValue - N2));
            long j2 = g.q;
            if (g.k.equals(zzvbVar2)) {
                j2 = longValue + max;
            }
            zzln c = g.c(zzvbVar5, longValue, longValue, longValue, max, g.h, g.i, g.j);
            c.q = j2;
            return c;
        }
    }

    public final zzlr Z(zzlq zzlqVar) {
        int Q = Q(this.S);
        zzbl zzblVar = this.S.a;
        if (Q == -1) {
            Q = 0;
        }
        zzdg zzdgVar = this.t;
        zzko zzkoVar = this.k;
        return new zzlr(zzkoVar, zzlqVar, zzblVar, Q, zzdgVar, zzkoVar.j0());
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void a(@InterfaceC11300zs1 Surface surface) {
        int i;
        h0();
        d0(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        b0(i, i);
    }

    public final /* synthetic */ void a0(final zzkl zzklVar) {
        this.j.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // java.lang.Runnable
            public final void run() {
                zzkc.H(zzkc.this, zzklVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final void b(zzmm zzmmVar) {
        this.q.t(zzmmVar);
    }

    public final void b0(final int i, final int i2) {
        if (i == this.K.b() && i2 == this.K.a()) {
            return;
        }
        this.K = new zzel(i, i2);
        zzdw zzdwVar = this.l;
        zzdwVar.d(24, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjc
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj) {
                int i3 = zzkc.X;
                ((zzbe) obj).u0(i, i2);
            }
        });
        zzdwVar.c();
        c0(2, 14, new zzel(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int c() {
        h0();
        if (y()) {
            return this.S.b.b;
        }
        return -1;
    }

    public final void c0(int i, int i2, @InterfaceC11300zs1 Object obj) {
        zzlv[] zzlvVarArr = this.g;
        int length = zzlvVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzlv zzlvVar = zzlvVarArr[i3];
            if (i == -1 || zzlvVar.b() == i) {
                zzlr Z = Z(zzlvVar);
                Z.f(i2);
                Z.e(obj);
                Z.d();
            }
        }
        zzlv[] zzlvVarArr2 = this.h;
        int length2 = zzlvVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzlv zzlvVar2 = zzlvVarArr2[i4];
            if (zzlvVar2 != null && (i == -1 || zzlvVar2.b() == i)) {
                zzlr Z2 = Z(zzlvVar2);
                Z2.f(i2);
                Z2.e(obj);
                Z2.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int d() {
        h0();
        int Q = Q(this.S);
        if (Q == -1) {
            return 0;
        }
        return Q;
    }

    public final void d0(@InterfaceC11300zs1 Object obj) {
        long j;
        Object obj2 = this.H;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        if (z) {
            j = this.y;
        } else {
            j = C10323vs.b;
        }
        boolean u0 = this.k.u0(obj, j);
        if (z) {
            Object obj3 = this.H;
            Surface surface = this.I;
            if (obj3 == surface) {
                surface.release();
                this.I = null;
            }
        }
        this.H = obj;
        if (!u0) {
            e0(zzik.d(new zzkp(3), 1003));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int e() {
        h0();
        if (this.S.a.o()) {
            return 0;
        }
        zzln zzlnVar = this.S;
        return zzlnVar.a.a(zzlnVar.b.a);
    }

    public final void e0(@InterfaceC11300zs1 zzik zzikVar) {
        zzln zzlnVar = this.S;
        zzln b = zzlnVar.b(zzlnVar.b);
        b.q = b.s;
        b.r = 0L;
        zzln X2 = X(b, 1);
        if (zzikVar != null) {
            X2 = X2.e(zzikVar);
        }
        this.A++;
        this.k.s0();
        f0(X2, 0, false, 5, C10323vs.b, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int f() {
        h0();
        if (y()) {
            return this.S.b.c;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x04dd  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0(final zzln zzlnVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        int i5;
        final int i6;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i7;
        boolean booleanValue;
        final zzap zzapVar;
        List list;
        int i8;
        zzbl p;
        zzat T;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        int i13;
        int i14;
        boolean z7;
        zzik zzikVar;
        zzik zzikVar2;
        zzyy zzyyVar;
        zzyy zzyyVar2;
        zzbd zzbdVar;
        zzbl p2;
        zzbh zzbhVar;
        boolean z8;
        zzbl p3;
        ?? r15;
        int i15;
        boolean z9;
        zzbl p4;
        boolean z10;
        zzbl p5;
        boolean z11;
        long j2;
        boolean z12;
        zzbl p6;
        boolean z13;
        boolean o2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i16;
        boolean z20;
        zzbd e;
        int i17;
        Object obj;
        zzap zzapVar2;
        Object obj2;
        int i18;
        long j3;
        long U;
        Object obj3;
        zzap zzapVar3;
        Object obj4;
        int i19;
        long j4;
        int i20 = i2;
        zzln zzlnVar2 = this.S;
        this.S = zzlnVar;
        zzbl zzblVar = zzlnVar2.a;
        zzbl zzblVar2 = zzlnVar.a;
        boolean equals = zzblVar.equals(zzblVar2);
        if (zzblVar2.o() && zzblVar.o()) {
            i4 = 3;
            pair = new Pair(Boolean.FALSE, -1);
        } else {
            i4 = 3;
            if (zzblVar2.o() != zzblVar.o()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                zzvb zzvbVar = zzlnVar2.b;
                Object obj5 = zzvbVar.a;
                zzbj zzbjVar = this.n;
                int i21 = zzblVar.n(obj5, zzbjVar).c;
                zzbk zzbkVar = this.a;
                Object obj6 = zzblVar.e(i21, zzbkVar, 0L).a;
                i5 = 0;
                zzvb zzvbVar2 = zzlnVar.b;
                if (!obj6.equals(zzblVar2.e(zzblVar2.n(zzvbVar2.a, zzbjVar).c, zzbkVar, 0L).a)) {
                    if (z) {
                        if (i20 == 0) {
                            i20 = 0;
                            z4 = true;
                            i7 = 1;
                            Pair pair2 = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                            boolean z21 = z4;
                            i6 = i20;
                            z3 = z21;
                            pair = pair2;
                        } else {
                            z4 = true;
                            z5 = true;
                        }
                    } else {
                        z4 = false;
                        z5 = false;
                    }
                    if (z4 && i20 == 1) {
                        z4 = z5;
                        i7 = 2;
                    } else if (!equals) {
                        i7 = 3;
                    } else {
                        throw new IllegalStateException();
                    }
                    Pair pair22 = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                    boolean z212 = z4;
                    i6 = i20;
                    z3 = z212;
                    pair = pair22;
                } else {
                    if (z) {
                        if (i20 == 0) {
                            if (zzvbVar.d < zzvbVar2.d) {
                                pair = new Pair(Boolean.TRUE, 0);
                                i6 = 0;
                                z3 = true;
                            } else {
                                i6 = 0;
                            }
                        } else {
                            i6 = i20;
                        }
                        z3 = true;
                    } else {
                        i6 = i20;
                        z3 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (!booleanValue) {
                    if (!zzblVar2.o()) {
                        zzapVar = zzblVar2.e(zzblVar2.n(zzlnVar.b.a, this.n).c, this.a, 0L).c;
                    } else {
                        zzapVar = null;
                    }
                    this.R = zzat.B;
                } else {
                    zzapVar = null;
                }
                if (!booleanValue || !zzlnVar2.j.equals(zzlnVar.j)) {
                    zzar a = this.R.a();
                    list = zzlnVar.j;
                    for (i8 = i5; i8 < list.size(); i8++) {
                        zzav zzavVar = (zzav) list.get(i8);
                        for (int i22 = i5; i22 < zzavVar.a(); i22++) {
                            zzavVar.b(i22).a(a);
                        }
                    }
                    this.R = a.T();
                }
                p = p();
                if (!p.o()) {
                    T = this.R;
                } else {
                    zzap zzapVar4 = p.e(d(), this.a, 0L).c;
                    zzar a2 = this.R.a();
                    a2.y(zzapVar4.d);
                    T = a2.T();
                }
                boolean equals2 = T.equals(this.G);
                this.G = T;
                if (zzlnVar2.l == zzlnVar.l) {
                    i9 = 1;
                } else {
                    i9 = i5;
                }
                if (zzlnVar2.e == zzlnVar.e) {
                    i10 = 1;
                } else {
                    i10 = i5;
                }
                if (i10 == 0 || i9 != 0) {
                    g0();
                }
                if (zzlnVar2.g == zzlnVar.g) {
                    i11 = 1;
                } else {
                    i11 = i5;
                }
                if (!equals) {
                    this.l.d(i5, new zzdt() { // from class: com.google.android.gms.internal.ads.zziw
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj7) {
                            int i23 = zzkc.X;
                            ((zzbe) obj7).x0(zzln.this.a, i);
                        }
                    });
                }
                if (!z3) {
                    zzbj zzbjVar2 = new zzbj();
                    if (!zzblVar.o()) {
                        Object obj7 = zzlnVar2.b.a;
                        zzblVar.n(obj7, zzbjVar2);
                        int i23 = zzbjVar2.c;
                        int a3 = zzblVar.a(obj7);
                        zzbk zzbkVar2 = this.a;
                        i12 = i9;
                        z6 = equals2;
                        obj = zzblVar.e(i23, zzbkVar2, 0L).a;
                        zzapVar2 = zzbkVar2.c;
                        obj2 = obj7;
                        i17 = i23;
                        i18 = a3;
                    } else {
                        i12 = i9;
                        z6 = equals2;
                        i17 = i3;
                        obj = null;
                        zzapVar2 = null;
                        obj2 = null;
                        i18 = -1;
                    }
                    if (i6 == 0) {
                        zzvb zzvbVar3 = zzlnVar2.b;
                        if (zzvbVar3.b()) {
                            j3 = zzbjVar2.f(zzvbVar3.b, zzvbVar3.c);
                            U = U(zzlnVar2);
                            String str = zzeu.a;
                            zzvb zzvbVar4 = zzlnVar2.b;
                            final zzbf zzbfVar = new zzbf(obj, i17, zzapVar2, obj2, i18, zzeu.Q(j3), zzeu.Q(U), zzvbVar4.b, zzvbVar4.c);
                            int d = d();
                            if (this.S.a.o()) {
                                zzln zzlnVar3 = this.S;
                                Object obj8 = zzlnVar3.b.a;
                                zzlnVar3.a.n(obj8, this.n);
                                int a4 = this.S.a.a(obj8);
                                zzbl zzblVar3 = this.S.a;
                                zzbk zzbkVar3 = this.a;
                                i13 = i10;
                                i14 = i11;
                                i19 = a4;
                                obj4 = obj8;
                                obj3 = zzblVar3.e(d, zzbkVar3, 0L).a;
                                zzapVar3 = zzbkVar3.c;
                            } else {
                                i13 = i10;
                                i14 = i11;
                                obj3 = null;
                                zzapVar3 = null;
                                obj4 = null;
                                i19 = -1;
                            }
                            long Q = zzeu.Q(j);
                            if (!this.S.b.b()) {
                                j4 = zzeu.Q(U(this.S));
                            } else {
                                j4 = Q;
                            }
                            zzvb zzvbVar5 = this.S.b;
                            final zzbf zzbfVar2 = new zzbf(obj3, d, zzapVar3, obj4, i19, Q, j4, zzvbVar5.b, zzvbVar5.c);
                            this.l.d(11, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjp
                                @Override // com.google.android.gms.internal.ads.zzdt
                                public final void b(Object obj9) {
                                    int i24 = zzkc.X;
                                    ((zzbe) obj9).m0(zzbfVar, zzbfVar2, i6);
                                }
                            });
                        } else {
                            if (zzvbVar3.e != -1) {
                                j3 = U(this.S);
                            } else {
                                j3 = zzbjVar2.d;
                            }
                            U = j3;
                            String str2 = zzeu.a;
                            zzvb zzvbVar42 = zzlnVar2.b;
                            final zzbf zzbfVar3 = new zzbf(obj, i17, zzapVar2, obj2, i18, zzeu.Q(j3), zzeu.Q(U), zzvbVar42.b, zzvbVar42.c);
                            int d2 = d();
                            if (this.S.a.o()) {
                            }
                            long Q2 = zzeu.Q(j);
                            if (!this.S.b.b()) {
                            }
                            zzvb zzvbVar52 = this.S.b;
                            final zzbf zzbfVar22 = new zzbf(obj3, d2, zzapVar3, obj4, i19, Q2, j4, zzvbVar52.b, zzvbVar52.c);
                            this.l.d(11, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjp
                                @Override // com.google.android.gms.internal.ads.zzdt
                                public final void b(Object obj9) {
                                    int i24 = zzkc.X;
                                    ((zzbe) obj9).m0(zzbfVar3, zzbfVar22, i6);
                                }
                            });
                        }
                    } else if (zzlnVar2.b.b()) {
                        j3 = zzlnVar2.s;
                        U = U(zzlnVar2);
                        String str22 = zzeu.a;
                        zzvb zzvbVar422 = zzlnVar2.b;
                        final zzbf zzbfVar32 = new zzbf(obj, i17, zzapVar2, obj2, i18, zzeu.Q(j3), zzeu.Q(U), zzvbVar422.b, zzvbVar422.c);
                        int d22 = d();
                        if (this.S.a.o()) {
                        }
                        long Q22 = zzeu.Q(j);
                        if (!this.S.b.b()) {
                        }
                        zzvb zzvbVar522 = this.S.b;
                        final zzbf zzbfVar222 = new zzbf(obj3, d22, zzapVar3, obj4, i19, Q22, j4, zzvbVar522.b, zzvbVar522.c);
                        this.l.d(11, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjp
                            @Override // com.google.android.gms.internal.ads.zzdt
                            public final void b(Object obj9) {
                                int i24 = zzkc.X;
                                ((zzbe) obj9).m0(zzbfVar32, zzbfVar222, i6);
                            }
                        });
                    } else {
                        j3 = zzlnVar2.s;
                        U = j3;
                        String str222 = zzeu.a;
                        zzvb zzvbVar4222 = zzlnVar2.b;
                        final zzbf zzbfVar322 = new zzbf(obj, i17, zzapVar2, obj2, i18, zzeu.Q(j3), zzeu.Q(U), zzvbVar4222.b, zzvbVar4222.c);
                        int d222 = d();
                        if (this.S.a.o()) {
                        }
                        long Q222 = zzeu.Q(j);
                        if (!this.S.b.b()) {
                        }
                        zzvb zzvbVar5222 = this.S.b;
                        final zzbf zzbfVar2222 = new zzbf(obj3, d222, zzapVar3, obj4, i19, Q222, j4, zzvbVar5222.b, zzvbVar5222.c);
                        this.l.d(11, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjp
                            @Override // com.google.android.gms.internal.ads.zzdt
                            public final void b(Object obj9) {
                                int i24 = zzkc.X;
                                ((zzbe) obj9).m0(zzbfVar322, zzbfVar2222, i6);
                            }
                        });
                    }
                } else {
                    i12 = i9;
                    z6 = equals2;
                    i13 = i10;
                    i14 = i11;
                }
                if (!booleanValue) {
                    zzdw zzdwVar = this.l;
                    zzdt zzdtVar = new zzdt() { // from class: com.google.android.gms.internal.ads.zzjq
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).t0(zzap.this, intValue);
                        }
                    };
                    z7 = true;
                    zzdwVar.d(1, zzdtVar);
                } else {
                    z7 = true;
                }
                zzikVar = zzlnVar2.f;
                zzikVar2 = zzlnVar.f;
                if (zzikVar != zzikVar2) {
                    zzdw zzdwVar2 = this.l;
                    zzdwVar2.d(10, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjr
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).w0(zzln.this.f);
                        }
                    });
                    if (zzikVar2 != null) {
                        zzdwVar2.d(10, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjs
                            @Override // com.google.android.gms.internal.ads.zzdt
                            public final void b(Object obj9) {
                                int i24 = zzkc.X;
                                ((zzbe) obj9).s0(zzln.this.f);
                            }
                        });
                    }
                }
                zzyyVar = zzlnVar2.i;
                zzyyVar2 = zzlnVar.i;
                if (zzyyVar != zzyyVar2) {
                    this.i.g(zzyyVar2.e);
                    this.l.d(2, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).n0(zzln.this.i.d);
                        }
                    });
                }
                if (!z6) {
                    final zzat zzatVar = this.G;
                    this.l.d(14, new zzdt() { // from class: com.google.android.gms.internal.ads.zzix
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).r0(zzat.this);
                        }
                    });
                }
                if (i14 != 0) {
                    this.l.d(i4, new zzdt() { // from class: com.google.android.gms.internal.ads.zziy
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).a(zzln.this.g);
                        }
                    });
                }
                if (i13 == 0 || i12 != 0) {
                    this.l.d(-1, new zzdt() { // from class: com.google.android.gms.internal.ads.zziz
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            zzln zzlnVar4 = zzln.this;
                            ((zzbe) obj9).v0(zzlnVar4.l, zzlnVar4.e);
                        }
                    });
                }
                if (i13 != 0) {
                    this.l.d(4, new zzdt() { // from class: com.google.android.gms.internal.ads.zzja
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).N(zzln.this.e);
                        }
                    });
                }
                if (i12 == 0 || zzlnVar2.m != zzlnVar.m) {
                    this.l.d(5, new zzdt() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            zzln zzlnVar4 = zzln.this;
                            ((zzbe) obj9).o0(zzlnVar4.l, zzlnVar4.m);
                        }
                    });
                }
                if (zzlnVar2.n != zzlnVar.n) {
                    this.l.d(6, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjk
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).j0(zzln.this.n);
                        }
                    });
                }
                if (zzlnVar2.j() != zzlnVar.j()) {
                    this.l.d(7, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjn
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).k0(zzln.this.j());
                        }
                    });
                }
                if (!zzlnVar2.f290o.equals(zzlnVar.f290o)) {
                    this.l.d(12, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjo
                        @Override // com.google.android.gms.internal.ads.zzdt
                        public final void b(Object obj9) {
                            int i24 = zzkc.X;
                            ((zzbe) obj9).l0(zzln.this.f290o);
                        }
                    });
                }
                zzbdVar = this.F;
                zzbh zzbhVar2 = this.f;
                zzbd zzbdVar2 = this.c;
                String str3 = zzeu.a;
                boolean y = zzbhVar2.y();
                zzg zzgVar = (zzg) zzbhVar2;
                p2 = zzgVar.p();
                if (p2.o()) {
                    zzbhVar = zzbhVar2;
                    if (p2.e(zzgVar.d(), zzgVar.a, 0L).g) {
                        z8 = z7;
                        p3 = zzgVar.p();
                        if (p3.o()) {
                            i15 = -1;
                            r15 = 0;
                            z9 = false;
                        } else {
                            int d3 = zzgVar.d();
                            zzgVar.i();
                            zzgVar.B();
                            r15 = 0;
                            r15 = 0;
                            int k = p3.k(d3, 0, false);
                            i15 = -1;
                            if (k != -1) {
                                z9 = z7;
                            } else {
                                z9 = false;
                            }
                        }
                        p4 = zzgVar.p();
                        if (!p4.o()) {
                            int d4 = zzgVar.d();
                            zzgVar.i();
                            zzgVar.B();
                            if (p4.j(d4, r15, r15) != i15) {
                                z10 = z7;
                                p5 = zzgVar.p();
                                if (p5.o()) {
                                    z11 = y;
                                    j2 = 0;
                                    if (p5.e(zzgVar.d(), zzgVar.a, 0L).b()) {
                                        z12 = true;
                                        p6 = zzgVar.p();
                                        if (p6.o() && p6.e(zzgVar.d(), zzgVar.a, j2).h) {
                                            z13 = true;
                                        } else {
                                            z13 = r15;
                                        }
                                        o2 = zzbhVar.p().o();
                                        zzbc zzbcVar = new zzbc();
                                        zzbcVar.b(zzbdVar2);
                                        boolean z22 = !z11;
                                        zzbcVar.d(4, z22);
                                        if (!z8 && !z11) {
                                            z14 = true;
                                        } else {
                                            z14 = r15;
                                        }
                                        zzbcVar.d(5, z14);
                                        if (!z9 && !z11) {
                                            z15 = true;
                                        } else {
                                            z15 = r15;
                                        }
                                        zzbcVar.d(6, z15);
                                        if (!o2 || ((!z9 && z12 && !z8) || z11)) {
                                            z16 = r15;
                                        } else {
                                            z16 = true;
                                        }
                                        zzbcVar.d(7, z16);
                                        if (!z10 && !z11) {
                                            z17 = true;
                                        } else {
                                            z17 = r15;
                                        }
                                        zzbcVar.d(8, z17);
                                        if (!o2 || ((!z10 && (!z12 || !z13)) || z11)) {
                                            z18 = r15;
                                        } else {
                                            z18 = true;
                                        }
                                        zzbcVar.d(9, z18);
                                        zzbcVar.d(10, z22);
                                        if (!z8 && !z11) {
                                            i16 = 11;
                                            z19 = true;
                                        } else {
                                            z19 = r15;
                                            i16 = 11;
                                        }
                                        zzbcVar.d(i16, z19);
                                        if (!z8 && !z11) {
                                            z20 = true;
                                        } else {
                                            z20 = r15;
                                        }
                                        zzbcVar.d(12, z20);
                                        e = zzbcVar.e();
                                        this.F = e;
                                        if (!e.equals(zzbdVar)) {
                                            this.l.d(13, new zzdt() { // from class: com.google.android.gms.internal.ads.zzjm
                                                @Override // com.google.android.gms.internal.ads.zzdt
                                                public final void b(Object obj9) {
                                                    ((zzbe) obj9).q0(zzkc.this.F);
                                                }
                                            });
                                        }
                                        this.l.c();
                                    }
                                } else {
                                    z11 = y;
                                    j2 = 0;
                                }
                                z12 = r15;
                                p6 = zzgVar.p();
                                if (p6.o()) {
                                }
                                z13 = r15;
                                o2 = zzbhVar.p().o();
                                zzbc zzbcVar2 = new zzbc();
                                zzbcVar2.b(zzbdVar2);
                                boolean z222 = !z11;
                                zzbcVar2.d(4, z222);
                                if (!z8) {
                                }
                                z14 = r15;
                                zzbcVar2.d(5, z14);
                                if (!z9) {
                                }
                                z15 = r15;
                                zzbcVar2.d(6, z15);
                                if (!o2) {
                                }
                                z16 = r15;
                                zzbcVar2.d(7, z16);
                                if (!z10) {
                                }
                                z17 = r15;
                                zzbcVar2.d(8, z17);
                                if (!o2) {
                                }
                                z18 = r15;
                                zzbcVar2.d(9, z18);
                                zzbcVar2.d(10, z222);
                                if (!z8) {
                                }
                                z19 = r15;
                                i16 = 11;
                                zzbcVar2.d(i16, z19);
                                if (!z8) {
                                }
                                z20 = r15;
                                zzbcVar2.d(12, z20);
                                e = zzbcVar2.e();
                                this.F = e;
                                if (!e.equals(zzbdVar)) {
                                }
                                this.l.c();
                            }
                        }
                        z10 = r15;
                        p5 = zzgVar.p();
                        if (p5.o()) {
                        }
                        z12 = r15;
                        p6 = zzgVar.p();
                        if (p6.o()) {
                        }
                        z13 = r15;
                        o2 = zzbhVar.p().o();
                        zzbc zzbcVar22 = new zzbc();
                        zzbcVar22.b(zzbdVar2);
                        boolean z2222 = !z11;
                        zzbcVar22.d(4, z2222);
                        if (!z8) {
                        }
                        z14 = r15;
                        zzbcVar22.d(5, z14);
                        if (!z9) {
                        }
                        z15 = r15;
                        zzbcVar22.d(6, z15);
                        if (!o2) {
                        }
                        z16 = r15;
                        zzbcVar22.d(7, z16);
                        if (!z10) {
                        }
                        z17 = r15;
                        zzbcVar22.d(8, z17);
                        if (!o2) {
                        }
                        z18 = r15;
                        zzbcVar22.d(9, z18);
                        zzbcVar22.d(10, z2222);
                        if (!z8) {
                        }
                        z19 = r15;
                        i16 = 11;
                        zzbcVar22.d(i16, z19);
                        if (!z8) {
                        }
                        z20 = r15;
                        zzbcVar22.d(12, z20);
                        e = zzbcVar22.e();
                        this.F = e;
                        if (!e.equals(zzbdVar)) {
                        }
                        this.l.c();
                    }
                } else {
                    zzbhVar = zzbhVar2;
                }
                z8 = false;
                p3 = zzgVar.p();
                if (p3.o()) {
                }
                p4 = zzgVar.p();
                if (!p4.o()) {
                }
                z10 = r15;
                p5 = zzgVar.p();
                if (p5.o()) {
                }
                z12 = r15;
                p6 = zzgVar.p();
                if (p6.o()) {
                }
                z13 = r15;
                o2 = zzbhVar.p().o();
                zzbc zzbcVar222 = new zzbc();
                zzbcVar222.b(zzbdVar2);
                boolean z22222 = !z11;
                zzbcVar222.d(4, z22222);
                if (!z8) {
                }
                z14 = r15;
                zzbcVar222.d(5, z14);
                if (!z9) {
                }
                z15 = r15;
                zzbcVar222.d(6, z15);
                if (!o2) {
                }
                z16 = r15;
                zzbcVar222.d(7, z16);
                if (!z10) {
                }
                z17 = r15;
                zzbcVar222.d(8, z17);
                if (!o2) {
                }
                z18 = r15;
                zzbcVar222.d(9, z18);
                zzbcVar222.d(10, z22222);
                if (!z8) {
                }
                z19 = r15;
                i16 = 11;
                zzbcVar222.d(i16, z19);
                if (!z8) {
                }
                z20 = r15;
                zzbcVar222.d(12, z20);
                e = zzbcVar222.e();
                this.F = e;
                if (!e.equals(zzbdVar)) {
                }
                this.l.c();
            }
        }
        i6 = i20;
        i5 = 0;
        z3 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        zzar a5 = this.R.a();
        list = zzlnVar.j;
        while (i8 < list.size()) {
        }
        this.R = a5.T();
        p = p();
        if (!p.o()) {
        }
        boolean equals22 = T.equals(this.G);
        this.G = T;
        if (zzlnVar2.l == zzlnVar.l) {
        }
        if (zzlnVar2.e == zzlnVar.e) {
        }
        if (i10 == 0) {
        }
        g0();
        if (zzlnVar2.g == zzlnVar.g) {
        }
        if (!equals) {
        }
        if (!z3) {
        }
        if (!booleanValue) {
        }
        zzikVar = zzlnVar2.f;
        zzikVar2 = zzlnVar.f;
        if (zzikVar != zzikVar2) {
        }
        zzyyVar = zzlnVar2.i;
        zzyyVar2 = zzlnVar.i;
        if (zzyyVar != zzyyVar2) {
        }
        if (!z6) {
        }
        if (i14 != 0) {
        }
        if (i13 == 0) {
        }
        this.l.d(-1, new zzdt() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj9) {
                int i24 = zzkc.X;
                zzln zzlnVar4 = zzln.this;
                ((zzbe) obj9).v0(zzlnVar4.l, zzlnVar4.e);
            }
        });
        if (i13 != 0) {
        }
        if (i12 == 0) {
        }
        this.l.d(5, new zzdt() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdt
            public final void b(Object obj9) {
                int i24 = zzkc.X;
                zzln zzlnVar4 = zzln.this;
                ((zzbe) obj9).o0(zzlnVar4.l, zzlnVar4.m);
            }
        });
        if (zzlnVar2.n != zzlnVar.n) {
        }
        if (zzlnVar2.j() != zzlnVar.j()) {
        }
        if (!zzlnVar2.f290o.equals(zzlnVar.f290o)) {
        }
        zzbdVar = this.F;
        zzbh zzbhVar22 = this.f;
        zzbd zzbdVar22 = this.c;
        String str32 = zzeu.a;
        boolean y2 = zzbhVar22.y();
        zzg zzgVar2 = (zzg) zzbhVar22;
        p2 = zzgVar2.p();
        if (p2.o()) {
        }
        z8 = false;
        p3 = zzgVar2.p();
        if (p3.o()) {
        }
        p4 = zzgVar2.p();
        if (!p4.o()) {
        }
        z10 = r15;
        p5 = zzgVar2.p();
        if (p5.o()) {
        }
        z12 = r15;
        p6 = zzgVar2.p();
        if (p6.o()) {
        }
        z13 = r15;
        o2 = zzbhVar.p().o();
        zzbc zzbcVar2222 = new zzbc();
        zzbcVar2222.b(zzbdVar22);
        boolean z222222 = !z11;
        zzbcVar2222.d(4, z222222);
        if (!z8) {
        }
        z14 = r15;
        zzbcVar2222.d(5, z14);
        if (!z9) {
        }
        z15 = r15;
        zzbcVar2222.d(6, z15);
        if (!o2) {
        }
        z16 = r15;
        zzbcVar2222.d(7, z16);
        if (!z10) {
        }
        z17 = r15;
        zzbcVar2222.d(8, z17);
        if (!o2) {
        }
        z18 = r15;
        zzbcVar2222.d(9, z18);
        zzbcVar2222.d(10, z222222);
        if (!z8) {
        }
        z19 = r15;
        i16 = 11;
        zzbcVar2222.d(i16, z19);
        if (!z8) {
        }
        z20 = r15;
        zzbcVar2222.d(12, z20);
        e = zzbcVar2222.e();
        this.F = e;
        if (!e.equals(zzbdVar)) {
        }
        this.l.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int g() {
        h0();
        return this.S.e;
    }

    public final void g0() {
        int g = g();
        if (g != 2 && g != 3) {
            this.w.a(false);
            this.x.a(false);
            return;
        }
        h0();
        boolean z = this.S.p;
        this.w.a(q());
        this.x.a(q());
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int h() {
        h0();
        return this.S.n;
    }

    public final void h0() {
        IllegalStateException illegalStateException;
        this.d.b();
        Looper looper = this.r;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzeu.a;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (!this.O) {
                if (this.P) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdx.g(C4022Qh0.x2, format, illegalStateException);
                this.P = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int i() {
        h0();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long j() {
        h0();
        if (y()) {
            zzln zzlnVar = this.S;
            if (zzlnVar.k.equals(zzlnVar.b)) {
                return zzeu.Q(this.S.q);
            }
            return m();
        }
        h0();
        if (this.S.a.o()) {
            return this.U;
        }
        zzln zzlnVar2 = this.S;
        long j = 0;
        if (zzlnVar2.k.d != zzlnVar2.b.d) {
            return zzeu.Q(zzlnVar2.a.e(d(), this.a, 0L).l);
        }
        long j2 = zzlnVar2.q;
        if (this.S.k.b()) {
            zzln zzlnVar3 = this.S;
            zzlnVar3.a.n(zzlnVar3.k.a, this.n).g(this.S.k.b);
        } else {
            j = j2;
        }
        zzln zzlnVar4 = this.S;
        V(zzlnVar4.a, zzlnVar4.k, j);
        return zzeu.Q(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long k() {
        h0();
        return R(this.S);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long l() {
        h0();
        return zzeu.Q(T(this.S));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long m() {
        h0();
        if (!y()) {
            zzbl p = p();
            if (p.o()) {
                return C10323vs.b;
            }
            return zzeu.Q(p.e(d(), this.a, 0L).l);
        }
        zzln zzlnVar = this.S;
        zzvb zzvbVar = zzlnVar.b;
        zzbl zzblVar = zzlnVar.a;
        Object obj = zzvbVar.a;
        zzbj zzbjVar = this.n;
        zzblVar.n(obj, zzbjVar);
        return zzeu.Q(zzbjVar.f(zzvbVar.b, zzvbVar.c));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long n() {
        h0();
        return zzeu.Q(this.S.r);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbt o() {
        h0();
        return this.S.i.d;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbl p() {
        h0();
        return this.S.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean q() {
        h0();
        return this.S.l;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void r() {
        int i;
        h0();
        zzln zzlnVar = this.S;
        if (zzlnVar.e != 1) {
            return;
        }
        zzln e = zzlnVar.e(null);
        if (true != e.a.o()) {
            i = 2;
        } else {
            i = 4;
        }
        zzln X2 = X(e, i);
        this.A++;
        this.k.n0();
        f0(X2, 1, false, 5, C10323vs.b, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void t() {
        h0();
        e0(null);
        int i = zzcv.a;
        zzfyc F = zzfyc.F();
        long j = this.S.s;
        zzfyc.B(F);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final void u(zzvd zzvdVar) {
        h0();
        List singletonList = Collections.singletonList(zzvdVar);
        h0();
        h0();
        Q(this.S);
        l();
        boolean z = true;
        this.A++;
        List list = this.f287o;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
            this.W = this.W.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlk zzlkVar = new zzlk((zzvd) singletonList.get(i2), this.p);
            arrayList.add(zzlkVar);
            list.add(i2, new zzka(zzlkVar.b, zzlkVar.a));
        }
        this.W = this.W.g(0, arrayList.size());
        zzlt zzltVar = new zzlt(list, this.W);
        if (!zzltVar.o() && zzltVar.c() < 0) {
            throw new zzaa(zzltVar, -1, C10323vs.b);
        }
        int g = zzltVar.g(false);
        zzln Y = Y(this.S, zzltVar, W(zzltVar, g, C10323vs.b));
        int i3 = Y.e;
        if (g != -1 && i3 != 1) {
            i3 = 4;
            if (!zzltVar.o() && g < zzltVar.c()) {
                i3 = 2;
            }
        }
        zzln X2 = X(Y, i3);
        this.k.v0(arrayList, g, zzeu.N(C10323vs.b), this.W);
        f0(X2, 0, (this.S.b.a.equals(X2.b.a) || this.S.a.o()) ? false : false, 4, T(X2), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final void v(zzmm zzmmVar) {
        h0();
        this.q.z(zzmmVar);
    }

    @Override // com.google.android.gms.internal.ads.zziv
    public final int w() {
        h0();
        int length = this.g.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void x(boolean z) {
        h0();
        zzln zzlnVar = this.S;
        int i = zzlnVar.n;
        int i2 = 0;
        if (i == 1) {
            if (!z) {
                i = 1;
                i2 = 1;
            } else {
                i = 1;
            }
        }
        if (zzlnVar.l == z && i == i2 && zzlnVar.m == 1) {
            return;
        }
        this.A++;
        zzln d = zzlnVar.d(z, 1, i2);
        this.k.q0(z, 1, i2);
        f0(d, 0, false, 5, C10323vs.b, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean y() {
        h0();
        return this.S.b.b();
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void z(int i, long j, int i2, boolean z) {
        boolean z2;
        h0();
        if (i != -1) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzdc.d(z2);
            zzbl zzblVar = this.S.a;
            if (!zzblVar.o() && i >= zzblVar.c()) {
                return;
            }
            this.q.q();
            this.A++;
            if (y()) {
                zzdx.f(C4022Qh0.x2, "seekTo ignored because an ad is playing");
                zzkl zzklVar = new zzkl(this.S);
                zzklVar.a(1);
                this.V.a.a0(zzklVar);
                return;
            }
            zzln zzlnVar = this.S;
            int i3 = zzlnVar.e;
            if (i3 == 3 || (i3 == 4 && !zzblVar.o())) {
                zzlnVar = X(this.S, 2);
            }
            int d = d();
            zzln Y = Y(zzlnVar, zzblVar, W(zzblVar, i, j));
            this.k.o0(zzblVar, i, zzeu.N(j));
            f0(Y, 0, true, 1, T(Y), d, false);
        }
    }
}
