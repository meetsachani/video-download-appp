package o;

import java.util.concurrent.CancellationException;
import o.InterfaceC10362w02;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@InterfaceC3681Mt1
/* renamed from: o.xp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10800xp<E> extends InterfaceC10362w02<E> {

    /* renamed from: o.xp$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC10800xp interfaceC10800xp, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                interfaceC10800xp.i(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean b(InterfaceC10800xp interfaceC10800xp, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC10800xp.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull InterfaceC10800xp<E> interfaceC10800xp, E e) {
            return InterfaceC10362w02.a.c(interfaceC10800xp, e);
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility only")
    /* synthetic */ boolean d(Throwable th);

    void i(@Nullable CancellationException cancellationException);

    @NotNull
    OO1<E> z();
}
