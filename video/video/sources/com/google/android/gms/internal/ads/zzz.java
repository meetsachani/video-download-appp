package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzz {
    public static final /* synthetic */ int N = 0;
    @InterfaceC11300zs1
    public final byte[] A;
    public final int B;
    @InterfaceC11300zs1
    public final zzk C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    public final List c;
    @InterfaceC11300zs1
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    @InterfaceC11300zs1
    public final String k;
    @InterfaceC11300zs1
    public final zzav l;
    @InterfaceC11300zs1
    public final Object m;
    @InterfaceC11300zs1
    public final String n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public final String f301o;
    public final int p;
    public final int q;
    public final List r;
    @InterfaceC11300zs1
    public final zzs s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final float x;
    public final int y;
    public final float z;

    static {
        new zzz(new zzx());
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
    }

    public final int a() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzx b() {
        return new zzx(this, null);
    }

    public final zzz c(int i) {
        zzx zzxVar = new zzx(this, null);
        zzxVar.f(i);
        return new zzz(zzxVar);
    }

    public final boolean d(zzz zzzVar) {
        List list = this.r;
        int size = list.size();
        List list2 = zzzVar.r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzz.class == obj.getClass()) {
            zzz zzzVar = (zzz) obj;
            int i2 = this.M;
            if ((i2 == 0 || (i = zzzVar.M) == 0 || i2 == i) && this.e == zzzVar.e && this.f == zzzVar.f && this.g == zzzVar.g && this.h == zzzVar.h && this.i == zzzVar.i && this.p == zzzVar.p && this.t == zzzVar.t && this.v == zzzVar.v && this.w == zzzVar.w && this.y == zzzVar.y && this.B == zzzVar.B && this.D == zzzVar.D && this.E == zzzVar.E && this.F == zzzVar.F && this.G == zzzVar.G && this.H == zzzVar.H && this.I == zzzVar.I && this.J == zzzVar.J && this.L == zzzVar.L && Float.compare(this.x, zzzVar.x) == 0 && Float.compare(this.z, zzzVar.z) == 0 && Objects.equals(this.a, zzzVar.a) && Objects.equals(this.b, zzzVar.b) && this.c.equals(zzzVar.c) && Objects.equals(this.k, zzzVar.k) && Objects.equals(this.n, zzzVar.n) && Objects.equals(this.f301o, zzzVar.f301o) && Objects.equals(this.d, zzzVar.d) && Arrays.equals(this.A, zzzVar.A) && Objects.equals(this.l, zzzVar.l) && Objects.equals(this.C, zzzVar.C) && Objects.equals(this.s, zzzVar.s) && d(zzzVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.M;
        if (i == 0) {
            String str = this.a;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = ((((hashCode + 527) * 31) + hashCode2) * 31) + this.c.hashCode();
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = ((((((((((((hashCode7 * 31) + hashCode3) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            zzav zzavVar = this.l;
            if (zzavVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = zzavVar.hashCode();
            }
            int i5 = i4 + hashCode5;
            String str5 = this.n;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = ((i5 * 961) + hashCode6) * 31;
            String str6 = this.f301o;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((((((((((((((i6 + i2) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + Float.floatToIntBits(this.x)) * 31) + this.y) * 31) + Float.floatToIntBits(this.z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
            this.M = floatToIntBits;
            return floatToIntBits;
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.C);
        return "Format(" + this.a + C6566gU0.h + this.b + C6566gU0.h + this.n + C6566gU0.h + this.f301o + C6566gU0.h + this.k + C6566gU0.h + this.j + C6566gU0.h + this.d + ", [" + this.v + C6566gU0.h + this.w + C6566gU0.h + this.x + C6566gU0.h + valueOf + "], [" + this.E + C6566gU0.h + this.F + "])";
    }

    public zzz(zzx zzxVar) {
        boolean z;
        String str;
        this.a = zzx.O(zzxVar);
        String e = zzeu.e(zzx.Q(zzxVar));
        this.d = e;
        if (zzx.T(zzxVar).isEmpty() && zzx.P(zzxVar) != null) {
            this.c = zzfyc.G(new zzab(e, zzx.P(zzxVar)));
            this.b = zzx.P(zzxVar);
        } else if (!zzx.T(zzxVar).isEmpty() && zzx.P(zzxVar) == null) {
            this.c = zzx.T(zzxVar);
            List T = zzx.T(zzxVar);
            Iterator it = T.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzab zzabVar = (zzab) it.next();
                    if (TextUtils.equals(zzabVar.a, e)) {
                        str = zzabVar.b;
                        break;
                    }
                } else {
                    str = ((zzab) T.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!zzx.T(zzxVar).isEmpty() || zzx.P(zzxVar) != null) {
                for (int i = 0; i < zzx.T(zzxVar).size(); i++) {
                    if (!((zzab) zzx.T(zzxVar).get(i)).b.equals(zzx.P(zzxVar))) {
                    }
                }
                z = false;
                zzdc.f(z);
                this.c = zzx.T(zzxVar);
                this.b = zzx.P(zzxVar);
            }
            z = true;
            zzdc.f(z);
            this.c = zzx.T(zzxVar);
            this.b = zzx.P(zzxVar);
        }
        this.e = zzx.o0(zzxVar);
        zzdc.g(zzx.Y(zzxVar) == 0 || (zzx.l0(zzxVar) & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = zzx.l0(zzxVar);
        this.g = zzx.Y(zzxVar);
        int Z = zzx.Z(zzxVar);
        this.h = Z;
        int k0 = zzx.k0(zzxVar);
        this.i = k0;
        this.j = k0 != -1 ? k0 : Z;
        this.k = zzx.M(zzxVar);
        this.l = zzx.L(zzxVar);
        this.m = null;
        this.n = zzx.N(zzxVar);
        this.f301o = zzx.R(zzxVar);
        this.p = zzx.g0(zzxVar);
        this.q = zzx.h0(zzxVar);
        this.r = zzx.S(zzxVar) == null ? Collections.EMPTY_LIST : zzx.S(zzxVar);
        zzs t0 = zzx.t0(zzxVar);
        this.s = t0;
        this.t = zzx.r0(zzxVar);
        this.u = zzx.U(zzxVar);
        this.v = zzx.q0(zzxVar);
        this.w = zzx.f0(zzxVar);
        this.x = zzx.A(zzxVar);
        this.y = zzx.m0(zzxVar) == -1 ? 0 : zzx.m0(zzxVar);
        this.z = zzx.W(zzxVar) == -1.0f ? 1.0f : zzx.W(zzxVar);
        this.A = zzx.V(zzxVar);
        this.B = zzx.p0(zzxVar);
        this.C = zzx.s0(zzxVar);
        this.D = zzx.i0(zzxVar);
        this.E = zzx.a0(zzxVar);
        this.F = zzx.n0(zzxVar);
        this.G = zzx.j0(zzxVar);
        this.H = zzx.d0(zzxVar) == -1 ? 0 : zzx.d0(zzxVar);
        this.I = zzx.e0(zzxVar) != -1 ? zzx.e0(zzxVar) : 0;
        this.J = zzx.X(zzxVar);
        this.K = zzx.c0(zzxVar);
        if (zzx.b0(zzxVar) != 0 || t0 == null) {
            this.L = zzx.b0(zzxVar);
        } else {
            this.L = 1;
        }
    }
}
