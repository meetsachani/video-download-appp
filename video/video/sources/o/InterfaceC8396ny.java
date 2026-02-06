package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10767xg2(markerClass = InterfaceC10715xS0.class)
/* renamed from: o.ny  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8396ny<T> extends HM<T> {

    /* renamed from: o.ny$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC8396ny interfaceC8396ny, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC8396ny.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(InterfaceC8396ny interfaceC8396ny, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return interfaceC8396ny.o(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    @InterfaceC2951Fi0
    void E(@NotNull AbstractC7762lQ abstractC7762lQ, T t);

    @InterfaceC10472wS0
    @Nullable
    <R extends T> Object I(R r, @Nullable Object obj, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0);

    <R extends T> void K(R r, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0);

    void X(@NotNull HA0<? super Throwable, C7458kA2> ha0);

    @InterfaceC10472wS0
    void Z();

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @IR1(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void b0(T t, @Nullable HA0<? super Throwable, C7458kA2> ha0);

    boolean d(@Nullable Throwable th);

    @InterfaceC2951Fi0
    void f0(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull Throwable th);

    boolean h();

    boolean isCancelled();

    @InterfaceC10472wS0
    void j0(@NotNull Object obj);

    boolean l();

    @InterfaceC10472wS0
    @Nullable
    Object o(T t, @Nullable Object obj);

    @InterfaceC10472wS0
    @Nullable
    Object w(@NotNull Throwable th);
}
