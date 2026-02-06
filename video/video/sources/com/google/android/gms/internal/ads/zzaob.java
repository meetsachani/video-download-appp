package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.C10323vs;
import o.Uu2;
import o.Xu2;

/* loaded from: classes2.dex */
public final class zzaob implements zzadn {
    public final int a;
    public final List b;
    public final zzek c;
    public final SparseIntArray d;
    public final zzaoe e;
    public final zzakj f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final zzany j;
    public zzanx k;
    public zzadq l;
    public int m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f217o;
    public boolean p;
    public int q;
    public int r;

    @Deprecated
    public zzaob() {
        this(1, 1, zzakj.a, new zzer(0L), new zzamo(0), Xu2.B);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        zzanx zzanxVar;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzer zzerVar = (zzer) list.get(i);
            if (zzerVar.f() != C10323vs.b) {
                long d = zzerVar.d();
                if (d != C10323vs.b) {
                    if (d != 0) {
                        if (d == j2) {
                        }
                    }
                }
            }
            zzerVar.i(j2);
        }
        if (j2 != 0 && (zzanxVar = this.k) != null) {
            zzanxVar.d(j2);
        }
        this.c.i(0);
        this.d.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i2 < sparseArray.size()) {
                ((zzaog) sparseArray.valueAt(i2)).c();
                i2++;
            } else {
                this.q = 0;
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(zzado zzadoVar) throws IOException {
        byte[] n = this.c.n();
        zzadd zzaddVar = (zzadd) zzadoVar;
        zzaddVar.F(n, 0, Uu2.g, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (n[(i2 * Xu2.A) + i] != 71) {
                    break;
                }
            }
            zzaddVar.h(i, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        if (this.a == 0) {
            zzadqVar = new zzakm(zzadqVar, this.f);
        }
        this.l = zzadqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
        if (r3 == false) goto L91;
     */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        long j;
        int i;
        zzaog zzaogVar;
        int i2;
        long j2;
        long f = zzadoVar.f();
        if (this.n) {
            if (f != -1) {
                zzany zzanyVar = this.j;
                if (!zzanyVar.d()) {
                    return zzanyVar.a(zzadoVar, zzaejVar, this.r);
                }
            }
            if (!this.f217o) {
                this.f217o = true;
                zzany zzanyVar2 = this.j;
                if (zzanyVar2.b() != C10323vs.b) {
                    j = -1;
                    j2 = 0;
                    zzanx zzanxVar = new zzanx(zzanyVar2.c(), zzanyVar2.b(), f, this.r, Xu2.B);
                    this.k = zzanxVar;
                    this.l.P(zzanxVar.b());
                } else {
                    j = -1;
                    j2 = 0;
                    this.l.P(new zzael(zzanyVar2.b(), 0L));
                }
            } else {
                j = -1;
                j2 = 0;
            }
            if (this.p) {
                this.p = false;
                e(j2, j2);
                if (zzadoVar.e() != j2) {
                    zzaejVar.a = j2;
                    return 1;
                }
            }
            zzanx zzanxVar2 = this.k;
            if (zzanxVar2 != null && zzanxVar2.e()) {
                return zzanxVar2.a(zzadoVar, zzaejVar);
            }
        } else {
            j = -1;
        }
        zzek zzekVar = this.c;
        byte[] n = zzekVar.n();
        if (9400 - zzekVar.w() < 188) {
            int u = zzekVar.u();
            if (u > 0) {
                System.arraycopy(n, zzekVar.w(), n, 0, u);
            }
            zzekVar.j(n, u);
        }
        while (zzekVar.u() < 188) {
            int x = zzekVar.x();
            int D = zzadoVar.D(n, x, 9400 - x);
            if (D == -1) {
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray = this.g;
                    if (i3 >= sparseArray.size()) {
                        return -1;
                    }
                    zzaog zzaogVar2 = (zzaog) sparseArray.valueAt(i3);
                    if (zzaogVar2 instanceof zzanl) {
                        zzanl zzanlVar = (zzanl) zzaogVar2;
                        if (zzanlVar.d(false)) {
                            zzanlVar.b(new zzek(), 1);
                        }
                    }
                    i3++;
                }
            } else {
                zzekVar.k(x + D);
            }
        }
        int w = zzekVar.w();
        int x2 = zzekVar.x();
        int a = zzaoh.a(zzekVar.n(), w, x2);
        zzekVar.l(a);
        int i4 = a + Xu2.A;
        if (i4 > x2) {
            this.q += a - w;
        } else {
            this.q = 0;
        }
        int x3 = zzekVar.x();
        if (i4 > x3) {
            return 0;
        }
        int A = zzekVar.A();
        if ((8388608 & A) != 0) {
            zzekVar.l(i4);
            return 0;
        }
        if ((4194304 & A) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i5 = A & 32;
        int i6 = (A >> 8) & 8191;
        if ((A & 16) != 0) {
            zzaogVar = (zzaog) this.g.get(i6);
        } else {
            zzaogVar = null;
        }
        if (zzaogVar == null) {
            zzekVar.l(i4);
            return 0;
        }
        int i7 = A & 15;
        SparseIntArray sparseIntArray = this.d;
        int i8 = sparseIntArray.get(i6, i7 - 1);
        sparseIntArray.put(i6, i7);
        if (i8 == i7) {
            zzekVar.l(i4);
            return 0;
        }
        if (i7 != ((i8 + 1) & 15)) {
            zzaogVar.c();
        }
        if (i5 != 0) {
            int G = zzekVar.G();
            if ((zzekVar.G() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i |= i2;
            zzekVar.m(G - 1);
        }
        boolean z = this.n;
        if (z || !this.i.get(i6, false)) {
            zzekVar.k(i4);
            zzaogVar.b(zzekVar, i);
            zzekVar.k(x3);
        }
        if (this.n && f != j) {
            this.p = true;
        }
        zzekVar.l(i4);
        return 0;
    }

    public zzaob(int i, int i2, zzakj zzakjVar, zzer zzerVar, zzaoe zzaoeVar, int i3) {
        this.e = zzaoeVar;
        this.a = i2;
        this.f = zzakjVar;
        this.b = Collections.singletonList(zzerVar);
        this.c = new zzek(new byte[Xu2.b0], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.d = new SparseIntArray();
        this.j = new zzany(Xu2.B);
        this.l = zzadq.h;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray a = zzaoeVar.a();
        int size = a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.g.put(a.keyAt(i4), (zzaog) a.valueAt(i4));
        }
        this.g.put(0, new zzant(new zzanz(this)));
    }
}
