package o;

import java.util.Set;
import o.HJ;

/* loaded from: classes.dex */
public interface CO1 extends HJ {
    @Override // o.HJ
    default Set<HJ.c> a(HJ.a<?> aVar) {
        return d().a(aVar);
    }

    HJ d();

    @Override // o.HJ
    default Set<HJ.a<?>> f() {
        return d().f();
    }

    @Override // o.HJ
    default boolean g(HJ.a<?> aVar) {
        return d().g(aVar);
    }

    @Override // o.HJ
    default <ValueT> ValueT h(HJ.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) d().h(aVar, valuet);
    }

    @Override // o.HJ
    default HJ.c i(HJ.a<?> aVar) {
        return d().i(aVar);
    }

    @Override // o.HJ
    default <ValueT> ValueT j(HJ.a<ValueT> aVar) {
        return (ValueT) d().j(aVar);
    }

    @Override // o.HJ
    default void k(String str, HJ.b bVar) {
        d().k(str, bVar);
    }

    @Override // o.HJ
    default <ValueT> ValueT l(HJ.a<ValueT> aVar, HJ.c cVar) {
        return (ValueT) d().l(aVar, cVar);
    }
}
