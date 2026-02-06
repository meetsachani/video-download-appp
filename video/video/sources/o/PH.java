package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class PH implements HM<Object> {
    @NotNull
    public static final PH X = new PH();

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
