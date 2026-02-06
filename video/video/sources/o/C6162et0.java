package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.et0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6162et0<K, V> extends AbstractCollection<V> {
    @GJ2
    public final InterfaceC5919dt0<K, V> X;

    public C6162et0(InterfaceC5919dt0<K, V> interfaceC5919dt0) {
        this.X = (InterfaceC5919dt0) C10664xF1.E(interfaceC5919dt0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.X.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@MB Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return C7935m81.O0(this.X.r().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@MB Object obj) {
        IF1<? super Map.Entry<K, V>> Q3 = this.X.Q3();
        Iterator<Map.Entry<K, V>> it = this.X.G().r().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Q3.apply(next) && C2593Bt1.a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return C5098aU0.J(this.X.G().r(), C7985mG1.e(this.X.Q3(), C7935m81.Q0(C7985mG1.n(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return C5098aU0.J(this.X.G().r(), C7985mG1.e(this.X.Q3(), C7935m81.Q0(C7985mG1.q(C7985mG1.n(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.X.size();
    }
}
