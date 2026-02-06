package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.jy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7406jy extends InterfaceC8857pr1 {

    /* renamed from: o.jy$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7406jy {
        @NotNull
        public final HA0<Throwable, C7458kA2> X;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
            this.X = ha0;
        }

        @Override // o.InterfaceC7406jy
        public void d(@Nullable Throwable th) {
            this.X.invoke(th);
        }

        @NotNull
        public String toString() {
            return "CancelHandler.UserSupplied[" + NV.a(this.X) + C11304zt1.a + NV.b(this) + ']';
        }
    }

    void d(@Nullable Throwable th);
}
