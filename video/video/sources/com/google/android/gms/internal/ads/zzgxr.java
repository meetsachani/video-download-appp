package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgxr implements zzhaq {
    public final zzgxq a;
    public int b;
    public int c;
    public int d = 0;

    public zzgxr(zzgxq zzgxqVar) {
        zzgzf.c(zzgxqVar, "input");
        this.a = zzgxqVar;
        zzgxqVar.c = this;
    }

    public static final void R(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw new zzgzh("Failed to parse the message.");
    }

    public static final void S(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw new zzgzh("Failed to parse the message.");
    }

    public static zzgxr T(zzgxq zzgxqVar) {
        zzgxr zzgxrVar = zzgxqVar.c;
        if (zzgxrVar != null) {
            return zzgxrVar;
        }
        return new zzgxr(zzgxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void A(Object obj, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        Q(2);
        O(obj, zzhawVar, zzgycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void B(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int r = zzgxqVar.r();
                    S(r);
                    int j = zzgxqVar.j() + r;
                    do {
                        zzgzsVar.t(zzgxqVar.s());
                    } while (zzgxqVar.j() < j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgzsVar.t(zzgxqVar2.s());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int r2 = zzgxqVar3.r();
                    S(r2);
                    int j2 = zzgxqVar3.j() + r2;
                    do {
                        list.add(Long.valueOf(zzgxqVar3.s()));
                    } while (zzgxqVar3.j() < j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Long.valueOf(zzgxqVar4.s()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void C(List list, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        int q;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                Object d = zzhawVar.d();
                O(d, zzhawVar, zzgycVar);
                zzhawVar.e(d);
                list.add(d);
                zzgxq zzgxqVar = this.a;
                if (!zzgxqVar.a() && this.d == 0) {
                    q = zzgxqVar.q();
                } else {
                    return;
                }
            } while (q == i);
            this.d = q;
            return;
        }
        throw new zzgzg("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void D(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgxa) {
            zzgxa zzgxaVar = (zzgxa) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgxaVar.f(zzgxqVar.b());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgxaVar.f(zzgxqVar2.b());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Boolean.valueOf(zzgxqVar3.b()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Boolean.valueOf(zzgxqVar4.b()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void E(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyj) {
            zzgyj zzgyjVar = (zzgyj) list;
            int i2 = this.b & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxq zzgxqVar = this.a;
                        zzgyjVar.h(zzgxqVar.i());
                        if (!zzgxqVar.a()) {
                            i = zzgxqVar.q();
                        } else {
                            return;
                        }
                    } while (i == this.b);
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar2 = this.a;
                int r = zzgxqVar2.r();
                R(r);
                int j = zzgxqVar2.j() + r;
                do {
                    zzgyjVar.h(zzgxqVar2.i());
                } while (zzgxqVar2.j() < j);
                return;
            }
        } else {
            int i3 = this.b & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        zzgxq zzgxqVar3 = this.a;
                        list.add(Float.valueOf(zzgxqVar3.i()));
                        if (!zzgxqVar3.a()) {
                            q = zzgxqVar3.q();
                        } else {
                            return;
                        }
                    } while (q == this.b);
                    i = q;
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar4 = this.a;
                int r2 = zzgxqVar4.r();
                R(r2);
                int j2 = zzgxqVar4.j() + r2;
                do {
                    list.add(Float.valueOf(zzgxqVar4.i()));
                } while (zzgxqVar4.j() < j2);
                return;
            }
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void F(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgzsVar.t(zzgxqVar.w());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgzsVar.t(zzgxqVar2.w());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Long.valueOf(zzgxqVar3.w()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Long.valueOf(zzgxqVar4.w()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    @Deprecated
    public final void G(List list, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        int q;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                Object d = zzhawVar.d();
                N(d, zzhawVar, zzgycVar);
                zzhawVar.e(d);
                list.add(d);
                zzgxq zzgxqVar = this.a;
                if (!zzgxqVar.a() && this.d == 0) {
                    q = zzgxqVar.q();
                } else {
                    return;
                }
            } while (q == i);
            this.d = q;
            return;
        }
        throw new zzgzg("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void H(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgzsVar.t(zzgxqVar.v());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgzsVar.t(zzgxqVar2.v());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Long.valueOf(zzgxqVar3.v()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Long.valueOf(zzgxqVar4.v()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void I(Object obj, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        Q(3);
        N(obj, zzhawVar, zzgycVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void J(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgytVar.N(zzgxqVar.p());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgytVar.N(zzgxqVar2.p());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Integer.valueOf(zzgxqVar3.p()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Integer.valueOf(zzgxqVar4.p()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void K(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgytVar.N(zzgxqVar.r());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgytVar.N(zzgxqVar2.r());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Integer.valueOf(zzgxqVar3.r()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Integer.valueOf(zzgxqVar4.r()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    public final void L(List list, boolean z) throws IOException {
        String x;
        int q;
        int i;
        if ((this.b & 7) == 2) {
            if ((list instanceof zzgzp) && !z) {
                zzgzp zzgzpVar = (zzgzp) list;
                do {
                    o();
                    zzgzpVar.b();
                    zzgxq zzgxqVar = this.a;
                    if (!zzgxqVar.a()) {
                        i = zzgxqVar.q();
                    } else {
                        return;
                    }
                } while (i == this.b);
            } else {
                do {
                    if (z) {
                        x = s();
                    } else {
                        x = x();
                    }
                    list.add(x);
                    zzgxq zzgxqVar2 = this.a;
                    if (zzgxqVar2.a()) {
                        return;
                    }
                    q = zzgxqVar2.q();
                } while (q == this.b);
                i = q;
            }
            this.d = i;
            return;
        }
        throw new zzgzg("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final boolean M() throws IOException {
        Q(0);
        return this.a.b();
    }

    public final void N(Object obj, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            zzhawVar.i(obj, this, zzgycVar);
            if (this.b == this.c) {
                return;
            }
            throw new zzgzh("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    public final void O(Object obj, zzhaw zzhawVar, zzgyc zzgycVar) throws IOException {
        zzgxq zzgxqVar = this.a;
        int r = zzgxqVar.r();
        if (zzgxqVar.a < zzgxqVar.b) {
            int k = zzgxqVar.k(r);
            zzgxqVar.a++;
            zzhawVar.i(obj, this, zzgycVar);
            zzgxqVar.A(0);
            zzgxqVar.a--;
            zzgxqVar.B(k);
            return;
        }
        throw new zzgzh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void P(int i) throws IOException {
        if (this.a.j() == i) {
            return;
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void Q(int i) throws IOException {
        if ((this.b & 7) == i) {
            return;
        }
        throw new zzgzg("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final double a() throws IOException {
        Q(1);
        return this.a.h();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final float b() throws IOException {
        Q(5);
        return this.a.i();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int c() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.q();
            this.b = i;
        }
        if (i != 0 && i != this.c) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int d() throws IOException {
        Q(0);
        return this.a.l();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int e() throws IOException {
        Q(5);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int f() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int g() throws IOException {
        Q(0);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int h() throws IOException {
        Q(5);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int i() throws IOException {
        Q(0);
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final int j() throws IOException {
        Q(0);
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final long k() throws IOException {
        Q(1);
        return this.a.s();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final long l() throws IOException {
        Q(0);
        return this.a.t();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final long m() throws IOException {
        Q(1);
        return this.a.u();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final long n() throws IOException {
        Q(0);
        return this.a.v();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final zzgxk o() throws IOException {
        Q(2);
        return this.a.x();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final long p() throws IOException {
        Q(0);
        return this.a.w();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void q(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgytVar.N(zzgxqVar.l());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgytVar.N(zzgxqVar2.l());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Integer.valueOf(zzgxqVar3.l()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Integer.valueOf(zzgxqVar4.l()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void r(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgzsVar.t(zzgxqVar.t());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgzsVar.t(zzgxqVar2.t());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Long.valueOf(zzgxqVar3.t()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Long.valueOf(zzgxqVar4.t()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final String s() throws IOException {
        Q(2);
        return this.a.z();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void t(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgxz) {
            zzgxz zzgxzVar = (zzgxz) list;
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int r = zzgxqVar.r();
                    S(r);
                    int j = zzgxqVar.j() + r;
                    do {
                        zzgxzVar.h(zzgxqVar.h());
                    } while (zzgxqVar.j() < j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgxzVar.h(zzgxqVar2.h());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int r2 = zzgxqVar3.r();
                    S(r2);
                    int j2 = zzgxqVar3.j() + r2;
                    do {
                        list.add(Double.valueOf(zzgxqVar3.h()));
                    } while (zzgxqVar3.j() < j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Double.valueOf(zzgxqVar4.h()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void u(List list) throws IOException {
        int q;
        if ((this.b & 7) == 2) {
            do {
                list.add(o());
                zzgxq zzgxqVar = this.a;
                if (zzgxqVar.a()) {
                    return;
                }
                q = zzgxqVar.q();
            } while (q == this.b);
            this.d = q;
            return;
        }
        throw new zzgzg("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void v(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int j = zzgxqVar.j() + zzgxqVar.r();
                    do {
                        zzgytVar.N(zzgxqVar.n());
                    } while (zzgxqVar.j() < j);
                    P(j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgytVar.N(zzgxqVar2.n());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int j2 = zzgxqVar3.j() + zzgxqVar3.r();
                    do {
                        list.add(Integer.valueOf(zzgxqVar3.n()));
                    } while (zzgxqVar3.j() < j2);
                    P(j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Integer.valueOf(zzgxqVar4.n()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void w(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgzs) {
            zzgzs zzgzsVar = (zzgzs) list;
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    zzgxq zzgxqVar = this.a;
                    int r = zzgxqVar.r();
                    S(r);
                    int j = zzgxqVar.j() + r;
                    do {
                        zzgzsVar.t(zzgxqVar.u());
                    } while (zzgxqVar.j() < j);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar2 = this.a;
                zzgzsVar.t(zzgxqVar2.u());
                if (!zzgxqVar2.a()) {
                    i = zzgxqVar2.q();
                } else {
                    return;
                }
            } while (i == this.b);
        } else {
            int i3 = this.b & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzgxq zzgxqVar3 = this.a;
                    int r2 = zzgxqVar3.r();
                    S(r2);
                    int j2 = zzgxqVar3.j() + r2;
                    do {
                        list.add(Long.valueOf(zzgxqVar3.u()));
                    } while (zzgxqVar3.j() < j2);
                    return;
                }
                throw new zzgzg("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxq zzgxqVar4 = this.a;
                list.add(Long.valueOf(zzgxqVar4.u()));
                if (!zzgxqVar4.a()) {
                    q = zzgxqVar4.q();
                } else {
                    return;
                }
            } while (q == this.b);
            i = q;
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final String x() throws IOException {
        Q(2);
        return this.a.y();
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void y(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxq zzgxqVar = this.a;
                        zzgytVar.N(zzgxqVar.o());
                        if (!zzgxqVar.a()) {
                            i = zzgxqVar.q();
                        } else {
                            return;
                        }
                    } while (i == this.b);
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar2 = this.a;
                int r = zzgxqVar2.r();
                R(r);
                int j = zzgxqVar2.j() + r;
                do {
                    zzgytVar.N(zzgxqVar2.o());
                } while (zzgxqVar2.j() < j);
                return;
            }
        } else {
            int i3 = this.b & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        zzgxq zzgxqVar3 = this.a;
                        list.add(Integer.valueOf(zzgxqVar3.o()));
                        if (!zzgxqVar3.a()) {
                            q = zzgxqVar3.q();
                        } else {
                            return;
                        }
                    } while (q == this.b);
                    i = q;
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar4 = this.a;
                int r2 = zzgxqVar4.r();
                R(r2);
                int j2 = zzgxqVar4.j() + r2;
                do {
                    list.add(Integer.valueOf(zzgxqVar4.o()));
                } while (zzgxqVar4.j() < j2);
                return;
            }
        }
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void z(List list) throws IOException {
        int q;
        int i;
        if (list instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) list;
            int i2 = this.b & 7;
            if (i2 != 2) {
                if (i2 == 5) {
                    do {
                        zzgxq zzgxqVar = this.a;
                        zzgytVar.N(zzgxqVar.m());
                        if (!zzgxqVar.a()) {
                            i = zzgxqVar.q();
                        } else {
                            return;
                        }
                    } while (i == this.b);
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar2 = this.a;
                int r = zzgxqVar2.r();
                R(r);
                int j = zzgxqVar2.j() + r;
                do {
                    zzgytVar.N(zzgxqVar2.m());
                } while (zzgxqVar2.j() < j);
                return;
            }
        } else {
            int i3 = this.b & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        zzgxq zzgxqVar3 = this.a;
                        list.add(Integer.valueOf(zzgxqVar3.m()));
                        if (!zzgxqVar3.a()) {
                            q = zzgxqVar3.q();
                        } else {
                            return;
                        }
                    } while (q == this.b);
                    i = q;
                } else {
                    throw new zzgzg("Protocol message tag had invalid wire type.");
                }
            } else {
                zzgxq zzgxqVar4 = this.a;
                int r2 = zzgxqVar4.r();
                R(r2);
                int j2 = zzgxqVar4.j() + r2;
                do {
                    list.add(Integer.valueOf(zzgxqVar4.m()));
                } while (zzgxqVar4.j() < j2);
                return;
            }
        }
        this.d = i;
    }
}
