package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C10547wm1;
import o.C2565Bm1;
import o.C7935m81;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Xs0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4748Xs0<K, V> extends AbstractC6939i2<K, V> implements InterfaceC5919dt0<K, V> {
    public final InterfaceC10058um1<K, V> a1;
    public final IF1<? super Map.Entry<K, V>> b1;

    /* renamed from: o.Xs0$a */
    /* loaded from: classes3.dex */
    public class a extends C7935m81.R<K, Collection<V>> {

        /* renamed from: o.Xs0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0249a extends C7935m81.s<K, Collection<V>> {

            /* renamed from: o.Xs0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0250a extends AbstractC6437g1<Map.Entry<K, Collection<V>>> {
                public final Iterator<Map.Entry<K, Collection<V>>> Z;

                public C0250a() {
                    this.Z = C4748Xs0.this.a1.l().entrySet().iterator();
                }

                @Override // o.AbstractC6437g1
                @MB
                /* renamed from: e */
                public Map.Entry<K, Collection<V>> b() {
                    while (this.Z.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.Z.next();
                        K key = next.getKey();
                        Collection k = C4748Xs0.k(next.getValue(), new c(key));
                        if (!k.isEmpty()) {
                            return C7935m81.O(key, k);
                        }
                    }
                    return c();
                }
            }

            public C0249a() {
            }

            @Override // o.C7935m81.s
            public Map<K, Collection<V>> i() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0250a();
            }

            @Override // o.C7935m81.s, o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7985mG1.n(collection));
            }

            @Override // o.C7935m81.s, o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7985mG1.q(C7985mG1.n(collection)));
            }

            @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C7052iU0.Z(iterator());
            }
        }

        /* renamed from: o.Xs0$a$b */
        /* loaded from: classes3.dex */
        public class b extends C7935m81.B<K, Collection<V>> {
            public b() {
                super(a.this);
            }

            @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (a.this.remove(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7935m81.U(C7985mG1.n(collection)));
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7935m81.U(C7985mG1.q(C7985mG1.n(collection))));
            }
        }

        /* renamed from: o.Xs0$a$c */
        /* loaded from: classes3.dex */
        public class c extends C7935m81.Q<K, Collection<V>> {
            public c() {
                super(a.this);
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@MB Object obj) {
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    Iterator<Map.Entry<K, Collection<V>>> it = C4748Xs0.this.a1.l().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<K, Collection<V>> next = it.next();
                        Collection k = C4748Xs0.k(next.getValue(), new c(next.getKey()));
                        if (!k.isEmpty() && collection.equals(k)) {
                            if (k.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            k.clear();
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7935m81.Q0(C7985mG1.n(collection)));
            }

            @Override // o.C7935m81.Q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return C4748Xs0.this.m(C7935m81.Q0(C7985mG1.q(C7985mG1.n(collection))));
            }
        }

        public a() {
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0249a();
        }

        @Override // o.C7935m81.R
        public Set<K> b() {
            return new b();
        }

        @Override // o.C7935m81.R
        public Collection<Collection<V>> c() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C4748Xs0.this.clear();
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
        /* renamed from: d */
        public Collection<V> get(@MB Object obj) {
            Collection<V> collection = C4748Xs0.this.a1.l().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> k = C4748Xs0.k(collection, new c(obj));
            if (k.isEmpty()) {
                return null;
            }
            return k;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public Collection<V> remove(@MB Object obj) {
            Collection<V> collection = C4748Xs0.this.a1.l().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList q = C10608x11.q();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (C4748Xs0.this.n(obj, next)) {
                    it.remove();
                    q.add(next);
                }
            }
            if (q.isEmpty()) {
                return null;
            }
            if (C4748Xs0.this.a1 instanceof InterfaceC8660p22) {
                return Collections.unmodifiableSet(C10856y22.B(q));
            }
            return Collections.unmodifiableList(q);
        }
    }

    /* renamed from: o.Xs0$b */
    /* loaded from: classes3.dex */
    public class b extends C10547wm1.g<K, V> {

        /* renamed from: o.Xs0$b$a */
        /* loaded from: classes3.dex */
        public class a extends C2565Bm1.i<K> {
            public a() {
            }

            @Override // o.C2565Bm1.i
            public InterfaceC2467Am1<K> i() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<InterfaceC2467Am1.a<K>> iterator() {
                return b.this.i();
            }

            public final boolean k(final IF1<? super InterfaceC2467Am1.a<K>> if1) {
                return C4748Xs0.this.m(new IF1() { // from class: o.Ys0
                    @Override // o.IF1
                    public final boolean apply(Object obj) {
                        boolean apply;
                        apply = IF1.this.apply(C2565Bm1.k(r2.getKey(), ((Collection) ((Map.Entry) obj).getValue()).size()));
                        return apply;
                    }
                });
            }

            @Override // o.C10856y22.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return k(C7985mG1.n(collection));
            }

            @Override // o.C10856y22.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return k(C7985mG1.q(C7985mG1.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return C4748Xs0.this.keySet().size();
            }
        }

        public b() {
            super(C4748Xs0.this);
        }

        @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
        public Set<InterfaceC2467Am1.a<K>> entrySet() {
            return new a();
        }

        @Override // o.C10547wm1.g, o.AbstractC7180j2, o.InterfaceC2467Am1
        public int v(@MB Object obj, int i) {
            C5037aF.b(i, "occurrences");
            if (i == 0) {
                return w4(obj);
            }
            Collection<V> collection = C4748Xs0.this.a1.l().get(obj);
            int i2 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (C4748Xs0.this.n(obj, it.next()) && (i2 = i2 + 1) <= i) {
                    it.remove();
                }
            }
            return i2;
        }
    }

    /* renamed from: o.Xs0$c */
    /* loaded from: classes3.dex */
    public final class c implements IF1<V> {
        @InterfaceC7894ly1
        public final K X;

        public c(@InterfaceC7894ly1 K k) {
            this.X = k;
        }

        @Override // o.IF1
        public boolean apply(@InterfaceC7894ly1 V v) {
            return C4748Xs0.this.n(this.X, v);
        }
    }

    public C4748Xs0(InterfaceC10058um1<K, V> interfaceC10058um1, IF1<? super Map.Entry<K, V>> if1) {
        this.a1 = (InterfaceC10058um1) C10664xF1.E(interfaceC10058um1);
        this.b1 = (IF1) C10664xF1.E(if1);
    }

    public static <E> Collection<E> k(Collection<E> collection, IF1<? super E> if1) {
        if (collection instanceof Set) {
            return C10856y22.i((Set) collection, if1);
        }
        return C7232jF.d(collection, if1);
    }

    @Override // o.InterfaceC5919dt0
    public InterfaceC10058um1<K, V> G() {
        return this.a1;
    }

    @Override // o.InterfaceC5919dt0
    public IF1<? super Map.Entry<K, V>> Q3() {
        return this.b1;
    }

    @Override // o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        return new a();
    }

    @Override // o.AbstractC6939i2
    public Collection<Map.Entry<K, V>> b() {
        return k(this.a1.r(), this.b1);
    }

    @Override // o.AbstractC6939i2
    public Set<K> c() {
        return l().keySet();
    }

    @Override // o.InterfaceC10058um1
    public void clear() {
        r().clear();
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        if (l().get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC6939i2
    public InterfaceC2467Am1<K> d() {
        return new b();
    }

    @Override // o.AbstractC6939i2
    public Collection<V> e() {
        return new C6162et0(this);
    }

    @Override // o.AbstractC6939i2
    public Iterator<Map.Entry<K, V>> f() {
        throw new AssertionError("should never be called");
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> get(@InterfaceC7894ly1 K k) {
        return k(this.a1.get(k), new c(k));
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> i(@MB Object obj) {
        return (Collection) C3743Nk1.a(l().remove(obj), o());
    }

    public boolean m(IF1<? super Map.Entry<K, Collection<V>>> if1) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.a1.l().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection k = k(next.getValue(), new c(key));
            if (!k.isEmpty() && if1.apply(C7935m81.O(key, k))) {
                if (k.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    k.clear();
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean n(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return this.b1.apply(C7935m81.O(k, v));
    }

    public Collection<V> o() {
        if (this.a1 instanceof InterfaceC8660p22) {
            return Collections.EMPTY_SET;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC10058um1
    public int size() {
        return r().size();
    }
}
