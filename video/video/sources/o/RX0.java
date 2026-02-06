package o;

import java.lang.reflect.Method;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "KotlinExtensions")
@InterfaceC8303na2({"SMAP\nKotlinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n426#2,11:127\n426#2,11:138\n426#2,11:149\n*S KotlinDebug\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n*L\n32#1:127,11\n66#1:138,11\n93#1:149,11\n*E\n"})
/* loaded from: classes4.dex */
public final class RX0 {

    /* loaded from: classes4.dex */
    public static final class a implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ InterfaceC11302zt<T> X;

        public a(InterfaceC11302zt<T> interfaceC11302zt) {
            this.X = interfaceC11302zt;
        }

        public final void c(Throwable th) {
            this.X.cancel();
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC3386Jt<T> {
        public final /* synthetic */ InterfaceC8396ny<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC8396ny<? super T> interfaceC8396ny) {
            this.a = interfaceC8396ny;
        }

        @Override // o.InterfaceC3386Jt
        public void a(InterfaceC11302zt<T> interfaceC11302zt, Throwable th) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(th, "t");
            InterfaceC8396ny<T> interfaceC8396ny = this.a;
            PT1.a aVar = PT1.Y;
            interfaceC8396ny.q(PT1.b(RT1.a(th)));
        }

        @Override // o.InterfaceC3386Jt
        public void b(InterfaceC11302zt<T> interfaceC11302zt, FT1<T> ft1) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(ft1, "response");
            if (ft1.g()) {
                T a = ft1.a();
                if (a == null) {
                    Object tag = interfaceC11302zt.request().tag(C10719xT0.class);
                    C6562gT0.m(tag);
                    C10719xT0 c10719xT0 = (C10719xT0) tag;
                    Class<?> f = c10719xT0.f();
                    Method c = c10719xT0.c();
                    TX0 tx0 = new TX0("Response from " + f.getName() + '.' + c.getName() + " was null but response body type was declared as non-null");
                    InterfaceC8396ny<T> interfaceC8396ny = this.a;
                    PT1.a aVar = PT1.Y;
                    interfaceC8396ny.q(PT1.b(RT1.a(tx0)));
                    return;
                }
                InterfaceC8396ny<T> interfaceC8396ny2 = this.a;
                PT1.a aVar2 = PT1.Y;
                interfaceC8396ny2.q(PT1.b(a));
                return;
            }
            InterfaceC8396ny<T> interfaceC8396ny3 = this.a;
            PT1.a aVar3 = PT1.Y;
            interfaceC8396ny3.q(PT1.b(RT1.a(new C10432wI0(ft1))));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ InterfaceC11302zt<T> X;

        public c(InterfaceC11302zt<T> interfaceC11302zt) {
            this.X = interfaceC11302zt;
        }

        public final void c(Throwable th) {
            this.X.cancel();
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC3386Jt<T> {
        public final /* synthetic */ InterfaceC8396ny<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC8396ny<? super T> interfaceC8396ny) {
            this.a = interfaceC8396ny;
        }

        @Override // o.InterfaceC3386Jt
        public void a(InterfaceC11302zt<T> interfaceC11302zt, Throwable th) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(th, "t");
            InterfaceC8396ny<T> interfaceC8396ny = this.a;
            PT1.a aVar = PT1.Y;
            interfaceC8396ny.q(PT1.b(RT1.a(th)));
        }

        @Override // o.InterfaceC3386Jt
        public void b(InterfaceC11302zt<T> interfaceC11302zt, FT1<T> ft1) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(ft1, "response");
            if (ft1.g()) {
                InterfaceC8396ny<T> interfaceC8396ny = this.a;
                PT1.a aVar = PT1.Y;
                interfaceC8396ny.q(PT1.b(ft1.a()));
                return;
            }
            InterfaceC8396ny<T> interfaceC8396ny2 = this.a;
            PT1.a aVar2 = PT1.Y;
            interfaceC8396ny2.q(PT1.b(RT1.a(new C10432wI0(ft1))));
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ InterfaceC11302zt<T> X;

