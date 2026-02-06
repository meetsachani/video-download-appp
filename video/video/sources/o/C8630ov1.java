package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.ov1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8630ov1 {
    public static final <E> void a(@NotNull HA0<? super E, C7458kA2> ha0, E e, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        Iz2 b = b(ha0, e, null);
        if (b != null) {
            C8753pQ.b(interfaceC5809dQ, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> Iz2 b(@NotNull HA0<? super E, C7458kA2> ha0, E e, @Nullable Iz2 iz2) {
        try {
            ha0.invoke(e);
            return iz2;
        } catch (Throwable th) {
            if (iz2 != null && iz2.getCause() != th) {
                C3917Pf0.a(iz2, th);
                return iz2;
            }
            return new Iz2("Exception in undelivered element handler for " + e, th);
        }
    }

    public static /* synthetic */ Iz2 c(HA0 ha0, Object obj, Iz2 iz2, int i, Object obj2) {
        if ((i & 2) != 0) {
            iz2 = null;
        }
        return b(ha0, obj, iz2);
    }
}
