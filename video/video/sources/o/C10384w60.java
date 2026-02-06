package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.w60  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10384w60 implements InterfaceC5809dQ {
    public final /* synthetic */ InterfaceC5809dQ X;
    @InterfaceC7058iW0
    @NotNull
    public final Throwable Y;

    public C10384w60(@NotNull Throwable th, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.X = interfaceC5809dQ;
        this.Y = th;
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return this.X.M(interfaceC5809dQ);
    }

    @Override // o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        return (E) this.X.f(cVar);
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        return this.X.j(cVar);
    }

    @Override // o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        return (R) this.X.m(r, va0);
    }
}
