package o;

import java.lang.Comparable;
import java.util.Map;

@InterfaceC11149zF0
@L40("Use ImmutableRangeMap or TreeRangeMap")
@InterfaceC6329fa0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public interface UN1<K extends Comparable, V> {
    PN1<K> a();

    void b(PN1<K> pn1);

    void c(PN1<K> pn1, V v);

    void clear();

    void d(UN1<K, V> un1);

    Map<PN1<K>, V> e();

    boolean equals(@MB Object obj);

    @MB
    Map.Entry<PN1<K>, V> f(K k);

    void g(PN1<K> pn1, V v);

    @MB
    V h(K k);

    int hashCode();

    Map<PN1<K>, V> i();

    UN1<K, V> j(PN1<K> pn1);

    String toString();
}
