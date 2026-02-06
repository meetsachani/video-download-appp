package o;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class ZE implements Iterator {
    public Comparator X;
    public ArrayList Y;
    public BitSet Y0;
    public ArrayList Z;
    public int Z0;

    public ZE() {
        this((Comparator) null, 2);
    }

    public void b(Iterator it) {
        e();
        if (it != null) {
            this.Y.add(it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final boolean c(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Iterator) arrayList.get(i)).hasNext()) {
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

    public Comparator g() {
        return this.X;
    }

    public List h() {
        return C6978iB2.f(this.Y);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m();
        if (!d(this.Y0) && !c(this.Y)) {
            return false;
        }
        return true;
    }

    public final int i() {
        Object obj = null;
        int i = -1;
        for (int i2 = 0; i2 < this.Z.size(); i2++) {
            if (!this.Y0.get(i2)) {
                j(i2);
            }
            if (this.Y0.get(i2)) {
                if (i == -1) {
                    obj = this.Z.get(i2);
                    i = i2;
                } else {
                    Object obj2 = this.Z.get(i2);
                    if (this.X.compare(obj2, obj) < 0) {
                        i = i2;
                        obj = obj2;
                    }
                }
            }
        }
        return i;
    }

    public final boolean j(int i) {
        Iterator it = (Iterator) this.Y.get(i);
        if (it.hasNext()) {
            this.Z.set(i, it.next());
            this.Y0.set(i);
            return true;
        }
        this.Z.set(i, null);
        this.Y0.clear(i);
        return false;
    }

    public void k(Comparator comparator) {
        e();
        this.X = comparator;
    }

    public void l(int i, Iterator it) {
        e();
        if (it != null) {
            this.Y.set(i, it);
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    public final void m() {
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
    public Object next() throws NoSuchElementException {
        if (hasNext()) {
            int i = i();
            if (i != -1) {
                Object obj = this.Z.get(i);
                f(i);
                this.Z0 = i;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.Z0;
        if (i != -1) {
            ((Iterator) this.Y.get(i)).remove();
            return;
        }
        throw new IllegalStateException("No value can be removed at present");
    }

    public ZE(Comparator comparator) {
        this(comparator, 2);
    }

    public ZE(Comparator comparator, int i) {
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.Y0 = null;
        this.Z0 = -1;
        this.Y = new ArrayList(i);
        k(comparator);
    }

    public ZE(Comparator comparator, Iterator it, Iterator it2) {
        this(comparator, 2);
        b(it);
        b(it2);
    }

    public ZE(Comparator comparator, Iterator[] itArr) {
        this(comparator, itArr.length);
        for (Iterator it : itArr) {
            b(it);
        }
    }

    public ZE(Comparator comparator, Collection collection) {
        this(comparator, collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((Iterator) it.next());
        }
    }
}
