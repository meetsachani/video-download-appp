package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.C10642xA;

/* renamed from: o.s62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9411s62<T> {
    public final InterfaceC9974uQ a;
    public final VA0<T, HM<? super C7458kA2>, Object> b;
    public final InterfaceC6728hA<T> c;
    public final AtomicInteger d;

    /* renamed from: o.s62$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ HA0<Throwable, C7458kA2> X;
        public final /* synthetic */ C9411s62<T> Y;
        public final /* synthetic */ VA0<T, Throwable, C7458kA2> Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HA0<? super Throwable, C7458kA2> ha0, C9411s62<T> c9411s62, VA0<? super T, ? super Throwable, C7458kA2> va0) {
            super(1);
            this.X = ha0;
            this.Y = c9411s62;
            this.Z = va0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(Throwable th) {
            C7458kA2 c7458kA2;
            this.X.invoke(th);
            this.Y.c.W(th);
            do {
                Object h = C10642xA.h(this.Y.c.U());
                if (h == null) {
                    c7458kA2 = null;
                    continue;
                } else {
                    this.Z.i(h, th);
                    c7458kA2 = C7458kA2.a;
                    continue;
                }
            } while (c7458kA2 != null);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    @FV(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.s62$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public final /* synthetic */ C9411s62<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9411s62<T> c9411s62, HM<? super b> hm) {
            super(2, hm);
            this.b1 = c9411s62;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            if (r6 != r0) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
            if (r1.i(r6, r5) == r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            boolean z;
            VA0 va0;
            Object l = C7289jT0.l();
            int i = this.a1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        if (this.b1.d.decrementAndGet() == 0) {
                            return C7458kA2.a;
                        }
                        C10217vQ.j(this.b1.a);
                        va0 = this.b1.b;
                        InterfaceC6728hA interfaceC6728hA = this.b1.c;
                        this.Z0 = va0;
                        this.a1 = 1;
                        obj = interfaceC6728hA.g0(this);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    va0 = (VA0) this.Z0;
                    RT1.n(obj);
                    this.Z0 = null;
                    this.a1 = 2;
                }
            } else {
                RT1.n(obj);
                if (this.b1.d.get() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.");
                }
                C10217vQ.j(this.b1.a);
                va0 = this.b1.b;
                InterfaceC6728hA interfaceC6728hA2 = this.b1.c;
                this.Z0 = va0;
                this.a1 = 1;
                obj = interfaceC6728hA2.g0(this);
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new b(this.b1, hm);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9411s62(InterfaceC9974uQ interfaceC9974uQ, HA0<? super Throwable, C7458kA2> ha0, VA0<? super T, ? super Throwable, C7458kA2> va0, VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va02) {
        C6562gT0.p(interfaceC9974uQ, "scope");
        C6562gT0.p(ha0, "onComplete");
        C6562gT0.p(va0, "onUndeliveredElement");
        C6562gT0.p(va02, "consumeMessage");
        this.a = interfaceC9974uQ;
        this.b = va02;
        this.c = C9424sA.d(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        RU0 ru0 = (RU0) interfaceC9974uQ.a0().f(RU0.W);
        if (ru0 == null) {
            return;
        }
        ru0.i0(new a(ha0, this, va0));
    }

    public final void e(T t) {
        Object B = this.c.B(t);
        if (B instanceof C10642xA.a) {
            Throwable f = C10642xA.f(B);
            if (f == null) {
                throw new C7714lE("Channel was closed normally");
            }
        } else if (C10642xA.m(B)) {
            if (this.d.getAndIncrement() == 0) {
                C5910dr.f(this.a, null, null, new b(this, null), 3, null);
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }
}
