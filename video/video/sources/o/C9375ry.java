package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
/* renamed from: o.ry  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9375ry {
    @InterfaceC10472wS0
    public static final void a(@NotNull InterfaceC8396ny<?> interfaceC8396ny, @NotNull B40 b40) {
        c(interfaceC8396ny, new C40(b40));
    }

    @NotNull
    public static final <T> C8883py<T> b(@NotNull HM<? super T> hm) {
        if (!(hm instanceof C7189j40)) {
            return new C8883py<>(hm, 1);
        }
        C8883py<T> m = ((C7189j40) hm).m();
        if (m != null) {
            if (!m.W()) {
                m = null;
            }
            if (m != null) {
                return m;
            }
        }
        return new C8883py<>(hm, 2);
    }

    public static final <T> void c(@NotNull InterfaceC8396ny<? super T> interfaceC8396ny, @NotNull InterfaceC7406jy interfaceC7406jy) {
        if (interfaceC8396ny instanceof C8883py) {
            ((C8883py) interfaceC8396ny).O(interfaceC7406jy);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    @Nullable
    public static final <T> Object d(@NotNull HA0<? super InterfaceC8396ny<? super T>, C7458kA2> ha0, @NotNull HM<? super T> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        ha0.invoke(c8883py);
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    public static final <T> Object e(HA0<? super InterfaceC8396ny<? super T>, C7458kA2> ha0, HM<? super T> hm) {
        UP0.e(0);
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        ha0.invoke(c8883py);
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        UP0.e(1);
        return A;
    }

    @Nullable
    public static final <T> Object f(@NotNull HA0<? super C8883py<? super T>, C7458kA2> ha0, @NotNull HM<? super T> hm) {
        C8883py b = b(C7048iT0.e(hm));
        try {
            ha0.invoke(b);
            Object A = b.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        } catch (Throwable th) {
            b.V();
            throw th;
        }
    }

    public static final <T> Object g(HA0<? super C8883py<? super T>, C7458kA2> ha0, HM<? super T> hm) {
        UP0.e(0);
        C8883py b = b(C7048iT0.e(hm));
        try {
            ha0.invoke(b);
            Object A = b.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            UP0.e(1);
            return A;
        } catch (Throwable th) {
            b.V();
            throw th;
        }
    }
}
