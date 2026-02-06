package o;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
@InterfaceC10472wS0
/* renamed from: o.kA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7455kA<T> implements VB0<T> {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC5809dQ X;
    @InterfaceC7058iW0
    public final int Y;
    @InterfaceC7058iW0
    @NotNull
    public final EnumC7132iq Z;

    @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.kA$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC4076Qv0<T> b1;
        public final /* synthetic */ AbstractC7455kA<T> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, AbstractC7455kA<T> abstractC7455kA, HM<? super a> hm) {
            super(2, hm);
            this.b1 = interfaceC4076Qv0;
            this.c1 = abstractC7455kA;
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
                InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.b1;
                OO1<T> o2 = this.c1.o((InterfaceC9974uQ) this.a1);
                this.Z0 = 1;
                if (C4467Uv0.m0(interfaceC4076Qv0, o2, this) == l) {
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
            a aVar = new a(this.b1, this.c1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.kA$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<AI1<? super T>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ AbstractC7455kA<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC7455kA<T> abstractC7455kA, HM<? super b> hm) {
            super(2, hm);
            this.b1 = abstractC7455kA;
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
                AbstractC7455kA<T> abstractC7455kA = this.b1;
                this.Z0 = 1;
                if (abstractC7455kA.h((AI1) this.a1, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super T> ai1, HM<? super C7458kA2> hm) {
            return ((b) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    public AbstractC7455kA(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        this.X = interfaceC5809dQ;
        this.Y = i;
        this.Z = enumC7132iq;
    }

    public static /* synthetic */ <T> Object g(AbstractC7455kA<T> abstractC7455kA, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
        Object g = C10217vQ.g(new a(interfaceC4076Qv0, abstractC7455kA, null), hm);
        if (g == C7289jT0.l()) {
            return g;
        }
        return C7458kA2.a;
    }

    @Override // o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        return g(this, interfaceC4076Qv0, hm);
    }

    @Override // o.VB0
    @NotNull
    public InterfaceC3882Ov0<T> d(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        InterfaceC5809dQ M = interfaceC5809dQ.M(this.X);
        if (enumC7132iq == EnumC7132iq.X) {
            int i2 = this.Y;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            enumC7132iq = this.Z;
        }
        if (C6562gT0.g(M, this.X) && i == this.Y && enumC7132iq == this.Z) {
            return this;
        }
        return i(M, i, enumC7132iq);
    }

    @Nullable
    public String e() {
        return null;
    }

    @Nullable
    public abstract Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm);

    @NotNull
    public abstract AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq);

    @Nullable
    public InterfaceC3882Ov0<T> j() {
        return null;
    }

    @NotNull
    public final VA0<AI1<? super T>, HM<? super C7458kA2>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i = this.Y;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @NotNull
    public OO1<T> o(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C10919yI1.h(interfaceC9974uQ, this.X, l(), this.Z, EnumC10949yQ.Z, null, k(), 16, null);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        if (this.X != C3897Pa0.X) {
            arrayList.add("context=" + this.X);
        }
        if (this.Y != -3) {
            arrayList.add("capacity=" + this.Y);
        }
        if (this.Z != EnumC7132iq.X) {
            arrayList.add("onBufferOverflow=" + this.Z);
        }
        return NV.a(this) + '[' + C10662xF.p3(arrayList, C6566gU0.h, null, null, 0, null, null, 62, null) + ']';
    }
}
