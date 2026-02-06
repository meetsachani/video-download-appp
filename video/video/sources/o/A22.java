package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class A22 {
    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <E> Set<E> a(@NotNull Set<E> set) {
        C6562gT0.p(set, "builder");
        return ((C7912m22) set).e();
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <E> Set<E> b(int i, HA0<? super Set<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Set e = e(i);
        ha0.invoke(e);
        return a(e);
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <E> Set<E> c(HA0<? super Set<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        Set d = d();
        ha0.invoke(d);
        return a(d);
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static final <E> Set<E> d() {
        return new C7912m22();
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <E> Set<E> e(int i) {
        return new C7912m22(i);
    }

    @NotNull
    public static <T> Set<T> f(T t) {
        Set<T> singleton = Collections.singleton(t);
        C6562gT0.o(singleton, "singleton(...)");
        return singleton;
    }

    @NotNull
    public static final <T> TreeSet<T> g(@NotNull Comparator<? super T> comparator, @NotNull T... tArr) {
        C6562gT0.p(comparator, "comparator");
        C6562gT0.p(tArr, "elements");
        return (TreeSet) C7330jf.zy(tArr, new TreeSet(comparator));
    }

    @NotNull
    public static final <T> TreeSet<T> h(@NotNull T... tArr) {
        C6562gT0.p(tArr, "elements");
        return (TreeSet) C7330jf.zy(tArr, new TreeSet());
    }
}
