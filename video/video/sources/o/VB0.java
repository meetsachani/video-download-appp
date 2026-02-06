package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC10472wS0
/* loaded from: classes4.dex */
public interface VB0<T> extends InterfaceC3882Ov0<T> {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC3882Ov0 a(VB0 vb0, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    interfaceC5809dQ = C3897Pa0.X;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    enumC7132iq = EnumC7132iq.X;
                }
                return vb0.d(interfaceC5809dQ, i, enumC7132iq);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    InterfaceC3882Ov0<T> d(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq);
}
