package o;

import java.lang.Comparable;
import java.util.Set;

@InterfaceC11149zF0
@L40("Use ImmutableRangeSet or TreeRangeSet")
@InterfaceC6329fa0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public interface VN1<C extends Comparable> {
    PN1<C> a();

    void b(PN1<C> pn1);

    void c(PN1<C> pn1);

    void clear();

    VN1<C> d();

    boolean e(C c);

    boolean equals(@MB Object obj);

    void f(VN1<C> vn1);

    boolean g(PN1<C> pn1);

    void h(Iterable<PN1<C>> iterable);

    int hashCode();

    boolean i(VN1<C> vn1);

    boolean isEmpty();

    void j(Iterable<PN1<C>> iterable);

    VN1<C> k(PN1<C> pn1);

    @MB
    PN1<C> l(C c);

    boolean m(Iterable<PN1<C>> iterable);

    void n(VN1<C> vn1);

    boolean o(PN1<C> pn1);

    Set<PN1<C>> p();

    Set<PN1<C>> q();

    String toString();
}
