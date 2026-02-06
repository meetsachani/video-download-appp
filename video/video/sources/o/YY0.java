package o;

import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class YY0<E> extends T2<E> {
    private static final long serialVersionUID = -3677737457567429713L;
    public final InterfaceC5641ck0<? extends E> Y;
    public final InterfaceC3287Is2<Integer, ? extends E> Z;

    public YY0(List<E> list, InterfaceC5641ck0<? extends E> interfaceC5641ck0) {
        super(list);
        Objects.requireNonNull(interfaceC5641ck0);
        this.Y = interfaceC5641ck0;
        this.Z = null;
    }

    public static <E> YY0<E> i(List<E> list, InterfaceC5641ck0<? extends E> interfaceC5641ck0) {
        return new YY0<>(list, interfaceC5641ck0);
    }

    public static <E> YY0<E> j(List<E> list, InterfaceC3287Is2<Integer, ? extends E> interfaceC3287Is2) {
        return new YY0<>(list, interfaceC3287Is2);
    }

    @Override // o.AbstractC9145r1, java.util.List
    public E get(int i) {
        int size = d().size();
        if (i < size) {
            E e = d().get(i);
            if (e == null) {
                E h = h(i);
                d().set(i, h);
                return h;
            }
            return e;
        }
        while (size < i) {
            d().add(null);
            size++;
        }
        E h2 = h(i);
        d().add(h2);
        return h2;
    }

    public final E h(int i) {
        InterfaceC5641ck0<? extends E> interfaceC5641ck0 = this.Y;
        if (interfaceC5641ck0 != null) {
            return interfaceC5641ck0.a();
        }
        InterfaceC3287Is2<Integer, ? extends E> interfaceC3287Is2 = this.Z;
        if (interfaceC3287Is2 != null) {
            return interfaceC3287Is2.a(Integer.valueOf(i));
        }
        throw new IllegalStateException("Factory and Transformer are both null!");
    }

    @Override // o.AbstractC9145r1, java.util.List
    public List<E> subList(int i, int i2) {
        List<E> subList = d().subList(i, i2);
        InterfaceC5641ck0<? extends E> interfaceC5641ck0 = this.Y;
        if (interfaceC5641ck0 != null) {
            return new YY0(subList, interfaceC5641ck0);
        }
        InterfaceC3287Is2<Integer, ? extends E> interfaceC3287Is2 = this.Z;
        if (interfaceC3287Is2 != null) {
            return new YY0(subList, interfaceC3287Is2);
        }
        throw new IllegalStateException("Factory and Transformer are both null!");
    }

    public YY0(List<E> list, InterfaceC3287Is2<Integer, ? extends E> interfaceC3287Is2) {
        super(list);
        this.Y = null;
        Objects.requireNonNull(interfaceC3287Is2);
        this.Z = interfaceC3287Is2;
    }
}
