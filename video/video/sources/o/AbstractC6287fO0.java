package o;

import java.io.Serializable;
import java.util.Map;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.fO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6287fO0<K, V> extends AbstractC9481sO0<Map.Entry<K, V>> {

    @InterfaceC11149zF0
    /* renamed from: o.fO0$a */
    /* loaded from: classes3.dex */
    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6044eO0<K, V> X;

        public a(AbstractC6044eO0<K, V> abstractC6044eO0) {
            this.X = abstractC6044eO0;
        }

        public Object readResolve() {
            return this.X.entrySet();
        }
    }

    /* renamed from: o.fO0$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends AbstractC6287fO0<K, V> {
        public final transient AbstractC6044eO0<K, V> a1;
        public final transient AbstractC5317bO0<Map.Entry<K, V>> b1;

        public b(AbstractC6044eO0<K, V> abstractC6044eO0, Map.Entry<K, V>[] entryArr) {
            this(abstractC6044eO0, AbstractC5317bO0.l(entryArr));
        }

        @Override // o.AbstractC9481sO0
        public AbstractC5317bO0<Map.Entry<K, V>> K() {
            return this.b1;
        }

        @Override // o.AbstractC6287fO0
        public AbstractC6044eO0<K, V> d0() {
            return this.a1;
        }

        @Override // o.TN0
        @InterfaceC11149zF0("not used in GWT")
        public int e(Object[] objArr, int i) {
            return this.b1.e(objArr, i);
        }

        @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
            return this.b1.iterator();
        }

        public b(AbstractC6044eO0<K, V> abstractC6044eO0, AbstractC5317bO0<Map.Entry<K, V>> abstractC5317bO0) {
            this.a1 = abstractC6044eO0;
            this.b1 = abstractC5317bO0;
        }
    }

    @Override // o.AbstractC9481sO0
    @InterfaceC11149zF0
    public boolean L() {
        return d0().n();
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = d0().get(entry.getKey());
            if (v != null && v.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public abstract AbstractC6044eO0<K, V> d0();

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public int hashCode() {
        return d0().hashCode();
    }

    @Override // o.TN0
    public boolean j() {
        return d0().o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return d0().size();
    }

    @Override // o.AbstractC9481sO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new a(d0());
    }
}
