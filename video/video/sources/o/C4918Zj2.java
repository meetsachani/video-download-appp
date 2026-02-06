package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,29:1\n16#2:30\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n27#1:30\n*E\n"})
/* renamed from: o.Zj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4918Zj2 {
    @InterfaceC10472wS0
    public static final <T> T a(@NotNull Object obj, @NotNull FA0<? extends T> fa0) {
        T invoke;
        synchronized (obj) {
            try {
                invoke = fa0.invoke();
                UP0.d(1);
            } catch (Throwable th) {
                UP0.d(1);
                UP0.c(1);
                throw th;
            }
        }
        UP0.c(1);
        return invoke;
    }
}
