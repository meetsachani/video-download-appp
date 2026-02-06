package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.rF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9201rF extends C8952qF {
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <T> void j0(List<T> list, T t) {
        C6562gT0.p(list, "<this>");
        Collections.fill(list, t);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <T> void k0(List<T> list) {
        C6562gT0.p(list, "<this>");
        Collections.shuffle(list);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final <T> void l0(List<T> list, Random random) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void m0(@NotNull List<T> list) {
        C6562gT0.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use sortWith(comparator) instead.", replaceWith = @IR1(expression = "this.sortWith(comparator)", imports = {}))
    public static final <T> void n0(List<T> list, Comparator<? super T> comparator) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(comparator, "comparator");
        throw new C9592sr1(null, 1, null);
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @IR1(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    public static final <T> void o0(List<T> list, VA0<? super T, ? super T, Integer> va0) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(va0, "comparison");
        throw new C9592sr1(null, 1, null);
    }

    public static <T> void p0(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        C6562gT0.p(list, "<this>");
        C6562gT0.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
