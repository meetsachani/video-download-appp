package o;

import java.io.Serializable;
import java.util.List;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.t8  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9659t8 extends AbstractC10587ww1<Object> implements Serializable {
    public static final C9659t8 Z = new C9659t8();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return Z;
    }

    @Override // o.AbstractC10587ww1
    public <E> List<E> F(Iterable<E> iterable) {
        return C10608x11.r(iterable);
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@MB Object obj, @MB Object obj2) {
        return 0;
    }

    @Override // o.AbstractC10587ww1
    public <E> AbstractC5317bO0<E> l(Iterable<E> iterable) {
        return AbstractC5317bO0.D(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override // o.AbstractC10587ww1
    public <S> AbstractC10587ww1<S> E() {
        return this;
    }
}
