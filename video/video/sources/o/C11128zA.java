package o;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.zA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11128zA {
    @NotNull
    public static final String a = "Channel was closed";

    @HK1
    @NotNull
    public static final <E, R> OO1<R> J(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super R>, ? extends Object> va0) {
        return FA.M(oo1, interfaceC5809dQ, va0);
    }

    @HK1
    @NotNull
    public static final <E, R> OO1<R> L(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull XA0<? super Integer, ? super E, ? super HM<? super R>, ? extends Object> xa0) {
        return FA.O(oo1, interfaceC5809dQ, xa0);
    }

    @HK1
    public static final void b(@NotNull OO1<?> oo1, @Nullable Throwable th) {
        BA.a(oo1, th);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @InterfaceC3681Mt1
    public static final <E, R> R c(@NotNull InterfaceC10800xp<E> interfaceC10800xp, @NotNull HA0<? super OO1<? extends E>, ? extends R> ha0) {
        return (R) FA.e(interfaceC10800xp, ha0);
    }

    public static final <E, R> R d(@NotNull OO1<? extends E> oo1, @NotNull HA0<? super OO1<? extends E>, ? extends R> ha0) {
        return (R) BA.b(oo1, ha0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Nullable
    public static final <E> Object e(@NotNull InterfaceC10800xp<E> interfaceC10800xp, @NotNull HA0<? super E, C7458kA2> ha0, @NotNull HM<? super C7458kA2> hm) {
        return FA.f(interfaceC10800xp, ha0, hm);
    }

    @HK1
    @Nullable
    public static final <E, C extends InterfaceC10362w02<? super E>> Object e0(@NotNull OO1<? extends E> oo1, @NotNull C c, @NotNull HM<? super C> hm) {
        return FA.e0(oo1, c, hm);
    }

    @Nullable
    public static final <E> Object f(@NotNull OO1<? extends E> oo1, @NotNull HA0<? super E, C7458kA2> ha0, @NotNull HM<? super C7458kA2> hm) {
        return BA.c(oo1, ha0, hm);
    }

    @HK1
    @Nullable
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull OO1<? extends E> oo1, @NotNull C c, @NotNull HM<? super C> hm) {
        return FA.f0(oo1, c, hm);
    }

    @HK1
    @NotNull
    public static final HA0<Throwable, C7458kA2> g(@NotNull OO1<?> oo1) {
        return FA.h(oo1);
    }

    @Nullable
    public static final <E> Object g0(@NotNull OO1<? extends E> oo1, @NotNull HM<? super List<? extends E>> hm) {
        return BA.g(oo1, hm);
    }

    @HK1
    @NotNull
    public static final HA0<Throwable, C7458kA2> h(@NotNull OO1<?>... oo1Arr) {
        return FA.j(oo1Arr);
    }

    @HK1
    @Nullable
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@NotNull OO1<? extends C4180Rx1<? extends K, ? extends V>> oo1, @NotNull M m, @NotNull HM<? super M> hm) {
        return FA.g0(oo1, m, hm);
    }

    @HK1
    @NotNull
    public static final <E, K> OO1<E> k(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super K>, ? extends Object> va0) {
        return FA.n(oo1, interfaceC5809dQ, va0);
    }

    @HK1
    @Nullable
    public static final <E> Object k0(@NotNull OO1<? extends E> oo1, @NotNull HM<? super Set<E>> hm) {
        return FA.j0(oo1, hm);
    }

    @NotNull
    public static final <E> Object m0(@NotNull InterfaceC10362w02<? super E> interfaceC10362w02, E e) {
        return AA.b(interfaceC10362w02, e);
    }

    @HK1
    @NotNull
    public static final <E, R, V> OO1<V> q0(@NotNull OO1<? extends E> oo1, @NotNull OO1<? extends R> oo12, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super R, ? extends V> va0) {
        return FA.o0(oo1, oo12, interfaceC5809dQ, va0);
    }

    @HK1
    @NotNull
    public static final <E> OO1<E> s(@NotNull OO1<? extends E> oo1, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull VA0<? super E, ? super HM<? super Boolean>, ? extends Object> va0) {
        return FA.v(oo1, interfaceC5809dQ, va0);
    }

    @HK1
    @NotNull
    public static final <E> OO1<E> y(@NotNull OO1<? extends E> oo1) {
        return FA.B(oo1);
    }
}
