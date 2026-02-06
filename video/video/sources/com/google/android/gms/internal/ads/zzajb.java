package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.AbstractC4501Vf;
import o.C10323vs;
import o.C3128Hd1;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzajb implements zzadn, zzaem {
    public long A;
    public int B;
    @InterfaceC11300zs1
    public zzahe C;
    public final zzakj a;
    public final int b;
    public final zzek c;
    public final zzek d;
    public final zzek e;
    public final zzek f;
    public final ArrayDeque g;
    public final zzajf h;
    public final List i;
    public zzfyc j;
    public int k;
    public int l;
    public long m;
    public int n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public zzek f205o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public long v;
    public zzadq w;
    public zzaja[] x;
    public long[][] y;
    public int z;

    @Deprecated
    public zzajb() {
        this(zzakj.a, 16);
    }

    public static int b(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static int d(zzajk zzajkVar, long j) {
        int a = zzajkVar.a(j);
        if (a == -1) {
            return zzajkVar.b(j);
        }
        return a;
    }

    public static long k(zzajk zzajkVar, long j, long j2) {
        int d = d(zzajkVar, j);
        if (d == -1) {
            return j2;
        }
        return Math.min(zzajkVar.c[d], j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        zzaja[] zzajaVarArr;
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                l();
                return;
            }
            this.h.b();
            this.i.clear();
            return;
        }
        for (zzaja zzajaVar : this.x) {
            zzajk zzajkVar = zzajaVar.b;
            int a = zzajkVar.a(j2);
            if (a == -1) {
                a = zzajkVar.b(j2);
            }
            zzajaVar.e = a;
            zzaeu zzaeuVar = zzajaVar.d;
            if (zzaeuVar != null) {
                zzaeuVar.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        boolean z;
        zzfyc F;
        if ((this.b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        zzaeq b = zzajg.b(zzadoVar, z);
        if (b != null) {
            F = zzfyc.G(b);
        } else {
            F = zzfyc.F();
        }
        this.j = F;
        if (b != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        if ((this.b & 16) == 0) {
            zzadqVar = new zzakm(zzadqVar, this.a);
        }
        this.w = zzadqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x044a, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        long j;
        long j2;
        zzaet zzaetVar;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.k;
            long j3 = 0;
            if (i4 == 0) {
                if (this.n == 0) {
                    zzek zzekVar = this.f;
                    if (!zzadoVar.E(zzekVar.n(), 0, 8, true)) {
                        if (this.B != 2 || (this.b & 2) == 0) {
                            return -1;
                        }
                        zzaet O = this.w.O(0, 4);
                        zzahe zzaheVar = this.C;
                        zzav zzavVar = zzaheVar == null ? null : new zzav(C10323vs.b, zzaheVar);
                        zzx zzxVar = new zzx();
                        zzxVar.w(zzavVar);
                        O.e(zzxVar.K());
                        this.w.N();
                        this.w.P(new zzael(C10323vs.b, 0L));
                        return -1;
                    }
                    this.n = 8;
                    zzekVar.l(0);
                    this.m = zzekVar.O();
                    this.l = zzekVar.A();
                }
                long j4 = this.m;
                if (j4 == 1) {
                    zzek zzekVar2 = this.f;
                    zzadoVar.I(zzekVar2.n(), 8, 8);
                    this.n += 8;
                    this.m = zzekVar2.Q();
                } else if (j4 == 0) {
                    long f = zzadoVar.f();
                    if (f == -1) {
                        zzez zzezVar = (zzez) this.g.peek();
                        f = zzezVar != null ? zzezVar.b : -1L;
                    }
                    if (f != -1) {
                        this.m = (f - zzadoVar.e()) + this.n;
                    }
                }
                long j5 = this.m;
                int i5 = this.n;
                if (j5 >= i5) {
                    int i6 = this.l;
                    if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473 || i6 == 1635284069) {
                        long e = zzadoVar.e();
                        long j6 = this.m;
                        long j7 = e + j6;
                        long j8 = this.n;
                        if (j6 != j8 && this.l == 1835365473) {
                            zzek zzekVar3 = this.e;
                            zzekVar3.i(8);
                            zzadoVar.J(zzekVar3.n(), 0, 8);
                            zzaip.g(zzekVar3);
                            zzadoVar.G(zzekVar3.w());
                            zzadoVar.j();
                        }
                        long j9 = j7 - j8;
                        this.g.push(new zzez(this.l, j9));
                        if (this.m == this.n) {
                            m(j9);
                        } else {
                            l();
                        }
                    } else if (i6 != 1835296868 && i6 != 1836476516 && i6 != 1751411826 && i6 != 1937011556 && i6 != 1937011827 && i6 != 1937011571 && i6 != 1668576371 && i6 != 1701606260 && i6 != 1937011555 && i6 != 1937011578 && i6 != 1937013298 && i6 != 1937007471 && i6 != 1668232756 && i6 != 1953196132 && i6 != 1718909296 && i6 != 1969517665 && i6 != 1801812339 && i6 != 1768715124) {
                        long e2 = zzadoVar.e();
                        long j10 = this.n;
                        long j11 = e2 - j10;
                        if (this.l == 1836086884) {
                            this.C = new zzahe(0L, j11, C10323vs.b, j11 + j10, this.m - j10);
                        }
                        this.f205o = null;
                        this.k = 1;
                    } else {
                        boolean z3 = false;
                        zzdc.f(z3);
                        zzdc.f(this.m <= 2147483647L);
                        zzek zzekVar4 = new zzek((int) this.m);
                        System.arraycopy(this.f.n(), 0, zzekVar4.n(), 0, 8);
                        this.f205o = zzekVar4;
                        this.k = 1;
                    }
                } else {
                    throw zzaz.c("Atom size less than header length (unsupported).");
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    this.h.a(zzadoVar, zzaejVar, this.i);
                    if (zzaejVar.a == 0) {
                        l();
                    }
                    return 1;
                }
                long e3 = zzadoVar.e();
                int i7 = this.p;
                if (i7 == -1) {
                    int i8 = -1;
                    int i9 = -1;
                    boolean z4 = true;
                    boolean z5 = true;
                    long j12 = Long.MAX_VALUE;
                    long j13 = Long.MAX_VALUE;
                    long j14 = Long.MAX_VALUE;
                    int i10 = 0;
                    j2 = 262144;
                    while (true) {
                        zzaja[] zzajaVarArr = this.x;
                        if (i10 >= zzajaVarArr.length) {
                            break;
                        }
                        zzaja zzajaVar = zzajaVarArr[i10];
                        int i11 = zzajaVar.e;
                        zzajk zzajkVar = zzajaVar.b;
                        long j15 = j3;
                        if (i11 != zzajkVar.b) {
                            long j16 = zzajkVar.c[i11];
                            long[][] jArr = this.y;
                            String str = zzeu.a;
                            long j17 = jArr[i10][i11];
                            long j18 = j16 - e3;
                            boolean z6 = j18 < j15 || j18 >= 262144;
                            if (z6) {
                                z = z5;
                            } else {
                                if (!z5) {
                                    z = false;
                                }
                                z5 = z6;
                                i9 = i10;
                                j13 = j17;
                                j14 = j18;
                                if (j17 < j12) {
                                    z4 = z6;
                                    i8 = i10;
                                    j12 = j17;
                                }
                            }
                            if (z6 != z || j18 >= j14) {
                                z5 = z;
                                if (j17 < j12) {
                                }
                            }
                            z5 = z6;
                            i9 = i10;
                            j13 = j17;
                            j14 = j18;
                            if (j17 < j12) {
                            }
                        }
                        i10++;
                        j3 = j15;
                    }
                    j = j3;
                    i7 = (j12 == Long.MAX_VALUE || !z4 || j13 < j12 + 10485760) ? i9 : i8;
                    this.p = i7;
                    if (i7 == -1) {
                        return -1;
                    }
                } else {
                    j = 0;
                    j2 = 262144;
                }
                zzaja zzajaVar2 = this.x[i7];
                zzaet zzaetVar2 = zzajaVar2.c;
                int i12 = zzajaVar2.e;
                zzajk zzajkVar2 = zzajaVar2.b;
                long j19 = zzajkVar2.c[i12] + this.v;
                int[] iArr = zzajkVar2.d;
                int i13 = iArr[i12];
                zzaeu zzaeuVar = zzajaVar2.d;
                zzaet zzaetVar3 = zzaetVar2;
                boolean z7 = 0;
                long j20 = (j19 - e3) + this.q;
                if (j20 >= j && j20 < j2) {
                    zzajh zzajhVar = zzajaVar2.a;
                    if (zzajhVar.h == 1) {
                        j20 += 8;
                        i13 -= 8;
                    }
                    int i14 = i13;
                    zzadoVar.G((int) j20);
                    zzz zzzVar = zzajhVar.g;
                    String str2 = zzzVar.f301o;
                    if (!Objects.equals(str2, "video/avc")) {
                        Objects.equals(str2, C4128Rj1.k);
                    }
                    this.t = true;
                    int i15 = zzajhVar.k;
                    if (i15 != 0) {
                        zzek zzekVar5 = this.d;
                        byte[] n = zzekVar5.n();
                        n[0] = 0;
                        n[1] = 0;
                        n[2] = 0;
                        int i16 = 4 - i15;
                        i14 += i16;
                        while (this.r < i14) {
                            int i17 = this.s;
                            if (i17 == 0) {
                                if (this.t || zzfs.b(zzzVar) + i15 > iArr[i12] - this.q) {
                                    i2 = i15;
                                    i3 = z7;
                                } else {
                                    i3 = zzfs.b(zzzVar);
                                    i2 = i15 + i3;
                                }
                                zzadoVar.I(n, i16, i2);
                                this.q += i2;
                                int i18 = z7;
                                zzekVar5.l(i18);
                                int A = zzekVar5.A();
                                if (A >= 0) {
                                    this.s = A - i3;
                                    zzek zzekVar6 = this.c;
                                    zzekVar6.l(i18);
                                    i = i15;
                                    zzaet zzaetVar4 = zzaetVar3;
                                    zzaetVar4.d(zzekVar6, 4);
                                    this.r += 4;
                                    if (i3 > 0) {
                                        zzaetVar4.d(zzekVar5, i3);
                                        this.r += i3;
                                        if (zzfs.j(n, 4, i3, zzzVar)) {
                                            this.t = true;
                                            zzaetVar3 = zzaetVar4;
                                            i15 = i;
                                            z7 = 0;
                                        }
                                    }
                                    zzaetVar3 = zzaetVar4;
                                } else {
                                    throw zzaz.a("Invalid NAL length", null);
                                }
                            } else {
                                i = i15;
                                int b = zzaetVar3.b(zzadoVar, i17, z7);
                                this.q += b;
                                this.r += b;
                                this.s -= b;
                            }
                            i15 = i;
                            z7 = 0;
                        }
                        zzaetVar = zzaetVar3;
                    } else {
                        zzaetVar = zzaetVar3;
                        if (C4128Rj1.T.equals(str2)) {
                            if (this.r == 0) {
                                zzek zzekVar7 = this.e;
                                zzacr.c(i14, zzekVar7);
                                zzaetVar.d(zzekVar7, 7);
                                this.r += 7;
                            }
                            i14 += 7;
                        } else if (zzaeuVar != null) {
                            zzaeuVar.d(zzadoVar);
                        }
                        while (true) {
                            int i19 = this.r;
                            if (i19 >= i14) {
                                break;
                            }
                            int b2 = zzaetVar.b(zzadoVar, i14 - i19, false);
                            this.q += b2;
                            this.r += b2;
                            this.s -= b2;
                        }
                    }
                    int i20 = i14;
                    long j21 = zzajkVar2.f[i12];
                    int i21 = zzajkVar2.g[i12];
                    if (!this.t) {
                        i21 |= 67108864;
                    }
                    int i22 = i21;
                    if (zzaeuVar != null) {
                        zzaet zzaetVar5 = zzaetVar;
                        zzaeuVar.c(zzaetVar5, j21, i22, i20, 0, null);
                        if (i12 + 1 == zzajkVar2.b) {
                            zzaeuVar.a(zzaetVar5, null);
                        }
                    } else {
                        zzaetVar.c(j21, i22, i20, 0, null);
                    }
                    zzajaVar2.e++;
                    this.p = -1;
                    this.q = 0;
                    this.r = 0;
                    this.s = 0;
                    this.t = false;
                    return 0;
                }
                zzaejVar.a = j19;
                return 1;
            } else {
                long j22 = this.m - this.n;
                long e4 = zzadoVar.e() + j22;
                zzek zzekVar8 = this.f205o;
                if (zzekVar8 != null) {
                    zzadoVar.I(zzekVar8.n(), this.n, (int) j22);
                    if (this.l == 1718909296) {
                        this.u = true;
                        zzekVar8.l(8);
                        int b3 = b(zzekVar8.A());
                        if (b3 == 0) {
                            zzekVar8.m(4);
                            while (true) {
                                if (zzekVar8.u() <= 0) {
                                    b3 = 0;
                                    break;
                                }
                                b3 = b(zzekVar8.A());
                                if (b3 != 0) {
                                    break;
                                }
                            }
                        }
                        this.B = b3;
                    } else {
                        ArrayDeque arrayDeque = this.g;
                        if (!arrayDeque.isEmpty()) {
                            ((zzez) arrayDeque.peek()).e(new zzfa(this.l, zzekVar8));
                        }
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.B = 1;
                    }
                    if (j22 < 262144) {
                        zzadoVar.G((int) j22);
                    } else {
                        zzaejVar.a = zzadoVar.e() + j22;
                        z2 = true;
                        m(e4);
                        if (z2 && this.k != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                m(e4);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }

    public final void l() {
        this.k = 0;
        this.n = 0;
    }

    public final void m(long j) throws zzaz {
        zzav zzavVar;
        boolean z;
        zzav zzavVar2;
        boolean z2;
        ArrayDeque arrayDeque;
        int i;
        List list;
        zzav zzavVar3;
        int i2;
        int i3;
        zzav zzavVar4;
        zzav[] zzavVarArr;
        zzav zzavVar5;
        zzav zzavVar6;
        ArrayList arrayList;
        int i4;
        while (true) {
            ArrayDeque arrayDeque2 = this.g;
            if (arrayDeque2.isEmpty() || ((zzez) arrayDeque2.peek()).b != j) {
                break;
            }
            zzez zzezVar = (zzez) arrayDeque2.pop();
            if (zzezVar.a == 1836019574) {
                zzez b = zzezVar.b(1835365473);
                new ArrayList();
                if (b != null) {
                    zzavVar = zzaip.b(b);
                } else {
                    zzavVar = null;
                }
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                if (this.B == 1) {
                    z = true;
                } else {
                    z = false;
                }
                zzaeb zzaebVar = new zzaeb();
                zzfa c = zzezVar.c(AbstractC4501Vf.e1);
                if (c != null) {
                    zzavVar2 = zzaip.c(c);
                    zzaebVar.b(zzavVar2);
                } else {
                    zzavVar2 = null;
                }
                zzfa c2 = zzezVar.c(AbstractC4501Vf.i0);
                c2.getClass();
                ArrayList arrayList3 = arrayList2;
                zzav zzavVar7 = new zzav(C10323vs.b, zzaip.d(c2.b));
                int i6 = this.b;
                if (1 != (i6 & 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                long j2 = -9223372036854775807L;
                zzav zzavVar8 = zzavVar2;
                zzav zzavVar9 = zzavVar7;
                List f = zzaip.f(zzezVar, zzaebVar, C10323vs.b, null, z2, z, new zzfur() { // from class: com.google.android.gms.internal.ads.zzaiz
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        return (zzajh) obj;
                    }
                });
                String a = zzaiy.a(f);
                int i7 = 0;
                long j3 = -9223372036854775807L;
                int i8 = -1;
                while (i7 < f.size()) {
                    zzajk zzajkVar = (zzajk) f.get(i7);
                    if (zzajkVar.b == 0) {
                        arrayDeque = arrayDeque2;
                        list = f;
                        i2 = i7;
                        zzavVar5 = zzavVar8;
                        zzavVar6 = zzavVar9;
                        i = i5;
                        arrayList = arrayList3;
                        zzavVar3 = zzavVar;
                    } else {
                        zzajh zzajhVar = zzajkVar.a;
                        arrayDeque = arrayDeque2;
                        zzadq zzadqVar = this.w;
                        i = i5 + 1;
                        list = f;
                        int i9 = zzajhVar.b;
                        zzaja zzajaVar = new zzaja(zzajhVar, zzajkVar, zzadqVar.O(i5, i9));
                        zzavVar3 = zzavVar;
                        long j4 = zzajhVar.e;
                        if (j4 == j2) {
                            j4 = zzajkVar.h;
                        }
                        i2 = i7;
                        zzaet zzaetVar = zzajaVar.c;
                        zzaetVar.f(j4);
                        j3 = Math.max(j3, j4);
                        zzz zzzVar = zzajhVar.g;
                        if (C4128Rj1.U.equals(zzzVar.f301o)) {
                            i3 = zzajkVar.e * 16;
                        } else {
                            i3 = zzajkVar.e + 30;
                        }
                        zzx b2 = zzzVar.b();
                        b2.t(i3);
                        if (i9 == 2) {
                            int i10 = zzzVar.f;
                            if ((i6 & 8) != 0) {
                                if (i8 == -1) {
                                    i4 = 1;
                                } else {
                                    i4 = 2;
                                }
                                i10 |= i4;
                            }
                            b2.C(i10);
                            i9 = 2;
                        }
                        if (i9 == 1 && zzaebVar.a()) {
                            b2.i(zzaebVar.a);
                            b2.j(zzaebVar.b);
                        }
                        zzav zzavVar10 = zzzVar.l;
                        List list2 = this.i;
                        if (list2.isEmpty()) {
                            zzavVar4 = null;
                        } else {
                            zzavVar4 = new zzav(list2);
                        }
                        zzav[] zzavVarArr2 = {zzavVar4, zzavVar8, zzavVar9};
                        if (zzavVar10 != null) {
                            zzavVarArr = zzavVarArr2;
                            zzavVar5 = zzavVar8;
                            zzavVar6 = zzavVar9;
                        } else {
                            zzavVarArr = zzavVarArr2;
                            zzavVar5 = zzavVar8;
                            zzavVar6 = zzavVar9;
                            zzavVar10 = new zzav(j2, new zzau[0]);
                        }
                        if (zzavVar3 != null) {
                            for (int i11 = 0; i11 < zzavVar3.a(); i11++) {
                                zzau b3 = zzavVar3.b(i11);
                                if (b3 instanceof zzex) {
                                    zzex zzexVar = (zzex) b3;
                                    if (zzexVar.a.equals(C3128Hd1.Z0)) {
                                        if (i9 == 2) {
                                            zzavVar10 = zzavVar10.c(zzexVar);
                                        }
                                    } else {
                                        zzavVar10 = zzavVar10.c(zzexVar);
                                    }
                                }
                            }
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zzavVar10 = zzavVar10.d(zzavVarArr[i12]);
                        }
                        if (zzavVar10.a() > 0) {
                            b2.w(zzavVar10);
                        }
                        b2.e(a);
                        zzaetVar.e(b2.K());
                        if (i9 == 2 && i8 == -1) {
                            i8 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzajaVar);
                    }
                    i7 = i2 + 1;
                    arrayList3 = arrayList;
                    zzavVar = zzavVar3;
                    arrayDeque2 = arrayDeque;
                    i5 = i;
                    f = list;
                    zzavVar8 = zzavVar5;
                    zzavVar9 = zzavVar6;
                    j2 = C10323vs.b;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.z = i8;
                this.A = j3;
                zzaja[] zzajaVarArr = (zzaja[]) arrayList3.toArray(new zzaja[0]);
                this.x = zzajaVarArr;
                int length = zzajaVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i13 = 0; i13 < zzajaVarArr.length; i13++) {
                    jArr[i13] = new long[zzajaVarArr[i13].b.b];
                    jArr2[i13] = zzajaVarArr[i13].b.f[0];
                }
                long j5 = 0;
                int i14 = 0;
                while (i14 < zzajaVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i15 = -1;
                    for (int i16 = 0; i16 < zzajaVarArr.length; i16++) {
                        if (!zArr[i16]) {
                            long j7 = jArr2[i16];
                            if (j7 <= j6) {
                                i15 = i16;
                                j6 = j7;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j5;
                    zzajk zzajkVar2 = zzajaVarArr[i15].b;
                    j5 += zzajkVar2.d[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = zzajkVar2.f[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.y = jArr;
                this.w.N();
                this.w.P(this);
                arrayDeque3.clear();
                this.k = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzez) arrayDeque2.peek()).d(zzezVar);
            }
        }
        if (this.k != 2) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        long j6 = j;
        zzaja[] zzajaVarArr = this.x;
        if (zzajaVarArr.length == 0) {
            zzaen zzaenVar = zzaen.c;
            return new zzaek(zzaenVar, zzaenVar);
        }
        int i = this.z;
        if (i != -1) {
            zzajk zzajkVar = zzajaVarArr[i].b;
            int d = d(zzajkVar, j6);
            if (d == -1) {
                zzaen zzaenVar2 = zzaen.c;
                return new zzaek(zzaenVar2, zzaenVar2);
            }
            long[] jArr = zzajkVar.f;
            long j7 = jArr[d];
            long[] jArr2 = zzajkVar.c;
            j2 = jArr2[d];
            if (j7 < j6 && d < zzajkVar.b - 1 && (b = zzajkVar.b(j6)) != -1 && b != d) {
                j5 = jArr[b];
                j4 = jArr2[b];
            } else {
                j5 = -9223372036854775807L;
                j4 = -1;
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            j4 = -1;
        }
        int i2 = 0;
        while (true) {
            zzaja[] zzajaVarArr2 = this.x;
            if (i2 >= zzajaVarArr2.length) {
                break;
            }
            if (i2 != this.z) {
                zzajk zzajkVar2 = zzajaVarArr2[i2].b;
                long k = k(zzajkVar2, j6, j2);
                if (j3 != C10323vs.b) {
                    j4 = k(zzajkVar2, j3, j4);
                }
                j2 = k;
            }
            i2++;
        }
        zzaen zzaenVar3 = new zzaen(j6, j2);
        if (j3 == C10323vs.b) {
            return new zzaek(zzaenVar3, zzaenVar3);
        }
        return new zzaek(zzaenVar3, new zzaen(j3, j4));
    }

    public zzajb(zzakj zzakjVar, int i) {
        this.a = zzakjVar;
        this.b = i;
        this.j = zzfyc.F();
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new zzajf();
        this.i = new ArrayList();
        this.f = new zzek(16);
        this.g = new ArrayDeque();
        this.c = new zzek(zzfs.a);
        this.d = new zzek(6);
        this.e = new zzek();
        this.p = -1;
        this.w = zzadq.h;
        this.x = new zzaja[0];
    }
}
