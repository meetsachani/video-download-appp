package o;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@OT1
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public abstract class F02<T> {
    @Nullable
    public abstract Object b(T t, @NotNull HM<? super C7458kA2> hm);

    @Nullable
    public final Object c(@NotNull Iterable<? extends T> iterable, @NotNull HM<? super C7458kA2> hm) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return C7458kA2.a;
        }
        Object e = e(iterable.iterator(), hm);
        if (e == C7289jT0.l()) {
            return e;
        }
        return C7458kA2.a;
    }

    @Nullable
    public abstract Object e(@NotNull Iterator<? extends T> it, @NotNull HM<? super C7458kA2> hm);

    @Nullable
    public final Object f(@NotNull B02<? extends T> b02, @NotNull HM<? super C7458kA2> hm) {
        Object e = e(b02.iterator(), hm);
        if (e == C7289jT0.l()) {
            return e;
        }
        return C7458kA2.a;
    }
}
