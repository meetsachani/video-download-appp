package o;

import o.AbstractC7762lQ;
import o.InterfaceC5809dQ;
import o.LM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.lQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7762lQ extends AbstractC9627t0 implements LM {
    @NotNull
    public static final a Y = new a(null);

    @InterfaceC4912Zi0
    /* renamed from: o.lQ$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9870u0<LM, AbstractC7762lQ> {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static final AbstractC7762lQ d(InterfaceC5809dQ.b bVar) {
            if (bVar instanceof AbstractC7762lQ) {
                return (AbstractC7762lQ) bVar;
            }
            return null;
        }

        public a() {
            super(LM.y, new HA0() { // from class: o.kQ
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    AbstractC7762lQ d;
                    d = AbstractC7762lQ.a.d((InterfaceC5809dQ.b) obj);
                    return d;
                }
            });
        }
    }

    public AbstractC7762lQ() {
        super(LM.y);
    }

    public static /* synthetic */ AbstractC7762lQ Z(AbstractC7762lQ abstractC7762lQ, int i, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return abstractC7762lQ.W(i, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
    }

    @Override // o.LM
    @NotNull
    public final <T> HM<T> H(@NotNull HM<? super T> hm) {
        return new C7189j40(this, hm);
    }

    public abstract void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable);

    @InterfaceC10472wS0
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        I(interfaceC5809dQ, runnable);
    }

    public boolean U(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return true;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @IR1(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ AbstractC7762lQ V(int i) {
        return W(i, null);
    }

    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        return new PZ0(this, i, str);
    }

    @Override // o.AbstractC9627t0, o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        return (E) LM.a.b(this, cVar);
    }

    @Override // o.AbstractC9627t0, o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        return LM.a.c(this, cVar);
    }

    @Override // o.LM
    public final void s(@NotNull HM<?> hm) {
        C6562gT0.n(hm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C7189j40) hm).y();
    }

    @NotNull
    public String toString() {
        return NV.a(this) + C11304zt1.a + NV.b(this);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final AbstractC7762lQ a0(@NotNull AbstractC7762lQ abstractC7762lQ) {
        return abstractC7762lQ;
    }
}
