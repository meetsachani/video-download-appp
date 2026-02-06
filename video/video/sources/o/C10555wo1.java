package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.wo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10555wo1 extends AbstractC7762lQ implements O10 {
    @NotNull
    public final AbstractC7762lQ Y0;
    public final /* synthetic */ O10 Z;
    @NotNull
    public final String Z0;

    public C10555wo1(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull String str) {
        O10 o10;
        if (abstractC7762lQ instanceof O10) {
            o10 = (O10) abstractC7762lQ;
        } else {
            o10 = null;
        }
        this.Z = o10 == null ? UY.a() : o10;
        this.Y0 = abstractC7762lQ;
        this.Z0 = str;
    }

    @Override // o.O10
    public void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        this.Z.E(j, interfaceC8396ny);
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        this.Y0.I(interfaceC5809dQ, runnable);
    }

    @Override // o.AbstractC7762lQ
    @InterfaceC10472wS0
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        this.Y0.R(interfaceC5809dQ, runnable);
    }

    @Override // o.AbstractC7762lQ
    public boolean U(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return this.Y0.U(interfaceC5809dQ);
    }

    @Override // o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return this.Z.o(j, runnable, interfaceC5809dQ);
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        return this.Z0;
    }

    @Override // o.O10
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object z(long j, @NotNull HM<? super C7458kA2> hm) {
        return this.Z.z(j, hm);
    }
}
