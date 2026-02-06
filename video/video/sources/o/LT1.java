package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public abstract class LT1 extends AbstractC5644cl {
    public LT1(@Nullable HM<Object> hm) {
        super(hm);
        if (hm == null || hm.getContext() == C3897Pa0.X) {
            return;
        }
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return C3897Pa0.X;
    }
}
