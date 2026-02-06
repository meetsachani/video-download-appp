package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Am1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2467Am1<E> extends Collection<E> {

    /* renamed from: o.Am1$a */
    /* loaded from: classes3.dex */
    public interface a<E> {
        @InterfaceC7894ly1
        E a();

        boolean equals(@MB Object obj);

        int getCount();

        int hashCode();

        String toString();
    }

    @InterfaceC6181ey
    int R(@InterfaceC7894ly1 E e, int i);

    @InterfaceC6181ey
    boolean Y3(@InterfaceC7894ly1 E e, int i, int i2);

    @Override // java.util.Collection
    @InterfaceC6181ey
    boolean add(@InterfaceC7894ly1 E e);

    @Override // java.util.Collection
    boolean contains(@MB Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<a<E>> entrySet();

    @Override // java.util.Collection
    boolean equals(@MB Object obj);

    @Override // java.util.Collection
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    Set<E> n();

    @Override // java.util.Collection
    @InterfaceC6181ey
    boolean remove(@MB Object obj);

    @Override // java.util.Collection
    @InterfaceC6181ey
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    @InterfaceC6181ey
    boolean retainAll(Collection<?> collection);

    @Override // java.util.Collection
    int size();

    String toString();

    @InterfaceC6181ey
    int v(@DH("E") @MB Object obj, int i);

    int w4(@DH("E") @MB Object obj);

    @InterfaceC6181ey
    int x(@InterfaceC7894ly1 E e, int i);
}
