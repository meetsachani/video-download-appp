package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface OO1<E> {
    @Nullable
    Object D(@NotNull HM<? super C10642xA<? extends E>> hm);

    @NotNull
    InterfaceC5223b02<E> J();

    @NotNull
    InterfaceC5223b02<C10642xA<E>> L();

    @NotNull
    InterfaceC5223b02<E> R();

    @NotNull
    Object U();

    @R61
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    Object V(@NotNull HM<? super E> hm);

    boolean b();

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean d(Throwable th);

    @Nullable
    Object g0(@NotNull HM<? super E> hm);

    void i(@Nullable CancellationException cancellationException);

    boolean isEmpty();

    @NotNull
    InterfaceC9181rA<E> iterator();

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    /* loaded from: classes3.dex */
    public static final class a {

        @FV(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {380}, m = "receiveOrNull", n = {}, s = {})
        /* renamed from: o.OO1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0219a<E> extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;

            public C0219a(HM<? super C0219a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            @Nullable
            public final Object F(@NotNull Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(OO1 oo1, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                oo1.i(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(OO1 oo1, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return oo1.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @NotNull
        public static <E> InterfaceC5223b02<E> d(@NotNull OO1<? extends E> oo1) {
            C6562gT0.n(oo1, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((C10804xq) oo1).R();
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E h(@NotNull OO1<? extends E> oo1) {
            Object U = oo1.U();
            if (C10642xA.m(U)) {
                return (E) C10642xA.i(U);
            }
            Throwable f = C10642xA.f(U);
            if (f == null) {
                return null;
            }
            throw C2718Db2.o(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @R61
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> Object i(@NotNull OO1<? extends E> oo1, @NotNull HM<? super E> hm) {
            C0219a c0219a;
            int i;
            Object D;
            if (hm instanceof C0219a) {
                c0219a = (C0219a) hm;
                int i2 = c0219a.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0219a.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = c0219a.Y0;
                    Object l = C7289jT0.l();
                    i = c0219a.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            RT1.n(obj);
                            D = ((C10642xA) obj).o();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        c0219a.Z0 = 1;
                        D = oo1.D(c0219a);
                        if (D == l) {
                            return l;
                        }
                    }
                    return C10642xA.h(D);
                }
            }
            c0219a = new C0219a(hm);
            Object obj2 = c0219a.Y0;
            Object l2 = C7289jT0.l();
            i = c0219a.Z0;
            if (i == 0) {
            }
            return C10642xA.h(D);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @IR1(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @InterfaceC6442g20
        public static /* synthetic */ void f() {
        }

        @InterfaceC2951Fi0
        public static /* synthetic */ void g() {
        }
    }
}
