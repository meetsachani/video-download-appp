package o;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import o.ZI1;

/* loaded from: classes.dex */
public final class ZI1 {
    public static final String a = "KEY_DURATION_MS";
    public static final String b = "KEY_SAMPLING_INTERVAL_BYTES";
    public static final String c = "KEY_TRACK_JAVA_ALLOCATIONS";
    public static final String d = "KEY_FREQUENCY_HZ";
    public static final String e = "KEY_SIZE_KB";
    public static final String f = "KEY_BUFFER_FILL_POLICY";
    public static final int g = 1;
    public static final int h = 2;

    @FV(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<AI1<? super ProfilingResult>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ Context b1;

        /* renamed from: o.ZI1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0253a extends AbstractC8052mY0 implements FA0<C7458kA2> {
            public final /* synthetic */ ProfilingManager X;
            public final /* synthetic */ Consumer<ProfilingResult> Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0253a(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.X = profilingManager;
                this.Y = consumer;
            }

            public final void c() {
                this.X.unregisterForAllProfilingResults(this.Y);
            }

            @Override // o.FA0
            public /* bridge */ /* synthetic */ C7458kA2 invoke() {
                c();
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, HM<? super a> hm) {
            super(2, hm);
            this.b1 = context;
        }

        public static final void l0(AI1 ai1, ProfilingResult profilingResult) {
            C6562gT0.o(profilingResult, "result");
            ai1.B(profilingResult);
        }

        public static final void m0(Runnable runnable) {
            runnable.run();
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
                final AI1 ai1 = (AI1) this.a1;
                Consumer consumer = new Consumer() { // from class: o.XI1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        ZI1.a.l0(AI1.this, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager a = TI1.a(this.b1.getSystemService(SI1.a()));
                a.registerForAllProfilingResults(new Executor() { // from class: o.YI1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        ZI1.a.m0(runnable);
                    }
                }, consumer);
                C0253a c0253a = new C0253a(a, consumer);
                this.Z0 = 1;
                if (C10919yI1.b(ai1, c0253a, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: k0 */
        public final Object i(AI1<? super ProfilingResult> ai1, HM<? super C7458kA2> hm) {
            return ((a) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    public static final InterfaceC3882Ov0<ProfilingResult> a(Context context) {
        C6562gT0.p(context, "context");
        return C4467Uv0.r(new a(context, null));
    }

    public static final void b(Context context, Executor executor, Consumer<ProfilingResult> consumer) {
        C6562gT0.p(context, "context");
        C6562gT0.p(executor, "executor");
        C6562gT0.p(consumer, ServiceSpecificExtraArgs.CastExtraArgs.a);
        TI1.a(context.getSystemService(SI1.a())).registerForAllProfilingResults(executor, consumer);
    }

    public static final void c(Context context, C5055aJ1 c5055aJ1, Executor executor, Consumer<ProfilingResult> consumer) {
        C6562gT0.p(context, "context");
        C6562gT0.p(c5055aJ1, "profilingRequest");
        TI1.a(context.getSystemService(SI1.a())).requestProfiling(c5055aJ1.c(), c5055aJ1.b(), c5055aJ1.d(), c5055aJ1.a(), executor, consumer);
    }

    public static final void d(Context context, Consumer<ProfilingResult> consumer) {
        C6562gT0.p(context, "context");
        C6562gT0.p(consumer, ServiceSpecificExtraArgs.CastExtraArgs.a);
        TI1.a(context.getSystemService(SI1.a())).unregisterForAllProfilingResults(consumer);
    }
}
