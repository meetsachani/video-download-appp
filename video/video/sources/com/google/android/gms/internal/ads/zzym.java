package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzym extends zzyj {
    public final boolean Z0;
    public final zzyc a1;
    public final boolean b1;
    public final boolean c1;
    public final boolean d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public final int h1;
    public final int i1;
    public final int j1;
    public final boolean k1;
    public final int l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final int p1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00fb A[EDGE_INSN: B:143:0x00fb->B:78:0x00fb ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzym(int i, zzbm zzbmVar, int i2, zzyc zzycVar, int i3, @InterfaceC11300zs1 String str, int i4, boolean z) {
        super(i, zzbmVar, i2);
        int i5;
        boolean z2;
        boolean z3;
        float f;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        boolean z8;
        zzz zzzVar;
        String str2;
        int i11;
        boolean z9;
        boolean z10;
        zzz zzzVar2;
        int i12;
        int i13;
        float f2;
        int i14;
        zzz zzzVar3;
        int i15;
        int i16;
        int i17;
        this.a1 = zzycVar;
        int i18 = 1;
        if (true != zzycVar.H) {
            i5 = 16;
        } else {
            i5 = 24;
        }
        if (z && (((i15 = (zzzVar3 = this.Y0).v) == -1 || i15 <= zzycVar.a) && ((i16 = zzzVar3.w) == -1 || i16 <= zzycVar.b))) {
            float f3 = zzzVar3.x;
            if ((f3 == -1.0f || f3 <= zzycVar.c) && ((i17 = zzzVar3.j) == -1 || i17 <= zzycVar.d)) {
                z2 = true;
                this.Z0 = z2;
                if (z && (((i12 = (zzzVar2 = this.Y0).v) == -1 || i12 >= 0) && ((i13 = zzzVar2.w) == -1 || i13 >= 0))) {
                    f2 = zzzVar2.x;
                    if ((f2 != -1.0f || f2 >= 0.0f) && ((i14 = zzzVar2.j) == -1 || i14 >= 0)) {
                        z3 = true;
                        this.b1 = z3;
                        this.c1 = zzlw.a(i3, false);
                        zzz zzzVar4 = this.Y0;
                        f = zzzVar4.x;
                        if (f == -1.0f && f >= 10.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.d1 = z4;
                        this.e1 = zzzVar4.j;
                        this.f1 = zzzVar4.a();
                        i6 = 0;
                        while (true) {
                            i7 = Integer.MAX_VALUE;
                            if (i6 >= zzycVar.n.size()) {
                                i8 = zzyo.m(this.Y0, (String) zzycVar.n.get(i6), false);
                                if (i8 > 0) {
                                    break;
                                }
                                i6++;
                            } else {
                                i8 = 0;
                                i6 = Integer.MAX_VALUE;
                                break;
                            }
                        }
                        this.h1 = i6;
                        this.i1 = i8;
                        this.j1 = zzyo.l(this.Y0.f, 0);
                        i9 = this.Y0.f;
                        if (i9 != 0 || (i9 & 1) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.k1 = z5;
                        if (zzyo.p(str) != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        this.l1 = zzyo.m(this.Y0, str, z6);
                        i10 = 0;
                        while (true) {
                            if (i10 < zzycVar.m.size()) {
                                String str3 = this.Y0.f301o;
                                if (str3 != null && str3.equals(zzycVar.m.get(i10))) {
                                    i7 = i10;
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.g1 = i7;
                        if ((i3 & 384) != 128) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        this.n1 = z7;
                        if ((i3 & 64) != 64) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        this.o1 = z8;
                        zzzVar = this.Y0;
                        str2 = zzzVar.f301o;
                        if (str2 != null) {
                            i11 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals(C4128Rj1.w)) {
                                        z9 = false;
                                        break;
                                    }
                                    z9 = true;
                                    break;
                                case -1662735862:
                                    if (str2.equals(C4128Rj1.n)) {
                                        z9 = true;
                                        break;
                                    }
                                    z9 = true;
                                    break;
                                case -1662541442:
                                    if (str2.equals(C4128Rj1.k)) {
                                        z9 = true;
                                        break;
                                    }
                                    z9 = true;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z9 = true;
                                        break;
                                    }
                                    z9 = true;
                                    break;
                                case 1599127257:
                                    if (str2.equals(C4128Rj1.m)) {
                                        z9 = true;
                                        break;
                                    }
                                    z9 = true;
                                    break;
                                default:
                                    z9 = true;
                                    break;
                            }
                            if (z9) {
                                if (!z9) {
                                    if (!z9) {
                                        if (!z9) {
                                            if (z9) {
                                                i11 = 1;
                                            }
                                        } else {
                                            i11 = 2;
                                        }
                                    } else {
                                        i11 = 3;
                                    }
                                }
                            } else {
                                i11 = 5;
                            }
                            this.p1 = i11;
                            if ((zzzVar.f & 16384) == 0) {
                                zzyc zzycVar2 = this.a1;
                                if (zzlw.a(i3, zzycVar2.Q) && ((z10 = this.Z0) || zzycVar2.F)) {
                                    if (zzlw.a(i3, false) && this.b1 && z10 && zzzVar.j != -1 && (i5 & i3) != 0) {
                                        i18 = 2;
                                    }
                                    this.m1 = i18;
                                }
                            }
                            i18 = 0;
                            this.m1 = i18;
                        }
                        i11 = 0;
                        this.p1 = i11;
                        if ((zzzVar.f & 16384) == 0) {
                        }
                        i18 = 0;
                        this.m1 = i18;
                    }
                }
                z3 = false;
                this.b1 = z3;
                this.c1 = zzlw.a(i3, false);
                zzz zzzVar42 = this.Y0;
                f = zzzVar42.x;
                if (f == -1.0f) {
                }
                z4 = false;
                this.d1 = z4;
                this.e1 = zzzVar42.j;
                this.f1 = zzzVar42.a();
                i6 = 0;
                while (true) {
                    i7 = Integer.MAX_VALUE;
                    if (i6 >= zzycVar.n.size()) {
                    }
                    i6++;
                }
                this.h1 = i6;
                this.i1 = i8;
                this.j1 = zzyo.l(this.Y0.f, 0);
                i9 = this.Y0.f;
                if (i9 != 0) {
                }
                z5 = true;
                this.k1 = z5;
                if (zzyo.p(str) != null) {
                }
                this.l1 = zzyo.m(this.Y0, str, z6);
                i10 = 0;
                while (true) {
                    if (i10 < zzycVar.m.size()) {
                    }
                    i10++;
                }
                this.g1 = i7;
                if ((i3 & 384) != 128) {
                }
                this.n1 = z7;
                if ((i3 & 64) != 64) {
                }
                this.o1 = z8;
                zzzVar = this.Y0;
                str2 = zzzVar.f301o;
                if (str2 != null) {
                }
                i11 = 0;
                this.p1 = i11;
                if ((zzzVar.f & 16384) == 0) {
                }
                i18 = 0;
                this.m1 = i18;
            }
        }
        z2 = false;
        this.Z0 = z2;
        if (z) {
            f2 = zzzVar2.x;
            if (f2 != -1.0f) {
            }
            z3 = true;
            this.b1 = z3;
            this.c1 = zzlw.a(i3, false);
            zzz zzzVar422 = this.Y0;
            f = zzzVar422.x;
            if (f == -1.0f) {
            }
            z4 = false;
            this.d1 = z4;
            this.e1 = zzzVar422.j;
            this.f1 = zzzVar422.a();
            i6 = 0;
            while (true) {
                i7 = Integer.MAX_VALUE;
                if (i6 >= zzycVar.n.size()) {
                }
                i6++;
            }
            this.h1 = i6;
            this.i1 = i8;
            this.j1 = zzyo.l(this.Y0.f, 0);
            i9 = this.Y0.f;
            if (i9 != 0) {
            }
            z5 = true;
            this.k1 = z5;
            if (zzyo.p(str) != null) {
            }
            this.l1 = zzyo.m(this.Y0, str, z6);
            i10 = 0;
            while (true) {
                if (i10 < zzycVar.m.size()) {
                }
                i10++;
            }
            this.g1 = i7;
            if ((i3 & 384) != 128) {
            }
            this.n1 = z7;
            if ((i3 & 64) != 64) {
            }
            this.o1 = z8;
            zzzVar = this.Y0;
            str2 = zzzVar.f301o;
            if (str2 != null) {
            }
            i11 = 0;
            this.p1 = i11;
            if ((zzzVar.f & 16384) == 0) {
            }
            i18 = 0;
            this.m1 = i18;
        }
        z3 = false;
        this.b1 = z3;
        this.c1 = zzlw.a(i3, false);
        zzz zzzVar4222 = this.Y0;
        f = zzzVar4222.x;
        if (f == -1.0f) {
        }
        z4 = false;
        this.d1 = z4;
        this.e1 = zzzVar4222.j;
        this.f1 = zzzVar4222.a();
        i6 = 0;
        while (true) {
            i7 = Integer.MAX_VALUE;
            if (i6 >= zzycVar.n.size()) {
            }
            i6++;
        }
        this.h1 = i6;
        this.i1 = i8;
        this.j1 = zzyo.l(this.Y0.f, 0);
        i9 = this.Y0.f;
        if (i9 != 0) {
        }
        z5 = true;
        this.k1 = z5;
        if (zzyo.p(str) != null) {
        }
        this.l1 = zzyo.m(this.Y0, str, z6);
        i10 = 0;
        while (true) {
            if (i10 < zzycVar.m.size()) {
            }
            i10++;
        }
        this.g1 = i7;
        if ((i3 & 384) != 128) {
        }
        this.n1 = z7;
        if ((i3 & 64) != 64) {
        }
        this.o1 = z8;
        zzzVar = this.Y0;
        str2 = zzzVar.f301o;
        if (str2 != null) {
        }
        i11 = 0;
        this.p1 = i11;
        if ((zzzVar.f & 16384) == 0) {
        }
        i18 = 0;
        this.m1 = i18;
    }

    public static /* synthetic */ int h(zzym zzymVar, zzym zzymVar2) {
        zzfzn zzfznVar;
        zzfzn a;
        if (!zzymVar.Z0 || !zzymVar.c1) {
            zzfznVar = zzyo.i;
            a = zzfznVar.a();
        } else {
            a = zzyo.i;
        }
        zzfxr i = zzfxr.i();
        boolean z = zzymVar.a1.B;
        return i.c(Integer.valueOf(zzymVar.f1), Integer.valueOf(zzymVar2.f1), a).c(Integer.valueOf(zzymVar.e1), Integer.valueOf(zzymVar2.e1), a).a();
    }

    public static /* synthetic */ int i(zzym zzymVar, zzym zzymVar2) {
        zzfxr c = zzfxr.i().d(zzymVar.c1, zzymVar2.c1).c(Integer.valueOf(zzymVar.h1), Integer.valueOf(zzymVar2.h1), zzfzn.c().a()).b(zzymVar.i1, zzymVar2.i1).b(zzymVar.j1, zzymVar2.j1).d(zzymVar.k1, zzymVar2.k1).b(zzymVar.l1, zzymVar2.l1).d(zzymVar.d1, zzymVar2.d1).d(zzymVar.Z0, zzymVar2.Z0).d(zzymVar.b1, zzymVar2.b1).c(Integer.valueOf(zzymVar.g1), Integer.valueOf(zzymVar2.g1), zzfzn.c().a());
        boolean z = zzymVar.n1;
        zzfxr d = c.d(z, zzymVar2.n1);
        boolean z2 = zzymVar.o1;
        zzfxr d2 = d.d(z2, zzymVar2.o1);
        if (z && z2) {
            d2 = d2.b(zzymVar.p1, zzymVar2.p1);
        }
        return d2.a();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final int e() {
        return this.m1;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final /* bridge */ /* synthetic */ boolean g(zzyj zzyjVar) {
        zzym zzymVar = (zzym) zzyjVar;
        if (Objects.equals(this.Y0.f301o, zzymVar.Y0.f301o)) {
            boolean z = this.a1.I;
            if (this.n1 == zzymVar.n1 && this.o1 == zzymVar.o1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
