package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GY0<E> extends C9408s6<E> {
    @NotNull
    public HM<? super C7458kA2> Z0;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C7964mB0 implements XA0<GY0<?>, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final a e1 = new a();

        public a() {
            super(3, GY0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(GY0<?> gy0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(gy0, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(GY0<?> gy0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            gy0.W1(interfaceC6691h02, obj);
        }
    }

    public GY0(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC6728hA<E> interfaceC6728hA, @NotNull VA0<? super InterfaceC9894u6<E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        super(interfaceC5809dQ, interfaceC6728hA, false);
        this.Z0 = C7048iT0.c(va0, this, this);
    }

    @Override // o.C7212jA, o.InterfaceC10362w02
    @NotNull
    public Object B(E e) {
        start();
        return super.B(e);
    }

    @Override // o.C7212jA, o.InterfaceC10362w02
    public boolean W(@Nullable Throwable th) {
        boolean W = super.W(th);
        start();
        return W;
    }

    public final void W1(InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
        v1();
        super.e().a().P(this, interfaceC6691h02, obj);
    }

    @Override // o.C7212jA, o.InterfaceC10362w02
    @Nullable
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        start();
        Object d0 = super.d0(e, hm);
        if (d0 == C7289jT0.l()) {
            return d0;
        }
        return C7458kA2.a;
    }

    @Override // o.C7212jA, o.InterfaceC10362w02
    @NotNull
    public InterfaceC5708d02<E, InterfaceC10362w02<E>> e() {
        a aVar = a.e1;
        C6562gT0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C5950e02(this, (XA0) C11313zv2.q(aVar, 3), super.e().c(), null, 8, null);
    }

    @Override // o.C7212jA, o.InterfaceC10362w02
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        start();
        return super.offer(e);
    }

    @Override // o.C6812hV0
    public void v1() {
        C10104uy.c(this.Z0, this);
    }

    public static /* synthetic */ void V1() {
    }
}
