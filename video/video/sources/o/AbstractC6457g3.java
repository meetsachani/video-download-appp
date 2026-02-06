package o;

import java.util.Comparator;

/* renamed from: o.g3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6457g3<E> extends O<E> implements U92<E> {
    private static final long serialVersionUID = -8223473624050467718L;

    public AbstractC6457g3() {
    }

    @Override // o.U92
    public Comparator<? super E> comparator() {
        return f().comparator();
    }

    @Override // o.U92
    public E first() {
        return f().first();
    }

    @Override // o.O
    /* renamed from: h */
    public U92<E> f() {
        return (U92) super.d();
    }

    @Override // o.U92
    public E last() {
        return f().last();
    }

    public AbstractC6457g3(U92<E> u92) {
        super(u92);
    }
}
