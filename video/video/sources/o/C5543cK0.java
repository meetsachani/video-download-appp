package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: o.cK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5543cK0<E> implements InterfaceC5301bK0<E> {
    public final Iterator<E> a;

    public C5543cK0(Iterator<E> it) {
        Objects.requireNonNull(it, "delegate");
        this.a = it;
    }

    public static <E> C5543cK0<E> d(Iterator<E> it) {
        return new C5543cK0<>(it);
    }

    @Override // o.InterfaceC5301bK0
    public Iterator<E> e() {
        return this.a;
    }

    @Override // o.InterfaceC5301bK0
    public boolean hasNext() throws IOException {
        return this.a.hasNext();
    }

    @Override // o.InterfaceC5301bK0
    public E next() throws IOException {
        return this.a.next();
    }
}
