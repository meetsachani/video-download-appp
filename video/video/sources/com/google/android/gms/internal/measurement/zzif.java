package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzif implements zzlc {
    public final zzib a;
    public int b;
    public int c;
    public int d = 0;

    public zzif(zzib zzibVar) {
        zzib zzibVar2 = (zzib) zziz.f(zzibVar, "input");
        this.a = zzibVar2;
        zzibVar2.d = this;
    }

    public static zzif O(zzib zzibVar) {
        zzif zzifVar = zzibVar.d;
        if (zzifVar != null) {
            return zzifVar;
        }
        return new zzif(zzibVar);
    }

    public static void V(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw zzji.g();
    }

    public static void X(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw zzji.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlc
    @Deprecated
    public final <T> void A(List<T> list, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        int p;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(P(zzlbVar, zzikVar));
                if (!this.a.A() && this.d == 0) {
                    p = this.a.p();
                } else {
                    return;
                }
            } while (p == i);
            this.d = p;
            return;
        }
        throw zzji.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void A0(List<Long> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int q = this.a.q();
                    X(q);
                    int g = this.a.g() + q;
                    do {
                        zzjyVar.e(this.a.r());
                    } while (this.a.g() < g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjyVar.e(this.a.r());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int q2 = this.a.q();
                X(q2);
                int g2 = this.a.g() + q2;
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.g() < g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Long.valueOf(this.a.r()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final <T> void B(T t, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        U(2);
        Y(t, zzlbVar, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void C(List<Double> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzii) {
            zzii zziiVar = (zzii) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int q = this.a.q();
                    X(q);
                    int g = this.a.g() + q;
                    do {
                        zziiVar.e(this.a.a());
                    } while (this.a.g() < g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zziiVar.e(this.a.a());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int q2 = this.a.q();
                X(q2);
                int g2 = this.a.g() + q2;
                do {
                    list.add(Double.valueOf(this.a.a()));
                } while (this.a.g() < g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Double.valueOf(this.a.a()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final <T> void D(T t, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        U(3);
        W(t, zzlbVar, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void E(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzjaVar.h(this.a.k());
                        if (!this.a.A()) {
                            p2 = this.a.p();
                        } else {
                            return;
                        }
                    } while (p2 == this.b);
                    this.d = p2;
                    return;
                }
                throw zzji.a();
            }
            int q = this.a.q();
            V(q);
            int g = this.a.g() + q;
            do {
                zzjaVar.h(this.a.k());
            } while (this.a.g() < g);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.k()));
                    if (!this.a.A()) {
                        p = this.a.p();
                    } else {
                        return;
                    }
                } while (p == this.b);
                this.d = p;
                return;
            }
            throw zzji.a();
        }
        int q2 = this.a.q();
        V(q2);
        int g2 = this.a.g() + q2;
        do {
            list.add(Integer.valueOf(this.a.k()));
        } while (this.a.g() < g2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void F(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjaVar.h(this.a.i());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjaVar.h(this.a.i());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.i()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Integer.valueOf(this.a.i()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void G(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjaVar.h(this.a.q());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjaVar.h(this.a.q());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Integer.valueOf(this.a.q()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void H(List<String> list) throws IOException {
        S(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void I(List<Boolean> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzhk) {
            zzhk zzhkVar = (zzhk) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzhkVar.e(this.a.B());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzhkVar.e(this.a.B());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Boolean.valueOf(this.a.B()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Boolean.valueOf(this.a.B()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void J(List<Long> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjyVar.e(this.a.w());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjyVar.e(this.a.w());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Long.valueOf(this.a.w()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void K(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjaVar.h(this.a.o());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjaVar.h(this.a.o());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Integer.valueOf(this.a.o()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void K0(List<zzhm> list) throws IOException {
        int p;
        if ((this.b & 7) == 2) {
            do {
                list.add(o());
                if (this.a.A()) {
                    return;
                }
                p = this.a.p();
            } while (p == this.b);
            this.d = p;
            return;
        }
        throw zzji.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void L(List<Long> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int q = this.a.q();
                    X(q);
                    int g = this.a.g() + q;
                    do {
                        zzjyVar.e(this.a.u());
                    } while (this.a.g() < g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjyVar.e(this.a.u());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int q2 = this.a.q();
                X(q2);
                int g2 = this.a.g() + q2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.g() < g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Long.valueOf(this.a.u()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void M(List<String> list) throws IOException {
        S(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void N(List<Long> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjyVar.e(this.a.v());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjyVar.e(this.a.v());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Long.valueOf(this.a.v()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    public final <T> T P(zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        T a = zzlbVar.a();
        W(a, zzlbVar, zzikVar);
        zzlbVar.f(a);
        return a;
    }

    public final Object Q(zzmn zzmnVar, Class<?> cls, zzik zzikVar) throws IOException {
        switch (zzie.a[zzmnVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(s());
            case 2:
                return o();
            case 3:
                return Double.valueOf(a());
            case 4:
                return Integer.valueOf(d());
            case 5:
                return Integer.valueOf(e());
            case 6:
                return Long.valueOf(k());
            case 7:
                return Float.valueOf(b());
            case 8:
                return Integer.valueOf(g());
            case 9:
                return Long.valueOf(l());
            case 10:
                U(2);
                return T(zzkx.a().b(cls), zzikVar);
            case 11:
                return Integer.valueOf(h());
            case 12:
                return Long.valueOf(m());
            case 13:
                return Integer.valueOf(i());
            case 14:
                return Long.valueOf(n());
            case 15:
                return x();
            case 16:
                return Integer.valueOf(j());
            case 17:
                return Long.valueOf(p());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void R(int i) throws IOException {
        if (this.a.g() == i) {
            return;
        }
        throw zzji.h();
    }

    public final void S(List<String> list, boolean z) throws IOException {
        String r;
        int p;
        int p2;
        if ((this.b & 7) == 2) {
            if ((list instanceof zzjp) && !z) {
                zzjp zzjpVar = (zzjp) list;
                do {
                    zzjpVar.n4(o());
                    if (!this.a.A()) {
                        p2 = this.a.p();
                    } else {
                        return;
                    }
                } while (p2 == this.b);
                this.d = p2;
                return;
            }
            do {
                if (z) {
                    r = x();
                } else {
                    r = r();
                }
                list.add(r);
                if (this.a.A()) {
                    return;
                }
                p = this.a.p();
            } while (p == this.b);
            this.d = p;
            return;
        }
        throw zzji.a();
    }

    public final <T> T T(zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        T a = zzlbVar.a();
        Y(a, zzlbVar, zzikVar);
        zzlbVar.f(a);
        return a;
    }

    public final void U(int i) throws IOException {
        if ((this.b & 7) == i) {
            return;
        }
        throw zzji.a();
    }

    public final <T> void W(T t, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            zzlbVar.e(t, this, zzikVar);
            if (this.b == this.c) {
                return;
            }
            throw zzji.g();
        } finally {
            this.c = i;
        }
    }

    public final <T> void Y(T t, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        zzib zzibVar;
        int q = this.a.q();
        zzib zzibVar2 = this.a;
        if (zzibVar2.a < zzibVar2.b) {
            int b = zzibVar2.b(q);
            this.a.a++;
            zzlbVar.e(t, this, zzikVar);
            this.a.f(0);
            zzibVar.a--;
            this.a.h(b);
            return;
        }
        throw new zzji("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final double a() throws IOException {
        U(1);
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final float b() throws IOException {
        U(5);
        return this.a.e();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int c() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.p();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i2 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int d() throws IOException {
        U(0);
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int e() throws IOException {
        U(5);
        return this.a.k();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int f() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int g() throws IOException {
        U(0);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int h() throws IOException {
        U(5);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int i() throws IOException {
        U(0);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final int j() throws IOException {
        U(0);
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final long k() throws IOException {
        U(1);
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final long l() throws IOException {
        U(0);
        return this.a.s();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final long m() throws IOException {
        U(1);
        return this.a.u();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final long n() throws IOException {
        U(0);
        return this.a.v();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final zzhm o() throws IOException {
        U(2);
        return this.a.x();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final long p() throws IOException {
        U(0);
        return this.a.w();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void q(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjaVar.h(this.a.m());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjaVar.h(this.a.m());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Integer.valueOf(this.a.m()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final String r() throws IOException {
        U(2);
        return this.a.y();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final boolean s() throws IOException {
        U(0);
        return this.a.B();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void t(List<Float> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zziw) {
            zziw zziwVar = (zziw) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zziwVar.e(this.a.e());
                        if (!this.a.A()) {
                            p2 = this.a.p();
                        } else {
                            return;
                        }
                    } while (p2 == this.b);
                    this.d = p2;
                    return;
                }
                throw zzji.a();
            }
            int q = this.a.q();
            V(q);
            int g = this.a.g() + q;
            do {
                zziwVar.e(this.a.e());
            } while (this.a.g() < g);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.e()));
                    if (!this.a.A()) {
                        p = this.a.p();
                    } else {
                        return;
                    }
                } while (p == this.b);
                this.d = p;
                return;
            }
            throw zzji.a();
        }
        int q2 = this.a.q();
        V(q2);
        int g2 = this.a.g() + q2;
        do {
            list.add(Float.valueOf(this.a.e()));
        } while (this.a.g() < g2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlc
    public final <T> void u(List<T> list, zzlb<T> zzlbVar, zzik zzikVar) throws IOException {
        int p;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(T(zzlbVar, zzikVar));
                if (!this.a.A() && this.d == 0) {
                    p = this.a.p();
                } else {
                    return;
                }
            } while (p == i);
            this.d = p;
            return;
        }
        throw zzji.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final boolean v() throws IOException {
        int i;
        if (!this.a.A() && (i = this.b) != this.c) {
            return this.a.j(i);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        r7.a.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void w(Map<K, V> map, zzke<K, V> zzkeVar, zzik zzikVar) throws IOException {
        U(2);
        int b = this.a.b(this.a.q());
        Object obj = zzkeVar.b;
        Object obj2 = zzkeVar.d;
        while (true) {
            try {
                int c = c();
                if (c == Integer.MAX_VALUE || this.a.A()) {
                    break;
                } else if (c != 1) {
                    if (c != 2) {
                        try {
                            if (!v()) {
                                throw new zzji("Unable to parse map entry.");
                                break;
                            }
                        } catch (zzjh unused) {
                            if (!v()) {
                                throw new zzji("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = Q(zzkeVar.c, zzkeVar.d.getClass(), zzikVar);
                    }
                } else {
                    obj = Q(zzkeVar.a, null, null);
                }
            } catch (Throwable th) {
                this.a.h(b);
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final String x() throws IOException {
        U(2);
        return this.a.z();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void y(List<Integer> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i = this.b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzjaVar.h(this.a.n());
                        if (!this.a.A()) {
                            p2 = this.a.p();
                        } else {
                            return;
                        }
                    } while (p2 == this.b);
                    this.d = p2;
                    return;
                }
                throw zzji.a();
            }
            int q = this.a.q();
            V(q);
            int g = this.a.g() + q;
            do {
                zzjaVar.h(this.a.n());
            } while (this.a.g() < g);
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.A()) {
                        p = this.a.p();
                    } else {
                        return;
                    }
                } while (p == this.b);
                this.d = p;
                return;
            }
            throw zzji.a();
        }
        int q2 = this.a.q();
        V(q2);
        int g2 = this.a.g() + q2;
        do {
            list.add(Integer.valueOf(this.a.n()));
        } while (this.a.g() < g2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final void z(List<Long> list) throws IOException {
        int p;
        int p2;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int g = this.a.g() + this.a.q();
                    do {
                        zzjyVar.e(this.a.s());
                    } while (this.a.g() < g);
                    R(g);
                    return;
                }
                throw zzji.a();
            }
            do {
                zzjyVar.e(this.a.s());
                if (!this.a.A()) {
                    p2 = this.a.p();
                } else {
                    return;
                }
            } while (p2 == this.b);
            this.d = p2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int g2 = this.a.g() + this.a.q();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.g() < g2);
                R(g2);
                return;
            }
            throw zzji.a();
        }
        do {
            list.add(Long.valueOf(this.a.s()));
            if (this.a.A()) {
                return;
            }
            p = this.a.p();
        } while (p == this.b);
        this.d = p;
    }
}
