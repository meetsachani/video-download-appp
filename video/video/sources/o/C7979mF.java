package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* renamed from: o.mF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7979mF {
    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <E> List<E> a(@NotNull List<E> list) {
        C6562gT0.p(list, "builder");
        return ((M01) list).F();
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <E> List<E> b(int i, HA0<? super List<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        List j = j(i);
        ha0.invoke(j);
        return a(j);
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <E> List<E> c(HA0<? super List<E>, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        List i = i();
        ha0.invoke(i);
        return a(i);
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final int d(int i) {
        if (i < 0) {
            C8222nF.Y();
        }
        return i;
    }

    @XP0
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final int e(int i) {
        if (i < 0) {
            C8222nF.Z();
        }
        return i;
    }

    @XP0
    public static final Object[] f(Collection<?> collection) {
        C6562gT0.p(collection, "collection");
        return C6250fF.a(collection);
    }

    @XP0
    public static final <T> T[] g(Collection<?> collection, T[] tArr) {
        C6562gT0.p(collection, "collection");
        C6562gT0.p(tArr, "array");
        return (T[]) C6250fF.b(collection, tArr);
    }

    @NotNull
    public static final <T> Object[] h(@NotNull T[] tArr, boolean z) {
        C6562gT0.p(tArr, "<this>");
        if (z && C6562gT0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C6562gT0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <E> List<E> i() {
        return new M01(0, 1, null);
    }

    @HK1
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <E> List<E> j(int i) {
        return new M01(i);
    }

    @NotNull
    public static <T> List<T> k(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C6562gT0.o(singletonList, "singletonList(...)");
        return singletonList;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<T> l(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        List<T> a6 = C10662xF.a6(iterable);
        Collections.shuffle(a6);
        return a6;
    }

    @InterfaceC6480g82(version = "1.2")
    @NotNull
    public static final <T> List<T> m(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(random, "random");
        List<T> a6 = C10662xF.a6(iterable);
        Collections.shuffle(a6, random);
        return a6;
    }

    @NotNull
    public static <T> T[] n(int i, @NotNull T[] tArr) {
        C6562gT0.p(tArr, "array");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    @XP0
    public static final <T> List<T> o(Enumeration<T> enumeration) {
        C6562gT0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        C6562gT0.o(list, "list(...)");
        return list;
    }
}
