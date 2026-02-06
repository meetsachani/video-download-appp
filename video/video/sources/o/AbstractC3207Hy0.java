package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import o.C6088ea2;
import o.InterfaceC2467Am1;

@InterfaceC6329fa0
@InterfaceC4238Sm
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.Hy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3207Hy0<E> extends AbstractC10594wy0<E> implements InterfaceC5603ca2<E> {

    /* renamed from: o.Hy0$a */
    /* loaded from: classes3.dex */
    public abstract class a extends AbstractC10854y20<E> {
        public a() {
        }

        @Override // o.AbstractC10854y20
        public InterfaceC5603ca2<E> j6() {
            return AbstractC3207Hy0.this;
        }
    }

    /* renamed from: o.Hy0$b */
    /* loaded from: classes3.dex */
    public class b extends C6088ea2.b<E> {
        public b(AbstractC3207Hy0 abstractC3207Hy0) {
            super(abstractC3207Hy0);
        }
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> C3() {
        return Y5().C3();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> G2(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return Y5().G2(e, enumC6886hp);
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

    @Override // o.AbstractC10594wy0
    /* renamed from: h6 */
    public abstract InterfaceC5603ca2<E> Y5();

    @MB
    public InterfaceC2467Am1.a<E> i6() {
        Iterator<InterfaceC2467Am1.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        InterfaceC2467Am1.a<E> next = it.next();
        return C2565Bm1.k(next.a(), next.getCount());
    }

    @MB
    public InterfaceC2467Am1.a<E> j6() {
        Iterator<InterfaceC2467Am1.a<E>> it = C3().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        InterfaceC2467Am1.a<E> next = it.next();
        return C2565Bm1.k(next.a(), next.getCount());
    }

    @MB
    public InterfaceC2467Am1.a<E> k6() {
        Iterator<InterfaceC2467Am1.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        InterfaceC2467Am1.a<E> next = it.next();
        InterfaceC2467Am1.a<E> k = C2565Bm1.k(next.a(), next.getCount());
        it.remove();
        return k;
    }

    @MB
    public InterfaceC2467Am1.a<E> l6() {
        Iterator<InterfaceC2467Am1.a<E>> it = C3().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        InterfaceC2467Am1.a<E> next = it.next();
        InterfaceC2467Am1.a<E> k = C2565Bm1.k(next.a(), next.getCount());
        it.remove();
        return k;
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        return Y5().lastEntry();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> m3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2) {
        return Y5().m3(e, enumC6886hp, e2, enumC6886hp2);
    }

    public InterfaceC5603ca2<E> m6(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2) {
        return t3(e, enumC6886hp).G2(e2, enumC6886hp2);
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollFirstEntry() {
        return Y5().pollFirstEntry();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollLastEntry() {
        return Y5().pollLastEntry();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> t3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return Y5().t3(e, enumC6886hp);
    }

    @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
    public NavigableSet<E> n() {
        return Y5().n();
    }
}
