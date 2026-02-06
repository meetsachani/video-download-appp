package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.lA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7698lA<T> extends AbstractC7455kA<T> {
    @NotNull
    public final VA0<AI1<? super T>, HM<? super C7458kA2>, Object> Y0;

    public /* synthetic */ C7698lA(VA0 va0, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(va0, (i2 & 2) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    public static /* synthetic */ <T> Object q(C7698lA<T> c7698lA, AI1<? super T> ai1, HM<? super C7458kA2> hm) {
        Object i = c7698lA.Y0.i(ai1, hm);
        if (i == C7289jT0.l()) {
            return i;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA
    @Nullable
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        return q(this, ai1, hm);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C7698lA(this.Y0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public String toString() {
        return "block[" + this.Y0 + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7698lA(@NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC5809dQ, i, enumC7132iq);
        this.Y0 = va0;
    }
}
