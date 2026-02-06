package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class W<K, V> extends AbstractC9862ty0<K, V> implements InterfaceC4626Wm<K, V>, Serializable {
    @InterfaceC11149zF0
    private static final long serialVersionUID = 0;
    public transient Map<K, V> X;
    @InterfaceC7537kU1
    public transient W<V, K> Y;
    @MB
    public transient Set<V> Y0;
    @MB
    public transient Set<K> Z;
    @MB
    public transient Set<Map.Entry<K, V>> Z0;

    /* loaded from: classes3.dex */
    public class a implements Iterator<Map.Entry<K, V>> {
        @MB
        public Map.Entry<K, V> X;
        public final /* synthetic */ Iterator Y;

        public a(Iterator it) {
            this.Y = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.Y.next();
            this.X = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.X;
            if (entry != null) {
                V value = entry.getValue();
                this.Y.remove();
                W.this.g6(value);
                this.X = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC10105uy0<K, V> {
        public final Map.Entry<K, V> X;

        public b(Map.Entry<K, V> entry) {
            this.X = entry;
        }

        @Override // o.AbstractC10105uy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Map.Entry<K, V> L5() {
            return this.X;
        }

        @Override // o.AbstractC10105uy0, java.util.Map.Entry
        public V setValue(V v) {
            W.this.b6(v);
            C10664xF1.h0(W.this.entrySet().contains(this), "entry no longer in map");
            if (C2593Bt1.a(v, getValue())) {
                return v;
            }
            C10664xF1.u(!W.this.containsValue(v), "value already present: %s", v);
            V value = this.X.setValue(v);
            C10664xF1.h0(C2593Bt1.a(v, W.this.get(getKey())), "entry no longer in map");
            W.this.j6(getKey(), true, value, v);
            return value;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2804Dy0<Map.Entry<K, V>> {
        public final Set<Map.Entry<K, V>> X;

        public c() {
            this.X = W.this.X.entrySet();
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<Map.Entry<K, V>> M5() {
            return this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public void clear() {
            W.this.clear();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean contains(@MB Object obj) {
            return C7935m81.p(M5(), obj);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Q5(collection);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<Map.Entry<K, V>> iterator() {
            return W.this.c6();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean remove(@MB Object obj) {
            if (this.X.contains(obj) && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                W.this.Y.X.remove(entry.getValue());
                this.X.remove(entry);
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean removeAll(Collection<?> collection) {
            return T5(collection);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean retainAll(Collection<?> collection) {
            return U5(collection);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return V5();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) W5(tArr);
        }

        public /* synthetic */ c(W w, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static class d<K, V> extends W<K, V> {
        @InterfaceC11149zF0
        private static final long serialVersionUID = 0;

        public d(Map<K, V> map, W<V, K> w) {
            super(map, w, null);
        }

        @InterfaceC11149zF0
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            i6((W) objectInputStream.readObject());
        }

        @InterfaceC11149zF0
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(m5());
        }

        @Override // o.W, o.AbstractC9862ty0, o.AbstractC2510Ay0
        public /* bridge */ /* synthetic */ Object L5() {
            return super.L5();
        }

        @Override // o.W
        @InterfaceC7894ly1
        public K a6(@InterfaceC7894ly1 K k) {
            return this.Y.b6(k);
        }

        @Override // o.W
        @InterfaceC7894ly1
        public V b6(@InterfaceC7894ly1 V v) {
            return this.Y.a6(v);
        }

        @InterfaceC11149zF0
        public Object readResolve() {
            return m5().m5();
        }

        @Override // o.W, o.AbstractC9862ty0, java.util.Map, o.InterfaceC4626Wm
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* loaded from: classes3.dex */
    public class e extends AbstractC2804Dy0<K> {
        public e() {
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<K> M5() {
            return W.this.X.keySet();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public void clear() {
            W.this.clear();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<K> iterator() {
            return C7935m81.S(W.this.entrySet().iterator());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean remove(@MB Object obj) {
            if (contains(obj)) {
                W.this.f6(obj);
                return true;
            }
            return false;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean removeAll(Collection<?> collection) {
            return T5(collection);
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean retainAll(Collection<?> collection) {
            return U5(collection);
        }

        public /* synthetic */ e(W w, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AbstractC2804Dy0<V> {
        public final Set<V> X;

        public f() {
            this.X = W.this.Y.keySet();
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<V> M5() {
            return this.X;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<V> iterator() {
            return C7935m81.O0(W.this.entrySet().iterator());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return V5();
        }

        @Override // o.AbstractC2510Ay0
        public String toString() {
            return X5();
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) W5(tArr);
        }

        public /* synthetic */ f(W w, a aVar) {
            this();
        }
    }

    public /* synthetic */ W(Map map, W w, a aVar) {
        this(map, w);
    }

    @InterfaceC6181ey
    @MB
    public V J3(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return e6(k, v, true);
    }

    @Override // o.AbstractC9862ty0, o.AbstractC2510Ay0
    /* renamed from: M5 */
    public Map<K, V> L5() {
        return this.X;
    }

    public Iterator<Map.Entry<K, V>> c6() {
        return new a(this.X.entrySet().iterator());
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public void clear() {
        this.X.clear();
        this.Y.X.clear();
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public boolean containsValue(@MB Object obj) {
        return this.Y.containsKey(obj);
    }

    public W<V, K> d6(Map<V, K> map) {
        return new d(map, this);
    }

    @MB
    public final V e6(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, boolean z) {
        a6(k);
        b6(v);
        boolean containsKey = containsKey(k);
        if (containsKey && C2593Bt1.a(v, get(k))) {
            return v;
        }
        if (z) {
            m5().remove(v);
        } else {
            C10664xF1.u(!containsValue(v), "value already present: %s", v);
        }
        V put = this.X.put(k, v);
        j6(k, containsKey, put, v);
        return put;
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.Z0;
        if (set == null) {
            c cVar = new c(this, null);
            this.Z0 = cVar;
            return cVar;
        }
        return set;
    }

    @InterfaceC6181ey
    @InterfaceC7894ly1
    public final V f6(@MB Object obj) {
        V v = (V) C2491As1.a(this.X.remove(obj));
        g6(v);
        return v;
    }

    public final void g6(@InterfaceC7894ly1 V v) {
        this.Y.X.remove(v);
    }

    public void h6(Map<K, V> map, Map<V, K> map2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.X == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (this.Y == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        C10664xF1.d(map.isEmpty());
        C10664xF1.d(map2.isEmpty());
        if (map != map2) {
            z3 = true;
        }
        C10664xF1.d(z3);
        this.X = map;
        this.Y = d6(map2);
    }

    public void i6(W<V, K> w) {
        this.Y = w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j6(@InterfaceC7894ly1 K k, boolean z, @MB V v, @InterfaceC7894ly1 V v2) {
        if (z) {
            g6(C2491As1.a(v));
        }
        this.Y.X.put(v2, k);
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.Z;
        if (set == null) {
            e eVar = new e(this, null);
            this.Z = eVar;
            return eVar;
        }
        return set;
    }

    public InterfaceC4626Wm<V, K> m5() {
        return this.Y;
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return e6(k, v, false);
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.AbstractC9862ty0, java.util.Map
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj) {
        if (containsKey(obj)) {
            return f6(obj);
        }
        return null;
    }

    public W(Map<K, V> map, Map<V, K> map2) {
        h6(map, map2);
    }

    @Override // o.AbstractC9862ty0, java.util.Map, o.InterfaceC4626Wm
    public Set<V> values() {
        Set<V> set = this.Y0;
        if (set == null) {
            f fVar = new f(this, null);
            this.Y0 = fVar;
            return fVar;
        }
        return set;
    }

    public W(Map<K, V> map, W<V, K> w) {
        this.X = map;
        this.Y = w;
    }

    @InterfaceC6181ey
    @InterfaceC7894ly1
    public K a6(@InterfaceC7894ly1 K k) {
        return k;
    }

    @InterfaceC6181ey
    @InterfaceC7894ly1
    public V b6(@InterfaceC7894ly1 V v) {
        return v;
    }
}
