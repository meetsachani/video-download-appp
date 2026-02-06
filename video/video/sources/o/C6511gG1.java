package o;

import java.util.Comparator;

/* renamed from: o.gG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6511gG1<E> extends SF1<E> implements U92<E> {
    private static final long serialVersionUID = 3448581314086406616L;

    public C6511gG1(U92<E> u92, KF1<? super E> kf1) {
        super(u92, kf1);
    }

    public static <E> C6511gG1<E> r(U92<E> u92, KF1<? super E> kf1) {
        return new C6511gG1<>(u92, kf1);
    }

    @Override // o.U92
    public Comparator<? super E> comparator() {
        return k().comparator();
    }

    @Override // o.U92
    public E first() {
        return k().first();
    }

    @Override // o.U92
    public E last() {
        return k().last();
    }

    @Override // o.SF1
    /* renamed from: p */
    public U92<E> k() {
        return (U92) super.d();
    }
}
