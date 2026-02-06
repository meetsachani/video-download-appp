package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
/* loaded from: classes4.dex */
public final class QZ0 {
    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    @NotNull
    public static final AbstractC7762lQ b(@NotNull AbstractC7762lQ abstractC7762lQ, @Nullable String str) {
        if (str != null) {
            return new C10555wo1(abstractC7762lQ, str);
        }
        return abstractC7762lQ;
    }
}
