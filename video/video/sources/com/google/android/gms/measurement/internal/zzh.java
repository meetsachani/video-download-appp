package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzh {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    @InterfaceC11300zs1
    public String H;
    public boolean I;
    public long J;
    public long K;
    public final zzhf a;
    public final String b;
    @InterfaceC11300zs1
    public String c;
    @InterfaceC11300zs1
    public String d;
    @InterfaceC11300zs1
    public String e;
    @InterfaceC11300zs1
    public String f;
    public long g;
    public long h;
    public long i;
    @InterfaceC11300zs1
    public String j;
    public long k;
    @InterfaceC11300zs1
    public String l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f314o;
    public boolean p;
    @InterfaceC11300zs1
    public String q;
    @InterfaceC11300zs1
    public Boolean r;
    public long s;
    @InterfaceC11300zs1
    public List<String> t;
    @InterfaceC11300zs1
    public String u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public boolean z;

    @InterfaceC10697xN2
    public zzh(zzhf zzhfVar, String str) {
        Preconditions.r(zzhfVar);
        Preconditions.l(str);
        this.a = zzhfVar;
        this.b = str;
        zzhfVar.l().n();
    }

    @InterfaceC10697xN2
    public final void A(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.J != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.J = j;
    }

    @InterfaceC10697xN2
    public final void B(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.l, str);
        this.l = str;
    }

    @InterfaceC10697xN2
    public final void C(boolean z) {
        boolean z2;
        this.a.l().n();
        boolean z3 = this.I;
        if (this.v != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z3 | z2;
        this.v = z;
    }

    @InterfaceC10697xN2
    public final long D() {
        this.a.l().n();
        return this.A;
    }

    @InterfaceC10697xN2
    public final void E(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.E != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.E = j;
    }

    @InterfaceC10697xN2
    public final void F(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.j, str);
        this.j = str;
    }

    @InterfaceC10697xN2
    public final void G(boolean z) {
        boolean z2;
        this.a.l().n();
        boolean z3 = this.I;
        if (this.z != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z3 | z2;
        this.z = z;
    }

    @InterfaceC10697xN2
    public final long H() {
        this.a.l().n();
        return this.J;
    }

    @InterfaceC10697xN2
    public final void I(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.F != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.F = j;
    }

    @InterfaceC10697xN2
    public final void J(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.f, str);
        this.f = str;
    }

    @InterfaceC10697xN2
    public final long K() {
        this.a.l().n();
        return this.E;
    }

    @InterfaceC10697xN2
    public final void L(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.D != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.D = j;
    }

    @InterfaceC10697xN2
    public final void M(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !zzg.a(this.d, str);
        this.d = str;
    }

    @InterfaceC10697xN2
    public final long N() {
        this.a.l().n();
        return this.F;
    }

    @InterfaceC10697xN2
    public final void O(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.C != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.C = j;
    }

    @InterfaceC10697xN2
    public final void P(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.H, str);
        this.H = str;
    }

    @InterfaceC10697xN2
    public final long Q() {
        this.a.l().n();
        return this.D;
    }

    @InterfaceC10697xN2
    public final void R(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.G != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.G = j;
    }

    @InterfaceC10697xN2
    public final void S(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.e, str);
        this.e = str;
    }

    @InterfaceC10697xN2
    public final long T() {
        this.a.l().n();
        return this.C;
    }

    @InterfaceC10697xN2
    public final void U(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.B != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.B = j;
    }

    @InterfaceC10697xN2
    public final void V(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.u, str);
        this.u = str;
    }

    @InterfaceC10697xN2
    public final long W() {
        this.a.l().n();
        return this.G;
    }

    @InterfaceC10697xN2
    public final void X(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.n != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.n = j;
    }

    @InterfaceC10697xN2
    public final long Y() {
        this.a.l().n();
        return this.B;
    }

    @InterfaceC10697xN2
    public final void Z(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.s != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.s = j;
    }

    @InterfaceC10697xN2
    public final int a() {
        this.a.l().n();
        return this.y;
    }

    @InterfaceC10697xN2
    public final long a0() {
        this.a.l().n();
        return this.n;
    }

    @InterfaceC10697xN2
    public final void b(int i) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.y != i) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.y = i;
    }

    @InterfaceC10697xN2
    public final void b0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.K != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.K = j;
    }

    @InterfaceC10697xN2
    public final void c(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.k != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.k = j;
    }

    @InterfaceC10697xN2
    public final long c0() {
        this.a.l().n();
        return this.s;
    }

    @InterfaceC10697xN2
    public final void d(@InterfaceC11300zs1 Boolean bool) {
        this.a.l().n();
        this.I |= !zzg.a(this.r, bool);
        this.r = bool;
    }

    @InterfaceC10697xN2
    public final void d0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.m != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.m = j;
    }

    @InterfaceC10697xN2
    public final void e(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !zzg.a(this.q, str);
        this.q = str;
    }

    @InterfaceC10697xN2
    public final long e0() {
        this.a.l().n();
        return this.K;
    }

    @InterfaceC10697xN2
    public final void f(@InterfaceC11300zs1 List<String> list) {
        ArrayList arrayList;
        this.a.l().n();
        if (!zzg.a(this.t, list)) {
            this.I = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.t = arrayList;
        }
    }

    @InterfaceC10697xN2
    public final void f0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.i != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.i = j;
    }

    @InterfaceC10697xN2
    public final void g(boolean z) {
        boolean z2;
        this.a.l().n();
        boolean z3 = this.I;
        if (this.p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z3 | z2;
        this.p = z;
    }

    @InterfaceC10697xN2
    public final long g0() {
        this.a.l().n();
        return this.m;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String h() {
        this.a.l().n();
        return this.j;
    }

    @InterfaceC10697xN2
    public final void h0(long j) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        this.a.l().n();
        boolean z3 = this.I;
        if (this.g != j) {
            z2 = true;
        }
        this.I = z3 | z2;
        this.g = j;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String i() {
        this.a.l().n();
        return this.f;
    }

    @InterfaceC10697xN2
    public final long i0() {
        this.a.l().n();
        return this.i;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String j() {
        this.a.l().n();
        return this.d;
    }

    @InterfaceC10697xN2
    public final void j0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.h != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.h = j;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String k() {
        this.a.l().n();
        return this.H;
    }

    @InterfaceC10697xN2
    public final long k0() {
        this.a.l().n();
        return this.g;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String l() {
        this.a.l().n();
        return this.e;
    }

    @InterfaceC10697xN2
    public final void l0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.x != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.x = j;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String m() {
        this.a.l().n();
        return this.u;
    }

    @InterfaceC10697xN2
    public final long m0() {
        this.a.l().n();
        return this.h;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final List<String> n() {
        this.a.l().n();
        return this.t;
    }

    @InterfaceC10697xN2
    public final void n0(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.w != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.w = j;
    }

    @InterfaceC10697xN2
    public final void o() {
        this.a.l().n();
        this.I = false;
    }

    @InterfaceC10697xN2
    public final long o0() {
        this.a.l().n();
        return this.x;
    }

    @InterfaceC10697xN2
    public final void p() {
        this.a.l().n();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.j().L().b("Bundle index overflow. appId", zzfr.v(this.b));
            j = 0;
        }
        this.I = true;
        this.g = j;
    }

    @InterfaceC10697xN2
    public final long p0() {
        this.a.l().n();
        return this.w;
    }

    @InterfaceC10697xN2
    public final boolean q() {
        this.a.l().n();
        return this.p;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final Boolean q0() {
        this.a.l().n();
        return this.r;
    }

    @InterfaceC10697xN2
    public final boolean r() {
        this.a.l().n();
        return this.f314o;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String r0() {
        this.a.l().n();
        return this.q;
    }

    @InterfaceC10697xN2
    public final boolean s() {
        this.a.l().n();
        return this.I;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String s0() {
        this.a.l().n();
        String str = this.H;
        P(null);
        return str;
    }

    @InterfaceC10697xN2
    public final boolean t() {
        this.a.l().n();
        return this.v;
    }

    @InterfaceC10697xN2
    public final String t0() {
        this.a.l().n();
        return this.b;
    }

    @InterfaceC10697xN2
    public final boolean u() {
        this.a.l().n();
        return this.z;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String u0() {
        this.a.l().n();
        return this.c;
    }

    @InterfaceC10697xN2
    public final long v() {
        this.a.l().n();
        return 0L;
    }

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    public final String v0() {
        this.a.l().n();
        return this.l;
    }

    @InterfaceC10697xN2
    public final void w(long j) {
        boolean z;
        this.a.l().n();
        boolean z2 = this.I;
        if (this.A != j) {
            z = true;
        } else {
            z = false;
        }
        this.I = z2 | z;
        this.A = j;
    }

    @InterfaceC10697xN2
    public final void x(@InterfaceC11300zs1 String str) {
        this.a.l().n();
        this.I |= !zzg.a(this.c, str);
        this.c = str;
    }

    @InterfaceC10697xN2
    public final void y(boolean z) {
        boolean z2;
        this.a.l().n();
        boolean z3 = this.I;
        if (this.f314o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.I = z3 | z2;
        this.f314o = z;
    }

    @InterfaceC10697xN2
    public final long z() {
        this.a.l().n();
        return this.k;
    }
}
