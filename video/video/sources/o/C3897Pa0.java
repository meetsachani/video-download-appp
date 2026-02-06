package o;

import java.io.Serializable;
import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.Pa0 */
/* loaded from: classes3.dex */
public final class C3897Pa0 implements InterfaceC5809dQ, Serializable {
    @NotNull
    public static final C3897Pa0 X = new C3897Pa0();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return X;
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(interfaceC5809dQ, "context");
        return interfaceC5809dQ;
    }

    @Override // o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        C6562gT0.p(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        C6562gT0.p(cVar, "key");
        return this;
    }

    @Override // o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        return r;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
