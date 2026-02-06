package o;

/* loaded from: classes.dex */
public abstract class GZ0 implements InterfaceC9974uQ {

    @FV(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = va0;
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
                androidx.lifecycle.f b = GZ0.this.b();
                VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> va0 = this.b1;
                this.Z0 = 1;
                if (androidx.lifecycle.m.a(b, va0, this) == l) {
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
            return new a(this.b1, hm);
        }
    }

    @FV(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super b> hm) {
            super(2, hm);
            this.b1 = va0;
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
                androidx.lifecycle.f b = GZ0.this.b();
                VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> va0 = this.b1;
                this.Z0 = 1;
                if (androidx.lifecycle.m.c(b, va0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
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

    @FV(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super c> hm) {
            super(2, hm);
            this.b1 = va0;
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
                androidx.lifecycle.f b = GZ0.this.b();
                VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> va0 = this.b1;
                this.Z0 = 1;
                if (androidx.lifecycle.m.e(b, va0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((c) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new c(this.b1, hm);
        }
    }

    public abstract androidx.lifecycle.f b();

    @InterfaceC9150r20(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final RU0 c(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        RU0 f;
        C6562gT0.p(va0, "block");
        f = C5910dr.f(this, null, null, new a(va0, null), 3, null);
        return f;
    }

    @InterfaceC9150r20(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final RU0 d(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        RU0 f;
        C6562gT0.p(va0, "block");
        f = C5910dr.f(this, null, null, new b(va0, null), 3, null);
        return f;
    }

    @InterfaceC9150r20(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final RU0 e(VA0<? super InterfaceC9974uQ, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        RU0 f;
        C6562gT0.p(va0, "block");
        f = C5910dr.f(this, null, null, new c(va0, null), 3, null);
        return f;
    }
}
