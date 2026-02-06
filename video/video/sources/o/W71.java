package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public class W71<K, V> {
    public final Map<K, V> a;
    @MB
    public volatile transient Map.Entry<K, V> b;

    /* loaded from: classes3.dex */
    public class a extends AbstractSet<K> {

        /* renamed from: o.W71$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0239a extends AbstractC6237fB2<K> {
            public final /* synthetic */ Iterator X;

            public C0239a(Iterator it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.X.next();
                W71.this.b = entry;
                return (K) entry.getKey();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return W71.this.e(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d */
        public AbstractC6237fB2<K> iterator() {
            return new C0239a(W71.this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return W71.this.a.size();
        }
    }

    public W71(Map<K, V> map) {
        this.a = (Map) C10664xF1.E(map);
    }

    public final void c() {
        d();
        this.a.clear();
    }

    public void d() {
        this.b = null;
    }

    public final boolean e(@MB Object obj) {
        if (g(obj) == null && !this.a.containsKey(obj)) {
            return false;
        }
        return true;
    }

    @MB
    public V f(Object obj) {
        C10664xF1.E(obj);
        V g = g(obj);
        if (g == null) {
            return h(obj);
        }
        return g;
    }

    @MB
    public V g(@MB Object obj) {
        Map.Entry<K, V> entry = this.b;
        if (entry != null && entry.getKey() == obj) {
            return entry.getValue();
        }
        return null;
    }

    @MB
    public final V h(Object obj) {
        C10664xF1.E(obj);
        return this.a.get(obj);
    }

    @InterfaceC6181ey
    @MB
    public final V i(K k, V v) {
        C10664xF1.E(k);
        C10664xF1.E(v);
        d();
        return this.a.put(k, v);
    }

    @InterfaceC6181ey
    @MB
    public final V j(Object obj) {
        C10664xF1.E(obj);
        d();
        return this.a.remove(obj);
    }

    public final Set<K> k() {
        return new a();
    }
}
