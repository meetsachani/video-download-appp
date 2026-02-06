package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

@InterfaceC11149zF0
@InterfaceC6329fa0
@InterfaceC4238Sm
/* renamed from: o.ou2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8627ou2<C extends Comparable<?>> extends L2<C> implements Serializable {
    @InterfaceC5299bJ2
    public final NavigableMap<PT<C>, PN1<C>> X;
    @MB
    public transient Set<PN1<C>> Y;
    @MB
    public transient VN1<C> Y0;
    @MB
    public transient Set<PN1<C>> Z;

    /* renamed from: o.ou2$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC4473Ux0<PN1<C>> implements Set<PN1<C>> {
        public final Collection<PN1<C>> X;

        public b(C8627ou2 c8627ou2, Collection<PN1<C>> collection) {
            this.X = collection;
        }

        @Override // o.AbstractC4473Ux0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Collection<PN1<C>> L5() {
            return this.X;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            return C10856y22.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10856y22.k(this);
        }
    }

    /* renamed from: o.ou2$c */
    /* loaded from: classes3.dex */
    public final class c extends C8627ou2<C> {
        public c() {
            super(new d(C8627ou2.this.X));
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public void b(PN1<C> pn1) {
            C8627ou2.this.c(pn1);
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public void c(PN1<C> pn1) {
            C8627ou2.this.b(pn1);
        }

        @Override // o.C8627ou2, o.VN1
        public VN1<C> d() {
            return C8627ou2.this;
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public boolean e(C c) {
            return !C8627ou2.this.e(c);
        }
    }

    /* renamed from: o.ou2$d */
    /* loaded from: classes3.dex */
    public static final class d<C extends Comparable<?>> extends AbstractC8413o2<PT<C>, PN1<C>> {
        public final NavigableMap<PT<C>, PN1<C>> X;
        public final NavigableMap<PT<C>, PN1<C>> Y;
        public final PN1<PT<C>> Z;

        /* renamed from: o.ou2$d$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ PT Y0;
            public PT<C> Z;
            public final /* synthetic */ InterfaceC8699pC1 Z0;

            public a(PT pt, InterfaceC8699pC1 interfaceC8699pC1) {
                this.Y0 = pt;
                this.Z0 = interfaceC8699pC1;
                this.Z = pt;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                PN1 k;
                if (!d.this.Z.Y.q(this.Z) && this.Z != PT.e()) {
                    if (this.Z0.hasNext()) {
                        PN1 pn1 = (PN1) this.Z0.next();
                        k = PN1.k(this.Z, pn1.X);
                        this.Z = pn1.Y;
                    } else {
                        k = PN1.k(this.Z, PT.e());
                        this.Z = PT.e();
                    }
                    return C7935m81.O(k.X, k);
                }
                return (Map.Entry) c();
            }
        }

        /* renamed from: o.ou2$d$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ PT Y0;
            public PT<C> Z;
            public final /* synthetic */ InterfaceC8699pC1 Z0;

            public b(PT pt, InterfaceC8699pC1 interfaceC8699pC1) {
                this.Y0 = pt;
                this.Z0 = interfaceC8699pC1;
                this.Z = pt;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                if (this.Z == PT.h()) {
                    return (Map.Entry) c();
                }
                if (this.Z0.hasNext()) {
                    PN1 pn1 = (PN1) this.Z0.next();
                    PN1 k = PN1.k(pn1.Y, this.Z);
                    this.Z = pn1.X;
                    if (d.this.Z.X.q(k.X)) {
                        return C7935m81.O(k.X, k);
                    }
                } else if (d.this.Z.X.q(PT.h())) {
                    PN1 k2 = PN1.k(PT.h(), this.Z);
                    this.Z = PT.h();
                    return C7935m81.O(PT.h(), k2);
                }
                return (Map.Entry) c();
            }
        }

        public d(NavigableMap<PT<C>, PN1<C>> navigableMap) {
            this(navigableMap, PN1.a());
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<PT<C>, PN1<C>>> a() {
            Collection<PN1<C>> values;
            PT pt;
            boolean z;
            if (this.Z.q()) {
                NavigableMap<PT<C>, PN1<C>> navigableMap = this.Y;
                PT<C> y = this.Z.y();
                if (this.Z.x() == EnumC6886hp.CLOSED) {
                    z = true;
                } else {
                    z = false;
                }
                values = navigableMap.tailMap(y, z).values();
            } else {
                values = this.Y.values();
            }
            InterfaceC8699pC1 S = C7052iU0.S(values.iterator());
            if (this.Z.i(PT.h()) && (!S.hasNext() || ((PN1) S.peek()).X != PT.h())) {
                pt = PT.h();
            } else if (S.hasNext()) {
                pt = ((PN1) S.next()).Y;
            } else {
                return C7052iU0.u();
            }
            return new a(pt, S);
        }

        @Override // o.AbstractC8413o2
        public Iterator<Map.Entry<PT<C>, PN1<C>>> b() {
            PT<C> e;
            boolean z;
            PT<C> higherKey;
            if (this.Z.r()) {
                e = this.Z.J();
            } else {
                e = PT.e();
            }
            if (this.Z.r() && this.Z.I() == EnumC6886hp.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC8699pC1 S = C7052iU0.S(this.Y.headMap(e, z).descendingMap().values().iterator());
            if (S.hasNext()) {
                if (((PN1) S.peek()).Y == PT.e()) {
                    higherKey = ((PN1) S.next()).X;
                } else {
                    higherKey = this.X.higherKey(((PN1) S.peek()).Y);
                }
            } else if (this.Z.i(PT.h()) && !this.X.containsKey(PT.h())) {
                higherKey = this.X.higherKey(PT.h());
            } else {
                return C7052iU0.u();
            }
            return new b((PT) C3743Nk1.a(higherKey, PT.e()), S);
        }

        @Override // java.util.SortedMap
        public Comparator<? super PT<C>> comparator() {
            return AbstractC10587ww1.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8413o2, java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: d */
        public PN1<C> get(@MB Object obj) {
            if (obj instanceof PT) {
                try {
                    PT<C> pt = (PT) obj;
                    Map.Entry<PT<C>, PN1<C>> firstEntry = tailMap(pt, true).firstEntry();
                    if (firstEntry != null && firstEntry.getKey().equals(pt)) {
                        return firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: e */
        public NavigableMap<PT<C>, PN1<C>> headMap(PT<C> pt, boolean z) {
            return g(PN1.G(pt, EnumC6886hp.g(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap<PT<C>, PN1<C>> subMap(PT<C> pt, boolean z, PT<C> pt2, boolean z2) {
            return g(PN1.B(pt, EnumC6886hp.g(z), pt2, EnumC6886hp.g(z2)));
        }

        public final NavigableMap<PT<C>, PN1<C>> g(PN1<PT<C>> pn1) {
            if (!this.Z.t(pn1)) {
                return C9967uO0.y0();
            }
            return new d(this.X, pn1.s(this.Z));
        }

        @Override // java.util.NavigableMap
        /* renamed from: i */
        public NavigableMap<PT<C>, PN1<C>> tailMap(PT<C> pt, boolean z) {
            return g(PN1.l(pt, EnumC6886hp.g(z)));
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return C7052iU0.Z(a());
        }

        public d(NavigableMap<PT<C>, PN1<C>> navigableMap, PN1<PT<C>> pn1) {
            this.X = navigableMap;
            this.Y = new e(navigableMap);
            this.Z = pn1;
        }
    }

    /* renamed from: o.ou2$f */
    /* loaded from: classes3.dex */
    public final class f extends C8627ou2<C> {
        public final PN1<C> Z0;

        public f(PN1<C> pn1) {
            super(new g(PN1.a(), pn1, C8627ou2.this.X));
            this.Z0 = pn1;
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public void b(PN1<C> pn1) {
            if (pn1.t(this.Z0)) {
                C8627ou2.this.b(pn1.s(this.Z0));
            }
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public void c(PN1<C> pn1) {
            C10664xF1.y(this.Z0.n(pn1), "Cannot add range %s to subRangeSet(%s)", pn1, this.Z0);
            C8627ou2.this.c(pn1);
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public void clear() {
            C8627ou2.this.b(this.Z0);
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public boolean e(C c) {
            if (this.Z0.i(c) && C8627ou2.this.e(c)) {
                return true;
            }
            return false;
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        public boolean g(PN1<C> pn1) {
            PN1 v;
            if (this.Z0.u() || !this.Z0.n(pn1) || (v = C8627ou2.this.v(pn1)) == null || v.s(this.Z0).u()) {
                return false;
            }
            return true;
        }

        @Override // o.C8627ou2, o.VN1
        public VN1<C> k(PN1<C> pn1) {
            if (pn1.n(this.Z0)) {
                return this;
            }
            if (pn1.t(this.Z0)) {
                return new f(this.Z0.s(pn1));
            }
            return C9238rO0.E();
        }

        @Override // o.C8627ou2, o.L2, o.VN1
        @MB
        public PN1<C> l(C c) {
            PN1<C> l;
            if (!this.Z0.i(c) || (l = C8627ou2.this.l(c)) == null) {
                return null;
            }
            return l.s(this.Z0);
        }
    }

    /* renamed from: o.ou2$g */
    /* loaded from: classes3.dex */
    public static final class g<C extends Comparable<?>> extends AbstractC8413o2<PT<C>, PN1<C>> {
        public final PN1<PT<C>> X;
        public final PN1<C> Y;
        public final NavigableMap<PT<C>, PN1<C>> Y0;
        public final NavigableMap<PT<C>, PN1<C>> Z;

        /* renamed from: o.ou2$g$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ PT Y0;
            public final /* synthetic */ Iterator Z;

            public a(Iterator it, PT pt) {
                this.Z = it;
                this.Y0 = pt;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                if (!this.Z.hasNext()) {
                    return (Map.Entry) c();
                }
                PN1 pn1 = (PN1) this.Z.next();
                if (this.Y0.q(pn1.X)) {
                    return (Map.Entry) c();
                }
                PN1 s = pn1.s(g.this.Y);
                return C7935m81.O(s.X, s);
            }
        }

        /* renamed from: o.ou2$g$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ Iterator Z;

            public b(Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                if (!this.Z.hasNext()) {
                    return (Map.Entry) c();
                }
                PN1 pn1 = (PN1) this.Z.next();
                if (g.this.Y.X.compareTo(pn1.Y) >= 0) {
                    return (Map.Entry) c();
                }
                PN1 s = pn1.s(g.this.Y);
                if (g.this.X.i(s.X)) {
                    return C7935m81.O(s.X, s);
                }
                return (Map.Entry) c();
            }
        }

        private NavigableMap<PT<C>, PN1<C>> i(PN1<PT<C>> pn1) {
            if (!pn1.t(this.X)) {
                return C9967uO0.y0();
            }
            return new g(this.X.s(pn1), this.Y, this.Z);
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<PT<C>, PN1<C>>> a() {
            Iterator<PN1<C>> it;
            if (this.Y.u()) {
                return C7052iU0.u();
            }
            if (this.X.Y.q(this.Y.X)) {
                return C7052iU0.u();
            }
            boolean z = false;
            if (this.X.X.q(this.Y.X)) {
                it = this.Y0.tailMap(this.Y.X, false).values().iterator();
            } else {
                NavigableMap<PT<C>, PN1<C>> navigableMap = this.Z;
                PT<C> o2 = this.X.X.o();
                if (this.X.x() == EnumC6886hp.CLOSED) {
                    z = true;
                }
                it = navigableMap.tailMap(o2, z).values().iterator();
            }
            return new a(it, (PT) AbstractC10587ww1.z().w(this.X.Y, PT.i(this.Y.Y)));
        }

        @Override // o.AbstractC8413o2
        public Iterator<Map.Entry<PT<C>, PN1<C>>> b() {
            boolean z;
            if (this.Y.u()) {
                return C7052iU0.u();
            }
            PT pt = (PT) AbstractC10587ww1.z().w(this.X.Y, PT.i(this.Y.Y));
            NavigableMap<PT<C>, PN1<C>> navigableMap = this.Z;
            PT<C> pt2 = (PT) pt.o();
            if (pt.t() == EnumC6886hp.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            return new b(navigableMap.headMap(pt2, z).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super PT<C>> comparator() {
            return AbstractC10587ww1.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8413o2, java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public PN1<C> get(@MB Object obj) {
            if (obj instanceof PT) {
                try {
                    PT<C> pt = (PT) obj;
                    if (this.X.i(pt) && pt.compareTo(this.Y.X) >= 0 && pt.compareTo(this.Y.Y) < 0) {
                        if (pt.equals(this.Y.X)) {
                            PN1 pn1 = (PN1) C7935m81.P0(this.Z.floorEntry(pt));
                            if (pn1 != null && pn1.Y.compareTo(this.Y.X) > 0) {
                                return pn1.s(this.Y);
                            }
                        } else {
                            PN1<C> pn12 = this.Z.get(pt);
                            if (pn12 != null) {
                                return pn12.s(this.Y);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap<PT<C>, PN1<C>> headMap(PT<C> pt, boolean z) {
            return i(PN1.G(pt, EnumC6886hp.g(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: g */
        public NavigableMap<PT<C>, PN1<C>> subMap(PT<C> pt, boolean z, PT<C> pt2, boolean z2) {
            return i(PN1.B(pt, EnumC6886hp.g(z), pt2, EnumC6886hp.g(z2)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: j */
        public NavigableMap<PT<C>, PN1<C>> tailMap(PT<C> pt, boolean z) {
            return i(PN1.l(pt, EnumC6886hp.g(z)));
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return C7052iU0.Z(a());
        }

        public g(PN1<PT<C>> pn1, PN1<C> pn12, NavigableMap<PT<C>, PN1<C>> navigableMap) {
            this.X = (PN1) C10664xF1.E(pn1);
            this.Y = (PN1) C10664xF1.E(pn12);
            this.Z = (NavigableMap) C10664xF1.E(navigableMap);
            this.Y0 = new e(navigableMap);
        }
    }

    public static <C extends Comparable<?>> C8627ou2<C> s() {
        return new C8627ou2<>(new TreeMap());
    }

    public static <C extends Comparable<?>> C8627ou2<C> t(Iterable<PN1<C>> iterable) {
        C8627ou2<C> s = s();
        s.h(iterable);
        return s;
    }

    public static <C extends Comparable<?>> C8627ou2<C> u(VN1<C> vn1) {
        C8627ou2<C> s = s();
        s.f(vn1);
        return s;
    }

    @Override // o.VN1
    public PN1<C> a() {
        Map.Entry<PT<C>, PN1<C>> firstEntry = this.X.firstEntry();
        Map.Entry<PT<C>, PN1<C>> lastEntry = this.X.lastEntry();
        if (firstEntry != null && lastEntry != null) {
            return PN1.k(firstEntry.getValue().X, lastEntry.getValue().Y);
        }
        throw new NoSuchElementException();
    }

    @Override // o.L2, o.VN1
    public void b(PN1<C> pn1) {
        C10664xF1.E(pn1);
        if (pn1.u()) {
            return;
        }
        Map.Entry<PT<C>, PN1<C>> lowerEntry = this.X.lowerEntry(pn1.X);
        if (lowerEntry != null) {
            PN1<C> value = lowerEntry.getValue();
            if (value.Y.compareTo(pn1.X) >= 0) {
                if (pn1.r() && value.Y.compareTo(pn1.Y) >= 0) {
                    w(PN1.k(pn1.Y, value.Y));
                }
                w(PN1.k(value.X, pn1.X));
            }
        }
        Map.Entry<PT<C>, PN1<C>> floorEntry = this.X.floorEntry(pn1.Y);
        if (floorEntry != null) {
            PN1<C> value2 = floorEntry.getValue();
            if (pn1.r() && value2.Y.compareTo(pn1.Y) >= 0) {
                w(PN1.k(pn1.Y, value2.Y));
            }
        }
        this.X.subMap(pn1.X, pn1.Y).clear();
    }

    @Override // o.L2, o.VN1
    public void c(PN1<C> pn1) {
        C10664xF1.E(pn1);
        if (pn1.u()) {
            return;
        }
        PT<C> pt = pn1.X;
        PT<C> pt2 = pn1.Y;
        Map.Entry<PT<C>, PN1<C>> lowerEntry = this.X.lowerEntry(pt);
        if (lowerEntry != null) {
            PN1<C> value = lowerEntry.getValue();
            if (value.Y.compareTo(pt) >= 0) {
                if (value.Y.compareTo(pt2) >= 0) {
                    pt2 = value.Y;
                }
                pt = value.X;
            }
        }
        Map.Entry<PT<C>, PN1<C>> floorEntry = this.X.floorEntry(pt2);
        if (floorEntry != null) {
            PN1<C> value2 = floorEntry.getValue();
            if (value2.Y.compareTo(pt2) >= 0) {
                pt2 = value2.Y;
            }
        }
        this.X.subMap(pt, pt2).clear();
        w(PN1.k(pt, pt2));
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.VN1
    public VN1<C> d() {
        VN1<C> vn1 = this.Y0;
        if (vn1 == null) {
            c cVar = new c();
            this.Y0 = cVar;
            return cVar;
        }
        return vn1;
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean e(Comparable comparable) {
        return super.e(comparable);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void f(VN1 vn1) {
        super.f(vn1);
    }

    @Override // o.L2, o.VN1
    public boolean g(PN1<C> pn1) {
        C10664xF1.E(pn1);
        Map.Entry<PT<C>, PN1<C>> floorEntry = this.X.floorEntry(pn1.X);
        if (floorEntry != null && floorEntry.getValue().n(pn1)) {
            return true;
        }
        return false;
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void h(Iterable iterable) {
        super.h(iterable);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean i(VN1 vn1) {
        return super.i(vn1);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void j(Iterable iterable) {
        super.j(iterable);
    }

    @Override // o.VN1
    public VN1<C> k(PN1<C> pn1) {
        if (pn1.equals(PN1.a())) {
            return this;
        }
        return new f(pn1);
    }

    @Override // o.L2, o.VN1
    @MB
    public PN1<C> l(C c2) {
        C10664xF1.E(c2);
        Map.Entry<PT<C>, PN1<C>> floorEntry = this.X.floorEntry(PT.i(c2));
        if (floorEntry != null && floorEntry.getValue().i(c2)) {
            return floorEntry.getValue();
        }
        return null;
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ boolean m(Iterable iterable) {
        return super.m(iterable);
    }

    @Override // o.L2, o.VN1
    public /* bridge */ /* synthetic */ void n(VN1 vn1) {
        super.n(vn1);
    }

    @Override // o.L2, o.VN1
    public boolean o(PN1<C> pn1) {
        C10664xF1.E(pn1);
        Map.Entry<PT<C>, PN1<C>> ceilingEntry = this.X.ceilingEntry(pn1.X);
        if (ceilingEntry != null && ceilingEntry.getValue().t(pn1) && !ceilingEntry.getValue().s(pn1).u()) {
            return true;
        }
        Map.Entry<PT<C>, PN1<C>> lowerEntry = this.X.lowerEntry(pn1.X);
        if (lowerEntry != null && lowerEntry.getValue().t(pn1) && !lowerEntry.getValue().s(pn1).u()) {
            return true;
        }
        return false;
    }

    @Override // o.VN1
    public Set<PN1<C>> p() {
        Set<PN1<C>> set = this.Z;
        if (set == null) {
            b bVar = new b(this, this.X.descendingMap().values());
            this.Z = bVar;
            return bVar;
        }
        return set;
    }

    @Override // o.VN1
    public Set<PN1<C>> q() {
        Set<PN1<C>> set = this.Y;
        if (set == null) {
            b bVar = new b(this, this.X.values());
            this.Y = bVar;
            return bVar;
        }
        return set;
    }

    @MB
    public final PN1<C> v(PN1<C> pn1) {
        C10664xF1.E(pn1);
        Map.Entry<PT<C>, PN1<C>> floorEntry = this.X.floorEntry(pn1.X);
        if (floorEntry != null && floorEntry.getValue().n(pn1)) {
            return floorEntry.getValue();
        }
        return null;
    }

    public final void w(PN1<C> pn1) {
        if (pn1.u()) {
            this.X.remove(pn1.X);
        } else {
            this.X.put(pn1.X, pn1);
        }
    }

    public C8627ou2(NavigableMap<PT<C>, PN1<C>> navigableMap) {
        this.X = navigableMap;
    }

    @InterfaceC5299bJ2
    /* renamed from: o.ou2$e */
    /* loaded from: classes3.dex */
    public static final class e<C extends Comparable<?>> extends AbstractC8413o2<PT<C>, PN1<C>> {
        public final NavigableMap<PT<C>, PN1<C>> X;
        public final PN1<PT<C>> Y;

        /* renamed from: o.ou2$e$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ Iterator Z;

            public a(Iterator it) {
                this.Z = it;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                if (!this.Z.hasNext()) {
                    return (Map.Entry) c();
                }
                PN1 pn1 = (PN1) this.Z.next();
                if (e.this.Y.Y.q(pn1.Y)) {
                    return (Map.Entry) c();
                }
                return C7935m81.O(pn1.Y, pn1);
            }
        }

        /* renamed from: o.ou2$e$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC6437g1<Map.Entry<PT<C>, PN1<C>>> {
            public final /* synthetic */ InterfaceC8699pC1 Z;

            public b(InterfaceC8699pC1 interfaceC8699pC1) {
                this.Z = interfaceC8699pC1;
            }

            @Override // o.AbstractC6437g1
            @MB
            /* renamed from: e */
            public Map.Entry<PT<C>, PN1<C>> b() {
                if (!this.Z.hasNext()) {
                    return (Map.Entry) c();
                }
                PN1 pn1 = (PN1) this.Z.next();
                if (e.this.Y.X.q(pn1.Y)) {
                    return C7935m81.O(pn1.Y, pn1);
                }
                return (Map.Entry) c();
            }
        }

        public e(NavigableMap<PT<C>, PN1<C>> navigableMap) {
            this.X = navigableMap;
            this.Y = PN1.a();
        }

        private NavigableMap<PT<C>, PN1<C>> g(PN1<PT<C>> pn1) {
            if (pn1.t(this.Y)) {
                return new e(this.X, pn1.s(this.Y));
            }
            return C9967uO0.y0();
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<PT<C>, PN1<C>>> a() {
            Iterator<PN1<C>> it;
            if (!this.Y.q()) {
                it = this.X.values().iterator();
            } else {
                Map.Entry<PT<C>, PN1<C>> lowerEntry = this.X.lowerEntry(this.Y.y());
                if (lowerEntry == null) {
                    it = this.X.values().iterator();
                } else if (this.Y.X.q(lowerEntry.getValue().Y)) {
                    it = this.X.tailMap(lowerEntry.getKey(), true).values().iterator();
                } else {
                    it = this.X.tailMap(this.Y.y(), true).values().iterator();
                }
            }
            return new a(it);
        }

        @Override // o.AbstractC8413o2
        public Iterator<Map.Entry<PT<C>, PN1<C>>> b() {
            Collection<PN1<C>> values;
            if (this.Y.r()) {
                values = this.X.headMap(this.Y.J(), false).descendingMap().values();
            } else {
                values = this.X.descendingMap().values();
            }
            InterfaceC8699pC1 S = C7052iU0.S(values.iterator());
            if (S.hasNext() && this.Y.Y.q(((PN1) S.peek()).Y)) {
                S.next();
            }
            return new b(S);
        }

        @Override // java.util.SortedMap
        public Comparator<? super PT<C>> comparator() {
            return AbstractC10587ww1.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8413o2, java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: d */
        public PN1<C> get(@MB Object obj) {
            Map.Entry<PT<C>, PN1<C>> lowerEntry;
            if (obj instanceof PT) {
                try {
                    PT<C> pt = (PT) obj;
                    if (this.Y.i(pt) && (lowerEntry = this.X.lowerEntry(pt)) != null && lowerEntry.getValue().Y.equals(pt)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: e */
        public NavigableMap<PT<C>, PN1<C>> headMap(PT<C> pt, boolean z) {
            return g(PN1.G(pt, EnumC6886hp.g(z)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: f */
        public NavigableMap<PT<C>, PN1<C>> subMap(PT<C> pt, boolean z, PT<C> pt2, boolean z2) {
            return g(PN1.B(pt, EnumC6886hp.g(z), pt2, EnumC6886hp.g(z2)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: i */
        public NavigableMap<PT<C>, PN1<C>> tailMap(PT<C> pt, boolean z) {
            return g(PN1.l(pt, EnumC6886hp.g(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.Y.equals(PN1.a())) {
                return this.X.isEmpty();
            }
            if (!a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            if (this.Y.equals(PN1.a())) {
                return this.X.size();
            }
            return C7052iU0.Z(a());
        }

        public e(NavigableMap<PT<C>, PN1<C>> navigableMap, PN1<PT<C>> pn1) {
            this.X = navigableMap;
            this.Y = pn1;
        }
    }
}
