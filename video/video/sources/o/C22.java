package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
/* loaded from: classes3.dex */
public class C22 extends B22 {
    @NotNull
    public static final <T> Set<T> A(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        C6562gT0.p(set, "<this>");
        C6562gT0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C9444sF.K0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @XP0
    public static final <T> Set<T> B(Set<? extends T> set, T t) {
        C6562gT0.p(set, "<this>");
        return y(set, t);
    }

    @NotNull
    public static <T> Set<T> C(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int size;
        C6562gT0.p(set, "<this>");
        C6562gT0.p(iterable, "elements");
        Integer c0 = C8466oF.c0(iterable);
        if (c0 != null) {
            size = set.size() + c0.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C8683p81.j(size));
        linkedHashSet.addAll(set);
        C9444sF.q0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> D(@NotNull Set<? extends T> set, T t) {
        C6562gT0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C8683p81.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> E(@NotNull Set<? extends T> set, @NotNull B02<? extends T> b02) {
        C6562gT0.p(set, "<this>");
        C6562gT0.p(b02, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C8683p81.j(set.size() * 2));
        linkedHashSet.addAll(set);
        C9444sF.r0(linkedHashSet, b02);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> F(@NotNull Set<? extends T> set, @NotNull T[] tArr) {
        C6562gT0.p(set, "<this>");
        C6562gT0.p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C8683p81.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        C9444sF.s0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @XP0
    public static final <T> Set<T> G(Set<? extends T> set, T t) {
        C6562gT0.p(set, "<this>");
        return D(set, t);
    }

    @NotNull
    public static final <T> Set<T> x(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(set, "<this>");
        C6562gT0.p(iterable, "elements");
        Collection<?> t0 = C9444sF.t0(iterable);
        if (t0.isEmpty()) {
            return C10662xF.d6(set);
        }
        if (t0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t : set) {
                if (!((Set) t0).contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(t0);
        return linkedHashSet2;
    }

    @NotNull
    public static final <T> Set<T> y(@NotNull Set<? extends T> set, T t) {
        C6562gT0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C8683p81.j(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C6562gT0.g(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> z(@NotNull Set<? extends T> set, @NotNull B02<? extends T> b02) {
        C6562gT0.p(set, "<this>");
        C6562gT0.p(b02, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C9444sF.J0(linkedHashSet, b02);
        return linkedHashSet;
    }
}
