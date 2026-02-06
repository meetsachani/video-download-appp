package o;

import o.OO1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC3681Mt1
/* renamed from: o.u6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC9894u6<E> extends InterfaceC9974uQ, OO1<E> {

    /* renamed from: o.u6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static <E> InterfaceC5223b02<E> b(@NotNull InterfaceC9894u6<E> interfaceC9894u6) {
            return OO1.a.d(interfaceC9894u6);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E c(@NotNull InterfaceC9894u6<E> interfaceC9894u6) {
            return (E) OO1.a.h(interfaceC9894u6);
        }

        @R61
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object d(@NotNull InterfaceC9894u6<E> interfaceC9894u6, @NotNull HM<? super E> hm) {
            return OO1.a.i(interfaceC9894u6, hm);
        }
    }

    @NotNull
    InterfaceC6728hA<E> a();
}
