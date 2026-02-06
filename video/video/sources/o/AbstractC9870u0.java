package o;

import o.InterfaceC5809dQ;
import o.InterfaceC5809dQ.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4912Zi0
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.u0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9870u0<B extends InterfaceC5809dQ.b, E extends B> implements InterfaceC5809dQ.c<E> {
    @NotNull
    public final HA0<InterfaceC5809dQ.b, E> X;
    @NotNull
    public final InterfaceC5809dQ.c<?> Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.HA0<o.dQ$b, E extends B>, java.lang.Object, o.HA0<? super o.dQ$b, ? extends E extends B>] */
    public AbstractC9870u0(@NotNull InterfaceC5809dQ.c<B> cVar, @NotNull HA0<? super InterfaceC5809dQ.b, ? extends E> ha0) {
        C6562gT0.p(cVar, "baseKey");
        C6562gT0.p(ha0, "safeCast");
        this.X = ha0;
        this.Y = cVar instanceof AbstractC9870u0 ? (InterfaceC5809dQ.c<B>) ((AbstractC9870u0) cVar).Y : cVar;
    }

    public final boolean a(@NotNull InterfaceC5809dQ.c<?> cVar) {
        C6562gT0.p(cVar, "key");
        if (cVar != this && this.Y != cVar) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lo/dQ$b;)TE; */
    @Nullable
    public final InterfaceC5809dQ.b b(@NotNull InterfaceC5809dQ.b bVar) {
        C6562gT0.p(bVar, "element");
        return (InterfaceC5809dQ.b) this.X.invoke(bVar);
    }
}
