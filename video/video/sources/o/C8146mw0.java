package o;

import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@InterfaceC8303na2({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,492:1\n189#2:493\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n431#1:493\n*E\n"})
/* renamed from: o.mw0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8146mw0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {InterfaceC8148mw2.c.u}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.mw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AbstractC4225Si2 implements VA0<T, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ long a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, HM<? super a> hm) {
            super(2, hm);
            this.a1 = j;
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
                long j = this.a1;
                this.Z0 = 1;
                if (P10.b(j, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(T t, HM<? super C7458kA2> hm) {
            return ((a) t(t, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new a(this.a1, hm);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.mw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ long a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, HM<? super b> hm) {
            super(2, hm);
            this.a1 = j;
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
                long j = this.a1;
                this.Z0 = 1;
                if (P10.b(j, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((b) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new b(this.a1, hm);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.mw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super T>, Throwable, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ HA0<Throwable, Boolean> c1;
        public final /* synthetic */ T d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(HA0<? super Throwable, Boolean> ha0, T t, HM<? super c> hm) {
            super(3, hm);
            this.c1 = ha0;
            this.d1 = t;
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
                InterfaceC4076Qv0 interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                Throwable th = (Throwable) this.b1;
                if (this.c1.invoke(th).booleanValue()) {
                    T t = this.d1;
                    this.a1 = null;
                    this.Z0 = 1;
                    if (interfaceC4076Qv0.c(t, this) == l) {
                        return l;
                    }
                } else {
                    throw th;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(Object obj, Throwable th, HM<? super C7458kA2> hm) {
            return U((InterfaceC4076Qv0) obj, th, hm);
        }

        public final Object U(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, Throwable th, HM<? super C7458kA2> hm) {
            c cVar = new c(this.c1, this.d1, hm);
            cVar.a1 = interfaceC4076Qv0;
            cVar.b1 = th;
            return cVar.F(C7458kA2.a);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {CK1.w, CK1.w}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.mw0$d */
    /* loaded from: classes4.dex */
    public static final class d<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0 c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VA0 va0, HM hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
            if (o.C4467Uv0.l0(r1, (o.InterfaceC3882Ov0) r6, r5) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC4076Qv0 interfaceC4076Qv0;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                Object obj2 = this.b1;
                VA0 va0 = this.c1;
                this.a1 = interfaceC4076Qv0;
                this.Z0 = 1;
                obj = va0.i(obj2, this);
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, HM<? super C7458kA2> hm) {
            return U((InterfaceC4076Qv0) obj, obj2, hm);
        }

        public final Object U(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T t, HM<? super C7458kA2> hm) {
            d dVar = new d(this.c1, hm);
            dVar.a1 = interfaceC4076Qv0;
            dVar.b1 = t;
            return dVar.F(C7458kA2.a);
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> A(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> B(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> C(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow has less verbose 'scan' shortcut", replaceWith = @IR1(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> D(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @IR1(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> E(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super T, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        return C4467Uv0.z1(interfaceC3882Ov0, xa0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @IR1(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> F(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @IR1(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> G(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @IR1(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> H(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void J(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void K(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull VA0<? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> va02) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> L(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @IR1(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> M(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C4467Uv0.c2(interfaceC3882Ov0, new d(va0, null));
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @IR1(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> c(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @NotNull InterfaceC5507cB0<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super R>, ? extends Object> interfaceC5507cB0) {
        return C4467Uv0.D(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05, interfaceC5507cB0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> d(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC5265bB0<? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super R>, ? extends Object> interfaceC5265bB0) {
        return C4467Uv0.E(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC5265bB0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> e(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull ZA0<? super T1, ? super T2, ? super T3, ? super HM<? super R>, ? extends Object> za0) {
        return C4467Uv0.F(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, za0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> f(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C4467Uv0.G(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'compose' is 'let'", replaceWith = @IR1(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super InterfaceC3882Ov0<? extends T>, ? extends InterfaceC3882Ov0<? extends R>> ha0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @IR1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, ? extends InterfaceC3882Ov0<? extends R>> ha0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @IR1(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> i(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @IR1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> j(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @IR1(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> k(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C4467Uv0.e1(interfaceC3882Ov0, new a(j, null));
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @IR1(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> l(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C4467Uv0.l1(interfaceC3882Ov0, new b(j, null));
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue is 'flatMapConcat'", replaceWith = @IR1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> m(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @IR1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> n(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @IR1(expression = "collect(action)", imports = {}))
    public static final <T> void o(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @IR1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> p(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @NotNull
    public static final Void q() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> r(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @IR1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> s(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @IR1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> t(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @IR1(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> u(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @IR1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> v(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t, @NotNull HA0<? super Throwable, Boolean> ha0) {
        return C4467Uv0.t(interfaceC3882Ov0, new c(ha0, t, null));
    }

    public static /* synthetic */ InterfaceC3882Ov0 w(InterfaceC3882Ov0 interfaceC3882Ov0, Object obj, HA0 ha0, int i, Object obj2) {
        if ((i & 2) != 0) {
            ha0 = new HA0() { // from class: o.lw0
                @Override // o.HA0
                public final Object invoke(Object obj3) {
                    boolean x;
                    x = C8146mw0.x((Throwable) obj3);
                    return Boolean.valueOf(x);
                }
            };
        }
        return C4467Uv0.j1(interfaceC3882Ov0, obj, ha0);
    }

    public static final boolean x(Throwable th) {
        return true;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> y(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> z(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        C4467Uv0.b1();
        throw new SX0();
    }
}
