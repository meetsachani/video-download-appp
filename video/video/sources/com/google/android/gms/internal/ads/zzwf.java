package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.C10323vs;
import o.C4128Rj1;
import o.HL0;
import o.InterfaceC11300zs1;
import o.InterfaceC8557od0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwf implements zzuz, zzadq, zzzm, zzzq, zzwq {
    public static final Map I1;
    public static final zzz J1;
    public boolean A1;
    public long B1;
    public boolean D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public final zzzg H1;
    public final Uri X;
    public final zzgg Y;
    public final zzvl Y0;
    public final zzsb Z;
    public final zzrw Z0;
    public final zzwb a1;
    public final long b1;
    public final long c1;
    public final zzvu e1;
    @InterfaceC11300zs1
    public zzuy j1;
    @InterfaceC11300zs1
    public zzagn k1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public zzwe r1;
    public zzaem s1;
    public long t1;
    public boolean u1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public int z1;
    public final zzzu d1 = new zzzu("ProgressiveMediaPeriod");
    public final zzdj f1 = new zzdj(zzdg.a);
    public final Runnable g1 = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvw
        @Override // java.lang.Runnable
        public final void run() {
            zzwf.this.G();
        }
    };
    public final Runnable h1 = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvx
        @Override // java.lang.Runnable
        public final void run() {
            zzwf.r(zzwf.this);
        }
    };
    public final Handler i1 = zzeu.T(null);
    public zzwd[] m1 = new zzwd[0];
    public zzws[] l1 = new zzws[0];
    public long C1 = C10323vs.b;
    public int v1 = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(HL0.b1, "1");
        I1 = Collections.unmodifiableMap(hashMap);
        zzx zzxVar = new zzx();
        zzxVar.o("icy");
        zzxVar.E(C4128Rj1.M0);
        J1 = zzxVar.K();
    }

    public zzwf(Uri uri, zzgg zzggVar, zzvu zzvuVar, zzsb zzsbVar, zzrw zzrwVar, zzzk zzzkVar, zzvl zzvlVar, zzwb zzwbVar, zzzg zzzgVar, @InterfaceC11300zs1 String str, int i, int i2, @InterfaceC11300zs1 zzz zzzVar, long j, @InterfaceC11300zs1 zzaac zzaacVar) {
        this.X = uri;
        this.Y = zzggVar;
        this.Z = zzsbVar;
        this.Z0 = zzrwVar;
        this.Y0 = zzvlVar;
        this.a1 = zzwbVar;
        this.H1 = zzzgVar;
        this.b1 = i;
        this.e1 = zzvuVar;
        this.c1 = j;
    }

    public static /* synthetic */ void r(zzwf zzwfVar) {
        if (!zzwfVar.G1) {
            zzuy zzuyVar = zzwfVar.j1;
            zzuyVar.getClass();
            zzuyVar.h(zzwfVar);
        }
    }

    public static /* synthetic */ void t(zzwf zzwfVar, zzaem zzaemVar) {
        zzaem zzaelVar;
        if (zzwfVar.k1 == null) {
            zzaelVar = zzaemVar;
        } else {
            zzaelVar = new zzael(C10323vs.b, 0L);
        }
        zzwfVar.s1 = zzaelVar;
        zzwfVar.t1 = zzaemVar.a();
        boolean z = false;
        int i = 1;
        if (!zzwfVar.A1 && zzaemVar.a() == C10323vs.b) {
            z = true;
        }
        zzwfVar.u1 = z;
        if (true == z) {
            i = 7;
        }
        zzwfVar.v1 = i;
        if (zzwfVar.o1) {
            zzwfVar.a1.j(zzwfVar.t1, zzaemVar, z);
        } else {
            zzwfVar.G();
        }
    }

    public final void A() {
        if (this.o1) {
            for (zzws zzwsVar : this.l1) {
                zzwsVar.F();
            }
        }
        this.d1.j(this);
        this.i1.removeCallbacksAndMessages(null);
        this.j1 = null;
        this.G1 = true;
    }

    public final boolean B(int i) {
        if (!M() && this.l1[i].M(this.F1)) {
            return true;
        }
        return false;
    }

    public final int C() {
        int i = 0;
        for (zzws zzwsVar : this.l1) {
            i += zzwsVar.y();
        }
        return i;
    }

    public final long D(boolean z) {
        int i = 0;
        long j = Long.MIN_VALUE;
        while (true) {
            zzws[] zzwsVarArr = this.l1;
            if (i < zzwsVarArr.length) {
                if (!z) {
                    zzwe zzweVar = this.r1;
                    zzweVar.getClass();
                    if (!zzweVar.c[i]) {
                        i++;
                    }
                }
                j = Math.max(j, zzwsVarArr[i].A());
                i++;
            } else {
                return j;
            }
        }
    }

    public final zzaet E(zzwd zzwdVar) {
        int length = this.l1.length;
        for (int i = 0; i < length; i++) {
            if (zzwdVar.equals(this.m1[i])) {
                return this.l1[i];
            }
        }
        if (this.n1) {
            int i2 = zzwdVar.a;
            zzdx.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + i2 + ") after finishing tracks.");
            return new zzadj();
        }
        zzws zzwsVar = new zzws(this.H1, this.Z, this.Z0);
        zzwsVar.J(this);
        int i3 = length + 1;
        zzwd[] zzwdVarArr = (zzwd[]) Arrays.copyOf(this.m1, i3);
        zzwdVarArr[length] = zzwdVar;
        String str = zzeu.a;
        this.m1 = zzwdVarArr;
        zzws[] zzwsVarArr = (zzws[]) Arrays.copyOf(this.l1, i3);
        zzwsVarArr[length] = zzwsVar;
        this.l1 = zzwsVarArr;
        return zzwsVar;
    }

    @InterfaceC8557od0({"trackState", "seekMap"})
    public final void F() {
        zzdc.f(this.o1);
        this.r1.getClass();
        this.s1.getClass();
    }

    public final void G() {
        boolean z;
        boolean z2;
        zzav c;
        int i;
        if (!this.G1 && !this.o1 && this.n1 && this.s1 != null) {
            for (zzws zzwsVar : this.l1) {
                if (zzwsVar.B() == null) {
                    return;
                }
            }
            this.f1.d();
            int length = this.l1.length;
            zzbm[] zzbmVarArr = new zzbm[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zzz B = this.l1[i2].B();
                B.getClass();
                String str = B.f301o;
                boolean h = zzay.h(str);
                if (h || zzay.j(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i2] = z;
                this.p1 = z | this.p1;
                boolean i3 = zzay.i(str);
                if (this.c1 != C10323vs.b && length == 1 && i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.q1 = z2;
                zzagn zzagnVar = this.k1;
                if (zzagnVar != null) {
                    if (h || this.m1[i2].b) {
                        zzav zzavVar = B.l;
                        if (zzavVar == null) {
                            c = new zzav(C10323vs.b, zzagnVar);
                        } else {
                            c = zzavVar.c(zzagnVar);
                        }
                        zzx b = B.b();
                        b.w(c);
                        B = b.K();
                    }
                    if (h && B.h == -1 && B.i == -1 && (i = zzagnVar.a) != -1) {
                        zzx b2 = B.b();
                        b2.a(i);
                        B = b2.K();
                    }
                }
                zzz c2 = B.c(this.Z.a(B));
                zzbmVarArr[i2] = new zzbm(Integer.toString(i2), c2);
                this.y1 = c2.u | this.y1;
            }
            this.r1 = new zzwe(new zzxe(zzbmVarArr), zArr);
            if (this.q1 && this.t1 == C10323vs.b) {
                this.t1 = this.c1;
                this.s1 = new zzvz(this, this.s1);
            }
            this.a1.j(this.t1, this.s1, this.u1);
            this.o1 = true;
            zzuy zzuyVar = this.j1;
            zzuyVar.getClass();
            zzuyVar.i(this);
        }
    }

    public final void H(int i) {
        F();
        zzwe zzweVar = this.r1;
        boolean[] zArr = zzweVar.d;
        if (!zArr[i]) {
            zzz b = zzweVar.a.b(i).b(0);
            this.Y0.d(new zzux(1, zzay.b(b.f301o), b, 0, null, zzeu.Q(this.B1), C10323vs.b));
            zArr[i] = true;
        }
    }

    public final void I(int i) {
        F();
        if (this.D1) {
            if ((!this.p1 || this.r1.b[i]) && !this.l1[i].M(false)) {
                this.C1 = 0L;
                this.D1 = false;
                this.x1 = true;
                this.B1 = 0L;
                this.E1 = 0;
                for (zzws zzwsVar : this.l1) {
                    zzwsVar.H(false);
                }
                zzuy zzuyVar = this.j1;
                zzuyVar.getClass();
                zzuyVar.h(this);
            }
        }
    }

    public final void J() {
        zzwa zzwaVar = new zzwa(this, this.X, this.Y, this.e1, this, this.f1);
        if (this.o1) {
            zzdc.f(L());
            long j = this.t1;
            if (j != C10323vs.b && this.C1 > j) {
                this.F1 = true;
                this.C1 = C10323vs.b;
                return;
            }
            zzaem zzaemVar = this.s1;
            zzaemVar.getClass();
            zzwa.f(zzwaVar, zzaemVar.t(this.C1).a.b, this.C1);
            for (zzws zzwsVar : this.l1) {
                zzwsVar.I(this.C1);
            }
            this.C1 = C10323vs.b;
        }
        this.E1 = C();
        this.d1.a(zzwaVar, this, zzzk.a(this.v1));
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    public final void K() {
        for (zzws zzwsVar : this.l1) {
            zzwsVar.G();
        }
        this.e1.d();
    }

    public final boolean L() {
        return this.C1 != C10323vs.b;
    }

    public final boolean M() {
        return this.x1 || L();
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void N() {
        this.n1 = true;
        this.i1.post(this.g1);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzaet O(int i, int i2) {
        return E(new zzwd(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void P(final zzaem zzaemVar) {
        this.i1.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvy
            @Override // java.lang.Runnable
            public final void run() {
                zzwf.t(zzwf.this, zzaemVar);
            }
        });
    }

    public final int Q(int i, zzkq zzkqVar, zzhp zzhpVar, int i2) {
        if (M()) {
            return -3;
        }
        H(i);
        int z = this.l1[i].z(zzkqVar, zzhpVar, i2, this.F1);
        if (z == -3) {
            I(i);
        }
        return z;
    }

    public final int R(int i, long j) {
        if (M()) {
            return 0;
        }
        H(i);
        zzws zzwsVar = this.l1[i];
        int x = zzwsVar.x(j, this.F1);
        zzwsVar.K(x);
        if (x == 0) {
            I(i);
            return 0;
        }
        return x;
    }

    public final zzaet X() {
        return E(new zzwd(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        if (!this.F1) {
            zzzu zzzuVar = this.d1;
            if (!zzzuVar.k() && !this.D1) {
                if (!this.o1 || this.z1 != 0) {
                    boolean f = this.f1.f();
                    if (!zzzuVar.l()) {
                        J();
                        return true;
                    }
                    return f;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long b() {
        long j;
        F();
        if (this.F1 || this.z1 == 0) {
            return Long.MIN_VALUE;
        }
        if (L()) {
            return this.C1;
        }
        if (this.p1) {
            int length = this.l1.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwe zzweVar = this.r1;
                if (zzweVar.b[i] && zzweVar.c[i] && !this.l1[i].L()) {
                    j = Math.min(j, this.l1[i].A());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = D(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.B1;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final long c() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzuz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(long j, zzmd zzmdVar) {
        boolean z;
        F();
        if (!this.s1.h()) {
            return 0L;
        }
        zzaek t = this.s1.t(j);
        zzaen zzaenVar = t.a;
        zzaen zzaenVar2 = t.b;
        long j2 = zzmdVar.a;
        if (j2 == 0) {
            if (zzmdVar.b == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzaenVar.a;
        String str = zzeu.a;
        long j4 = j - j2;
        long j5 = zzmdVar.b;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z2 = true;
        if (j4 <= j3 && j3 <= j6) {
            z = true;
        } else {
            z = false;
        }
        long j9 = zzaenVar2.a;
        if (j4 > j9 || j9 > j6) {
            z2 = false;
        }
        if (z && z2) {
            if (Math.abs(j3 - j) <= Math.abs(j9 - j)) {
                return j3;
            }
        } else {
            if (!z) {
                if (z2) {
                    return j9;
                }
                return j4;
            }
            return j3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long f() {
        if (this.y1) {
            this.y1 = false;
        } else if (this.x1) {
            if (this.F1 || C() > this.E1) {
                this.x1 = false;
            } else {
                return C10323vs.b;
            }
        } else {
            return C10323vs.b;
        }
        return this.B1;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzxe g() {
        F();
        return this.r1.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    @Override // com.google.android.gms.internal.ads.zzzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzzn h(zzzp zzzpVar, long j, long j2, IOException iOException, int i) {
        long j3;
        boolean z;
        zzzn b;
        zzaem zzaemVar;
        boolean c;
        zzwa zzwaVar = (zzwa) zzzpVar;
        zzhf e = zzwa.e(zzwaVar);
        zzus zzusVar = new zzus(zzwa.a(zzwaVar), zzwa.d(zzwaVar), e.h(), e.i(), j, j2, e.g());
        zzwa.c(zzwaVar);
        String str = zzeu.a;
        if (!(iOException instanceof zzaz) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzgw) && !(iOException instanceof zzzs)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzgh) || ((zzgh) th).X != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != C10323vs.b) {
                b = zzzu.e;
            } else {
                int C = C();
                if (C > this.E1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.A1 && ((zzaemVar = this.s1) == null || zzaemVar.a() == C10323vs.b)) {
                    boolean z2 = this.o1;
                    if (z2 && !M()) {
                        this.D1 = true;
                        b = zzzu.d;
                    } else {
                        this.x1 = z2;
                        this.B1 = 0L;
                        this.E1 = 0;
                        for (zzws zzwsVar : this.l1) {
                            zzwsVar.H(false);
                        }
                        zzwa.f(zzwaVar, 0L, 0L);
                    }
                } else {
                    this.E1 = C;
                }
                b = zzzu.b(z, j3);
            }
            c = b.c();
            this.Y0.g(zzusVar, new zzux(1, -1, null, 0, null, zzeu.Q(zzwa.c(zzwaVar)), zzeu.Q(this.t1)), iOException, !c);
            if (!c) {
                zzwa.a(zzwaVar);
            }
            return b;
        }
        j3 = -9223372036854775807L;
        if (j3 != C10323vs.b) {
        }
        c = b.c();
        this.Y0.g(zzusVar, new zzux(1, -1, null, 0, null, zzeu.Q(zzwa.c(zzwaVar)), zzeu.Q(this.t1)), iOException, !c);
        if (!c) {
        }
        return b;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ void i(zzzp zzzpVar, long j, long j2) {
        long j3;
        zzwa zzwaVar = (zzwa) zzzpVar;
        if (this.t1 == C10323vs.b && this.s1 != null) {
            long D = D(true);
            if (D == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = D + 10000;
            }
            this.t1 = j3;
            this.a1.j(j3, this.s1, this.u1);
        }
        zzhf e = zzwa.e(zzwaVar);
        zzus zzusVar = new zzus(zzwa.a(zzwaVar), zzwa.d(zzwaVar), e.h(), e.i(), j, j2, e.g());
        zzwa.a(zzwaVar);
        this.Y0.f(zzusVar, new zzux(1, -1, null, 0, null, zzeu.Q(zzwa.c(zzwaVar)), zzeu.Q(this.t1)));
        this.F1 = true;
        zzuy zzuyVar = this.j1;
        zzuyVar.getClass();
        zzuyVar.h(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void j() throws IOException {
        y();
        if (this.F1 && !this.o1) {
            throw zzaz.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwq
    public final void k(zzz zzzVar) {
        this.i1.post(this.g1);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ void l(zzzp zzzpVar, long j, long j2, boolean z) {
        zzwa zzwaVar = (zzwa) zzzpVar;
        zzhf e = zzwa.e(zzwaVar);
        zzus zzusVar = new zzus(zzwa.a(zzwaVar), zzwa.d(zzwaVar), e.h(), e.i(), j, j2, e.g());
        zzwa.a(zzwaVar);
        this.Y0.e(zzusVar, new zzux(1, -1, null, 0, null, zzeu.Q(zzwa.c(zzwaVar)), zzeu.Q(this.t1)));
        if (!z) {
            for (zzws zzwsVar : this.l1) {
                zzwsVar.H(false);
            }
            if (this.z1 > 0) {
                zzuy zzuyVar = this.j1;
                zzuyVar.getClass();
                zzuyVar.h(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void m(zzuy zzuyVar, long j) {
        this.j1 = zzuyVar;
        this.f1.f();
        J();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ void n(zzzp zzzpVar, long j, long j2, int i) {
        zzus zzusVar;
        zzwa zzwaVar = (zzwa) zzzpVar;
        zzhf e = zzwa.e(zzwaVar);
        if (i == 0) {
            zzusVar = new zzus(zzwa.a(zzwaVar), zzwa.d(zzwaVar), j);
        } else {
            zzusVar = new zzus(zzwa.a(zzwaVar), zzwa.d(zzwaVar), e.h(), e.i(), j, j2, e.g());
        }
        this.Y0.h(zzusVar, new zzux(1, -1, null, 0, null, zzeu.Q(zzwa.c(zzwaVar)), zzeu.Q(this.t1)), i);
    }

    @Override // com.google.android.gms.internal.ads.zzuz, com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        return this.d1.l() && this.f1.e();
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void p(long j, boolean z) {
        if (!this.q1) {
            F();
            if (!L()) {
                boolean[] zArr = this.r1.c;
                int length = this.l1.length;
                for (int i = 0; i < length; i++) {
                    this.l1[i].C(j, false, zArr[i]);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long q(zzyq[] zzyqVarArr, boolean[] zArr, zzwt[] zzwtVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzyq zzyqVar;
        boolean z2;
        boolean z3;
        F();
        zzwe zzweVar = this.r1;
        zzxe zzxeVar = zzweVar.a;
        boolean[] zArr3 = zzweVar.c;
        int i = this.z1;
        int i2 = 0;
        for (int i3 = 0; i3 < zzyqVarArr.length; i3++) {
            zzwt zzwtVar = zzwtVarArr[i3];
            if (zzwtVar != null && (zzyqVarArr[i3] == null || !zArr[i3])) {
                int c = zzwc.c((zzwc) zzwtVar);
                zzdc.f(zArr3[c]);
                this.z1--;
                zArr3[c] = false;
                zzwtVarArr[i3] = null;
            }
        }
        if (!this.w1 ? !(j == 0 || this.q1) : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i4 = 0; i4 < zzyqVarArr.length; i4++) {
            if (zzwtVarArr[i4] == null && (zzyqVar = zzyqVarArr[i4]) != null) {
                if (zzyqVar.h() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdc.f(z2);
                if (zzyqVar.E(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzdc.f(z3);
                int a = zzxeVar.a(zzyqVar.c());
                zzdc.f(!zArr3[a]);
                this.z1++;
                zArr3[a] = true;
                this.y1 = zzyqVar.b().u | this.y1;
                zzwtVarArr[i4] = new zzwc(this, a);
                zArr2[i4] = true;
                if (!z) {
                    zzws zzwsVar = this.l1[a];
                    if (zzwsVar.w() != 0 && !zzwsVar.h(j, true)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.z1 == 0) {
            this.D1 = false;
            this.x1 = false;
            this.y1 = false;
            zzzu zzzuVar = this.d1;
            if (zzzuVar.l()) {
                zzws[] zzwsVarArr = this.l1;
                int length = zzwsVarArr.length;
                while (i2 < length) {
                    zzwsVarArr[i2].D();
                    i2++;
                }
                zzzuVar.g();
            } else {
                this.F1 = false;
                for (zzws zzwsVar2 : this.l1) {
                    zzwsVar2.H(false);
                }
            }
        } else if (z) {
            j = w(j);
            while (i2 < zzwtVarArr.length) {
                if (zzwtVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.w1 = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long w(long j) {
        boolean h;
        F();
        boolean[] zArr = this.r1.b;
        if (true != this.s1.h()) {
            j = 0;
        }
        this.x1 = false;
        long j2 = this.B1;
        this.B1 = j;
        if (L()) {
            this.C1 = j;
            return j;
        }
        if (this.v1 != 7 && (this.F1 || this.d1.l())) {
            int length = this.l1.length;
            for (int i = 0; i < length; i++) {
                zzws zzwsVar = this.l1[i];
                if (zzwsVar.w() != 0 || j2 != j) {
                    if (this.q1) {
                        h = zzwsVar.N(zzwsVar.v());
                    } else {
                        h = zzwsVar.h(j, false);
                    }
                    if (h) {
                        continue;
                    } else if (!zArr[i] && this.p1) {
                    }
                }
            }
            return j;
        }
        this.D1 = false;
        this.C1 = j;
        this.F1 = false;
        this.y1 = false;
        zzzu zzzuVar = this.d1;
        if (zzzuVar.l()) {
            for (zzws zzwsVar2 : this.l1) {
                zzwsVar2.D();
            }
            zzzuVar.g();
            return j;
        }
        zzzuVar.h();
        for (zzws zzwsVar3 : this.l1) {
            zzwsVar3.H(false);
        }
        return j;
    }

    public final void y() throws IOException {
        this.d1.i(zzzk.a(this.v1));
    }

    public final void z(int i) throws IOException {
        this.l1[i].E();
        y();
    }
}
