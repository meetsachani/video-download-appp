package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.List;
import o.AbstractC10052ul;
import o.AbstractC2533Be1;
import o.AbstractC6044eO0;
import o.AbstractC6238fC;
import o.C10071up2;
import o.C10323vs;
import o.C10415wE;
import o.C10833xx0;
import o.C10901yE;
import o.C3087Gr2;
import o.C3894Oz0;
import o.C4041Qm;
import o.C6736hC;
import o.C8615or2;
import o.C8858pr2;
import o.C9286rb2;
import o.C9347rr;
import o.C9542sf;
import o.CL;
import o.FU;
import o.InterfaceC11300zs1;
import o.InterfaceC2631Ce1;
import o.InterfaceC4261Sr2;
import o.InterfaceC6493gC;
import o.InterfaceC6859hi0;
import o.LZ1;
import o.M11;
import o.OU;
import o.T11;

@Deprecated
/* loaded from: classes2.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {
    public final T11 a;
    public final int b;
    public final InterfaceC6493gC[] c;
    public final FU d;
    @InterfaceC11300zs1
    public final C10415wE e;
    public InterfaceC6859hi0 f;
    public C9286rb2 g;
    public int h;
    @InterfaceC11300zs1
    public IOException i;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0099a implements b.a {
        public final FU.a a;

        public C0099a(FU.a aVar) {
            this.a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(T11 t11, C9286rb2 c9286rb2, int i, InterfaceC6859hi0 interfaceC6859hi0, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, @InterfaceC11300zs1 C10415wE c10415wE) {
            FU a = this.a.a();
            if (interfaceC4261Sr2 != null) {
                a.s(interfaceC4261Sr2);
            }
            return new a(t11, c9286rb2, i, interfaceC6859hi0, a, c10415wE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractC10052ul {
        public final C9286rb2.b e;
        public final int f;

        public b(C9286rb2.b bVar, int i, int i2) {
            super(i2, bVar.k - 1);
            this.e = bVar;
            this.f = i;
        }

        @Override // o.InterfaceC2631Ce1
        public long a() {
            e();
            return this.e.e((int) f());
        }

        @Override // o.InterfaceC2631Ce1
        public long b() {
            return a() + this.e.c((int) f());
        }

        @Override // o.InterfaceC2631Ce1
        public OU d() {
            e();
            return new OU(this.e.a(this.f, (int) f()));
        }
    }

    public a(T11 t11, C9286rb2 c9286rb2, int i, InterfaceC6859hi0 interfaceC6859hi0, FU fu, @InterfaceC11300zs1 C10415wE c10415wE) {
        C10071up2 c10071up2;
        C8858pr2[] c8858pr2Arr;
        int i2;
        this.a = t11;
        this.g = c9286rb2;
        this.b = i;
        this.f = interfaceC6859hi0;
        this.d = fu;
        this.e = c10415wE;
        C9286rb2.b bVar = c9286rb2.f[i];
        this.c = new InterfaceC6493gC[interfaceC6859hi0.length()];
        for (int i3 = 0; i3 < this.c.length; i3++) {
            int g = interfaceC6859hi0.g(i3);
            C10833xx0 c10833xx0 = bVar.j[g];
            if (c10833xx0.j1 != null) {
                c8858pr2Arr = ((C9286rb2.a) C9542sf.g(c9286rb2.e)).c;
                c10071up2 = null;
            } else {
                c10071up2 = null;
                c8858pr2Arr = null;
            }
            int i4 = bVar.a;
            if (i4 == 2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            this.c[i3] = new C9347rr(new C3894Oz0(3, c10071up2, new C8615or2(g, i4, bVar.c, C10323vs.b, c9286rb2.g, c10833xx0, 0, c8858pr2Arr, i2, null, null)), bVar.a, c10833xx0);
        }
    }

    public static AbstractC2533Be1 l(C10833xx0 c10833xx0, FU fu, Uri uri, int i, long j, long j2, long j3, int i2, @InterfaceC11300zs1 Object obj, InterfaceC6493gC interfaceC6493gC, @InterfaceC11300zs1 C10901yE c10901yE) {
        AbstractC6044eO0<String, String> a;
        if (c10901yE == null) {
            a = AbstractC6044eO0.u();
        } else {
            a = c10901yE.a();
        }
        return new CL(fu, new OU.b().j(uri).f(a).a(), c10833xx0, i2, obj, j, j2, j3, C10323vs.b, i, 1, j, interfaceC6493gC);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void a(InterfaceC6859hi0 interfaceC6859hi0) {
        this.f = interfaceC6859hi0;
    }

    @Override // o.InterfaceC7706lC
    public void b() throws IOException {
        IOException iOException = this.i;
        if (iOException == null) {
            this.a.b();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void d(C9286rb2 c9286rb2) {
        C9286rb2.b[] bVarArr = this.g.f;
        int i = this.b;
        C9286rb2.b bVar = bVarArr[i];
        int i2 = bVar.k;
        C9286rb2.b bVar2 = c9286rb2.f[i];
        if (i2 != 0 && bVar2.k != 0) {
            int i3 = i2 - 1;
            long e = bVar.e(i3) + bVar.c(i3);
            long e2 = bVar2.e(0);
            if (e <= e2) {
                this.h += i2;
            } else {
                this.h += bVar.d(e2);
            }
        } else {
            this.h += i2;
        }
        this.g = c9286rb2;
    }

    @Override // o.InterfaceC7706lC
    public long e(long j, LZ1 lz1) {
        long j2;
        C9286rb2.b bVar = this.g.f[this.b];
        int d = bVar.d(j);
        long e = bVar.e(d);
        if (e < j && d < bVar.k - 1) {
            j2 = bVar.e(d + 1);
        } else {
            j2 = e;
        }
        return lz1.a(j, e, j2);
    }

    @Override // o.InterfaceC7706lC
    public boolean f(AbstractC6238fC abstractC6238fC, boolean z, M11.d dVar, M11 m11) {
        M11.b b2 = m11.b(C3087Gr2.c(this.f), dVar);
        if (z && b2 != null && b2.a == 2) {
            InterfaceC6859hi0 interfaceC6859hi0 = this.f;
            if (interfaceC6859hi0.h(interfaceC6859hi0.o(abstractC6238fC.d), b2.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.InterfaceC7706lC
    public void g() {
        for (InterfaceC6493gC interfaceC6493gC : this.c) {
            interfaceC6493gC.g();
        }
    }

    @Override // o.InterfaceC7706lC
    public boolean h(long j, AbstractC6238fC abstractC6238fC, List<? extends AbstractC2533Be1> list) {
        if (this.i != null) {
            return false;
        }
        return this.f.e(j, abstractC6238fC, list);
    }

    @Override // o.InterfaceC7706lC
    public final void j(long j, long j2, List<? extends AbstractC2533Be1> list, C6736hC c6736hC) {
        List<? extends AbstractC2533Be1> list2;
        int g;
        C10901yE e;
        long j3 = j2;
        if (this.i != null) {
            return;
        }
        C9286rb2 c9286rb2 = this.g;
        C9286rb2.b bVar = c9286rb2.f[this.b];
        if (bVar.k == 0) {
            c6736hC.b = !c9286rb2.d;
            return;
        }
        if (list.isEmpty()) {
            g = bVar.d(j3);
            list2 = list;
        } else {
            list2 = list;
            g = (int) (list2.get(list.size() - 1).g() - this.h);
            if (g < 0) {
                this.i = new C4041Qm();
                return;
            }
        }
        if (g >= bVar.k) {
            c6736hC.b = !this.g.d;
            return;
        }
        long j4 = j3 - j;
        long m = m(j);
        int length = this.f.length();
        InterfaceC2631Ce1[] interfaceC2631Ce1Arr = new InterfaceC2631Ce1[length];
        for (int i = 0; i < length; i++) {
            interfaceC2631Ce1Arr[i] = new b(bVar, this.f.g(i), g);
        }
        this.f.l(j, j4, m, list2, interfaceC2631Ce1Arr);
        long e2 = bVar.e(g);
        long c = e2 + bVar.c(g);
        if (!list.isEmpty()) {
            j3 = C10323vs.b;
        }
        long j5 = j3;
        int i2 = g + this.h;
        int f = this.f.f();
        InterfaceC6493gC interfaceC6493gC = this.c[f];
        Uri a = bVar.a(this.f.g(f), g);
        C10415wE c10415wE = this.e;
        if (c10415wE == null) {
            e = null;
        } else {
            e = new C10901yE(c10415wE, this.f, j4, "s", this.g.d).d(c - e2).e(C10901yE.c(this.f));
        }
        c6736hC.a = l(this.f.t(), this.d, a, i2, e2, c, j5, this.f.u(), this.f.j(), interfaceC6493gC, e);
    }

    @Override // o.InterfaceC7706lC
    public int k(long j, List<? extends AbstractC2533Be1> list) {
        if (this.i == null && this.f.length() >= 2) {
            return this.f.r(j, list);
        }
        return list.size();
    }

    public final long m(long j) {
        C9286rb2 c9286rb2 = this.g;
        if (!c9286rb2.d) {
            return C10323vs.b;
        }
        C9286rb2.b bVar = c9286rb2.f[this.b];
        int i = bVar.k - 1;
        return (bVar.e(i) + bVar.c(i)) - j;
    }

    @Override // o.InterfaceC7706lC
    public void i(AbstractC6238fC abstractC6238fC) {
    }
}
