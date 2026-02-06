package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Ab2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2424Ab2<T> implements HM<T>, InterfaceC10706xQ {
    @NotNull
    public final HM<T> X;
    @NotNull
    public final InterfaceC5809dQ Y;

    /* JADX WARN: Multi-variable type inference failed */
    public C2424Ab2(@NotNull HM<? super T> hm, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.X = hm;
        this.Y = interfaceC5809dQ;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return null;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<T> hm = this.X;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return this.Y;
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        this.X.q(obj);
    }
}
