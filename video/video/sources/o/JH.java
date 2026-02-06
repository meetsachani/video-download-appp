package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
/* loaded from: classes3.dex */
public final class JH {
    @NotNull
    public static final <T> HH<T> a(T t) {
        IH ih = new IH(null);
        ih.C(t);
        return ih;
    }

    @NotNull
    public static final <T> HH<T> b(@Nullable RU0 ru0) {
        return new IH(ru0);
    }

    public static /* synthetic */ HH c(RU0 ru0, int i, Object obj) {
        if ((i & 1) != 0) {
            ru0 = null;
        }
        return b(ru0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@NotNull HH<T> hh, @NotNull Object obj) {
        Throwable e = PT1.e(obj);
        if (e == null) {
            return hh.C(obj);
        }
        return hh.k(e);
    }
}
