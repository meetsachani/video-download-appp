package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public class MY1<T> extends AbstractC9384s0<T> implements InterfaceC10706xQ {
    @InterfaceC7058iW0
    @NotNull
    public final HM<T> Y0;

    /* JADX WARN: Multi-variable type inference failed */
    public MY1(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull HM<? super T> hm) {
        super(interfaceC5809dQ, true, true);
        this.Y0 = hm;
    }

    @Override // o.AbstractC9384s0
    public void O1(@Nullable Object obj) {
        HM<T> hm = this.Y0;
        hm.q(TH.a(obj, hm));
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public final StackTraceElement Y() {
        return null;
    }

    @Override // o.C6812hV0
    public final boolean f1() {
        return true;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public final InterfaceC10706xQ g() {
        HM<T> hm = this.Y0;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    @Override // o.C6812hV0
    public void s0(@Nullable Object obj) {
        C7432k40.d(C7048iT0.e(this.Y0), TH.a(obj, this.Y0));
    }
}
