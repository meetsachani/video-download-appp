package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class JU1<T> extends AbstractC7666l2<T> {
    @NotNull
    public final List<T> X;

    /* loaded from: classes3.dex */
    public static final class a implements ListIterator<T>, LW0 {
        public final ListIterator<T> X;
        public final /* synthetic */ JU1<T> Y;

        public a(JU1<T> ju1, int i) {
            int e1;
            this.Y = ju1;
            List list = ju1.X;
            e1 = C9687tF.e1(ju1, i);
            this.X = list.listIterator(e1);
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.X.add(t);
            this.X.previous();
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
            this.X.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.X.set(t);
        }
    }

    public JU1(@NotNull List<T> list) {
        C6562gT0.p(list, "delegate");
        this.X = list;
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int e1;
        List<T> list = this.X;
        e1 = C9687tF.e1(this, i);
        list.add(e1, t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.X.clear();
    }

    @Override // o.AbstractC7666l2
    public int d() {
        return this.X.size();
    }

    @Override // o.AbstractC7666l2
    public T e(int i) {
        int c1;
        List<T> list = this.X;
        c1 = C9687tF.c1(this, i);
        return list.remove(c1);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int c1;
        List<T> list = this.X;
        c1 = C9687tF.c1(this, i);
        return list.get(c1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC7666l2, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        int c1;
        List<T> list = this.X;
        c1 = C9687tF.c1(this, i);
        return list.set(c1, t);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        return new a(this, i);
    }
}
