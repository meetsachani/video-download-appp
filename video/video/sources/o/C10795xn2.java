package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.xn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10795xn2 {
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 a = new C7592kj2("NO_THREAD_ELEMENTS");
    @NotNull
    public static final VA0<Object, InterfaceC5809dQ.b, Object> b = new VA0() { // from class: o.un2
        @Override // o.VA0
        public final Object i(Object obj, Object obj2) {
            Object d2;
            d2 = C10795xn2.d(obj, (InterfaceC5809dQ.b) obj2);
            return d2;
        }
    };
    @NotNull
    public static final VA0<InterfaceC9577sn2<?>, InterfaceC5809dQ.b, InterfaceC9577sn2<?>> c = new VA0() { // from class: o.vn2
        @Override // o.VA0
        public final Object i(Object obj, Object obj2) {
            InterfaceC9577sn2 e;
            e = C10795xn2.e((InterfaceC9577sn2) obj, (InterfaceC5809dQ.b) obj2);
            return e;
        }
    };
    @NotNull
    public static final VA0<C4048Qn2, InterfaceC5809dQ.b, C4048Qn2> d = new VA0() { // from class: o.wn2
        @Override // o.VA0
        public final Object i(Object obj, Object obj2) {
            C4048Qn2 h;
            h = C10795xn2.h((C4048Qn2) obj, (InterfaceC5809dQ.b) obj2);
            return h;
        }
    };

    public static final Object d(Object obj, InterfaceC5809dQ.b bVar) {
        Integer num;
        int i;
        if (bVar instanceof InterfaceC9577sn2) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
        return obj;
    }

    public static final InterfaceC9577sn2<?> e(InterfaceC9577sn2<?> interfaceC9577sn2, InterfaceC5809dQ.b bVar) {
        if (interfaceC9577sn2 != null) {
            return interfaceC9577sn2;
        }
        if (bVar instanceof InterfaceC9577sn2) {
            return (InterfaceC9577sn2) bVar;
        }
        return null;
    }

    public static final void f(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof C4048Qn2) {
            ((C4048Qn2) obj).b(interfaceC5809dQ);
            return;
        }
        Object m = interfaceC5809dQ.m(null, c);
        C6562gT0.n(m, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC9577sn2) m).G(interfaceC5809dQ, obj);
    }

    @NotNull
    public static final Object g(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        Object m = interfaceC5809dQ.m(0, b);
        C6562gT0.m(m);
        return m;
    }

    public static final C4048Qn2 h(C4048Qn2 c4048Qn2, InterfaceC5809dQ.b bVar) {
        if (bVar instanceof InterfaceC9577sn2) {
            InterfaceC9577sn2<?> interfaceC9577sn2 = (InterfaceC9577sn2) bVar;
            c4048Qn2.a(interfaceC9577sn2, interfaceC9577sn2.c0(c4048Qn2.a));
        }
        return c4048Qn2;
    }

    @Nullable
    public static final Object i(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable Object obj) {
        if (obj == null) {
            obj = g(interfaceC5809dQ);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return interfaceC5809dQ.m(new C4048Qn2(interfaceC5809dQ, ((Number) obj).intValue()), d);
        }
        C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC9577sn2) obj).c0(interfaceC5809dQ);
    }
}
