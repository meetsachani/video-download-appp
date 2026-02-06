package o;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class BJ {
    public static final <T> T a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void c(@NotNull AtomicReference<T> atomicReference, @NotNull VA0<? super AtomicReference<T>, ? super T, C7458kA2> va0) {
        while (true) {
            va0.i(atomicReference, (Object) a(atomicReference));
        }
    }

    public static final <T> void d(@NotNull AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static /* synthetic */ void b(AtomicReference atomicReference) {
    }
}
