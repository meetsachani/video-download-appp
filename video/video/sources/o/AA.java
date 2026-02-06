package o;

import o.C10642xA;
import o.PT1;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@InterfaceC8303na2({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,61:1\n529#2,2:62\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt\n*L\n37#1:62,2\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class AA {

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ InterfaceC10362w02<Object> a1;
        public final /* synthetic */ Object b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC10362w02<Object> interfaceC10362w02, Object obj, HM<? super a> hm) {
            super(2, hm);
            this.a1 = interfaceC10362w02;
            this.b1 = obj;
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
                InterfaceC10362w02<Object> interfaceC10362w02 = this.a1;
                Object obj2 = this.b1;
                this.Z0 = 1;
                if (interfaceC10362w02.d0(obj2, this) == l) {
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

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @InterfaceC8303na2({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/channels/ChannelsKt__ChannelsKt$trySendBlocking$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C10642xA<? extends C7458kA2>>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC10362w02<E> b1;
        public final /* synthetic */ E c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC10362w02<? super E> interfaceC10362w02, E e, HM<? super b> hm) {
            super(2, hm);
            this.b1 = interfaceC10362w02;
            this.c1 = e;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object b;
            Object a;
            Object l = C7289jT0.l();
            int i = this.Z0;
            try {
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.a1;
                    InterfaceC10362w02<E> interfaceC10362w02 = this.b1;
                    E e = this.c1;
                    PT1.a aVar = PT1.Y;
                    this.Z0 = 1;
                    if (interfaceC10362w02.d0(e, this) == l) {
                        return l;
                    }
                }
                b = PT1.b(C7458kA2.a);
            } catch (Throwable th) {
                PT1.a aVar2 = PT1.Y;
                b = PT1.b(RT1.a(th));
            }
            if (PT1.j(b)) {
                a = C10642xA.b.c(C7458kA2.a);
            } else {
                a = C10642xA.b.a(PT1.e(b));
            }
            return C10642xA.b(a);
        }

        public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super C10642xA<C7458kA2>> hm) {
            return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C10642xA<? extends C7458kA2>> hm) {
            return U(interfaceC9974uQ, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, this.c1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @IR1(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void a(InterfaceC10362w02 interfaceC10362w02, Object obj) {
        if (!C10642xA.m(interfaceC10362w02.B(obj))) {
            C5668cr.b(null, new a(interfaceC10362w02, obj, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E> Object b(@NotNull InterfaceC10362w02<? super E> interfaceC10362w02, E e) {
        Object b2;
        Object B = interfaceC10362w02.B(e);
        if (B instanceof C10642xA.c) {
            b2 = C5668cr.b(null, new b(interfaceC10362w02, e, null), 1, null);
            return ((C10642xA) b2).o();
        }
        C7458kA2 c7458kA2 = (C7458kA2) B;
        return C10642xA.b.c(C7458kA2.a);
    }
}
