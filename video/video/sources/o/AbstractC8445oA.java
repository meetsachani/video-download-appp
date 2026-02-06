package o;

import o.LM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.oA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8445oA<S, T> extends AbstractC7455kA<T> {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC3882Ov0<S> Y0;

    @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {DE.g}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.oA$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ AbstractC8445oA<S, T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8445oA<S, T> abstractC8445oA, HM<? super a> hm) {
            super(2, hm);
            this.b1 = abstractC8445oA;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                AbstractC8445oA<S, T> abstractC8445oA = this.b1;
                this.Z0 = 1;
                if (abstractC8445oA.u((InterfaceC4076Qv0) this.a1, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC8445oA(@NotNull InterfaceC3882Ov0<? extends S> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC5809dQ, i, enumC7132iq);
        this.Y0 = interfaceC3882Ov0;
    }

    public static /* synthetic */ <S, T> Object r(AbstractC8445oA<S, T> abstractC8445oA, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
        if (abstractC8445oA.Y == -3) {
            InterfaceC5809dQ context = hm.getContext();
            InterfaceC5809dQ j = C7035iQ.j(context, abstractC8445oA.X);
            if (C6562gT0.g(j, context)) {
                Object u = abstractC8445oA.u(interfaceC4076Qv0, hm);
                if (u == C7289jT0.l()) {
                    return u;
                }
                return C7458kA2.a;
            }
            LM.b bVar = LM.y;
            if (C6562gT0.g(j.f(bVar), context.f(bVar))) {
                Object t = abstractC8445oA.t(interfaceC4076Qv0, j, hm);
                if (t == C7289jT0.l()) {
                    return t;
                }
                return C7458kA2.a;
            }
        }
        Object a2 = super.a(interfaceC4076Qv0, hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    public static /* synthetic */ <S, T> Object s(AbstractC8445oA<S, T> abstractC8445oA, AI1<? super T> ai1, HM<? super C7458kA2> hm) {
        Object u = abstractC8445oA.u(new C10848y02(ai1), hm);
        if (u == C7289jT0.l()) {
            return u;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA, o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        return r(this, interfaceC4076Qv0, hm);
    }

    @Override // o.AbstractC7455kA
    @Nullable
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        return s(this, ai1, hm);
    }

    public final Object t(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, InterfaceC5809dQ interfaceC5809dQ, HM<? super C7458kA2> hm) {
        return C7959mA.d(interfaceC5809dQ, C7959mA.a(interfaceC4076Qv0, hm.getContext()), null, new a(this, null), hm, 4, null);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public String toString() {
        return this.Y0 + B8.d + super.toString();
    }

    @Nullable
    public abstract Object u(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm);
}
