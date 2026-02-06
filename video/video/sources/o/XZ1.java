package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface XZ1<R> {

    /* loaded from: classes4.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@NotNull XZ1<? super R> xz1, @NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
            xz1.c(interfaceC5708d02, null, va0);
        }

        @InterfaceC2951Fi0
        @R61
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Replaced with the same extension function", replaceWith = @IR1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        public static <R> void b(@NotNull XZ1<? super R> xz1, long j, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0) {
            C8143mv1.a(xz1, j, ha0);
        }
    }

    <P, Q> void a(@NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0);

    @InterfaceC2951Fi0
    @R61
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Replaced with the same extension function", replaceWith = @IR1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    void b(long j, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0);

    <P, Q> void c(@NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, P p, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0);

    void g(@NotNull ZZ1 zz1, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0);

    <Q> void j(@NotNull InterfaceC5223b02<? extends Q> interfaceC5223b02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0);
}
