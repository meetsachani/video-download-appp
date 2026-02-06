package o;

import o.InterfaceC5809dQ;
import o.LM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6480g82(version = "1.3")
/* renamed from: o.dQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5809dQ {

    /* renamed from: o.dQ$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static InterfaceC5809dQ b(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC5809dQ interfaceC5809dQ2) {
            C6562gT0.p(interfaceC5809dQ2, "context");
            if (interfaceC5809dQ2 == C3897Pa0.X) {
                return interfaceC5809dQ;
            }
            return (InterfaceC5809dQ) interfaceC5809dQ2.m(interfaceC5809dQ, new VA0() { // from class: o.cQ
                @Override // o.VA0
                public final Object i(Object obj, Object obj2) {
                    InterfaceC5809dQ c;
                    c = InterfaceC5809dQ.a.c((InterfaceC5809dQ) obj, (InterfaceC5809dQ.b) obj2);
                    return c;
                }
            });
        }

        public static InterfaceC5809dQ c(InterfaceC5809dQ interfaceC5809dQ, b bVar) {
            C6562gT0.p(interfaceC5809dQ, "acc");
            C6562gT0.p(bVar, "element");
            InterfaceC5809dQ j = interfaceC5809dQ.j(bVar.getKey());
            C3897Pa0 c3897Pa0 = C3897Pa0.X;
            if (j == c3897Pa0) {
                return bVar;
            }
            LM.b bVar2 = LM.y;
            LM lm = (LM) j.f(bVar2);
            if (lm == null) {
                return new EG(j, bVar);
            }
            InterfaceC5809dQ j2 = j.j(bVar2);
            if (j2 == c3897Pa0) {
                return new EG(bVar, lm);
            }
            return new EG(new EG(j2, bVar), lm);
        }
    }

    /* renamed from: o.dQ$b */
    /* loaded from: classes3.dex */
    public interface b extends InterfaceC5809dQ {

        /* renamed from: o.dQ$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(@NotNull b bVar, R r, @NotNull VA0<? super R, ? super b, ? extends R> va0) {
                C6562gT0.p(va0, "operation");
                return va0.i(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends b> E b(@NotNull b bVar, @NotNull c<E> cVar) {
                C6562gT0.p(cVar, "key");
                if (C6562gT0.g(bVar.getKey(), cVar)) {
                    C6562gT0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            @NotNull
            public static InterfaceC5809dQ c(@NotNull b bVar, @NotNull c<?> cVar) {
                C6562gT0.p(cVar, "key");
                if (C6562gT0.g(bVar.getKey(), cVar)) {
                    return C3897Pa0.X;
                }
                return bVar;
            }

            @NotNull
            public static InterfaceC5809dQ d(@NotNull b bVar, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
                C6562gT0.p(interfaceC5809dQ, "context");
                return a.b(bVar, interfaceC5809dQ);
            }
        }

        @Override // o.InterfaceC5809dQ
        @Nullable
        <E extends b> E f(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();

        @Override // o.InterfaceC5809dQ
        @NotNull
        InterfaceC5809dQ j(@NotNull c<?> cVar);

        @Override // o.InterfaceC5809dQ
        <R> R m(R r, @NotNull VA0<? super R, ? super b, ? extends R> va0);
    }

    /* renamed from: o.dQ$c */
    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    @NotNull
    InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ);

    @Nullable
    <E extends b> E f(@NotNull c<E> cVar);

    @NotNull
    InterfaceC5809dQ j(@NotNull c<?> cVar);

    <R> R m(R r, @NotNull VA0<? super R, ? super b, ? extends R> va0);
}
