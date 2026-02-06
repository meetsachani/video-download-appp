package o;

import java.util.Set;

/* loaded from: classes4.dex */
public class SF1<E> extends VF1<E> implements InterfaceC2958Fk<E> {
    private static final long serialVersionUID = -2575833140344736876L;

    public SF1(InterfaceC2958Fk<E> interfaceC2958Fk, KF1<? super E> kf1) {
        super(interfaceC2958Fk, kf1);
    }

    public static <E> SF1<E> l(InterfaceC2958Fk<E> interfaceC2958Fk, KF1<? super E> kf1) {
        return new SF1<>(interfaceC2958Fk, kf1);
    }

    @Override // o.InterfaceC2958Fk
    public int I(Object obj) {
        return d().I(obj);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return d().hashCode();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: k */
    public InterfaceC2958Fk<E> d() {
        return (InterfaceC2958Fk) super.d();
    }

    @Override // o.InterfaceC2958Fk
    public boolean v(Object obj, int i) {
        return d().v(obj, i);
    }

    @Override // o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        j(e);
        return d().x(e, i);
    }

    @Override // o.InterfaceC2958Fk
    public Set<E> y() {
        return d().y();
    }
}
