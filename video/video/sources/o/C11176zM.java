package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.zM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11176zM implements InterfaceC9974uQ {
    @NotNull
    public final InterfaceC5809dQ X;

    public C11176zM(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.X = interfaceC5809dQ;
    }

    @Override // o.InterfaceC9974uQ
    @NotNull
    public InterfaceC5809dQ a0() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + a0() + ')';
    }
}
