package o;

import java.io.Serializable;
import java.util.Map;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.hO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6785hO0<K, V> extends TN0<V> {
    public final AbstractC6044eO0<K, V> Y;

    /* renamed from: o.hO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6237fB2<V> {
        public final AbstractC6237fB2<Map.Entry<K, V>> X;

        public a() {
            this.X = C6785hO0.this.Y.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.X.next().getValue();
        }
    }

    /* renamed from: o.hO0$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC5317bO0<V> {
        public final /* synthetic */ AbstractC5317bO0 Z;

        public b(C6785hO0 c6785hO0, AbstractC5317bO0 abstractC5317bO0) {
            this.Z = abstractC5317bO0;
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) ((Map.Entry) this.Z.get(i)).getValue();
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z.size();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.hO0$c */
    /* loaded from: classes3.dex */
    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6044eO0<?, V> X;

        public c(AbstractC6044eO0<?, V> abstractC6044eO0) {
            this.X = abstractC6044eO0;
        }

        public Object readResolve() {
            return this.X.values();
        }
    }

    public C6785hO0(AbstractC6044eO0<K, V> abstractC6044eO0) {
        this.Y = abstractC6044eO0;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (obj != null && C7052iU0.q(iterator(), obj)) {
            return true;
        }
        return false;
    }

    @Override // o.TN0
    public AbstractC5317bO0<V> d() {
        return new b(this, this.Y.entrySet().d());
    }

    @Override // o.TN0
    public boolean j() {
        return true;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<V> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.Y.size();
    }

    @Override // o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new c(this.Y);
    }
}
