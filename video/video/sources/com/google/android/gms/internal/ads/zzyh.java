package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzyh extends zzyj implements Comparable {
    public final int Z0;
    public final boolean a1;
    public final boolean b1;
    public final boolean c1;
    public final int d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public final boolean h1;

    public zzyh(int i, zzbm zzbmVar, int i2, zzyc zzycVar, int i3, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        super(i, zzbmVar, i2);
        boolean z;
        boolean z2;
        zzfyc zzfycVar;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6 = 0;
        this.a1 = zzlw.a(i3, false);
        int i7 = this.Y0.e;
        int i8 = zzycVar.y;
        if (1 != (i7 & 1)) {
            z = false;
        } else {
            z = true;
        }
        this.b1 = z;
        if ((i7 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.c1 = z2;
        if (str2 != null) {
            zzfycVar = zzfyc.G(str2);
        } else if (zzycVar.v.isEmpty()) {
            zzfycVar = zzfyc.G("");
        } else {
            zzfycVar = zzycVar.v;
        }
        int i9 = 0;
        while (true) {
            if (i9 < zzfycVar.size()) {
                i4 = zzyo.m(this.Y0, (String) zzfycVar.get(i9), false);
                if (i4 > 0) {
                    break;
                }
                i9++;
            } else {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
        }
        this.d1 = i9;
        this.e1 = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            i5 = 0;
        }
        int l = zzyo.l(this.Y0.f, i5);
        this.f1 = l;
        if ((1088 & this.Y0.f) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.h1 = z3;
        if (zzyo.p(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int m = zzyo.m(this.Y0, str, z4);
        this.g1 = m;
        if (i4 > 0 || ((zzycVar.v.isEmpty() && l > 0) || this.b1 || (this.c1 && m > 0))) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (zzlw.a(i3, zzycVar.Q) && z5) {
            i6 = 1;
        }
        this.Z0 = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final int e() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final /* bridge */ /* synthetic */ boolean g(zzyj zzyjVar) {
        zzyh zzyhVar = (zzyh) zzyjVar;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(zzyh zzyhVar) {
        zzfzn a;
        zzfxr c = zzfxr.i().d(this.a1, zzyhVar.a1).c(Integer.valueOf(this.d1), Integer.valueOf(zzyhVar.d1), zzfzn.c().a());
        int i = this.e1;
        zzfxr b = c.b(i, zzyhVar.e1);
        int i2 = this.f1;
        zzfxr d = b.b(i2, zzyhVar.f1).d(this.b1, zzyhVar.b1);
        Boolean valueOf = Boolean.valueOf(this.c1);
        Boolean valueOf2 = Boolean.valueOf(zzyhVar.c1);
        if (i == 0) {
            a = zzfzn.c();
        } else {
            a = zzfzn.c().a();
        }
        zzfxr b2 = d.c(valueOf, valueOf2, a).b(this.g1, zzyhVar.g1);
        if (i2 == 0) {
            b2 = b2.e(this.h1, zzyhVar.h1);
        }
        return b2.a();
    }
}
