package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* renamed from: o.pX1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8780pX1<T> extends KM implements InterfaceC4076Qv0<T>, InterfaceC10706xQ {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC4076Qv0<T> Y0;
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC5809dQ Z0;
    @InterfaceC7058iW0
    public final int a1;
    @Nullable
    public InterfaceC5809dQ b1;
    @Nullable
    public HM<? super C7458kA2> c1;

    /* JADX WARN: Multi-variable type inference failed */
    public C8780pX1(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        super(C3082Gq1.X, C3897Pa0.X);
        this.Y0 = interfaceC4076Qv0;
        this.Z0 = interfaceC5809dQ;
        this.a1 = ((Number) interfaceC5809dQ.m(0, new VA0() { // from class: o.oX1
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                int k0;
                k0 = C8780pX1.k0(((Integer) obj).intValue(), (InterfaceC5809dQ.b) obj2);
                return Integer.valueOf(k0);
            }
        })).intValue();
    }

    public static final int k0(int i, InterfaceC5809dQ.b bVar) {
        return i + 1;
    }

    @Override // o.AbstractC5644cl
    @NotNull
    public Object F(@NotNull Object obj) {
        Throwable e = PT1.e(obj);
        if (e != null) {
            this.b1 = new C10384w60(e, getContext());
        }
        HM<? super C7458kA2> hm = this.c1;
        if (hm != null) {
            hm.q(obj);
        }
        return C7289jT0.l();
    }

    @Override // o.KM, o.AbstractC5644cl
    public void H() {
        super.H();
    }

    public final void V(InterfaceC5809dQ interfaceC5809dQ, InterfaceC5809dQ interfaceC5809dQ2, T t) {
        if (interfaceC5809dQ2 instanceof C10384w60) {
            m0((C10384w60) interfaceC5809dQ2, t);
        }
        C9515sX1.b(this, interfaceC5809dQ);
    }

    @Override // o.AbstractC5644cl, o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return null;
    }

    @Override // o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        try {
            Object l0 = l0(hm, t);
            if (l0 == C7289jT0.l()) {
                MV.c(hm);
            }
            if (l0 == C7289jT0.l()) {
                return l0;
            }
            return C7458kA2.a;
        } catch (Throwable th) {
            this.b1 = new C10384w60(th, hm.getContext());
            throw th;
        }
    }

    @Override // o.AbstractC5644cl, o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<? super C7458kA2> hm = this.c1;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    @Override // o.KM, o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        InterfaceC5809dQ interfaceC5809dQ = this.b1;
        if (interfaceC5809dQ == null) {
            return C3897Pa0.X;
        }
        return interfaceC5809dQ;
    }

    public final Object l0(HM<? super C7458kA2> hm, T t) {
        InterfaceC5809dQ context = hm.getContext();
        C5829dV0.y(context);
        InterfaceC5809dQ interfaceC5809dQ = this.b1;
        if (interfaceC5809dQ != context) {
            V(context, interfaceC5809dQ, t);
            this.b1 = context;
        }
        this.c1 = hm;
        XA0 a = C9023qX1.a();
        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Y0;
        C6562gT0.n(interfaceC4076Qv0, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C6562gT0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object P = a.P(interfaceC4076Qv0, t, this);
        if (!C6562gT0.g(P, C7289jT0.l())) {
            this.c1 = null;
        }
        return P;
    }

    public final void m0(C10384w60 c10384w60, Object obj) {
        throw new IllegalStateException(C7819lf2.v("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c10384w60.Y + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
