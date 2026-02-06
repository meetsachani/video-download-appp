package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public interface LM extends InterfaceC5809dQ.b {
    @NotNull
    public static final b y = b.X;

    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R a(@NotNull LM lm, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            C6562gT0.p(va0, "operation");
            return (R) InterfaceC5809dQ.b.a.a(lm, r, va0);
        }

        @Nullable
        public static <E extends InterfaceC5809dQ.b> E b(@NotNull LM lm, @NotNull InterfaceC5809dQ.c<E> cVar) {
            E e;
            C6562gT0.p(cVar, "key");
            if (cVar instanceof AbstractC9870u0) {
                AbstractC9870u0 abstractC9870u0 = (AbstractC9870u0) cVar;
                if (!abstractC9870u0.a(lm.getKey()) || (e = (E) abstractC9870u0.b(lm)) == null) {
                    return null;
                }
                return e;
            } else if (LM.y != cVar) {
                return null;
            } else {
                C6562gT0.n(lm, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return lm;
            }
        }

        @NotNull
        public static InterfaceC5809dQ c(@NotNull LM lm, @NotNull InterfaceC5809dQ.c<?> cVar) {
            C6562gT0.p(cVar, "key");
            if (cVar instanceof AbstractC9870u0) {
                AbstractC9870u0 abstractC9870u0 = (AbstractC9870u0) cVar;
                if (abstractC9870u0.a(lm.getKey()) && abstractC9870u0.b(lm) != null) {
                    return C3897Pa0.X;
                }
                return lm;
            } else if (LM.y == cVar) {
                return C3897Pa0.X;
            } else {
                return lm;
            }
        }

        @NotNull
        public static InterfaceC5809dQ d(@NotNull LM lm, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            C6562gT0.p(interfaceC5809dQ, "context");
            return InterfaceC5809dQ.b.a.d(lm, interfaceC5809dQ);
        }

        public static void e(@NotNull LM lm, @NotNull HM<?> hm) {
            C6562gT0.p(hm, "continuation");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC5809dQ.c<LM> {
        public static final /* synthetic */ b X = new b();
    }

    @NotNull
    <T> HM<T> H(@NotNull HM<? super T> hm);

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @Nullable
    <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar);

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @NotNull
    InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar);

    void s(@NotNull HM<?> hm);
}
