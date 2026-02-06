package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.C10079ur2;
import o.C10323vs;
import o.C10415wE;
import o.C10833xx0;
import o.C3031Gd2;
import o.C7463kC;
import o.C9286rb2;
import o.C9593sr2;
import o.G02;
import o.IX1;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC6859hi0;
import o.InterfaceC8921q70;
import o.InterfaceC9170r70;
import o.InterfaceC9309rh1;
import o.LZ1;
import o.M11;
import o.T11;
import o.VI;

@Deprecated
/* loaded from: classes2.dex */
public final class c implements InterfaceC4410Ug1, G02.a<C7463kC<b>> {
    public final b.a X;
    @InterfaceC11300zs1
    public final InterfaceC4261Sr2 Y;
    public final InterfaceC9170r70 Y0;
    public final T11 Z;
    @InterfaceC11300zs1
    public final C10415wE Z0;
    public final InterfaceC8921q70.a a1;
    public final M11 b1;
    public final InterfaceC9309rh1.a c1;
    public final InterfaceC10877y8 d1;
    public final C10079ur2 e1;
    public final VI f1;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a g1;
    public C9286rb2 h1;
    public C7463kC<b>[] i1;
    public G02 j1;

    public c(C9286rb2 c9286rb2, b.a aVar, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, VI vi, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar2, M11 m11, InterfaceC9309rh1.a aVar3, T11 t11, InterfaceC10877y8 interfaceC10877y8) {
        this.h1 = c9286rb2;
        this.X = aVar;
        this.Y = interfaceC4261Sr2;
        this.Z = t11;
        this.Z0 = c10415wE;
        this.Y0 = interfaceC9170r70;
        this.a1 = aVar2;
        this.b1 = m11;
        this.c1 = aVar3;
        this.d1 = interfaceC10877y8;
        this.f1 = vi;
        this.e1 = p(c9286rb2, interfaceC9170r70);
        C7463kC<b>[] t = t(0);
        this.i1 = t;
        this.j1 = vi.a(t);
    }

    public static C10079ur2 p(C9286rb2 c9286rb2, InterfaceC9170r70 interfaceC9170r70) {
        C9593sr2[] c9593sr2Arr = new C9593sr2[c9286rb2.f.length];
        int i = 0;
        while (true) {
            C9286rb2.b[] bVarArr = c9286rb2.f;
            if (i < bVarArr.length) {
                C10833xx0[] c10833xx0Arr = bVarArr[i].j;
                C10833xx0[] c10833xx0Arr2 = new C10833xx0[c10833xx0Arr.length];
                for (int i2 = 0; i2 < c10833xx0Arr.length; i2++) {
                    C10833xx0 c10833xx0 = c10833xx0Arr[i2];
                    c10833xx0Arr2[i2] = c10833xx0.c(interfaceC9170r70.d(c10833xx0));
                }
                c9593sr2Arr[i] = new C9593sr2(Integer.toString(i), c10833xx0Arr2);
                i++;
            } else {
                return new C10079ur2(c9593sr2Arr);
            }
        }
    }

    private static C7463kC<b>[] t(int i) {
        return new C7463kC[i];
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.j1.a();
    }

    public final C7463kC<b> b(InterfaceC6859hi0 interfaceC6859hi0, long j) {
        int c = this.e1.c(interfaceC6859hi0.n());
        return new C7463kC<>(this.h1.f[c].a, null, null, this.X.a(this.Z, this.h1, c, interfaceC6859hi0, this.Y, this.Z0), this, this.d1, j, this.Y0, this.a1, this.b1, this.c1);
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return this.j1.c();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        return this.j1.d(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        C7463kC<b>[] c7463kCArr;
        for (C7463kC<b> c7463kC : this.i1) {
            if (c7463kC.X == 2) {
                return c7463kC.e(j, lz1);
            }
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        return this.j1.f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        this.j1.g(j);
    }

    @Override // o.InterfaceC4410Ug1
    public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6859hi0 interfaceC6859hi0 = list.get(i);
            int c = this.e1.c(interfaceC6859hi0.n());
            for (int i2 = 0; i2 < interfaceC6859hi0.length(); i2++) {
                arrayList.add(new C3031Gd2(c, interfaceC6859hi0.g(i2)));
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        for (C7463kC<b> c7463kC : this.i1) {
            c7463kC.S(j);
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        return C10323vs.b;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        this.Z.b();
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.g1 = aVar;
        aVar.j(this);
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return this.e1;
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        for (C7463kC<b> c7463kC : this.i1) {
            c7463kC.r(j, z);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        InterfaceC6859hi0 interfaceC6859hi0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            IX1 ix1 = ix1Arr[i];
            if (ix1 != null) {
                C7463kC c7463kC = (C7463kC) ix1;
                if (interfaceC6859hi0Arr[i] != null && zArr[i]) {
                    ((b) c7463kC.C()).a(interfaceC6859hi0Arr[i]);
                    arrayList.add(c7463kC);
                } else {
                    c7463kC.P();
                    ix1Arr[i] = null;
                }
            }
            if (ix1Arr[i] == null && (interfaceC6859hi0 = interfaceC6859hi0Arr[i]) != null) {
                C7463kC<b> b = b(interfaceC6859hi0, j);
                arrayList.add(b);
                ix1Arr[i] = b;
                zArr2[i] = true;
            }
        }
        C7463kC<b>[] t = t(arrayList.size());
        this.i1 = t;
        arrayList.toArray(t);
        this.j1 = this.f1.a(this.i1);
        return j;
    }

    @Override // o.G02.a
    /* renamed from: u */
    public void l(C7463kC<b> c7463kC) {
        this.g1.l(this);
    }

    public void v() {
        for (C7463kC<b> c7463kC : this.i1) {
            c7463kC.P();
        }
        this.g1 = null;
    }

    public void w(C9286rb2 c9286rb2) {
        this.h1 = c9286rb2;
        for (C7463kC<b> c7463kC : this.i1) {
            c7463kC.C().d(c9286rb2);
        }
        this.g1.l(this);
    }
}
