package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import o.C2565Bm1;
import o.C6088ea2;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.y20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10854y20<E> extends AbstractC10594wy0<E> implements InterfaceC5603ca2<E> {
    @MB
    public transient Comparator<? super E> X;
    @MB
    public transient NavigableSet<E> Y;
    @MB
    public transient Set<InterfaceC2467Am1.a<E>> Z;

    /* renamed from: o.y20$a */
    /* loaded from: classes3.dex */
    public class a extends C2565Bm1.i<E> {
        public a() {
        }

        @Override // o.C2565Bm1.i
        public InterfaceC2467Am1<E> i() {
            return AbstractC10854y20.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<InterfaceC2467Am1.a<E>> iterator() {
            return AbstractC10854y20.this.i6();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC10854y20.this.j6().entrySet().size();
        }
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> C3() {
        return j6();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> G2(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return j6().t3(e, enumC6886hp).C3();
    }

    @Override // o.AbstractC10594wy0, o.AbstractC4473Ux0
    /* renamed from: Y5 */
    public InterfaceC2467Am1<E> M5() {
        return j6();
    }

    @Override // o.InterfaceC5603ca2, o.Y92
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.X;
        if (comparator == null) {
            AbstractC10587ww1 E = AbstractC10587ww1.h(j6().comparator()).E();
            this.X = E;
            return E;
        }
        return comparator;
    }

    @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
    public Set<InterfaceC2467Am1.a<E>> entrySet() {
        Set<InterfaceC2467Am1.a<E>> set = this.Z;
        if (set == null) {
            Set<InterfaceC2467Am1.a<E>> h6 = h6();
            this.Z = h6;
            return h6;
        }
        return set;
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> firstEntry() {
        return j6().lastEntry();
    }

    public Set<InterfaceC2467Am1.a<E>> h6() {
        return new a();
    }

    public abstract Iterator<InterfaceC2467Am1.a<E>> i6();

    @Override // o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
    public Iterator<E> iterator() {
        return C2565Bm1.n(this);
    }

    public abstract InterfaceC5603ca2<E> j6();

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        return j6().firstEntry();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> m3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2) {
        return j6().m3(e2, enumC6886hp2, e, enumC6886hp).C3();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollFirstEntry() {
        return j6().pollLastEntry();
    }

    @Override // o.InterfaceC5603ca2
    @MB
    public InterfaceC2467Am1.a<E> pollLastEntry() {
        return j6().pollFirstEntry();
    }

    @Override // o.InterfaceC5603ca2
    public InterfaceC5603ca2<E> t3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp) {
        return j6().G2(e, enumC6886hp).C3();
    }

    @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return V5();
    }

    @Override // o.AbstractC2510Ay0
    public String toString() {
        return entrySet().toString();
    }

    @Override // o.AbstractC4473Ux0, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) W5(tArr);
    }

    @Override // o.AbstractC10594wy0, o.InterfaceC2467Am1
    public NavigableSet<E> n() {
        NavigableSet<E> navigableSet = this.Y;
        if (navigableSet == null) {
            C6088ea2.b bVar = new C6088ea2.b(this);
            this.Y = bVar;
            return bVar;
        }
        return navigableSet;
    }
}
