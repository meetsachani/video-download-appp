package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class IH<T> extends C6812hV0 implements HH<T> {
    public IH(@Nullable RU0 ru0) {
        super(true);
        b1(ru0);
    }

    @Override // o.HH
    public boolean C(T t) {
        return k1(t);
    }

    @Override // o.J10
    @NotNull
    public InterfaceC5223b02<T> P() {
        InterfaceC5223b02<T> interfaceC5223b02 = (InterfaceC5223b02<T>) O0();
        C6562gT0.n(interfaceC5223b02, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return interfaceC5223b02;
    }

    @Override // o.C6812hV0
    public boolean Q0() {
        return true;
    }

    @Override // o.HH
    public boolean k(@NotNull Throwable th) {
        return k1(new QH(th, false, 2, null));
    }

    @Override // o.J10
    public T p() {
        return (T) I0();
    }

    @Override // o.J10
    @Nullable
    public Object v(@NotNull HM<? super T> hm) {
        Object t0 = t0(hm);
        C7289jT0.l();
        return t0;
    }
}
