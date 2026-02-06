package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class K10<T> extends AbstractC9384s0<T> implements J10<T> {
    public K10(@NotNull InterfaceC5809dQ interfaceC5809dQ, boolean z) {
        super(interfaceC5809dQ, true, z);
    }

    public static /* synthetic */ <T> Object T1(K10<T> k10, HM<? super T> hm) {
        Object t0 = k10.t0(hm);
        C7289jT0.l();
        return t0;
    }

    @Override // o.J10
    @NotNull
    public InterfaceC5223b02<T> P() {
        InterfaceC5223b02<T> interfaceC5223b02 = (InterfaceC5223b02<T>) O0();
        C6562gT0.n(interfaceC5223b02, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return interfaceC5223b02;
    }

    @Override // o.J10
    public T p() {
        return (T) I0();
    }

    @Override // o.J10
    @Nullable
    public Object v(@NotNull HM<? super T> hm) {
        return T1(this, hm);
    }
}
