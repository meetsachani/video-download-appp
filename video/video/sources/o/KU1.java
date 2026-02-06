package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class KU1<T> extends AbstractC8896q1<T> {
    @NotNull
    public final List<T> Z;

    /* loaded from: classes3.dex */
    public static final class a implements ListIterator<T>, GW0 {
        public final ListIterator<T> X;
        public final /* synthetic */ KU1<T> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KU1<? extends T> ku1, int i) {
            int e1;
            this.Y = ku1;
            List list = ku1.Z;
            e1 = C9687tF.e1(ku1, i);
            this.X = list.listIterator(e1);
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<T> b() {
            return this.X;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.X.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.X.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.X.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int d1;
            d1 = C9687tF.d1(this.Y, this.X.previousIndex());
            return d1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.X.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int d1;
            d1 = C9687tF.d1(this.Y, this.X.nextIndex());
            return d1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KU1(@NotNull List<? extends T> list) {
        C6562gT0.p(list, "delegate");
        this.Z = list;
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.Z.size();
    }

    @Override // o.AbstractC8896q1, java.util.List
    public T get(int i) {
        int c1;
        List<T> list = this.Z;
        c1 = C9687tF.c1(this, i);
        return list.get(c1);
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC8896q1, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC8896q1, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
