package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Hz2 extends AbstractC7762lQ {
    @NotNull
    public static final Hz2 Z = new Hz2();

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        C6544gO2 c6544gO2 = (C6544gO2) interfaceC5809dQ.f(C6544gO2.Z);
        if (c6544gO2 != null) {
            c6544gO2.Y = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // o.AbstractC7762lQ
    public boolean U(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return false;
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
