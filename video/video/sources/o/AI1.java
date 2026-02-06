package o;

import o.InterfaceC10362w02;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface AI1<E> extends InterfaceC9974uQ, InterfaceC10362w02<E> {

    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@NotNull AI1<? super E> ai1, E e) {
            return InterfaceC10362w02.a.c(ai1, e);
        }
    }

    @NotNull
    InterfaceC10362w02<E> a();
}
