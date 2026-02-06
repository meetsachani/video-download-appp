package o;

import java.util.Set;

/* renamed from: o.tj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9804tj2<E> extends C3447Kj2<E> implements InterfaceC2958Fk<E> {
    private static final long serialVersionUID = 8084674570753837109L;

    /* renamed from: o.tj2$a */
    /* loaded from: classes4.dex */
    public class a extends C3447Kj2<E> implements Set<E> {
        private static final long serialVersionUID = 2990565892366827855L;

        public a(Set<E> set, Object obj) {
            super(set, obj);
        }
    }

    public C9804tj2(InterfaceC2958Fk<E> interfaceC2958Fk) {
        super(interfaceC2958Fk);
    }

    public static <E> C9804tj2<E> h(InterfaceC2958Fk<E> interfaceC2958Fk) {
        return new C9804tj2<>(interfaceC2958Fk);
    }

    @Override // o.InterfaceC2958Fk
    public int I(Object obj) {
        int I;
        synchronized (this.Y) {
            I = f().I(obj);
        }
        return I;
    }

    @Override // o.C3447Kj2, java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.Y) {
            equals = f().equals(obj);
        }
        return equals;
    }

    public InterfaceC2958Fk<E> f() {
        return (InterfaceC2958Fk) d();
    }

    @Override // o.C3447Kj2, java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.Y) {
            hashCode = f().hashCode();
        }
        return hashCode;
    }

    @Override // o.InterfaceC2958Fk
    public boolean v(Object obj, int i) {
        boolean v;
        synchronized (this.Y) {
            v = f().v(obj, i);
        }
        return v;
    }

    @Override // o.InterfaceC2958Fk
    public boolean x(E e, int i) {
        boolean x;
        synchronized (this.Y) {
            x = f().x(e, i);
        }
        return x;
    }

    @Override // o.InterfaceC2958Fk
    public Set<E> y() {
        a aVar;
        synchronized (this.Y) {
            aVar = new a(f().y(), this.Y);
        }
        return aVar;
    }

    public C9804tj2(InterfaceC2958Fk<E> interfaceC2958Fk, Object obj) {
        super(interfaceC2958Fk, obj);
    }
}
