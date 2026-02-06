package o;

import java.util.concurrent.CancellationException;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n1#2:209\n103#3,10:210\n114#3,2:224\n206#4:220\n207#4:223\n57#5,2:221\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n83#1:210,10\n83#1:224,2\n96#1:220\n96#1:223\n96#1:221,2\n*E\n"})
/* renamed from: o.m40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7918m40<T> extends AbstractRunnableC3650Ml2 {
    @InterfaceC7058iW0
    public int Z;

    public AbstractC7918m40(int i) {
        this.Z = i;
    }

    @NotNull
    public abstract HM<T> b();

    @Nullable
    public Throwable c(@Nullable Object obj) {
        QH qh;
        if (obj instanceof QH) {
            qh = (QH) obj;
        } else {
            qh = null;
        }
        if (qh == null) {
            return null;
        }
        return qh.a;
    }

    public final void f(@NotNull Throwable th) {
        C8753pQ.b(b().getContext(), new C11192zQ("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Qz2<?> qz2;
        try {
            HM<T> b = b();
            C6562gT0.n(b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C7189j40 c7189j40 = (C7189j40) b;
            HM<T> hm = c7189j40.Z0;
            Object obj = c7189j40.b1;
            InterfaceC5809dQ context = hm.getContext();
            Object i = C10795xn2.i(context, obj);
            RU0 ru0 = null;
            if (i != C10795xn2.a) {
                qz2 = C7035iQ.m(hm, context, i);
            } else {
                qz2 = null;
            }
            InterfaceC5809dQ context2 = hm.getContext();
            Object j = j();
            Throwable c = c(j);
            if (c == null && C8179n40.c(this.Z)) {
                ru0 = (RU0) context2.f(RU0.W);
            }
            if (ru0 != null && !ru0.h()) {
                CancellationException u = ru0.u();
                a(j, u);
                PT1.a aVar = PT1.Y;
                hm.q(PT1.b(RT1.a(u)));
            } else if (c != null) {
                PT1.a aVar2 = PT1.Y;
                hm.q(PT1.b(RT1.a(c)));
            } else {
                PT1.a aVar3 = PT1.Y;
                hm.q(PT1.b(e(j)));
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            if (qz2 != null && !qz2.T1()) {
                return;
            }
            C10795xn2.f(context, i);
        } catch (Throwable th) {
            f(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(@Nullable Object obj) {
        return obj;
    }

    public void a(@Nullable Object obj, @NotNull Throwable th) {
    }
}
