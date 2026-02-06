package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzxy extends zzyj implements Comparable {
    public final int Z0;
    public final boolean a1;
    @InterfaceC11300zs1
    public final String b1;
    public final zzyc c1;
    public final boolean d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public final boolean h1;
    public final int i1;
    public final int j1;
    public final boolean k1;
    public final int l1;
    public final int m1;
    public final int n1;
    public final int o1;
    public final boolean p1;
    public final boolean q1;
    public final boolean r1;

    /* JADX WARN: Removed duplicated region for block: B:115:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0130 A[EDGE_INSN: B:116:0x0130->B:82:0x0130 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[LOOP:1: B:62:0x00ea->B:64:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzxy(int i, zzbm zzbmVar, int i2, zzyc zzycVar, int i3, boolean z, zzfvd zzfvdVar, int i4) {
        super(i, zzbmVar, i2);
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        boolean z6;
        String[] split;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        zzyc zzycVar2;
        boolean z9;
        this.c1 = zzycVar;
        int i13 = 1;
        if (true != zzycVar.O) {
            i5 = 16;
        } else {
            i5 = 24;
        }
        this.b1 = zzyo.p(this.Y0.d);
        this.d1 = zzlw.a(i3, false);
        int i14 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i14 < zzycVar.p.size()) {
                i7 = zzyo.m(this.Y0, (String) zzycVar.p.get(i14), false);
                if (i7 > 0) {
                    break;
                }
                i14++;
            } else {
                i7 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f1 = i14;
        this.e1 = i7;
        this.g1 = zzyo.l(this.Y0.f, 0);
        zzz zzzVar = this.Y0;
        int i15 = zzzVar.f;
        if (i15 == 0 || (i15 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h1 = z2;
        if (1 != (zzzVar.e & 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.k1 = z3;
        String str = zzzVar.f301o;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2123537834) {
                if (hashCode != 187078297) {
                    if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                        z4 = true;
                        z5 = (z4 || z4 || z4) ? true : z5;
                    }
                    z4 = true;
                    if (z4) {
                    }
                } else {
                    if (str.equals(C4128Rj1.T)) {
                        z4 = true;
                        if (z4) {
                        }
                    }
                    z4 = true;
                    if (z4) {
                    }
                }
            } else {
                if (str.equals(C4128Rj1.S)) {
                    z4 = false;
                    if (z4) {
                    }
                }
                z4 = true;
                if (z4) {
                }
            }
            this.r1 = z5;
            int i16 = zzzVar.E;
            this.l1 = i16;
            this.m1 = zzzVar.F;
            i8 = zzzVar.j;
            this.n1 = i8;
            if ((i8 == -1 && i8 > zzycVar.s) || ((i16 != -1 && i16 > zzycVar.r) || !zzfvdVar.b(zzzVar))) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.a1 = z6;
            String str2 = zzeu.a;
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            for (i9 = 0; i9 < split.length; i9++) {
                split[i9] = zzeu.e(split[i9]);
            }
            i10 = 0;
            while (true) {
                if (i10 >= split.length) {
                    i11 = zzyo.m(this.Y0, split[i10], false);
                    if (i11 > 0) {
                        break;
                    }
                    i10++;
                } else {
                    i11 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.i1 = i10;
            this.j1 = i11;
            i12 = 0;
            while (true) {
                if (i12 >= zzycVar.t.size()) {
                    break;
                }
                String str3 = this.Y0.f301o;
                if (str3 != null && str3.equals(zzycVar.t.get(i12))) {
                    i6 = i12;
                    break;
                }
                i12++;
            }
            this.o1 = i6;
            if ((i3 & 384) != 128) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.p1 = z7;
            if ((i3 & 64) != 64) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.q1 = z8;
            zzycVar2 = this.c1;
            if (!zzlw.a(i3, zzycVar2.Q) || (!(z9 = this.a1) && !zzycVar2.J)) {
                i13 = 0;
            } else {
                int i17 = zzycVar2.u.a;
                if (zzlw.a(i3, false) && z9 && this.Y0.j != -1 && ((zzycVar2.S || !z) && (i5 & i3) != 0)) {
                    i13 = 2;
                }
            }
            this.Z0 = i13;
        }
        z5 = false;
        this.r1 = z5;
        int i162 = zzzVar.E;
        this.l1 = i162;
        this.m1 = zzzVar.F;
        i8 = zzzVar.j;
        this.n1 = i8;
        if (i8 == -1) {
        }
        z6 = true;
        this.a1 = z6;
        String str22 = zzeu.a;
        split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        while (i9 < split.length) {
        }
        i10 = 0;
        while (true) {
            if (i10 >= split.length) {
            }
            i10++;
        }
        this.i1 = i10;
        this.j1 = i11;
        i12 = 0;
        while (true) {
            if (i12 >= zzycVar.t.size()) {
            }
            i12++;
        }
        this.o1 = i6;
        if ((i3 & 384) != 128) {
        }
        this.p1 = z7;
        if ((i3 & 64) != 64) {
        }
        this.q1 = z8;
        zzycVar2 = this.c1;
        if (!zzlw.a(i3, zzycVar2.Q)) {
            int i172 = zzycVar2.u.a;
            if (zzlw.a(i3, false)) {
                i13 = 2;
            }
            this.Z0 = i13;
        }
        i13 = 0;
        this.Z0 = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final int e() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final /* bridge */ /* synthetic */ boolean g(zzyj zzyjVar) {
        String str;
        int i;
        zzxy zzxyVar = (zzxy) zzyjVar;
        boolean z = this.c1.M;
        zzz zzzVar = this.Y0;
        int i2 = zzzVar.E;
        if (i2 != -1) {
            zzz zzzVar2 = zzxyVar.Y0;
            if (i2 == zzzVar2.E && (str = zzzVar.f301o) != null && TextUtils.equals(str, zzzVar2.f301o) && (i = zzzVar.F) != -1 && i == zzzVar2.F && this.p1 == zzxyVar.p1 && this.q1 == zzxyVar.q1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(zzxy zzxyVar) {
        zzfzn zzfznVar;
        zzfzn a;
        boolean z = this.a1;
        if (!z || !this.d1) {
            zzfznVar = zzyo.i;
            a = zzfznVar.a();
        } else {
            a = zzyo.i;
        }
        zzfxr c = zzfxr.i().d(this.d1, zzxyVar.d1).c(Integer.valueOf(this.f1), Integer.valueOf(zzxyVar.f1), zzfzn.c().a()).b(this.e1, zzxyVar.e1).b(this.g1, zzxyVar.g1).d(this.k1, zzxyVar.k1).d(this.h1, zzxyVar.h1).c(Integer.valueOf(this.i1), Integer.valueOf(zzxyVar.i1), zzfzn.c().a()).b(this.j1, zzxyVar.j1).d(z, zzxyVar.a1).c(Integer.valueOf(this.o1), Integer.valueOf(zzxyVar.o1), zzfzn.c().a());
        boolean z2 = this.c1.B;
        zzfxr c2 = c.d(this.p1, zzxyVar.p1).d(this.q1, zzxyVar.q1).d(this.r1, zzxyVar.r1).c(Integer.valueOf(this.l1), Integer.valueOf(zzxyVar.l1), a).c(Integer.valueOf(this.m1), Integer.valueOf(zzxyVar.m1), a);
        if (Objects.equals(this.b1, zzxyVar.b1)) {
            c2 = c2.c(Integer.valueOf(this.n1), Integer.valueOf(zzxyVar.n1), a);
        }
        return c2.a();
    }
}
