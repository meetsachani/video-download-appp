package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.C10323vs;
import o.C4126Rj;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaff implements zzadn {
    public final zzek a;
    public final zzafd b;
    public final boolean c;
    public final zzakj d;
    public int e;
    public zzadq f;
    public zzafg g;
    public long h;
    public zzafi[] i;
    public long j;
    @InterfaceC11300zs1
    public zzafi k;
    public int l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public int f199o;
    public boolean p;

    @Deprecated
    public zzaff() {
        this(1, zzakj.a);
    }

    @InterfaceC11300zs1
    public final zzafi b(int i) {
        zzafi[] zzafiVarArr;
        for (zzafi zzafiVar : this.i) {
            if (zzafiVar.f(i)) {
                return zzafiVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.j = -1L;
        this.k = null;
        int i = 0;
        for (zzafi zzafiVar : this.i) {
            zzafiVar.e(j);
        }
        if (j == 0) {
            if (this.i.length != 0) {
                i = 3;
            }
            this.e = i;
            return;
        }
        this.e = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzek zzekVar = this.a;
        zzadoVar.J(zzekVar.n(), 0, 12);
        zzekVar.l(0);
        if (zzekVar.C() != 1179011410) {
            return false;
        }
        zzekVar.m(4);
        if (zzekVar.C() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.e = 0;
        if (this.c) {
            zzadqVar = new zzakm(zzadqVar, this.d);
        }
        this.f = zzadqVar;
        this.j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        boolean z;
        int i;
        long j;
        boolean z2;
        long j2 = this.j;
        if (j2 != -1) {
            long e = zzadoVar.e();
            if (j2 >= e && j2 <= 262144 + e) {
                zzadoVar.G((int) (j2 - e));
            } else {
                zzaejVar.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i2 = this.e;
                int i3 = 12;
                zzafi zzafiVar = null;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (zzadoVar.e() >= this.n) {
                                            return -1;
                                        }
                                        zzafi zzafiVar2 = this.k;
                                        if (zzafiVar2 != null) {
                                            if (!zzafiVar2.g(zzadoVar)) {
                                                return 0;
                                            }
                                            this.k = null;
                                            return 0;
                                        }
                                        if ((zzadoVar.e() & 1) == 1) {
                                            zzadoVar.G(1);
                                        }
                                        zzek zzekVar = this.a;
                                        zzadoVar.J(zzekVar.n(), 0, 12);
                                        zzekVar.l(0);
                                        int C = zzekVar.C();
                                        if (C == 1414744396) {
                                            zzekVar.l(8);
                                            if (zzekVar.C() != 1769369453) {
                                                i3 = 8;
                                            }
                                            zzadoVar.G(i3);
                                            zzadoVar.j();
                                            return 0;
                                        }
                                        int C2 = zzekVar.C();
                                        if (C == 1263424842) {
                                            this.j = zzadoVar.e() + C2 + 8;
                                            return 0;
                                        }
                                        zzadoVar.G(8);
                                        zzadoVar.j();
                                        zzafi b = b(C);
                                        if (b == null) {
                                            this.j = zzadoVar.e() + C2;
                                            return 0;
                                        }
                                        b.d(C2);
                                        this.k = b;
                                        return 0;
                                    }
                                    zzek zzekVar2 = new zzek(this.f199o);
                                    zzadoVar.I(zzekVar2.n(), 0, this.f199o);
                                    if (zzekVar2.u() < 16) {
                                        i = 0;
                                        j = 0;
                                    } else {
                                        int w = zzekVar2.w();
                                        zzekVar2.m(8);
                                        i = 0;
                                        long j3 = this.m;
                                        if (zzekVar2.C() > j3) {
                                            j = 0;
                                        } else {
                                            j = j3 + 8;
                                        }
                                        zzekVar2.l(w);
                                    }
                                    while (zzekVar2.u() >= 16) {
                                        int C3 = zzekVar2.C();
                                        int C4 = zzekVar2.C();
                                        long C5 = zzekVar2.C() + j;
                                        zzekVar2.m(4);
                                        zzafi b2 = b(C3);
                                        if (b2 != null) {
                                            if ((C4 & 16) == 16) {
                                                z2 = true;
                                            } else {
                                                z2 = i;
                                            }
                                            b2.b(C5, z2);
                                        }
                                    }
                                    zzafi[] zzafiVarArr = this.i;
                                    int length = zzafiVarArr.length;
                                    for (int i4 = i; i4 < length; i4++) {
                                        zzafiVarArr[i4].c();
                                    }
                                    this.p = true;
                                    if (this.i.length == 0) {
                                        this.f.P(new zzael(this.h, 0L));
                                    } else {
                                        this.f.P(new zzafc(this, this.h));
                                    }
                                    this.e = 6;
                                    this.j = this.m;
                                    return i;
                                }
                                zzek zzekVar3 = this.a;
                                zzadoVar.I(zzekVar3.n(), 0, 8);
                                zzekVar3.l(0);
                                int C6 = zzekVar3.C();
                                int C7 = zzekVar3.C();
                                if (C6 == 829973609) {
                                    this.e = 5;
                                    this.f199o = C7;
                                    return 0;
                                }
                                this.j = zzadoVar.e() + C7;
                                return 0;
                            }
                            long j4 = this.m;
                            if (j4 != -1 && zzadoVar.e() != j4) {
                                this.j = j4;
                                return 0;
                            }
                            zzek zzekVar4 = this.a;
                            zzadoVar.J(zzekVar4.n(), 0, 12);
                            zzadoVar.j();
                            zzekVar4.l(0);
                            zzafd zzafdVar = this.b;
                            zzafdVar.a(zzekVar4);
                            int C8 = zzekVar4.C();
                            int i5 = zzafdVar.a;
                            if (i5 == 1179011410) {
                                zzadoVar.G(12);
                                return 0;
                            } else if (i5 == 1414744396 && C8 == 1769369453) {
                                long e2 = zzadoVar.e();
                                this.m = e2;
                                long j5 = e2 + zzafdVar.b + 8;
                                this.n = j5;
                                if (!this.p) {
                                    zzafg zzafgVar = this.g;
                                    zzafgVar.getClass();
                                    if ((zzafgVar.b & 16) != 16) {
                                        this.f.P(new zzael(this.h, 0L));
                                        this.p = true;
                                    } else {
                                        this.e = 4;
                                        this.j = j5;
                                        return 0;
                                    }
                                }
                                this.j = zzadoVar.e() + 12;
                                this.e = 6;
                                return 0;
                            } else {
                                this.j = zzadoVar.e() + zzafdVar.b + 8;
                                return 0;
                            }
                        }
                        int i6 = this.l - 4;
                        zzek zzekVar5 = new zzek(i6);
                        zzadoVar.I(zzekVar5.n(), 0, i6);
                        zzafj c = zzafj.c(C4126Rj.w, zzekVar5);
                        if (c.a() == 1819436136) {
                            zzafg zzafgVar2 = (zzafg) c.b(zzafg.class);
                            if (zzafgVar2 != null) {
                                this.g = zzafgVar2;
                                this.h = zzafgVar2.c * zzafgVar2.a;
                                ArrayList arrayList = new ArrayList();
                                zzfyc zzfycVar = c.a;
                                int size = zzfycVar.size();
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < size) {
                                    zzafb zzafbVar = (zzafb) zzfycVar.get(i7);
                                    if (zzafbVar.a() == 1819440243) {
                                        zzafj zzafjVar = (zzafj) zzafbVar;
                                        int i9 = i8 + 1;
                                        zzafh zzafhVar = (zzafh) zzafjVar.b(zzafh.class);
                                        zzafk zzafkVar = (zzafk) zzafjVar.b(zzafk.class);
                                        if (zzafhVar == null) {
                                            zzdx.f(C4126Rj.r, "Missing Stream Header");
                                        } else if (zzafkVar == null) {
                                            zzdx.f(C4126Rj.r, "Missing Stream Format");
                                        } else {
                                            long c2 = zzafhVar.c();
                                            zzz zzzVar = zzafkVar.a;
                                            zzx b3 = zzzVar.b();
                                            b3.n(i8);
                                            int i10 = zzafhVar.e;
                                            if (i10 != 0) {
                                                b3.t(i10);
                                            }
                                            zzafl zzaflVar = (zzafl) zzafjVar.b(zzafl.class);
                                            if (zzaflVar != null) {
                                                b3.q(zzaflVar.a);
                                            }
                                            int b4 = zzay.b(zzzVar.f301o);
                                            if (b4 != 1) {
                                                if (b4 == 2) {
                                                    b4 = 2;
                                                } else {
                                                    zzafiVar = null;
                                                }
                                            }
                                            zzaet O = this.f.O(i8, b4);
                                            O.e(b3.K());
                                            O.f(c2);
                                            this.h = Math.max(this.h, c2);
                                            zzafiVar = new zzafi(i8, zzafhVar, O);
                                        }
                                        if (zzafiVar != null) {
                                            arrayList.add(zzafiVar);
                                        }
                                        i8 = i9;
                                    }
                                    i7++;
                                    zzafiVar = null;
                                }
                                this.i = (zzafi[]) arrayList.toArray(new zzafi[0]);
                                this.f.N();
                                this.e = 3;
                                return 0;
                            }
                            throw zzaz.a("AviHeader not found", null);
                        }
                        throw zzaz.a("Unexpected header list type " + c.a(), null);
                    }
                    zzek zzekVar6 = this.a;
                    zzadoVar.I(zzekVar6.n(), 0, 12);
                    zzekVar6.l(0);
                    zzafd zzafdVar2 = this.b;
                    zzafdVar2.a(zzekVar6);
                    int i11 = zzafdVar2.a;
                    if (i11 == 1414744396) {
                        int C9 = zzekVar6.C();
                        if (C9 == 1819436136) {
                            this.l = zzafdVar2.b;
                            this.e = 2;
                            return 0;
                        }
                        throw zzaz.a("hdrl expected, found: " + C9, null);
                    }
                    throw zzaz.a("LIST expected, found: " + i11, null);
                } else if (g(zzadoVar)) {
                    zzadoVar.G(12);
                    this.e = 1;
                    return 0;
                } else {
                    throw zzaz.a("AVI Header List not found", null);
                }
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    public zzaff(int i, zzakj zzakjVar) {
        this.d = zzakjVar;
        this.c = 1 == (i ^ 1);
        this.a = new zzek(12);
        this.b = new zzafd(null);
        this.f = new zzaeh();
        this.i = new zzafi[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = C10323vs.b;
    }
}
