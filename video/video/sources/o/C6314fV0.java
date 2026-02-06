package o;

import java.util.concurrent.CancellationException;
import o.InterfaceC5809dQ;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,677:1\n1317#2,2:678\n1317#2,2:680\n1317#2,2:682\n1317#2,2:684\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n505#1:678,2\n519#1:680,2\n613#1:682,2\n637#1:684,2\n*E\n"})
/* renamed from: o.fV0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6314fV0 {

    /* renamed from: o.fV0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C7964mB0 implements HA0<Throwable, C7458kA2> {
        public a(Object obj) {
            super(1, obj, AbstractC6569gV0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            u0(th);
            return C7458kA2.a;
        }

        public final void u0(Throwable th) {
            ((AbstractC6569gV0) this.Y).F(th);
        }
    }

    @NotNull
    public static final B40 A(@NotNull RU0 ru0, boolean z, @NotNull AbstractC6569gV0 abstractC6569gV0) {
        if (ru0 instanceof C6812hV0) {
            return ((C6812hV0) ru0).c1(z, abstractC6569gV0);
        }
        return ru0.Q(abstractC6569gV0.E(), z, new a(abstractC6569gV0));
    }

    public static /* synthetic */ B40 B(RU0 ru0, boolean z, AbstractC6569gV0 abstractC6569gV0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return C5829dV0.B(ru0, z, abstractC6569gV0);
    }

    public static final boolean C(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null) {
            return ru0.h();
        }
        return true;
    }

    public static final Throwable D(Throwable th, RU0 ru0) {
        if (th == null) {
            return new SU0("Job was cancelled", null, ru0);
        }
        return th;
    }

    @NotNull
    public static final MH a(@Nullable RU0 ru0) {
        return new TU0(ru0);
    }

    @InterfaceC8046mW0(name = "Job")
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ RU0 b(RU0 ru0) {
        return C5829dV0.a(ru0);
    }

    public static /* synthetic */ MH c(RU0 ru0, int i, Object obj) {
        if ((i & 1) != 0) {
            ru0 = null;
        }
        return C5829dV0.a(ru0);
    }

    public static /* synthetic */ RU0 d(RU0 ru0, int i, Object obj) {
        RU0 b;
        if ((i & 1) != 0) {
            ru0 = null;
        }
        b = b(ru0);
        return b;
    }

    public static final void f(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable CancellationException cancellationException) {
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null) {
            ru0.i(cancellationException);
        }
    }

    public static final void g(@NotNull RU0 ru0, @NotNull String str, @Nullable Throwable th) {
        ru0.i(C3722Nf0.a(str, th));
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(InterfaceC5809dQ interfaceC5809dQ, Throwable th) {
        C6812hV0 c6812hV0;
        InterfaceC5809dQ.b f = interfaceC5809dQ.f(RU0.W);
        if (f instanceof C6812hV0) {
            c6812hV0 = (C6812hV0) f;
        } else {
            c6812hV0 = null;
        }
        if (c6812hV0 == null) {
            return false;
        }
        c6812hV0.x0(D(th, c6812hV0));
        return true;
    }

    public static /* synthetic */ void i(InterfaceC5809dQ interfaceC5809dQ, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5829dV0.f(interfaceC5809dQ, cancellationException);
    }

    public static /* synthetic */ void j(RU0 ru0, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        C5829dV0.g(ru0, str, th);
    }

    public static /* synthetic */ boolean k(InterfaceC5809dQ interfaceC5809dQ, Throwable th, int i, Object obj) {
        boolean h;
        if ((i & 1) != 0) {
            th = null;
        }
        h = h(interfaceC5809dQ, th);
        return h;
    }

    @Nullable
    public static final Object l(@NotNull RU0 ru0, @NotNull HM<? super C7458kA2> hm) {
        RU0.a.b(ru0, null, 1, null);
        Object T = ru0.T(hm);
        if (T == C7289jT0.l()) {
            return T;
        }
        return C7458kA2.a;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(InterfaceC5809dQ interfaceC5809dQ, Throwable th) {
        C6812hV0 c6812hV0;
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null) {
            for (RU0 ru02 : ru0.r()) {
                if (ru02 instanceof C6812hV0) {
                    c6812hV0 = (C6812hV0) ru02;
                } else {
                    c6812hV0 = null;
                }
                if (c6812hV0 != null) {
                    c6812hV0.x0(D(th, ru0));
                }
            }
        }
    }

    public static final void o(@NotNull InterfaceC5809dQ interfaceC5809dQ, @Nullable CancellationException cancellationException) {
        B02<RU0> r;
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null && (r = ru0.r()) != null) {
            for (RU0 ru02 : r) {
                ru02.i(cancellationException);
            }
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(RU0 ru0, Throwable th) {
        C6812hV0 c6812hV0;
        for (RU0 ru02 : ru0.r()) {
            if (ru02 instanceof C6812hV0) {
                c6812hV0 = (C6812hV0) ru02;
            } else {
                c6812hV0 = null;
            }
            if (c6812hV0 != null) {
                c6812hV0.x0(D(th, ru0));
            }
        }
    }

    public static final void r(@NotNull RU0 ru0, @Nullable CancellationException cancellationException) {
        for (RU0 ru02 : ru0.r()) {
            ru02.i(cancellationException);
        }
    }

    public static /* synthetic */ void s(InterfaceC5809dQ interfaceC5809dQ, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        n(interfaceC5809dQ, th);
    }

    public static /* synthetic */ void t(InterfaceC5809dQ interfaceC5809dQ, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5829dV0.o(interfaceC5809dQ, cancellationException);
    }

    public static /* synthetic */ void u(RU0 ru0, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        q(ru0, th);
    }

    public static /* synthetic */ void v(RU0 ru0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5829dV0.r(ru0, cancellationException);
    }

    @NotNull
    public static final B40 w(@NotNull RU0 ru0, @NotNull B40 b40) {
        B40 B;
        B = B(ru0, false, new D40(b40), 1, null);
        return B;
    }

    public static final void x(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null) {
            C5829dV0.z(ru0);
        }
    }

    public static final void y(@NotNull RU0 ru0) {
        if (ru0.h()) {
            return;
        }
        throw ru0.u();
    }

    @NotNull
    public static final RU0 z(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null) {
            return ru0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC5809dQ).toString());
    }
}
