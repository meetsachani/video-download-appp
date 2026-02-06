package androidx.lifecycle;

import androidx.lifecycle.f;
import o.AbstractC4225Si2;
import o.C5426br;
import o.C7289jT0;
import o.C7458kA2;
import o.C7708lC1;
import o.C8909q40;
import o.FV;
import o.HM;
import o.InterfaceC9150r20;
import o.InterfaceC9974uQ;
import o.KZ0;
import o.RT1;
import o.RU0;
import o.VA0;

/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class a<T> extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super T>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ f b1;
        public final /* synthetic */ f.b c1;
        public final /* synthetic */ VA0<InterfaceC9974uQ, HM<? super T>, Object> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f fVar, f.b bVar, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = fVar;
            this.c1 = bVar;
            this.d1 = va0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            g gVar;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    gVar = (g) this.a1;
                    try {
                        RT1.n(obj);
                    } catch (Throwable th) {
                        th = th;
                        gVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                RU0 ru0 = (RU0) ((InterfaceC9974uQ) this.a1).a0().f(RU0.W);
                if (ru0 != null) {
                    C7708lC1 c7708lC1 = new C7708lC1();
                    g gVar2 = new g(this.b1, this.c1, c7708lC1.Z, ru0);
                    try {
                        VA0<InterfaceC9974uQ, HM<? super T>, Object> va0 = this.d1;
                        this.a1 = gVar2;
                        this.Z0 = 1;
                        obj = C5426br.h(c7708lC1, va0, this);
                        if (obj == l) {
                            return l;
                        }
                        gVar = gVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        gVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
            }
            gVar.b();
            return obj;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super T> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, this.c1, this.d1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    @InterfaceC9150r20(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object a(f fVar, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return g(fVar, f.b.CREATED, va0, hm);
    }

    @InterfaceC9150r20(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object b(KZ0 kz0, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return a(kz0.b(), va0, hm);
    }

    @InterfaceC9150r20(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object c(f fVar, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return g(fVar, f.b.RESUMED, va0, hm);
    }

    @InterfaceC9150r20(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object d(KZ0 kz0, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return c(kz0.b(), va0, hm);
    }

    @InterfaceC9150r20(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object e(f fVar, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return g(fVar, f.b.STARTED, va0, hm);
    }

    @InterfaceC9150r20(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object f(KZ0 kz0, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return e(kz0.b(), va0, hm);
    }

    @InterfaceC9150r20(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object g(f fVar, f.b bVar, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        return C5426br.h(C8909q40.e().b0(), new a(fVar, bVar, va0, null), hm);
    }
}
