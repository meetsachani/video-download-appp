package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.ty  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9861ty<T> implements InterfaceC9618sy<T> {
    @NotNull
    public final InterfaceC3882Ov0<T> X;

    @InterfaceC8303na2({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,281:1\n326#2:282\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n270#1:282\n*E\n"})
    /* renamed from: o.ty$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ InterfaceC4076Qv0<T> X;

        @FV(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {271}, m = "emit", n = {}, s = {})
        /* renamed from: o.ty$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0344a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ a<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0344a(a<? super T> aVar, HM<? super C0344a> hm) {
                super(hm);
                this.Z0 = aVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = interfaceC4076Qv0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            C0344a c0344a;
            int i;
            if (hm instanceof C0344a) {
                c0344a = (C0344a) hm;
                int i2 = c0344a.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0344a.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = c0344a.Y0;
                    Object l = C7289jT0.l();
                    i = c0344a.a1;
                    if (i == 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        C5829dV0.y(c0344a.getContext());
                        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.X;
                        c0344a.a1 = 1;
                        if (interfaceC4076Qv0.c(t, c0344a) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            c0344a = new C0344a(this, hm);
            Object obj2 = c0344a.Y0;
            Object l2 = C7289jT0.l();
            i = c0344a.a1;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9861ty(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        this.X = interfaceC3882Ov0;
    }

    @Override // o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        Object a2 = this.X.a(new a(interfaceC4076Qv0), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }
}
