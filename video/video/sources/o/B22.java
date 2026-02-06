package o;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class B22 extends A22 {
    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <E> Set<E> i(int i, @InterfaceC5183ar HA0<? super Set<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Set e = A22.e(i);
        ha0.invoke(e);
        return A22.a(e);
    }

    @XP0
    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final <E> Set<E> j(@InterfaceC5183ar HA0<? super Set<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Set d = A22.d();
        ha0.invoke(d);
        return A22.a(d);
    }

    @NotNull
    public static <T> Set<T> k() {
        return C8305nb0.X;
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @NotNull
    public static <T> HashSet<T> m(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return (HashSet) C7330jf.zy(tArr, new HashSet(C8683p81.j(tArr.length)));
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @NotNull
    public static final <T> LinkedHashSet<T> o(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return (LinkedHashSet) C7330jf.zy(tArr, new LinkedHashSet(C8683p81.j(tArr.length)));
    }

    @XP0
    @InterfaceC6480g82(version = "1.1")
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @NotNull
    public static <T> Set<T> q(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return (Set) C7330jf.zy(tArr, new LinkedHashSet(C8683p81.j(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> r(@NotNull Set<? extends T> set) {
        C6562gT0.p(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size != 1) {
                return set;
            }
            return A22.f(set.iterator().next());
        }
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> Set<T> s(Set<? extends T> set) {
        if (set == 0) {
            return k();
        }
        return set;
    }

    @XP0
    public static final <T> Set<T> t() {
        return k();
    }

    @NotNull
    public static <T> Set<T> u(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return C7330jf.wz(tArr);
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> Set<T> v(@Nullable T t) {
        if (t != null) {
            return A22.f(t);
        }
        return k();
    }

    @InterfaceC6480g82(version = "1.4")
    @NotNull
    public static final <T> Set<T> w(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return (Set) C7330jf.db(tArr, new LinkedHashSet());
    }
}
