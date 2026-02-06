package o;

import java.util.Comparator;
import java.util.NavigableSet;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class KB2<E> extends C2565Bm1.m<E> implements InterfaceC5603ca2<E> {
    private static final long serialVersionUID = 0;
    @MB
    public transient KB2<E> Y0;

    public KB2(InterfaceC5603ca2<E> interfaceC5603ca2) {
        super(interfaceC5603ca2);
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> C3() {
        KB2<E> kb2 = this.Y0;
        if (kb2 == null) {
            KB2<E> kb22 = new KB2<>(Y5().C3());
            kb22.Y0 = this;
            this.Y0 = kb22;
            return kb22;
        }
        return kb2;
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> G2(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return C2565Bm1.B(Y5().G2(e, enumC6886hp));
    }

    @Override // o.InterfaceC5603ca2, o.Y92
    public Comparator<? super E> comparator() {
        return Y5().comparator();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> firstEntry() {
        return Y5().firstEntry();
    }

    @Override // o.C2565Bm1.m
    /* renamed from: i6 */
    public NavigableSet<E> h6() {
        return C10856y22.O(Y5().n());
    }

    @Override // o.C2565Bm1.m, o.AbstractC10594wy0
    /* renamed from: j6 */
    public InterfaceC5603ca2<E> Y5() {
        return (InterfaceC5603ca2) super.M5();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        return Y5().lastEntry();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> m3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2) {
        return C2565Bm1.B(Y5().m3(e, enumC6886hp, e2, enumC6886hp2));
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> t3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return C2565Bm1.B(Y5().t3(e, enumC6886hp));
    }

    @Override // o.C2565Bm1.m, o.AbstractC10594wy0, o.InterfaceC2467Am1
    public NavigableSet<E> n() {
        return (NavigableSet) super.n();
    }
}
