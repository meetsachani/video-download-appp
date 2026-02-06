package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class NO1<E> implements InterfaceC9220rJ2 {
    @InterfaceC7058iW0
    @NotNull
    public final C8883py<C10642xA<? extends E>> X;

    /* JADX WARN: Multi-variable type inference failed */
    public NO1(@NotNull C8883py<? super C10642xA<? extends E>> c8883py) {
        this.X = c8883py;
    }

    @Override // o.InterfaceC9220rJ2
    public void i(@NotNull QZ1<?> qz1, int i) {
        this.X.i(qz1, i);
    }
}
