package o;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class E01<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator<Comparable> d1 = new a();
    public static final /* synthetic */ boolean e1 = false;
    public Comparator<? super K> X;
    public g<K, V>[] Y;
    public int Y0;
    public final g<K, V> Z;
    public int Z0;
    public int a1;
    public E01<K, V>.d b1;
    public E01<K, V>.e c1;

    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> {
        public g<K, V> a;
        public int b;
        public int c;
        public int d;

        public void a(g<K, V> gVar) {
            gVar.Z = null;
            gVar.X = null;
            gVar.Y = null;
            gVar.d1 = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            gVar.X = this.a;
            this.a = gVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) == i7) {
                    int i8 = this.c;
                    if (i8 == 0) {
                        g<K, V> gVar2 = this.a;
                        g<K, V> gVar3 = gVar2.X;
                        g<K, V> gVar4 = gVar3.X;
                        gVar3.X = gVar4.X;
                        this.a = gVar3;
                        gVar3.Y = gVar4;
                        gVar3.Z = gVar2;
                        gVar3.d1 = gVar2.d1 + 1;
                        gVar4.X = gVar3;
                        gVar2.X = gVar3;
                    } else if (i8 == 1) {
                        g<K, V> gVar5 = this.a;
                        g<K, V> gVar6 = gVar5.X;
                        this.a = gVar6;
                        gVar6.Z = gVar5;
                        gVar6.d1 = gVar5.d1 + 1;
                        gVar5.X = gVar6;
                        this.c = 0;
                    } else if (i8 == 2) {
                        this.c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        public void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.a;
            if (gVar.X == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> {
        public g<K, V> a;

        public g<K, V> a() {
            g<K, V> gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.X;
            gVar.X = null;
            g<K, V> gVar3 = gVar.Z;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.X = gVar4;
                    gVar3 = gVar2.Y;
                } else {
                    this.a = gVar4;
                    return gVar;
                }
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.X = gVar2;
                gVar2 = gVar;
                gVar = gVar.Y;
            }
            this.a = gVar2;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends E01<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            E01.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && E01.this.e((Map.Entry) obj) != null) {
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
            g<K, V> e;
            if (!(obj instanceof Map.Entry) || (e = E01.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            E01.this.i(e, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return E01.this.Y0;
        }
    }

    /* loaded from: classes.dex */
    public final class e extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends E01<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().a1;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            E01.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return E01.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (E01.this.j(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return E01.this.Y0;
        }
    }

    /* loaded from: classes.dex */
    public abstract class f<T> implements Iterator<T> {
        public g<K, V> X;
        public g<K, V> Y = null;
        public int Z;

        public f() {
            this.X = E01.this.Z.Y0;
            this.Z = E01.this.Z0;
        }

        public final g<K, V> b() {
            g<K, V> gVar = this.X;
            E01 e01 = E01.this;
            if (gVar != e01.Z) {
                if (e01.Z0 == this.Z) {
                    this.X = gVar.Y0;
                    this.Y = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.X != E01.this.Z) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.Y;
            if (gVar != null) {
                E01.this.i(gVar, true);
                this.Y = null;
                this.Z = E01.this.Z0;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public E01() {
        this(null);
    }

    public static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        g<K, V> gVar;
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i = 0; i < length; i++) {
            g<K, V> gVar2 = gVarArr[i];
            if (gVar2 != null) {
                cVar.b(gVar2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    g<K, V> a2 = cVar.a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.b1 & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.b(i2);
                bVar2.b(i3);
                cVar.b(gVar2);
                while (true) {
                    g<K, V> a3 = cVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.b1 & length) == 0) {
                        bVar.a(a3);
                    } else {
                        bVar2.a(a3);
                    }
                }
                g<K, V> gVar3 = null;
                if (i2 > 0) {
                    gVar = bVar.c();
                } else {
                    gVar = null;
                }
                gVarArr2[i] = gVar;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar3 = bVar2.c();
                }
                gVarArr2[i4] = gVar3;
            }
        }
        return gVarArr2;
    }

    public static int n(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void a() {
        g<K, V>[] b2 = b(this.Y);
        this.Y = b2;
        this.a1 = (b2.length / 2) + (b2.length / 4);
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.Y, (Object) null);
        this.Y0 = 0;
        this.Z0++;
        g<K, V> gVar = this.Z;
        g<K, V> gVar2 = gVar.Y0;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.Y0;
            gVar2.Z0 = null;
            gVar2.Y0 = null;
            gVar2 = gVar3;
        }
        gVar.Z0 = gVar;
        gVar.Y0 = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (f(obj) != null) {
            return true;
        }
        return false;
    }

    public g<K, V> d(K k, boolean z) {
        int i;
        g<K, V> gVar;
        Comparable comparable;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.X;
        g<K, V>[] gVarArr = this.Y;
        int n = n(k.hashCode());
        int length = (gVarArr.length - 1) & n;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator == d1) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(gVar3.a1);
                } else {
                    i = comparator.compare(k, (K) gVar3.a1);
                }
                if (i == 0) {
                    return gVar3;
                }
                if (i < 0) {
                    gVar2 = gVar3.Y;
                } else {
                    gVar2 = gVar3.Z;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i = 0;
        }
        int i2 = i;
        if (!z) {
            return null;
        }
        g<K, V> gVar4 = this.Z;
        if (gVar3 == null) {
            if (comparator != d1 || (k instanceof Comparable)) {
                gVar = new g<>(gVar3, k, n, gVar4, gVar4.Z0);
                gVarArr[length] = gVar;
            } else {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
        } else {
            g<K, V> gVar5 = gVar3;
            gVar = new g<>(gVar5, k, n, gVar4, gVar4.Z0);
            if (i2 < 0) {
                gVar5.Y = gVar;
            } else {
                gVar5.Z = gVar;
            }
            g(gVar5, true);
        }
        int i3 = this.Y0;
        this.Y0 = i3 + 1;
        if (i3 > this.a1) {
            a();
        }
        this.Z0++;
        return gVar;
    }

    public g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> f2 = f(entry.getKey());
        if (f2 != null && c(f2.c1, entry.getValue())) {
            return f2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        E01<K, V>.d dVar = this.b1;
        if (dVar != null) {
            return dVar;
        }
        E01<K, V>.d dVar2 = new d();
        this.b1 = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void g(g<K, V> gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (gVar != null) {
            g<K, V> gVar2 = gVar.Y;
            g<K, V> gVar3 = gVar.Z;
            int i5 = 0;
            if (gVar2 != null) {
                i = gVar2.d1;
            } else {
                i = 0;
            }
            if (gVar3 != null) {
                i2 = gVar3.d1;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                g<K, V> gVar4 = gVar3.Y;
                g<K, V> gVar5 = gVar3.Z;
                if (gVar5 != null) {
                    i4 = gVar5.d1;
                } else {
                    i4 = 0;
                }
                if (gVar4 != null) {
                    i5 = gVar4.d1;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m(gVar3);
                    l(gVar);
                } else {
                    l(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                g<K, V> gVar6 = gVar2.Y;
                g<K, V> gVar7 = gVar2.Z;
                if (gVar7 != null) {
                    i3 = gVar7.d1;
                } else {
                    i3 = 0;
                }
                if (gVar6 != null) {
                    i5 = gVar6.d1;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    l(gVar2);
                    m(gVar);
                } else {
                    m(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.d1 = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.d1 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.X;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> f2 = f(obj);
        if (f2 != null) {
            return f2.c1;
        }
        return null;
    }

    public void i(g<K, V> gVar, boolean z) {
        g<K, V> a2;
        int i;
        if (z) {
            g<K, V> gVar2 = gVar.Z0;
            gVar2.Y0 = gVar.Y0;
            gVar.Y0.Z0 = gVar2;
            gVar.Z0 = null;
            gVar.Y0 = null;
        }
        g<K, V> gVar3 = gVar.Y;
        g<K, V> gVar4 = gVar.Z;
        g<K, V> gVar5 = gVar.X;
        int i2 = 0;
        if (gVar3 != null && gVar4 != null) {
            if (gVar3.d1 > gVar4.d1) {
                a2 = gVar3.b();
            } else {
                a2 = gVar4.a();
            }
            i(a2, false);
            g<K, V> gVar6 = gVar.Y;
            if (gVar6 != null) {
                i = gVar6.d1;
                a2.Y = gVar6;
                gVar6.X = a2;
                gVar.Y = null;
            } else {
                i = 0;
            }
            g<K, V> gVar7 = gVar.Z;
            if (gVar7 != null) {
                i2 = gVar7.d1;
                a2.Z = gVar7;
                gVar7.X = a2;
                gVar.Z = null;
            }
            a2.d1 = Math.max(i, i2) + 1;
            k(gVar, a2);
            return;
        }
        if (gVar3 != null) {
            k(gVar, gVar3);
            gVar.Y = null;
        } else if (gVar4 != null) {
            k(gVar, gVar4);
            gVar.Z = null;
        } else {
            k(gVar, null);
        }
        g(gVar5, false);
        this.Y0--;
        this.Z0++;
    }

    public g<K, V> j(Object obj) {
        g<K, V> f2 = f(obj);
        if (f2 != null) {
            i(f2, true);
        }
        return f2;
    }

    public final void k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.X;
        gVar.X = null;
        if (gVar2 != null) {
            gVar2.X = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.Y == gVar) {
                gVar3.Y = gVar2;
                return;
            } else {
                gVar3.Z = gVar2;
                return;
            }
        }
        int i = gVar.b1;
        g<K, V>[] gVarArr = this.Y;
        gVarArr[i & (gVarArr.length - 1)] = gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        E01<K, V>.e eVar = this.c1;
        if (eVar != null) {
            return eVar;
        }
        E01<K, V>.e eVar2 = new e();
        this.c1 = eVar2;
        return eVar2;
    }

    public final void l(g<K, V> gVar) {
        int i;
        int i2;
        g<K, V> gVar2 = gVar.Y;
        g<K, V> gVar3 = gVar.Z;
        g<K, V> gVar4 = gVar3.Y;
        g<K, V> gVar5 = gVar3.Z;
        gVar.Z = gVar4;
        if (gVar4 != null) {
            gVar4.X = gVar;
        }
        k(gVar, gVar3);
        gVar3.Y = gVar;
        gVar.X = gVar3;
        int i3 = 0;
        if (gVar2 != null) {
            i = gVar2.d1;
        } else {
            i = 0;
        }
        if (gVar4 != null) {
            i2 = gVar4.d1;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.d1 = max;
        if (gVar5 != null) {
            i3 = gVar5.d1;
        }
        gVar3.d1 = Math.max(max, i3) + 1;
    }

    public final void m(g<K, V> gVar) {
        int i;
        int i2;
        g<K, V> gVar2 = gVar.Y;
        g<K, V> gVar3 = gVar.Z;
        g<K, V> gVar4 = gVar2.Y;
        g<K, V> gVar5 = gVar2.Z;
        gVar.Y = gVar5;
        if (gVar5 != null) {
            gVar5.X = gVar;
        }
        k(gVar, gVar2);
        gVar2.Z = gVar;
        gVar.X = gVar2;
        int i3 = 0;
        if (gVar3 != null) {
            i = gVar3.d1;
        } else {
            i = 0;
        }
        if (gVar5 != null) {
            i2 = gVar5.d1;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.d1 = max;
        if (gVar4 != null) {
            i3 = gVar4.d1;
        }
        gVar2.d1 = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            g<K, V> d2 = d(k, true);
            V v2 = d2.c1;
            d2.c1 = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> j = j(obj);
        if (j != null) {
            return j.c1;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y0;
    }

    public E01(Comparator<? super K> comparator) {
        this.Y0 = 0;
        this.Z0 = 0;
        this.X = comparator == null ? d1 : comparator;
        this.Z = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.Y = gVarArr;
        this.a1 = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* loaded from: classes.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {
        public g<K, V> X;
        public g<K, V> Y;
        public g<K, V> Y0;
        public g<K, V> Z;
        public g<K, V> Z0;
        public final K a1;
        public final int b1;
        public V c1;
        public int d1;

        public g() {
            this.a1 = null;
            this.b1 = -1;
            this.Z0 = this;
            this.Y0 = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.Y; gVar2 != null; gVar2 = gVar2.Y) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.Z; gVar2 != null; gVar2 = gVar2.Z) {
                gVar = gVar2;
            }
            return gVar;
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
            V v2 = this.c1;
            this.c1 = v;
            return v2;
        }

        public String toString() {
            return this.a1 + "=" + this.c1;
        }

        public g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.X = gVar;
            this.a1 = k;
            this.b1 = i;
            this.d1 = 1;
            this.Y0 = gVar2;
            this.Z0 = gVar3;
            gVar3.Y0 = this;
            gVar2.Z0 = this;
        }
    }
}
