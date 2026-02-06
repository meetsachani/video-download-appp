package o;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class YE<E> implements Iterator<E> {
    public Comparator<? super E> X;
    public List<Iterator<? extends E>> Y;
    public BitSet Y0;
    public List<E> Z;
    public int Z0;

    public YE() {
        this((Comparator) null, 2);
    }

    public void b(Iterator<? extends E> it) {
        e();
        if (it != null) {
            this.Y.add(it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final boolean c(List<Iterator<? extends E>> list) {
        for (Iterator<? extends E> it : list) {
            if (it.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(BitSet bitSet) {
        for (int i = 0; i < bitSet.size(); i++) {
            if (bitSet.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final void e() throws IllegalStateException {
        if (this.Z == null) {
            return;
        }
        throw new IllegalStateException("Can't do that after next or hasNext has been called.");
    }

    public final void f(int i) {
        this.Z.set(i, null);
        this.Y0.clear(i);
    }

    public Comparator<? super E> g() {
        return this.X;
    }

    public int h() {
        int i = this.Z0;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException("No value has been returned yet");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        n();
        if (!d(this.Y0) && !c(this.Y)) {
            return false;
        }
        return true;
    }

    public List<Iterator<? extends E>> i() {
        return C6735hB2.h(this.Y);
    }

    public final int j() {
        Object obj = null;
        int i = -1;
        for (int i2 = 0; i2 < this.Z.size(); i2++) {
            if (!this.Y0.get(i2)) {
                k(i2);
            }
            if (this.Y0.get(i2)) {
                if (i == -1) {
                    obj = this.Z.get(i2);
                    i = i2;
                } else {
                    E e = this.Z.get(i2);
                    Comparator<? super E> comparator = this.X;
                    if (comparator != null) {
                        if (comparator.compare(e, obj) < 0) {
                            i = i2;
                            obj = e;
                        }
                    } else {
                        throw new NullPointerException("You must invoke setComparator() to set a comparator first.");
                    }
                }
            }
        }
        return i;
    }

    public final boolean k(int i) {
        Iterator<? extends E> it = this.Y.get(i);
        if (it.hasNext()) {
            this.Z.set(i, it.next());
            this.Y0.set(i);
            return true;
        }
        this.Z.set(i, null);
        this.Y0.clear(i);
        return false;
    }

    public void l(Comparator<? super E> comparator) {
        e();
        this.X = comparator;
    }

    public void m(int i, Iterator<? extends E> it) {
        e();
        if (it != null) {
            this.Y.set(i, it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final void n() {
        if (this.Z == null) {
            this.Z = new ArrayList(this.Y.size());
            this.Y0 = new BitSet(this.Y.size());
            for (int i = 0; i < this.Y.size(); i++) {
                this.Z.add(null);
                this.Y0.clear(i);
            }
        }
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (hasNext()) {
            int j = j();
            if (j != -1) {
                E e = this.Z.get(j);
                f(j);
                this.Z0 = j;
                return e;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.Z0;
        if (i != -1) {
            this.Y.get(i).remove();
            return;
        }
        throw new IllegalStateException("No value can be removed at present");
    }

    public YE(Comparator<? super E> comparator) {
        this(comparator, 2);
    }

    public YE(Comparator<? super E> comparator, int i) {
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.Y0 = null;
        this.Z0 = -1;
        this.Y = new ArrayList(i);
        l(comparator);
    }

    public YE(Comparator<? super E> comparator, Iterator<? extends E> it, Iterator<? extends E> it2) {
        this(comparator, 2);
        b(it);
        b(it2);
    }

    public YE(Comparator<? super E> comparator, Iterator<? extends E>[] itArr) {
        this(comparator, itArr.length);
        for (Iterator<? extends E> it : itArr) {
            b(it);
        }
    }

    public YE(Comparator<? super E> comparator, Collection<Iterator<? extends E>> collection) {
        this(comparator, collection.size());
        for (Iterator<? extends E> it : collection) {
            b(it);
        }
    }
}
