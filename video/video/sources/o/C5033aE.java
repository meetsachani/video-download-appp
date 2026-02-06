package o;

import java.io.Closeable;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "CloseableKt")
/* renamed from: o.aE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5033aE {
    @HK1
    @InterfaceC6480g82(version = "1.1")
    public static final void a(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C3917Pf0.a(th, th2);
            }
        }
    }

    @XP0
    public static final <T extends Closeable, R> R b(T t, HA0<? super T, ? extends R> ha0) {
        C6562gT0.p(ha0, "block");
        try {
            R invoke = ha0.invoke(t);
            UP0.d(1);
            a(t, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }
}
