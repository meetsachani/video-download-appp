package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,51:1\n1#2:52\n57#3,2:53\n57#3,2:55\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n11#1:53,2\n16#1:55,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TH {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull HM<? super T> hm) {
        if (obj instanceof QH) {
            PT1.a aVar = PT1.Y;
            return PT1.b(RT1.a(((QH) obj).a));
        }
        PT1.a aVar2 = PT1.Y;
        return PT1.b(obj);
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj) {
        Throwable e = PT1.e(obj);
        if (e == null) {
            return obj;
        }
        return new QH(e, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull InterfaceC8396ny<?> interfaceC8396ny) {
        Throwable e = PT1.e(obj);
        if (e == null) {
            return obj;
        }
        return new QH(e, false, 2, null);
    }
}
