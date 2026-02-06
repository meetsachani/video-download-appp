package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class JO1<T> implements V32<T>, InterfaceC9618sy<T>, VB0<T> {
    public final /* synthetic */ V32<T> X;
    @Nullable
    public final RU0 Y;

    /* JADX WARN: Multi-variable type inference failed */
    public JO1(@NotNull V32<? extends T> v32, @Nullable RU0 ru0) {
        this.X = v32;
        this.Y = ru0;
    }

    @Override // o.V32, o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<?> hm) {
        return this.X.a(interfaceC4076Qv0, hm);
    }

    @Override // o.V32
    @NotNull
    public List<T> b() {
        return this.X.b();
    }

    @Override // o.VB0
    @NotNull
    public InterfaceC3882Ov0<T> d(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return X32.e(this, interfaceC5809dQ, i, enumC7132iq);
    }
}
