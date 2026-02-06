package o;

import o.VB0;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Zv0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C4962Zv0 {
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ InterfaceC3882Ov0 a(InterfaceC3882Ov0 interfaceC3882Ov0, int i) {
        InterfaceC3882Ov0 d;
        d = d(interfaceC3882Ov0, i, null, 2, null);
        return d;
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i, @NotNull EnumC7132iq enumC7132iq) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        } else if (i == -1 && enumC7132iq != EnumC7132iq.X) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        } else {
            if (i == -1) {
                enumC7132iq = EnumC7132iq.Y;
                i = 0;
            }
            int i2 = i;
            EnumC7132iq enumC7132iq2 = enumC7132iq;
            if (interfaceC3882Ov0 instanceof VB0) {
                return VB0.a.a((VB0) interfaceC3882Ov0, null, i2, enumC7132iq2, 1, null);
            }
            return new C8689pA(interfaceC3882Ov0, null, i2, enumC7132iq2, 2, null);
        }
    }

    public static /* synthetic */ InterfaceC3882Ov0 c(InterfaceC3882Ov0 interfaceC3882Ov0, int i, int i2, Object obj) {
        InterfaceC3882Ov0 a;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        a = a(interfaceC3882Ov0, i);
        return a;
    }

    public static /* synthetic */ InterfaceC3882Ov0 d(InterfaceC3882Ov0 interfaceC3882Ov0, int i, EnumC7132iq enumC7132iq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC7132iq = EnumC7132iq.X;
        }
        return C4467Uv0.n(interfaceC3882Ov0, i, enumC7132iq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        if (interfaceC3882Ov0 instanceof InterfaceC9618sy) {
            return interfaceC3882Ov0;
        }
        return new C9861ty(interfaceC3882Ov0);
    }

    public static final void f(InterfaceC5809dQ interfaceC5809dQ) {
        if (interfaceC5809dQ.f(RU0.W) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC5809dQ).toString());
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        InterfaceC3882Ov0<T> d;
        d = d(interfaceC3882Ov0, -1, null, 2, null);
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        f(interfaceC5809dQ);
        if (C6562gT0.g(interfaceC5809dQ, C3897Pa0.X)) {
            return interfaceC3882Ov0;
        }
        if (interfaceC3882Ov0 instanceof VB0) {
            return VB0.a.a((VB0) interfaceC3882Ov0, interfaceC5809dQ, 0, null, 6, null);
        }
        return new C8689pA(interfaceC3882Ov0, interfaceC5809dQ, 0, null, 12, null);
    }
}
