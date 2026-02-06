package o;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface HJ {

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new C2547Bi(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(a<?> aVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    static HJ J(HJ hj, HJ hj2) {
        C2569Bn1 u0;
        if (hj == null && hj2 == null) {
            return C5932dw1.s0();
        }
        if (hj2 != null) {
            u0 = C2569Bn1.v0(hj2);
        } else {
            u0 = C2569Bn1.u0();
        }
        if (hj != null) {
            for (a<?> aVar : hj.f()) {
                k0(u0, hj2, hj, aVar);
            }
        }
        return C5932dw1.t0(u0);
    }

    static void k0(C2569Bn1 c2569Bn1, HJ hj, HJ hj2, a<?> aVar) {
        if (Objects.equals(aVar, InterfaceC6040eN0.t)) {
            c2569Bn1.M(aVar, hj2.i(aVar), VS1.a((US1) hj.h(aVar, null), (US1) hj2.h(aVar, null)));
            return;
        }
        c2569Bn1.M(aVar, hj2.i(aVar), hj2.j(aVar));
    }

    static boolean m0(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        if (cVar == cVar4 && cVar2 == cVar4) {
            return true;
        }
        return false;
    }

    Set<c> a(a<?> aVar);

    Set<a<?>> f();

    boolean g(a<?> aVar);

    <ValueT> ValueT h(a<ValueT> aVar, ValueT valuet);

    c i(a<?> aVar);

    <ValueT> ValueT j(a<ValueT> aVar);

    void k(String str, b bVar);

    <ValueT> ValueT l(a<ValueT> aVar, c cVar);
}
