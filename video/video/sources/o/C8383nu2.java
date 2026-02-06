package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import o.C7935m81;

@InterfaceC11149zF0
@InterfaceC6329fa0
@InterfaceC4238Sm
/* renamed from: o.nu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8383nu2<K extends Comparable, V> implements UN1<K, V> {
    public static final UN1<Comparable<?>, Object> Y = new a();
    public final NavigableMap<PT<K>, c<K, V>> X = C7935m81.f0();

    /* renamed from: o.nu2$b */
    /* loaded from: classes3.dex */
    public final class b extends C7935m81.A<PN1<K>, V> {
        public final Iterable<Map.Entry<PN1<K>, V>> X;

        public b(Iterable<c<K, V>> iterable) {
            this.X = iterable;
        }

        @Override // o.C7935m81.A
        public Iterator<Map.Entry<PN1<K>, V>> a() {
            return this.X.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            if (get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        public V get(@MB Object obj) {
            if (obj instanceof PN1) {
                PN1 pn1 = (PN1) obj;
                c cVar = (c) C8383nu2.this.X.get(pn1.X);
                if (cVar != null && cVar.getKey().equals(pn1)) {
                    return (V) cVar.getValue();
                }
                return null;
            }
            return null;
        }

        @Override // o.C7935m81.A, java.util.AbstractMap, java.util.Map
        public int size() {
            return C8383nu2.this.X.size();
        }
    }

    /* renamed from: o.nu2$c */
    /* loaded from: classes3.dex */
    public static final class c<K extends Comparable, V> extends M1<PN1<K>, V> {
        public final PN1<K> X;
        public final V Y;

        public c(PT<K> pt, PT<K> pt2, V v) {
            this(PN1.k(pt, pt2), v);
        }

        public boolean a(K k) {
            return this.X.i(k);
        }

        @Override // o.M1, java.util.Map.Entry
        /* renamed from: b */
        public PN1<K> getKey() {
            return this.X;
        }

        public PT<K> c() {
            return this.X.X;
        }

        public PT<K> g() {
            return this.X.Y;
        }

        @Override // o.M1, java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        public c(PN1<K> pn1, V v) {
            this.X = pn1;
            this.Y = v;
        }
    }

    /* renamed from: o.nu2$d */
    /* loaded from: classes3.dex */
    public class d implements UN1<K, V> {
        public final PN1<K> X;

        /* renamed from: o.nu2$d$a */
        /* loaded from: classes3.dex */
        public class a extends C8383nu2<K, V>.d.b {

            /* renamed from: o.nu2$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0311a extends AbstractC6437g1<Map.Entry<PN1<K>, V>> {
                public final /* synthetic */ Iterator Z;

                public C0311a(Iterator it) {
                    this.Z = it;
                }

                @Override // o.AbstractC6437g1
                @MB
                /* renamed from: e */
                public Map.Entry<PN1<K>, V> b() {
                    if (this.Z.hasNext()) {
                        c cVar = (c) this.Z.next();
                        if (cVar.g().compareTo((PT<K>) d.this.X.X) <= 0) {
                            return (Map.Entry) c();
                        }
                        return C7935m81.O(cVar.getKey().s(d.this.X), cVar.getValue());
                    }
                    return (Map.Entry) c();
                }
            }

            public a() {
                super();
            }

            @Override // o.C8383nu2.d.b
            public Iterator<Map.Entry<PN1<K>, V>> b() {
                if (d.this.X.u()) {
                    return C7052iU0.u();
                }
                return new C0311a(C8383nu2.this.X.headMap(d.this.X.Y, false).descendingMap().values().iterator());
            }
        }

        /* renamed from: o.nu2$d$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractMap<PN1<K>, V> {

            /* renamed from: o.nu2$d$b$a */
            /* loaded from: classes3.dex */
            public class a extends C7935m81.B<PN1<K>, V> {
                public a(Map map) {
                    super(map);
                }

                @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@MB Object obj) {
                    if (b.this.remove(obj) != null) {
                        return true;
                    }
                    return false;
                }

                @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(C7985mG1.h(C7985mG1.q(C7985mG1.n(collection)), C7935m81.R()));
                }
            }

            /* renamed from: o.nu2$d$b$b  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0312b extends C7935m81.s<PN1<K>, V> {
                public C0312b() {
                }

                @Override // o.C7935m81.s
                public Map<PN1<K>, V> i() {
                    return b.this;
                }

                @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<PN1<K>, V>> iterator() {
                    return b.this.b();
                }

                @Override // o.C7935m81.s, o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(C7985mG1.q(C7985mG1.n(collection)));
                }

                @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C7052iU0.Z(iterator());
                }
            }

            /* renamed from: o.nu2$d$b$c */
            /* loaded from: classes3.dex */
            public class c extends AbstractC6437g1<Map.Entry<PN1<K>, V>> {
                public final /* synthetic */ Iterator Z;

                public c(Iterator it) {
                    this.Z = it;
                }

                @Override // o.AbstractC6437g1
                @MB
                /* renamed from: e */
                public Map.Entry<PN1<K>, V> b() {
                    while (this.Z.hasNext()) {
                        c cVar = (c) this.Z.next();
                        if (cVar.c().compareTo((PT<K>) d.this.X.Y) >= 0) {
                            return (Map.Entry) c();
                        }
                        if (cVar.g().compareTo((PT<K>) d.this.X.X) > 0) {
                            return C7935m81.O(cVar.getKey().s(d.this.X), cVar.getValue());
                        }
                    }
                    return (Map.Entry) c();
                }
            }

            /* renamed from: o.nu2$d$b$d  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0313d extends C7935m81.Q<PN1<K>, V> {
                public C0313d(Map map) {
                    super(map);
                }

                @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return b.this.c(C7985mG1.h(C7985mG1.n(collection), C7935m81.N0()));
                }

                @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(C7985mG1.h(C7985mG1.q(C7985mG1.n(collection)), C7935m81.N0()));
                }
            }

            public b() {
            }

            public Iterator<Map.Entry<PN1<K>, V>> b() {
                if (!d.this.X.u()) {
                    return new c(C8383nu2.this.X.tailMap((PT) C3743Nk1.a((PT) C8383nu2.this.X.floorKey(d.this.X.X), d.this.X.X), true).values().iterator());
                }
                return C7052iU0.u();
            }

            public final boolean c(IF1<? super Map.Entry<PN1<K>, V>> if1) {
                ArrayList<PN1<K>> q = C10608x11.q();
                for (Map.Entry<PN1<K>, V> entry : entrySet()) {
                    if (if1.apply(entry)) {
                        q.add(entry.getKey());
                    }
                }
                for (PN1<K> pn1 : q) {
                    C8383nu2.this.b(pn1);
                }
                return !q.isEmpty();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@MB Object obj) {
                if (get(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<PN1<K>, V>> entrySet() {
                return new C0312b();
            }

            @Override // java.util.AbstractMap, java.util.Map
            @MB
            public V get(@MB Object obj) {
                c cVar;
                try {
                    if (obj instanceof PN1) {
                        PN1 pn1 = (PN1) obj;
                        if (d.this.X.n(pn1) && !pn1.u()) {
                            if (pn1.X.compareTo(d.this.X.X) == 0) {
                                Map.Entry floorEntry = C8383nu2.this.X.floorEntry(pn1.X);
                                if (floorEntry != null) {
                                    cVar = (c) floorEntry.getValue();
                                } else {
                                    cVar = null;
                                }
                            } else {
                                cVar = (c) C8383nu2.this.X.get(pn1.X);
                            }
                            if (cVar != null && cVar.getKey().t(d.this.X) && cVar.getKey().s(d.this.X).equals(pn1)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<PN1<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @MB
            public V remove(@MB Object obj) {
                V v = (V) get(obj);
                if (v != null) {
                    Objects.requireNonNull(obj);
                    C8383nu2.this.b((PN1) obj);
                    return v;
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C0313d(this);
            }
        }

        public d(PN1<K> pn1) {
            this.X = pn1;
        }

        @Override // o.UN1
        public PN1<K> a() {
            PT<K> pt;
            PT<K> g;
            Map.Entry floorEntry = C8383nu2.this.X.floorEntry(this.X.X);
            if (floorEntry != null && ((c) floorEntry.getValue()).g().compareTo(this.X.X) > 0) {
                pt = this.X.X;
            } else {
                pt = (PT) C8383nu2.this.X.ceilingKey(this.X.X);
                if (pt == null || pt.compareTo(this.X.Y) >= 0) {
                    throw new NoSuchElementException();
                }
            }
            Map.Entry lowerEntry = C8383nu2.this.X.lowerEntry(this.X.Y);
            if (lowerEntry != null) {
                if (((c) lowerEntry.getValue()).g().compareTo(this.X.Y) >= 0) {
                    g = this.X.Y;
                } else {
                    g = ((c) lowerEntry.getValue()).g();
                }
                return PN1.k(pt, g);
            }
            throw new NoSuchElementException();
        }

        @Override // o.UN1
        public void b(PN1<K> pn1) {
            if (pn1.t(this.X)) {
                C8383nu2.this.b(pn1.s(this.X));
            }
        }

        @Override // o.UN1
        public void c(PN1<K> pn1, V v) {
            if (!C8383nu2.this.X.isEmpty() && this.X.n(pn1)) {
                g(C8383nu2.this.o(pn1, C10664xF1.E(v)).s(this.X), v);
            } else {
                g(pn1, v);
            }
        }

        @Override // o.UN1
        public void clear() {
            C8383nu2.this.b(this.X);
        }

        @Override // o.UN1
        public void d(UN1<K, V> un1) {
            if (un1.e().isEmpty()) {
                return;
            }
            PN1<K> a2 = un1.a();
            C10664xF1.y(this.X.n(a2), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", a2, this.X);
            C8383nu2.this.d(un1);
        }

        @Override // o.UN1
        public Map<PN1<K>, V> e() {
            return new b();
        }

        @Override // o.UN1
        public boolean equals(@MB Object obj) {
            if (obj instanceof UN1) {
                return e().equals(((UN1) obj).e());
            }
            return false;
        }

        @Override // o.UN1
        @MB
        public Map.Entry<PN1<K>, V> f(K k) {
            Map.Entry<PN1<K>, V> f;
            if (this.X.i(k) && (f = C8383nu2.this.f(k)) != null) {
                return C7935m81.O(f.getKey().s(this.X), f.getValue());
            }
            return null;
        }

        @Override // o.UN1
        public void g(PN1<K> pn1, V v) {
            C10664xF1.y(this.X.n(pn1), "Cannot put range %s into a subRangeMap(%s)", pn1, this.X);
            C8383nu2.this.g(pn1, v);
        }

        @Override // o.UN1
        @MB
        public V h(K k) {
            if (this.X.i(k)) {
                return (V) C8383nu2.this.h(k);
            }
            return null;
        }

        @Override // o.UN1
        public int hashCode() {
            return e().hashCode();
        }

        @Override // o.UN1
        public Map<PN1<K>, V> i() {
            return new a();
        }

        @Override // o.UN1
        public UN1<K, V> j(PN1<K> pn1) {
            if (!pn1.t(this.X)) {
                return C8383nu2.this.q();
            }
            return C8383nu2.this.j(pn1.s(this.X));
        }

        @Override // o.UN1
        public String toString() {
            return e().toString();
        }
    }

    public static <K extends Comparable, V> PN1<K> n(PN1<K> pn1, V v, @MB Map.Entry<PT<K>, c<K, V>> entry) {
        if (entry != null && entry.getValue().getKey().t(pn1) && entry.getValue().getValue().equals(v)) {
            return pn1.E(entry.getValue().getKey());
        }
        return pn1;
    }

    public static <K extends Comparable, V> C8383nu2<K, V> p() {
        return new C8383nu2<>();
    }

    @Override // o.UN1
    public PN1<K> a() {
        Map.Entry<PT<K>, c<K, V>> firstEntry = this.X.firstEntry();
        Map.Entry<PT<K>, c<K, V>> lastEntry = this.X.lastEntry();
        if (firstEntry != null && lastEntry != null) {
            return PN1.k(firstEntry.getValue().getKey().X, lastEntry.getValue().getKey().Y);
        }
        throw new NoSuchElementException();
    }

    @Override // o.UN1
    public void b(PN1<K> pn1) {
        if (pn1.u()) {
            return;
        }
        Map.Entry<PT<K>, c<K, V>> lowerEntry = this.X.lowerEntry(pn1.X);
        if (lowerEntry != null) {
            c<K, V> value = lowerEntry.getValue();
            if (value.g().compareTo(pn1.X) > 0) {
                if (value.g().compareTo(pn1.Y) > 0) {
                    r(pn1.Y, value.g(), lowerEntry.getValue().getValue());
                }
                r(value.c(), pn1.X, lowerEntry.getValue().getValue());
            }
        }
        Map.Entry<PT<K>, c<K, V>> lowerEntry2 = this.X.lowerEntry(pn1.Y);
        if (lowerEntry2 != null) {
            c<K, V> value2 = lowerEntry2.getValue();
            if (value2.g().compareTo(pn1.Y) > 0) {
                r(pn1.Y, value2.g(), lowerEntry2.getValue().getValue());
            }
        }
        this.X.subMap(pn1.X, pn1.Y).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.UN1
    public void c(PN1<K> pn1, V v) {
        if (this.X.isEmpty()) {
            g(pn1, v);
        } else {
            g(o(pn1, C10664xF1.E(v)), v);
        }
    }

    @Override // o.UN1
    public void clear() {
        this.X.clear();
    }

    @Override // o.UN1
    public void d(UN1<K, V> un1) {
        for (Map.Entry<PN1<K>, V> entry : un1.e().entrySet()) {
            g(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.UN1
    public Map<PN1<K>, V> e() {
        return new b(this.X.values());
    }

    @Override // o.UN1
    public boolean equals(@MB Object obj) {
        if (obj instanceof UN1) {
            return e().equals(((UN1) obj).e());
        }
        return false;
    }

    @Override // o.UN1
    @MB
    public Map.Entry<PN1<K>, V> f(K k) {
        Map.Entry<PT<K>, c<K, V>> floorEntry = this.X.floorEntry(PT.i(k));
        if (floorEntry != null && floorEntry.getValue().a(k)) {
            return floorEntry.getValue();
        }
        return null;
    }

    @Override // o.UN1
    public void g(PN1<K> pn1, V v) {
        if (!pn1.u()) {
            C10664xF1.E(v);
            b(pn1);
            this.X.put(pn1.X, new c<>(pn1, v));
        }
    }

    @Override // o.UN1
    @MB
    public V h(K k) {
        Map.Entry<PN1<K>, V> f = f(k);
        if (f == null) {
            return null;
        }
        return f.getValue();
    }

    @Override // o.UN1
    public int hashCode() {
        return e().hashCode();
    }

    @Override // o.UN1
    public Map<PN1<K>, V> i() {
        return new b(this.X.descendingMap().values());
    }

    @Override // o.UN1
    public UN1<K, V> j(PN1<K> pn1) {
        if (pn1.equals(PN1.a())) {
            return this;
        }
        return new d(pn1);
    }

    public final PN1<K> o(PN1<K> pn1, V v) {
        return n(n(pn1, v, this.X.lowerEntry(pn1.X)), v, this.X.floorEntry(pn1.Y));
    }

    public final UN1<K, V> q() {
        return Y;
    }

    public final void r(PT<K> pt, PT<K> pt2, V v) {
        this.X.put(pt, new c<>(pt, pt2, v));
    }

    @Override // o.UN1
    public String toString() {
        return this.X.values().toString();
    }

    /* renamed from: o.nu2$a */
    /* loaded from: classes3.dex */
    public class a implements UN1<Comparable<?>, Object> {
        @Override // o.UN1
        public PN1<Comparable<?>> a() {
            throw new NoSuchElementException();
        }

        @Override // o.UN1
        public void b(PN1<Comparable<?>> pn1) {
            C10664xF1.E(pn1);
        }

        @Override // o.UN1
        public void c(PN1<Comparable<?>> pn1, Object obj) {
            C10664xF1.E(pn1);
            String valueOf = String.valueOf(pn1);
            StringBuilder sb = new StringBuilder(valueOf.length() + 46);
            sb.append("Cannot insert range ");
            sb.append(valueOf);
            sb.append(" into an empty subRangeMap");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.UN1
        public void d(UN1<Comparable<?>, Object> un1) {
            if (un1.e().isEmpty()) {
                return;
            }
            throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
        }

        @Override // o.UN1
        public Map<PN1<Comparable<?>>, Object> e() {
            return Collections.EMPTY_MAP;
        }

        @Override // o.UN1
        @MB
        public Map.Entry<PN1<Comparable<?>>, Object> f(Comparable<?> comparable) {
            return null;
        }

        @Override // o.UN1
        public void g(PN1<Comparable<?>> pn1, Object obj) {
            C10664xF1.E(pn1);
            String valueOf = String.valueOf(pn1);
            StringBuilder sb = new StringBuilder(valueOf.length() + 46);
            sb.append("Cannot insert range ");
            sb.append(valueOf);
            sb.append(" into an empty subRangeMap");
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.UN1
        @MB
        public Object h(Comparable<?> comparable) {
            return null;
        }

        @Override // o.UN1
        public Map<PN1<Comparable<?>>, Object> i() {
            return Collections.EMPTY_MAP;
        }

        @Override // o.UN1
        public UN1<Comparable<?>, Object> j(PN1<Comparable<?>> pn1) {
            C10664xF1.E(pn1);
            return this;
        }

        @Override // o.UN1
        public void clear() {
        }
    }
}
