package o;

import java.util.List;
import java.util.concurrent.CancellationException;
import o.C3503Kz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,204:1\n94#1,8:205\n160#1:213\n94#1,3:214\n161#1,2:217\n101#1:219\n97#1,3:220\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n160#1:205,8\n192#1:213\n192#1:214,3\n192#1:217,2\n192#1:219\n192#1:220,3\n*E\n"})
/* loaded from: classes3.dex */
public final /* synthetic */ class BA {

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {C10997yd1.q1}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class a<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return BA.c(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {C3503Kz.b.y}, m = "toList", n = {"$this$toList_u24lambda_u242", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class b<E> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public int d1;

        public b(HM<? super b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return C11128zA.g0(null, this);
        }
    }

    @HK1
    public static final void a(@NotNull OO1<?> oo1, @Nullable Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C3722Nf0.a("Channel was consumed, consumer had failed", th);
            }
        }
        oo1.i(cancellationException);
    }

    public static final <E, R> R b(@NotNull OO1<? extends E> oo1, @NotNull HA0<? super OO1<? extends E>, ? extends R> ha0) {
        try {
            R invoke = ha0.invoke(oo1);
            UP0.d(1);
            C11128zA.b(oo1, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object c(@NotNull OO1<? extends E> oo1, @NotNull HA0<? super E, C7458kA2> ha0, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        OO1<? extends E> oo12;
        Throwable th;
        InterfaceC9181rA<? extends E> it;
        HA0<? super E, C7458kA2> ha02;
        Object a2;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b1;
                Object l = C7289jT0.l();
                i = aVar.c1;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC9181rA<? extends E> interfaceC9181rA = (InterfaceC9181rA) aVar.a1;
                        oo12 = (OO1) aVar.Z0;
                        HA0<? super E, C7458kA2> ha03 = (HA0) aVar.Y0;
                        try {
                            RT1.n(obj);
                            InterfaceC9181rA<? extends E> interfaceC9181rA2 = interfaceC9181rA;
                            if (!((Boolean) obj).booleanValue()) {
                                ha03.invoke((Object) interfaceC9181rA2.next());
                                ha02 = ha03;
                                it = interfaceC9181rA2;
                                aVar.Y0 = ha02;
                                aVar.Z0 = oo12;
                                aVar.a1 = it;
                                aVar.c1 = 1;
                                a2 = it.a(aVar);
                                if (a2 != l) {
                                    return l;
                                }
                                ha03 = ha02;
                                obj = a2;
                                interfaceC9181rA2 = it;
                                if (!((Boolean) obj).booleanValue()) {
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    UP0.d(1);
                                    C11128zA.b(oo12, null);
                                    UP0.c(1);
                                    return c7458kA2;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                UP0.d(1);
                                C11128zA.b(oo12, th);
                                UP0.c(1);
                                throw th3;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        oo12 = oo1;
                        it = oo1.iterator();
                        ha02 = ha0;
                        aVar.Y0 = ha02;
                        aVar.Z0 = oo12;
                        aVar.a1 = it;
                        aVar.c1 = 1;
                        a2 = it.a(aVar);
                        if (a2 != l) {
                        }
                    } catch (Throwable th4) {
                        oo12 = oo1;
                        th = th4;
                        throw th;
                    }
                }
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.b1;
        Object l2 = C7289jT0.l();
        i = aVar.c1;
        if (i == 0) {
        }
    }

    public static final <E> Object d(OO1<? extends E> oo1, HA0<? super E, C7458kA2> ha0, HM<? super C7458kA2> hm) {
        try {
            InterfaceC9181rA<? extends E> it = oo1.iterator();
            while (true) {
                UP0.e(3);
                UP0.e(0);
                Object a2 = it.a(null);
                UP0.e(1);
                if (((Boolean) a2).booleanValue()) {
                    ha0.invoke((E) it.next());
                } else {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    UP0.d(1);
                    C11128zA.b(oo1, null);
                    UP0.c(1);
                    return c7458kA2;
                }
            }
        } finally {
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ InterfaceC5223b02 e(OO1 oo1) {
        C6562gT0.n(oo1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return oo1.R();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object f(OO1 oo1, HM hm) {
        C6562gT0.n(oo1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return oo1.V(hm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object g(@NotNull OO1<? extends E> oo1, @NotNull HM<? super List<? extends E>> hm) {
        b bVar;
        int i;
        OO1<? extends E> oo12;
        Throwable th;
        List list;
        InterfaceC9181rA<? extends E> it;
        List list2;
        Object a2;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.c1;
                Object l = C7289jT0.l();
                i = bVar.d1;
                if (i == 0) {
                    if (i == 1) {
                        InterfaceC9181rA<? extends E> interfaceC9181rA = (InterfaceC9181rA) bVar.b1;
                        OO1<? extends E> oo13 = (OO1) bVar.a1;
                        List list3 = (List) bVar.Z0;
                        list = (List) bVar.Y0;
                        try {
                            RT1.n(obj);
                            List list4 = list3;
                            InterfaceC9181rA<? extends E> interfaceC9181rA2 = interfaceC9181rA;
                            if (!((Boolean) obj).booleanValue()) {
                                list4.add(interfaceC9181rA2.next());
                                oo12 = oo13;
                                list2 = list4;
                                it = interfaceC9181rA2;
                                try {
                                    bVar.Y0 = list;
                                    bVar.Z0 = list2;
                                    bVar.a1 = oo12;
                                    bVar.b1 = it;
                                    bVar.d1 = 1;
                                    a2 = it.a(bVar);
                                    if (a2 != l) {
                                        return l;
                                    }
                                    oo13 = oo12;
                                    obj = a2;
                                    list4 = list2;
                                    interfaceC9181rA2 = it;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        C11128zA.b(oo13, null);
                                        return C7979mF.a(list);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        C11128zA.b(oo12, th);
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            oo12 = oo13;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        List i3 = C7979mF.i();
                        list = i3;
                        oo12 = oo1;
                        it = oo1.iterator();
                        list2 = i3;
                        bVar.Y0 = list;
                        bVar.Z0 = list2;
                        bVar.a1 = oo12;
                        bVar.b1 = it;
                        bVar.d1 = 1;
                        a2 = it.a(bVar);
                        if (a2 != l) {
                        }
                    } catch (Throwable th5) {
                        oo12 = oo1;
                        th = th5;
                        throw th;
                    }
                }
            }
        }
        bVar = new b(hm);
        Object obj2 = bVar.c1;
        Object l2 = C7289jT0.l();
        i = bVar.d1;
        if (i == 0) {
        }
    }
}
