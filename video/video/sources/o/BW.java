package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class BW<T, R> extends AW<T, R> implements HM<R> {
    @NotNull
    public XA0<? super AW<?, ?>, Object, ? super HM<Object>, ? extends Object> X;
    @Nullable
    public Object Y;
    @NotNull
    public Object Y0;
    @Nullable
    public HM<Object> Z;

    @InterfaceC8303na2({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,71:1\n182#2,6:72\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a implements HM<Object> {
        public final /* synthetic */ InterfaceC5809dQ X;
        public final /* synthetic */ BW Y;
        public final /* synthetic */ HM Y0;
        public final /* synthetic */ XA0 Z;

        public a(InterfaceC5809dQ interfaceC5809dQ, BW bw, XA0 xa0, HM hm) {
            this.X = interfaceC5809dQ;
            this.Y = bw;
            this.Z = xa0;
            this.Y0 = hm;
        }

        @Override // o.HM
        public InterfaceC5809dQ getContext() {
            return this.X;
        }

        @Override // o.HM
        public void q(Object obj) {
            this.Y.X = this.Z;
            this.Y.Z = this.Y0;
            this.Y.Y0 = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BW(@NotNull XA0<? super AW<T, R>, ? super T, ? super HM<? super R>, ? extends Object> xa0, T t) {
        super(null);
        Object obj;
        C6562gT0.p(xa0, "block");
        this.X = xa0;
        this.Y = t;
        C6562gT0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.Z = this;
        obj = C11214zW.a;
        this.Y0 = obj;
    }

    @Override // o.AW
    @Nullable
    public Object a(T t, @NotNull HM<? super R> hm) {
        C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.Z = hm;
        this.Y = t;
        Object l = C7289jT0.l();
        if (l == C7289jT0.l()) {
            MV.c(hm);
        }
        return l;
    }

    @Override // o.AW
    @Nullable
    public <U, S> Object b(@NotNull C10971yW<U, S> c10971yW, U u, @NotNull HM<? super S> hm) {
        XA0<AW<U, S>, U, HM<? super S>, Object> a2 = c10971yW.a();
        C6562gT0.n(a2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        XA0<? super AW<?, ?>, Object, ? super HM<Object>, ? extends Object> xa0 = this.X;
        if (a2 != xa0) {
            this.X = a2;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.Z = i(xa0, hm);
        } else {
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.Z = hm;
        }
        this.Y = u;
        Object l = C7289jT0.l();
        if (l == C7289jT0.l()) {
            MV.c(hm);
        }
        return l;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return C3897Pa0.X;
    }

    public final HM<Object> i(XA0<? super AW<?, ?>, Object, ? super HM<Object>, ? extends Object> xa0, HM<Object> hm) {
        return new a(C3897Pa0.X, this, xa0, hm);
    }

    public final R j() {
        Object obj;
        Object obj2;
        Object P;
        while (true) {
            R r = (R) this.Y0;
            HM<Object> hm = this.Z;
            if (hm != null) {
                obj = C11214zW.a;
                if (!PT1.d(obj, r)) {
                    obj2 = C11214zW.a;
                    this.Y0 = obj2;
                    hm.q(r);
                } else {
                    try {
                        XA0<? super AW<?, ?>, Object, ? super HM<Object>, ? extends Object> xa0 = this.X;
                        Object obj3 = this.Y;
                        if (!(xa0 instanceof AbstractC5644cl)) {
                            P = C7048iT0.k(xa0, this, obj3, hm);
                        } else {
                            P = ((XA0) C11313zv2.q(xa0, 3)).P(this, obj3, hm);
                        }
                        if (P != C7289jT0.l()) {
                            PT1.a aVar = PT1.Y;
                            hm.q(PT1.b(P));
                        }
                    } catch (Throwable th) {
                        PT1.a aVar2 = PT1.Y;
                        hm.q(PT1.b(RT1.a(th)));
                    }
                }
            } else {
                RT1.n(r);
                return r;
            }
        }
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        this.Z = null;
        this.Y0 = obj;
    }
}
