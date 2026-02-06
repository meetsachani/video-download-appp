package o;

import java.util.concurrent.CancellationException;
import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10767xg2(markerClass = InterfaceC10715xS0.class)
/* loaded from: classes3.dex */
public interface RU0 extends InterfaceC5809dQ.b {
    @NotNull
    public static final b W = b.X;

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC5809dQ.c<RU0> {
        public static final /* synthetic */ b X = new b();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    RU0 A(@NotNull RU0 ru0);

    @InterfaceC10472wS0
    @NotNull
    ZB O(@NotNull InterfaceC5268bC interfaceC5268bC);

    @InterfaceC10472wS0
    @NotNull
    B40 Q(boolean z, boolean z2, @NotNull HA0<? super Throwable, C7458kA2> ha0);

    @Nullable
    Object T(@NotNull HM<? super C7458kA2> hm);

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean d(Throwable th);

    @NotNull
    ZZ1 e0();

    @Nullable
    RU0 getParent();

    boolean h();

    void i(@Nullable CancellationException cancellationException);

    @NotNull
    B40 i0(@NotNull HA0<? super Throwable, C7458kA2> ha0);

    boolean isCancelled();

    boolean l();

    @NotNull
    B02<RU0> r();

    boolean start();

    @InterfaceC10472wS0
    @NotNull
    CancellationException u();

    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(RU0 ru0) {
            ru0.i(null);
        }

        public static /* synthetic */ void b(RU0 ru0, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                ru0.i(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(RU0 ru0, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return ru0.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R d(@NotNull RU0 ru0, R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) InterfaceC5809dQ.b.a.a(ru0, r, va0);
        }

        @Nullable
        public static <E extends InterfaceC5809dQ.b> E e(@NotNull RU0 ru0, @NotNull InterfaceC5809dQ.c<E> cVar) {
            return (E) InterfaceC5809dQ.b.a.b(ru0, cVar);
        }

        public static /* synthetic */ B40 g(RU0 ru0, boolean z, boolean z2, HA0 ha0, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return ru0.Q(z, z2, ha0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @NotNull
        public static InterfaceC5809dQ h(@NotNull RU0 ru0, @NotNull InterfaceC5809dQ.c<?> cVar) {
            return InterfaceC5809dQ.b.a.c(ru0, cVar);
        }

        @NotNull
        public static InterfaceC5809dQ i(@NotNull RU0 ru0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
            return InterfaceC5809dQ.b.a.d(ru0, interfaceC5809dQ);
        }

        @InterfaceC2951Fi0
        public static /* synthetic */ void f() {
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static RU0 j(@NotNull RU0 ru0, @NotNull RU0 ru02) {
            return ru02;
        }
    }
}
