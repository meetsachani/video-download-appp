package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1863#2,2:97\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n91#1:97,2\n*E\n"})
/* renamed from: o.tA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9667tA<T> extends AbstractC7455kA<T> {
    @NotNull
    public final Iterable<InterfaceC3882Ov0<T>> Y0;

    @FV(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.tA$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ InterfaceC3882Ov0<T> a1;
        public final /* synthetic */ C10848y02<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, C10848y02<T> c10848y02, HM<? super a> hm) {
            super(2, hm);
            this.a1 = interfaceC3882Ov0;
            this.b1 = c10848y02;
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
                InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.a1;
                C10848y02<T> c10848y02 = this.b1;
                this.Z0 = 1;
                if (interfaceC3882Ov0.a(c10848y02, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new a(this.a1, this.b1, hm);
        }
    }

    public /* synthetic */ C9667tA(Iterable iterable, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(iterable, (i2 & 2) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @Nullable
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        C10848y02 c10848y02 = new C10848y02(ai1);
        for (InterfaceC3882Ov0<T> interfaceC3882Ov0 : this.Y0) {
            C5910dr.f(ai1, null, null, new a(interfaceC3882Ov0, c10848y02, null), 3, null);
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C9667tA(this.Y0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public OO1<T> o(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C10919yI1.g(interfaceC9974uQ, this.X, this.Y, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9667tA(@NotNull Iterable<? extends InterfaceC3882Ov0<? extends T>> iterable, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC5809dQ, i, enumC7132iq);
        this.Y0 = iterable;
    }
}
