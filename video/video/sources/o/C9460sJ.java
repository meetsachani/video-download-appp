package o;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.sJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9460sJ {
    @NotNull
    public static final <E> Set<E> c(int i) {
        return Collections.newSetFromMap(new IdentityHashMap(i));
    }

    public static final <T> T d(@NotNull ReentrantLock reentrantLock, @NotNull FA0<? extends T> fa0) {
        reentrantLock.lock();
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            reentrantLock.unlock();
            UP0.c(1);
        }
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }
}
