package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.ca2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5603ca2<E> extends InterfaceC5846da2<E>, Y92<E> {
    InterfaceC5603ca2<E> C3();

    InterfaceC5603ca2<E> G2(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp);

    Comparator<? super E> comparator();

    @Override // o.InterfaceC2467Am1
    Set<InterfaceC2467Am1.a<E>> entrySet();

    @MB
    InterfaceC2467Am1.a<E> firstEntry();

    @Override // o.InterfaceC2467Am1, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    @MB
    InterfaceC2467Am1.a<E> lastEntry();

    InterfaceC5603ca2<E> m3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 E e2, EnumC6886hp enumC6886hp2);

    @Override // o.InterfaceC5846da2, o.InterfaceC2467Am1
    NavigableSet<E> n();

    @MB
    InterfaceC2467Am1.a<E> pollFirstEntry();

    @MB
    InterfaceC2467Am1.a<E> pollLastEntry();

    InterfaceC5603ca2<E> t3(@InterfaceC7894ly1 E e, EnumC6886hp enumC6886hp);
}
