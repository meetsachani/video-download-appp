package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC2842Ei0
@RM
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public interface PM {

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC4363Tt a(PM pm, InterfaceC5022aB0 interfaceC5022aB0, EnumC10962yT0 enumC10962yT0, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    enumC10962yT0 = EnumC10962yT0.Y0;
                }
                return pm.a(interfaceC5022aB0, enumC10962yT0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @RM
    @NotNull
    <R> InterfaceC4363Tt a(@NotNull InterfaceC5022aB0<? extends R> interfaceC5022aB0, @NotNull EnumC10962yT0 enumC10962yT0);

    @RM
    @NotNull
    InterfaceC9263rU1 b();

    @RM
    @NotNull
    InterfaceC9263rU1 c(@Nullable Object obj);

    @RM
    @NotNull
    InterfaceC9749tU1 d();
}
