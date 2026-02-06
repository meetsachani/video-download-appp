package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public abstract class KM extends AbstractC5644cl {
    @Nullable
    public final InterfaceC5809dQ Y;
    @Nullable
    public transient HM<Object> Z;

    public KM(@Nullable HM<Object> hm, @Nullable InterfaceC5809dQ interfaceC5809dQ) {
        super(hm);
        this.Y = interfaceC5809dQ;
    }

    @Override // o.AbstractC5644cl
    public void H() {
        HM<?> hm = this.Z;
        if (hm != null && hm != this) {
            InterfaceC5809dQ.b f = getContext().f(LM.y);
            C6562gT0.m(f);
            ((LM) f).s(hm);
        }
        this.Z = PH.X;
    }

    @NotNull
    public final HM<Object> O() {
        HM<Object> hm = this.Z;
        if (hm == null) {
            LM lm = (LM) getContext().f(LM.y);
            if (lm == null || (hm = lm.H(this)) == null) {
                hm = this;
            }
            this.Z = hm;
        }
        return hm;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        InterfaceC5809dQ interfaceC5809dQ = this.Y;
        C6562gT0.m(interfaceC5809dQ);
        return interfaceC5809dQ;
    }

    public KM(@Nullable HM<Object> hm) {
        this(hm, hm != null ? hm.getContext() : null);
    }
}
