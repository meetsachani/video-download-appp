package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n351#2,11:213\n351#2,9:224\n360#2,2:234\n13#3:233\n1#4:236\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,9\n192#1:234,2\n196#1:233\n*E\n"})
/* loaded from: classes3.dex */
public final class YF0 {
    public static final long a = 4611686018427387903L;
    @InterfaceC7058iW0
    @Nullable
    public static final WF0 b;
    @Nullable
    private static volatile Choreographer choreographer;

    @InterfaceC8303na2({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,13:1\n197#2,2:14\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ InterfaceC8396ny X;

        public a(InterfaceC8396ny interfaceC8396ny) {
            this.X = interfaceC8396ny;
        }

        @Override // java.lang.Runnable
        public final void run() {
            YF0.n(this.X);
        }
    }

    static {
        Object b2;
        WF0 wf0 = null;
        try {
            PT1.a aVar = PT1.Y;
            b2 = PT1.b(new VF0(e(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th));
        }
        if (!PT1.i(b2)) {
            wf0 = b2;
        }
        b = wf0;
    }

    @InterfaceC5056aJ2
    @NotNull
    public static final Handler e(@NotNull Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                C6562gT0.n(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Nullable
    public static final Object f(@NotNull HM<? super Long> hm) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
            c8883py.Z();
            l(choreographer2, c8883py);
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        }
        return g(hm);
    }

    public static final Object g(HM<? super Long> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(c8883py);
        } else {
            C8909q40.e().I(c8883py.getContext(), new a(c8883py));
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    @InterfaceC8046mW0(name = "from")
    @InterfaceC8289nW0
    @NotNull
    public static final WF0 h(@NotNull Handler handler) {
        return j(handler, null, 1, null);
    }

    @InterfaceC8046mW0(name = "from")
    @InterfaceC8289nW0
    @NotNull
    public static final WF0 i(@NotNull Handler handler, @Nullable String str) {
        return new VF0(handler, str);
    }

    public static /* synthetic */ WF0 j(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return i(handler, str);
    }

    public static final void l(Choreographer choreographer2, final InterfaceC8396ny<? super Long> interfaceC8396ny) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: o.XF0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                YF0.m(InterfaceC8396ny.this, j);
            }
        });
    }

    public static final void m(InterfaceC8396ny interfaceC8396ny, long j) {
        interfaceC8396ny.E(C8909q40.e(), Long.valueOf(j));
    }

    public static final void n(InterfaceC8396ny<? super Long> interfaceC8396ny) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            C6562gT0.m(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, interfaceC8396ny);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }
}
