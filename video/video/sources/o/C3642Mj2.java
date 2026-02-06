package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.Mj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3642Mj2 {
    @InterfaceC10472wS0
    public static final <T> T b(@NotNull Object obj, @NotNull FA0<? extends T> fa0) {
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

    @InterfaceC10472wS0
    public static /* synthetic */ void a() {
    }
}
