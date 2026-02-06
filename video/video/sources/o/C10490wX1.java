package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.wX1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10490wX1<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> X;
    public c<K, V> Y;
    public final WeakHashMap<f<K, V>, Boolean> Z = new WeakHashMap<>();
    public int Y0 = 0;

    /* renamed from: o.wX1$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C10490wX1.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.Y0;
        }

        @Override // o.C10490wX1.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.Z;
        }
    }

    /* renamed from: o.wX1$b */
    /* loaded from: classes.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.C10490wX1.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.Z;
        }

        @Override // o.C10490wX1.e
        public c<K, V> d(c<K, V> cVar) {
            return cVar.Y0;
        }
    }

    /* renamed from: o.wX1$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K X;
        public final V Y;
        public c<K, V> Y0;
        public c<K, V> Z;

        public c(K k, V v) {
            this.X = k;
            this.Y = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.X.equals(cVar.X) && this.Y.equals(cVar.Y)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.X.hashCode() ^ this.Y.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.X + "=" + this.Y;
        }
    }

    /* renamed from: o.wX1$d */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> X;
        public boolean Y = true;

        public d() {
        }

        @Override // o.C10490wX1.f
        public void b(c<K, V> cVar) {
            boolean z;
            c<K, V> cVar2 = this.X;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.Y0;
                this.X = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.Y = z;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.Y) {
                this.Y = false;
                this.X = C10490wX1.this.X;
            } else {
                c<K, V> cVar2 = this.X;
                if (cVar2 != null) {
                    cVar = cVar2.Z;
                } else {
                    cVar = null;
                }
                this.X = cVar;
            }
            return this.X;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y) {
                if (C10490wX1.this.X == null) {
                    return false;
                }
                return true;
            }
            c<K, V> cVar = this.X;
            if (cVar == null || cVar.Z == null) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.wX1$e */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> X;
        public c<K, V> Y;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.X = cVar2;
            this.Y = cVar;
        }

        @Override // o.C10490wX1.f
        public void b(c<K, V> cVar) {
            if (this.X == cVar && cVar == this.Y) {
                this.Y = null;
                this.X = null;
            }
            c<K, V> cVar2 = this.X;
            if (cVar2 == cVar) {
                this.X = c(cVar2);
            }
            if (this.Y == cVar) {
                this.Y = f();
            }
        }

        public abstract c<K, V> c(c<K, V> cVar);

        public abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.Y;
            this.Y = f();
            return cVar;
        }

        public final c<K, V> f() {
            c<K, V> cVar = this.Y;
            c<K, V> cVar2 = this.X;
            if (cVar != cVar2 && cVar2 != null) {
                return d(cVar);
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.wX1$f */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        public abstract void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.X;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.Y, this.X);
        this.Z.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c<K, V> e(K k) {
        c<K, V> cVar = this.X;
        while (cVar != null && !cVar.X.equals(k)) {
            cVar = cVar.Z;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10490wX1)) {
            return false;
        }
        C10490wX1 c10490wX1 = (C10490wX1) obj;
        if (size() != c10490wX1.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c10490wX1.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public C10490wX1<K, V>.d f() {
        C10490wX1<K, V>.d dVar = new d();
        this.Z.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.Y;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public c<K, V> i(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.Y0++;
        c<K, V> cVar2 = this.Y;
        if (cVar2 == null) {
            this.X = cVar;
            this.Y = cVar;
            return cVar;
        }
        cVar2.Z = cVar;
        cVar.Y0 = cVar2;
        this.Y = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.X, this.Y);
        this.Z.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k, V v) {
        c<K, V> e2 = e(k);
        if (e2 != null) {
            return e2.Y;
        }
        i(k, v);
        return null;
    }

    public V k(K k) {
        c<K, V> e2 = e(k);
        if (e2 == null) {
            return null;
        }
        this.Y0--;
        if (!this.Z.isEmpty()) {
            for (f<K, V> fVar : this.Z.keySet()) {
                fVar.b(e2);
            }
        }
        c<K, V> cVar = e2.Y0;
        if (cVar != null) {
            cVar.Z = e2.Z;
        } else {
            this.X = e2.Z;
        }
        c<K, V> cVar2 = e2.Z;
        if (cVar2 != null) {
            cVar2.Y0 = cVar;
        } else {
            this.Y = cVar;
        }
        e2.Z = null;
        e2.Y0 = null;
        return e2.Y;
    }

    public int size() {
        return this.Y0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6566gU0.f);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(C6566gU0.h);
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }
}
