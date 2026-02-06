package o;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: o.Ud0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4397Ud0<E> implements Iterator<E> {
    public final Collection<? super E> X;
    public Enumeration<? extends E> Y;
    public E Z;

    public C4397Ud0() {
        this(null, null);
    }

    public Enumeration<? extends E> b() {
        return this.Y;
    }

    public void c(Enumeration<? extends E> enumeration) {
        this.Y = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.Y.hasMoreElements();
    }

    @Override // java.util.Iterator
    public E next() {
        E nextElement = this.Y.nextElement();
        this.Z = nextElement;
        return nextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        Collection<? super E> collection = this.X;
        if (collection != null) {
            E e = this.Z;
            if (e != null) {
                collection.remove(e);
                return;
            }
            throw new IllegalStateException("next() must have been called for remove() to function");
        }
        throw new UnsupportedOperationException("No Collection associated with this Iterator");
    }

    public C4397Ud0(Enumeration<? extends E> enumeration) {
        this(enumeration, null);
    }

    public C4397Ud0(Enumeration<? extends E> enumeration, Collection<? super E> collection) {
        this.Y = enumeration;
        this.X = collection;
        this.Z = null;
    }
}
