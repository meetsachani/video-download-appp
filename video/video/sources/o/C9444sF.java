package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9444sF extends C9201rF {
    @XP0
    public static final <T> void A0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        q0(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final <T> void B0(Collection<? super T> collection, T t) {
        C6562gT0.p(collection, "<this>");
        collection.add(t);
    }

    @XP0
    public static final <T> void C0(Collection<? super T> collection, B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        r0(collection, b02);
    }

    @XP0
    public static final <T> void D0(Collection<? super T> collection, T[] tArr) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        s0(collection, tArr);
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use removeAt(index) instead.", replaceWith = @IR1(expression = "removeAt(index)", imports = {}))
    public static final <T> T E0(List<T> list, int i) {
        C6562gT0.p(list, "<this>");
        return list.remove(i);
    }

    @XP0
    public static final <T> boolean F0(Collection<? extends T> collection, T t) {
        C6562gT0.p(collection, "<this>");
        return C11313zv2.a(collection).remove(t);
    }

    public static final <T> boolean G0(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        return u0(iterable, ha0, true);
    }

    public static final <T> boolean H0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        return collection.removeAll(t0(iterable));
    }

    @XP0
    public static final <T> boolean I0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(collection2, "elements");
        return C11313zv2.a(collection).removeAll(collection2);
    }

    public static final <T> boolean J0(@NotNull Collection<? super T> collection, @NotNull B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        List G3 = C6695h12.G3(b02);
        if (!G3.isEmpty() && collection.removeAll(G3)) {
            return true;
        }
        return false;
    }

    public static final <T> boolean K0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        boolean z;
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !collection.removeAll(C4788Ye.t(tArr))) {
            return false;
        }
        return true;
    }

    public static final <T> boolean L0(@NotNull List<T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        return v0(list, ha0, true);
    }

    @InterfaceC6480g82(version = "1.4")
    public static final <T> T M0(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static final <T> T N0(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @InterfaceC6480g82(version = "1.4")
    public static <T> T O0(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C8222nF.J(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @InterfaceC6480g82(version = "1.4")
    @Nullable
    public static <T> T P0(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C8222nF.J(list));
    }

    public static <T> boolean Q0(@NotNull Iterable<? extends T> iterable, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(iterable, "<this>");
        C6562gT0.p(ha0, "predicate");
        return u0(iterable, ha0, false);
    }

    public static final <T> boolean R0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        return collection.retainAll(t0(iterable));
    }

    @XP0
    public static final <T> boolean S0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(collection2, "elements");
        return C11313zv2.a(collection).retainAll(collection2);
    }

    public static final <T> boolean T0(@NotNull Collection<? super T> collection, @NotNull B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        List G3 = C6695h12.G3(b02);
        if (!G3.isEmpty()) {
            return collection.retainAll(G3);
        }
        return W0(collection);
    }

    public static final <T> boolean U0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        boolean z;
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return collection.retainAll(C4788Ye.t(tArr));
        }
        return W0(collection);
    }

    public static final <T> boolean V0(@NotNull List<T> list, @NotNull HA0<? super T, Boolean> ha0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(ha0, "predicate");
        return v0(list, ha0, false);
    }

    public static final boolean W0(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    public static <T> boolean q0(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean r0(@NotNull Collection<? super T> collection, @NotNull B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        Iterator<? extends T> it = b02.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean s0(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        return collection.addAll(C4788Ye.t(tArr));
    }

    @NotNull
    public static <T> Collection<T> t0(@NotNull Iterable<? extends T> iterable) {
        C6562gT0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C10662xF.Y5(iterable);
    }

    public static final <T> boolean u0(Iterable<? extends T> iterable, HA0<? super T, Boolean> ha0, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (ha0.invoke((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean v0(List<T> list, HA0<? super T, Boolean> ha0, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            C6562gT0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return u0(C11313zv2.c(list), ha0, z);
        }
        int J = C8222nF.J(list);
        if (J >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (ha0.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == J) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int J2 = C8222nF.J(list);
        if (i > J2) {
            return true;
        }
        while (true) {
            list.remove(J2);
            if (J2 != i) {
                J2--;
            } else {
                return true;
            }
        }
    }

    @XP0
    public static final <T> void w0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(iterable, "elements");
        H0(collection, iterable);
    }

    @XP0
    public static final <T> void x0(Collection<? super T> collection, T t) {
        C6562gT0.p(collection, "<this>");
        collection.remove(t);
    }

    @XP0
    public static final <T> void y0(Collection<? super T> collection, B02<? extends T> b02) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(b02, "elements");
        J0(collection, b02);
    }

    @XP0
    public static final <T> void z0(Collection<? super T> collection, T[] tArr) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.p(tArr, "elements");
        K0(collection, tArr);
    }
}
