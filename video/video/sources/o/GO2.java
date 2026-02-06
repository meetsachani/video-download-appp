package o;

import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class GO2 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        byte[] bytes = str.getBytes(HB.b);
        C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "<this>");
        return new String(bArr, HB.b);
    }

    public static final <T> T d(@NotNull ReentrantLock reentrantLock, @NotNull FA0<? extends T> fa0) {
        C6562gT0.p(reentrantLock, "<this>");
        C6562gT0.p(fa0, "action");
        reentrantLock.lock();
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            reentrantLock.unlock();
            UP0.c(1);
        }
    }
}
