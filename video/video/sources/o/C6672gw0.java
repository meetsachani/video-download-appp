package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.gw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C6672gw0 {
    @NotNull
    public static final HA0<Object, Object> a = new HA0() { // from class: o.ew0
        @Override // o.HA0
        public final Object invoke(Object obj) {
            Object d;
            d = C6672gw0.d(obj);
            return d;
        }
    };
    @NotNull
    public static final VA0<Object, Object, Boolean> b = new VA0() { // from class: o.fw0
        @Override // o.VA0
        public final Object i(Object obj, Object obj2) {
            boolean c;
            c = C6672gw0.c(obj, obj2);
            return Boolean.valueOf(c);
        }
    };

    public static final boolean c(Object obj, Object obj2) {
        return C6562gT0.g(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        if (interfaceC3882Ov0 instanceof InterfaceC9041qc2) {
            return interfaceC3882Ov0;
        }
        return h(interfaceC3882Ov0, a, b);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super T, Boolean> va0) {
        HA0<Object, Object> ha0 = a;
        C6562gT0.n(va0, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return h(interfaceC3882Ov0, ha0, (VA0) C11313zv2.q(va0, 2));
    }

    @NotNull
    public static final <T, K> InterfaceC3882Ov0<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, ? extends K> ha0) {
        return h(interfaceC3882Ov0, ha0, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC3882Ov0<T> h(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HA0<? super T, ? extends Object> ha0, VA0<Object, Object, Boolean> va0) {
        if (interfaceC3882Ov0 instanceof E40) {
            E40 e40 = (E40) interfaceC3882Ov0;
            if (e40.Y == ha0 && e40.Z == va0) {
                return interfaceC3882Ov0;
            }
        }
        return new E40(interfaceC3882Ov0, ha0, va0);
    }

    public static final Object d(Object obj) {
        return obj;
    }
}
