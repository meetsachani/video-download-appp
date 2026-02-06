package o;

import o.InterfaceC8023mQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,124:1\n46#2,4:125\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n21#1:125,4\n*E\n"})
/* renamed from: o.Cp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2673Cp {

    /* JADX INFO: Add missing generic type declarations: [E] */
    @FV(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    /* renamed from: o.Cp$b */
    /* loaded from: classes3.dex */
    public static final class b<E> extends AbstractC4225Si2 implements VA0<AI1<? super E>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ OO1<E> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(OO1<? extends E> oo1, HM<? super b> hm) {
            super(2, hm);
            this.c1 = oo1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
            if (r4.d0(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0019). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            InterfaceC9181rA<E> it;
            AI1 ai12;
            Object a;
            Object l = C7289jT0.l();
            int i = this.a1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        it = (InterfaceC9181rA) this.Z0;
                        ai12 = (AI1) this.b1;
                        RT1.n(obj);
                        ai1 = ai12;
                        this.b1 = ai1;
                        this.Z0 = it;
                        this.a1 = 1;
                        a = it.a(this);
                        if (a != l) {
                            ai12 = ai1;
                            obj = a;
                            if (!((Boolean) obj).booleanValue()) {
                                E next = it.next();
                                this.b1 = ai12;
                                this.Z0 = it;
                                this.a1 = 2;
                            } else {
                                return C7458kA2.a;
                            }
                        }
                        return l;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (InterfaceC9181rA) this.Z0;
                ai12 = (AI1) this.b1;
                RT1.n(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.b1;
                it = this.c1.iterator();
                this.b1 = ai1;
                this.Z0 = it;
                this.a1 = 1;
                a = it.a(this);
                if (a != l) {
                }
                return l;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super E> ai1, HM<? super C7458kA2> hm) {
            return ((b) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.c1, hm);
            bVar.b1 = obj;
            return bVar;
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @InterfaceC3681Mt1
    @NotNull
    public static final <E> InterfaceC10800xp<E> b(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC10949yQ enumC10949yQ, @Nullable HA0<? super Throwable, C7458kA2> ha0, @InterfaceC5183ar @NotNull VA0<? super AI1<? super E>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C2477Ap c2477Ap;
        InterfaceC5809dQ k = C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ);
        InterfaceC10800xp a2 = C11286zp.a(i);
        if (enumC10949yQ.i()) {
            c2477Ap = new IY0(k, a2, va0);
        } else {
            c2477Ap = new C2477Ap(k, a2, true);
        }
        if (ha0 != null) {
            ((C6812hV0) c2477Ap).i0(ha0);
        }
        ((AbstractC9384s0) c2477Ap).S1(enumC10949yQ, c2477Ap, va0);
        return c2477Ap;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @InterfaceC3681Mt1
    @NotNull
    public static final <E> InterfaceC10800xp<E> c(@NotNull final OO1<? extends E> oo1, int i, @NotNull EnumC10949yQ enumC10949yQ) {
        return d(C10217vQ.m(C10217vQ.m(C6502gE0.X, C8909q40.g()), new a(InterfaceC8023mQ.z)), null, i, enumC10949yQ, new HA0() { // from class: o.Bp
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 f;
                f = C2673Cp.f(OO1.this, (Throwable) obj);
                return f;
            }
        }, new b(oo1, null), 1, null);
    }

    public static /* synthetic */ InterfaceC10800xp d(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC10949yQ enumC10949yQ, HA0 ha0, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            enumC10949yQ = EnumC10949yQ.Y;
        }
        if ((i2 & 8) != 0) {
            ha0 = null;
        }
        EnumC10949yQ enumC10949yQ2 = enumC10949yQ;
        return b(interfaceC9974uQ, interfaceC5809dQ, i, enumC10949yQ2, ha0, va0);
    }

    public static /* synthetic */ InterfaceC10800xp e(OO1 oo1, int i, EnumC10949yQ enumC10949yQ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            enumC10949yQ = EnumC10949yQ.Y;
        }
        return c(oo1, i, enumC10949yQ);
    }

    public static final C7458kA2 f(OO1 oo1, Throwable th) {
        C11128zA.b(oo1, th);
        return C7458kA2.a;
    }

    @InterfaceC8303na2({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,48:1\n21#2:49\n*E\n"})
    /* renamed from: o.Cp$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9627t0 implements InterfaceC8023mQ {
        public a(InterfaceC8023mQ.b bVar) {
            super(bVar);
        }

        @Override // o.InterfaceC8023mQ
        public void S(InterfaceC5809dQ interfaceC5809dQ, Throwable th) {
        }
    }
}
