package o;

import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,425:1\n326#2:426\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n416#1:426\n*E\n"})
/* renamed from: o.Cg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2640Cg2<T> implements InterfaceC4076Qv0<T> {
    @NotNull
    public final InterfaceC4076Qv0<T> X;
    @NotNull
    public final VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> Y;

    @FV(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {418, InterfaceC8148mw2.c.t}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* renamed from: o.Cg2$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C2640Cg2<T> b1;
        public int c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2640Cg2<T> c2640Cg2, HM<? super a> hm) {
            super(hm);
            this.b1 = c2640Cg2;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return this.b1.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2640Cg2(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        this.X = interfaceC4076Qv0;
        this.Y = va0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (((o.C2640Cg2) r7).a(r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.pX1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull HM<? super C7458kA2> hm) {
        a aVar;
        ?? r2;
        C8780pX1 c8780pX1;
        C2640Cg2<T> c2640Cg2;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i = aVar.c1;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.c1 = i - Integer.MIN_VALUE;
                    Object obj = aVar.a1;
                    Object l = C7289jT0.l();
                    r2 = aVar.c1;
                    if (r2 == 0) {
                        if (r2 != 1) {
                            if (r2 == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c8780pX1 = (C8780pX1) aVar.Z0;
                        c2640Cg2 = (C2640Cg2) aVar.Y0;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        c8780pX1 = new C8780pX1(this.X, aVar.getContext());
                        VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> va0 = this.Y;
                        aVar.Y0 = this;
                        aVar.Z0 = c8780pX1;
                        aVar.c1 = 1;
                        if (va0.i(c8780pX1, aVar) != l) {
                            c2640Cg2 = this;
                        }
                        return l;
                    }
                    c8780pX1.H();
                    InterfaceC4076Qv0<T> interfaceC4076Qv0 = c2640Cg2.X;
                    r2 = interfaceC4076Qv0 instanceof C2640Cg2;
                    if (r2 == 0) {
                        aVar.Y0 = null;
                        aVar.Z0 = null;
                        aVar.c1 = 2;
                    } else {
                        return C7458kA2.a;
                    }
                }
            }
            if (r2 == 0) {
            }
            c8780pX1.H();
            InterfaceC4076Qv0<T> interfaceC4076Qv02 = c2640Cg2.X;
            r2 = interfaceC4076Qv02 instanceof C2640Cg2;
            if (r2 == 0) {
            }
        } catch (Throwable th) {
            r2.H();
            throw th;
        }
        aVar = new a(this, hm);
        Object obj2 = aVar.a1;
        Object l2 = C7289jT0.l();
        r2 = aVar.c1;
    }

    @Override // o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        return this.X.c(t, hm);
    }
}
