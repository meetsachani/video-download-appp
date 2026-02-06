package o;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.x3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10614x3<R, C, V> implements InterfaceC3744Nk2<R, C, V> {
    @MB
    @SY0
    public transient Set<InterfaceC3744Nk2.a<R, C, V>> X;
    @MB
    @SY0
    public transient Collection<V> Y;

    /* renamed from: o.x3$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC8375ns2<InterfaceC3744Nk2.a<R, C, V>, V> {
        public a(AbstractC10614x3 abstractC10614x3, Iterator it) {
            super(it);
        }

        @Override // o.AbstractC8375ns2
        @InterfaceC7894ly1
        /* renamed from: c */
        public V b(InterfaceC3744Nk2.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    /* renamed from: o.x3$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractSet<InterfaceC3744Nk2.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC10614x3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof InterfaceC3744Nk2.a) {
                InterfaceC3744Nk2.a aVar = (InterfaceC3744Nk2.a) obj;
                Map map = (Map) C7935m81.p0(AbstractC10614x3.this.H(), aVar.a());
                if (map != null && C7232jF.j(map.entrySet(), C7935m81.O(aVar.b(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC3744Nk2.a<R, C, V>> iterator() {
            return AbstractC10614x3.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            if (obj instanceof InterfaceC3744Nk2.a) {
                InterfaceC3744Nk2.a aVar = (InterfaceC3744Nk2.a) obj;
                Map map = (Map) C7935m81.p0(AbstractC10614x3.this.H(), aVar.a());
                if (map != null && C7232jF.k(map.entrySet(), C7935m81.O(aVar.b(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC10614x3.this.size();
        }
    }

    /* renamed from: o.x3$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC10614x3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            return AbstractC10614x3.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC10614x3.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC10614x3.this.size();
        }
    }

    @Override // o.InterfaceC3744Nk2
    public void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        for (InterfaceC3744Nk2.a<? extends R, ? extends C, ? extends V> aVar : interfaceC3744Nk2.o3()) {
            q3(aVar.a(), aVar.b(), aVar.getValue());
        }
    }

    @Override // o.InterfaceC3744Nk2
    public Set<R> F() {
        return H().keySet();
    }

    @Override // o.InterfaceC3744Nk2
    public Set<C> L4() {
        return i2().keySet();
    }

    @Override // o.InterfaceC3744Nk2
    public boolean M4(@MB Object obj) {
        return C7935m81.o0(H(), obj);
    }

    public abstract Iterator<InterfaceC3744Nk2.a<R, C, V>> a();

    public Set<InterfaceC3744Nk2.a<R, C, V>> b() {
        return new b();
    }

    public Collection<V> c() {
        return new c();
    }

    @Override // o.InterfaceC3744Nk2
    public void clear() {
        C7052iU0.h(o3().iterator());
    }

    @Override // o.InterfaceC3744Nk2
    public boolean containsValue(@MB Object obj) {
        for (Map<C, V> map : H().values()) {
            if (map.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<V> d() {
        return new a(this, o3().iterator());
    }

    @Override // o.InterfaceC3744Nk2
    public boolean equals(@MB Object obj) {
        return C3939Pk2.b(this, obj);
    }

    @Override // o.InterfaceC3744Nk2
    public int hashCode() {
        return o3().hashCode();
    }

    @Override // o.InterfaceC3744Nk2
    public boolean i5(@MB Object obj, @MB Object obj2) {
        Map map = (Map) C7935m81.p0(H(), obj);
        if (map != null && C7935m81.o0(map, obj2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC3744Nk2
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC3744Nk2
    public Set<InterfaceC3744Nk2.a<R, C, V>> o3() {
        Set<InterfaceC3744Nk2.a<R, C, V>> set = this.X;
        if (set == null) {
            Set<InterfaceC3744Nk2.a<R, C, V>> b2 = b();
            this.X = b2;
            return b2;
        }
        return set;
    }

    @Override // o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V q3(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c2, @InterfaceC7894ly1 V v) {
        return x5(r).put(c2, v);
    }

    @Override // o.InterfaceC3744Nk2
    @MB
    public V r0(@MB Object obj, @MB Object obj2) {
        Map map = (Map) C7935m81.p0(H(), obj);
        if (map == null) {
            return null;
        }
        return (V) C7935m81.p0(map, obj2);
    }

    @Override // o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj, @MB Object obj2) {
        Map map = (Map) C7935m81.p0(H(), obj);
        if (map == null) {
            return null;
        }
        return (V) C7935m81.q0(map, obj2);
    }

    public String toString() {
        return H().toString();
    }

    @Override // o.InterfaceC3744Nk2
    public Collection<V> values() {
        Collection<V> collection = this.Y;
        if (collection == null) {
            Collection<V> c2 = c();
            this.Y = c2;
            return c2;
        }
        return collection;
    }

    @Override // o.InterfaceC3744Nk2
    public boolean y0(@MB Object obj) {
        return C7935m81.o0(i2(), obj);
    }
}
