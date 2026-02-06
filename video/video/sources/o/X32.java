package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
/* loaded from: classes4.dex */
public final class X32 {
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 a = new C7592kj2("NO_VALUE");

    @NotNull
    public static final <T> InterfaceC3950Pn1<T> a(int i, int i2, @NotNull EnumC7132iq enumC7132iq) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && enumC7132iq != EnumC7132iq.X) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC7132iq).toString());
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new W32(i, i3, enumC7132iq);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    public static /* synthetic */ InterfaceC3950Pn1 b(int i, int i2, EnumC7132iq enumC7132iq, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC7132iq = EnumC7132iq.X;
        }
        return a(i, i2, enumC7132iq);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j) {
        return f(objArr, j);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j, Object obj) {
        g(objArr, j, obj);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull V32<? extends T> v32, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        if ((i == 0 || i == -3) && enumC7132iq == EnumC7132iq.X) {
            return v32;
        }
        return new C8689pA(v32, interfaceC5809dQ, i, enumC7132iq);
    }

    public static final Object f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
