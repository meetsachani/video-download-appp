package o;

import java.util.Iterator;

/* renamed from: o.fU0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6311fU0<E> implements Iterable<E> {
    public final Iterator<? extends E> X;
    public final Iterator<E> Y;

    /* renamed from: o.fU0$a */
    /* loaded from: classes4.dex */
    public static class a implements Iterator<E> {
        public final /* synthetic */ Iterator X;

        public a(Iterator it) {
            this.X = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return (E) this.X.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.X.remove();
        }
    }

    public C6311fU0(Iterator<? extends E> it) {
        this(it, false);
    }

    public static <E> Iterator<E> d(Iterator<? extends E> it) {
        return new a(it);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<? extends E> it = this.X;
        if (it instanceof MS1) {
            ((MS1) it).reset();
        }
        return this.Y;
    }

    public C6311fU0(Iterator<? extends E> it, boolean z) {
        if (z && !(it instanceof MS1)) {
            this.X = new T01(it);
        } else {
            this.X = it;
        }
        this.Y = d(this.X);
    }
}
