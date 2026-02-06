package o;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o.HJ;

/* renamed from: o.Ly */
/* loaded from: classes.dex */
public final class C3597Ly {
    public static final int i = -1;
    public static final HJ.a<Integer> j = HJ.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);
    public static final HJ.a<Integer> k = HJ.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);
    public static final HJ.a<Range<Integer>> l = HJ.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);
    public final List<D10> a;
    public final HJ b;
    public final int c;
    public final Range<Integer> d;
    public final List<AbstractC3393Jv> e;
    public final boolean f;
    public final C4133Rk2 g;
    public final InterfaceC3784Nv h;

    /* renamed from: o.Ly$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(InterfaceC6743hD2<?> interfaceC6743hD2, a aVar);
    }

    public C3597Ly(List<D10> list, HJ hj, int i2, Range<Integer> range, List<AbstractC3393Jv> list2, boolean z, C4133Rk2 c4133Rk2, InterfaceC3784Nv interfaceC3784Nv) {
        this.a = list;
        this.b = hj;
        this.c = i2;
        this.d = range;
        this.e = Collections.unmodifiableList(list2);
        this.f = z;
        this.g = c4133Rk2;
        this.h = interfaceC3784Nv;
    }

    public static C3597Ly b() {
        return new a().h();
    }

    public List<AbstractC3393Jv> c() {
        return this.e;
    }

    public InterfaceC3784Nv d() {
        return this.h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.b.h(l, AbstractC4008Qd2.a);
        Objects.requireNonNull(range);
        return range;
    }

    public HJ f() {
        return this.b;
    }

    public List<D10> g() {
        return Collections.unmodifiableList(this.a);
    }

    public C4133Rk2 h() {
        return this.g;
    }

    public int i() {
        return this.c;
    }

    public boolean j() {
        return this.f;
    }

    /* renamed from: o.Ly$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Set<D10> a;
        public InterfaceC3849Om1 b;
        public int c;
        public Range<Integer> d;
        public List<AbstractC3393Jv> e;
        public boolean f;
        public C4341Tn1 g;
        public InterfaceC3784Nv h;

        public a() {
            this.a = new HashSet();
            this.b = C2569Bn1.u0();
            this.c = -1;
            this.d = AbstractC4008Qd2.a;
            this.e = new ArrayList();
            this.f = false;
            this.g = C4341Tn1.g();
        }

        public static a j(InterfaceC6743hD2<?> interfaceC6743hD2) {
            b K = interfaceC6743hD2.K(null);
            if (K != null) {
                a aVar = new a();
                K.a(interfaceC6743hD2, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC6743hD2.v(interfaceC6743hD2.toString()));
        }

        public static a k(C3597Ly c3597Ly) {
            return new a(c3597Ly);
        }

        public void a(Collection<AbstractC3393Jv> collection) {
            for (AbstractC3393Jv abstractC3393Jv : collection) {
                c(abstractC3393Jv);
            }
        }

        public void b(C4133Rk2 c4133Rk2) {
            this.g.f(c4133Rk2);
        }

        public void c(AbstractC3393Jv abstractC3393Jv) {
            if (this.e.contains(abstractC3393Jv)) {
                return;
            }
            this.e.add(abstractC3393Jv);
        }

        public <T> void d(HJ.a<T> aVar, T t) {
            this.b.h0(aVar, t);
        }

        public void e(HJ hj) {
            for (HJ.a<?> aVar : hj.f()) {
                Object h = this.b.h(aVar, null);
                Object j = hj.j(aVar);
                if (h instanceof AbstractC7603km1) {
                    ((AbstractC7603km1) h).a(((AbstractC7603km1) j).c());
                } else {
                    if (j instanceof AbstractC7603km1) {
                        j = ((AbstractC7603km1) j).clone();
                    }
                    this.b.M(aVar, hj.i(aVar), j);
                }
            }
        }

        public void f(D10 d10) {
            this.a.add(d10);
        }

        public void g(String str, Object obj) {
            this.g.i(str, obj);
        }

        public C3597Ly h() {
            return new C3597Ly(new ArrayList(this.a), C5932dw1.t0(this.b), this.c, this.d, new ArrayList(this.e), this.f, C4133Rk2.c(this.g), this.h);
        }

        public void i() {
            this.a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.b.h(C3597Ly.l, AbstractC4008Qd2.a);
        }

        public HJ m() {
            return this.b;
        }

        public Set<D10> n() {
            return this.a;
        }

        public Object o(String str) {
            return this.g.d(str);
        }

        public int p() {
            return this.c;
        }

        public boolean q() {
            return this.f;
        }

        public boolean r(AbstractC3393Jv abstractC3393Jv) {
            return this.e.remove(abstractC3393Jv);
        }

        public void s(D10 d10) {
            this.a.remove(d10);
        }

        public void t(InterfaceC3784Nv interfaceC3784Nv) {
            this.h = interfaceC3784Nv;
        }

        public void u(Range<Integer> range) {
            d(C3597Ly.l, range);
        }

        public void v(HJ hj) {
            this.b = C2569Bn1.v0(hj);
        }

        public void w(int i) {
            this.c = i;
        }

        public void x(boolean z) {
            this.f = z;
        }

        public a(C3597Ly c3597Ly) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = C2569Bn1.u0();
            this.c = -1;
            this.d = AbstractC4008Qd2.a;
            this.e = new ArrayList();
            this.f = false;
            this.g = C4341Tn1.g();
            hashSet.addAll(c3597Ly.a);
            this.b = C2569Bn1.v0(c3597Ly.b);
            this.c = c3597Ly.c;
            this.d = c3597Ly.d;
            this.e.addAll(c3597Ly.c());
            this.f = c3597Ly.j();
            this.g = C4341Tn1.h(c3597Ly.h());
        }
    }
}
