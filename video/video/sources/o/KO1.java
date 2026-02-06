package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class KO1<T> implements InterfaceC9041qc2<T>, InterfaceC9618sy<T>, VB0<T> {
    public final /* synthetic */ InterfaceC9041qc2<T> X;
    @Nullable
    public final RU0 Y;

    /* JADX WARN: Multi-variable type inference failed */
    public KO1(@NotNull InterfaceC9041qc2<? extends T> interfaceC9041qc2, @Nullable RU0 ru0) {
        this.X = interfaceC9041qc2;
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
        return C9533sc2.d(this, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.InterfaceC9041qc2
    public T getValue() {
        return this.X.getValue();
    }
}
