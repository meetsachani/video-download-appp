package o;

import java.util.Iterator;

/* renamed from: o.i1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6935i1<E> extends C3<E, E> {
    public AbstractC6935i1(Iterator<E> it) {
        super(it);
    }

    @Override // java.util.Iterator
    public E next() {
        return b().next();
    }
}
