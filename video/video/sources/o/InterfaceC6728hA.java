package o;

import o.InterfaceC10362w02;
import o.OO1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.hA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6728hA<E> extends InterfaceC10362w02<E>, OO1<E> {
    @NotNull
    public static final b r = b.a;
    public static final int s = Integer.MAX_VALUE;
    public static final int t = 0;
    public static final int u = -1;
    public static final int v = -2;
    public static final int w = -3;
    @NotNull
    public static final String x = "kotlinx.coroutines.channels.defaultBuffer";

    /* renamed from: o.hA$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static <E> InterfaceC5223b02<E> b(@NotNull InterfaceC6728hA<E> interfaceC6728hA) {
            return OO1.a.d(interfaceC6728hA);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull InterfaceC6728hA<E> interfaceC6728hA, E e) {
            return InterfaceC10362w02.a.c(interfaceC6728hA, e);
        }

        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull InterfaceC6728hA<E> interfaceC6728hA) {
            return (E) OO1.a.h(interfaceC6728hA);
        }

        @R61
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object e(@NotNull InterfaceC6728hA<E> interfaceC6728hA, @NotNull HM<? super E> hm) {
            return OO1.a.i(interfaceC6728hA, hm);
        }
    }

    /* renamed from: o.hA$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final int b = Integer.MAX_VALUE;
        public static final int c = 0;
        public static final int d = -1;
        public static final int e = -2;
        public static final int f = -3;
        @NotNull
        public static final String g = "kotlinx.coroutines.channels.defaultBuffer";
        public static final /* synthetic */ b a = new b();
        public static final int h = C2852Ek2.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int a() {
            return h;
        }
    }
}
