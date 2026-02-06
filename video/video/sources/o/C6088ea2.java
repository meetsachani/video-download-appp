package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import o.C2565Bm1;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.ea2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6088ea2 {

    /* renamed from: o.ea2$a */
    /* loaded from: classes3.dex */
    public static class a<E> extends C2565Bm1.h<E> implements SortedSet<E> {
        @GJ2
        public final InterfaceC5603ca2<E> X;

        public a(InterfaceC5603ca2<E> interfaceC5603ca2) {
            this.X = interfaceC5603ca2;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public E first() {
            return (E) C6088ea2.d(i().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@InterfaceC7894ly1 E e) {
            return i().G2(e, EnumC6886hp.OPEN).n();
        }

        @Override // o.C2565Bm1.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return C2565Bm1.h(i().entrySet().iterator());
        }

        @Override // o.C2565Bm1.h
        /* renamed from: j */
        public final InterfaceC5603ca2<E> i() {
            return this.X;
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public E last() {
            return (E) C6088ea2.d(i().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
            return i().m3(e, EnumC6886hp.CLOSED, e2, EnumC6886hp.OPEN).n();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@InterfaceC7894ly1 E e) {
            return i().t3(e, EnumC6886hp.CLOSED).n();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.ea2$b */
    /* loaded from: classes3.dex */
    public static class b<E> extends a<E> implements NavigableSet<E> {
        public b(InterfaceC5603ca2<E> interfaceC5603ca2) {
            super(interfaceC5603ca2);
        }

        @Override // java.util.NavigableSet
        @MB
        public E ceiling(@InterfaceC7894ly1 E e) {
            return (E) C6088ea2.c(i().t3(e, EnumC6886hp.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(i().C3());
        }

        @Override // java.util.NavigableSet
        @MB
        public E floor(@InterfaceC7894ly1 E e) {
            return (E) C6088ea2.c(i().G2(e, EnumC6886hp.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@InterfaceC7894ly1 E e, boolean z) {
            return new b(i().G2(e, EnumC6886hp.g(z)));
        }

        @Override // java.util.NavigableSet
        @MB
        public E higher(@InterfaceC7894ly1 E e) {
            return (E) C6088ea2.c(i().t3(e, EnumC6886hp.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @MB
        public E lower(@InterfaceC7894ly1 E e) {
            return (E) C6088ea2.c(i().G2(e, EnumC6886hp.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollFirst() {
            return (E) C6088ea2.c(i().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @MB
        public E pollLast() {
            return (E) C6088ea2.c(i().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@InterfaceC7894ly1 E e, boolean z, @InterfaceC7894ly1 E e2, boolean z2) {
            return new b(i().m3(e, EnumC6886hp.g(z), e2, EnumC6886hp.g(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@InterfaceC7894ly1 E e, boolean z) {
            return new b(i().t3(e, EnumC6886hp.g(z)));
        }
    }

    @MB
    public static <E> E c(@MB InterfaceC2467Am1.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    public static <E> E d(@MB InterfaceC2467Am1.a<E> aVar) {
        if (aVar != null) {
            return aVar.a();
        }
        throw new NoSuchElementException();
    }
}
