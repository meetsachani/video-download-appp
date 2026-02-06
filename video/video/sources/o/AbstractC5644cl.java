package o;

import java.io.Serializable;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.cl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5644cl implements HM<Object>, InterfaceC10706xQ, Serializable {
    @Nullable
    public final HM<Object> X;

    public AbstractC5644cl(@Nullable HM<Object> hm) {
        this.X = hm;
    }

    @Nullable
    public final HM<Object> A() {
        return this.X;
    }

    @Nullable
    public abstract Object F(@NotNull Object obj);

    @Override // o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return GV.e(this);
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<Object> hm = this.X;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.HM
    public final void q(@NotNull Object obj) {
        Object F;
        HM hm = this;
        while (true) {
            MV.b(hm);
            AbstractC5644cl abstractC5644cl = (AbstractC5644cl) hm;
            HM hm2 = abstractC5644cl.X;
            C6562gT0.m(hm2);
            try {
                F = abstractC5644cl.F(obj);
            } catch (Throwable th) {
                PT1.a aVar = PT1.Y;
                obj = PT1.b(RT1.a(th));
            }
            if (F == C7289jT0.l()) {
                return;
            }
            PT1.a aVar2 = PT1.Y;
            obj = PT1.b(F);
            abstractC5644cl.H();
            if (hm2 instanceof AbstractC5644cl) {
                hm = hm2;
            } else {
                hm2.q(obj);
                return;
            }
        }
    }

    @NotNull
    public HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
        C6562gT0.p(hm, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object Y = Y();
        if (Y == null) {
            Y = getClass().getName();
        }
        sb.append(Y);
        return sb.toString();
    }

    @NotNull
    public HM<C7458kA2> u(@NotNull HM<?> hm) {
        C6562gT0.p(hm, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public void H() {
    }
}
