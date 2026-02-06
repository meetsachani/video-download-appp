package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.bt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5435bt0<K, V> extends AbstractC6939i2<K, V> implements InterfaceC5919dt0<K, V> {
    public final InterfaceC10058um1<K, V> a1;
    public final IF1<? super K> b1;

    /* renamed from: o.bt0$a */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends AbstractC7407jy0<V> {
        @InterfaceC7894ly1
        public final K X;

        public a(@InterfaceC7894ly1 K k) {
            this.X = k;
        }

        @Override // o.AbstractC7407jy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public List<V> M5() {
            return Collections.EMPTY_LIST;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 V v) {
            add(0, v);
            return true;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // o.AbstractC7407jy0, java.util.List
        public void add(int i, @InterfaceC7894ly1 V v) {
            C10664xF1.d0(i, 0);
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.AbstractC7407jy0, java.util.List
        @InterfaceC6181ey
        public boolean addAll(int i, Collection<? extends V> collection) {
            C10664xF1.E(collection);
            C10664xF1.d0(i, 0);
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: o.bt0$b */
    /* loaded from: classes3.dex */
    public static class b<K, V> extends AbstractC2804Dy0<V> {
        @InterfaceC7894ly1
        public final K X;

        public b(@InterfaceC7894ly1 K k) {
            this.X = k;
        }

        @Override // o.AbstractC2804Dy0, o.AbstractC4473Ux0
        /* renamed from: Y5 */
        public Set<V> M5() {
            return Collections.EMPTY_SET;
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean add(@InterfaceC7894ly1 V v) {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            C10664xF1.E(collection);
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: o.bt0$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC4473Ux0<Map.Entry<K, V>> {
        public c() {
        }

        @Override // o.AbstractC4473Ux0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Collection<Map.Entry<K, V>> L5() {
            return C7232jF.d(C5435bt0.this.a1.r(), C5435bt0.this.Q3());
        }

        @Override // o.AbstractC4473Ux0, java.util.Collection, o.InterfaceC2467Am1
        public boolean remove(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C5435bt0.this.a1.containsKey(entry.getKey()) && C5435bt0.this.b1.apply((Object) entry.getKey())) {
                    return C5435bt0.this.a1.remove(entry.getKey(), entry.getValue());
                }
                return false;
            }
            return false;
        }
    }

    public C5435bt0(InterfaceC10058um1<K, V> interfaceC10058um1, IF1<? super K> if1) {
        this.a1 = (InterfaceC10058um1) C10664xF1.E(interfaceC10058um1);
        this.b1 = (IF1) C10664xF1.E(if1);
    }

    public InterfaceC10058um1<K, V> G() {
        return this.a1;
    }

    @Override // o.InterfaceC5919dt0
    public IF1<? super Map.Entry<K, V>> Q3() {
        return C7935m81.U(this.b1);
    }

    @Override // o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        return C7935m81.F(this.a1.l(), this.b1);
    }

    @Override // o.AbstractC6939i2
    public Collection<Map.Entry<K, V>> b() {
        return new c();
    }

    @Override // o.AbstractC6939i2
    public Set<K> c() {
        return C10856y22.i(this.a1.keySet(), this.b1);
    }

    @Override // o.InterfaceC10058um1
    public void clear() {
        keySet().clear();
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        if (this.a1.containsKey(obj)) {
            return this.b1.apply(obj);
        }
        return false;
    }

    @Override // o.AbstractC6939i2
    public InterfaceC2467Am1<K> d() {
        return C2565Bm1.j(this.a1.Q(), this.b1);
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
        if (this.b1.apply(k)) {
            return this.a1.get(k);
        }
        if (this.a1 instanceof InterfaceC8660p22) {
            return new b(k);
        }
        return new a(k);
    }

    public Collection<V> h() {
        if (this.a1 instanceof InterfaceC8660p22) {
            return Collections.EMPTY_SET;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> i(@MB Object obj) {
        if (containsKey(obj)) {
            return this.a1.i(obj);
        }
        return h();
    }

    @Override // o.InterfaceC10058um1
    public int size() {
        int i = 0;
        for (Collection<V> collection : l().values()) {
            i += collection.size();
        }
        return i;
    }
}
