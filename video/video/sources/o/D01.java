package o;

import java.util.Set;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class D01<E> extends G1<E> {
    public D01(int i) {
        super(i);
    }

    public static <E> D01<E> l() {
        return p(3);
    }

    public static <E> D01<E> p(int i) {
        return new D01<>(i);
    }

    public static <E> D01<E> r(Iterable<? extends E> iterable) {
        D01<E> p = p(C2565Bm1.l(iterable));
        C5098aU0.a(p, iterable);
        return p;
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ boolean contains(@MB Object obj) {
        return super.contains(obj);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // o.AbstractC7180j2, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.G1
    public C5920dt1<E> k(int i) {
        return new C6163et1(i);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public /* bridge */ /* synthetic */ Set n() {
        return super.n();
    }
}
