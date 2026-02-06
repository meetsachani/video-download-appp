package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.qX1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9023qX1 {
    @NotNull
    public static final XA0<InterfaceC4076Qv0<Object>, Object, HM<? super C7458kA2>, Object> a;

    /* renamed from: o.qX1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C7964mB0 implements XA0<InterfaceC4076Qv0<? super Object>, Object, HM<? super C7458kA2>, Object>, InterfaceC4028Qi2 {
        public static final a e1 = new a();

        public a() {
            super(3, InterfaceC4076Qv0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(InterfaceC4076Qv0<Object> interfaceC4076Qv0, Object obj, HM<? super C7458kA2> hm) {
            return interfaceC4076Qv0.c(obj, hm);
        }
    }

    static {
        a aVar = a.e1;
        C6562gT0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        a = (XA0) C11313zv2.q(aVar, 3);
    }

    public static final /* synthetic */ XA0 a() {
        return a;
    }

    public static /* synthetic */ void b() {
    }
}
