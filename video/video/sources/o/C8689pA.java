package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.pA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8689pA<T> extends AbstractC8445oA<T, T> {
    public /* synthetic */ C8689pA(InterfaceC3882Ov0 interfaceC3882Ov0, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(interfaceC3882Ov0, (i2 & 2) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C8689pA(this.Y0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public InterfaceC3882Ov0<T> j() {
        return (InterfaceC3882Ov0<T>) this.Y0;
    }

    @Override // o.AbstractC8445oA
    @Nullable
    public Object u(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        Object a = this.Y0.a(interfaceC4076Qv0, hm);
        if (a == C7289jT0.l()) {
            return a;
        }
        return C7458kA2.a;
    }

    public C8689pA(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC3882Ov0, interfaceC5809dQ, i, enumC7132iq);
    }
}
