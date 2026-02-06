package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import o.AbstractC6939i2;
import o.C10856y22;
import o.C2565Bm1;
import o.C5559cO0;
import o.C7935m81;
import o.F1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.wm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10547wm1 {

    /* renamed from: o.wm1$a */
    /* loaded from: classes3.dex */
    public static final class a<K, V> extends C7935m81.R<K, Collection<V>> {
        @GJ2
        public final InterfaceC10058um1<K, V> Y0;

        /* renamed from: o.wm1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0349a extends C7935m81.s<K, Collection<V>> {

            /* renamed from: o.wm1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0350a implements YA0<K, Collection<V>> {
                public C0350a() {
                }

                @Override // o.YA0
                /* renamed from: a */
                public Collection<V> apply(@InterfaceC7894ly1 K k) {
                    return a.this.Y0.get(k);
                }
            }

            public C0349a() {
            }

            @Override // o.C7935m81.s
            public Map<K, Collection<V>> i() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return C7935m81.m(a.this.Y0.keySet(), new C0350a());
            }

            @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.g(entry.getKey());
                return true;
            }
        }

        public a(InterfaceC10058um1<K, V> interfaceC10058um1) {
            this.Y0 = (InterfaceC10058um1) C10664xF1.E(interfaceC10058um1);
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0349a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.Y0.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return this.Y0.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public Collection<V> get(@MB Object obj) {
            if (containsKey(obj)) {
                return this.Y0.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: f */
        public Collection<V> remove(@MB Object obj) {
            if (containsKey(obj)) {
                return this.Y0.i(obj);
            }
            return null;
        }

        public void g(@MB Object obj) {
            this.Y0.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.Y0.isEmpty();
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.Y0.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.Y0.keySet().size();
        }
    }

    /* renamed from: o.wm1$b */
    /* loaded from: classes3.dex */
    public static class b<K, V> extends AbstractC10117v1<K, V> {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;
        public transient InterfaceC8331nh2<? extends List<V>> c1;

        public b(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends List<V>> interfaceC8331nh2) {
            super(map);
            this.c1 = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @InterfaceC11149zF0
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.c1 = (InterfaceC8331nh2) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.c1);
            objectOutputStream.writeObject(s());
        }

        @Override // o.AbstractC10117v1, o.F1
        /* renamed from: F */
        public List<V> t() {
            return this.c1.get();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Map<K, Collection<V>> a() {
            return v();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Set<K> c() {
            return w();
        }
    }

    /* renamed from: o.wm1$c */
    /* loaded from: classes3.dex */
    public static class c<K, V> extends F1<K, V> {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;
        public transient InterfaceC8331nh2<? extends Collection<V>> c1;

        public c(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends Collection<V>> interfaceC8331nh2) {
            super(map);
            this.c1 = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @InterfaceC11149zF0
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.c1 = (InterfaceC8331nh2) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.c1);
            objectOutputStream.writeObject(s());
        }

        @Override // o.F1
        public <E> Collection<E> C(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return C10856y22.O((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            if (collection instanceof Set) {
                return Collections.unmodifiableSet((Set) collection);
            }
            if (collection instanceof List) {
                return Collections.unmodifiableList((List) collection);
            }
            return Collections.unmodifiableCollection(collection);
        }

        @Override // o.F1
        public Collection<V> D(@InterfaceC7894ly1 K k, Collection<V> collection) {
            if (collection instanceof List) {
                return E(k, (List) collection, null);
            }
            if (collection instanceof NavigableSet) {
                return new F1.m(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new F1.o(k, (SortedSet) collection, null);
            }
            if (collection instanceof Set) {
                return new F1.n(k, (Set) collection);
            }
            return new F1.k(k, collection, null);
        }

        @Override // o.F1, o.AbstractC6939i2
        public Map<K, Collection<V>> a() {
            return v();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Set<K> c() {
            return w();
        }

        @Override // o.F1
        public Collection<V> t() {
            return this.c1.get();
        }
    }

    /* renamed from: o.wm1$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends AbstractC5232b3<K, V> {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;
        public transient InterfaceC8331nh2<? extends Set<V>> c1;

        public d(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends Set<V>> interfaceC8331nh2) {
            super(map);
            this.c1 = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
        }

        @InterfaceC11149zF0
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.c1 = (InterfaceC8331nh2) objectInputStream.readObject();
            B((Map) objectInputStream.readObject());
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.c1);
            objectOutputStream.writeObject(s());
        }

        @Override // o.AbstractC5232b3, o.F1
        public <E> Collection<E> C(Collection<E> collection) {
            if (collection instanceof NavigableSet) {
                return C10856y22.O((NavigableSet) collection);
            }
            if (collection instanceof SortedSet) {
                return Collections.unmodifiableSortedSet((SortedSet) collection);
            }
            return Collections.unmodifiableSet((Set) collection);
        }

        @Override // o.AbstractC5232b3, o.F1
        public Collection<V> D(@InterfaceC7894ly1 K k, Collection<V> collection) {
            if (collection instanceof NavigableSet) {
                return new F1.m(k, (NavigableSet) collection, null);
            }
            if (collection instanceof SortedSet) {
                return new F1.o(k, (SortedSet) collection, null);
            }
            return new F1.n(k, (Set) collection);
        }

        @Override // o.AbstractC5232b3, o.F1
        /* renamed from: F */
        public Set<V> t() {
            return this.c1.get();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Map<K, Collection<V>> a() {
            return v();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Set<K> c() {
            return w();
        }
    }

    /* renamed from: o.wm1$e */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends AbstractC8904q3<K, V> {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;
        public transient InterfaceC8331nh2<? extends SortedSet<V>> c1;
        @MB
        public transient Comparator<? super V> d1;

        public e(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends SortedSet<V>> interfaceC8331nh2) {
            super(map);
            this.c1 = (InterfaceC8331nh2) C10664xF1.E(interfaceC8331nh2);
            this.d1 = interfaceC8331nh2.get().comparator();
        }

        @InterfaceC11149zF0
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            InterfaceC8331nh2<? extends SortedSet<V>> interfaceC8331nh2 = (InterfaceC8331nh2) objectInputStream.readObject();
            this.c1 = interfaceC8331nh2;
            this.d1 = interfaceC8331nh2.get().comparator();
            B((Map) objectInputStream.readObject());
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.c1);
            objectOutputStream.writeObject(s());
        }

        @Override // o.AbstractC8904q3, o.AbstractC5232b3, o.F1
        /* renamed from: I */
        public SortedSet<V> t() {
            return this.c1.get();
        }

        @Override // o.InterfaceC6829ha2
        @MB
        public Comparator<? super V> U() {
            return this.d1;
        }

        @Override // o.F1, o.AbstractC6939i2
        public Map<K, Collection<V>> a() {
            return v();
        }

        @Override // o.F1, o.AbstractC6939i2
        public Set<K> c() {
            return w();
        }
    }

    /* renamed from: o.wm1$f */
    /* loaded from: classes3.dex */
    public static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return d().q5(entry.getKey(), entry.getValue());
            }
            return false;
        }

        public abstract InterfaceC10058um1<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return d().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    /* renamed from: o.wm1$g */
    /* loaded from: classes3.dex */
    public static class g<K, V> extends AbstractC7180j2<K> {
        @GJ2
        public final InterfaceC10058um1<K, V> Z;

        /* renamed from: o.wm1$g$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC8375ns2<Map.Entry<K, Collection<V>>, InterfaceC2467Am1.a<K>> {

            /* renamed from: o.wm1$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0351a extends C2565Bm1.f<K> {
                public final /* synthetic */ Map.Entry X;

                public C0351a(a aVar, Map.Entry entry) {
                    this.X = entry;
                }

                @Override // o.InterfaceC2467Am1.a
                @InterfaceC7894ly1
                public K a() {
                    return (K) this.X.getKey();
                }

                @Override // o.InterfaceC2467Am1.a
                public int getCount() {
                    return ((Collection) this.X.getValue()).size();
                }
            }

            public a(g gVar, Iterator it) {
                super(it);
            }

            @Override // o.AbstractC8375ns2
            /* renamed from: c */
            public InterfaceC2467Am1.a<K> b(Map.Entry<K, Collection<V>> entry) {
                return new C0351a(this, entry);
            }
        }

        public g(InterfaceC10058um1<K, V> interfaceC10058um1) {
            this.Z = interfaceC10058um1;
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.Z.clear();
        }

        @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public boolean contains(@MB Object obj) {
            return this.Z.containsKey(obj);
        }

        @Override // o.AbstractC7180j2
        public int f() {
            return this.Z.l().size();
        }

        @Override // o.AbstractC7180j2
        public Iterator<K> h() {
            throw new AssertionError("should never be called");
        }

        @Override // o.AbstractC7180j2
        public Iterator<InterfaceC2467Am1.a<K>> i() {
            return new a(this, this.Z.l().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<K> iterator() {
            return C7935m81.S(this.Z.r().iterator());
        }

        @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
        public Set<K> n() {
            return this.Z.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public int size() {
            return this.Z.size();
        }

        @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
        public int v(@MB Object obj, int i) {
            C5037aF.b(i, "occurrences");
            if (i == 0) {
                return w4(obj);
            }
            Collection collection = (Collection) C7935m81.p0(this.Z.l(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            Collection collection = (Collection) C7935m81.p0(this.Z.l(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }
    }

    /* renamed from: o.wm1$h */
    /* loaded from: classes3.dex */
    public static class h<K, V> extends AbstractC6939i2<K, V> implements InterfaceC8660p22<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;
        public final Map<K, V> a1;

        /* renamed from: o.wm1$h$a */
        /* loaded from: classes3.dex */
        public class a extends C10856y22.k<V> {
            public final /* synthetic */ Object X;

            /* renamed from: o.wm1$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0352a implements Iterator<V> {
                public int X;

                public C0352a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.X == 0) {
                        a aVar = a.this;
                        if (h.this.a1.containsKey(aVar.X)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @InterfaceC7894ly1
                public V next() {
                    if (hasNext()) {
                        this.X++;
                        a aVar = a.this;
                        return (V) C2491As1.a(h.this.a1.get(aVar.X));
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    boolean z = true;
                    if (this.X != 1) {
                        z = false;
                    }
                    C5037aF.e(z);
                    this.X = -1;
                    a aVar = a.this;
                    h.this.a1.remove(aVar.X);
                }
            }

            public a(Object obj) {
                this.X = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0352a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.a1.containsKey(this.X) ? 1 : 0;
            }
        }

        public h(Map<K, V> map) {
            this.a1 = (Map) C10664xF1.E(map);
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2
        public Map<K, Collection<V>> a() {
            return new a(this);
        }

        @Override // o.AbstractC6939i2
        public Collection<Map.Entry<K, V>> b() {
            throw new AssertionError("unreachable");
        }

        @Override // o.AbstractC6939i2
        public Set<K> c() {
            return this.a1.keySet();
        }

        @Override // o.InterfaceC10058um1
        public void clear() {
            this.a1.clear();
        }

        @Override // o.InterfaceC10058um1
        public boolean containsKey(@MB Object obj) {
            return this.a1.containsKey(obj);
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean containsValue(@MB Object obj) {
            return this.a1.containsValue(obj);
        }

        @Override // o.AbstractC6939i2
        public InterfaceC2467Am1<K> d() {
            return new g(this);
        }

        @Override // o.AbstractC6939i2
        public Collection<V> e() {
            return this.a1.values();
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2
        public Iterator<Map.Entry<K, V>> f() {
            return this.a1.entrySet().iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
            return get((h<K, V>) obj);
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public int hashCode() {
            return this.a1.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((h<K, V>) obj, iterable);
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean q5(@MB Object obj, @MB Object obj2) {
            return this.a1.entrySet().contains(C7935m81.O(obj, obj2));
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean remove(@MB Object obj, @MB Object obj2) {
            return this.a1.entrySet().remove(C7935m81.O(obj, obj2));
        }

        @Override // o.InterfaceC10058um1
        public int size() {
            return this.a1.size();
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> get(@InterfaceC7894ly1 K k) {
            return new a(k);
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> i(@MB Object obj) {
            HashSet hashSet = new HashSet(2);
            if (this.a1.containsKey(obj)) {
                hashSet.add(this.a1.remove(obj));
                return hashSet;
            }
            return hashSet;
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<Map.Entry<K, V>> r() {
            return this.a1.entrySet();
        }
    }

    /* renamed from: o.wm1$i */
    /* loaded from: classes3.dex */
    public static final class i<K, V1, V2> extends j<K, V1, V2> implements V01<K, V2> {
        public i(V01<K, V1> v01, C7935m81.t<? super K, ? super V1, V2> tVar) {
            super(v01, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.j, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
            return get((i<K, V1, V2>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.j, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((i<K, V1, V2>) obj, iterable);
        }

        @Override // o.C10547wm1.j
        /* renamed from: k */
        public List<V2> h(@InterfaceC7894ly1 K k, Collection<V1> collection) {
            return C10608x11.D((List) collection, C7935m81.n(this.b1, k));
        }

        @Override // o.C10547wm1.j, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V2> get(@InterfaceC7894ly1 K k) {
            return h(k, this.a1.get(k));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.j, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V2> i(@MB Object obj) {
            return h(obj, this.a1.i(obj));
        }

        @Override // o.C10547wm1.j, o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V2> j(@InterfaceC7894ly1 K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.wm1$j */
    /* loaded from: classes3.dex */
    public static class j<K, V1, V2> extends AbstractC6939i2<K, V2> {
        public final InterfaceC10058um1<K, V1> a1;
        public final C7935m81.t<? super K, ? super V1, V2> b1;

        /* renamed from: o.wm1$j$a */
        /* loaded from: classes3.dex */
        public class a implements C7935m81.t<K, Collection<V1>, Collection<V2>> {
            public a() {
            }

            @Override // o.C7935m81.t
            /* renamed from: b */
            public Collection<V2> a(@InterfaceC7894ly1 K k, Collection<V1> collection) {
                return j.this.h(k, collection);
            }
        }

        public j(InterfaceC10058um1<K, V1> interfaceC10058um1, C7935m81.t<? super K, ? super V1, V2> tVar) {
            this.a1 = (InterfaceC10058um1) C10664xF1.E(interfaceC10058um1);
            this.b1 = (C7935m81.t) C10664xF1.E(tVar);
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean B0(InterfaceC10058um1<? extends K, ? extends V2> interfaceC10058um1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2
        public Map<K, Collection<V2>> a() {
            return C7935m81.x0(this.a1.l(), new a());
        }

        @Override // o.AbstractC6939i2
        public Collection<Map.Entry<K, V2>> b() {
            return new AbstractC6939i2.a();
        }

        @Override // o.AbstractC6939i2
        public Set<K> c() {
            return this.a1.keySet();
        }

        @Override // o.InterfaceC10058um1
        public void clear() {
            this.a1.clear();
        }

        @Override // o.InterfaceC10058um1
        public boolean containsKey(@MB Object obj) {
            return this.a1.containsKey(obj);
        }

        @Override // o.AbstractC6939i2
        public InterfaceC2467Am1<K> d() {
            return this.a1.Q();
        }

        @Override // o.AbstractC6939i2
        public Collection<V2> e() {
            return C7232jF.m(this.a1.r(), C7935m81.h(this.b1));
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2
        public Iterator<Map.Entry<K, V2>> f() {
            return C7052iU0.c0(this.a1.r().iterator(), C7935m81.g(this.b1));
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V2> get(@InterfaceC7894ly1 K k) {
            return h(k, this.a1.get(k));
        }

        public Collection<V2> h(@InterfaceC7894ly1 K k, Collection<V1> collection) {
            YA0 n = C7935m81.n(this.b1, k);
            if (collection instanceof List) {
                return C10608x11.D((List) collection, n);
            }
            return C7232jF.m(collection, n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V2> i(@MB Object obj) {
            return h(obj, this.a1.i(obj));
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean isEmpty() {
            return this.a1.isEmpty();
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V2> j(@InterfaceC7894ly1 K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V2 v2) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC6939i2, o.InterfaceC10058um1
        public boolean remove(@MB Object obj, @MB Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // o.InterfaceC10058um1
        public int size() {
            return this.a1.size();
        }
    }

    /* renamed from: o.wm1$k */
    /* loaded from: classes3.dex */
    public static class k<K, V> extends l<K, V> implements V01<K, V> {
        private static final long serialVersionUID = 0;

        public k(V01<K, V> v01) {
            super(v01);
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0
        /* renamed from: N5 */
        public V01<K, V> M5() {
            return (V01) super.L5();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
            return get((k<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((k<K, V>) obj, iterable);
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> get(@InterfaceC7894ly1 K k) {
            return Collections.unmodifiableList(M5().get((V01<K, V>) k));
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> i(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.wm1$l */
    /* loaded from: classes3.dex */
    public static class l<K, V> extends AbstractC10351vy0<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final InterfaceC10058um1<K, V> X;
        @MB
        @SY0
        public transient Collection<Map.Entry<K, V>> Y;
        @MB
        @SY0
        public transient Set<K> Y0;
        @MB
        @SY0
        public transient InterfaceC2467Am1<K> Z;
        @MB
        @SY0
        public transient Collection<V> Z0;
        @MB
        @SY0
        public transient Map<K, Collection<V>> a1;

        /* renamed from: o.wm1$l$a */
        /* loaded from: classes3.dex */
        public class a implements YA0<Collection<V>, Collection<V>> {
            public a(l lVar) {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Collection<V> apply(Collection<V> collection) {
                return C10547wm1.O(collection);
            }
        }

        public l(InterfaceC10058um1<K, V> interfaceC10058um1) {
            this.X = (InterfaceC10058um1) C10664xF1.E(interfaceC10058um1);
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public InterfaceC10058um1<K, V> L5() {
            return this.X;
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public InterfaceC2467Am1<K> Q() {
            InterfaceC2467Am1<K> interfaceC2467Am1 = this.Z;
            if (interfaceC2467Am1 == null) {
                InterfaceC2467Am1<K> A = C2565Bm1.A(this.X.Q());
                this.Z = A;
                return A;
            }
            return interfaceC2467Am1;
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V> get(@InterfaceC7894ly1 K k) {
            return C10547wm1.O(this.X.get(k));
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V> i(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public Set<K> keySet() {
            Set<K> set = this.Y0;
            if (set == null) {
                Set<K> unmodifiableSet = Collections.unmodifiableSet(this.X.keySet());
                this.Y0 = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Map<K, Collection<V>> l() {
            Map<K, Collection<V>> map = this.a1;
            if (map == null) {
                Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(C7935m81.B0(this.X.l(), new a(this)));
                this.a1 = unmodifiableMap;
                return unmodifiableMap;
            }
            return map;
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<Map.Entry<K, V>> r() {
            Collection<Map.Entry<K, V>> collection = this.Y;
            if (collection == null) {
                Collection<Map.Entry<K, V>> G = C10547wm1.G(this.X.r());
                this.Y = G;
                return G;
            }
            return collection;
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public boolean remove(@MB Object obj, @MB Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC10351vy0, o.InterfaceC10058um1
        public Collection<V> values() {
            Collection<V> collection = this.Z0;
            if (collection == null) {
                Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.X.values());
                this.Z0 = unmodifiableCollection;
                return unmodifiableCollection;
            }
            return collection;
        }
    }

    /* renamed from: o.wm1$m */
    /* loaded from: classes3.dex */
    public static class m<K, V> extends l<K, V> implements InterfaceC8660p22<K, V> {
        private static final long serialVersionUID = 0;

        public m(InterfaceC8660p22<K, V> interfaceC8660p22) {
            super(interfaceC8660p22);
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0
        /* renamed from: N5 */
        public InterfaceC8660p22<K, V> M5() {
            return (InterfaceC8660p22) super.L5();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
            return get((m<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((m<K, V>) obj, iterable);
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> get(@InterfaceC7894ly1 K k) {
            return Collections.unmodifiableSet(M5().get((InterfaceC8660p22<K, V>) k));
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> i(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<Map.Entry<K, V>> r() {
            return C7935m81.J0(M5().r());
        }
    }

    /* renamed from: o.wm1$n */
    /* loaded from: classes3.dex */
    public static class n<K, V> extends m<K, V> implements InterfaceC6829ha2<K, V> {
        private static final long serialVersionUID = 0;

        public n(InterfaceC6829ha2<K, V> interfaceC6829ha2) {
            super(interfaceC6829ha2);
        }

        @Override // o.C10547wm1.m
        /* renamed from: O5 */
        public InterfaceC6829ha2<K, V> N5() {
            return (InterfaceC6829ha2) super.M5();
        }

        @Override // o.InterfaceC6829ha2
        @MB
        public Comparator<? super V> U() {
            return N5().U();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(@InterfaceC7894ly1 Object obj) {
            return get((n<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((n<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Set get(@InterfaceC7894ly1 Object obj) {
            return get((n<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Set j(@InterfaceC7894ly1 Object obj, Iterable iterable) {
            return j((n<K, V>) obj, iterable);
        }

        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> get(@InterfaceC7894ly1 K k) {
            return Collections.unmodifiableSortedSet(N5().get((InterfaceC6829ha2<K, V>) k));
        }

        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> i(@MB Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.C10547wm1.m, o.C10547wm1.l, o.AbstractC10351vy0, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> InterfaceC8660p22<K, V> A(InterfaceC8660p22<K, V> interfaceC8660p22) {
        return C9069qj2.v(interfaceC8660p22, null);
    }

    public static <K, V> InterfaceC6829ha2<K, V> B(InterfaceC6829ha2<K, V> interfaceC6829ha2) {
        return C9069qj2.y(interfaceC6829ha2, null);
    }

    public static <K, V1, V2> V01<K, V2> C(V01<K, V1> v01, C7935m81.t<? super K, ? super V1, V2> tVar) {
        return new i(v01, tVar);
    }

    public static <K, V1, V2> InterfaceC10058um1<K, V2> D(InterfaceC10058um1<K, V1> interfaceC10058um1, C7935m81.t<? super K, ? super V1, V2> tVar) {
        return new j(interfaceC10058um1, tVar);
    }

    public static <K, V1, V2> V01<K, V2> E(V01<K, V1> v01, YA0<? super V1, V2> ya0) {
        C10664xF1.E(ya0);
        return C(v01, C7935m81.i(ya0));
    }

    public static <K, V1, V2> InterfaceC10058um1<K, V2> F(InterfaceC10058um1<K, V1> interfaceC10058um1, YA0<? super V1, V2> ya0) {
        C10664xF1.E(ya0);
        return D(interfaceC10058um1, C7935m81.i(ya0));
    }

    public static <K, V> Collection<Map.Entry<K, V>> G(Collection<Map.Entry<K, V>> collection) {
        if (collection instanceof Set) {
            return C7935m81.J0((Set) collection);
        }
        return new C7935m81.M(Collections.unmodifiableCollection(collection));
    }

    @Deprecated
    public static <K, V> V01<K, V> H(C5559cO0<K, V> c5559cO0) {
        return (V01) C10664xF1.E(c5559cO0);
    }

    public static <K, V> V01<K, V> I(V01<K, V> v01) {
        if (!(v01 instanceof k)) {
            if (v01 instanceof C5559cO0) {
                return v01;
            }
            return new k(v01);
        }
        return v01;
    }

    @Deprecated
    public static <K, V> InterfaceC10058um1<K, V> J(AbstractC7028iO0<K, V> abstractC7028iO0) {
        return (InterfaceC10058um1) C10664xF1.E(abstractC7028iO0);
    }

    public static <K, V> InterfaceC10058um1<K, V> K(InterfaceC10058um1<K, V> interfaceC10058um1) {
        if (!(interfaceC10058um1 instanceof l)) {
            if (interfaceC10058um1 instanceof AbstractC7028iO0) {
                return interfaceC10058um1;
            }
            return new l(interfaceC10058um1);
        }
        return interfaceC10058um1;
    }

    @Deprecated
    public static <K, V> InterfaceC8660p22<K, V> L(C9724tO0<K, V> c9724tO0) {
        return (InterfaceC8660p22) C10664xF1.E(c9724tO0);
    }

    public static <K, V> InterfaceC8660p22<K, V> M(InterfaceC8660p22<K, V> interfaceC8660p22) {
        if (!(interfaceC8660p22 instanceof m)) {
            if (interfaceC8660p22 instanceof C9724tO0) {
                return interfaceC8660p22;
            }
            return new m(interfaceC8660p22);
        }
        return interfaceC8660p22;
    }

    public static <K, V> InterfaceC6829ha2<K, V> N(InterfaceC6829ha2<K, V> interfaceC6829ha2) {
        if (interfaceC6829ha2 instanceof n) {
            return interfaceC6829ha2;
        }
        return new n(interfaceC6829ha2);
    }

    public static <V> Collection<V> O(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    @InterfaceC4238Sm
    public static <K, V> Map<K, List<V>> c(V01<K, V> v01) {
        return (Map<K, Collection<V>>) v01.l();
    }

    @InterfaceC4238Sm
    public static <K, V> Map<K, Collection<V>> d(InterfaceC10058um1<K, V> interfaceC10058um1) {
        return interfaceC10058um1.l();
    }

    @InterfaceC4238Sm
    public static <K, V> Map<K, Set<V>> e(InterfaceC8660p22<K, V> interfaceC8660p22) {
        return (Map<K, Collection<V>>) interfaceC8660p22.l();
    }

    @InterfaceC4238Sm
    public static <K, V> Map<K, SortedSet<V>> f(InterfaceC6829ha2<K, V> interfaceC6829ha2) {
        return (Map<K, Collection<V>>) interfaceC6829ha2.l();
    }

    public static boolean g(InterfaceC10058um1<?, ?> interfaceC10058um1, @MB Object obj) {
        if (obj == interfaceC10058um1) {
            return true;
        }
        if (obj instanceof InterfaceC10058um1) {
            return interfaceC10058um1.l().equals(((InterfaceC10058um1) obj).l());
        }
        return false;
    }

    public static <K, V> InterfaceC10058um1<K, V> h(InterfaceC10058um1<K, V> interfaceC10058um1, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(if1);
        if (interfaceC10058um1 instanceof InterfaceC8660p22) {
            return i((InterfaceC8660p22) interfaceC10058um1, if1);
        }
        if (interfaceC10058um1 instanceof InterfaceC5919dt0) {
            return j((InterfaceC5919dt0) interfaceC10058um1, if1);
        }
        return new C4748Xs0((InterfaceC10058um1) C10664xF1.E(interfaceC10058um1), if1);
    }

    public static <K, V> InterfaceC8660p22<K, V> i(InterfaceC8660p22<K, V> interfaceC8660p22, IF1<? super Map.Entry<K, V>> if1) {
        C10664xF1.E(if1);
        if (interfaceC8660p22 instanceof InterfaceC6405ft0) {
            return k((InterfaceC6405ft0) interfaceC8660p22, if1);
        }
        return new C4952Zs0((InterfaceC8660p22) C10664xF1.E(interfaceC8660p22), if1);
    }

    public static <K, V> InterfaceC10058um1<K, V> j(InterfaceC5919dt0<K, V> interfaceC5919dt0, IF1<? super Map.Entry<K, V>> if1) {
        return new C4748Xs0(interfaceC5919dt0.G(), C7985mG1.e(interfaceC5919dt0.Q3(), if1));
    }

    public static <K, V> InterfaceC8660p22<K, V> k(InterfaceC6405ft0<K, V> interfaceC6405ft0, IF1<? super Map.Entry<K, V>> if1) {
        return new C4952Zs0(interfaceC6405ft0.G(), C7985mG1.e(interfaceC6405ft0.Q3(), if1));
    }

    public static <K, V> V01<K, V> l(V01<K, V> v01, IF1<? super K> if1) {
        if (v01 instanceof C5192at0) {
            C5192at0 c5192at0 = (C5192at0) v01;
            return new C5192at0(c5192at0.G(), C7985mG1.e(c5192at0.b1, if1));
        }
        return new C5192at0(v01, if1);
    }

    public static <K, V> InterfaceC10058um1<K, V> m(InterfaceC10058um1<K, V> interfaceC10058um1, IF1<? super K> if1) {
        if (interfaceC10058um1 instanceof InterfaceC8660p22) {
            return n((InterfaceC8660p22) interfaceC10058um1, if1);
        }
        if (interfaceC10058um1 instanceof V01) {
            return l((V01) interfaceC10058um1, if1);
        }
        if (interfaceC10058um1 instanceof C5435bt0) {
            C5435bt0 c5435bt0 = (C5435bt0) interfaceC10058um1;
            return new C5435bt0(c5435bt0.a1, C7985mG1.e(c5435bt0.b1, if1));
        } else if (interfaceC10058um1 instanceof InterfaceC5919dt0) {
            return j((InterfaceC5919dt0) interfaceC10058um1, C7935m81.U(if1));
        } else {
            return new C5435bt0(interfaceC10058um1, if1);
        }
    }

    public static <K, V> InterfaceC8660p22<K, V> n(InterfaceC8660p22<K, V> interfaceC8660p22, IF1<? super K> if1) {
        if (interfaceC8660p22 instanceof C5677ct0) {
            C5677ct0 c5677ct0 = (C5677ct0) interfaceC8660p22;
            return new C5677ct0(c5677ct0.G(), C7985mG1.e(c5677ct0.b1, if1));
        } else if (interfaceC8660p22 instanceof InterfaceC6405ft0) {
            return k((InterfaceC6405ft0) interfaceC8660p22, C7935m81.U(if1));
        } else {
            return new C5677ct0(interfaceC8660p22, if1);
        }
    }

    public static <K, V> InterfaceC10058um1<K, V> o(InterfaceC10058um1<K, V> interfaceC10058um1, IF1<? super V> if1) {
        return h(interfaceC10058um1, C7935m81.Q0(if1));
    }

    public static <K, V> InterfaceC8660p22<K, V> p(InterfaceC8660p22<K, V> interfaceC8660p22, IF1<? super V> if1) {
        return i(interfaceC8660p22, C7935m81.Q0(if1));
    }

    public static <K, V> InterfaceC8660p22<K, V> q(Map<K, V> map) {
        return new h(map);
    }

    public static <K, V> C5559cO0<K, V> r(Iterable<V> iterable, YA0<? super V, K> ya0) {
        return s(iterable.iterator(), ya0);
    }

    public static <K, V> C5559cO0<K, V> s(Iterator<V> it, YA0<? super V, K> ya0) {
        C10664xF1.E(ya0);
        C5559cO0.a K = C5559cO0.K();
        while (it.hasNext()) {
            V next = it.next();
            C10664xF1.F(next, it);
            K.f(ya0.apply(next), next);
        }
        return K.a();
    }

    @InterfaceC6181ey
    public static <K, V, M extends InterfaceC10058um1<K, V>> M t(InterfaceC10058um1<? extends V, ? extends K> interfaceC10058um1, M m2) {
        C10664xF1.E(m2);
        for (Map.Entry<? extends V, ? extends K> entry : interfaceC10058um1.r()) {
            m2.put(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public static <K, V> V01<K, V> u(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends List<V>> interfaceC8331nh2) {
        return new b(map, interfaceC8331nh2);
    }

    public static <K, V> InterfaceC10058um1<K, V> v(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends Collection<V>> interfaceC8331nh2) {
        return new c(map, interfaceC8331nh2);
    }

    public static <K, V> InterfaceC8660p22<K, V> w(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends Set<V>> interfaceC8331nh2) {
        return new d(map, interfaceC8331nh2);
    }

    public static <K, V> InterfaceC6829ha2<K, V> x(Map<K, Collection<V>> map, InterfaceC8331nh2<? extends SortedSet<V>> interfaceC8331nh2) {
        return new e(map, interfaceC8331nh2);
    }

    public static <K, V> V01<K, V> y(V01<K, V> v01) {
        return C9069qj2.k(v01, null);
    }

    public static <K, V> InterfaceC10058um1<K, V> z(InterfaceC10058um1<K, V> interfaceC10058um1) {
        return C9069qj2.m(interfaceC10058um1, null);
    }
}
