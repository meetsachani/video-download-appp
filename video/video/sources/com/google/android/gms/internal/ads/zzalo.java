package com.google.android.gms.internal.ads;

import android.text.Layout;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzalo {
    @InterfaceC11300zs1
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    @InterfaceC11300zs1
    public String l;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f210o;
    @InterfaceC11300zs1
    public Layout.Alignment p;
    @InterfaceC11300zs1
    public zzalh r;
    @InterfaceC11300zs1
    public String t;
    @InterfaceC11300zs1
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final zzalo A(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public final zzalo B(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public final zzalo C(@InterfaceC11300zs1 String str) {
        this.u = str;
        return this;
    }

    public final zzalo D(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public final zzalo E(@InterfaceC11300zs1 String str) {
        this.a = str;
        return this;
    }

    public final zzalo F(float f) {
        this.k = f;
        return this;
    }

    public final zzalo G(int i) {
        this.j = i;
        return this;
    }

    public final zzalo H(@InterfaceC11300zs1 String str) {
        this.l = str;
        return this;
    }

    public final zzalo I(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public final zzalo J(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public final zzalo K(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public final zzalo L(@InterfaceC11300zs1 String str) {
        this.t = str;
        return this;
    }

    public final zzalo M(int i) {
        this.n = i;
        return this;
    }

    public final zzalo N(int i) {
        this.m = i;
        return this;
    }

    public final zzalo a(float f) {
        this.s = f;
        return this;
    }

    public final zzalo b(@InterfaceC11300zs1 Layout.Alignment alignment) {
        this.f210o = alignment;
        return this;
    }

    public final zzalo c(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public final zzalo d(@InterfaceC11300zs1 zzalh zzalhVar) {
        this.r = zzalhVar;
        return this;
    }

    public final zzalo e(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    @InterfaceC11300zs1
    public final String f() {
        return this.u;
    }

    @InterfaceC11300zs1
    public final String g() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final String h() {
        return this.l;
    }

    @InterfaceC11300zs1
    public final String i() {
        return this.t;
    }

    public final boolean j() {
        return this.q == 1;
    }

    public final boolean k() {
        return this.e;
    }

    public final boolean l() {
        return this.c;
    }

    public final boolean m() {
        return this.f == 1;
    }

    public final boolean n() {
        return this.g == 1;
    }

    public final float o() {
        return this.k;
    }

    public final float p() {
        return this.s;
    }

    public final int q() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int r() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int s() {
        return this.j;
    }

    public final int t() {
        return this.n;
    }

    public final int u() {
        return this.m;
    }

    public final int v() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    @InterfaceC11300zs1
    public final Layout.Alignment w() {
        return this.p;
    }

    @InterfaceC11300zs1
    public final Layout.Alignment x() {
        return this.f210o;
    }

    @InterfaceC11300zs1
    public final zzalh y() {
        return this.r;
    }

    public final zzalo z(@InterfaceC11300zs1 zzalo zzaloVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaloVar != null) {
            if (!this.c && zzaloVar.c) {
                D(zzaloVar.b);
            }
            if (this.h == -1) {
                this.h = zzaloVar.h;
            }
            if (this.i == -1) {
                this.i = zzaloVar.i;
            }
            if (this.a == null && (str = zzaloVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = zzaloVar.f;
            }
            if (this.g == -1) {
                this.g = zzaloVar.g;
            }
            if (this.n == -1) {
                this.n = zzaloVar.n;
            }
            if (this.f210o == null && (alignment2 = zzaloVar.f210o) != null) {
                this.f210o = alignment2;
            }
            if (this.p == null && (alignment = zzaloVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = zzaloVar.q;
            }
            if (this.j == -1) {
                this.j = zzaloVar.j;
                this.k = zzaloVar.k;
            }
            if (this.r == null) {
                this.r = zzaloVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = zzaloVar.s;
            }
            if (this.t == null) {
                this.t = zzaloVar.t;
            }
            if (this.u == null) {
                this.u = zzaloVar.u;
            }
            if (!this.e && zzaloVar.e) {
                A(zzaloVar.d);
            }
            if (this.m == -1 && (i = zzaloVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }
}
