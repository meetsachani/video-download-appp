package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* renamed from: o.An2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2472An2 {
    @NotNull
    public static final C2472An2 a = new C2472An2();
    @NotNull
    public static final ThreadLocal<AbstractC3327Je0> b = C2668Cn2.b(new C7592kj2("ThreadLocalEventLoop"));

    @Nullable
    public final AbstractC3327Je0 a() {
        return b.get();
    }

    @NotNull
    public final AbstractC3327Je0 b() {
        ThreadLocal<AbstractC3327Je0> threadLocal = b;
        AbstractC3327Je0 abstractC3327Je0 = threadLocal.get();
        if (abstractC3327Je0 == null) {
            AbstractC3327Je0 a2 = C3620Me0.a();
            threadLocal.set(a2);
            return a2;
        }
        return abstractC3327Je0;
    }

    public final void c() {
        b.set(null);
    }

    public final void d(@NotNull AbstractC3327Je0 abstractC3327Je0) {
        b.set(abstractC3327Je0);
    }
}
