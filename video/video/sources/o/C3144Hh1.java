package o;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InterfaceC7583kh1;
import o.U52;

@Deprecated
/* renamed from: o.Hh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3144Hh1 {
    public static final String m = "MediaSourceList";
    public final ND1 a;
    public final d e;
    public final F8 h;
    public final InterfaceC5285bG0 i;
    public boolean k;
    @InterfaceC11300zs1
    public InterfaceC4261Sr2 l;
    public U52 j = new U52.a(0);
    public final IdentityHashMap<InterfaceC4410Ug1, c> c = new IdentityHashMap<>();
    public final Map<Object, c> d = new HashMap();
    public final List<c> b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final Set<c> g = new HashSet();

    /* renamed from: o.Hh1$a */
    /* loaded from: classes2.dex */
    public final class a implements InterfaceC9309rh1, InterfaceC8921q70 {
        public final c X;

        public a(c cVar) {
            this.X = cVar;
        }

        @InterfaceC11300zs1
        public final Pair<Integer, InterfaceC7583kh1.b> M(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            InterfaceC7583kh1.b bVar2 = null;
            if (bVar != null) {
                InterfaceC7583kh1.b o2 = C3144Hh1.o(this.X, bVar);
                if (o2 == null) {
                    return null;
                }
                bVar2 = o2;
            }
            return Pair.create(Integer.valueOf(C3144Hh1.t(this.X, i)), bVar2);
        }

        @Override // o.InterfaceC8921q70
        public void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.xh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.d0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second);
                    }
                });
            }
        }

        @Override // o.InterfaceC8921q70
        public void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Ch1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.e(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void f0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Dh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.f0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, n11, c10519wf1);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void h0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1, final IOException iOException, final boolean z) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Gh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.h0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, n11, c10519wf1, iOException, z);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void i(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final C10519wf1 c10519wf1) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.wh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.i(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) C9542sf.g((InterfaceC7583kh1.b) M.second), c10519wf1);
                    }
                });
            }
        }

        @Override // o.InterfaceC8921q70
        public void l(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final int i2) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Eh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.l(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, i2);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void m0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Fh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.m0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, n11, c10519wf1);
                    }
                });
            }
        }

        @Override // o.InterfaceC8921q70
        public void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Bh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.n(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, exc);
                    }
                });
            }
        }

        @Override // o.InterfaceC8921q70
        public void n0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.Ah1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.n0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void p(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final C10519wf1 c10519wf1) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.zh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.p(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, c10519wf1);
                    }
                });
            }
        }

        @Override // o.InterfaceC8921q70
        public void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.yh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.u0(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second);
                    }
                });
            }
        }

        @Override // o.InterfaceC9309rh1
        public void y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, final N11 n11, final C10519wf1 c10519wf1) {
            final Pair<Integer, InterfaceC7583kh1.b> M = M(i, bVar);
            if (M != null) {
                C3144Hh1.this.i.k(new Runnable() { // from class: o.vh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3144Hh1.this.h.y(((Integer) r1.first).intValue(), (InterfaceC7583kh1.b) M.second, n11, c10519wf1);
                    }
                });
            }
        }
    }

    /* renamed from: o.Hh1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final InterfaceC7583kh1 a;
        public final InterfaceC7583kh1.c b;
        public final a c;

        public b(InterfaceC7583kh1 interfaceC7583kh1, InterfaceC7583kh1.c cVar, a aVar) {
            this.a = interfaceC7583kh1;
            this.b = cVar;
            this.c = aVar;
        }
    }

    /* renamed from: o.Hh1$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC9795th1 {
        public final K81 a;
        public int d;
        public boolean e;
        public final List<InterfaceC7583kh1.b> c = new ArrayList();
        public final Object b = new Object();

        public c(InterfaceC7583kh1 interfaceC7583kh1, boolean z) {
            this.a = new K81(interfaceC7583kh1, z);
        }

        @Override // o.InterfaceC9795th1
        public Object a() {
            return this.b;
        }

        @Override // o.InterfaceC9795th1
        public AbstractC7373jp2 b() {
            return this.a.S0();
        }

        public void c(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }
    }

    /* renamed from: o.Hh1$d */
    /* loaded from: classes2.dex */
    public interface d {
        void c();
    }

    public C3144Hh1(d dVar, F8 f8, InterfaceC5285bG0 interfaceC5285bG0, ND1 nd1) {
        this.a = nd1;
        this.e = dVar;
        this.h = f8;
        this.i = interfaceC5285bG0;
    }

    public static Object n(Object obj) {
        return AbstractC8892q0.D(obj);
    }

    @InterfaceC11300zs1
    public static InterfaceC7583kh1.b o(c cVar, InterfaceC7583kh1.b bVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (cVar.c.get(i).d == bVar.d) {
                return bVar.a(q(cVar, bVar.a));
            }
        }
        return null;
    }

    public static Object p(Object obj) {
        return AbstractC8892q0.E(obj);
    }

    public static Object q(c cVar, Object obj) {
        return AbstractC8892q0.G(cVar.b, obj);
    }

    public static int t(c cVar, int i) {
        return i + cVar.d;
    }

    public void A() {
        for (b bVar : this.f.values()) {
            try {
                bVar.a.u(bVar.b);
            } catch (RuntimeException e) {
                I31.e(m, "Failed to release child source.", e);
            }
            bVar.a.U(bVar.c);
            bVar.a.o(bVar.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void B(InterfaceC4410Ug1 interfaceC4410Ug1) {
        c cVar = (c) C9542sf.g(this.c.remove(interfaceC4410Ug1));
        cVar.a.s(interfaceC4410Ug1);
        cVar.c.remove(((J81) interfaceC4410Ug1).X);
        if (!this.c.isEmpty()) {
            l();
        }
        v(cVar);
    }

    public AbstractC7373jp2 C(int i, int i2, U52 u52) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= s()) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.j = u52;
        D(i, i2);
        return j();
    }

    public final void D(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c remove = this.b.remove(i3);
            this.d.remove(remove.b);
            h(i3, -remove.a.S0().w());
            remove.e = true;
            if (this.k) {
                v(remove);
            }
        }
    }

    public AbstractC7373jp2 E(List<c> list, U52 u52) {
        D(0, this.b.size());
        return f(this.b.size(), list, u52);
    }

    public AbstractC7373jp2 F(U52 u52) {
        int s = s();
        if (u52.getLength() != s) {
            u52 = u52.e().g(0, s);
        }
        this.j = u52;
        return j();
    }

    public AbstractC7373jp2 f(int i, List<c> list, U52 u52) {
        if (!list.isEmpty()) {
            this.j = u52;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.b.get(i2 - 1);
                    cVar.c(cVar2.d + cVar2.a.S0().w());
                } else {
                    cVar.c(0);
                }
                h(i2, cVar.a.S0().w());
                this.b.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    z(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        k(cVar);
                    }
                }
            }
        }
        return j();
    }

    public AbstractC7373jp2 g(@InterfaceC11300zs1 U52 u52) {
        if (u52 == null) {
            u52 = this.j.e();
        }
        this.j = u52;
        D(0, s());
        return j();
    }

    public final void h(int i, int i2) {
        while (i < this.b.size()) {
            this.b.get(i).d += i2;
            i++;
        }
    }

    public InterfaceC4410Ug1 i(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        Object p = p(bVar.a);
        InterfaceC7583kh1.b a2 = bVar.a(n(bVar.a));
        c cVar = (c) C9542sf.g(this.d.get(p));
        m(cVar);
        cVar.c.add(a2);
        J81 h = cVar.a.h(a2, interfaceC10877y8, j);
        this.c.put(h, cVar);
        l();
        return h;
    }

    public AbstractC7373jp2 j() {
        if (this.b.isEmpty()) {
            return AbstractC7373jp2.X;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            c cVar = this.b.get(i2);
            cVar.d = i;
            i += cVar.a.S0().w();
        }
        return new QD1(this.b, this.j);
    }

    public final void k(c cVar) {
        b bVar = this.f.get(cVar);
        if (bVar != null) {
            bVar.a.T(bVar.b);
        }
    }

    public final void l() {
        Iterator<c> it = this.g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c.isEmpty()) {
                k(next);
                it.remove();
            }
        }
    }

    public final void m(c cVar) {
        this.g.add(cVar);
        b bVar = this.f.get(cVar);
        if (bVar != null) {
            bVar.a.A(bVar.b);
        }
    }

    public U52 r() {
        return this.j;
    }

    public int s() {
        return this.b.size();
    }

    public boolean u() {
        return this.k;
    }

    public final void v(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) C9542sf.g(this.f.remove(cVar));
            bVar.a.u(bVar.b);
            bVar.a.U(bVar.c);
            bVar.a.o(bVar.c);
            this.g.remove(cVar);
        }
    }

    public AbstractC7373jp2 w(int i, int i2, U52 u52) {
        return x(i, i + 1, i2, u52);
    }

    public AbstractC7373jp2 x(int i, int i2, int i3, U52 u52) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= s() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.j = u52;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = this.b.get(min).d;
            TD2.i1(this.b, i, i2, i3);
            while (min <= max) {
                c cVar = this.b.get(min);
                cVar.d = i4;
                i4 += cVar.a.S0().w();
                min++;
            }
            return j();
        }
        return j();
    }

    public void y(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.i(!this.k);
        this.l = interfaceC4261Sr2;
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            z(cVar);
            this.g.add(cVar);
        }
        this.k = true;
    }

    public final void z(c cVar) {
        K81 k81 = cVar.a;
        InterfaceC7583kh1.c cVar2 = new InterfaceC7583kh1.c() { // from class: o.uh1
            @Override // o.InterfaceC7583kh1.c
            public final void L(InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
                C3144Hh1.this.e.c();
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(k81, cVar2, aVar));
        k81.V(TD2.E(), aVar);
        k81.m(TD2.E(), aVar);
        k81.G(cVar2, this.l, this.a);
    }
}
