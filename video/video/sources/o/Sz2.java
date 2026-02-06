package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Sz2 implements InterfaceC5809dQ.b, InterfaceC5809dQ.c<Sz2> {
    @NotNull
    public static final Sz2 X = new Sz2();

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return InterfaceC5809dQ.b.a.d(this, interfaceC5809dQ);
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        return (E) InterfaceC5809dQ.b.a.b(this, cVar);
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        return InterfaceC5809dQ.b.a.c(this, cVar);
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        return (R) InterfaceC5809dQ.b.a.a(this, r, va0);
    }

    @Override // o.InterfaceC5809dQ.b
    @NotNull
    public InterfaceC5809dQ.c<?> getKey() {
        return this;
    }
}
