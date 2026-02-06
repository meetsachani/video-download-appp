package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.w02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10362w02<E> {
    @NotNull
    Object B(E e);

    boolean W(@Nullable Throwable th);

    void c(@NotNull HA0<? super Throwable, C7458kA2> ha0);

    @Nullable
    Object d0(E e, @NotNull HM<? super C7458kA2> hm);

    @NotNull
    InterfaceC5708d02<E, InterfaceC10362w02<E>> e();

    boolean h0();

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e);

    /* renamed from: o.w02$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC10362w02 interfaceC10362w02, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC10362w02.W(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull InterfaceC10362w02<? super E> interfaceC10362w02, E e) {
            Object B = interfaceC10362w02.B(e);
            if (C10642xA.m(B)) {
                return true;
            }
            Throwable f = C10642xA.f(B);
            if (f == null) {
                return false;
            }
            throw C2718Db2.o(f);
        }

        @InterfaceC6442g20
        public static /* synthetic */ void b() {
        }
    }
}
