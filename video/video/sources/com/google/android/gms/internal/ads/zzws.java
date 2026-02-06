package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import o.GX1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzws implements zzaet {
    public boolean A;
    @InterfaceC11300zs1
    public zzsc B;
    public final zzwm a;
    @InterfaceC11300zs1
    public final zzsb d;
    @InterfaceC11300zs1
    public final zzrw e;
    @InterfaceC11300zs1
    public zzwq f;
    @InterfaceC11300zs1
    public zzz g;

    /* renamed from: o  reason: collision with root package name */
    public int f299o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    @InterfaceC11300zs1
    public zzz y;
    public final zzwo b = new zzwo();
    public int h = 1000;
    public long[] i = new long[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public zzaes[] n = new zzaes[1000];
    public final zzwz c = new zzwz(new zzdk() { // from class: com.google.android.gms.internal.ads.zzwn
        @Override // com.google.android.gms.internal.ads.zzdk
        public final void b(Object obj) {
            zzsa zzsaVar = ((zzwp) obj).b;
        }
    });
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;
    public boolean z = true;

    public zzws(zzzg zzzgVar, @InterfaceC11300zs1 zzsb zzsbVar, @InterfaceC11300zs1 zzrw zzrwVar) {
        this.d = zzsbVar;
        this.e = zzrwVar;
        this.a = new zzwm(zzzgVar);
    }

    public final synchronized long A() {
        return this.u;
    }

    @InterfaceC11300zs1
    public final synchronized zzz B() {
        if (this.x) {
            return null;
        }
        return this.y;
    }

    public final void C(long j, boolean z, boolean z2) {
        this.a.c(l(j, false, z2));
    }

    public final void D() {
        this.a.c(m());
    }

    @InterfaceC2591Bt
    public final void E() throws IOException {
        zzsc zzscVar = this.B;
        if (zzscVar == null) {
            return;
        }
        throw zzscVar.a();
    }

    @InterfaceC2591Bt
    public final void F() {
        D();
        q();
    }

    @InterfaceC2591Bt
    public final void G() {
        H(true);
        q();
    }

    @InterfaceC2591Bt
    public final void H(boolean z) {
        this.a.f();
        this.f299o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.c.d();
        if (z) {
            this.y = null;
            this.x = true;
            this.z = true;
        }
    }

    public final void I(long j) {
        this.s = j;
    }

    public final void J(@InterfaceC11300zs1 zzwq zzwqVar) {
        this.f = zzwqVar;
    }

    public final synchronized void K(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.r + i <= this.f299o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdc.d(z);
        this.r += i;
    }

    public final synchronized boolean L() {
        return this.v;
    }

    @InterfaceC2591Bt
    public final synchronized boolean M(boolean z) {
        boolean z2 = true;
        if (!s()) {
            if (!z && !this.v) {
                zzz zzzVar = this.y;
                if (zzzVar != null) {
                    if (zzzVar == this.g) {
                        return false;
                    }
                } else {
                    z2 = false;
                }
            }
            return z2;
        } else if (((zzwp) this.c.a(this.p + this.r)).a != this.g) {
            return true;
        } else {
            return t(j(this.r));
        }
    }

    public final synchronized boolean N(int i) {
        r();
        int i2 = this.p;
        if (i >= i2 && i <= this.f299o + i2) {
            this.s = Long.MIN_VALUE;
            this.r = i - i2;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void a(zzek zzekVar, int i, int i2) {
        this.a.h(zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ int b(zzl zzlVar, int i, boolean z) {
        return zzaer.a(this, zzlVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void c(long j, int i, int i2, int i3, @InterfaceC11300zs1 zzaes zzaesVar) {
        if (this.w) {
            if ((i & 1) != 0) {
                this.w = false;
            } else {
                return;
            }
        }
        if (this.z) {
            if (j >= this.s) {
                if ((i & 1) == 0) {
                    if (!this.A) {
                        zzdx.f(GX1.L, "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.y)));
                        this.A = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        int i4 = i;
        o(j, i4, (this.a.b() - i2) - i3, i2, zzaesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void d(zzek zzekVar, int i) {
        zzaer.b(this, zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void e(zzz zzzVar) {
        boolean u = u(zzzVar);
        zzwq zzwqVar = this.f;
        if (zzwqVar != null && u) {
            zzwqVar.k(zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final /* synthetic */ void f(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final int g(zzl zzlVar, int i, boolean z, int i2) throws IOException {
        return this.a.a(zzlVar, i, z);
    }

    public final synchronized boolean h(long j, boolean z) {
        Throwable th;
        zzws zzwsVar;
        long j2;
        int i;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            r();
            int i2 = this.r;
            int j3 = j(i2);
            if (s() && j >= this.m[j3]) {
                if (j > this.u) {
                    if (z) {
                        z = true;
                    }
                }
                if (this.z) {
                    try {
                        int i3 = this.f299o - i2;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (this.m[j3] < j) {
                                    j3++;
                                    if (j3 == this.h) {
                                        j3 = 0;
                                    }
                                    i4++;
                                } else {
                                    zzwsVar = this;
                                    j2 = j;
                                    i = i4;
                                    break;
                                }
                            } else if (z) {
                                j2 = j;
                                i = i3;
                                zzwsVar = this;
                            } else {
                                zzwsVar = this;
                                j2 = j;
                                i = -1;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    zzwsVar = this;
                    j2 = j;
                    i = zzwsVar.i(j3, this.f299o - i2, j2, true);
                }
                if (i == -1) {
                    return false;
                }
                zzwsVar.s = j2;
                zzwsVar.r += i;
                return true;
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int i(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.m[i] > j ? 1 : (this.m[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (i5 == 0) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final int j(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int k(zzkq zzkqVar, zzhp zzhpVar, boolean z, boolean z2, zzwo zzwoVar) {
        try {
            zzhpVar.e = false;
            if (!s()) {
                if (!z2 && !this.v) {
                    zzz zzzVar = this.y;
                    if (zzzVar == null || (!z && zzzVar == this.g)) {
                        return -3;
                    }
                    p(zzzVar, zzkqVar);
                    return -5;
                }
                zzhpVar.c(4);
                zzhpVar.f = Long.MIN_VALUE;
                return -4;
            }
            zzz zzzVar2 = ((zzwp) this.c.a(this.p + this.r)).a;
            if (!z && zzzVar2 == this.g) {
                int j = j(this.r);
                if (!t(j)) {
                    zzhpVar.e = true;
                    return -3;
                }
                zzhpVar.c(this.l[j]);
                if (this.r == this.f299o - 1 && (z2 || this.v)) {
                    zzhpVar.a(536870912);
                }
                zzhpVar.f = this.m[j];
                zzwoVar.a = this.k[j];
                zzwoVar.b = this.j[j];
                zzwoVar.c = this.n[j];
                return -4;
            }
            p(zzzVar2, zzkqVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long l(long j, boolean z, boolean z2) {
        Throwable th;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int i = this.f299o;
            if (i != 0) {
                long[] jArr = this.m;
                int i2 = this.q;
                if (j >= jArr[i2]) {
                    if (z2) {
                        try {
                            int i3 = this.r;
                            if (i3 != i) {
                                i = i3 + 1;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                    int i4 = i(i2, i, j, false);
                    if (i4 != -1) {
                        return n(i4);
                    }
                    return -1L;
                }
            }
            return -1L;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long m() {
        int i = this.f299o;
        if (i == 0) {
            return -1L;
        }
        return n(i);
    }

    @InterfaceC8710pF0("this")
    public final long n(int i) {
        int i2;
        long j = this.t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int j3 = j(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                j2 = Math.max(j2, this.m[j3]);
                if ((this.l[j3] & 1) != 0) {
                    break;
                }
                j3--;
                if (j3 == -1) {
                    j3 = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, j2);
        this.f299o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        this.c.e(i4);
        if (this.f299o == 0) {
            int i8 = this.q;
            if (i8 == 0) {
                i8 = this.h;
            }
            return this.j[i8 - 1] + this.k[i2];
        }
        return this.j[this.q];
    }

    public final synchronized void o(long j, int i, long j2, int i2, @InterfaceC11300zs1 zzaes zzaesVar) {
        boolean z;
        int j3;
        boolean z2;
        try {
            int i3 = this.f299o;
            if (i3 > 0) {
                if (this.j[j(i3 - 1)] + this.k[j3] <= j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzdc.d(z2);
            }
            if ((536870912 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.v = z;
            this.u = Math.max(this.u, j);
            int j4 = j(this.f299o);
            this.m[j4] = j;
            this.j[j4] = j2;
            this.k[j4] = i2;
            this.l[j4] = i;
            this.n[j4] = zzaesVar;
            this.i[j4] = 0;
            zzwz zzwzVar = this.c;
            if (zzwzVar.f() || !((zzwp) zzwzVar.b()).a.equals(this.y)) {
                zzz zzzVar = this.y;
                if (zzzVar != null) {
                    zzwzVar.c(this.p + this.f299o, new zzwp(zzzVar, this.d.c(this.e, zzzVar), null));
                } else {
                    throw null;
                }
            }
            int i4 = this.f299o + 1;
            this.f299o = i4;
            int i5 = this.h;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                zzaes[] zzaesVarArr = new zzaes[i6];
                int i7 = this.q;
                int i8 = i5 - i7;
                System.arraycopy(this.j, i7, jArr2, 0, i8);
                System.arraycopy(this.m, this.q, jArr3, 0, i8);
                System.arraycopy(this.l, this.q, iArr, 0, i8);
                System.arraycopy(this.k, this.q, iArr2, 0, i8);
                System.arraycopy(this.n, this.q, zzaesVarArr, 0, i8);
                System.arraycopy(this.i, this.q, jArr, 0, i8);
                int i9 = this.q;
                System.arraycopy(this.j, 0, jArr2, i8, i9);
                System.arraycopy(this.m, 0, jArr3, i8, i9);
                System.arraycopy(this.l, 0, iArr, i8, i9);
                System.arraycopy(this.k, 0, iArr2, i8, i9);
                System.arraycopy(this.n, 0, zzaesVarArr, i8, i9);
                System.arraycopy(this.i, 0, jArr, i8, i9);
                this.j = jArr2;
                this.m = jArr3;
                this.l = iArr;
                this.k = iArr2;
                this.n = zzaesVarArr;
                this.i = jArr;
                this.q = 0;
                this.h = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p(zzz zzzVar, zzkq zzkqVar) {
        zzs zzsVar;
        zzz zzzVar2 = this.g;
        if (zzzVar2 == null) {
            zzsVar = null;
        } else {
            zzsVar = zzzVar2.s;
        }
        this.g = zzzVar;
        zzs zzsVar2 = zzzVar.s;
        zzsb zzsbVar = this.d;
        zzkqVar.a = zzzVar.c(zzsbVar.a(zzzVar));
        zzkqVar.b = this.B;
        if (zzzVar2 != null && Objects.equals(zzsVar, zzsVar2)) {
            return;
        }
        zzsc b = zzsbVar.b(this.e, zzzVar);
        this.B = b;
        zzkqVar.b = b;
    }

    public final void q() {
        if (this.B != null) {
            this.B = null;
            this.g = null;
        }
    }

    public final synchronized void r() {
        this.r = 0;
        this.a.g();
    }

    public final boolean s() {
        return this.r != this.f299o;
    }

    public final boolean t(int i) {
        if (this.B != null) {
            int i2 = this.l[i];
            return false;
        }
        return true;
    }

    public final synchronized boolean u(zzz zzzVar) {
        try {
            this.x = false;
            if (Objects.equals(zzzVar, this.y)) {
                return false;
            }
            zzwz zzwzVar = this.c;
            if (!zzwzVar.f() && ((zzwp) zzwzVar.b()).a.equals(zzzVar)) {
                this.y = ((zzwp) zzwzVar.b()).a;
            } else {
                this.y = zzzVar;
            }
            boolean z = this.z;
            zzz zzzVar2 = this.y;
            this.z = z & zzay.f(zzzVar2.f301o, zzzVar2.k);
            this.A = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int v() {
        return this.p;
    }

    public final int w() {
        return this.p + this.r;
    }

    public final synchronized int x(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.r;
                int j2 = j(i);
                if (!s() || j < this.m[j2]) {
                    return 0;
                }
                if (j > this.u && z) {
                    try {
                        return this.f299o - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i2 = i(j2, this.f299o - i, j, true);
                if (i2 == -1) {
                    return 0;
                }
                return i2;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int y() {
        return this.p + this.f299o;
    }

    @InterfaceC2591Bt
    public final int z(zzkq zzkqVar, zzhp zzhpVar, int i, boolean z) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzwo zzwoVar = this.b;
        int k = k(zzkqVar, zzhpVar, z2, z, zzwoVar);
        if (k == -4) {
            if (!zzhpVar.f()) {
                int i2 = i & 1;
                if ((i & 4) == 0) {
                    if (i2 != 0) {
                        this.a.d(zzhpVar, zzwoVar);
                        return -4;
                    }
                    this.a.e(zzhpVar, zzwoVar);
                } else if (i2 != 0) {
                    return -4;
                }
                this.r++;
            }
            return -4;
        }
        return k;
    }
}
