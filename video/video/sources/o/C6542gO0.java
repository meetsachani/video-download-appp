package o;

import java.io.Serializable;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.gO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6542gO0<K, V> extends AbstractC9242rP0<K> {
    public final AbstractC6044eO0<K, V> a1;

    @InterfaceC11149zF0
    /* renamed from: o.gO0$a */
    /* loaded from: classes3.dex */
    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;
        public final AbstractC6044eO0<K, ?> X;

        public a(AbstractC6044eO0<K, ?> abstractC6044eO0) {
            this.X = abstractC6044eO0;
        }

        public Object readResolve() {
            return this.X.keySet();
        }
    }

    public C6542gO0(AbstractC6044eO0<K, V> abstractC6044eO0) {
        this.a1 = abstractC6044eO0;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return this.a1.containsKey(obj);
    }

    @Override // o.AbstractC9242rP0
    public K get(int i) {
        return this.a1.entrySet().d().get(i).getKey();
    }

    @Override // o.TN0
    public boolean j() {
        return true;
    }

    @Override // o.AbstractC9242rP0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<K> iterator() {
        return this.a1.r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.a1.size();
    }

    @Override // o.AbstractC9481sO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new a(this.a1);
    }
}
