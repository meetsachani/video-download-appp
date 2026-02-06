package o;

import java.io.Serializable;
import o.InterfaceC5809dQ;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public final class EG implements InterfaceC5809dQ, Serializable {
    @NotNull
    public final InterfaceC5809dQ X;
    @NotNull
    public final InterfaceC5809dQ.b Y;

    @InterfaceC8303na2({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12883#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a implements Serializable {
        @NotNull
        public static final C0180a Y = new C0180a(null);
        private static final long serialVersionUID = 0;
        @NotNull
        public final InterfaceC5809dQ[] X;

        /* renamed from: o.EG$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0180a {
            public /* synthetic */ C0180a(C9516sY c9516sY) {
                this();
            }

            public C0180a() {
            }
        }

        public a(@NotNull InterfaceC5809dQ[] interfaceC5809dQArr) {
            C6562gT0.p(interfaceC5809dQArr, "elements");
            this.X = interfaceC5809dQArr;
        }

        private final Object readResolve() {
            InterfaceC5809dQ[] interfaceC5809dQArr = this.X;
            InterfaceC5809dQ interfaceC5809dQ = C3897Pa0.X;
            for (InterfaceC5809dQ interfaceC5809dQ2 : interfaceC5809dQArr) {
                interfaceC5809dQ = interfaceC5809dQ.M(interfaceC5809dQ2);
            }
            return interfaceC5809dQ;
        }

        @NotNull
        public final InterfaceC5809dQ[] a() {
            return this.X;
        }
    }

    public EG(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC5809dQ.b bVar) {
        C6562gT0.p(interfaceC5809dQ, "left");
        C6562gT0.p(bVar, "element");
        this.X = interfaceC5809dQ;
        this.Y = bVar;
    }

    private final int g() {
        int i = 2;
        EG eg = this;
        while (true) {
            InterfaceC5809dQ interfaceC5809dQ = eg.X;
            if (interfaceC5809dQ instanceof EG) {
                eg = (EG) interfaceC5809dQ;
            } else {
                eg = null;
            }
            if (eg == null) {
                return i;
            }
            i++;
        }
    }

    public static final String o(String str, InterfaceC5809dQ.b bVar) {
        C6562gT0.p(str, "acc");
        C6562gT0.p(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + C6566gU0.h + bVar;
    }

    public static final C7458kA2 q(InterfaceC5809dQ[] interfaceC5809dQArr, RP1.f fVar, C7458kA2 c7458kA2, InterfaceC5809dQ.b bVar) {
        C6562gT0.p(c7458kA2, "<unused var>");
        C6562gT0.p(bVar, "element");
        int i = fVar.X;
        fVar.X = i + 1;
        interfaceC5809dQArr[i] = bVar;
        return C7458kA2.a;
    }

    private final Object writeReplace() {
        int g = g();
        final InterfaceC5809dQ[] interfaceC5809dQArr = new InterfaceC5809dQ[g];
        final RP1.f fVar = new RP1.f();
        m(C7458kA2.a, new VA0() { // from class: o.CG
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                C7458kA2 q;
                q = EG.q(interfaceC5809dQArr, fVar, (C7458kA2) obj, (InterfaceC5809dQ.b) obj2);
                return q;
            }
        });
        if (fVar.X == g) {
            return new a(interfaceC5809dQArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return InterfaceC5809dQ.a.b(this, interfaceC5809dQ);
    }

    public final boolean c(InterfaceC5809dQ.b bVar) {
        return C6562gT0.g(f(bVar.getKey()), bVar);
    }

    public final boolean e(EG eg) {
        while (c(eg.Y)) {
            InterfaceC5809dQ interfaceC5809dQ = eg.X;
            if (interfaceC5809dQ instanceof EG) {
                eg = (EG) interfaceC5809dQ;
            } else {
                C6562gT0.n(interfaceC5809dQ, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((InterfaceC5809dQ.b) interfaceC5809dQ);
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof EG) {
                EG eg = (EG) obj;
                if (eg.g() != g() || !eg.e(this)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        C6562gT0.p(cVar, "key");
        EG eg = this;
        while (true) {
            E e = (E) eg.Y.f(cVar);
            if (e != null) {
                return e;
            }
            InterfaceC5809dQ interfaceC5809dQ = eg.X;
            if (interfaceC5809dQ instanceof EG) {
                eg = (EG) interfaceC5809dQ;
            } else {
                return (E) interfaceC5809dQ.f(cVar);
            }
        }
    }

    public int hashCode() {
        return this.X.hashCode() + this.Y.hashCode();
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        C6562gT0.p(cVar, "key");
        if (this.Y.f(cVar) != null) {
            return this.X;
        }
        InterfaceC5809dQ j = this.X.j(cVar);
        if (j == this.X) {
            return this;
        }
        if (j == C3897Pa0.X) {
            return this.Y;
        }
        return new EG(j, this.Y);
    }

    @Override // o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        C6562gT0.p(va0, "operation");
        return va0.i((Object) this.X.m(r, va0), this.Y);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) m("", new VA0() { // from class: o.DG
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                String o2;
                o2 = EG.o((String) obj, (InterfaceC5809dQ.b) obj2);
                return o2;
            }
        })) + ']';
    }
}
