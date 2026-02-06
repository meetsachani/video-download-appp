package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n262#1:285\n1#2:286\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n283#1:285\n*E\n"})
/* renamed from: o.tn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9820tn2 {
    @NotNull
    public static final <T> InterfaceC9577sn2<T> a(@NotNull ThreadLocal<T> threadLocal, T t) {
        return new C11281zn2(t, threadLocal);
    }

    public static /* synthetic */ InterfaceC9577sn2 b(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @Nullable
    public static final Object c(@NotNull ThreadLocal<?> threadLocal, @NotNull HM<? super C7458kA2> hm) {
        if (hm.getContext().f(new C2570Bn2(threadLocal)) != null) {
            return C7458kA2.a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + hm.getContext()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, HM<? super C7458kA2> hm) {
        UP0.e(3);
        throw null;
    }

    @Nullable
    public static final Object e(@NotNull ThreadLocal<?> threadLocal, @NotNull HM<? super Boolean> hm) {
        boolean z;
        if (hm.getContext().f(new C2570Bn2(threadLocal)) != null) {
            z = true;
        } else {
            z = false;
        }
        return C10557wp.a(z);
    }

    public static final Object f(ThreadLocal<?> threadLocal, HM<? super Boolean> hm) {
        UP0.e(3);
        throw null;
    }
}
