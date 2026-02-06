package o;

import java.util.Set;
import o.InterfaceC6135em1;

/* renamed from: o.Pj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3935Pj2<E> extends C3447Kj2<E> implements InterfaceC6135em1<E> {
    private static final long serialVersionUID = 20150629;

    /* renamed from: o.Pj2$a */
    /* loaded from: classes4.dex */
    public static class a<T> extends C3447Kj2<T> implements Set<T> {
        private static final long serialVersionUID = 20150629;

        public a(Set<T> set, Object obj) {
            super(set, obj);
        }
    }

    public C3935Pj2(InterfaceC6135em1<E> interfaceC6135em1) {
        super(interfaceC6135em1);
    }

    public static <E> C3935Pj2<E> h(InterfaceC6135em1<E> interfaceC6135em1) {
        return new C3935Pj2<>(interfaceC6135em1);
    }

    @Override // o.InterfaceC6135em1
    public int I(Object obj) {
        int I;
        synchronized (this.Y) {
            I = d().I(obj);
        }
        return I;
    }

    @Override // o.InterfaceC6135em1
    public int R(E e, int i) {
        int R;
        synchronized (this.Y) {
            R = d().R(e, i);
        }
        return R;
    }

    @Override // o.InterfaceC6135em1
    public Set<InterfaceC6135em1.a<E>> entrySet() {
        a aVar;
        synchronized (this.Y) {
            aVar = new a(d().entrySet(), this.Y);
        }
        return aVar;
    }

    @Override // o.C3447Kj2, java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.Y) {
            equals = d().equals(obj);
        }
        return equals;
    }

    @Override // o.C3447Kj2
    /* renamed from: f */
    public InterfaceC6135em1<E> d() {
        return (InterfaceC6135em1) super.d();
    }

    @Override // o.C3447Kj2, java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.Y) {
            hashCode = d().hashCode();
        }
        return hashCode;
    }

    @Override // o.InterfaceC6135em1
    public int v(Object obj, int i) {
        int v;
        synchronized (this.Y) {
            v = d().v(obj, i);
        }
        return v;
    }

    @Override // o.InterfaceC6135em1
    public int x(E e, int i) {
        int x;
        synchronized (this.Y) {
            x = d().x(e, i);
        }
        return x;
    }

    @Override // o.InterfaceC6135em1
    public Set<E> y() {
        a aVar;
        synchronized (this.Y) {
            aVar = new a(d().y(), this.Y);
        }
        return aVar;
    }

    public C3935Pj2(InterfaceC6135em1<E> interfaceC6135em1, Object obj) {
        super(interfaceC6135em1, obj);
    }
}
