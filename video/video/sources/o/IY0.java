package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class IY0<E> extends C2477Ap<E> {
    @NotNull
    public final HM<C7458kA2> Z0;

    public IY0(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC10800xp<E> interfaceC10800xp, @NotNull VA0<? super AI1<? super E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        super(interfaceC5809dQ, interfaceC10800xp, false);
        this.Z0 = C7048iT0.c(va0, this, this);
    }

    @Override // o.C6812hV0
    public void v1() {
        C10104uy.c(this.Z0, this);
    }

    @Override // o.C2477Ap, o.InterfaceC10800xp
    @NotNull
    public OO1<E> z() {
        OO1<E> z = T1().z();
        start();
        return z;
    }
}
