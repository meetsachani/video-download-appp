package o;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Kc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3419Kc2<K, V> extends AbstractC5951e1<K, V> {
    public static final int Z = 255;
    public final h<K, V>[] X;
    public final g[] Y;

    /* renamed from: o.Kc2$b */
    /* loaded from: classes4.dex */
    public class b {
        public final ArrayList<Map.Entry<K, V>> X;
        public int Y;
        public Map.Entry<K, V> Z;

        public b() {
            this.X = new ArrayList<>();
        }

        public Map.Entry<K, V> b() {
            if (hasNext()) {
                ArrayList<Map.Entry<K, V>> arrayList = this.X;
                Map.Entry<K, V> remove = arrayList.remove(arrayList.size() - 1);
                this.Z = remove;
                return remove;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.X.size() > 0) {
                return true;
            }
            while (this.Y < C3419Kc2.this.X.length) {
                synchronized (C3419Kc2.this.Y[this.Y]) {
                    try {
                        for (h<K, V> hVar = C3419Kc2.this.X[this.Y]; hVar != null; hVar = hVar.Z) {
                            this.X.add(hVar);
                        }
                        this.Y++;
                        if (this.X.size() > 0) {
                            return true;
                        }
                    } finally {
                    }
                }
            }
            return false;
        }

        public void remove() {
            Map.Entry<K, V> entry = this.Z;
            if (entry != null) {
                C3419Kc2.this.remove(entry.getKey());
                this.Z = null;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.Kc2$c */
    /* loaded from: classes4.dex */
    public class c extends C3419Kc2<K, V>.b implements Iterator<Map.Entry<K, V>> {
        public c() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            return b();
        }
    }

    /* renamed from: o.Kc2$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3419Kc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int g = C3419Kc2.this.g(entry.getKey());
            synchronized (C3419Kc2.this.Y[g]) {
                try {
                    for (h<K, V> hVar = C3419Kc2.this.X[g]; hVar != null; hVar = hVar.Z) {
                        if (hVar.equals(entry)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int g = C3419Kc2.this.g(entry.getKey());
            synchronized (C3419Kc2.this.Y[g]) {
                try {
                    for (h<K, V> hVar = C3419Kc2.this.X[g]; hVar != null; hVar = hVar.Z) {
                        if (hVar.equals(entry)) {
                            C3419Kc2.this.remove(hVar.getKey());
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3419Kc2.this.size();
        }
    }

    /* renamed from: o.Kc2$e */
    /* loaded from: classes4.dex */
    public class e extends C3419Kc2<K, V>.b implements Iterator<K> {
        public e() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return b().getKey();
        }
    }

    /* renamed from: o.Kc2$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3419Kc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3419Kc2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int g = C3419Kc2.this.g(obj);
            synchronized (C3419Kc2.this.Y[g]) {
                try {
                    for (h<K, V> hVar = C3419Kc2.this.X[g]; hVar != null; hVar = hVar.Z) {
                        K key = hVar.getKey();
                        if (key != obj && (key == null || !key.equals(obj))) {
                        }
                        C3419Kc2.this.remove(key);
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3419Kc2.this.size();
        }
    }

    /* renamed from: o.Kc2$g */
    /* loaded from: classes4.dex */
    public static final class g {
        public int a;

        public g() {
        }
    }

    /* renamed from: o.Kc2$h */
    /* loaded from: classes4.dex */
    public static final class h<K, V> implements Map.Entry<K, V>, JX0<K, V> {
        public K X;
        public V Y;
        public h<K, V> Z;

        public h() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.X;
            if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                V v = this.Y;
                if (v != null ? v.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.JX0
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry, o.JX0
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.X;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.Y;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.Y;
            this.Y = v;
            return v2;
        }
    }

    /* renamed from: o.Kc2$i */
    /* loaded from: classes4.dex */
    public class i extends C3419Kc2<K, V>.b implements Iterator<V> {
        public i() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return b().getValue();
        }
    }

    /* renamed from: o.Kc2$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractCollection<V> {
        public j() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3419Kc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3419Kc2.this.size();
        }
    }

    public C3419Kc2() {
        this(255);
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        for (int i2 = 0; i2 < this.X.length; i2++) {
            g gVar = this.Y[i2];
            synchronized (gVar) {
                this.X[i2] = null;
                gVar.a = 0;
            }
        }
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        int g2 = g(obj);
        synchronized (this.Y[g2]) {
            try {
                for (h<K, V> hVar = this.X[g2]; hVar != null; hVar = hVar.Z) {
                    K k = hVar.X;
                    if (k != obj && (k == null || !k.equals(obj))) {
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        for (int i2 = 0; i2 < this.X.length; i2++) {
            synchronized (this.Y[i2]) {
                try {
                    for (h<K, V> hVar = this.X[i2]; hVar != null; hVar = hVar.Z) {
                        V v = hVar.Y;
                        if (v != obj && (v == null || !v.equals(obj))) {
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        return false;
    }

    public void e(Runnable runnable) {
        runnable.getClass();
        f(runnable, 0);
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return new d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final void f(Runnable runnable, int i2) {
        if (i2 >= this.X.length) {
            runnable.run();
            return;
        }
        synchronized (this.Y[i2]) {
            f(runnable, i2 + 1);
        }
    }

    public final int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        int hashCode = obj.hashCode();
        int i2 = hashCode + (~(hashCode << 15));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (~(i5 << 11));
        int length = (i6 ^ (i6 >>> 16)) % this.X.length;
        if (length < 0) {
            return length * (-1);
        }
        return length;
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        int g2 = g(obj);
        synchronized (this.Y[g2]) {
            try {
                for (h<K, V> hVar = this.X[g2]; hVar != null; hVar = hVar.Z) {
                    K k = hVar.X;
                    if (k != obj && (k == null || !k.equals(obj))) {
                    }
                    return hVar.Y;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.X.length; i3++) {
            synchronized (this.Y[i3]) {
                try {
                    for (h<K, V> hVar = this.X[i3]; hVar != null; hVar = hVar.Z) {
                        i2 += hVar.hashCode();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i2;
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        return new f();
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        int g2 = g(k);
        synchronized (this.Y[g2]) {
            try {
                h<K, V> hVar = this.X[g2];
                if (hVar == null) {
                    h<K, V> hVar2 = new h<>();
                    hVar2.X = k;
                    hVar2.Y = v;
                    this.X[g2] = hVar2;
                    this.Y[g2].a++;
                    return null;
                }
                h<K, V> hVar3 = hVar;
                while (hVar != null) {
                    K k2 = hVar.X;
                    if (k2 != k && (k2 == null || !k2.equals(k))) {
                        hVar3 = hVar;
                        hVar = hVar.Z;
                    }
                    V v2 = hVar.Y;
                    hVar.Y = v;
                    return v2;
                }
                h<K, V> hVar4 = new h<>();
                hVar4.X = k;
                hVar4.Y = v;
                hVar3.Z = hVar4;
                this.Y[g2].a++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        int g2 = g(obj);
        synchronized (this.Y[g2]) {
            try {
                h<K, V> hVar = null;
                for (h<K, V> hVar2 = this.X[g2]; hVar2 != null; hVar2 = hVar2.Z) {
                    K k = hVar2.X;
                    if (k != obj && (k == null || !k.equals(obj))) {
                        hVar = hVar2;
                    }
                    if (hVar == null) {
                        this.X[g2] = hVar2.Z;
                    } else {
                        hVar.Z = hVar2.Z;
                    }
                    g gVar = this.Y[g2];
                    gVar.a--;
                    return hVar2.Y;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.X.length; i3++) {
            synchronized (this.Y[i3]) {
                i2 += this.Y[i3].a;
            }
        }
        return i2;
    }

    @Override // java.util.Map, o.UC0
    public Collection<V> values() {
        return new j();
    }

    public C3419Kc2(int i2) {
        int max = Math.max(17, i2);
        max = max % 2 == 0 ? max - 1 : max;
        this.X = new h[max];
        this.Y = new g[max];
        for (int i3 = 0; i3 < max; i3++) {
            this.Y[i3] = new g();
        }
    }
}
