package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzbr {
    public final zzfyf D;
    public final zzfyh E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final zzfyc m;
    public final zzfyc n;
    public final zzfyc p;
    public final int r;
    public final int s;
    public final zzfyc t;
    public final zzbp u;
    public final zzfyc v;
    public final boolean x;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;

    /* renamed from: o */
    public final int f229o = 0;
    public final int q = 0;
    public final int w = 0;
    public final int y = 0;
    public final boolean z = false;
    public final boolean A = false;
    public final boolean B = false;
    public final boolean C = false;

    static {
        new zzbr(new zzbq());
        String str = zzeu.a;
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

    public zzbr(zzbq zzbqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        zzfyc zzfycVar;
        zzfyc zzfycVar2;
        zzfyc zzfycVar3;
        int i7;
        int i8;
        zzfyc zzfycVar4;
        zzbp zzbpVar;
        zzfyc zzfycVar5;
        boolean z3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzbqVar.a;
        this.a = i;
        i2 = zzbqVar.b;
        this.b = i2;
        i3 = zzbqVar.c;
        this.c = i3;
        i4 = zzbqVar.d;
        this.d = i4;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        i5 = zzbqVar.e;
        this.i = i5;
        i6 = zzbqVar.f;
        this.j = i6;
        z = zzbqVar.g;
        this.k = z;
        z2 = zzbqVar.h;
        this.l = z2;
        zzfycVar = zzbqVar.i;
        this.m = zzfycVar;
        zzfycVar2 = zzbqVar.j;
        this.n = zzfycVar2;
        this.f229o = 0;
        zzfycVar3 = zzbqVar.k;
        this.p = zzfycVar3;
        this.q = 0;
        i7 = zzbqVar.l;
        this.r = i7;
        i8 = zzbqVar.m;
        this.s = i8;
        zzfycVar4 = zzbqVar.n;
        this.t = zzfycVar4;
        zzbpVar = zzbqVar.f228o;
        this.u = zzbpVar;
        zzfycVar5 = zzbqVar.p;
        this.v = zzfycVar5;
        this.w = 0;
        z3 = zzbqVar.q;
        this.x = z3;
        this.y = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        hashMap = zzbqVar.r;
        this.D = zzfyf.c(hashMap);
        hashSet = zzbqVar.s;
        this.E = zzfyh.B(hashSet);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.a == zzbrVar.a && this.b == zzbrVar.b && this.c == zzbrVar.c && this.d == zzbrVar.d && this.l == zzbrVar.l && this.i == zzbrVar.i && this.j == zzbrVar.j && this.k == zzbrVar.k && this.m.equals(zzbrVar.m) && this.n.equals(zzbrVar.n) && this.p.equals(zzbrVar.p) && this.r == zzbrVar.r && this.s == zzbrVar.s && this.t.equals(zzbrVar.t) && this.u.equals(zzbrVar.u) && this.v.equals(zzbrVar.v) && this.x == zzbrVar.x && this.D.equals(zzbrVar.D) && this.E.equals(zzbrVar.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 961) + this.p.hashCode()) * 961) + this.r) * 31) + this.s) * 31) + this.t.hashCode()) * 31) + 29791) * 31) + this.v.hashCode()) * 961) + (this.x ? 1 : 0)) * 887503681) + this.D.hashCode()) * 31) + this.E.hashCode();
    }
}
