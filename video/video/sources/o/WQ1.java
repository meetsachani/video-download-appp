package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class WQ1<R, C, V> extends BO0<R, C, V> {

    /* loaded from: classes3.dex */
    public final class b extends AbstractC9242rP0<InterfaceC3744Nk2.a<R, C, V>> {
        public b() {
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof InterfaceC3744Nk2.a) {
                InterfaceC3744Nk2.a aVar = (InterfaceC3744Nk2.a) obj;
                Object r0 = WQ1.this.r0(aVar.a(), aVar.b());
                if (r0 != null && r0.equals(aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC9242rP0
        /* renamed from: d0 */
        public InterfaceC3744Nk2.a<R, C, V> get(int i) {
            return WQ1.this.C(i);
        }

        @Override // o.TN0
        public boolean j() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return WQ1.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends AbstractC5317bO0<V> {
        public c() {
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) WQ1.this.D(i);
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return WQ1.this.size();
        }
    }

    public static <R, C, V> WQ1<R, C, V> A(Iterable<InterfaceC3744Nk2.a<R, C, V>> iterable, @MB Comparator<? super R> comparator, @MB Comparator<? super C> comparator2) {
        AbstractC9481sO0 G;
        AbstractC9481sO0 G2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        AbstractC5317bO0 D = AbstractC5317bO0.D(iterable);
        for (InterfaceC3744Nk2.a<R, C, V> aVar : iterable) {
            linkedHashSet.add(aVar.a());
            linkedHashSet2.add(aVar.b());
        }
        if (comparator == null) {
            G = AbstractC9481sO0.G(linkedHashSet);
        } else {
            G = AbstractC9481sO0.G(AbstractC5317bO0.l0(comparator, linkedHashSet));
        }
        if (comparator2 == null) {
            G2 = AbstractC9481sO0.G(linkedHashSet2);
        } else {
            G2 = AbstractC9481sO0.G(AbstractC5317bO0.l0(comparator2, linkedHashSet2));
        }
        return B(D, G, G2);
    }

    public static <R, C, V> WQ1<R, C, V> B(AbstractC5317bO0<InterfaceC3744Nk2.a<R, C, V>> abstractC5317bO0, AbstractC9481sO0<R> abstractC9481sO0, AbstractC9481sO0<C> abstractC9481sO02) {
        if (abstractC5317bO0.size() > (abstractC9481sO0.size() * abstractC9481sO02.size()) / 2) {
            return new C7424k20(abstractC5317bO0, abstractC9481sO0, abstractC9481sO02);
        }
        return new C2714Da2(abstractC5317bO0, abstractC9481sO0, abstractC9481sO02);
    }

    public static /* synthetic */ int w(Comparator comparator, Comparator comparator2, InterfaceC3744Nk2.a aVar, InterfaceC3744Nk2.a aVar2) {
        int compare;
        if (comparator == null) {
            compare = 0;
        } else {
            compare = comparator.compare(aVar.a(), aVar2.a());
        }
        if (compare != 0) {
            return compare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.b(), aVar2.b());
    }

    public static <R, C, V> WQ1<R, C, V> y(Iterable<InterfaceC3744Nk2.a<R, C, V>> iterable) {
        return A(iterable, null, null);
    }

    public static <R, C, V> WQ1<R, C, V> z(List<InterfaceC3744Nk2.a<R, C, V>> list, @MB final Comparator<? super R> comparator, @MB final Comparator<? super C> comparator2) {
        C10664xF1.E(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: o.VQ1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return WQ1.w(comparator, comparator2, (InterfaceC3744Nk2.a) obj, (InterfaceC3744Nk2.a) obj2);
                }
            });
        }
        return A(list, comparator, comparator2);
    }

    public abstract InterfaceC3744Nk2.a<R, C, V> C(int i);

    public abstract V D(int i);

    @Override // o.BO0, o.AbstractC10614x3
    /* renamed from: n */
    public final AbstractC9481sO0<InterfaceC3744Nk2.a<R, C, V>> b() {
        if (isEmpty()) {
            return AbstractC9481sO0.M();
        }
        return new b();
    }

    @Override // o.BO0, o.AbstractC10614x3
    /* renamed from: p */
    public final TN0<V> c() {
        if (isEmpty()) {
            return AbstractC5317bO0.L();
        }
        return new c();
    }

    public final void x(R r, C c2, @MB V v, V v2) {
        boolean z;
        if (v == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.A(z, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r, c2, v2, v);
    }
}
