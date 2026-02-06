package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.gc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6594gc2 implements InterfaceC7677l42 {

    @FV(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {C3503Kz.k0}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.gc2$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super EnumC7191j42>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC9041qc2<Integer> b1;

        /* renamed from: o.gc2$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0283a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ RP1.a X;
            public final /* synthetic */ InterfaceC4076Qv0<EnumC7191j42> Y;

            @FV(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {C3503Kz.n0}, m = "emit", n = {}, s = {})
            /* renamed from: o.gc2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0284a extends KM {
                public /* synthetic */ Object Y0;
                public final /* synthetic */ C0283a<T> Z0;
                public int a1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0284a(C0283a<? super T> c0283a, HM<? super C0284a> hm) {
                    super(hm);
                    this.Z0 = c0283a;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.a1 |= Integer.MIN_VALUE;
                    return this.Z0.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0283a(RP1.a aVar, InterfaceC4076Qv0<? super EnumC7191j42> interfaceC4076Qv0) {
                this.X = aVar;
                this.Y = interfaceC4076Qv0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i, HM<? super C7458kA2> hm) {
                C0284a c0284a;
                int i2;
                if (hm instanceof C0284a) {
                    c0284a = (C0284a) hm;
                    int i3 = c0284a.a1;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0284a.a1 = i3 - Integer.MIN_VALUE;
                        Object obj = c0284a.Y0;
                        Object l = C7289jT0.l();
                        i2 = c0284a.a1;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj);
                            if (i > 0) {
                                RP1.a aVar = this.X;
                                if (!aVar.X) {
                                    aVar.X = true;
                                    InterfaceC4076Qv0<EnumC7191j42> interfaceC4076Qv0 = this.Y;
                                    EnumC7191j42 enumC7191j42 = EnumC7191j42.X;
                                    c0284a.a1 = 1;
                                    if (interfaceC4076Qv0.c(enumC7191j42, c0284a) == l) {
                                        return l;
                                    }
                                }
                            }
                            return C7458kA2.a;
                        }
                        return C7458kA2.a;
                    }
                }
                c0284a = new C0284a(this, hm);
                Object obj2 = c0284a.Y0;
                Object l2 = C7289jT0.l();
                i2 = c0284a.a1;
                if (i2 == 0) {
                }
                return C7458kA2.a;
            }

            @Override // o.InterfaceC4076Qv0
            public /* bridge */ /* synthetic */ Object c(Object obj, HM hm) {
                return a(((Number) obj).intValue(), hm);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC9041qc2<Integer> interfaceC9041qc2, HM<? super a> hm) {
            super(2, hm);
            this.b1 = interfaceC9041qc2;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
            } else {
                RT1.n(obj);
                RP1.a aVar = new RP1.a();
                InterfaceC9041qc2<Integer> interfaceC9041qc2 = this.b1;
                C0283a c0283a = new C0283a(aVar, (InterfaceC4076Qv0) this.a1);
                this.Z0 = 1;
                if (interfaceC9041qc2.a(c0283a, this) == l) {
                    return l;
                }
            }
            throw new SX0();
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super EnumC7191j42> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    @Override // o.InterfaceC7677l42
    @NotNull
    public InterfaceC3882Ov0<EnumC7191j42> a(@NotNull InterfaceC9041qc2<Integer> interfaceC9041qc2) {
        return C4467Uv0.I0(new a(interfaceC9041qc2, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
