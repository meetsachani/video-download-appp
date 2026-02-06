package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10472wS0
/* renamed from: o.y02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10848y02<T> implements InterfaceC4076Qv0<T> {
    @NotNull
    public final InterfaceC10362w02<T> X;

    /* JADX WARN: Multi-variable type inference failed */
    public C10848y02(@NotNull InterfaceC10362w02<? super T> interfaceC10362w02) {
        this.X = interfaceC10362w02;
    }

    @Override // o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        Object d0 = this.X.d0(t, hm);
        if (d0 == C7289jT0.l()) {
            return d0;
        }
        return C7458kA2.a;
    }
}
