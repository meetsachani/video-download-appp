package o;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class Fz2<T> implements Spliterator<T> {
    public final InterfaceC9222rK0<T> X;

    public Fz2(InterfaceC9222rK0<T> interfaceC9222rK0) {
        Objects.requireNonNull(interfaceC9222rK0, "delegate");
        this.X = interfaceC9222rK0;
    }

    @Override // java.util.Spliterator
    public int characteristics() {
        return this.X.characteristics();
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        return this.X.estimateSize();
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(Consumer<? super T> consumer) {
        final InterfaceC9222rK0<T> interfaceC9222rK0 = this.X;
        Objects.requireNonNull(interfaceC9222rK0);
        EJ0 ej0 = new EJ0() { // from class: o.Ez2
            @Override // o.EJ0
            public final void accept(Object obj) {
                InterfaceC9222rK0.this.a((EJ0) obj);
            }
        };
        Objects.requireNonNull(consumer);
        C8643oy2.b(ej0, new Cz2(consumer));
    }

    @Override // java.util.Spliterator
    public Comparator<? super T> getComparator() {
        return this.X.getComparator().b();
    }

    @Override // java.util.Spliterator
    public long getExactSizeIfKnown() {
        return this.X.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public boolean hasCharacteristics(int i) {
        return this.X.hasCharacteristics(i);
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<? super T> consumer) {
        final InterfaceC9222rK0<T> interfaceC9222rK0 = this.X;
        Objects.requireNonNull(interfaceC9222rK0);
        RJ0 rj0 = new RJ0() { // from class: o.Bz2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return Boolean.valueOf(InterfaceC9222rK0.this.b((EJ0) obj));
            }
        };
        Objects.requireNonNull(consumer);
        return ((Boolean) C8643oy2.f(rj0, new Cz2(consumer))).booleanValue();
    }

    @Override // java.util.Spliterator
    public Spliterator<T> trySplit() {
        final InterfaceC9222rK0<T> interfaceC9222rK0 = this.X;
        Objects.requireNonNull(interfaceC9222rK0);
        return ((InterfaceC9222rK0) C8643oy2.j(new XK0() { // from class: o.Dz2
            @Override // o.XK0
            public final Object get() {
                return InterfaceC9222rK0.this.trySplit();
            }
        })).e();
    }
}
