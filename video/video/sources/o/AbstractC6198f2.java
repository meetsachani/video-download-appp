package o;

import java.util.Set;
import o.InterfaceC6135em1;

/* renamed from: o.f2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6198f2<E> extends AbstractC8162n0<E> implements InterfaceC6135em1<E> {
    private static final long serialVersionUID = 20150610;

    public AbstractC6198f2() {
    }

    @Override // o.InterfaceC6135em1
    public int I(Object obj) {
        return d().I(obj);
    }

    @Override // o.InterfaceC6135em1
    public int R(E e, int i) {
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

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public InterfaceC6135em1<E> d() {
        return (InterfaceC6135em1) super.d();
    }

    @Override // java.util.Collection, o.InterfaceC6135em1
    public int hashCode() {
        return d().hashCode();
    }

    @Override // o.InterfaceC6135em1
    public int v(Object obj, int i) {
        return d().v(obj, i);
    }

    @Override // o.InterfaceC6135em1
    public int x(E e, int i) {
        return d().x(e, i);
    }

    @Override // o.InterfaceC6135em1
    public Set<E> y() {
        return d().y();
    }

    public AbstractC6198f2(InterfaceC6135em1<E> interfaceC6135em1) {
        super(interfaceC6135em1);
    }
}
