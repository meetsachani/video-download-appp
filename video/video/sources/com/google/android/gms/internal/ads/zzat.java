package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzat {
    public static final zzat B = new zzat(new zzar());
    public final zzfyc A;
    @InterfaceC11300zs1
    public final CharSequence a;
    @InterfaceC11300zs1
    public final CharSequence b;
    @InterfaceC11300zs1
    public final CharSequence c;
    @InterfaceC11300zs1
    public final CharSequence d;
    @InterfaceC11300zs1
    public final CharSequence e;
    @InterfaceC11300zs1
    public final byte[] f;
    @InterfaceC11300zs1
    public final Integer g;
    @InterfaceC11300zs1
    public final Integer h;
    @InterfaceC11300zs1
    public final Integer i;
    @InterfaceC11300zs1
    @Deprecated
    public final Integer j;
    @InterfaceC11300zs1
    public final Boolean k;
    @InterfaceC11300zs1
    @Deprecated
    public final Integer l;
    @InterfaceC11300zs1
    public final Integer m;
    @InterfaceC11300zs1
    public final Integer n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public final Integer f219o;
    @InterfaceC11300zs1
    public final Integer p;
    @InterfaceC11300zs1
    public final Integer q;
    @InterfaceC11300zs1
    public final Integer r;
    @InterfaceC11300zs1
    public final CharSequence s;
    @InterfaceC11300zs1
    public final CharSequence t;
    @InterfaceC11300zs1
    public final CharSequence u;
    @InterfaceC11300zs1
    public final Integer v;
    @InterfaceC11300zs1
    public final Integer w;
    @InterfaceC11300zs1
    public final CharSequence x;
    @InterfaceC11300zs1
    public final CharSequence y;
    @InterfaceC11300zs1
    public final Integer z;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
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
        Integer.toString(1000, 36);
    }

    public final zzar a() {
        return new zzar(this, null);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzat.class == obj.getClass()) {
            zzat zzatVar = (zzat) obj;
            if (Objects.equals(this.a, zzatVar.a) && Objects.equals(this.b, zzatVar.b) && Objects.equals(this.c, zzatVar.c) && Objects.equals(this.d, zzatVar.d) && Objects.equals(this.e, zzatVar.e) && Arrays.equals(this.f, zzatVar.f) && Objects.equals(this.g, zzatVar.g) && Objects.equals(this.h, zzatVar.h) && Objects.equals(this.i, zzatVar.i) && Objects.equals(this.j, zzatVar.j) && Objects.equals(this.k, zzatVar.k) && Objects.equals(this.m, zzatVar.m) && Objects.equals(this.n, zzatVar.n) && Objects.equals(this.f219o, zzatVar.f219o) && Objects.equals(this.p, zzatVar.p) && Objects.equals(this.q, zzatVar.q) && Objects.equals(this.r, zzatVar.r) && Objects.equals(this.s, zzatVar.s) && Objects.equals(this.t, zzatVar.t) && Objects.equals(this.u, zzatVar.u) && Objects.equals(this.v, zzatVar.v) && Objects.equals(this.w, zzatVar.w) && Objects.equals(this.x, zzatVar.x) && Objects.equals(this.y, zzatVar.y) && Objects.equals(this.z, zzatVar.z) && Objects.equals(this.A, zzatVar.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.f219o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, Boolean.TRUE, this.A);
    }

    public zzat(zzar zzarVar) {
        Boolean V = zzar.V(zzarVar);
        Integer l = zzar.l(zzarVar);
        Integer m = zzar.m(zzarVar);
        int i = 1;
        int i2 = 0;
        if (V != null) {
            if (!V.booleanValue()) {
                l = -1;
            } else if (l == null || l.intValue() == -1) {
                if (m != null) {
                    switch (m.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    l = Integer.valueOf(i);
                }
                i = 0;
                l = Integer.valueOf(i);
            }
        } else if (l != null) {
            boolean z = l.intValue() != -1;
            V = Boolean.valueOf(z);
            if (z && m == null) {
                switch (l.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                m = Integer.valueOf(i2);
            }
        } else {
            l = null;
        }
        this.a = zzar.h(zzarVar);
        this.b = zzar.b(zzarVar);
        this.c = zzar.a(zzarVar);
        this.d = zzar.W(zzarVar);
        this.e = zzar.e(zzarVar);
        this.f = zzar.w(zzarVar);
        this.g = zzar.j(zzarVar);
        this.h = zzar.v(zzarVar);
        this.i = zzar.u(zzarVar);
        this.j = l;
        this.k = V;
        this.l = zzar.p(zzarVar);
        this.m = zzar.p(zzarVar);
        this.n = zzar.o(zzarVar);
        this.f219o = zzar.n(zzarVar);
        this.p = zzar.s(zzarVar);
        this.q = zzar.r(zzarVar);
        this.r = zzar.q(zzarVar);
        this.s = zzar.i(zzarVar);
        this.t = zzar.c(zzarVar);
        this.u = zzar.d(zzarVar);
        this.v = zzar.k(zzarVar);
        this.w = zzar.t(zzarVar);
        this.x = zzar.f(zzarVar);
        this.y = zzar.g(zzarVar);
        this.z = m;
        this.A = zzar.U(zzarVar);
    }
}
