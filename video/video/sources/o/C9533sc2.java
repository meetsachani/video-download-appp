package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
/* renamed from: o.sc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9533sc2 {
    @NotNull
    public static final C7592kj2 a = new C7592kj2(XH0.M);
    @NotNull
    public static final C7592kj2 b = new C7592kj2("PENDING");

    @NotNull
    public static final <T> InterfaceC4144Rn1<T> a(T t) {
        if (t == null) {
            t = (T) C9596ss1.a;
        }
        return new C9290rc2(t);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull InterfaceC9041qc2<? extends T> interfaceC9041qc2, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        if (((i >= 0 && i < 2) || i == -2) && enumC7132iq == EnumC7132iq.Y) {
            return interfaceC9041qc2;
        }
        return X32.e(interfaceC9041qc2, interfaceC5809dQ, i, enumC7132iq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@NotNull InterfaceC4144Rn1<T> interfaceC4144Rn1, @NotNull HA0<? super T, ? extends T> ha0) {
        ?? r0;
        do {
            r0 = (Object) interfaceC4144Rn1.getValue();
        } while (!interfaceC4144Rn1.n(r0, ha0.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void f(@NotNull InterfaceC4144Rn1<T> interfaceC4144Rn1, @NotNull HA0<? super T, ? extends T> ha0) {
        Object obj;
        do {
            obj = (Object) interfaceC4144Rn1.getValue();
        } while (!interfaceC4144Rn1.n(obj, ha0.invoke(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g(@NotNull InterfaceC4144Rn1<T> interfaceC4144Rn1, @NotNull HA0<? super T, ? extends T> ha0) {
        Object obj;
        T invoke;
        do {
            obj = (Object) interfaceC4144Rn1.getValue();
            invoke = ha0.invoke(obj);
        } while (!interfaceC4144Rn1.n(obj, invoke));
        return invoke;
    }
}
