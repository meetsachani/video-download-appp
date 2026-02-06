package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C7935m81;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.ty0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9862ty0<K, V> extends AbstractC2510Ay0 implements Map<K, V> {

    @InterfaceC4238Sm
    /* renamed from: o.ty0$a */
    /* loaded from: classes3.dex */
    public abstract class a extends C7935m81.s<K, V> {
        public a() {
        }

        @Override // o.C7935m81.s
        public Map<K, V> i() {
            return AbstractC9862ty0.this;
        }
    }

    @InterfaceC4238Sm
    /* renamed from: o.ty0$b */
    /* loaded from: classes3.dex */
    public class b extends C7935m81.B<K, V> {
        public b(AbstractC9862ty0 abstractC9862ty0) {
            super(abstractC9862ty0);
        }
    }

    @InterfaceC4238Sm
    /* renamed from: o.ty0$c */
    /* loaded from: classes3.dex */
    public class c extends C7935m81.Q<K, V> {
        public c(AbstractC9862ty0 abstractC9862ty0) {
            super(abstractC9862ty0);
        }
    }

    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract Map<K, V> L5();

    public void N5() {
        C7052iU0.h(entrySet().iterator());
    }

    @InterfaceC4238Sm
    public boolean O5(@MB Object obj) {
        return C7935m81.q(this, obj);
    }

    public boolean P5(@MB Object obj) {
        return C7935m81.r(this, obj);
    }

    public boolean Q5(@MB Object obj) {
        return C7935m81.w(this, obj);
    }

    public int R5() {
        return C10856y22.k(entrySet());
    }

    public boolean S5() {
        return !entrySet().iterator().hasNext();
    }

    public void T5(Map<? extends K, ? extends V> map) {
        C7935m81.j0(this, map);
    }

    @MB
    @InterfaceC4238Sm
    public V U5(@MB Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (C2593Bt1.a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String V5() {
        return C7935m81.w0(this);
    }

    public void clear() {
        L5().clear();
    }

    public boolean containsKey(@MB Object obj) {
        return L5().containsKey(obj);
    }

    public boolean containsValue(@MB Object obj) {
        return L5().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return L5().entrySet();
    }

    public boolean equals(@MB Object obj) {
        if (obj != this && !L5().equals(obj)) {
            return false;
        }
        return true;
    }

    @MB
    public V get(@MB Object obj) {
        return L5().get(obj);
    }

    public int hashCode() {
        return L5().hashCode();
    }

    public boolean isEmpty() {
        return L5().isEmpty();
    }

    public Set<K> keySet() {
        return L5().keySet();
    }

    @InterfaceC6181ey
    @MB
    public V put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return L5().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        L5().putAll(map);
    }

    @InterfaceC6181ey
    @MB
    public V remove(@MB Object obj) {
        return L5().remove(obj);
    }

    public int size() {
        return L5().size();
    }

    public Collection<V> values() {
        return L5().values();
    }
}
