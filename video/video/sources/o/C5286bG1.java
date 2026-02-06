package o;

import java.util.Set;
import o.InterfaceC6135em1;

/* renamed from: o.bG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5286bG1<E> extends VF1<E> implements InterfaceC6135em1<E> {
    private static final long serialVersionUID = 20150629;

    public C5286bG1(InterfaceC6135em1<E> interfaceC6135em1, KF1<? super E> kf1) {
        super(interfaceC6135em1, kf1);
    }

    public static <E> C5286bG1<E> l(InterfaceC6135em1<E> interfaceC6135em1, KF1<? super E> kf1) {
        return new C5286bG1<>(interfaceC6135em1, kf1);
    }

    @Override // o.InterfaceC6135em1
    public int I(Object obj) {
        return d().I(obj);
    }

    @Override // o.InterfaceC6135em1
    public int R(E e, int i) {
        j(e);
        return d().R(e, i);
    }

    @Override // o.InterfaceC6135em1
    public Set<InterfaceC6135em1.a<E>> entrySet() {
        return d().entrySet();
    }

    @Override // java.util.Collection, o.InterfaceC6135em1
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, o.InterfaceC6135em1
    public int hashCode() {
        return d().hashCode();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: k */
    public InterfaceC6135em1<E> d() {
        return (InterfaceC6135em1) super.d();
    }

    @Override // o.InterfaceC6135em1
    public int v(Object obj, int i) {
        return d().v(obj, i);
    }

    @Override // o.InterfaceC6135em1
    public int x(E e, int i) {
        j(e);
        return d().x(e, i);
    }

    @Override // o.InterfaceC6135em1
    public Set<E> y() {
        return d().y();
    }
}
