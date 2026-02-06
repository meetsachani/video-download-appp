package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: o.c3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5474c3<K, V> extends AbstractC6441g2<K, V> implements InterfaceC10613x22<K, V> {

    /* renamed from: o.c3$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC6441g2<K, V>.i implements Set<V> {
        public a(K k) {
            super(k);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set = (Set) d();
            if (set == null) {
                return Collections.EMPTY_SET.equals(obj);
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            return C10124v22.i(set, (Set) obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10124v22.f((Set) d());
        }
    }

    public AbstractC5474c3() {
    }

    @Override // o.AbstractC6441g2
    public Map<K, Set<V>> e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractC5474c3<K, V>) obj);
    }

    @Override // o.AbstractC6441g2
    /* renamed from: h */
    public abstract Set<V> b();

    @Override // o.AbstractC6441g2
    /* renamed from: i */
    public Set<V> g(K k) {
        return new a(k);
    }

    public AbstractC5474c3(Map<K, ? extends Set<V>> map) {
        super(map);
    }

    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Set<V> get(K k) {
        return g(k);
    }

    @Override // o.AbstractC6441g2, o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Set<V> remove(Object obj) {
        return C10124v22.c(e().remove(obj));
    }
}
