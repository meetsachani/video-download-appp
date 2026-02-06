package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import o.C6088ea2;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.n3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8174n3<E> extends AbstractC7180j2<E> implements InterfaceC5603ca2<E> {
    @MB
    public transient InterfaceC5603ca2<E> Y0;
    @BF0
    public final Comparator<? super E> Z;

    /* renamed from: o.n3$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC10854y20<E> {
        public a() {
        }

        @Override // o.AbstractC10854y20
        public Iterator<InterfaceC2467Am1.a<E>> i6() {
            return AbstractC8174n3.this.l();
        }

        @Override // o.AbstractC10854y20, o.AbstractC4473Ux0, java.util.Collection, java.lang.Iterable, o.InterfaceC2467Am1
        public Iterator<E> iterator() {
            return AbstractC8174n3.this.descendingIterator();
        }

        @Override // o.AbstractC10854y20
        public InterfaceC5603ca2<E> j6() {
            return AbstractC8174n3.this;
        }
    }

    public AbstractC8174n3() {
        this(AbstractC10587ww1.z());
    }

    public InterfaceC5603ca2<E> C3() {
        InterfaceC5603ca2<E> interfaceC5603ca2 = this.Y0;
        if (interfaceC5603ca2 == null) {
            InterfaceC5603ca2<E> j = j();
            this.Y0 = j;
            return j;
        }
        return interfaceC5603ca2;
    }

    public Comparator<? super E> comparator() {
        return this.Z;
    }

    public Iterator<E> descendingIterator() {
        return C2565Bm1.n(C3());
    }

    @MB
    public InterfaceC2467Am1.a<E> firstEntry() {
        Iterator<InterfaceC2467Am1.a<E>> i = i();
        if (i.hasNext()) {
            return i.next();
        }
        return null;
    }

    public InterfaceC5603ca2<E> j() {
        return new a();
    }

    @Override // o.AbstractC7180j2
    /* renamed from: k */
    public NavigableSet<E> d() {
        return new C6088ea2.b(this);
    }

    public abstract Iterator<InterfaceC2467Am1.a<E>> l();

    @MB
    public InterfaceC2467Am1.a<E> lastEntry() {
        Iterator<InterfaceC2467Am1.a<E>> l = l();
        if (l.hasNext()) {
            return l.next();
        }
        return null;
    }

    public InterfaceC5603ca2<E> m3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2) {
        C10664xF1.E(enumC6886hp);
        C10664xF1.E(enumC6886hp2);
        return t3(e, enumC6886hp).G2(e2, enumC6886hp2);
    }

    @MB
    public InterfaceC2467Am1.a<E> pollFirstEntry() {
        Iterator<InterfaceC2467Am1.a<E>> i = i();
        if (i.hasNext()) {
            InterfaceC2467Am1.a<E> next = i.next();
            InterfaceC2467Am1.a<E> k = C2565Bm1.k(next.a(), next.getCount());
            i.remove();
            return k;
        }
        return null;
    }

    @MB
    public InterfaceC2467Am1.a<E> pollLastEntry() {
        Iterator<InterfaceC2467Am1.a<E>> l = l();
        if (l.hasNext()) {
            InterfaceC2467Am1.a<E> next = l.next();
            InterfaceC2467Am1.a<E> k = C2565Bm1.k(next.a(), next.getCount());
            l.remove();
            return k;
        }
        return null;
    }

    public AbstractC8174n3(Comparator<? super E> comparator) {
        this.Z = (Comparator) C10664xF1.E(comparator);
    }

    @Override // o.AbstractC7180j2, o.InterfaceC2467Am1
    public NavigableSet<E> n() {
        return (NavigableSet) super.n();
    }
}
