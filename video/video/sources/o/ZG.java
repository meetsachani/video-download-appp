package o;

import o.InterfaceC3760No2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* loaded from: classes3.dex */
public interface ZG extends InterfaceC3760No2, Comparable<ZG> {

    /* loaded from: classes3.dex */
    public static final class a {
        public static int a(@NotNull ZG zg, @NotNull ZG zg2) {
            C6562gT0.p(zg2, "other");
            return Y70.n(zg.E0(zg2), Y70.Y.T());
        }

        public static boolean b(@NotNull ZG zg) {
            return InterfaceC3760No2.a.a(zg);
        }

        public static boolean c(@NotNull ZG zg) {
            return InterfaceC3760No2.a.b(zg);
        }

        @NotNull
        public static ZG d(@NotNull ZG zg, long j) {
            return zg.a0(Y70.l0(j));
        }
    }

    long E0(@NotNull ZG zg);

    int H0(@NotNull ZG zg);

    @Override // o.InterfaceC3760No2
    @NotNull
    ZG a0(long j);

    boolean equals(@Nullable Object obj);

    int hashCode();

    @Override // o.InterfaceC3760No2
    @NotNull
    ZG m0(long j);
}
