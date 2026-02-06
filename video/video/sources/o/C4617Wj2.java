package o;

import java.util.Comparator;

/* renamed from: o.Wj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4617Wj2<E> extends C9804tj2<E> implements U92<E> {
    private static final long serialVersionUID = 722374056718497858L;

    public C4617Wj2(U92<E> u92) {
        super(u92);
    }

    public static <E> C4617Wj2<E> j(U92<E> u92) {
        return new C4617Wj2<>(u92);
    }

    @Override // o.U92
    public synchronized Comparator<? super E> comparator() {
        Comparator<? super E> comparator;
        synchronized (this.Y) {
            comparator = i().comparator();
        }
        return comparator;
    }

    @Override // o.U92
    public synchronized E first() {
        E first;
        synchronized (this.Y) {
            first = i().first();
        }
        return first;
    }

    public U92<E> i() {
        return (U92) d();
    }

    @Override // o.U92
    public synchronized E last() {
        E last;
        synchronized (this.Y) {
            last = i().last();
        }
        return last;
    }

    public C4617Wj2(InterfaceC2958Fk<E> interfaceC2958Fk, Object obj) {
        super(interfaceC2958Fk, obj);
    }
}
