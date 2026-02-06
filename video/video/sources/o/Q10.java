package o;

import o.O10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10472wS0
/* loaded from: classes3.dex */
public interface Q10 extends O10 {

    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull Q10 q10, long j, @NotNull HM<? super C7458kA2> hm) {
            Object a = O10.a.a(q10, j, hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }

        @NotNull
        public static B40 b(@NotNull Q10 q10, long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return O10.a.b(q10, j, runnable, interfaceC5809dQ);
        }
    }

    @NotNull
    String q(long j);
}
