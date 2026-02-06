package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@L40("Use ImmutableTable, HashBasedTable, or another implementation")
@InterfaceC6329fa0
@InterfaceC10420wF0
/* renamed from: o.Nk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3744Nk2<R, C, V> {

    /* renamed from: o.Nk2$a */
    /* loaded from: classes3.dex */
    public interface a<R, C, V> {
        @InterfaceC7894ly1
        R a();

        @InterfaceC7894ly1
        C b();

        boolean equals(@MB Object obj);

        @InterfaceC7894ly1
        V getValue();

        int hashCode();
    }

    void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2);

    Set<R> F();

    Map<R, Map<C, V>> H();

    Set<C> L4();

    boolean M4(@DH("R") @MB Object obj);

    void clear();

    boolean containsValue(@DH("V") @MB Object obj);

    Map<R, V> d3(@InterfaceC7894ly1 C c);

    boolean equals(@MB Object obj);

    int hashCode();

    Map<C, Map<R, V>> i2();

    boolean i5(@DH("R") @MB Object obj, @DH("C") @MB Object obj2);

    boolean isEmpty();

    Set<a<R, C, V>> o3();

    @InterfaceC6181ey
    @MB
    V q3(@InterfaceC7894ly1 R r, @InterfaceC7894ly1 C c, @InterfaceC7894ly1 V v);

    @MB
    V r0(@DH("R") @MB Object obj, @DH("C") @MB Object obj2);

    @InterfaceC6181ey
    @MB
    V remove(@DH("R") @MB Object obj, @DH("C") @MB Object obj2);

    int size();

    Collection<V> values();

    Map<C, V> x5(@InterfaceC7894ly1 R r);

    boolean y0(@DH("C") @MB Object obj);
}
