package o;

import java.io.Serializable;
import java.util.Collection;

/* renamed from: o.Zz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4973Zz<T> implements InterfaceC3287Is2<T, T>, Serializable {
    private static final long serialVersionUID = 3514945074733160196L;
    public final InterfaceC3287Is2<? super T, ? extends T>[] X;

    public C4973Zz(boolean z, InterfaceC3287Is2<? super T, ? extends T>[] interfaceC3287Is2Arr) {
        this.X = z ? RB0.f(interfaceC3287Is2Arr) : interfaceC3287Is2Arr;
    }

    public static <T> InterfaceC3287Is2<T, T> b(Collection<? extends InterfaceC3287Is2<? super T, ? extends T>> collection) {
        if (collection != null) {
            if (collection.size() == 0) {
                return C8602oo1.b();
            }
            InterfaceC3287Is2[] interfaceC3287Is2Arr = (InterfaceC3287Is2[]) collection.toArray(new InterfaceC3287Is2[collection.size()]);
            RB0.i(interfaceC3287Is2Arr);
            return new C4973Zz(false, interfaceC3287Is2Arr);
        }
        throw new NullPointerException("Transformer collection must not be null");
    }

    public static <T> InterfaceC3287Is2<T, T> c(InterfaceC3287Is2<? super T, ? extends T>... interfaceC3287Is2Arr) {
        RB0.i(interfaceC3287Is2Arr);
        if (interfaceC3287Is2Arr.length == 0) {
            return C8602oo1.b();
        }
        return new C4973Zz(interfaceC3287Is2Arr);
    }

    @Override // o.InterfaceC3287Is2
    public T a(T t) {
        for (InterfaceC3287Is2<? super T, ? extends T> interfaceC3287Is2 : this.X) {
            t = interfaceC3287Is2.a(t);
        }
        return t;
    }

    public InterfaceC3287Is2<? super T, ? extends T>[] d() {
        return RB0.f(this.X);
    }

    public C4973Zz(InterfaceC3287Is2<? super T, ? extends T>... interfaceC3287Is2Arr) {
        this(true, interfaceC3287Is2Arr);
    }
}
