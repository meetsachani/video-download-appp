package o;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: o.wz2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10600wz2<E> implements Iterable<E> {
    public final InterfaceC5058aK0<E> X;

    public C10600wz2(InterfaceC5058aK0<E> interfaceC5058aK0) {
        Objects.requireNonNull(interfaceC5058aK0, "delegate");
        this.X = interfaceC5058aK0;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new Az2(this.X.iterator());
    }
}
