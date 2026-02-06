package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzaiu {
    public final zzaet a;
    public zzajk d;
    public zzaiq e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final String j;
    public boolean m;
    public final zzajj b = new zzajj();
    public final zzek c = new zzek();
    public final zzek k = new zzek(1);
    public final zzek l = new zzek();

    public zzaiu(zzaet zzaetVar, zzajk zzajkVar, zzaiq zzaiqVar, String str) {
        this.a = zzaetVar;
        this.d = zzajkVar;
        this.e = zzaiqVar;
        this.j = str;
        h(zzajkVar, zzaiqVar);
    }

    public final int a() {
        int i;
        if (!this.m) {
            i = this.d.g[this.f];
        } else if (this.b.j[this.f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (f() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final int b() {
        if (!this.m) {
            return this.d.d[this.f];
        }
        return this.b.h[this.f];
    }

    public final int c(int i, int i2) {
        zzek zzekVar;
        boolean z;
        int i3;
        zzaji f = f();
        if (f == null) {
            return 0;
        }
        int i4 = f.d;
        if (i4 != 0) {
            zzekVar = this.b.n;
        } else {
            byte[] bArr = f.e;
            String str = zzeu.a;
            zzek zzekVar2 = this.l;
            int length = bArr.length;
            zzekVar2.j(bArr, length);
            zzekVar = zzekVar2;
            i4 = length;
        }
        zzajj zzajjVar = this.b;
        boolean b = zzajjVar.b(this.f);
        if (b || i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        zzek zzekVar3 = this.k;
        if (true != z) {
            i3 = 0;
        } else {
            i3 = 128;
        }
        zzekVar3.n()[0] = (byte) (i3 | i4);
        zzekVar3.l(0);
        zzaet zzaetVar = this.a;
        zzaetVar.a(zzekVar3, 1, 1);
        zzaetVar.a(zzekVar, i4, 1);
        if (!z) {
            return i4 + 1;
        }
        if (!b) {
            zzek zzekVar4 = this.c;
            zzekVar4.i(8);
            byte[] n = zzekVar4.n();
            n[0] = 0;
            n[1] = 1;
            n[2] = 0;
            n[3] = (byte) i2;
            n[4] = (byte) ((i >> 24) & 255);
            n[5] = (byte) ((i >> 16) & 255);
            n[6] = (byte) ((i >> 8) & 255);
            n[7] = (byte) (i & 255);
            zzaetVar.a(zzekVar4, 8, 1);
            return i4 + 9;
        }
        int i5 = i4 + 1;
        zzek zzekVar5 = zzajjVar.n;
        int K = zzekVar5.K();
        zzekVar5.m(-2);
        int i6 = (K * 6) + 2;
        if (i2 != 0) {
            zzek zzekVar6 = this.c;
            zzekVar6.i(i6);
            byte[] n2 = zzekVar6.n();
            zzekVar5.h(n2, 0, i6);
            int i7 = (((n2[2] & 255) << 8) | (n2[3] & 255)) + i2;
            n2[2] = (byte) ((i7 >> 8) & 255);
            n2[3] = (byte) (i7 & 255);
            zzekVar5 = zzekVar6;
        }
        zzaetVar.a(zzekVar5, i6, 1);
        return i5 + i6;
    }

    public final long d() {
        if (!this.m) {
            return this.d.c[this.f];
        }
        return this.b.f[this.h];
    }

    public final long e() {
        if (!this.m) {
            return this.d.f[this.f];
        }
        zzajj zzajjVar = this.b;
        return zzajjVar.i[this.f];
    }

    @InterfaceC11300zs1
    public final zzaji f() {
        if (!this.m) {
            return null;
        }
        zzajj zzajjVar = this.b;
        zzaiq zzaiqVar = zzajjVar.a;
        String str = zzeu.a;
        int i = zzaiqVar.a;
        zzaji zzajiVar = zzajjVar.m;
        if (zzajiVar == null) {
            zzajiVar = this.d.a.b(i);
        }
        if (zzajiVar == null || !zzajiVar.a) {
            return null;
        }
        return zzajiVar;
    }

    public final void h(zzajk zzajkVar, zzaiq zzaiqVar) {
        this.d = zzajkVar;
        this.e = zzaiqVar;
        zzx b = zzajkVar.a.g.b();
        b.e(this.j);
        this.a.e(b.K());
        i();
    }

    public final void i() {
        zzajj zzajjVar = this.b;
        zzajjVar.d = 0;
        zzajjVar.p = 0L;
        zzajjVar.q = false;
        zzajjVar.k = false;
        zzajjVar.f206o = false;
        zzajjVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }

    public final void j(zzs zzsVar) {
        String str;
        zzajh zzajhVar = this.d.a;
        zzaiq zzaiqVar = this.b.a;
        String str2 = zzeu.a;
        zzaji b = zzajhVar.b(zzaiqVar.a);
        if (b != null) {
            str = b.b;
        } else {
            str = null;
        }
        zzs b2 = zzsVar.b(str);
        zzz zzzVar = this.d.a.g;
        String str3 = this.j;
        zzx b3 = zzzVar.b();
        b3.e(str3);
        b3.h(b2);
        this.a.e(b3.K());
    }

    public final boolean l() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
