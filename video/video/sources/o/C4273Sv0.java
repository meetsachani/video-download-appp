package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
/* renamed from: o.Sv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4273Sv0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,108:1\n47#2,2:109\n*E\n"})
    /* renamed from: o.Sv0$a */
    /* loaded from: classes4.dex */
    public static final class a<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ XA0 X;

        public a(XA0 xa0) {
            this.X = xa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = C4273Sv0.a(new b(this.X, interfaceC4076Qv0, null), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.Sv0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ XA0<InterfaceC9974uQ, InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> b1;
        public final /* synthetic */ InterfaceC4076Qv0<R> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(XA0<? super InterfaceC9974uQ, ? super InterfaceC4076Qv0<? super R>, ? super HM<? super C7458kA2>, ? extends Object> xa0, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super b> hm) {
            super(2, hm);
            this.b1 = xa0;
            this.c1 = interfaceC4076Qv0;
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
                XA0<InterfaceC9974uQ, InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> xa0 = this.b1;
                Object obj2 = this.c1;
                this.Z0 = 1;
                if (xa0.P((InterfaceC9974uQ) this.a1, obj2, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, this.c1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    @Nullable
    public static final <R> Object a(@InterfaceC5183ar @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super R>, ? extends Object> va0, @NotNull HM<? super R> hm) {
        C4173Rv0 c4173Rv0 = new C4173Rv0(hm.getContext(), hm);
        Object b2 = Rz2.b(c4173Rv0, c4173Rv0, va0);
        if (b2 == C7289jT0.l()) {
            MV.c(hm);
        }
        return b2;
    }

    @NotNull
    public static final <R> InterfaceC3882Ov0<R> b(@InterfaceC5183ar @NotNull XA0<? super InterfaceC9974uQ, ? super InterfaceC4076Qv0<? super R>, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return new a(xa0);
    }
}
