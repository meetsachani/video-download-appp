package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class I01<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> d1 = new a();
    public static final /* synthetic */ boolean e1 = false;
    public final Comparator<? super K> X;
    public final boolean Y;
    public int Y0;
    public e<K, V> Z;
    public int Z0;
    public final e<K, V> a1;
    public I01<K, V>.b b1;
    public I01<K, V>.c c1;

    /* loaded from: classes3.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes3.dex */
        public class a extends I01<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            I01.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && I01.this.c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c;
            if (!(obj instanceof Map.Entry) || (c = I01.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            I01.this.f(c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return I01.this.Y0;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes3.dex */
        public class a extends I01<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().a1;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            I01.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return I01.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (I01.this.g(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return I01.this.Y0;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> X;
        public e<K, V> Y = null;
        public int Z;

        public d() {
            this.X = I01.this.a1.Y0;
            this.Z = I01.this.Z0;
        }

        public final e<K, V> b() {
            e<K, V> eVar = this.X;
            I01 i01 = I01.this;
            if (eVar != i01.a1) {
                if (i01.Z0 == this.Z) {
                    this.X = eVar.Y0;
                    this.Y = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.X != I01.this.a1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.Y;
            if (eVar != null) {
                I01.this.f(eVar, true);
                this.Y = null;
                this.Z = I01.this.Z0;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public I01() {
        this(d1, true);
    }

    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public e<K, V> b(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        Comparator<? super K> comparator = this.X;
        e<K, V> eVar3 = this.Z;
        if (eVar3 != null) {
            if (comparator == d1) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.a1);
                } else {
                    i = comparator.compare(k, (K) eVar3.a1);
                }
                if (i == 0) {
                    return eVar3;
                }
                if (i < 0) {
                    eVar2 = eVar3.Y;
                } else {
                    eVar2 = eVar3.Z;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i = 0;
        }
        e<K, V> eVar4 = eVar3;
        if (!z) {
            return null;
        }
        e<K, V> eVar5 = this.a1;
        if (eVar4 == null) {
            if (comparator == d1 && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.Y, eVar4, k, eVar5, eVar5.Z0);
            this.Z = eVar;
        } else {
            eVar = new e<>(this.Y, eVar4, k, eVar5, eVar5.Z0);
            if (i < 0) {
                eVar4.Y = eVar;
            } else {
                eVar4.Z = eVar;
            }
            e(eVar4, true);
        }
        this.Y0++;
        this.Z0++;
        return eVar;
    }

    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.c1, entry.getValue())) {
            return d2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.Z = null;
        this.Y0 = 0;
        this.Z0++;
        e<K, V> eVar = this.a1;
        eVar.Z0 = eVar;
        eVar.Y0 = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (d(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void e(e<K, V> eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.Y;
            e<K, V> eVar3 = eVar.Z;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.d1;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.d1;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                e<K, V> eVar4 = eVar3.Y;
                e<K, V> eVar5 = eVar3.Z;
                if (eVar5 != null) {
                    i4 = eVar5.d1;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.d1;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    k(eVar3);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                e<K, V> eVar6 = eVar2.Y;
                e<K, V> eVar7 = eVar2.Z;
                if (eVar7 != null) {
                    i3 = eVar7.d1;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.d1;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    j(eVar2);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.d1 = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.d1 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.X;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        I01<K, V>.b bVar = this.b1;
        if (bVar == null) {
            I01<K, V>.b bVar2 = new b();
            this.b1 = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public void f(e<K, V> eVar, boolean z) {
        e<K, V> a2;
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.Z0;
            eVar2.Y0 = eVar.Y0;
            eVar.Y0.Z0 = eVar2;
        }
        e<K, V> eVar3 = eVar.Y;
        e<K, V> eVar4 = eVar.Z;
        e<K, V> eVar5 = eVar.X;
        int i2 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.d1 > eVar4.d1) {
                a2 = eVar3.b();
            } else {
                a2 = eVar4.a();
            }
            f(a2, false);
            e<K, V> eVar6 = eVar.Y;
            if (eVar6 != null) {
                i = eVar6.d1;
                a2.Y = eVar6;
                eVar6.X = a2;
                eVar.Y = null;
            } else {
                i = 0;
            }
            e<K, V> eVar7 = eVar.Z;
            if (eVar7 != null) {
                i2 = eVar7.d1;
                a2.Z = eVar7;
                eVar7.X = a2;
                eVar.Z = null;
            }
            a2.d1 = Math.max(i, i2) + 1;
            i(eVar, a2);
            return;
        }
        if (eVar3 != null) {
            i(eVar, eVar3);
            eVar.Y = null;
        } else if (eVar4 != null) {
            i(eVar, eVar4);
            eVar.Z = null;
        } else {
            i(eVar, null);
        }
        e(eVar5, false);
        this.Y0--;
        this.Z0++;
    }

    public e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.c1;
        }
        return null;
    }

    public final void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.X;
        eVar.X = null;
        if (eVar2 != null) {
            eVar2.X = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.Y == eVar) {
                eVar3.Y = eVar2;
                return;
            } else {
                eVar3.Z = eVar2;
                return;
            }
        }
        this.Z = eVar2;
    }

    public final void j(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.Y;
        e<K, V> eVar3 = eVar.Z;
        e<K, V> eVar4 = eVar3.Y;
        e<K, V> eVar5 = eVar3.Z;
        eVar.Z = eVar4;
        if (eVar4 != null) {
            eVar4.X = eVar;
        }
        i(eVar, eVar3);
        eVar3.Y = eVar;
        eVar.X = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.d1;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.d1;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.d1 = max;
        if (eVar5 != null) {
            i3 = eVar5.d1;
        }
        eVar3.d1 = Math.max(max, i3) + 1;
    }

    public final void k(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.Y;
        e<K, V> eVar3 = eVar.Z;
        e<K, V> eVar4 = eVar2.Y;
        e<K, V> eVar5 = eVar2.Z;
        eVar.Y = eVar5;
        if (eVar5 != null) {
            eVar5.X = eVar;
        }
        i(eVar, eVar2);
        eVar2.Z = eVar;
        eVar.X = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.d1;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.d1;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.d1 = max;
        if (eVar4 != null) {
            i3 = eVar4.d1;
        }
        eVar2.d1 = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        I01<K, V>.c cVar = this.c1;
        if (cVar == null) {
            I01<K, V>.c cVar2 = new c();
            this.c1 = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @InterfaceC6181ey
    public V put(K k, V v) {
        if (k != null) {
            if (v == null && !this.Y) {
                throw new NullPointerException("value == null");
            }
            e<K, V> b2 = b(k, true);
            V v2 = b2.c1;
            b2.c1 = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g = g(obj);
        if (g != null) {
            return g.c1;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y0;
    }

    public I01(boolean z) {
        this(d1, z);
    }

    public I01(Comparator<? super K> comparator, boolean z) {
        this.Y0 = 0;
        this.Z0 = 0;
        this.X = comparator == null ? d1 : comparator;
        this.Y = z;
        this.a1 = new e<>(z);
    }

    /* loaded from: classes3.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> X;
        public e<K, V> Y;
        public e<K, V> Y0;
        public e<K, V> Z;
        public e<K, V> Z0;
        public final K a1;
        public final boolean b1;
        public V c1;
        public int d1;

        public e(boolean z) {
            this.a1 = null;
            this.b1 = z;
            this.Z0 = this;
            this.Y0 = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.Y; eVar2 != null; eVar2 = eVar2.Y) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.Z; eVar2 != null; eVar2 = eVar2.Z) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.a1;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.c1;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a1;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c1;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.a1;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.c1;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (v == null && !this.b1) {
                throw new NullPointerException("value == null");
            }
            V v2 = this.c1;
            this.c1 = v;
            return v2;
        }

        public String toString() {
            return this.a1 + "=" + this.c1;
        }

        public e(boolean z, e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.X = eVar;
            this.a1 = k;
            this.b1 = z;
            this.d1 = 1;
            this.Y0 = eVar2;
            this.Z0 = eVar3;
            eVar3.Y0 = this;
            eVar2.Z0 = this;
        }
    }
}
