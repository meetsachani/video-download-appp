package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.t6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9651t6 {
    @InterfaceC3681Mt1
    @NotNull
    public static final <E> InterfaceC10362w02<E> a(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC10949yQ enumC10949yQ, @Nullable HA0<? super Throwable, C7458kA2> ha0, @NotNull VA0<? super InterfaceC9894u6<E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C9408s6 c9408s6;
        InterfaceC5809dQ k = C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ);
        InterfaceC6728hA d = C9424sA.d(i, null, null, 6, null);
        if (enumC10949yQ.i()) {
            c9408s6 = new GY0(k, d, va0);
        } else {
            c9408s6 = new C9408s6(k, d, true);
        }
        if (ha0 != null) {
            ((C6812hV0) c9408s6).i0(ha0);
        }
        ((AbstractC9384s0) c9408s6).S1(enumC10949yQ, c9408s6, va0);
        return c9408s6;
    }

    public static /* synthetic */ InterfaceC10362w02 b(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC10949yQ enumC10949yQ, HA0 ha0, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        if ((i2 & 8) != 0) {
            ha0 = null;
        }
        EnumC10949yQ enumC10949yQ2 = enumC10949yQ;
        return a(interfaceC9974uQ, interfaceC5809dQ, i, enumC10949yQ2, ha0, va0);
    }
}
