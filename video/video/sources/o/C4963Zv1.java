package o;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Zv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4963Zv1 {
    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final <T> B02<T> a(@NotNull Optional<? extends T> optional) {
        C6562gT0.p(optional, "<this>");
        if (optional.isPresent()) {
            return U02.A(optional.get());
        }
        return U02.l();
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <T> T b(@NotNull Optional<? extends T> optional, T t) {
        C6562gT0.p(optional, "<this>");
        if (optional.isPresent()) {
            return optional.get();
        }
        return t;
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <T> T c(@NotNull Optional<? extends T> optional, @NotNull FA0<? extends T> fa0) {
        C6562gT0.p(optional, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        if (optional.isPresent()) {
            return optional.get();
        }
        return fa0.invoke();
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @Nullable
    public static final <T> T d(@NotNull Optional<T> optional) {
        C6562gT0.p(optional, "<this>");
        return optional.orElse(null);
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final <T, C extends Collection<? super T>> C e(@NotNull Optional<T> optional, @NotNull C c) {
        C6562gT0.p(optional, "<this>");
        C6562gT0.p(c, "destination");
        if (optional.isPresent()) {
            T t = optional.get();
            C6562gT0.o(t, "get(...)");
            c.add(t);
        }
        return c;
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final <T> List<T> f(@NotNull Optional<? extends T> optional) {
        C6562gT0.p(optional, "<this>");
        if (optional.isPresent()) {
            return C7979mF.k(optional.get());
        }
        return C8222nF.H();
    }

    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public static final <T> Set<T> g(@NotNull Optional<? extends T> optional) {
        C6562gT0.p(optional, "<this>");
        if (optional.isPresent()) {
            return A22.f(optional.get());
        }
        return B22.k();
    }
}
