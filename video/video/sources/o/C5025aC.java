package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.aC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5025aC extends AbstractC6569gV0 implements ZB {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC5268bC Z0;

    public C5025aC(@NotNull InterfaceC5268bC interfaceC5268bC) {
        this.Z0 = interfaceC5268bC;
    }

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return true;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        this.Z0.N(D());
    }

    @Override // o.ZB
    public boolean g(@NotNull Throwable th) {
        return D().B0(th);
    }

    @Override // o.ZB
    @NotNull
    public RU0 getParent() {
        return D();
    }
}
