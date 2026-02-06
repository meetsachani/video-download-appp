package o;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class Az2<E> implements Iterator<E> {
    public final InterfaceC5301bK0<E> X;

    public Az2(InterfaceC5301bK0<E> interfaceC5301bK0) {
        Objects.requireNonNull(interfaceC5301bK0, "delegate");
        this.X = interfaceC5301bK0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        final InterfaceC5301bK0<E> interfaceC5301bK0 = this.X;
        Objects.requireNonNull(interfaceC5301bK0);
        return C8643oy2.l(new InterfaceC9947uJ0() { // from class: o.zz2
            @Override // o.InterfaceC9947uJ0
            public final boolean getAsBoolean() {
                return InterfaceC5301bK0.this.hasNext();
            }
        });
    }

    @Override // java.util.Iterator
    public E next() {
        final InterfaceC5301bK0<E> interfaceC5301bK0 = this.X;
        Objects.requireNonNull(interfaceC5301bK0);
        return (E) C8643oy2.j(new XK0() { // from class: o.xz2
            @Override // o.XK0
            public final Object get() {
                return InterfaceC5301bK0.this.next();
            }
        });
    }

    @Override // java.util.Iterator
    public void remove() {
        final InterfaceC5301bK0<E> interfaceC5301bK0 = this.X;
        Objects.requireNonNull(interfaceC5301bK0);
        C8643oy2.q(new InterfaceC8973qK0() { // from class: o.yz2
            @Override // o.InterfaceC8973qK0
            public final void run() {
                InterfaceC5301bK0.this.remove();
            }
        });
    }
}
