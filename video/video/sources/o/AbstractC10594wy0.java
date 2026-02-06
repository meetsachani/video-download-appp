package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.wy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10594wy0<E> extends AbstractC4473Ux0<E> implements InterfaceC2467Am1<E> {

    @InterfaceC4238Sm
    /* renamed from: o.wy0$a */
    /* loaded from: classes3.dex */
    public class a extends C2565Bm1.h<E> {
        public a() {
        }

        @Override // o.C2565Bm1.h
        public InterfaceC2467Am1<E> i() {
            return AbstractC10594wy0.this;
        }

        @Override // o.C2565Bm1.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return C2565Bm1.h(i().entrySet().iterator());
        }
    }

    @Override // o.AbstractC4473Ux0
    @InterfaceC4238Sm
    public boolean N5(Collection<? extends E> collection) {
        return C2565Bm1.a(this, collection);
    }

    @Override // o.AbstractC4473Ux0
    public void O5() {
        C7052iU0.h(entrySet().iterator());
    }

    @Override // o.AbstractC4473Ux0
    public boolean P5(@MB Object obj) {
        if (w4(obj) > 0) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public int R(@InterfaceC7894ly1 E e, int i) {
        return M5().R(e, i);
    }

    @Override // o.AbstractC4473Ux0
    public boolean S5(@MB Object obj) {
        if (v(obj, 1) > 0) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC4473Ux0
    public boolean T5(Collection<?> collection) {
        return C2565Bm1.p(this, collection);
    }

    @Override // o.AbstractC4473Ux0
    public boolean U5(Collection<?> collection) {
        return C2565Bm1.s(this, collection);
    }

    @Override // o.AbstractC4473Ux0
    public String X5() {
        return entrySet().toString();
    }

    @InterfaceC6181ey
    public boolean Y3(@InterfaceC7894ly1 E e, int i, int i2) {
        return M5().Y3(e, i, i2);
    }

    @Override // o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public abstract InterfaceC2467Am1<E> M5();

    public boolean Z5(@InterfaceC7894ly1 E e) {
        x(e, 1);
        return true;
    }

    @InterfaceC4238Sm
    public int a6(@MB Object obj) {
        for (InterfaceC2467Am1.a<E> aVar : entrySet()) {
            if (C2593Bt1.a(aVar.a(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    public boolean b6(@MB Object obj) {
        return C2565Bm1.i(this, obj);
    }

    public int c6() {
        return entrySet().hashCode();
    }

    public Iterator<E> d6() {
        return C2565Bm1.n(this);
    }

    public int e6(@InterfaceC7894ly1 E e, int i) {
        return C2565Bm1.v(this, e, i);
    }

    public Set<InterfaceC2467Am1.a<E>> entrySet() {
        return M5().entrySet();
    }

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public boolean equals(@MB Object obj) {
        if (obj != this && !M5().equals(obj)) {
            return false;
        }
        return true;
    }

    public boolean f6(@InterfaceC7894ly1 E e, int i, int i2) {
        return C2565Bm1.w(this, e, i, i2);
    }

    public int g6() {
        return C2565Bm1.o(this);
    }

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public int hashCode() {
        return M5().hashCode();
    }

    public Set<E> n() {
        return M5().n();
    }

    @InterfaceC6181ey
    public int v(@MB Object obj, int i) {
        return M5().v(obj, i);
    }

    @Override // o.InterfaceC2467Am1
    public int w4(@MB Object obj) {
        return M5().w4(obj);
    }

    @InterfaceC6181ey
    public int x(@InterfaceC7894ly1 E e, int i) {
        return M5().x(e, i);
    }
}
