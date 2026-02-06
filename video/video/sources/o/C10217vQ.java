package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.vQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10217vQ {
    @NotNull
    public static final InterfaceC9974uQ a(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        if (interfaceC5809dQ.f(RU0.W) == null) {
            interfaceC5809dQ = interfaceC5809dQ.M(C5829dV0.c(null, 1, null));
        }
        return new C11176zM(interfaceC5809dQ);
    }

    @NotNull
    public static final InterfaceC9974uQ b() {
        return new C11176zM(C8088mh2.c(null, 1, null).M(C8909q40.e()));
    }

    public static final void c(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull String str, @Nullable Throwable th) {
        d(interfaceC9974uQ, C3722Nf0.a(str, th));
    }

    public static final void d(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable CancellationException cancellationException) {
        RU0 ru0 = (RU0) interfaceC9974uQ.a0().f(RU0.W);
        if (ru0 != null) {
            ru0.i(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC9974uQ).toString());
    }

    public static /* synthetic */ void e(InterfaceC9974uQ interfaceC9974uQ, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c(interfaceC9974uQ, str, th);
    }

    public static /* synthetic */ void f(InterfaceC9974uQ interfaceC9974uQ, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        d(interfaceC9974uQ, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super R>, ? extends Object> va0, @NotNull HM<? super R> hm) {
        MY1 my1 = new MY1(hm.getContext(), hm);
        Object b = Rz2.b(my1, my1, va0);
        if (b == C7289jT0.l()) {
            MV.c(hm);
        }
        return b;
    }

    @Nullable
    public static final Object h(@NotNull HM<? super InterfaceC5809dQ> hm) {
        return hm.getContext();
    }

    public static final Object i(HM<? super InterfaceC5809dQ> hm) {
        UP0.e(3);
        throw null;
    }

    public static final void j(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        C5829dV0.y(interfaceC9974uQ.a0());
    }

    public static final boolean k(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        RU0 ru0 = (RU0) interfaceC9974uQ.a0().f(RU0.W);
        if (ru0 != null) {
            return ru0.h();
        }
        return true;
    }

    @NotNull
    public static final InterfaceC9974uQ m(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return new C11176zM(interfaceC9974uQ.a0().M(interfaceC5809dQ));
    }

    public static /* synthetic */ void l(InterfaceC9974uQ interfaceC9974uQ) {
    }
}
