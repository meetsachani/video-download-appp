package o;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o.InterfaceC2467Am1;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.qj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9069qj2 {

    /* renamed from: o.qj2$b */
    /* loaded from: classes3.dex */
    public static class b<K, V> extends k<K, Collection<V>> {
        private static final long serialVersionUID = 0;
        @MB
        public transient Set<Map.Entry<K, Collection<V>>> a1;
        @MB
        public transient Collection<Collection<V>> b1;

        public b(Map<K, Collection<V>> map, @MB Object obj) {
            super(map, obj);
        }

        @Override // o.C9069qj2.k, java.util.Map
        public boolean containsValue(@MB Object obj) {
            return values().contains(obj);
        }

        @Override // o.C9069qj2.k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.Y) {
                try {
                    if (this.a1 == null) {
                        this.a1 = new c(d().entrySet(), this.Y);
                    }
                    set = this.a1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // o.C9069qj2.k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.Y) {
                try {
                    if (this.b1 == null) {
                        this.b1 = new d(d().values(), this.Y);
                    }
                    collection = this.b1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // o.C9069qj2.k, java.util.Map
        @MB
        public Collection<V> get(@MB Object obj) {
            Collection<V> A;
            synchronized (this.Y) {
                Collection collection = (Collection) super.get(obj);
                A = collection == null ? null : C9069qj2.A(collection, this.Y);
            }
            return A;
        }
    }

    /* renamed from: o.qj2$d */
    /* loaded from: classes3.dex */
    public static class d<V> extends f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: o.qj2$d$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC8375ns2<Collection<V>, Collection<V>> {
            public a(Iterator it) {
                super(it);
            }

            @Override // o.AbstractC8375ns2
            /* renamed from: c */
            public Collection<V> b(Collection<V> collection) {
                return C9069qj2.A(collection, d.this.Y);
            }
        }

        public d(Collection<Collection<V>> collection, @MB Object obj) {
            super(collection, obj);
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.qj2$e */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends k<K, V> implements InterfaceC4626Wm<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        @MB
        public transient Set<V> a1;
        @MB
        @InterfaceC7537kU1
        public transient InterfaceC4626Wm<V, K> b1;

        @Override // o.InterfaceC4626Wm
        @MB
        public V J3(K k, V v) {
            V J3;
            synchronized (this.Y) {
                J3 = e().J3(k, v);
            }
            return J3;
        }

        @Override // o.C9069qj2.k
        /* renamed from: f */
        public InterfaceC4626Wm<K, V> e() {
            return (InterfaceC4626Wm) super.d();
        }

        @Override // o.InterfaceC4626Wm
        public InterfaceC4626Wm<V, K> m5() {
            InterfaceC4626Wm<V, K> interfaceC4626Wm;
            synchronized (this.Y) {
                try {
                    if (this.b1 == null) {
                        this.b1 = new e(e().m5(), this.Y, this);
                    }
                    interfaceC4626Wm = this.b1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC4626Wm;
        }

        public e(InterfaceC4626Wm<K, V> interfaceC4626Wm, @MB Object obj, @MB InterfaceC4626Wm<V, K> interfaceC4626Wm2) {
            super(interfaceC4626Wm, obj);
            this.b1 = interfaceC4626Wm2;
        }

        @Override // o.C9069qj2.k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.Y) {
                try {
                    if (this.a1 == null) {
                        this.a1 = C9069qj2.u(e().values(), this.Y);
                    }
                    set = this.a1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    @InterfaceC5299bJ2
    /* renamed from: o.qj2$f */
    /* loaded from: classes3.dex */
    public static class f<E> extends p implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e) {
            boolean add;
            synchronized (this.Y) {
                add = d().add(e);
            }
            return add;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.Y) {
                addAll = d().addAll(collection);
            }
            return addAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.Y) {
                d().clear();
            }
        }

        public boolean contains(@MB Object obj) {
            boolean contains;
            synchronized (this.Y) {
                contains = d().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.Y) {
                containsAll = d().containsAll(collection);
            }
            return containsAll;
        }

        @Override // o.C9069qj2.p
        /* renamed from: e */
        public Collection<E> d() {
            return (Collection) super.d();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.Y) {
                isEmpty = d().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return d().iterator();
        }

        public boolean remove(@MB Object obj) {
            boolean remove;
            synchronized (this.Y) {
                remove = d().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.Y) {
                removeAll = d().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.Y) {
                retainAll = d().retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.Y) {
                size = d().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.Y) {
                array = d().toArray();
            }
            return array;
        }

        public f(Collection<E> collection, @MB Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.Y) {
                tArr2 = (T[]) d().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* renamed from: o.qj2$g */
    /* loaded from: classes3.dex */
    public static final class g<E> extends q<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public g(Deque<E> deque, @MB Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e) {
            synchronized (this.Y) {
                f().addFirst(e);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e) {
            synchronized (this.Y) {
                f().addLast(e);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.Y) {
                descendingIterator = f().descendingIterator();
            }
            return descendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.Y) {
                first = f().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.Y) {
                last = f().getLast();
            }
            return last;
        }

        @Override // o.C9069qj2.q
        /* renamed from: k */
        public Deque<E> f() {
            return (Deque) super.e();
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e) {
            boolean offerFirst;
            synchronized (this.Y) {
                offerFirst = f().offerFirst(e);
            }
            return offerFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e) {
            boolean offerLast;
            synchronized (this.Y) {
                offerLast = f().offerLast(e);
            }
            return offerLast;
        }

        @Override // java.util.Deque
        @MB
        public E peekFirst() {
            E peekFirst;
            synchronized (this.Y) {
                peekFirst = f().peekFirst();
            }
            return peekFirst;
        }

        @Override // java.util.Deque
        @MB
        public E peekLast() {
            E peekLast;
            synchronized (this.Y) {
                peekLast = f().peekLast();
            }
            return peekLast;
        }

        @Override // java.util.Deque
        @MB
        public E pollFirst() {
            E pollFirst;
            synchronized (this.Y) {
                pollFirst = f().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.Deque
        @MB
        public E pollLast() {
            E pollLast;
            synchronized (this.Y) {
                pollLast = f().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E pop;
            synchronized (this.Y) {
                pop = f().pop();
            }
            return pop;
        }

        @Override // java.util.Deque
        public void push(E e) {
            synchronized (this.Y) {
                f().push(e);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E removeFirst;
            synchronized (this.Y) {
                removeFirst = f().removeFirst();
            }
            return removeFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@MB Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.Y) {
                removeFirstOccurrence = f().removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E removeLast;
            synchronized (this.Y) {
                removeLast = f().removeLast();
            }
            return removeLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@MB Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.Y) {
                removeLastOccurrence = f().removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.qj2$h */
    /* loaded from: classes3.dex */
    public static class h<K, V> extends p implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public h(Map.Entry<K, V> entry, @MB Object obj) {
            super(entry, obj);
        }

        @Override // o.C9069qj2.p
        /* renamed from: e */
        public Map.Entry<K, V> d() {
            return (Map.Entry) super.d();
        }

        @Override // java.util.Map.Entry
        public boolean equals(@MB Object obj) {
            boolean equals;
            synchronized (this.Y) {
                equals = d().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.Y) {
                key = d().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.Y) {
                value = d().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = d().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V value;
            synchronized (this.Y) {
                value = d().setValue(v);
            }
            return value;
        }
    }

    /* renamed from: o.qj2$i */
    /* loaded from: classes3.dex */
    public static class i<E> extends f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public i(List<E> list, @MB Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i, E e) {
            synchronized (this.Y) {
                e().add(i, e);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.Y) {
                addAll = e().addAll(i, collection);
            }
            return addAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@MB Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                equals = e().equals(obj);
            }
            return equals;
        }

        @Override // o.C9069qj2.f
        /* renamed from: f */
        public List<E> e() {
            return (List) super.d();
        }

        @Override // java.util.List
        public E get(int i) {
            E e;
            synchronized (this.Y) {
                e = e().get(i);
            }
            return e;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = e().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.List
        public int indexOf(@MB Object obj) {
            int indexOf;
            synchronized (this.Y) {
                indexOf = e().indexOf(obj);
            }
            return indexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@MB Object obj) {
            int lastIndexOf;
            synchronized (this.Y) {
                lastIndexOf = e().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return e().listIterator();
        }

        @Override // java.util.List
        public E remove(int i) {
            E remove;
            synchronized (this.Y) {
                remove = e().remove(i);
            }
            return remove;
        }

        @Override // java.util.List
        public E set(int i, E e) {
            E e2;
            synchronized (this.Y) {
                e2 = e().set(i, e);
            }
            return e2;
        }

        @Override // java.util.List
        public List<E> subList(int i, int i2) {
            List<E> j;
            synchronized (this.Y) {
                j = C9069qj2.j(e().subList(i, i2), this.Y);
            }
            return j;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i) {
            return e().listIterator(i);
        }
    }

    /* renamed from: o.qj2$j */
    /* loaded from: classes3.dex */
    public static class j<K, V> extends l<K, V> implements V01<K, V> {
        private static final long serialVersionUID = 0;

        public j(V01<K, V> v01, @MB Object obj) {
            super(v01, obj);
        }

        @Override // o.C9069qj2.l
        /* renamed from: f */
        public V01<K, V> e() {
            return (V01) super.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((j<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(Object obj, Iterable iterable) {
            return j((j<K, V>) obj, iterable);
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> get(K k) {
            List<V> j;
            synchronized (this.Y) {
                j = C9069qj2.j(e().get((V01<K, V>) k), this.Y);
            }
            return j;
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> i(@MB Object obj) {
            List<V> i;
            synchronized (this.Y) {
                i = e().i(obj);
            }
            return i;
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public List<V> j(K k, Iterable<? extends V> iterable) {
            List<V> j;
            synchronized (this.Y) {
                j = e().j((V01<K, V>) k, (Iterable) iterable);
            }
            return j;
        }
    }

    /* renamed from: o.qj2$k */
    /* loaded from: classes3.dex */
    public static class k<K, V> extends p implements Map<K, V> {
        private static final long serialVersionUID = 0;
        @MB
        public transient Collection<V> Y0;
        @MB
        public transient Set<K> Z;
        @MB
        public transient Set<Map.Entry<K, V>> Z0;

        public k(Map<K, V> map, @MB Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.Y) {
                d().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@MB Object obj) {
            boolean containsKey;
            synchronized (this.Y) {
                containsKey = d().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(@MB Object obj) {
            boolean containsValue;
            synchronized (this.Y) {
                containsValue = d().containsValue(obj);
            }
            return containsValue;
        }

        @Override // o.C9069qj2.p
        /* renamed from: e */
        public Map<K, V> d() {
            return (Map) super.d();
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.Y) {
                try {
                    if (this.Z0 == null) {
                        this.Z0 = C9069qj2.u(d().entrySet(), this.Y);
                    }
                    set = this.Z0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@MB Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                equals = d().equals(obj);
            }
            return equals;
        }

        @MB
        public V get(@MB Object obj) {
            V v;
            synchronized (this.Y) {
                v = d().get(obj);
            }
            return v;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = d().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.Y) {
                isEmpty = d().isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.Y) {
                try {
                    if (this.Z == null) {
                        this.Z = C9069qj2.u(d().keySet(), this.Y);
                    }
                    set = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        @MB
        public V put(K k, V v) {
            V put;
            synchronized (this.Y) {
                put = d().put(k, v);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.Y) {
                d().putAll(map);
            }
        }

        @Override // java.util.Map
        @MB
        public V remove(@MB Object obj) {
            V remove;
            synchronized (this.Y) {
                remove = d().remove(obj);
            }
            return remove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.Y) {
                size = d().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.Y) {
                try {
                    if (this.Y0 == null) {
                        this.Y0 = C9069qj2.h(d().values(), this.Y);
                    }
                    collection = this.Y0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    /* renamed from: o.qj2$l */
    /* loaded from: classes3.dex */
    public static class l<K, V> extends p implements InterfaceC10058um1<K, V> {
        private static final long serialVersionUID = 0;
        @MB
        public transient Collection<V> Y0;
        @MB
        public transient Set<K> Z;
        @MB
        public transient Collection<Map.Entry<K, V>> Z0;
        @MB
        public transient Map<K, Collection<V>> a1;
        @MB
        public transient InterfaceC2467Am1<K> b1;

        public l(InterfaceC10058um1<K, V> interfaceC10058um1, @MB Object obj) {
            super(interfaceC10058um1, obj);
        }

        @Override // o.InterfaceC10058um1
        public boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            boolean B0;
            synchronized (this.Y) {
                B0 = d().B0(interfaceC10058um1);
            }
            return B0;
        }

        @Override // o.InterfaceC10058um1
        public InterfaceC2467Am1<K> Q() {
            InterfaceC2467Am1<K> interfaceC2467Am1;
            synchronized (this.Y) {
                try {
                    if (this.b1 == null) {
                        this.b1 = C9069qj2.n(d().Q(), this.Y);
                    }
                    interfaceC2467Am1 = this.b1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return interfaceC2467Am1;
        }

        @Override // o.InterfaceC10058um1
        public void clear() {
            synchronized (this.Y) {
                d().clear();
            }
        }

        @Override // o.InterfaceC10058um1
        public boolean containsKey(@MB Object obj) {
            boolean containsKey;
            synchronized (this.Y) {
                containsKey = d().containsKey(obj);
            }
            return containsKey;
        }

        @Override // o.InterfaceC10058um1
        public boolean containsValue(@MB Object obj) {
            boolean containsValue;
            synchronized (this.Y) {
                containsValue = d().containsValue(obj);
            }
            return containsValue;
        }

        @Override // o.C9069qj2.p
        /* renamed from: e */
        public InterfaceC10058um1<K, V> d() {
            return (InterfaceC10058um1) super.d();
        }

        @Override // o.InterfaceC10058um1
        public boolean e0(K k, Iterable<? extends V> iterable) {
            boolean e0;
            synchronized (this.Y) {
                e0 = d().e0(k, iterable);
            }
            return e0;
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public boolean equals(@MB Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                equals = d().equals(obj);
            }
            return equals;
        }

        public Collection<V> get(K k) {
            Collection<V> A;
            synchronized (this.Y) {
                A = C9069qj2.A(d().get(k), this.Y);
            }
            return A;
        }

        @Override // o.InterfaceC10058um1
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = d().hashCode();
            }
            return hashCode;
        }

        public Collection<V> i(@MB Object obj) {
            Collection<V> i;
            synchronized (this.Y) {
                i = d().i(obj);
            }
            return i;
        }

        @Override // o.InterfaceC10058um1
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.Y) {
                isEmpty = d().isEmpty();
            }
            return isEmpty;
        }

        public Collection<V> j(K k, Iterable<? extends V> iterable) {
            Collection<V> j;
            synchronized (this.Y) {
                j = d().j(k, iterable);
            }
            return j;
        }

        @Override // o.InterfaceC10058um1
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.Y) {
                try {
                    if (this.Z == null) {
                        this.Z = C9069qj2.B(d().keySet(), this.Y);
                    }
                    set = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Map<K, Collection<V>> l() {
            Map<K, Collection<V>> map;
            synchronized (this.Y) {
                try {
                    if (this.a1 == null) {
                        this.a1 = new b(d().l(), this.Y);
                    }
                    map = this.a1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        @Override // o.InterfaceC10058um1
        public boolean put(K k, V v) {
            boolean put;
            synchronized (this.Y) {
                put = d().put(k, v);
            }
            return put;
        }

        @Override // o.InterfaceC10058um1
        public boolean q5(@MB Object obj, @MB Object obj2) {
            boolean q5;
            synchronized (this.Y) {
                q5 = d().q5(obj, obj2);
            }
            return q5;
        }

        @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
        public Collection<Map.Entry<K, V>> r() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.Y) {
                try {
                    if (this.Z0 == null) {
                        this.Z0 = C9069qj2.A(d().r(), this.Y);
                    }
                    collection = this.Z0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // o.InterfaceC10058um1
        public boolean remove(@MB Object obj, @MB Object obj2) {
            boolean remove;
            synchronized (this.Y) {
                remove = d().remove(obj, obj2);
            }
            return remove;
        }

        @Override // o.InterfaceC10058um1
        public int size() {
            int size;
            synchronized (this.Y) {
                size = d().size();
            }
            return size;
        }

        @Override // o.InterfaceC10058um1
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.Y) {
                try {
                    if (this.Y0 == null) {
                        this.Y0 = C9069qj2.h(d().values(), this.Y);
                    }
                    collection = this.Y0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    /* renamed from: o.qj2$m */
    /* loaded from: classes3.dex */
    public static class m<E> extends f<E> implements InterfaceC2467Am1<E> {
        private static final long serialVersionUID = 0;
        @MB
        public transient Set<InterfaceC2467Am1.a<E>> Y0;
        @MB
        public transient Set<E> Z;

        public m(InterfaceC2467Am1<E> interfaceC2467Am1, @MB Object obj) {
            super(interfaceC2467Am1, obj);
        }

        @Override // o.InterfaceC2467Am1
        public int R(E e, int i) {
            int R;
            synchronized (this.Y) {
                R = e().R(e, i);
            }
            return R;
        }

        @Override // o.InterfaceC2467Am1
        public boolean Y3(E e, int i, int i2) {
            boolean Y3;
            synchronized (this.Y) {
                Y3 = e().Y3(e, i, i2);
            }
            return Y3;
        }

        @Override // o.InterfaceC2467Am1
        public Set<InterfaceC2467Am1.a<E>> entrySet() {
            Set<InterfaceC2467Am1.a<E>> set;
            synchronized (this.Y) {
                try {
                    if (this.Y0 == null) {
                        this.Y0 = C9069qj2.B(e().entrySet(), this.Y);
                    }
                    set = this.Y0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, o.InterfaceC2467Am1
        public boolean equals(@MB Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                equals = e().equals(obj);
            }
            return equals;
        }

        @Override // o.C9069qj2.f
        /* renamed from: f */
        public InterfaceC2467Am1<E> e() {
            return (InterfaceC2467Am1) super.d();
        }

        @Override // java.util.Collection, o.InterfaceC2467Am1
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = e().hashCode();
            }
            return hashCode;
        }

        @Override // o.InterfaceC2467Am1
        public Set<E> n() {
            Set<E> set;
            synchronized (this.Y) {
                try {
                    if (this.Z == null) {
                        this.Z = C9069qj2.B(e().n(), this.Y);
                    }
                    set = this.Z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // o.InterfaceC2467Am1
        public int v(@MB Object obj, int i) {
            int v;
            synchronized (this.Y) {
                v = e().v(obj, i);
            }
            return v;
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            int w4;
            synchronized (this.Y) {
                w4 = e().w4(obj);
            }
            return w4;
        }

        @Override // o.InterfaceC2467Am1
        public int x(E e, int i) {
            int x;
            synchronized (this.Y) {
                x = e().x(e, i);
            }
            return x;
        }
    }

    /* renamed from: o.qj2$p */
    /* loaded from: classes3.dex */
    public static class p implements Serializable {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;
        public final Object X;
        public final Object Y;

        public p(Object obj, @MB Object obj2) {
            this.X = C10664xF1.E(obj);
            this.Y = obj2 == null ? this : obj2;
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.Y) {
                objectOutputStream.defaultWriteObject();
            }
        }

        public Object d() {
            return this.X;
        }

        public String toString() {
            String obj;
            synchronized (this.Y) {
                obj = this.X.toString();
            }
            return obj;
        }
    }

    /* renamed from: o.qj2$q */
    /* loaded from: classes3.dex */
    public static class q<E> extends f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public q(Queue<E> queue, @MB Object obj) {
            super(queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E element;
            synchronized (this.Y) {
                element = e().element();
            }
            return element;
        }

        @Override // o.C9069qj2.f
        /* renamed from: f */
        public Queue<E> e() {
            return (Queue) super.d();
        }

        @Override // java.util.Queue
        public boolean offer(E e) {
            boolean offer;
            synchronized (this.Y) {
                offer = e().offer(e);
            }
            return offer;
        }

        @Override // java.util.Queue
        @MB
        public E peek() {
            E peek;
            synchronized (this.Y) {
                peek = e().peek();
            }
            return peek;
        }

        @Override // java.util.Queue
        @MB
        public E poll() {
            E poll;
            synchronized (this.Y) {
                poll = e().poll();
            }
            return poll;
        }

        @Override // java.util.Queue
        public E remove() {
            E remove;
            synchronized (this.Y) {
                remove = e().remove();
            }
            return remove;
        }
    }

    /* renamed from: o.qj2$r */
    /* loaded from: classes3.dex */
    public static class r<E> extends i<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public r(List<E> list, @MB Object obj) {
            super(list, obj);
        }
    }

    /* renamed from: o.qj2$s */
    /* loaded from: classes3.dex */
    public static class s<E> extends f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public s(Set<E> set, @MB Object obj) {
            super(set, obj);
        }

        public boolean equals(@MB Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                equals = e().equals(obj);
            }
            return equals;
        }

        @Override // o.C9069qj2.f
        /* renamed from: f */
        public Set<E> e() {
            return (Set) super.d();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = e().hashCode();
            }
            return hashCode;
        }
    }

    /* renamed from: o.qj2$t */
    /* loaded from: classes3.dex */
    public static class t<K, V> extends l<K, V> implements InterfaceC8660p22<K, V> {
        private static final long serialVersionUID = 0;
        @MB
        public transient Set<Map.Entry<K, V>> c1;

        public t(InterfaceC8660p22<K, V> interfaceC8660p22, @MB Object obj) {
            super(interfaceC8660p22, obj);
        }

        @Override // o.C9069qj2.l
        /* renamed from: f */
        public InterfaceC8660p22<K, V> e() {
            return (InterfaceC8660p22) super.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((t<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(Object obj, Iterable iterable) {
            return j((t<K, V>) obj, iterable);
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> get(K k) {
            Set<V> u;
            synchronized (this.Y) {
                u = C9069qj2.u(e().get((InterfaceC8660p22<K, V>) k), this.Y);
            }
            return u;
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> i(@MB Object obj) {
            Set<V> i;
            synchronized (this.Y) {
                i = e().i(obj);
            }
            return i;
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<V> j(K k, Iterable<? extends V> iterable) {
            Set<V> j;
            synchronized (this.Y) {
                j = e().j((InterfaceC8660p22<K, V>) k, (Iterable) iterable);
            }
            return j;
        }

        @Override // o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public Set<Map.Entry<K, V>> r() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.Y) {
                try {
                    if (this.c1 == null) {
                        this.c1 = C9069qj2.u(e().r(), this.Y);
                    }
                    set = this.c1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    /* renamed from: o.qj2$u */
    /* loaded from: classes3.dex */
    public static class u<K, V> extends k<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public u(SortedMap<K, V> sortedMap, @MB Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.Y) {
                comparator = e().comparator();
            }
            return comparator;
        }

        @Override // o.C9069qj2.k
        /* renamed from: f */
        public SortedMap<K, V> e() {
            return (SortedMap) super.d();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K firstKey;
            synchronized (this.Y) {
                firstKey = e().firstKey();
            }
            return firstKey;
        }

        public SortedMap<K, V> headMap(K k) {
            SortedMap<K, V> w;
            synchronized (this.Y) {
                w = C9069qj2.w(e().headMap(k), this.Y);
            }
            return w;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K lastKey;
            synchronized (this.Y) {
                lastKey = e().lastKey();
            }
            return lastKey;
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            SortedMap<K, V> w;
            synchronized (this.Y) {
                w = C9069qj2.w(e().subMap(k, k2), this.Y);
            }
            return w;
        }

        public SortedMap<K, V> tailMap(K k) {
            SortedMap<K, V> w;
            synchronized (this.Y) {
                w = C9069qj2.w(e().tailMap(k), this.Y);
            }
            return w;
        }
    }

    /* renamed from: o.qj2$v */
    /* loaded from: classes3.dex */
    public static class v<E> extends s<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public v(SortedSet<E> sortedSet, @MB Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        @MB
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.Y) {
                comparator = f().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E first;
            synchronized (this.Y) {
                first = f().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e) {
            SortedSet<E> x;
            synchronized (this.Y) {
                x = C9069qj2.x(f().headSet(e), this.Y);
            }
            return x;
        }

        @Override // o.C9069qj2.s
        /* renamed from: k */
        public SortedSet<E> f() {
            return (SortedSet) super.e();
        }

        @Override // java.util.SortedSet
        public E last() {
            E last;
            synchronized (this.Y) {
                last = f().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E e, E e2) {
            SortedSet<E> x;
            synchronized (this.Y) {
                x = C9069qj2.x(f().subSet(e, e2), this.Y);
            }
            return x;
        }

        public SortedSet<E> tailSet(E e) {
            SortedSet<E> x;
            synchronized (this.Y) {
                x = C9069qj2.x(f().tailSet(e), this.Y);
            }
            return x;
        }
    }

    /* renamed from: o.qj2$w */
    /* loaded from: classes3.dex */
    public static class w<K, V> extends t<K, V> implements InterfaceC6829ha2<K, V> {
        private static final long serialVersionUID = 0;

        public w(InterfaceC6829ha2<K, V> interfaceC6829ha2, @MB Object obj) {
            super(interfaceC6829ha2, obj);
        }

        @Override // o.InterfaceC6829ha2
        @MB
        public Comparator<? super V> U() {
            Comparator<? super V> U;
            synchronized (this.Y) {
                U = f().U();
            }
            return U;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection get(Object obj) {
            return get((w<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Collection j(Object obj, Iterable iterable) {
            return j((w<K, V>) obj, iterable);
        }

        @Override // o.C9069qj2.t
        /* renamed from: k */
        public InterfaceC6829ha2<K, V> f() {
            return (InterfaceC6829ha2) super.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Set get(Object obj) {
            return get((w<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public /* bridge */ /* synthetic */ Set j(Object obj, Iterable iterable) {
            return j((w<K, V>) obj, iterable);
        }

        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> get(K k) {
            SortedSet<V> x;
            synchronized (this.Y) {
                x = C9069qj2.x(f().get((InterfaceC6829ha2<K, V>) k), this.Y);
            }
            return x;
        }

        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> i(@MB Object obj) {
            SortedSet<V> i;
            synchronized (this.Y) {
                i = f().i(obj);
            }
            return i;
        }

        @Override // o.C9069qj2.t, o.C9069qj2.l, o.InterfaceC10058um1, o.InterfaceC8660p22
        public SortedSet<V> j(K k, Iterable<? extends V> iterable) {
            SortedSet<V> j;
            synchronized (this.Y) {
                j = f().j((InterfaceC6829ha2<K, V>) k, (Iterable) iterable);
            }
            return j;
        }
    }

    /* renamed from: o.qj2$x */
    /* loaded from: classes3.dex */
    public static final class x<R, C, V> extends p implements InterfaceC3744Nk2<R, C, V> {

        /* renamed from: o.qj2$x$a */
        /* loaded from: classes3.dex */
        public class a implements YA0<Map<C, V>, Map<C, V>> {
            public a() {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Map<C, V> apply(Map<C, V> map) {
                return C9069qj2.l(map, x.this.Y);
            }
        }

        /* renamed from: o.qj2$x$b */
        /* loaded from: classes3.dex */
        public class b implements YA0<Map<R, V>, Map<R, V>> {
            public b() {
            }

            @Override // o.YA0
            /* renamed from: a */
            public Map<R, V> apply(Map<R, V> map) {
                return C9069qj2.l(map, x.this.Y);
            }
        }

        public x(InterfaceC3744Nk2<R, C, V> interfaceC3744Nk2, @MB Object obj) {
            super(interfaceC3744Nk2, obj);
        }

        @Override // o.InterfaceC3744Nk2
        public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
            synchronized (this.Y) {
                d().D3(interfaceC3744Nk2);
            }
        }

        @Override // o.InterfaceC3744Nk2
        public Set<R> F() {
            Set<R> u;
            synchronized (this.Y) {
                u = C9069qj2.u(d().F(), this.Y);
            }
            return u;
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, Map<C, V>> H() {
            Map<R, Map<C, V>> l;
            synchronized (this.Y) {
                l = C9069qj2.l(C7935m81.B0(d().H(), new a()), this.Y);
            }
            return l;
        }

        @Override // o.InterfaceC3744Nk2
        public Set<C> L4() {
            Set<C> u;
            synchronized (this.Y) {
                u = C9069qj2.u(d().L4(), this.Y);
            }
            return u;
        }

        @Override // o.InterfaceC3744Nk2
        public boolean M4(@MB Object obj) {
            boolean M4;
            synchronized (this.Y) {
                M4 = d().M4(obj);
            }
            return M4;
        }

        @Override // o.InterfaceC3744Nk2
        public void clear() {
            synchronized (this.Y) {
                d().clear();
            }
        }

        @Override // o.InterfaceC3744Nk2
        public boolean containsValue(@MB Object obj) {
            boolean containsValue;
            synchronized (this.Y) {
                containsValue = d().containsValue(obj);
            }
            return containsValue;
        }

        @Override // o.InterfaceC3744Nk2
        public Map<R, V> d3(C c) {
            Map<R, V> l;
            synchronized (this.Y) {
                l = C9069qj2.l(d().d3(c), this.Y);
            }
            return l;
        }

        @Override // o.C9069qj2.p
        /* renamed from: e */
        public InterfaceC3744Nk2<R, C, V> d() {
            return (InterfaceC3744Nk2) super.d();
        }

        @Override // o.InterfaceC3744Nk2
        public boolean equals(@MB Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.Y) {
                equals = d().equals(obj);
            }
            return equals;
        }

        @Override // o.InterfaceC3744Nk2
        public int hashCode() {
            int hashCode;
            synchronized (this.Y) {
                hashCode = d().hashCode();
            }
            return hashCode;
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, Map<R, V>> i2() {
            Map<C, Map<R, V>> l;
            synchronized (this.Y) {
                l = C9069qj2.l(C7935m81.B0(d().i2(), new b()), this.Y);
            }
            return l;
        }

        @Override // o.InterfaceC3744Nk2
        public boolean i5(@MB Object obj, @MB Object obj2) {
            boolean i5;
            synchronized (this.Y) {
                i5 = d().i5(obj, obj2);
            }
            return i5;
        }

        @Override // o.InterfaceC3744Nk2
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.Y) {
                isEmpty = d().isEmpty();
            }
            return isEmpty;
        }

        @Override // o.InterfaceC3744Nk2
        public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
            Set<InterfaceC3744Nk2.a<R, C, V>> u;
            synchronized (this.Y) {
                u = C9069qj2.u(d().o3(), this.Y);
            }
            return u;
        }

        @Override // o.InterfaceC3744Nk2
        @MB
        public V q3(R r, C c, V v) {
            V q3;
            synchronized (this.Y) {
                q3 = d().q3(r, c, v);
            }
            return q3;
        }

        @Override // o.InterfaceC3744Nk2
        @MB
        public V r0(@MB Object obj, @MB Object obj2) {
            V r0;
            synchronized (this.Y) {
                r0 = d().r0(obj, obj2);
            }
            return r0;
        }

        @Override // o.InterfaceC3744Nk2
        @MB
        public V remove(@MB Object obj, @MB Object obj2) {
            V remove;
            synchronized (this.Y) {
                remove = d().remove(obj, obj2);
            }
            return remove;
        }

        @Override // o.InterfaceC3744Nk2
        public int size() {
            int size;
            synchronized (this.Y) {
                size = d().size();
            }
            return size;
        }

        @Override // o.InterfaceC3744Nk2
        public Collection<V> values() {
            Collection<V> h;
            synchronized (this.Y) {
                h = C9069qj2.h(d().values(), this.Y);
            }
            return h;
        }

        @Override // o.InterfaceC3744Nk2
        public Map<C, V> x5(R r) {
            Map<C, V> l;
            synchronized (this.Y) {
                l = C9069qj2.l(d().x5(r), this.Y);
            }
            return l;
        }

        @Override // o.InterfaceC3744Nk2
        public boolean y0(@MB Object obj) {
            boolean y0;
            synchronized (this.Y) {
                y0 = d().y0(obj);
            }
            return y0;
        }
    }

    public static <E> Collection<E> A(Collection<E> collection, @MB Object obj) {
        if (collection instanceof SortedSet) {
            return x((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return u((Set) collection, obj);
        }
        if (collection instanceof List) {
            return j((List) collection, obj);
        }
        return h(collection, obj);
    }

    public static <E> Set<E> B(Set<E> set, @MB Object obj) {
        if (set instanceof SortedSet) {
            return x((SortedSet) set, obj);
        }
        return u(set, obj);
    }

    public static <K, V> InterfaceC4626Wm<K, V> g(InterfaceC4626Wm<K, V> interfaceC4626Wm, @MB Object obj) {
        if (!(interfaceC4626Wm instanceof e)) {
            if (interfaceC4626Wm instanceof RN0) {
                return interfaceC4626Wm;
            }
            return new e(interfaceC4626Wm, obj, null);
        }
        return interfaceC4626Wm;
    }

    public static <E> Collection<E> h(Collection<E> collection, @MB Object obj) {
        return new f(collection, obj);
    }

    public static <E> Deque<E> i(Deque<E> deque, @MB Object obj) {
        return new g(deque, obj);
    }

    public static <E> List<E> j(List<E> list, @MB Object obj) {
        if (list instanceof RandomAccess) {
            return new r(list, obj);
        }
        return new i(list, obj);
    }

    public static <K, V> V01<K, V> k(V01<K, V> v01, @MB Object obj) {
        if (!(v01 instanceof j)) {
            if (v01 instanceof AbstractC7354jl) {
                return v01;
            }
            return new j(v01, obj);
        }
        return v01;
    }

    @InterfaceC5299bJ2
    public static <K, V> Map<K, V> l(Map<K, V> map, @MB Object obj) {
        return new k(map, obj);
    }

    public static <K, V> InterfaceC10058um1<K, V> m(InterfaceC10058um1<K, V> interfaceC10058um1, @MB Object obj) {
        if (!(interfaceC10058um1 instanceof l)) {
            if (interfaceC10058um1 instanceof AbstractC7354jl) {
                return interfaceC10058um1;
            }
            return new l(interfaceC10058um1, obj);
        }
        return interfaceC10058um1;
    }

    public static <E> InterfaceC2467Am1<E> n(InterfaceC2467Am1<E> interfaceC2467Am1, @MB Object obj) {
        if (!(interfaceC2467Am1 instanceof m)) {
            if (interfaceC2467Am1 instanceof AbstractC7269jO0) {
                return interfaceC2467Am1;
            }
            return new m(interfaceC2467Am1, obj);
        }
        return interfaceC2467Am1;
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return p(navigableMap, null);
    }

    @InterfaceC11149zF0
    public static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @MB Object obj) {
        return new n(navigableMap, obj);
    }

    @InterfaceC11149zF0
    public static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return r(navigableSet, null);
    }

    @InterfaceC11149zF0
    public static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @MB Object obj) {
        return new o(navigableSet, obj);
    }

    @MB
    @InterfaceC11149zF0
    public static <K, V> Map.Entry<K, V> s(@MB Map.Entry<K, V> entry, @MB Object obj) {
        if (entry == null) {
            return null;
        }
        return new h(entry, obj);
    }

    public static <E> Queue<E> t(Queue<E> queue, @MB Object obj) {
        if (queue instanceof q) {
            return queue;
        }
        return new q(queue, obj);
    }

    @InterfaceC5299bJ2
    public static <E> Set<E> u(Set<E> set, @MB Object obj) {
        return new s(set, obj);
    }

    public static <K, V> InterfaceC8660p22<K, V> v(InterfaceC8660p22<K, V> interfaceC8660p22, @MB Object obj) {
        if (!(interfaceC8660p22 instanceof t)) {
            if (interfaceC8660p22 instanceof AbstractC7354jl) {
                return interfaceC8660p22;
            }
            return new t(interfaceC8660p22, obj);
        }
        return interfaceC8660p22;
    }

    public static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @MB Object obj) {
        return new u(sortedMap, obj);
    }

    public static <E> SortedSet<E> x(SortedSet<E> sortedSet, @MB Object obj) {
        return new v(sortedSet, obj);
    }

    public static <K, V> InterfaceC6829ha2<K, V> y(InterfaceC6829ha2<K, V> interfaceC6829ha2, @MB Object obj) {
        if (interfaceC6829ha2 instanceof w) {
            return interfaceC6829ha2;
        }
        return new w(interfaceC6829ha2, obj);
    }

    public static <R, C, V> InterfaceC3744Nk2<R, C, V> z(InterfaceC3744Nk2<R, C, V> interfaceC3744Nk2, @MB Object obj) {
        return new x(interfaceC3744Nk2, obj);
    }

    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    /* renamed from: o.qj2$n */
    /* loaded from: classes3.dex */
    public static class n<K, V> extends u<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;
        @MB
        public transient NavigableSet<K> a1;
        @MB
        public transient NavigableMap<K, V> b1;
        @MB
        public transient NavigableSet<K> c1;

        public n(NavigableMap<K, V> navigableMap, @MB Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> ceilingEntry(K k) {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().ceilingEntry(k), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public K ceilingKey(K k) {
            K ceilingKey;
            synchronized (this.Y) {
                ceilingKey = f().ceilingKey(k);
            }
            return ceilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.Y) {
                try {
                    NavigableSet<K> navigableSet = this.a1;
                    if (navigableSet == null) {
                        NavigableSet<K> r = C9069qj2.r(f().descendingKeySet(), this.Y);
                        this.a1 = r;
                        return r;
                    }
                    return navigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.Y) {
                try {
                    NavigableMap<K, V> navigableMap = this.b1;
                    if (navigableMap == null) {
                        NavigableMap<K, V> p = C9069qj2.p(f().descendingMap(), this.Y);
                        this.b1 = p;
                        return p;
                    }
                    return navigableMap;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().firstEntry(), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> floorEntry(K k) {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().floorEntry(k), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public K floorKey(K k) {
            K floorKey;
            synchronized (this.Y) {
                floorKey = f().floorKey(k);
            }
            return floorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            NavigableMap<K, V> p;
            synchronized (this.Y) {
                p = C9069qj2.p(f().headMap(k, z), this.Y);
            }
            return p;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> higherEntry(K k) {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().higherEntry(k), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public K higherKey(K k) {
            K higherKey;
            synchronized (this.Y) {
                higherKey = f().higherKey(k);
            }
            return higherKey;
        }

        @Override // o.C9069qj2.u
        /* renamed from: k */
        public NavigableMap<K, V> f() {
            return (NavigableMap) super.e();
        }

        @Override // o.C9069qj2.k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().lastEntry(), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> lowerEntry(K k) {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().lowerEntry(k), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public K lowerKey(K k) {
            K lowerKey;
            synchronized (this.Y) {
                lowerKey = f().lowerKey(k);
            }
            return lowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.Y) {
                try {
                    NavigableSet<K> navigableSet = this.c1;
                    if (navigableSet == null) {
                        NavigableSet<K> r = C9069qj2.r(f().navigableKeySet(), this.Y);
                        this.c1 = r;
                        return r;
                    }
                    return navigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().pollFirstEntry(), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> s;
            synchronized (this.Y) {
                s = C9069qj2.s(f().pollLastEntry(), this.Y);
            }
            return s;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            NavigableMap<K, V> p;
            synchronized (this.Y) {
                p = C9069qj2.p(f().subMap(k, z, k2, z2), this.Y);
            }
            return p;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            NavigableMap<K, V> p;
            synchronized (this.Y) {
                p = C9069qj2.p(f().tailMap(k, z), this.Y);
            }
            return p;
        }

        @Override // o.C9069qj2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // o.C9069qj2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // o.C9069qj2.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    @InterfaceC11149zF0
    @InterfaceC5299bJ2
    /* renamed from: o.qj2$o */
    /* loaded from: classes3.dex */
    public static class o<E> extends v<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;
        @MB
        public transient NavigableSet<E> Z;

        public o(NavigableSet<E> navigableSet, @MB Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        @MB
        public E ceiling(E e) {
            E ceiling;
            synchronized (this.Y) {
                ceiling = k().ceiling(e);
            }
            return ceiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return k().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.Y) {
                try {
                    NavigableSet<E> navigableSet = this.Z;
                    if (navigableSet == null) {
                        NavigableSet<E> r = C9069qj2.r(k().descendingSet(), this.Y);
                        this.Z = r;
                        return r;
                    }
                    return navigableSet;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableSet
        @MB
        public E floor(E e) {
            E floor;
            synchronized (this.Y) {
                floor = k().floor(e);
            }
            return floor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            NavigableSet<E> r;
            synchronized (this.Y) {
                r = C9069qj2.r(k().headSet(e, z), this.Y);
            }
            return r;
        }

        @Override // java.util.NavigableSet
        @MB
        public E higher(E e) {
            E higher;
            synchronized (this.Y) {
                higher = k().higher(e);
            }
            return higher;
        }

        @Override // java.util.NavigableSet
        @MB
        public E lower(E e) {
            E lower;
            synchronized (this.Y) {
                lower = k().lower(e);
            }
            return lower;
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollFirst() {
            E pollFirst;
            synchronized (this.Y) {
                pollFirst = k().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollLast() {
            E pollLast;
            synchronized (this.Y) {
                pollLast = k().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            NavigableSet<E> r;
            synchronized (this.Y) {
                r = C9069qj2.r(k().subSet(e, z, e2, z2), this.Y);
            }
            return r;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            NavigableSet<E> r;
            synchronized (this.Y) {
                r = C9069qj2.r(k().tailSet(e, z), this.Y);
            }
            return r;
        }

        @Override // o.C9069qj2.v
        /* renamed from: w */
        public NavigableSet<E> k() {
            return (NavigableSet) super.f();
        }

        @Override // o.C9069qj2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e) {
            return headSet(e, false);
        }

        @Override // o.C9069qj2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e) {
            return tailSet(e, true);
        }

        @Override // o.C9069qj2.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e, E e2) {
            return subSet(e, true, e2, false);
        }
    }

    /* renamed from: o.qj2$c */
    /* loaded from: classes3.dex */
    public static class c<K, V> extends s<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* renamed from: o.qj2$c$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC8375ns2<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* renamed from: o.qj2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0328a extends AbstractC10105uy0<K, Collection<V>> {
                public final /* synthetic */ Map.Entry X;

                public C0328a(Map.Entry entry) {
                    this.X = entry;
                }

                @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
                /* renamed from: M5 */
                public Map.Entry<K, Collection<V>> L5() {
                    return this.X;
                }

                @Override // o.AbstractC10105uy0, java.util.Map.Entry
                /* renamed from: Q5 */
                public Collection<V> getValue() {
                    return C9069qj2.A((Collection) this.X.getValue(), c.this.Y);
                }
            }

            public a(Iterator it) {
                super(it);
            }

            @Override // o.AbstractC8375ns2
            /* renamed from: c */
            public Map.Entry<K, Collection<V>> b(Map.Entry<K, Collection<V>> entry) {
                return new C0328a(entry);
            }
        }

        public c(Set<Map.Entry<K, Collection<V>>> set, @MB Object obj) {
            super(set, obj);
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            boolean p;
            synchronized (this.Y) {
                p = C7935m81.p(e(), obj);
            }
            return p;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean b;
            synchronized (this.Y) {
                b = C7232jF.b(e(), collection);
            }
            return b;
        }

        @Override // o.C9069qj2.s, java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            boolean g;
            if (obj == this) {
                return true;
            }
            synchronized (this.Y) {
                g = C10856y22.g(e(), obj);
            }
            return g;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            boolean k0;
            synchronized (this.Y) {
                k0 = C7935m81.k0(e(), obj);
            }
            return k0;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean V;
            synchronized (this.Y) {
                V = C7052iU0.V(e().iterator(), collection);
            }
            return V;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean X;
            synchronized (this.Y) {
                X = C7052iU0.X(e().iterator(), collection);
            }
            return X;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] l;
            synchronized (this.Y) {
                l = C5436bt1.l(e());
            }
            return l;
        }

        @Override // o.C9069qj2.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.Y) {
                tArr2 = (T[]) C5436bt1.m(e(), tArr);
            }
            return tArr2;
        }
    }
}
