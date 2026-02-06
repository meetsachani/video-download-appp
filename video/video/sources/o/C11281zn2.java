package o;

import o.InterfaceC5809dQ;
import o.InterfaceC9577sn2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.zn2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11281zn2<T> implements InterfaceC9577sn2<T> {
    public final T X;
    @NotNull
    public final ThreadLocal<T> Y;
    @NotNull
    public final InterfaceC5809dQ.c<?> Z;

    public C11281zn2(T t, @NotNull ThreadLocal<T> threadLocal) {
        this.X = t;
        this.Y = threadLocal;
        this.Z = new C2570Bn2(threadLocal);
    }

    @Override // o.InterfaceC9577sn2
    public void G(@NotNull InterfaceC5809dQ interfaceC5809dQ, T t) {
        this.Y.set(t);
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return InterfaceC9577sn2.a.d(this, interfaceC5809dQ);
    }

    @Override // o.InterfaceC9577sn2
    public T c0(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        T t = this.Y.get();
        this.Y.set(this.X);
        return t;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        if (C6562gT0.g(getKey(), cVar)) {
            C6562gT0.n(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // o.InterfaceC5809dQ.b
    @NotNull
    public InterfaceC5809dQ.c<?> getKey() {
        return this.Z;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        if (C6562gT0.g(getKey(), cVar)) {
            return C3897Pa0.X;
        }
        return this;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        return (R) InterfaceC9577sn2.a.a(this, r, va0);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.X + ", threadLocal = " + this.Y + ')';
    }
}