        public e(InterfaceC11302zt<T> interfaceC11302zt) {
            this.X = interfaceC11302zt;
        }

        public final void c(Throwable th) {
            this.X.cancel();
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC3386Jt<T> {
        public final /* synthetic */ InterfaceC8396ny<FT1<T>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC8396ny<? super FT1<T>> interfaceC8396ny) {
            this.a = interfaceC8396ny;
        }

        @Override // o.InterfaceC3386Jt
        public void a(InterfaceC11302zt<T> interfaceC11302zt, Throwable th) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(th, "t");
            InterfaceC8396ny<FT1<T>> interfaceC8396ny = this.a;
            PT1.a aVar = PT1.Y;
            interfaceC8396ny.q(PT1.b(RT1.a(th)));
        }

        @Override // o.InterfaceC3386Jt
        public void b(InterfaceC11302zt<T> interfaceC11302zt, FT1<T> ft1) {
            C6562gT0.p(interfaceC11302zt, C3771Nr1.E0);
            C6562gT0.p(ft1, "response");
            InterfaceC8396ny<FT1<T>> interfaceC8396ny = this.a;
            PT1.a aVar = PT1.Y;
            interfaceC8396ny.q(PT1.b(ft1));
        }
    }

    @FV(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {119}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    /* loaded from: classes4.dex */
    public static final class g extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public g(HM<? super g> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return RX0.f(null, this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Runnable {
        public final /* synthetic */ HM<?> X;
        public final /* synthetic */ Throwable Y;

        public h(HM<?> hm, Throwable th) {
            this.X = hm;
            this.Y = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HM e = C7048iT0.e(this.X);
            PT1.a aVar = PT1.Y;
            e.q(PT1.b(RT1.a(this.Y)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull InterfaceC11302zt<T> interfaceC11302zt, @NotNull HM<? super T> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        c8883py.X(new a(interfaceC11302zt));
        interfaceC11302zt.g3(new b(c8883py));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    @InterfaceC8046mW0(name = "awaitNullable")
    @Nullable
    public static final <T> Object b(@NotNull InterfaceC11302zt<T> interfaceC11302zt, @NotNull HM<? super T> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        c8883py.X(new c(interfaceC11302zt));
        interfaceC11302zt.g3(new d(c8883py));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    @Nullable
    public static final <T> Object c(@NotNull InterfaceC11302zt<T> interfaceC11302zt, @NotNull HM<? super FT1<T>> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        c8883py.X(new e(interfaceC11302zt));
        interfaceC11302zt.g3(new f(c8883py));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    @InterfaceC8046mW0(name = "awaitUnit")
    @Nullable
    public static final Object d(@NotNull InterfaceC11302zt<C7458kA2> interfaceC11302zt, @NotNull HM<? super C7458kA2> hm) {
        C6562gT0.n(interfaceC11302zt, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(interfaceC11302zt, hm);
    }

    public static final /* synthetic */ <T> T e(C8284nU1 c8284nU1) {
        C6562gT0.p(c8284nU1, "<this>");
        C6562gT0.y(4, "T");
        T t = (T) c8284nU1.g(Object.class);
        C6562gT0.o(t, "create(...)");
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(@NotNull Throwable th, @NotNull HM<?> hm) {
        g gVar;
        int i;
        if (hm instanceof g) {
            gVar = (g) hm;
            int i2 = gVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = gVar.Z0;
                Object l = C7289jT0.l();
                i = gVar.a1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) gVar.Y0;
                    RT1.n(obj);
                } else {
                    RT1.n(obj);
                    gVar.Y0 = th;
                    gVar.a1 = 1;
                    C8909q40.a().I(gVar.getContext(), new h(gVar, th));
                    Object l2 = C7289jT0.l();
                    if (l2 == C7289jT0.l()) {
                        MV.c(gVar);
                    }
                    if (l2 == l) {
                        return l;
                    }
                }
                throw new SX0();
            }
        }
        gVar = new g(hm);
        Object obj2 = gVar.Z0;
        Object l3 = C7289jT0.l();
        i = gVar.a1;
        if (i == 0) {
        }
        throw new SX0();
    }
}
