package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.mO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8018mO2<E> implements Iterator<E> {
    public final Iterator<Iterator<? extends E>> X;
    public Iterator<? extends E> Y;
    public Iterator<? extends E> Z;

    public C8018mO2(Iterator<? extends E> it, Iterator<? extends E> it2) {
        this(it, it2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y != null) {
            return true;
        }
        while (this.X.hasNext()) {
            Iterator<? extends E> next = this.X.next();
            if (next.hasNext()) {
                this.Y = next;
                return true;
            }
            this.X.remove();
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (hasNext()) {
            E next = this.Y.next();
            this.Z = this.Y;
            this.Y = null;
            return next;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it = this.Z;
        if (it != null) {
            it.remove();
            this.Z = null;
            return;
        }
        throw new IllegalStateException("No value can be removed at present");
    }

    public C8018mO2(Iterator<? extends E> it, Iterator<? extends E> it2, Iterator<? extends E> it3) {
        this(it, it2, it3);
    }

    public C8018mO2(Iterator<? extends E>... itArr) {
        this.Y = null;
        this.Z = null;
        ArrayList arrayList = new ArrayList();
        for (Iterator<? extends E> it : itArr) {
            if (it != null) {
                arrayList.add(it);
            } else {
                throw new NullPointerException("Iterator must not be null.");
            }
        }
        this.X = (Iterator<E>) C10586ww0.G(arrayList).F().iterator();
    }
}
