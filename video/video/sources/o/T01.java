package o;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class T01<E> implements OS1<E> {
    public static final String a1 = "ListIteratorWrapper does not support optional operations of ListIterator.";
    public static final String b1 = "Cannot remove element at index {0}.";
    public final Iterator<? extends E> X;
    public boolean Z0;
    public final List<E> Y = new ArrayList();
    public int Z = 0;
    public int Y0 = 0;

    public T01(Iterator<? extends E> it) {
        if (it != null) {
            this.X = it;
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(E e) throws UnsupportedOperationException {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            ((ListIterator) it).add(e);
            return;
        }
        throw new UnsupportedOperationException("ListIteratorWrapper does not support optional operations of ListIterator.");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.Z != this.Y0 && !(this.X instanceof ListIterator)) {
            return true;
        }
        return this.X.hasNext();
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public boolean hasPrevious() {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            return ((ListIterator) it).hasPrevious();
        }
        if (this.Z > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() throws NoSuchElementException {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            return it.next();
        }
        int i = this.Z;
        if (i < this.Y0) {
            this.Z = i + 1;
            return this.Y.get(i);
        }
        E next = it.next();
        this.Y.add(next);
        this.Z++;
        this.Y0++;
        this.Z0 = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            return ((ListIterator) it).nextIndex();
        }
        return this.Z;
    }

    @Override // java.util.ListIterator, o.InterfaceC8877pw1
    public E previous() throws NoSuchElementException {
        boolean z;
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            return (E) ((ListIterator) it).previous();
        }
        int i = this.Z;
        if (i != 0) {
            if (this.Y0 == i) {
                z = true;
            } else {
                z = false;
            }
            this.Z0 = z;
            List<E> list = this.Y;
            int i2 = i - 1;
            this.Z = i2;
            return list.get(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            return ((ListIterator) it).previousIndex();
        }
        return this.Z - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        int i;
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            it.remove();
            return;
        }
        int i2 = this.Z;
        int i3 = this.Y0;
        if (i2 == i3) {
            i = i2 - 1;
        } else {
            i = i2;
        }
        if (this.Z0 && i3 - i2 <= 1) {
            it.remove();
            this.Y.remove(i);
            this.Z = i;
            this.Y0--;
            this.Z0 = false;
            return;
        }
        throw new IllegalStateException(MessageFormat.format(b1, Integer.valueOf(i)));
    }

    @Override // o.MS1
    public void reset() {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            ListIterator listIterator = (ListIterator) it;
            while (listIterator.previousIndex() >= 0) {
                listIterator.previous();
            }
            return;
        }
        this.Z = 0;
    }

    @Override // java.util.ListIterator
    public void set(E e) throws UnsupportedOperationException {
        Iterator<? extends E> it = this.X;
        if (it instanceof ListIterator) {
            ((ListIterator) it).set(e);
            return;
        }
        throw new UnsupportedOperationException("ListIteratorWrapper does not support optional operations of ListIterator.");
    }
}
