package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
/* renamed from: o.t71  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9657t71 {
    @NotNull
    public static final String a = "kotlinx.coroutines.fast.service.loader";
    public static final boolean b = false;

    public static final C4810Yj1 a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        e();
        throw new SX0();
    }

    public static /* synthetic */ C4810Yj1 b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    @InterfaceC10472wS0
    public static final boolean d(@NotNull AbstractC8922q71 abstractC8922q71) {
        return abstractC8922q71.b0() instanceof C4810Yj1;
    }

    @NotNull
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @InterfaceC10472wS0
    @NotNull
    public static final AbstractC8922q71 f(@NotNull InterfaceC9171r71 interfaceC9171r71, @NotNull List<? extends InterfaceC9171r71> list) {
        try {
            return interfaceC9171r71.b(list);
        } catch (Throwable th) {
            return a(th, interfaceC9171r71.a());
        }
    }

    public static /* synthetic */ void c() {
    }
}
