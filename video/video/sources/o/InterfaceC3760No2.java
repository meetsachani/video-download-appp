package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.9")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* renamed from: o.No2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3760No2 {

    /* renamed from: o.No2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(@NotNull InterfaceC3760No2 interfaceC3760No2) {
            return Y70.S(interfaceC3760No2.e());
        }

        public static boolean b(@NotNull InterfaceC3760No2 interfaceC3760No2) {
            return !Y70.S(interfaceC3760No2.e());
        }

        @NotNull
        public static InterfaceC3760No2 c(@NotNull InterfaceC3760No2 interfaceC3760No2, long j) {
            return interfaceC3760No2.a0(Y70.l0(j));
        }

        @NotNull
        public static InterfaceC3760No2 d(@NotNull InterfaceC3760No2 interfaceC3760No2, long j) {
            return new C10141v7(interfaceC3760No2, j, null);
        }
    }

    @NotNull
    InterfaceC3760No2 a0(long j);

    long e();

    boolean g();

    boolean h();

    @NotNull
    InterfaceC3760No2 m0(long j);
}
