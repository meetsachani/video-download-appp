package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Wv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C4661Wv0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", C5287bG2.q2, "consume", "$this$emitAllImpl", C5287bG2.q2, "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* renamed from: o.Wv0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public boolean b1;
        public /* synthetic */ Object c1;
        public int d1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.c1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return C4661Wv0.d(null, null, false, this);
        }
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull OO1<? extends T> oo1) {
        return new C6971iA(oo1, true, null, 0, null, 28, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull OO1<? extends T> oo1, @NotNull HM<? super C7458kA2> hm) {
        Object d = d(interfaceC4076Qv0, oo1, true, hm);
        if (d == C7289jT0.l()) {
            return d;
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r9 == r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object d(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, OO1<? extends T> oo1, boolean z, HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        InterfaceC9181rA<? extends T> it;
        InterfaceC9181rA<? extends T> interfaceC9181rA;
        InterfaceC4076Qv0 interfaceC4076Qv02;
        Object a2;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.d1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.d1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.c1;
                    Object l = C7289jT0.l();
                    i = aVar.d1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                z = aVar.b1;
                                interfaceC9181rA = (InterfaceC9181rA) aVar.a1;
                                oo1 = (OO1) aVar.Z0;
                                InterfaceC4076Qv0<? super T> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.Y0;
                                RT1.n(obj);
                                InterfaceC4076Qv0<? super T> interfaceC4076Qv04 = interfaceC4076Qv03;
                                it = interfaceC9181rA;
                                interfaceC4076Qv0 = interfaceC4076Qv04;
                                aVar.Y0 = interfaceC4076Qv0;
                                aVar.Z0 = oo1;
                                aVar.a1 = it;
                                aVar.b1 = z;
                                aVar.d1 = 1;
                                a2 = it.a(aVar);
                                if (a2 == l) {
                                    interfaceC4076Qv02 = interfaceC4076Qv0;
                                    interfaceC9181rA = it;
                                    obj = a2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        aVar.Y0 = interfaceC4076Qv02;
                                        aVar.Z0 = oo1;
                                        aVar.a1 = interfaceC9181rA;
                                        aVar.b1 = z;
                                        aVar.d1 = 2;
                                        Object c = interfaceC4076Qv02.c((T) interfaceC9181rA.next(), aVar);
                                        interfaceC4076Qv04 = interfaceC4076Qv02;
                                    } else {
                                        if (z) {
                                            C11128zA.b(oo1, null);
                                        }
                                        return C7458kA2.a;
                                    }
                                } else {
                                    return l;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z = aVar.b1;
                            interfaceC9181rA = (InterfaceC9181rA) aVar.a1;
                            oo1 = (OO1) aVar.Z0;
                            InterfaceC4076Qv0 interfaceC4076Qv05 = (InterfaceC4076Qv0) aVar.Y0;
                            RT1.n(obj);
                            interfaceC4076Qv02 = interfaceC4076Qv05;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        RT1.n(obj);
                        C4467Uv0.o0(interfaceC4076Qv0);
                        it = oo1.iterator();
                        aVar.Y0 = interfaceC4076Qv0;
                        aVar.Z0 = oo1;
                        aVar.a1 = it;
                        aVar.b1 = z;
                        aVar.d1 = 1;
                        a2 = it.a(aVar);
                        if (a2 == l) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    C11128zA.b(oo1, th);
                }
                throw th2;
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.c1;
        Object l2 = C7289jT0.l();
        i = aVar.d1;
    }

    @NotNull
    public static final <T> OO1<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C7959mA.b(interfaceC3882Ov0).o(interfaceC9974uQ);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f(@NotNull OO1<? extends T> oo1) {
        return new C6971iA(oo1, false, null, 0, null, 28, null);
    }
}
