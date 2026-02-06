package o;

import java.util.Objects;
import java.util.Spliterator;

/* renamed from: o.sK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9465sK0<T> implements InterfaceC9222rK0<T> {
    public final Spliterator<T> a;

    public C9465sK0(Spliterator<T> spliterator) {
        Objects.requireNonNull(spliterator, "delegate");
        this.a = spliterator;
    }

    public static <E> C9465sK0<E> f(Spliterator<E> spliterator) {
        return new C9465sK0<>(spliterator);
    }

    @Override // o.InterfaceC9222rK0
    public Spliterator<T> e() {
        return this.a;
    }
}
