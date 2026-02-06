package o;

import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Pc0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3905Pc0 {
    @NotNull
    public static final a a = a.a;

    /* renamed from: o.Pc0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        @Nullable
        public static InterfaceC3905Pc0 b;

        @Nullable
        public final InterfaceC3905Pc0 a() {
            return b;
        }

        public final void b(@Nullable InterfaceC3905Pc0 interfaceC3905Pc0) {
            b = interfaceC3905Pc0;
        }
    }

    boolean a(@NotNull String str, @NotNull PrintWriter printWriter, @Nullable String[] strArr);
}
